package lmi.debug;
import lmi.Job;

import haven.Coord;
import haven.Gob;
import lmi.Api;
import lmi.ClickManager;
import lmi.Self;
import lmi.LMIException;
import lmi.AgentContext;

public class InvestigateGobBoundingBoxHeightJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    System.out.println("click gob of standard!");
    Gob standardGob = ClickManager.getGob();

    System.out.println("click next gob to move!");
    Gob variantGob = ClickManager.getGob();

    Coord standardPoint = Self.position().center();
    Api.lift(standardGob);
    Api.move(standardPoint.add(0, 2048));
    Api.put(standardPoint);

    final int start = 1024 / 8 * 15;
    int variant = start;
    while (true) {
      final Coord variantPoint = standardPoint.add(0, variant);
      try {
        _carryHeight(variantGob, variantPoint);
      } catch (LMIException e) {
        break;
      }
      System.out.println("succeeded coord: " + variantPoint);
      --variant;
    }

    System.out.println("failed variant is " + variant);
  }

  private void _carryHeight(Gob gob, Coord putPoint) {
    Api.lift(gob);
    Api.put(putPoint);
  }

  public static String info() {
    return "Investigates the height of a gob's bounding box.\nUsage: a InvestigateGobBoundingBoxHeight";
  }
}
