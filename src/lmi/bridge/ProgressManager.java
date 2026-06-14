package lmi.bridge;

import lmi.core.LMIException;
import lmi.runtime.WaitManager;
import static lmi.core.Constant.ExceptionReason.*;
import static lmi.core.Constant.Timeout.*;

public class ProgressManager {
  // field
  private static haven.GameUI.Progress _widget = null;

  // setter
  public static void setWidget(haven.GameUI.Progress widget) { _widget = widget; }

  // package method
  /// - Throws:
  ///     - ER_PROGRESS_OPEN
  public static void waitProgress() {
    ProgressManager._waitProgressAdded();
    while (true) {
      ProgressManager.waitProgressDestroyed();
      try {
        ProgressManager._waitProgressAdded();
      } catch (LMIException e) {
        if (e.reason != ER_PROGRESS_OPEN) {
          throw e;
        }
        break;
      }
    }
  }

  // private method
  private static boolean _isProgressing() { return _widget != null; }

  /// - Throws:
  ///     - ER_PROGRESS_OPEN
  private static void _waitProgressAdded() {
    WaitManager.waitResponse();
    if (!_isProgressing()) {
      throw new LMIException(ER_PROGRESS_OPEN);
    }
  }

  private static void waitProgressDestroyed() {
    WaitManager.waitResponse();
    if (!_isProgressing()) return;
  }
}
