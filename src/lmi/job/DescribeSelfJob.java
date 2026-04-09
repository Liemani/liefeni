package lmi.job;

import lmi.Api;
import lmi.Self;
import lmi.AgentContext;

public class DescribeSelfJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message("resource name: " + Self.gob().resourceName());
    Api.message("Self.position(): " + Self.position());
    Api.message("Self.hardHitPoint(): " + Self.hardHitPoint());
    Api.message("Self.softHitPoint(): " + Self.softHitPoint());
    Api.message("Self.stamina(): " + Self.stamina());
    Api.message("Self.energy(): " + Self.energy());
    Api.message(Self.gob().debugDescription());
  }

  public static String man() {
    return "Describes the player's current state and gob info.\nUsage: a DescribeSelf";
  }
}
