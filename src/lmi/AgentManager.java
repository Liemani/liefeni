package lmi;

import java.util.*;
import java.lang.reflect.Method;
import java.io.PrintWriter;
import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.net.JarURLConnection;

import agent.*;

import haven.UI;

public class AgentManager {
  private static final Map<String, Class<? extends Job>> jobMap = new TreeMap<>();

  static void init() {
    _registerJobs();
  }

  private static PrintWriter out() {
    UI ui = AppContext.ui;
    if (ui != null && ui.cons != null)
      return ui.cons.out;
    return new PrintWriter(System.out); // Fallback
  }

  public static void run(String[] args) {
    // 1. Basic Argument Check
    if (args.length < 2 || args[1].equals("--help")) {
      printMainHelp();
      return;
    }

    String cmd = args[1];

    // 2. Handle Agent Options (set, --sleep, --wake, etc)
    if (cmd.equals("set") || cmd.startsWith("--")) {
      // Check for help after option: e.g., a set --help
      if (args.length > 2 && args[2].equals("--help")) {
        printOptionHelp(cmd);
        return;
      }
      handleAgentOption(args);
      return;
    }

    // 3. Handle Job Execution
    Class<? extends Job> jobClass = jobMap.get(cmd);
    if (jobClass == null) {
      Api.message("Unknown job command: " + cmd);
      printMainHelp();
      return;
    }

    try {
      // Check for job-specific --help: e.g., a AlignLog --help
      if (args.length > 2 && args[2].equals("--help")) {
        printJobHelp(jobClass);
        return;
      }

      Job job = jobClass.getDeclaredConstructor().newInstance();
      Agent.getInstance().pushJob(job, args);
    } catch (Exception e) {
      Api.message("Error creating job [" + cmd + "]: " + e.getMessage());
      printJobHelp(jobClass); // Show help on failure as requested
    }
  }

  private static void handleAgentOption(String[] args) {
    String opt = args[1];
    Agent agent = Agent.getInstance();

    if (opt.equals("--sleep")) {
      agent.setSleep(true);
      Api.message("Agent is now sleeping (Survival drives disabled).");
    } else if (opt.equals("--wake")) {
      agent.setSleep(false);
      Api.message("Agent is now awake.");
    } else if (opt.equals("set")) {
      handleDriveOption(args);
    } else {
      Api.message("Unknown option: " + opt);
      printMainHelp();
    }
  }

  private static void handleDriveOption(String[] args) {
    Agent agent = Agent.getInstance();
    AgentConfig config = agent.getConfig();

    // a set ?
    if (args.length == 3 && args[2].equals("?")) {
      Api.message("--- Current Agent Drives ---");
      for (String drive : config.getAllDrives()) {
        Api.message("  " + drive + ": " + config.getDriveStatus(drive));
      }
      return;
    }

    // a set <drive> [on|off|?]
    if (args.length >= 3) {
      String drive = args[2];
      if (args.length == 3) {
        // Default to status if no 4th arg
        Api.message(drive + " is currently " + config.getDriveStatus(drive));
      } else {
        String val = args[3];
        if (val.equals("on")) {
          config.setDrive(drive, true);
          Api.message(drive + " drive enabled.");
        } else if (val.equals("off")) {
          config.setDrive(drive, false);
          Api.message(drive + " drive disabled.");
        } else if (val.equals("?")) {
          Api.message(drive + " is " + config.getDriveStatus(drive));
        } else {
          printOptionHelp("set");
        }
      }
    } else {
      printOptionHelp("set");
    }
  }

  private static void printMainHelp() {
    Api.message("=== LMI Agent System Help ===");
    Api.message("Usage: a <job_name> [args] | <option>");
    Api.message("Options:");
    Api.message("  set <drive> [on|off|?]      Manage survival drives (e.g., food, water)");
    Api.message("  set ?                       Show all drive statuses");
    Api.message("  --sleep / --wake            Disable/Enable autonomous drives");
    Api.message("  (Press ESC to stop all running jobs)");
    Api.message("Available Jobs:");
    for (String job : jobMap.keySet()) Api.message("  " + job);
  }

  private static void printOptionHelp(String opt) {
    Api.message("--- Option Help: " + opt + " ---");
    if (opt.equals("set")) {
      Api.message("Usage: a set <drive_name> [on|off|?]");
      Api.message("Ex: a set food on (Enables automatic eating)");
    } else {
      printMainHelp();
    }
  }

  private static void printJobHelp(Class<? extends Job> jobClass) {
    try {
      Method info = jobClass.getMethod("info");
      String help = (String)info.invoke(null);
      Api.message("--- Job Manual: " + jobClass.getSimpleName() + " ---");
      Api.message(help);
    } catch (Exception e) {
      Api.message("No manual available for job: " + jobClass.getSimpleName());
    }
  }

  public static Map<String, Class<? extends Job>> getJobMap() { return jobMap; }

  public static boolean isRunning() { return Agent.getInstance().isAlive(); }
  public static void interrupt() { Agent.getInstance().stopAll(); }

  // private static method
  private static void _registerJobs() {
    _registerJobsInPackage("agent.job");
    _registerJobsInPackage("agent.debug");
    _registerJobsInPackage("agent.test");
    _registerJobsInPackage("agent.dev");
  }

  private static void _registerJobsInPackage(String packageName) {
    try {
      String path = packageName.replace('.', '/');
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      Enumeration<URL> resources = classLoader.getResources(path);

      while (resources.hasMoreElements()) {
        URL resource = resources.nextElement();

        if (resource.getProtocol().equals("jar")) {
          JarURLConnection conn = (JarURLConnection) resource.openConnection();
          try (JarFile jar = conn.getJarFile()) {
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
              JarEntry entry = entries.nextElement();
              String name = entry.getName();
              if (name.startsWith(path + "/") && name.endsWith(".class")) {
                String className = name.replace('/', '.').substring(0, name.length() - 6);
                _registerJob(className);
              }
            }
          }
        }
      }
    } catch (Exception e) {
      System.err.println("Error scanning jobs in package (" + packageName + "): " + e.getMessage());
    }
  }

  private static void _registerJob(String className) {
    try {
      Class<?> cls = Class.forName(className);

      // Job 인터페이스/클래스를 상속받았고, 추상 클래스가 아닌 실제 클래스만 등록
      if (Job.class.isAssignableFrom(cls) && !cls.isInterface() &&
          !java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {

        String simpleName = cls.getSimpleName();
        if (simpleName.endsWith("Job")) {
          simpleName = simpleName.substring(0, simpleName.length() - 3);
        }
        jobMap.put(simpleName, (Class<? extends Job>) cls);
        System.out.println("Registered Job: " + simpleName + " [" + className + "]");
          }
    } catch (ClassNotFoundException e) {
      // 클래스를 로드할 수 없는 경우 무시
    }
  }
}
