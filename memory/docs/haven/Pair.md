# Pair

This file documents the responsibilities and members of `Pair`.

## Meta

- Source: [Pair.java](../../../src/haven/Pair.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the pair Haven component.

## Members

### Constants

### Fields

#### `public final A a`
- Role: Holds the a state.
- Description: Backs the cached state for this file.

#### `public final B b`
- Role: Holds the b state.
- Description: Backs the cached state for this file.

### Methods

#### `public Pair(A a, B b)`
- Role: Creates a new Pair instance.
- Description: Constructs the instance and initializes its default state.

#### `public static <A, B> Pair<A, B> of(A a, B b)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object O)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
