package lmi;

import java.util.LinkedList;
import java.util.EnumMap;

import lmi.Constant.Signal;
import lmi.Constant.Brief;
import static lmi.Constant.Brief.*;
import static lmi.Constant.ExceptionType.*;
import static lmi.Constant.Signal.*;
import static lmi.Constant.TimeOut.*;

public class WaitManager {
  // Define
  static class WaiterList extends LinkedList<SignalWaiter> {}

  // Field
  private static EnumMap<Signal, WaiterList> _waiterListMap;
  private static volatile int _lastSentSeq = -1;
  private static volatile int _lastAckedSeq = -1;

  // Init
  static void init() {
    _waiterListMap = new EnumMap<Signal, WaiterList>(Signal.class);
    for (Signal signal : Signal.values())
      _waiterListMap.put(signal, new WaiterList());
    _lastSentSeq = -1;
    _lastAckedSeq = -1;
  }

  // Sequence Tracking
  public static void updateSentSeq(int seq) {
    _lastSentSeq = seq;
  }

  public static void updateAckedSeq(int seq) {
    if (seq > _lastAckedSeq || (seq < 1000 && _lastAckedSeq > 60000)) {
      _lastAckedSeq = seq;
      synchronized (WaitManager.class) {
        WaitManager.class.notifyAll();
      }
    }
  }

  // Wait for the last sent message's ACK
  public static Brief waitACK(long timeOut) throws InterruptedException {
    final int targetSeq = _lastSentSeq;
    if (targetSeq < 0) return B_SUCCESS;

    final long startTime = System.currentTimeMillis();
    synchronized (WaitManager.class) {
      while (_lastAckedSeq < targetSeq) {
        if (targetSeq > 60000 && _lastAckedSeq < 1000) break;

        long elapsed = System.currentTimeMillis() - startTime;
        if (timeOut != TO_NONE && elapsed >= timeOut) {
          return B_TIMEOUT;
        }

        if (timeOut == TO_NONE) WaitManager.class.wait(TO_GENERAL);
        else WaitManager.class.wait(timeOut - elapsed);
      }
    }
    return B_SUCCESS;
  }

  public static Brief waitACK() throws InterruptedException {
    return waitACK(TO_GENERAL);
  }

  // Signal System
  public static boolean isWaitingSignal(Signal signal, Object subject) {
    final WaiterList waiterList = _waiterListMap.get(signal);
    synchronized (waiterList) {
      if (waiterList.isEmpty()) return false;
      for (SignalWaiter waiter : waiterList)
        if (waiter._isWaiting(subject))
          return true;
    }
    return false;
  }

  public static Brief waitSignal(Signal signal, Object subject, long timeOut) throws InterruptedException {
    final SignalWaiter waiter = new SignalWaiter(signal, subject);
    final WaiterList waiterList = _waiterListMap.get(signal);
    synchronized (waiterList) {
      waiterList.add(waiter);
    }
    return waiter._wait(timeOut);
  }

  public static Brief waitSignal(Signal signal, long timeOut) throws InterruptedException {
    return waitSignal(signal, null, timeOut);
  }

  public static void notifySignal(Signal signal, Object subject) {
    final WaiterList waiterList = _waiterListMap.get(signal);
    synchronized (waiterList) {
      if (waiterList.isEmpty()) return;
      waiterList.removeIf((signalWaiter) -> {
        if (signalWaiter._isWaiting(subject)) {
          signalWaiter._notify();
          return true;
        }
        return false;
      });
    }
  }

  public static void notifySignal(Signal signal) {
    notifySignal(signal, null);
  }

  // SignalWaiter
  private static class SignalWaiter {
    private Signal _signal;
    private Object _subject;

    private SignalWaiter(Signal signal, Object subject) {
      _signal = signal;
      _subject = subject;
    }

    private boolean _isWaiting(Object subject) { return _subject == subject; }

    private Brief _wait(long timeOut) throws InterruptedException {
      final long startTime = System.currentTimeMillis();
      synchronized (this) {
        this.wait(timeOut);
      }
      final long endTime = System.currentTimeMillis();
      if (timeOut != TO_NONE && endTime - startTime >= timeOut)
        return B_TIMEOUT;
      return B_SUCCESS;
    }

    private void _notify() {
      synchronized (this) {
        this.notify();
      }
    }
  }
}
