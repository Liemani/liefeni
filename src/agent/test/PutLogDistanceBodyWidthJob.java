package agent.test;

import agent.Job;

import haven.Coord;
import haven.Gob;
import lmi.core.AtomicAction;
import lmi.bridge.Api;
import lmi.runtime.AgentContext;
import lmi.core.LocalPlayer;
import static lmi.core.Constant.BoundingBox.*;

public class PutLogDistanceBodyWidthJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    final Coord origin = LocalPlayer.position().center();

    System.out.println("첫 번째 로그를 선택해주세요");
    final Gob firstLog = Api.getGob();

    System.out.println("두 번째 로그를 선택해주세요");
    final Gob secondLog = Api.getGob();

    final int averageY = (BH_LOG + BH_BODY) / 2;
    final int averageX = (BW_LOG + BW_BODY) / 2;

    AtomicAction.lift(firstLog.id(), firstLog.position());
    AtomicAction.go(origin.add(-averageX - 1, averageY));
    AtomicAction.put(origin.add(-averageX - 1, 0));

    AtomicAction.lift(secondLog.id(), secondLog.position());
    AtomicAction.go(origin.add(averageX + 1, averageY));
    AtomicAction.put(origin.add(averageX + 1, 0));
  }

  public static String info() {
    return "Places two logs at a distance relative to body width.\nUsage: a PutLogDistanceBodyWidth";
  }
}
