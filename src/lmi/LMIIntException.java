package lmi;

import lmi.Constant.ExceptionType;

public class LMIIntException extends LMIException {
  public int value;

  public LMIIntException(ExceptionType type, int value) {
    super(type);
    this.value = value;
  }

  public String toString() { return "{ type: " + this.type + ", value: " + this.value + " }"; }
}
