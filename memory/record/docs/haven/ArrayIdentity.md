---
source: [ArrayIdentity.java](../../../src/haven/ArrayIdentity.java)
created: 2026-06-13
updated: 2026-06-14
---

# ArrayIdentity

Represents the array identity Haven component.

## Nested Types

### Entry

- Role: Represents entry within ArrayIdentity.
- Description: Describes the nested entry type used by the enclosing class.

## Members

### Constants

### Fields

#### `private static HashMap<Entry<?>, Entry<?>> set = new HashMap<Entry<?>, Entry<?>>()`
- Role: Caches set entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static ReferenceQueue<Object> cleanq = new ReferenceQueue<Object>()`
- Role: Caches cleanq entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `private Entry(T[] arr)`
- Role: Performs entry.
- Description: Supports the entry operation used by the surrounding class.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `private static void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `private static <T> Entry<T> getcanon(Entry<T> e)`
- Role: Performs getcanon.
- Description: Supports the getcanon operation used by the surrounding class.

#### `public static <T> T[] intern(T[] arr)`
- Role: Performs intern.
- Description: Supports the intern operation used by the surrounding class.
