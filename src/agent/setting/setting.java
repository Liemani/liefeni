package agent.setting;

public class setting {
  public static String name() {
    return "Setting";
  }

  public static String info() {
    return "Contains immediate actions that execute without creating a long-running job.";
  }

  public static String icon() {
    return "assets/icon_S.png";
  }

  public static String sortkey() {
    return "02_setting";
  }
}
