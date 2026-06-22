---
source: [DescribeGobCacheAndRenderEffect.java](../../../../../src/agent/debug/DescribeGobCacheAndRenderEffect.java)
created: 2026-06-13
updated: 2026-06-14
---

# DescribeGobCacheAndRenderEffect

Prints gob cache and render state for debugging.

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

#### `private static int _ocacheGobCount(OCache oc)`
- Role: Counts gobs currently cached in OCache.
- Description: Implements the ocache gob count operation.

#### `private static Object _field(Object object, String fieldName)`
- Role: Reads a reflected field from the target object.
- Description: Implements the field operation.

#### `private static Map<?, ?> _mapField(Object object, String fieldName)`
- Role: Reads a reflected map field from the target object.
- Description: Implements the map field operation.