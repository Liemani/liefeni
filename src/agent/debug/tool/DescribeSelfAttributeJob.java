package agent.debug.tool;

import agent.Job;

import lmi.Api;
import lmi.Self;
import lmi.AgentContext;

public class DescribeSelfAttributeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    java.util.Map<Class<? extends haven.GAttrib>, haven.GAttrib> map = Self.gob().attributeMap();
    map.forEach((unused, value) -> {
      System.out.println(value);
    });
  }

  public static String info() {
    return "Describes the player's gob attributes.\nUsage: a DescribeSelfAttribute";
  }
}
