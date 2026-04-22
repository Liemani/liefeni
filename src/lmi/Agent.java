package lmi;

import java.util.Stack;
import agent.Job;
import static lmi.Constant.ExceptionReason.*;

public class Agent extends Thread {
  private static Agent instance;
  private final Stack<Job> jobStack = new Stack<>();
  private final AgentConfig config = new AgentConfig();
  private AgentContext context = null; // Optional tracking
  private boolean sleeping = false;
  private String[] currentArgs = new String[0];

  private Agent() {
    super("AgentMind");
    setDaemon(true);
  }

  public static synchronized Agent getInstance() {
    if (instance == null) {
      instance = new Agent();
      instance.start();
    }
    return instance;
  }

  // Command Interface
  public void pushJob(Job job, String[] args) {
    synchronized (jobStack) {
      jobStack.push(job);
      this.currentArgs = args;
      jobStack.notifyAll();
    }
  }

  public void stopAll() {
    synchronized (jobStack) {
      jobStack.clear();
      this.interrupt();
    }
  }

  public void setSleep(boolean sleep) { this.sleeping = sleep; }
  public AgentConfig getConfig() { return config; }

  @Override
  public void run() {
    while (true) {
      try {
        Job currentJob;
        synchronized (jobStack) {
          while (jobStack.isEmpty()) {
            try {
              jobStack.wait();
            } catch (InterruptedException e) {
              Thread.interrupted();
            }
          }
          currentJob = jobStack.peek();
        }

        currentJob = jobStack.peek(); // Might have changed
        currentJob.run(context, currentArgs); 

        synchronized (jobStack) {
          if (!jobStack.isEmpty() && jobStack.peek() == currentJob) {
            jobStack.pop();
          }
        }
      } catch (Exception e) {
        Util.debugPrint(e);
        synchronized (jobStack) {
          if (!jobStack.isEmpty()) jobStack.pop();
        }
      }
    }
  }

  private void checkDrivesAndInterrupt() {
    // Placeholder for survival logic
    // if (config.isDriveEnabled("food") && isHungry()) {
    //    jobStack.push(new EatJob());
    //    throw new LMIException();
    // }
  }
}
