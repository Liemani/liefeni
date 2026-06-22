---
source: [Pair.java](../../../../src/haven/Pair.java)
created: 2026-06-13
updated: 2026-06-14
---

# Pair

Represents the pair Haven component.

## Members

### Constants

### Fields

#### `public final A a`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `public final B b`
- Role: Caches the b value.
- Description: Caches the `b` value for reuse.

### Methods

#### `public Pair(A a, B b)`
- Role: Creates a new Pair instance.
- Description: Constructs the Pair instance from the supplied inputs.

#### `public static <A, B> Pair<A, B> of(A a, B b)`
- Role: Builds a Pair value from the supplied components.
- Description: Builds a Pair value from the supplied components.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object O)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Pair for debugging and logging.