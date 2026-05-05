package agent.debug.tool;

import agent.Job;

import haven.ISBox;
import haven.Widget;
import haven.Window;
import lmi.AppContext;
import lmi.Util;
import lmi.AgentContext;

public class PrintAllISBoxTextJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Window window = AppContext.gameUI().getChildOf(Window.class);
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

  public static String info() {
    return "Prints text of all ISBox widgets in the current window.\nUsage: a PrintAllISBoxText";
  }
}
