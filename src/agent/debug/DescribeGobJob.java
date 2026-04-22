package agent.debug;

import agent.Job;

import lmi.Api;
import lmi.ClickManager;
import lmi.AgentContext;
import haven.Gob;

public class DescribeGobJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.alert("정보를 출력할 오브젝트를 클릭해 주세요");
    Gob gob = ClickManager.getGob();
    Api.message(gob.debugDescription());
  }

  public static String info() {
    return "Describes a clicked object.\nUsage: a DescribeGob";
  }
}
