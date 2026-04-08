package lmi;

import haven.*;
import java.awt.Color;
import java.util.*;

public class Main {
  public static void init() {
    // Initialize legacy LMI system
    lmi.Initializer.init();

    Console.setscmd("a", new ACommand());
  }

  // suppose having host() as GameUI
  private static class ACommand implements Console.Command {
    Console cons;

    public void run(Console cons, String[] args) throws Exception {
      this.cons = cons;
      if (args.length < 2) {
        printCommandList();
        return;
      }
      String a_command = args[1];

      // 1. Handle Options (starting with --)
      if (a_command.startsWith("--")) {
        if (a_command.equals("--stop")) {
          if (AgentManager.isRunning()) {
            AgentManager.interrupt();
            print("Automation stopped.");
          } else {
            print("No automation running.");
          }
        } else {
          print("Unknown option: " + a_command);
        }
        return;
      }

      // 2. Handle Automation Program execution
      Class<? extends AgentManager.Agent> cls = AgentManager.getClass(a_command);
      if (cls != null) {
        try {
          AgentManager.run(cls, args);
          print("Started Agent: " + a_command);
        } catch (Exception e) {
          print("Failed to run Agent: " + e.getMessage());
          e.printStackTrace();
        }
      } else {
        print("Unknown Agent: " + a_command);
      }
    }

    private void print(String message) {
      this.cons.out.println();
    }

    private void printCommandList() {
      print("Usage: a <agent_name> | --stop");
      print("Options:");
      print("  --stop - Stops the current agent");
      print("Available agents:");
      for (String cmd : AgentManager.getCommandStringSet()) {
        print("  " + cmd);
      }
    }
  }

  public static void tick(double dt, GameUI gui) {
    // Update context for legacy LMI
    ObjectShadow.setGameUI(gui);
    // MapView and other fields in ObjectShadow are usually set via hooks we added
  }
}
