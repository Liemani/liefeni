---
source: [DescribeGobCacheAndRenderEffect.java](../../../../src/agent/debug/DescribeGobCacheAndRenderEffect.java)
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
- Description: Supports the execute operation used by the surrounding class.

#### `public static String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `private static int _ocacheGobCount(OCache oc)`
- Role: Counts gobs currently cached in OCache.
- Description: Supports the ocache gob count operation used by the surrounding class.

#### `private static Object _field(Object object, String fieldName)`
- Role: Reads a reflected field from the target object.
- Description: Supports the field operation used by the surrounding class.

#### `private static Map<?, ?> _mapField(Object object, String fieldName)`
- Role: Reads a reflected map field from the target object.
- Description: Supports the map field operation used by the surrounding class.
