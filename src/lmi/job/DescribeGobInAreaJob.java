package lmi.job;

import haven.Gob;
import lmi.Api;
import lmi.Array;
import lmi.AgentContext;

public class DescribeGobInAreaJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    System.out.println("출력할 gob이 있는 영역을 선택해주세요");
    Array<Gob> gobArray = Api.getGobArrayInArea();
    for (Gob gob : gobArray)
      System.out.println("resource name: " + gob.resourceName());
  }

  public static String man() {
    return "Describes all gobs in a selected area.\nUsage: a DescribeGobInArea";
  }
}
