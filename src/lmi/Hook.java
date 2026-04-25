package lmi;

import haven.*;
import agent.Effect;
import lmi.waypoint.WaypointRecorder;
import static lmi.Constant.*;

public class Hook {
  public static void didMsgReceive(int id, String msg, Object... args) {
    if (msg.contentEquals("err")) {
      String description = String.format("{%d: %s} (argc: %d)", id, msg, args.length);
      lmi.Util.debugPrintHeader(description);
      _recursivePrintObject(0, args);
    }
  }

  private static void _recursivePrintObject(int indent, Object... args) {
    for (Object obj : args) {
      if (obj instanceof Object[]){
        Object[] arr = (Object[]) obj;
        String type = arr.getClass().getSimpleName();
        _indent(indent);
        System.out.println(String.format("%s %s (argc: %d)", type, arr, arr.length));
        _recursivePrintObject(indent + 1, arr);
      } else if (obj instanceof byte[]) {
        String type = obj.getClass().getSimpleName();
        _indent(indent);
        System.out.println(String.format("%s %s", type, java.util.Arrays.toString((byte[]) obj)));
      } else if (obj == null) {
        _indent(indent);
        System.out.println("null");
      } else {
        String type = obj.getClass().getSimpleName();
        _indent(indent);
        System.out.println(String.format("%s %s", type, obj));
      }
    }
  }

  private static void _indent(int indent) {
    for (int i = 0; i < indent; ++i) {
      System.out.print("  ");
    }
  }

  // willMsgSend
  public static void willMsgSend(Widget sender, String msg, Object... args) {
    if (msg.contentEquals("focus")) {
      return;
    }

    String name = sender.getClass().getName();
    String description = String.format("{%s: %s} (argc: %d)", name, msg, args.length);
    lmi.Util.debugPrintHeader(description);

    for (Object object : args) {
      if (object == null) {
        System.out.println("null");
        continue;
      }
      String type = object.getClass().getSimpleName();
      System.out.println(String.format("%s %s", type, object));
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

  public static boolean menuGridWillUse(MenuGrid.PagButton button) {
    if (!MenuGridProxy.isLmi(button.pag)) return false;

    if (MenuGridProxy.isJob(button.pag)) {
      String id = button.pag.id.toString();
      String jobName = id.substring(MenuGridProxy.JOB_PREFIX.length());
      AgentManager.run(new String[]{"a", jobName});
    } else if (MenuGridProxy.isEffect(button.pag)) {
      String id = button.pag.id.toString();
      String effectName = id.substring(MenuGridProxy.EFFECT_PREFIX.length());
      try {
        Class<? extends Effect> effectClass = AgentRegistry.effectClass(effectName);
        if (effectClass != null) {
          Effect effect = effectClass.getDeclaredConstructor().newInstance();
          effect.execute();
        } else {
          System.err.println("Unknown LMI effect: " + effectName);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    // Always return true for LMI icons to prevent server actions
    return true;
  }


  public static boolean willPaginaDropToBelt(MenuGrid.Pagina pag) {
    // If it's an LMI icon, we intercept it (True means stop engine logic)
    if (MenuGridProxy.isLmi(pag)) {
        System.out.println("LMI icon dropped to belt: " + pag.id);
        // Future: Handle local belt registration if needed
        return true; 
    }
    return false;
  }


  // Interaction Hooks
  public static boolean didClicked(Coord2d coord2d, int mouseButton, ClickData clickData) {
    if (!ClickManager.isGobClickMode && !ClickManager.isAreaSelectMode) {
      WaypointRecorder.recordMapClick(coord2d, mouseButton, clickData);
    }

    if (ClickManager.isGobClickMode) {
      ClickManager.isGobClickMode = false;
    } else {
      return false;
    }

    if (mouseButton == 1 && clickData != null) {
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
    if (AgentManager.isRunning() && lmi.Util.isESC(keyEvent)) {
      AgentManager.interrupt();
      ClickManager.reset();
    }
  }

  public static void remoteUIDidConstructed(RemoteUI remoteUI) {
    AppContext.setRemoteUI(remoteUI);
  }

  // Not used but kept for interface compatibility if needed
  public static void plobDidPlaced(MapView.Plob plob) {}
}
