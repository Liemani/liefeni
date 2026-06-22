---
source: [ArrayIdentity.java](../../../../src/haven/ArrayIdentity.java)
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
- Role: Updates the cached set.
- Description: Updates the cached set.

#### `private static ReferenceQueue<Object> cleanq = new ReferenceQueue<Object>()`
- Role: Implements the cleanq operation.
- Description: Implements the private static reference queue<object> cleanq = new reference queue<object>() operation.

### Methods

#### `private Entry(T[] arr)`
- Role: Handles the entry path.
- Description: Implements the entry operation.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `private static void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `private static <T> Entry<T> getcanon(Entry<T> e)`
- Role: Handles the getcanon path.
- Description: Returns the canon.

#### `public static <T> T[] intern(T[] arr)`
- Role: Handles the intern path.
- Description: Implements the intern operation.