---
source: [IDRef.java](../../../src/haven/IDRef.java)
created: 2026-06-13
updated: 2026-06-14
---

# IDRef

Represents the idref Haven component.

## Nested Types

### WRef

- Role: Represents wref within IDRef.
- Description: Describes the nested wref type used by the enclosing class.

## Members

### Constants

### Fields

#### `private static Map<Object, WRef> map = new HashMap<Object, WRef>()`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static ReferenceQueue<IDRef> queue = new ReferenceQueue<IDRef>()`
- Role: Caches queue entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static int nextseq = 0`
- Role: Stores the nextseq value.
- Description: Backs the cached state for this file.

#### `private final Object val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `private final int seq`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `private final Object val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

### Methods

#### `private IDRef(Object val)`
- Role: Creates a new IDRef instance.
- Description: Constructs the instance and initializes its default state.

#### `private WRef(IDRef ref, Object val)`
- Role: Performs wref.
- Description: Supports the wref operation used by the surrounding class.

#### `public static IDRef intern(Object x)`
- Role: Performs intern.
- Description: Supports the intern operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
