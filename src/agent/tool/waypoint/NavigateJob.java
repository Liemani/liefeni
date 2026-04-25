package agent.tool.waypoint;

import agent.Job;

import haven.Coord;
import haven.Gob;

import lmi.AgentContext;
import lmi.Api;
import lmi.AppContext;
import lmi.AtomicAction;
import lmi.Interaction;
import lmi.Self;
import lmi.WaitManager;
import lmi.waypoint.WaypointDatabase;

public class NavigateJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length < 3) {
      Api.message("Usage: a Navigate <recording_name>");
      return;
    }

    final String recordingName = args[2];
    final WaypointDatabase.Recording recording = WaypointDatabase.loadLatestRecording(recordingName);
    if (recording == null) {
      Api.message("No waypoint recording found: " + recordingName);
      return;
    }

    Api.message("Replaying waypoint recording: " + recording.name + " (" + recording.clicks.size() + " clicks)");
    for (WaypointDatabase.RecordedClick click : recording.clicks) {
      _replay(click);
    }
    Api.message("Finished waypoint recording: " + recording.name);
  }

  private void _replay(WaypointDatabase.RecordedClick click) {
    Gob gob = null;
    if (click.gobId != null) {
      gob = AppContext.oCache().getgob(click.gobId);
    }

    if (gob != null) {
      Interaction.click(gob, click.mouseButton, 0, 0, 0, (click.meshId != null) ? click.meshId : -1);
      _waitForClickToSettle();
      return;
    }

    Coord coord = new Coord(click.x, click.y);
    if (click.mouseButton == 1) {
      AtomicAction.move(coord);
    } else {
      Interaction.click(coord, click.mouseButton, 0);
      _waitForClickToSettle();
    }
  }

  private void _waitForClickToSettle() {
    WaitManager.waitResponse();
    if (Self.gob() != null && Self.gob().isMoving()) {
      Self.gob().waitMove();
    }
  }

  public static String info() {
    return "Replays the latest saved waypoint recording with the given name.\n"
      + "Usage: a Navigate <recording_name>";
  }
}
