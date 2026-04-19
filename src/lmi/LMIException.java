package lmi;

import lmi.Constant.ExceptionReason;

// useful java.lang.Exception
//  InterruptedException
//  IllegalArgumentException
//  IndexOutOfBoundsException

public class LMIException extends RuntimeException {
  public ExceptionReason reason;

  public LMIException(ExceptionReason reason) { this.reason = reason; }

  public String toString() {
    return this.getClass().getName() + " " + this.reason;
  }
}
