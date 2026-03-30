package lmi;

import haven.*;
import java.awt.Color;
import java.util.*;

public class LmiHandler {
  private static Task currentTask = null;

  public interface Task {
    void tick(double dt, GameUI gui);
    boolean isFinished();
    void stop(GameUI gui);
  }

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

        if (a_command.equals("stop")) {
          stopTask(gui);
          return;
        }

        handle(gui, a_command, args);
      }
    });
  }

  public static void tick(double dt, GameUI gui) {
    if (currentTask != null) {
      if (currentTask.isFinished()) {
        print(gui, "Task finished.");
        currentTask = null;
      } else {
        currentTask.tick(dt, gui);
      }
    }
  }

  private static void stopTask(GameUI gui) {
    if (currentTask != null) {
      currentTask.stop(gui);
      currentTask = null;
      print(gui, "Task stopped.", Color.YELLOW);
    } else {
      print(gui, "No task running.");
    }
  }

  private static void startTask(GameUI gui, Task task) {
    stopTask(gui);
    currentTask = task;
    print(gui, "Task started: " + task.getClass().getSimpleName(), Color.GREEN);
  }

  private static void handle(GameUI gui, String cmd, String[] args) {
    if (cmd.equals("move")) {
      startTask(gui, new MoveTask(args));
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

  // --- Example Task implementation ---
  public static class MoveTask implements Task {
    private boolean done = false;
    private double timer = 0;

    public MoveTask(String[] args) {
      // Initialize with args
    }

    @Override
      public void tick(double dt, GameUI gui) {
        timer += dt;
        if (timer > 2.0) { // Placeholder: finish after 2 seconds
          done = true;
        }
      }

    @Override
      public boolean isFinished() {
        return done;
      }

    @Override
      public void stop(GameUI gui) {
        done = true;
      }
  }
}
