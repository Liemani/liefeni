package agent;

import lmi.runtime.AgentContext;

public abstract class Job {
  public abstract void run(AgentContext ctx, String[] args);
}
