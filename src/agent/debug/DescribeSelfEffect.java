package agent.debug;

import agent.Effect;

import lmi.Api;
import lmi.Self;

public class DescribeSelfEffect extends Effect {
  @Override
  public void execute() {
    Api.message("resource name: " + Self.gob().resourceName());
    Api.message("Self.position(): " + Self.position());
    Api.message("Self.hardHitPoint(): " + Self.hardHitPoint());
    Api.message("Self.softHitPoint(): " + Self.softHitPoint());
    Api.message("Self.stamina(): " + Self.stamina());
    Api.message("Self.energy(): " + Self.energy());
    Api.message("Self.gob().isMoving(): " + Self.gob().isMoving());
    Api.message(Self.gob().debugDescription());
  }

  public static String info() {
    return "Describes the player's current state and gob info.";
  }
}
