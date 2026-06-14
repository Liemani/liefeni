package agent.debug;

import agent.Effect;

import lmi.bridge.Api;
import lmi.core.LocalPlayer;

public class DescribeLocalPlayerEffect extends Effect {
  @Override
  public void execute() {
    Api.message("resource name: " + LocalPlayer.gob().resourceName());
    Api.message("LocalPlayer.position(): " + LocalPlayer.position());
    Api.message("LocalPlayer.currentGrid().id: " + (LocalPlayer.currentGrid() == null ? null : LocalPlayer.currentGrid().id));
    Api.message("LocalPlayer.hardHitPoint(): " + LocalPlayer.hardHitPoint());
    Api.message("LocalPlayer.softHitPoint(): " + LocalPlayer.softHitPoint());
    Api.message("LocalPlayer.stamina(): " + LocalPlayer.stamina());
    Api.message("LocalPlayer.energy(): " + LocalPlayer.energy());
    Api.message("LocalPlayer.gob().isMoving(): " + LocalPlayer.gob().isMoving());
    Api.message(LocalPlayer.gob().debugDescription());
  }

  public static String info() {
    return "Describes the local player's current state and gob info.";
  }
}
