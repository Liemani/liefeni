package lmi;

import lmi.Constant.ExceptionReason;

public class LMIIntException extends LMIException {
  public int value;

  public LMIIntException(ExceptionReason reasone, int value) {
    super(reasone);
    this.value = value;
  }

  public String toString() { return "{ reasone: " + this.reason + ", value: " + this.value + " }"; }
}
