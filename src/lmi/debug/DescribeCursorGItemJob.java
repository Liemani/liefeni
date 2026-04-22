package lmi.debug;

import lmi.Job;
import lmi.WidgetManager;
import lmi.AgentContext;

public class DescribeCursorGItemJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    haven.Widget gItem = WidgetManager.cursorGItem();
    System.out.println(gItem);
  }

  public static String info() {
    return "Describes the item currently under the cursor.\nUsage: a DescribeCursorGItem";
  }
}
