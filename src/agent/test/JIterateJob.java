package agent.test;

import agent.Job;

import haven.Coord;
import haven.Gob;
import lmi.AtomicAction;
import lmi.Api;
import lmi.Self;
import lmi.AgentContext;

public class JIterateJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length != 3) {
      Api.error("usage: a JIterate <start distance>");
      return;
    }

    Api.alert("바운딩 박스의 크기를 측정할 Gob을 클릭해 주세요");
    Gob gob = Api.getGob();

    int targetDistance = Integer.parseInt(args[2]);
    AtomicAction.go(gob.position().add(0, -targetDistance));

    while (true) {
      final Coord destination = Self.position().add(0, 1);
      AtomicAction.go(destination);
      System.out.println("current location: " + Self.position());
    }
  }

  public static String info() {
    return "Measures bounding box by iterating movement.\nUsage: a JIterate <start_distance>";
  }
}
