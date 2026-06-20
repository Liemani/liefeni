---
source: [SaveBatch.java](../../../../../src/lmi/waypoint/managed/SaveBatch.java)
created: 2026-06-13
updated: 2026-06-14
---

# SaveBatch

Batches waypoint persistence work for a single flush.

## Members

### Constants

### Fields

#### `public final List<WpNodeSnapshot> wpNodeSnapshots`
- Role: Caches wp node snapshots entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public SaveBatch(List<WpNodeSnapshot> wpNodeSnapshots)`
- Role: Creates a new SaveBatch instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean isEmpty()`
- Role: Checks whether the empty.
- Description: Returns a boolean result for the described condition.
