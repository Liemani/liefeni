package agent.test;

import agent.Job;

import haven.Coord;
import haven.Gob;
import lmi.Api;
import lmi.Array;
import lmi.Rect;
import lmi.AgentContext;
import lmi.behavior.AlignLogBehavior;
import static lmi.Constant.BoundingBox.*;
import static lmi.Constant.Timeout.*;
import static lmi.Constant.ExceptionReason.*;

public class AlignLogJob extends Job {
  private final AlignLogBehavior alignBehavior = new AlignLogBehavior();

  private boolean initialized = false;
  private Rect inputArea, workingArea, outputArea;
  private Coord orderCoordMax, orderCoord = Coord.zero();
  private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero();

  private final int SELF_WIDTH = BW_HORSE;
  private final int SELF_HEIGHT = BH_HORSE;
  private final Coord BB_SELF = BB_HORSE;
  private final double SELF_DIAGONAL = BB_SELF.diagonal();
  private final int PADDING = 2;
  private final int ROUTE_WIDTH = SELF_WIDTH + PADDING;
  private final int HEIGHT_SET = BH_LOG + ROUTE_WIDTH + BH_LOG;

  @Override
  public void run(AgentContext ctx, String[] args) {
    if (!initialized) {
      _setup();
      initialized = true;
    }

    while (true) {
      try {
        _loop(ctx);
      } catch (lmi.LMIException e) {
        if (e.reason == ER_NO_INPUT) {
          Api.alert("추가 통나무를 기다려요");
          lmi.WaitManager.sleep(TO_WAIT);
        } else {
          throw e;
        }
      }
    }
  }

  private void _setup() {
    Api.alert("정리할 통나무가 있는 공간을 선택해주세요");
    inputArea = Api.getArea();
    Api.alert("통나무를 정리해 놓을 공간을 선택해주세요");
    workingArea = Api.getArea();

    outputArea = _calculateOutputArea(workingArea);
    root = Coord.of(workingArea.origin).assignAdd(workingArea.size).assignSubtract(SELF_DIAGONAL / 2);
    firstLeaf = Coord.of(outputArea.origin).assignAdd(BB_LOG.divide(2));
    orderCoordMax = _calculateOrderCoordMax(outputArea);
    trunk = Coord.of(root);
  }

  private void _loop(AgentContext ctx) {
    _calculateNextLeaf();
    Gob targetLog = _findLog();
    if (targetLog == null) throw new lmi.LMIException(ER_NO_INPUT);

    alignBehavior.run(ctx, root, trunk, branch, leaf, targetLog);
  }

  private Gob _findLog() {
    Array<Gob> logs = Api.gobArrayWhere(g -> inputArea.contains(g.position()) && g.isLog());
    return logs.isEmpty() ? null : Api.closestGobIn(logs);
  }

  private void _calculateNextLeaf() {
    Array<Gob> existing = Api.gobArrayIn(outputArea);
    while (true) {
      if (orderCoord.y == orderCoordMax.y) orderCoord.init(0, 0);
      _updateLeafCoords();
      orderCoord.x++;
      if (orderCoord.x == orderCoordMax.x) { orderCoord.x = 0; orderCoord.y++; }
      if (!existing.containsWhere(g -> g.isAt(leaf))) return;
    }
  }

  private void _updateLeafCoords() {
    leaf.assign(firstLeaf).assignAdd(orderCoord.multiply(BB_LOG)).assignAdd(0, ROUTE_WIDTH * ((orderCoord.y + 1) / 2));
    branch.init(leaf);
    branch.y += ((BH_LOG + ROUTE_WIDTH) / 2) * ((orderCoord.y % 2 == 0) ? 1 : -1);
    trunk.y = branch.y;
  }

  private Rect _calculateOutputArea(Rect wa) {
    double off = SELF_DIAGONAL / Math.sqrt(2.0) / 2;
    Rect oa = new Rect(wa);
    oa.origin.x += (SELF_HEIGHT - BW_LOG) / 2;
    oa.size.assignSubtract((SELF_HEIGHT - BW_LOG) / 2, 0).assignSubtract(off + SELF_DIAGONAL / 2);
    return oa;
  }

  private Coord _calculateOrderCoordMax(Rect oa) {
    int x = oa.width() / BW_LOG;
    int y = (oa.height() / HEIGHT_SET) * 2 + ((oa.height() % HEIGHT_SET >= BH_LOG) ? 1 : 0);
    return Coord.of(x, y);
  }

  public static String info() {
    return "Organizes logs in a specified area.\nUsage: a AlignLog";
  }
}
