package lmi.job;

import haven.ISBox;
import haven.Widget;
import haven.Window;
import lmi.Util;
import lmi.WidgetManager;
import lmi.AgentContext;

public class PrintAllISBoxTextJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Window window = WidgetManager.gameUI().getChildOf(Window.class);
    if (window == null) return;
    Widget child = window.child;
    while (child != null) {
      if (child instanceof ISBox) {
        final ISBox isbox = (ISBox)child;
        Util.debugPrint("isbox.text(): " + isbox.text());
      }
      child = child.next;
    }
  }

  public static String man() {
    return "Prints text of all ISBox widgets in the current window.\nUsage: a PrintAllISBoxText";
  }
}
