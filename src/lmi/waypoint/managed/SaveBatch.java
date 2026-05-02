package lmi.waypoint.managed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SaveBatch {
  public final List<WpNodeSnapshot> wpNodeSnapshots;

  public SaveBatch(List<WpNodeSnapshot> wpNodeSnapshots) {
    this.wpNodeSnapshots = Collections.unmodifiableList(new ArrayList<>(wpNodeSnapshots));
  }

  public boolean isEmpty() {
    return wpNodeSnapshots.isEmpty();
  }
}
