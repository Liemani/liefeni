package agent.test;

import agent.Job;

import haven.Coord;
import haven.Gob;
import lmi.AtomicAction;
import lmi.Api;
import lmi.AgentContext;
import lmi.Self;
import static lmi.Constant.BoundingBox.*;

public class PutLogDistanceBodyWidthJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    final Coord origin = Self.position().center();

    System.out.println("첫 번째 로그를 선택해주세요");
    final Gob firstLog = Api.getGob();

    System.out.println("두 번째 로그를 선택해주세요");
    final Gob secondLog = Api.getGob();

    final int averageY = (BH_LOG + BH_BODY) / 2;
    final int averageX = (BW_LOG + BW_BODY) / 2;

    AtomicAction.lift(firstLog);
    AtomicAction.move(origin.add(-averageX - 1, averageY));
    AtomicAction.put(origin.add(-averageX - 1, 0));

    AtomicAction.lift(secondLog);
    AtomicAction.move(origin.add(averageX + 1, averageY));
    AtomicAction.put(origin.add(averageX + 1, 0));
  }

  public static String info() {
    return "Places two logs at a distance relative to body width.\nUsage: a PutLogDistanceBodyWidth";
  }
}
