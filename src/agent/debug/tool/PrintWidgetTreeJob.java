package agent.debug.tool;

import agent.Job;

import haven.Widget;
import lmi.core.AppContext;
import lmi.core.Util;
import lmi.runtime.AgentContext;

public class PrintWidgetTreeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    final Widget rootWidget = AppContext.rootWidget();
    iterateWidget(rootWidget, 0);
  }

  private void iterateWidget(haven.Widget widget, int indentCount) {
    for (; widget != null; widget = widget.next) {
      Util.insertIndent(indentCount);
      System.out.println(widget.getClass().getName());
      iterateWidget(widget.child, indentCount + 1);
    }
  }

  public static String info() {
    return "Prints the entire widget tree to stdout.\nUsage: a PrintWidgetTree";
  }
}
