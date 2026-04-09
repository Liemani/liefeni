package lmi;

import java.util.Stack;
import lmi.job.Job;

public class Agent extends Thread {
  private static Agent instance;
  private final Stack<Job> jobStack = new Stack<>();
  private final AgentConfig config = new AgentConfig();
  private AgentContext context = null; // Optional tracking
  private boolean sleeping = false;
  private final Object lock = new Object();
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
    synchronized (lock) {
      jobStack.clear(); 
      jobStack.push(job);
      this.currentArgs = args;
      this.interrupt(); 
      lock.notifyAll();
    }
  }

  public void stopAll() {
    synchronized (lock) {
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
        synchronized (lock) {
          while (jobStack.isEmpty()) {
            lock.wait();
          }
          currentJob = jobStack.peek();
        }

        // Consciousness Loop
        if (!sleeping) {
          checkDrivesAndInterrupt();
          currentJob = jobStack.peek(); // Might have changed
        }

        // Execute Job
        currentJob.run(context, currentArgs); 

        synchronized (lock) {
          if (!jobStack.isEmpty() && jobStack.peek() == currentJob) {
            jobStack.pop();
          }
        }

      } catch (InterruptedException e) {
        // Potential Job Switch or Stop
        Thread.interrupted(); 
      } catch (Exception e) {
        Util.debugPrint(e);
        e.printStackTrace();
        synchronized (lock) { if (!jobStack.isEmpty()) jobStack.pop(); }
      }
    }
  }

  private void checkDrivesAndInterrupt() {
    // Placeholder for survival logic
    // if (config.isDriveEnabled("food") && isHungry()) {
    //    jobStack.push(new EatJob());
    //    throw new InterruptedException();
    // }
  }
}
