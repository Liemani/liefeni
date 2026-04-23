package lmi;

import java.util.ArrayDeque;
import java.util.Deque;
import agent.Job;
import static lmi.Constant.ExceptionReason.*;

public class Agent extends Thread {
  private static Agent instance;
  private final Deque<JobRequest> jobRequests = new ArrayDeque<>();
  private final AgentConfig config = new AgentConfig();
  private AgentContext context = null; // Optional tracking
  private boolean sleeping = false;

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
    synchronized (jobRequests) {
      jobRequests.addFirst(new JobRequest(job, args, context));
      jobRequests.notifyAll();
    }
  }

  public void enqueueJob(Job job, String[] args) {
    synchronized (jobRequests) {
      jobRequests.addLast(new JobRequest(job, args, context));
      jobRequests.notifyAll();
    }
  }

  public void stopAll() {
    synchronized (jobRequests) {
      jobRequests.clear();
      this.interrupt();
    }
  }

  public void setSleep(boolean sleep) { this.sleeping = sleep; }
  public boolean isSleeping() { return sleeping; }
  public AgentConfig getConfig() { return config; }

  @Override
  public void run() {
    while (true) {
      try {
        JobRequest request;
        synchronized (jobRequests) {
          while (jobRequests.isEmpty()) {
            try {
              jobRequests.wait();
            } catch (InterruptedException e) {
              Thread.interrupted();
            }
          }
          request = jobRequests.removeFirst();
        }

        request.job.run(request.context, request.args);
      } catch (Exception e) {
        Util.debugPrint(e);
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

  private static class JobRequest {
    private final Job job;
    private final String[] args;
    private final AgentContext context;

    private JobRequest(Job job, String[] args, AgentContext context) {
      this.job = job;
      this.args = (args != null) ? args.clone() : new String[0];
      this.context = context;
    }
  }
}
