package lmi.runtime;

import lmi.core.LMIException;
import static lmi.core.Constant.ExceptionReason.ER_INTERRUPTED;

public final class PortalMonitor {
  private static final Object lock = new Object();
  private static long enteredGeneration = 0L;

  private PortalMonitor() {}

  public static void clear() {
    synchronized (lock) {
      enteredGeneration = 0L;
      lock.notifyAll();
    }
  }

  public static long generation() {
    synchronized (lock) {
      return enteredGeneration;
    }
  }

  public static void waitNextEnter(long previousGeneration) {
    synchronized (lock) {
      while (enteredGeneration <= previousGeneration) {
        try {
          lock.wait();
        } catch (InterruptedException e) {
          throw new LMIException(ER_INTERRUPTED);
        }
      }
    }
  }

  public static void notifyDidEnterPortal() {
    synchronized (lock) {
      enteredGeneration += 1L;
      lock.notifyAll();
    }
  }
}
