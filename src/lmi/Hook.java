package lmi;

import haven.*;
import static lmi.Constant.*;
import static lmi.Constant.Input.Mouse.*;

public class Hook {
  public static void didMsgReceive(int id, String msg, Object... args) {
//    if (!msg.contentEquals("chres")
//        && !msg.contentEquals("glut")
//        && !msg.contentEquals("attr")
//        //              && !msg.contentEquals("msg")
//        && !msg.contentEquals("set")
//        && !msg.contentEquals("tip")
//        //              && !msg.contentEquals("auth")
//        //              && !msg.contentEquals("ppower")
//        //              && !msg.contentEquals("max")
//        && !msg.contentEquals("tt")) {
//      //          lmi.Util.debugPrint("reciever: \"" + wdg.getClass().getName() + "\", message: \"" + msg + "\", args.length: " + args.length);
//      for (Object object : args) {
//        lmi.Debug.describeField(object);
//      }
//    }
  }

  public static void willMsgSend(Widget sender, String msg, Object... args) {
    if (!msg.contentEquals("focus")) {
      String name = sender.getClass().getName();
      String description = String.format("{%s: %s} (argc: %d)", name, msg, args.length);
      lmi.Util.debugPrintHeader(description);

      for (Object object : args) {
        String type = object.getClass().getSimpleName();
        System.out.println(String.format("%s %s", type, object));
      }
    }
  }

  // Sequence Hooks
  public static void willQueueMessage(int seq) {
    WaitManager.updateSentSeq(seq);
    Util.startRtt();
  }

  // didGetACK
  public static void didGetACK(RMessage rMessage) {
    WaitManager.updateAckedSeq(rMessage.seq);
  }

  // Widget & Window Hooks
  public static void newWidgetDidAdded(Widget widget) {
    if (widget.getClass() == FlowerMenu.class) {
      FlowerMenuHandler.setWidget((FlowerMenu)widget);
    }
  }

  public static void flowerMenuDidDestroyed() {
    FlowerMenuHandler.clearWidget();
  }

  public static void progressDidAdded(GameUI.Progress widget) {
    ProgressManager.setWidget(widget);
  }

  public static void progressDidDestroyed() {
    ProgressManager.setWidget(null);
  }

  // Interaction Hooks
  public static boolean didClicked(Coord2d coord2d, int mouseButton, ClickData clickData) {
    if (ClickManager.isGobClickMode) {
      ClickManager.isGobClickMode = false;
    } else {
      return false;
    }

    if (mouseButton == IM_LEFT && clickData != null) {
      ClickManager.setClickData(clickData);
      return true;
    }
    return false;
  }

  // areaDidSelected
  public static boolean areaDidSelected(Coord first, Coord second) {
    if (ClickManager.isAreaSelectMode) {
      ClickManager.isAreaSelectMode = false;
    } else {
      return false;
    }

    final Rect selectedArea = new Rect(first, second);
    selectedArea.origin.assignMultiply(TILE_IN_COORD);
    selectedArea.size.assignAdd(1).assignMultiply(TILE_IN_COORD);
    ClickManager.setSelectedArea(selectedArea);
    return true;
  }

  // System Hooks
  public static void keyDidDown(java.awt.event.KeyEvent keyEvent) {
    if (AgentManager.isRunning() && AWTEventGenerator.isESC(keyEvent)) {
      AgentManager.interrupt();
      ClickManager.reset();
    }
  }

  public static void didGetErrorMessage(String errorMessage) {
    ErrorMessageManager.setMessage(errorMessage);
  }

  public static void remoteUIDidConstructed(RemoteUI remoteUI) {
    AppContext.setRemoteUI(remoteUI);
  }

  // Not used but kept for interface compatibility if needed
  public static void plobDidPlaced(MapView.Plob plob) {}
}
