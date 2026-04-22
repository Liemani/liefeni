package lmi.test;
import lmi.Job;

import haven.Gob;
import haven.Coord;
import lmi.*;
import lmi.AgentContext;
import static lmi.Api.*;
import static lmi.Constant.*;
import static lmi.Constant.ExceptionReason.*;
import static lmi.Constant.BoundingBox.*;
import static lmi.Constant.Timeout.*;
import static lmi.Constant.Plan.*;
import static lmi.Constant.gfx.terobjs.*;

public class BuildDryingFrameJob extends Job {
  final int SELF_WIDTH = BW_HORSE;
  final int SELF_HEIGHT = BH_HORSE;
  final Coord BB_SELF = BB_HORSE;
  final int PADDING = 2;
  final int PASSAGE_WIDTH = SELF_WIDTH + PADDING;
  final int HEIGHT_SET = BW_DRYING_FRAME + PASSAGE_WIDTH + BW_DRYING_FRAME;

  private Rect _inputArea, _workingArea, _outputArea;
  private Coord _orderCoordMax, _orderCoord = Coord.zero();
  private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero();

  @Override
  public void run(AgentContext ctx, String[] args) {
    _willRun();
    try {
      while (true) {
        try {
          _loop();
        } catch (LMIException e) {
          if (e.reason == ER_NO_INPUT) {
            Api.alert("추가 건설 자재를 기다려요");
            WaitManager.sleep(TO_WAIT);
          } else {
            break;
          }
        }
      }
    } catch (Exception e) { e.printStackTrace(); }
  }

  private void _willRun() {
    Api.alert("건설 자재가 있는 공간을 선택해주세요");
    _inputArea = getArea();
    Api.alert("Drying Frame을 건설할 공간을 선택해주세요");
    _workingArea = getArea();
    _outputArea = _getOutputArea(_workingArea);
    
    _root = Coord.of(_workingArea.origin).assignAdd(_workingArea.size).assignSubtract(BB_SELF);
    _firstLeaf = Coord.of(_outputArea.origin).assignAdd(BH_DRYING_FRAME / 2, BW_DRYING_FRAME / 2);
    _orderCoordMax = _calculateOrderCoordMax(_outputArea);
    _trunk = Coord.of(_root);
  }

  private Rect _getOutputArea(Rect wa) {
    Rect oa = new Rect(wa);
    if (SELF_HEIGHT > BH_DRYING_FRAME) {
      int lp = (SELF_HEIGHT - BH_DRYING_FRAME) / 2;
      oa.origin.x += lp; oa.size.x -= lp;
    }
    oa.size.assignSubtract(TILE_IN_COORD);
    return oa;
  }

  private Coord _calculateOrderCoordMax(Rect oa) {
    int x = oa.width() / BH_DRYING_FRAME;
    int y = (oa.height() / HEIGHT_SET) * 2 + ((oa.height() % HEIGHT_SET >= BW_DRYING_FRAME) ? 1 : 0);
    return Coord.of(x, y);
  }

  private void _loop() {
    _calculateNextLeaf();
    _bringMaterial();
    Api.pathfindMove(_root);
    Api.forceMove(_trunk);
    Api.forceMove(_branch);
    Api.build(P_DFRAME, _leaf, D_EAST);
    Api.forceMove(_trunk);
  }

  private void _bringMaterial() {
    _takeItemFromStockpile(RN_STOCKPILE_BOUGH, 2);
    _takeItemFromStockpile(RN_STOCKPILE_BRANCH, 5);
    _takeItemFromContainer(lmi.Constant.nameSet_string, 2);
  }

  private void _takeItemFromStockpile(String name, int count) {
    final Array<Gob> sa = Api.gobArrayWhere(g -> _inputArea.contains(g.position()) && g.resourceName().endsWith(name));
    Api.pathfindTakeItemFromStockpileArray(sa, count);
  }

  private void _takeItemFromContainer(String[] ns, int count) {
    final Array<Gob> ca = Api.gobArrayWhere(g -> _inputArea.contains(g.position()) && Util.nameSet_includesResourcePath(nameSet_container, g.resourceName()));
    Api.pathfindTakeItemFromContainerArray(ca, ns, count);
  }

  private void _calculateNextLeaf() {
    Array<Gob> ga = Api.gobArrayIn(_outputArea);
    while (true) {
      if (_orderCoord.y == _orderCoordMax.y) {
        if (ga.count() == _orderCoordMax.x * _orderCoordMax.y) throw new LMIException(ER_FULL_OUTPUT);
        else _orderCoord.init(0, 0);
      }
      _calculateLeaf();
      _orderCoord.x++;
      if (_orderCoord.x == _orderCoordMax.x) { _orderCoord.x = 0; _orderCoord.y++; }
      if (!ga.containsWhere(g -> g.isAt(_leaf))) return;
    }
  }

  private void _calculateLeaf() {
    _leaf.assign(_firstLeaf).assignAdd(_orderCoord.multiply(BH_DRYING_FRAME, BW_DRYING_FRAME)).assignAdd(0, PASSAGE_WIDTH * ((_orderCoord.y + 1) / 2));
    _branch.init(_leaf);
    _branch.y += ((BW_DRYING_FRAME + PASSAGE_WIDTH) / 2) * ((_orderCoord.y % 2 == 0) ? 1 : -1);
    _trunk.y = _branch.y;
  }

  public static String info() {
    return "Builds Drying Frames in sequence.\nUsage: a BuildDryingFrame";
  }
}
