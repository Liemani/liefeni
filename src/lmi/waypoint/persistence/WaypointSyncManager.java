package lmi.waypoint.persistence;

import java.util.concurrent.ConcurrentLinkedQueue;

public final class WaypointSyncManager {
  private static final ConcurrentLinkedQueue<Runnable> completions = new ConcurrentLinkedQueue<>();

  private WaypointSyncManager() {}

  public static void enqueue(Runnable completion) {
    if (completion == null)
      return;
    completions.offer(completion);
  }

  public static void drain() {
    while (true) {
      Runnable completion = completions.poll();
      if (completion == null)
        return;
      completion.run();
    }
  }

  public static void clear() {
    completions.clear();
  }
}
