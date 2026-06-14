package agent.debug.tool;

import agent.Job;

import lmi.bridge.Api;
import lmi.core.LocalPlayer;
import lmi.runtime.AgentContext;

public class DescribeLocalPlayerJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message("resource name: " + LocalPlayer.gob().resourceName());
    Api.message("LocalPlayer.position(): " + LocalPlayer.position());
    Api.message("LocalPlayer.currentGrid().id: " + (LocalPlayer.currentGrid() == null ? null : LocalPlayer.currentGrid().id));
    Api.message("LocalPlayer.hardHitPoint(): " + LocalPlayer.hardHitPoint());
    Api.message("LocalPlayer.softHitPoint(): " + LocalPlayer.softHitPoint());
    Api.message("LocalPlayer.stamina(): " + LocalPlayer.stamina());
    Api.message("LocalPlayer.energy(): " + LocalPlayer.energy());
    Api.message(LocalPlayer.gob().debugDescription());
  }

  public static String info() {
    return "Describes the local player's current state and gob info.\nUsage: a DescribeLocalPlayer";
  }
}
