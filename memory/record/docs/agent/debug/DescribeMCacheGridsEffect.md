---
source: [DescribeMCacheGridsEffect.java](../../../../../src/agent/debug/DescribeMCacheGridsEffect.java)
created: 2026-06-13
updated: 2026-06-14
---

# DescribeMCacheGridsEffect

Prints map cache grid state for debugging.

## Members

### Constants

### Fields

### Methods

#### `public void execute()`
- Role: Executes the operation.
- Description: Runs the queued request and posts its callback result back through the sync manager.

#### `public static String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public static String info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `private static Map<Coord, ?> _mapField(MCache map, String fieldName)`
- Role: Reads a reflected map field from the target object.
- Description: Implements the map field operation.