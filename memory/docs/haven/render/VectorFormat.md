# VectorFormat

This file documents the responsibilities and members of `VectorFormat`.

## Meta

- Source: [VectorFormat.java](../../../../src/haven/render/VectorFormat.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the vector format render pipeline component.

## Members

### Constants

### Fields

#### `public final int nc`
- Role: Stores the nc value.
- Description: Backs the cached state for this file.

#### `public final NumberFormat cf`
- Role: Holds the cf state.
- Description: Backs the cached state for this file.

### Methods

#### `public VectorFormat(int nc, NumberFormat cf)`
- Role: Creates a new VectorFormat instance.
- Description: Constructs the instance and initializes its default state.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.
