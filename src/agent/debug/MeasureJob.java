package agent.debug;

import agent.Job;

import haven.Coord;
import haven.Gob;
import lmi.Api;
import lmi.Self;
import lmi.Util;
import lmi.LMIException;
import lmi.AgentContext;
import static lmi.Constant.TILE_IN_COORD;
import static lmi.Constant.ExceptionReason.ER_MOVE;

public class MeasureJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length != 3) {
      Api.error("usage: a Measure <start distance>");
      return;
    }

    Api.alert("바운딩 박스의 크기를 측정할 Gob을 클릭해 주세요");
    Gob gob = Api.getGob();

    int lastFailedDistance = 0;
    int succeededDistance = Integer.parseInt(args[2]);

    final Coord gobLocation = gob.position();

    final Coord branch = Coord.of(gobLocation).assignAdd(0, TILE_IN_COORD * -2);
    final Coord leaf = Coord.of(gobLocation);

    while (true) {
      final int currentDistance = (lastFailedDistance + succeededDistance) / 2;
      final int targetX = gobLocation.x + currentDistance;
      leaf.x = targetX;
      branch.x = targetX;
      Api.move(branch);
      try {
        Api.move(leaf);
        succeededDistance = currentDistance;
      } catch (LMIException e) {
        if (e.reason != ER_MOVE) throw e;
        lastFailedDistance = currentDistance;
      }
      Util.debugPrint(Self.position());
      if (succeededDistance - lastFailedDistance == 1)
        break;
    }
    Util.debugPrint("lastFailedDistance: " + lastFailedDistance);
    Util.debugPrint("succeededDistance: " + succeededDistance);
  }

  public static String info() {
    return "Measures distance to a clicked gob boundary.\nUsage: a Measure <start_distance>";
  }
}
