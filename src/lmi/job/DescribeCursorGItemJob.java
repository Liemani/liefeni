package lmi.job;

import lmi.Debug;
import lmi.WidgetManager;
import lmi.AgentContext;

public class DescribeCursorGItemJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    haven.Widget gItem = WidgetManager.cursorGItem();
    Debug.describeField(gItem);
  }

  public static String man() {
    return "Describes the item currently under the cursor.\nUsage: a DescribeCursorGItem";
  }
}
