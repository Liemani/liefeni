package lmi;

public class MessageHandler {
  public static String getAction(haven.PMessage message) {
    if (message.wbuf.length < 4)
      return "";

    return lmi.Util.convertToString(message.wbuf, 4);
  }
}
