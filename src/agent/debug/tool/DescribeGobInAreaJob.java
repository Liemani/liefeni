package agent.debug.tool;

import agent.Job;

import haven.Gob;
import lmi.Array;
import lmi.AgentContext;
import lmi.GobFinder;

public class DescribeGobInAreaJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    System.out.println("출력할 gob이 있는 영역을 선택해주세요");
    Array<Gob> gobArray = GobFinder.inSelectedArea();
    for (Gob gob : gobArray)
      System.out.println("resource name: " + gob.resourceName());
  }

  public static String info() {
    return "Describes all gobs in a selected area.\nUsage: a DescribeGobInArea";
  }
}
