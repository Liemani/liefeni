package lmi.test;

import lmi.Job;
import lmi.Api;
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

  public static String info() {
    return "Prepares the environment (debug print, grid, etc.).\nUsage: a Prepare";
  }
}
