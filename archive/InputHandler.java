package lmi;

public class InputHandler {
  public static boolean isShiftDown() {
    return lmi.AppContext.ui.modshift;
  }

  public static boolean isControlDown() {
    return lmi.AppContext.ui.modctrl;
  }

  public static boolean isMetaDown() {
    return lmi.AppContext.ui.modmeta;
  }
}
