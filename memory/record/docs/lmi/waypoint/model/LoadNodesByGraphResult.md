---
source: [LoadNodesByGraphResult.java](../../../../../src/lmi/waypoint/model/LoadNodesByGraphResult.java)
created: 2026-06-13
updated: 2026-06-14
---

# LoadNodesByGraphResult

Represents the result of load nodes by graph result.

## Members

### Constants

### Fields

#### `public final long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `public final Array<WpNode> nodes`
- Role: Caches nodes entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public LoadNodesByGraphResult(long graphId, Array<WpNode> nodes)`
- Role: Creates a new LoadNodesByGraphResult instance.
- Description: Constructs the instance and initializes its default state.
