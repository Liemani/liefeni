package agent.effect;

public class effect {
  public static String name() {
    return "Effect";
  }

  public static String info() {
    return "Contains immediate effects that execute without creating a long-running job.";
  }

  public static String icon() {
    return "assets/icon_A.png";
  }

  public static String sortkey() {
    return "01_effect";
  }
}
