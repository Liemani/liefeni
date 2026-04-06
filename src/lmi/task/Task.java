package lmi.task;

import lmi.AgentContext;

public interface Task {
  boolean execute(AgentContext ctx);
}
