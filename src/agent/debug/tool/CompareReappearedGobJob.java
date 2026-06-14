package agent.debug.tool;

import agent.Job;
import haven.Gob;
import lmi.runtime.AgentContext;
import lmi.bridge.Api;
import lmi.core.ClickManager;
import lmi.runtime.WaitManager;

public class CompareReappearedGobJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.alert("사라졌다가 다시 나타나는지 확인할 첫 gob 을 클릭해 주세요");
    Gob firstGob = ClickManager.getGob();
    if (firstGob == null) {
      Api.message("CompareReappearedGob failed: first gob is null.");
      return;
    }

    Api.message("Waiting for first gob.removed == true");
    while (!firstGob.removed)
      WaitManager.sleepPolling();

    Api.message("First gob was removed. Waiting 1 second...");
    WaitManager.sleep(1000);

    Api.alert("다시 나타난 gob 을 클릭해 주세요");
    Gob secondGob = ClickManager.getGob();
    if (secondGob == null) {
      Api.message("CompareReappearedGob failed: second gob is null.");
      return;
    }

    boolean sameObject = firstGob == secondGob;
    boolean sameId = firstGob.id == secondGob.id;

    Api.message("first gob identityHashCode: " + System.identityHashCode(firstGob));
    Api.message("second gob identityHashCode: " + System.identityHashCode(secondGob));
    Api.message("first gob id: " + firstGob.id);
    Api.message("second gob id: " + secondGob.id);
    Api.message("same object (==): " + sameObject);
    Api.message("same gob id: " + sameId);
  }

  public static String info() {
    return "Clicks a gob, waits for gob.removed, then clicks the reappeared gob and compares object identity and gob id.";
  }
}
