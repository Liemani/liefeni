package lmi;

import haven.*;
import java.awt.Color;
import java.util.*;

public class LmiHandler {
  public static void init() {
    // Initialize legacy LMI system
    lmi.Initializer.init();

    Console.setscmd("a", new Console.Command() {
      public void run(Console cons, String[] args) throws Exception {
        Console.Host host = cons.host();
        if (!(host instanceof GameUI)) {
          throw new Exception("a command can only be used in game.");
        }
        GameUI gui = (GameUI)host;
        if (args.length < 2) {
          printCommandList(gui);
          return;
        }
        String a_command = args[1];

        if (a_command.equals("stop")) {
          if (AutomationManager.isRunning()) {
            AutomationManager.interrupt();
            print(gui, "Automation stopped.", Color.YELLOW);
          } else {
            print(gui, "No automation running.");
          }
          return;
        }

        // Try to find and start automation
        Class<AutomationManager.Automation> cls = AutomationManager.getClass(a_command);
        if (cls != null) {
          try {
            AutomationManager.start(cls, args);
            print(gui, "Started automation: " + a_command, Color.GREEN);
          } catch (Exception e) {
            print(gui, "Failed to start automation: " + e.getMessage(), Color.RED);
            e.printStackTrace();
          }
        } else {
          print(gui, "Unknown a_command: " + a_command, Color.RED);
        }
      }
    });
  }

  public static void tick(double dt, GameUI gui) {
    // Update context for legacy LMI
    ObjectShadow.setGameUI(gui);
    // MapView and other fields in ObjectShadow are usually set via hooks we added
  }

  private static void printCommandList(GameUI gui) {
    print(gui, "Available a_commands:");
    print(gui, "  stop - Stops the current automation");
    for (String cmd : AutomationManager.getCommandStringSet()) {
      print(gui, "  " + cmd);
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
