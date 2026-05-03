package lmi.waypoint;

import haven.Coord;
import lmi.Array;
import lmi.Self;
import lmi.waypoint.runtime.ResolvedNode;

public final class WaypointDebug {
  private WaypointDebug() {}

  public static Array<String> lines() {
    Array<String> lines = new Array<>();
    lines.append("isCalibrated: " + WaypointManager.isCalibrated());

    if (WaypointManager.calibrationGraphId() == null) {
      lines.append("calibrationGraphId: null");
      lines.append(_sceneSummary());
      return lines;
    }

    lines.append("calibrationGraphId: " + WaypointManager.calibrationGraphId());
    lines.append("calibrationVir: " + WaypointManager.calibrationVir());
    lines.append("calibrationWorld: " + WaypointManager.calibrationWorld());
    lines.append("calibrationGob: " + WaypointManager.calibrationGob());
    lines.append("self.world: " + Self.position());

    Coord currentVir = WaypointManager.virOfWorld(Self.position());
    lines.append("self.vir: " + currentVir);
    lines.append("scene.centerCut: " + WaypointManager.scene().bounds.centerCut);
    lines.append("scene.renderArea: " + WaypointManager.scene().bounds.renderArea);
    lines.append("scene.loadArea: " + WaypointManager.scene().bounds.loadArea);
    lines.append(_sceneSummary());

    for (int i = 0; i < Math.min(3, WaypointManager.scene().drawableNodes.count()); ++i) {
      ResolvedNode node = WaypointManager.scene().drawableNodes.get(i);
      lines.append("drawableNode[" + i + "]: id=" + node.id + " name=" + node.name + " vir=(" + node.virX + ", " + node.virY + ") world=" + node.world);
    }
    for (int i = 0; i < Math.min(3, WaypointManager.scene().hiddenNodes.count()); ++i) {
      ResolvedNode node = WaypointManager.scene().hiddenNodes.get(i);
      lines.append("hiddenNode[" + i + "]: id=" + node.id + " name=" + node.name + " vir=(" + node.virX + ", " + node.virY + ") world=" + node.world);
    }

    return lines;
  }

  private static String _sceneSummary() {
    return "scene drawableNodes=" + WaypointManager.scene().drawableNodes.count() +
           " hiddenNodes=" + WaypointManager.scene().hiddenNodes.count() +
           " drawableLines=" + WaypointManager.scene().drawableLines.count() +
           " drawablePoints=" + WaypointManager.scene().drawablePoints.count() +
           " hiddenPoints=" + WaypointManager.scene().hiddenPoints.count() +
           " selectedManagedNodes=" + WaypointManager.selectedManagedNodes().count();
  }
}
