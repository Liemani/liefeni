---
source: [IDRef.java](../../../../src/haven/IDRef.java)
created: 2026-06-13
updated: 2026-06-14
---

# IDRef

Represents the idref Haven component.

## Nested Types

### WRef

- Role: Wraps a weakly referenced interned value.
- Description: Weak reference entry used by the IDRef intern table.

## Members

### Constants

### Fields

#### `private static Map<Object, WRef> map = new HashMap<Object, WRef>()`
- Role: Implements the map operation.
- Description: Implements the private static map<object, w ref> map = new hash map<object, w ref>() operation.

#### `private static ReferenceQueue<IDRef> queue = new ReferenceQueue<IDRef>()`
- Role: Implements the queue operation.
- Description: Implements the private static reference queue<id ref> queue = new reference queue<id ref>() operation.

#### `private static int nextseq = 0`
- Role: Caches the nextseq value.
- Description: Caches the `nextseq` value for reuse.

#### `private final Object val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `private final int seq`
- Role: Caches the seq value.
- Description: Caches the `seq` value for reuse.

#### `private final Object val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

### Methods

#### `private IDRef(Object val)`
- Role: Creates a new IDRef instance.
- Description: Constructs the IDRef instance from the supplied inputs.

#### `private WRef(IDRef ref, Object val)`
- Role: Handles the wref path.
- Description: Implements the w ref operation.

#### `public static IDRef intern(Object x)`
- Role: Handles the intern path.
- Description: Implements the intern operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this IDRef for debugging and logging.