package lmi.runtime;

import haven.ChatUI;
import haven.Widget;
import lmi.core.LMIException;

import static lmi.core.Constant.ExceptionReason.*;

public final class ChatInputMonitor {
  private static final Object lock = new Object();

  private static boolean waitingAreaChat = false;
  private static String capturedAreaChat = null;

  private ChatInputMonitor() {}

  public static void clear() {
    synchronized (lock) {
      waitingAreaChat = false;
      capturedAreaChat = null;
      lock.notifyAll();
    }
  }

  public static String waitAreaChat() {
    synchronized (lock) {
      waitingAreaChat = true;
      capturedAreaChat = null;

      while (capturedAreaChat == null) {
        try {
          lock.wait();
        } catch (InterruptedException e) {
          waitingAreaChat = false;
          throw new LMIException(ER_INTERRUPTED);
        }
      }

      String result = capturedAreaChat;
      waitingAreaChat = false;
      capturedAreaChat = null;
      return result;
    }
  }

  public static void capture(Widget sender, String msg, Object... args) {
    if (!"msg".contentEquals(msg)) return;
    if (!(sender instanceof ChatUI.MultiChat)) return;
    if (args.length < 1) return;
    if (!(args[0] instanceof String)) return;

    synchronized (lock) {
      if (!waitingAreaChat) return;
      capturedAreaChat = (String)args[0];
      lock.notifyAll();
    }
  }
}
