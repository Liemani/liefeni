package agent;

/**
 * Represents a single, immediate effect that can be executed.
 * Unlike Jobs, Effects are intended for immediate, non-continuous execution.
 */
public abstract class Effect {
  
  /**
   * Performs the primary logic of this effect.
   */
  public abstract void execute();

  /**
   * Returns a brief description of the effect.
   * Override this to provide tooltips for the UI.
   */
  public static String info() {
    return "LMI Effect";
  }
}
