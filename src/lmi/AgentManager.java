package lmi;

import java.util.*;
import java.lang.reflect.Method;
import java.io.PrintWriter;
import lmi.job.*;

public class AgentManager {
  private static final Map<String, Class<? extends Job>> jobMap = new TreeMap<>();

  static void init() {
    jobMap.put("AlignLog", AlignLogJob.class);
    jobMap.put("Patrol000", Patrol000Job.class);
    jobMap.put("Patrol001", Patrol001Job.class);
    jobMap.put("Patrol002", Patrol002Job.class);
    jobMap.put("BuildDryingFrame", BuildDryingFrameJob.class);
  }

  public static void run(String[] args) {
    // 1. Basic Argument Check
    if (args.length < 2 || args[1].equals("--help")) {
      printMainHelp();
      return;
    }

    String cmd = args[1];

    // 2. Handle Agent Options (--agent, --sleep, --stop, etc)
    if (cmd.startsWith("--")) {
      // Check for help after option: e.g., a --agent --help
      if (args.length > 2 && args[2].equals("--help")) {
        printOptionHelp(cmd);
        return;
      }
      handleAgentOption(args);
      return;
    }

    // 3. Handle Job Execution
    Class<? extends Job> jobClass = jobMap.get(cmd);
    if (jobClass != null) {
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
    } else {
      Api.message("Unknown job command: " + cmd);
      printMainHelp();
    }
  }

  private static void handleAgentOption(String[] args) {
    String opt = args[1];
    Agent agent = Agent.getInstance();

    if (opt.equals("--stop")) {
      agent.stopAll();
      Api.message("All jobs stopped.");
    } else if (opt.equals("--sleep")) {
      agent.setSleep(true);
      Api.message("Agent is now sleeping (Survival drives disabled).");
    } else if (opt.equals("--wake")) {
      agent.setSleep(false);
      Api.message("Agent is now awake.");
    } else if (opt.equals("--agent")) {
      handleDriveOption(args);
    } else {
      Api.message("Unknown option: " + opt);
      printMainHelp();
    }
  }

  private static void handleDriveOption(String[] args) {
    Agent agent = Agent.getInstance();
    AgentConfig config = agent.getConfig();

    // a --agent ?
    if (args.length == 3 && args[2].equals("?")) {
      Api.message("--- Current Agent Drives ---");
      for (String drive : config.getAllDrives()) {
        Api.message("  " + drive + ": " + config.getDriveStatus(drive));
      }
      return;
    }

    // a --agent <drive> [on|off|?]
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
          printOptionHelp("--agent");
        }
      }
    } else {
      printOptionHelp("--agent");
    }
  }

  private static void printMainHelp() {
    Api.message("=== LMI Agent System Help ===");
    Api.message("Usage: a <job_name> [args] | <option>");
    Api.message("Options:");
    Api.message("  --agent <drive> [on|off|?]  Manage survival drives (e.g., food, water)");
    Api.message("  --agent ?                   Show all drive statuses");
    Api.message("  --sleep / --wake            Disable/Enable autonomous drives");
    Api.message("  --stop                      Stop all running jobs and clear stack");
    Api.message("Available Jobs:");
    for (String job : jobMap.keySet()) Api.message("  " + job);
  }

  private static void printOptionHelp(String opt) {
    Api.message("--- Option Help: " + opt + " ---");
    if (opt.equals("--agent")) {
      Api.message("Usage: a --agent <drive_name> [on|off|?]");
      Api.message("Ex: a --agent food on (Enables automatic eating)");
    } else if (opt.equals("--stop")) {
      Api.message("Usage: a --stop (Interrupts everything)");
    } else {
      printMainHelp();
    }
  }

  private static void printJobHelp(Class<? extends Job> jobClass) {
    try {
      Method man = jobClass.getMethod("man");
      String help = (String)man.invoke(null);
      Api.message("--- Job Manual: " + jobClass.getSimpleName() + " ---");
      Api.message(help);
    } catch (Exception e) {
      Api.message("No manual available for job: " + jobClass.getSimpleName());
    }
  }

  public static boolean isRunning() { return Agent.getInstance().isAlive(); }
  public static void interrupt() { Agent.getInstance().stopAll(); }
}
