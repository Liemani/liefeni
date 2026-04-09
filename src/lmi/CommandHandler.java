package lmi;

import haven.*;
import java.awt.Color;
import java.util.*;

public class CommandHandler {
  public static void init() {
    lmi.Initializer.init();
    Console.setscmd("a", new ACommand());
  }

  private static class ACommand implements Console.Command {
    public void run(Console cons, String[] args) throws Exception {
      AgentManager.run(args);
    }
  }
}
