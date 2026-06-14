package agent.debug.tool;

import agent.Job;

import haven.Coord;
import haven.Gob;
import lmi.core.AtomicAction;
import lmi.bridge.Api;
import lmi.core.ClickManager;
import lmi.core.LocalPlayer;
import lmi.core.LMIException;
import lmi.runtime.AgentContext;
import static lmi.core.Constant.TILE_IN_COORD;

public class InvestigateGobBoundingBoxWidthJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    System.out.println("click gob of standard!");
    Gob standardGob = ClickManager.getGob();

    System.out.println("click next gob to move!");
    Gob variantGob = ClickManager.getGob();

    Coord standardPoint = LocalPlayer.position();
    AtomicAction.lift(standardGob.id(), standardGob.position());
    AtomicAction.go(standardPoint.add(0, 2048));
    AtomicAction.put(standardPoint);

    final int start = TILE_IN_COORD / 8 * 3 + 1;
    int variant = start;
    while (true) {
      final Coord variantPoint = standardPoint.add(variant, 0);
      try {
        _carryWidth(variantGob, variantPoint);
      } catch (LMIException e) {
        break;
      }
      System.out.println("succeeded coord: " + variantPoint);
      --variant;
    }

    System.out.println("failed variant is " + variant);
  }

  private void _carryWidth(Gob gob, Coord putPoint) {
    AtomicAction.lift(gob.id(), gob.position());
    AtomicAction.go(putPoint.add(0, TILE_IN_COORD * 2));
    AtomicAction.put(putPoint);
  }

  public static String info() {
    return "Investigates the width of a gob's bounding box.\nUsage: a InvestigateGobBoundingBoxWidth";
  }
}
