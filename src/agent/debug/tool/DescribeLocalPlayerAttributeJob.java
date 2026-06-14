package agent.debug.tool;

import agent.Job;

import lmi.bridge.Api;
import lmi.core.LocalPlayer;
import lmi.runtime.AgentContext;

public class DescribeLocalPlayerAttributeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    java.util.Map<Class<? extends haven.GAttrib>, haven.GAttrib> map = LocalPlayer.gob().attributeMap();
    map.forEach((unused, value) -> {
      System.out.println(value);
    });
  }

  public static String info() {
    return "Describes the local player's gob attributes.\nUsage: a DescribeLocalPlayerAttribute";
  }
}
