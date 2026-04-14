package lmi;

import haven.*;
import static lmi.Constant.*;
import static lmi.Constant.Signal.*;
import static lmi.Constant.Input.Mouse.*;
import static lmi.Constant.gfx.borka.*;

public class Hook {
  // Sequence Hooks
  public static void didQueueMessage(int seq) {
    WaitManager.updateSentSeq(seq);
  }

  public static void didGetACK(PMessage pMessage) {
    if (pMessage instanceof RMessage) {
      WaitManager.updateAckedSeq(((RMessage)pMessage).seq);
    }
  }

  // Widget Hooks
  public static void newWidgetDidAdded(Widget widget) {
    if (widget.getClass() == FlowerMenu.class) {
      FlowerMenuHandler.setWidget((FlowerMenu)widget);
      WaitManager.notifySignal(S_FLOWER_MENU_DID_ADDED);
    }
  }

  public static void flowerMenuDidDestroyed() {
    FlowerMenuHandler.clearWidget();
  }

  // Interaction Hooks
  public static boolean didClicked(Coord2d coord2d, int mouseButton, ClickData clickData) {
    if (!WaitManager.isWaitingSignal(S_OBJECT_DID_CLICKED))
      return false;

    if (mouseButton == IM_LEFT && clickData != null) {
      ClickManager.setClickData(clickData);
      WaitManager.notifySignal(S_OBJECT_DID_CLICKED);
      return true;
    }
    return false;
  }

  // Game Event Hooks
  public static void linMoveDidAdded(Gob gob) {
    WaitManager.notifySignal(S_MOVE_DID_BEGIN, gob);
  }

  public static void linMoveDidDeleted(Gob gob) {
    WaitManager.notifySignal(S_MOVE_DID_END, gob);
  }

  public static void followingDidAdded(Gob gob) {
    final Gob target = gob.followingTarget();
    if (target == Self.gob())
      WaitManager.notifySignal(S_DID_LIFT, target);
  }

  public static void followingDidDeleted(Gob gob) {
    final Gob target = gob.followingTarget();
    if (target != Self.gob()) return;
    WaitManager.notifySignal(S_DID_PUT, target);
  }

  public static void progressDidAdded(GameUI.Progress widget) {
    ProgressManager.setWidget(widget);
    WaitManager.notifySignal(S_PROGRESS_DID_ADDED);
  }

  public static void progressDidDestroyed() {
    ProgressManager.setWidget(null);
    WaitManager.notifySignal(S_PROGRESS_DID_DESTROYED);
  }

  public static void poseDidChanged(Gob gob) {
    if (gob.hasPose(RN_IDLE))
      WaitManager.notifySignal(S_DID_PUT, gob);
  }

  public static boolean keyDidDown(java.awt.event.KeyEvent keyEvent) {
    if (AgentManager.isRunning() && AWTEventGenerator.isESC(keyEvent)) {
      AgentManager.interrupt();
      return true;
    }
    return false;
  }

  public static boolean areaDidSelected(Coord first, Coord second) {
    if (WaitManager.isWaitingSignal(S_AREA_DID_SELECTED)) {
      final Rect selectedArea = new Rect(first, second);
      selectedArea.origin.assignMultiply(TILE_IN_COORD);
      selectedArea.size.assignAdd(1).assignMultiply(TILE_IN_COORD);
      ClickManager.setSelectedArea(selectedArea);
      WaitManager.notifySignal(S_AREA_DID_SELECTED);
      return true;
    }
    return false;
  }

  public static void remoteUIDidConstructed(RemoteUI remoteUI) {
    Initializer.initRemoteUI(remoteUI);
  }

  public static void didGetErrorMessage(String errorMessage) {
    ErrorMessageManager.setMessage(errorMessage);
  }

  public static void plobDidPlaced(MapView.Plob plob) {}
}
