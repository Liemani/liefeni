package lmi;

import lmi.AgentContext;

public abstract class Job {
  public abstract void run(AgentContext ctx, String[] args);
}
