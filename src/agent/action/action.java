package agent.action;

public class action {
  public static String name() {
    return "Instant Actions";
  }

  public static String info() {
    return "Contains immediate actions that execute without creating a long-running job.";
  }

  public static String sortkey() {
    return "\ufffe\ufffe00_action";
  }
}
