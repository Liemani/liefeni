package agent;

/**
 * Represents a single, instantaneous action that can be executed.
 * Unlike Jobs, Actions are intended for immediate, non-continuous execution.
 */
public abstract class Action {
  
  /**
   * Performs the primary logic of this action.
   */
  public abstract void execute();

  /**
   * Returns a brief description of the action.
   * Override this to provide tooltips for the UI.
   */
  public static String info() {
    return "LMI Action";
  }
}
