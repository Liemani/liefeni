---
source: [SaveBatch.java](../../../../../../src/lmi/waypoint/managed/SaveBatch.java)
created: 2026-06-13
updated: 2026-06-14
---

# SaveBatch

Batches waypoint persistence work for a single flush.

## Members

### Constants

### Fields

#### `public final List<WpNodeSnapshot> wpNodeSnapshots`
- Role: Caches the wp node snapshots value.
- Description: Caches the `wpNodeSnapshots` value for reuse.

### Methods

#### `public SaveBatch(List<WpNodeSnapshot> wpNodeSnapshots)`
- Role: Creates a new SaveBatch instance.
- Description: Constructs the SaveBatch instance from the supplied inputs.

#### `public boolean isEmpty()`
- Role: Checks whether the empty.
- Description: Returns whether the condition is satisfied.