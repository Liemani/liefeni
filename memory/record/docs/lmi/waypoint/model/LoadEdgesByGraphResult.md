---
source: [LoadEdgesByGraphResult.java](../../../../../src/lmi/waypoint/model/LoadEdgesByGraphResult.java)
created: 2026-06-13
updated: 2026-06-14
---

# LoadEdgesByGraphResult

Represents the result of load edges by graph result.

## Members

### Constants

### Fields

#### `public final long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `public final Array<WpEdge> edges`
- Role: Caches edges entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public LoadEdgesByGraphResult(long graphId, Array<WpEdge> edges)`
- Role: Creates a new LoadEdgesByGraphResult instance.
- Description: Constructs the instance and initializes its default state.
