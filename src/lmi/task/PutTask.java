package lmi.task;

import haven.Coord;
import lmi.Api;
import lmi.AgentContext;

public class PutTask implements Task {
  private final Coord dest;

  public PutTask(Coord dest) {
    this.dest = dest;
  }

  @Override
  public boolean execute(AgentContext ctx) {
    try {
      Api.forcePut(dest);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
