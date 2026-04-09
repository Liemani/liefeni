package lmi.job;

import lmi.Api;
import lmi.Debug;
import lmi.AppContext;
import lmi.AgentContext;

public class PrepareJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    // set debug print on
    Debug.toggleIsPrint();

    // set grid on
    if (AppContext.mapView != null)
      AppContext.mapView.showgrid(true);
  }

  public static String man() {
    return "Prepares the environment (debug print, grid, etc.).\nUsage: a Prepare";
  }
}
