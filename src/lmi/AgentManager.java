package lmi;

import java.util.Set;
import java.util.TreeMap;
import java.lang.reflect.Method;
import java.awt.Color;

public class AgentManager {
  private static class AgentMap extends TreeMap<String, Class<Agent>> {};
  private static AgentMap _agentMap;

  static void init() {
    final Class[] _classArray = {
      lmi.agent.AlignLog.class,
      lmi.agent.Patrol000.class,
      lmi.agent.Patrol001.class,
      lmi.agent.Patrol002.class,
      lmi.agent.BuildDryingFrame.class,
    };

    _agentMap = new AgentMap();
    for (Class c : _classArray) {
      if (c != null && Agent.class.isAssignableFrom(c)) {
        _agentMap.put(c.getSimpleName(), (Class<Agent>)c);
      }
    }
  }

  public static Class<? extends Agent> getClass(String name) { return _agentMap.get(name); }
  public static Set<String> getCommandStringSet() { return _agentMap.keySet(); }

  public static void run(Class<? extends Agent> agentClass, String[] args) {
    // Check for --help
    if (args.length > 0 && args[args.length - 1].equals("--help")) {
      printAgentHelp(agentClass);
      return;
    }
    AgentWorker.getInstance().startAgent(agentClass, args);
  }

  private static void printAgentHelp(Class<? extends Agent> agentClass) {
    try {
      Method manMethod = agentClass.getMethod("man");
      String help = (String)manMethod.invoke(null);
      lmi.ObjectShadow.gameUI().syslog.append(help, Color.CYAN);
    } catch (Exception e) {
      lmi.ObjectShadow.gameUI().syslog.append("No help available for this agent.", Color.RED);
    }
  }

  public static boolean isRunning() { return AgentWorker.getInstance().isBusy(); }
  public static void interrupt() { AgentWorker.getInstance().stopCurrentAgent(); }

  static void printCommandStringList(java.io.PrintWriter writer) {
    writer.println("자동화 프로그램 목록:");
    for (String commandString : AgentManager.getCommandStringSet())
      writer.println("\t" + commandString);
  }

  public static class AgentWorker extends Thread {
    private static AgentWorker instance;
    private volatile Agent activeAgent = null;
    private final Object lock = new Object();
    private volatile Request nextRequest = null;

    private static class Request {
      final Class<? extends Agent> agentClass;
      final String[] args;
      Request(Class<? extends Agent> agentClass, String[] args) {
        this.agentClass = agentClass;
        this.args = args;
      }
    }

    private AgentWorker() {
      super("AgentWorker");
      setDaemon(true);
    }

    public static synchronized AgentWorker getInstance() {
      if (instance == null) {
        instance = new AgentWorker();
        instance.start();
      }
      return instance;
    }

    public void startAgent(Class<? extends Agent> agentClass, String[] args) {
      synchronized (lock) {
        nextRequest = new Request(agentClass, args);
        this.interrupt();
        lock.notifyAll();
      }
    }

    public void stopCurrentAgent() {
      synchronized (lock) {
        nextRequest = null;
        this.interrupt();
      }
    }

    public boolean isBusy() {
      return activeAgent != null;
    }

    @Override
    public void run() {
      while (true) {
        try {
          Request req;
          synchronized (lock) {
            while (nextRequest == null) {
              lock.wait();
            }
            req = nextRequest;
            nextRequest = null;
          }

          // Create and Run Agent
          activeAgent = req.agentClass.getDeclaredConstructor().newInstance();
          activeAgent.run(req.args);
          activeAgent = null;
        } catch (InterruptedException e) {
          activeAgent = null;
          Thread.interrupted(); // Clear status
        } catch (Exception e) {
          Util.debugPrint(e);
          e.printStackTrace();
          activeAgent = null;
        }
        lmi.Api.message("[자동화 프로그램이 종료됐어요]");
      }
    }
  }

  public abstract static class Agent {
    protected AgentContext context;
    public abstract void run(String[] args);
  }
}
