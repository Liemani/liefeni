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

        // 1. Handle Options (starting with --)
        if (a_command.startsWith("--")) {
          if (a_command.equals("--stop")) {
            if (AgentManager.isRunning()) {
              AgentManager.interrupt();
              print(gui, "Automation stopped.", Color.YELLOW);
            } else {
              print(gui, "No automation running.");
            }
          } else {
            print(gui, "Unknown option: " + a_command, Color.RED);
          }
          return;
        }

        // 2. Handle Automation Program execution
        Class<? extends AgentManager.Agent> cls = AgentManager.getClass(a_command);
        if (cls != null) {
          try {
            AgentManager.run(cls, args);
            print(gui, "Started Agent: " + a_command, Color.GREEN);
          } catch (Exception e) {
            print(gui, "Failed to run Agent: " + e.getMessage(), Color.RED);
            e.printStackTrace();
          }
        } else {
          print(gui, "Unknown Agent: " + a_command, Color.RED);
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
    print(gui, "Usage: a <agent_name> | --stop");
    print(gui, "Options:");
    print(gui, "  --stop - Stops the current agent");
    print(gui, "Available agents:");
    for (String cmd : AgentManager.getCommandStringSet()) {
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
