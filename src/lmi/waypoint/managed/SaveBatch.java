package lmi.waypoint.managed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SaveBatch {
  public final WpAnchorSnapshot wpAnchorSnapshot;
  public final List<WpNodeSnapshot> wpNodeSnapshots;

  public SaveBatch(WpAnchorSnapshot wpAnchorSnapshot, List<WpNodeSnapshot> wpNodeSnapshots) {
    this.wpAnchorSnapshot = wpAnchorSnapshot;
    this.wpNodeSnapshots = Collections.unmodifiableList(new ArrayList<>(wpNodeSnapshots));
  }

  public boolean isEmpty() {
    return (wpAnchorSnapshot == null) && wpNodeSnapshots.isEmpty();
  }
}
