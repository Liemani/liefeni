---
source: [Hash.java](../../../../src/haven/Hash.java)
created: 2026-06-13
updated: 2026-06-14
---

# Hash

Defines the hashing and equality strategy used by map-like containers.

## Members

### Constants

#### `public static final Hash<Object> eq = new Hash<Object>()`
- Role: Uses object equality.
- Description: Hash strategy that delegates to `hashCode()` and `equals()`.
- Value: `new Hash<Object>()`

#### `public static final Hash<Object> id = new Hash<Object>()`
- Role: Uses object identity.
- Description: Hash strategy that compares by identity and `System.identityHashCode()`.
- Value: `new Hash<Object>()`

### Fields

### Methods

#### `public int hash(T ob)`
- Role: Computes a hash value.
- Description: Returns the hash code used to bucket values of this strategy.

#### `public boolean equal(T x, T y)`
- Role: Compares two values.
- Description: Returns whether two values should be treated as the same key.