package lmi;

import haven.*;
import java.awt.Color;

public class LmiHandler {
  public static void init() {
    Console.setscmd("a", new Console.Command() {
      public void run(Console cons, String[] args) throws Exception {
        Console.Host host = cons.host();
        if (!(host instanceof GameUI)) {
          throw new Exception("a command can only be used in game.");
        }
        GameUI gui = (GameUI)host;
        if (args.length < 2) {
          print(gui, "Usage: :a <a_command> [args...]");
          return;
        }
        String a_command = args[1];
        handle(gui, a_command, args);
      }
    });
  }

  private static void handle(GameUI gui, String cmd, String[] args) {
    if (cmd.equals("move")) {
      print(gui, "Moving... (this is a placeholder)");
      // Add actual move logic here later
    } else if (cmd.equals("hello")) {
      print(gui, "Hello from LMI!");
    } else {
      print(gui, "Unknown a_command: " + cmd, Color.RED);
    }
  }

  public static void print(GameUI gui, String msg) {
    print(gui, msg, Color.WHITE);
  }

  public static void print(GameUI gui, String msg, Color col) {
    if (gui.syslog != null) {
      gui.syslog.append(msg, col);
    }
  }
}
