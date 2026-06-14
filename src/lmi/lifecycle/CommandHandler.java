package lmi.lifecycle;

import haven.*;
import java.awt.Color;
import java.util.*;
import lmi.runtime.AgentManager;

public class CommandHandler {
  public static void init() {
    Console.setscmd("a", new ACommand());
  }

  private static class ACommand implements Console.Command {
    public void run(Console cons, String[] args) throws Exception {
      AgentManager.run(args);
    }
  }
}
