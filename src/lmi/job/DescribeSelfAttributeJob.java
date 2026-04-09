package lmi.job;

import lmi.Api;
import lmi.Self;
import lmi.Debug;
import lmi.AgentContext;

public class DescribeSelfAttributeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    java.util.Map<Class<? extends haven.GAttrib>, haven.GAttrib> map = Self.gob().attributeMap();
    map.forEach((unused, value) -> {
      Debug.describeField(value);
    });
  }

  public static String man() {
    return "Describes the player's gob attributes.\nUsage: a DescribeSelfAttribute";
  }
}
