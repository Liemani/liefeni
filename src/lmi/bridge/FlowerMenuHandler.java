package lmi.bridge;

import haven.Gob;

import lmi.core.LMIException;
import lmi.core.Interaction;
import lmi.core.LocalPlayer;
import lmi.runtime.WaitManager;
import static lmi.core.Constant.ExceptionReason.*;
import static lmi.core.Constant.Timeout.*;

public class FlowerMenuHandler {
  // field
  private static haven.FlowerMenu _widget;

  // set widget
  public static void setWidget(haven.FlowerMenu widget) { _widget = widget; }
  public static void clearWidget() { _widget = null; }

  // choose
  /// - Throws:
  ///     - ER_FLOWER_MENU_OPEN
  ///     - ER_FLOWER_MENU_MATCH
  ///     - ER_PROGRESS_OPEN
  public static void choose(Gob gob, int meshId, String name) {
    if (gob == null || name == null)
      throw new IllegalArgumentException();

    _open(gob, meshId);
    try {
      _choose(name);
    } catch (LMIException e) {
      _close();
      throw e;
    }
    try {
      LocalPlayer.gob().waitMove();
    } catch (LMIException e) {}
    ProgressManager.waitProgress();
  }

  // private methods
  /// - Throws:
  ///     - ER_FLOWER_MENU_OPEN
  private static void _open(Gob gob, int meshId) {
    _sendInteractMessage(gob, meshId);
    _waitFlowerMenuOpening();
  }

  /// - Throws:
  ///     - ER_FLOWER_MENU_OPEN
  private static void _waitFlowerMenuOpening() {
    WaitManager.waitResponse();
    if (!_isAdded()) throw new LMIException(ER_FLOWER_MENU_OPEN);
  }

  private static boolean _isAdded() { return (_widget != null); }
  private static void _close() { _sendCloseMessage(); }

  /// - Throws:
  ///     - ER_FLOWER_MENU_MATCH
  private static void _choose(String name) {
    for (haven.FlowerMenu.Petal petal : _widget.opts)
      if (petal.name.contentEquals(name))
        Interaction.select(_widget, petal.num);
    throw new LMIException(ER_FLOWER_MENU_MATCH);
  }

  /// - Throws:
  ///     - ER_FLOWER_MENU_MATCH
  private static void _sendChoosePetalMessage(int index) {
    final int petalCount = _widget.opts.length;
    if (0 <= index && index < petalCount)
      Interaction.select(_widget, index);
    else
      throw new LMIException(ER_FLOWER_MENU_MATCH);
  }

  // send message shadow
  private static void _sendInteractMessage(Gob gob, int meshId) {
    Interaction.click(gob, 3, 0, 0, 0, meshId);
  }

  /// - Throws:
  private static void _sendCloseMessage() {
    Interaction.close(_widget);
  }
}
