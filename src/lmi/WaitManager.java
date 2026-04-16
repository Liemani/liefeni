package lmi;

import static lmi.Constant.Timeout.*;
import static lmi.Constant.ExceptionReason.*;

public class WaitManager {
  private static volatile int _lastSentSeq = -1;
  private static volatile int _lastAckedSeq = -1;

  private static final Object lock = new Object();

  // init
  static void init() {
    _lastSentSeq = -1;
    _lastAckedSeq = -1;
  }

  // isAcked
  private static boolean isAcked(int seq) {
    return seq <= _lastAckedSeq
      || (_lastAckedSeq < 1000 && 60000 < seq);
  }

  // Sequence Tracking (ACK)
  public static void updateSentSeq(int seq) {
    _lastSentSeq = seq;
  }

  // Standard Wait for ACK
  // - Throws: LMIException
  public static void waitACK() {
    final int targetSeq = _lastSentSeq;

    synchronized (lock) {
      while (!isAcked(targetSeq)) {
        try {
          lock.wait(TO_NONE);
        } catch (InterruptedException e) {
          throw new LMIException(ER_INTERRUPTED);
        }
      }
    }
  }

  // waitResponse
  public static void waitResponse() {
    waitACK();
    sleep(TO_IMPERCEPTIBLE);
  }

  // updateAckedSeq
  public static void updateAckedSeq(int seq) {
    if (isAcked(seq)) return;

    _lastAckedSeq = seq;
    synchronized (lock) {
      lock.notifyAll();
    }
  }

  public static void sleep() {
    sleep(TO_PERCEPTIBLE);
  }

  public static void sleep(long timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      throw new LMIException(ER_INTERRUPTED);
    }
  }
}
