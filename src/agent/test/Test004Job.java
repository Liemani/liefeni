package agent.test;

import agent.Job;

import lmi.bridge.Api;
import lmi.runtime.AgentContext;

public class Test004Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length != 3) {
      Api.error("usage: a Test004 <count to transfer>");
      return;
    }
    final int count = Integer.parseInt(args[2]);

    Api.alert("string item을 가져올 container를 클릭해주세요");
    Api.takeItemFromContainer(Api.getGob(), lmi.core.Constant.nameSet_string, count);
  }

  public static String info() {
    return "Test 004: Transfers items from container.\nUsage: a Test004 <count>";
  }
}
