# NamedSocketAddress

This file documents the responsibilities and members of `NamedSocketAddress`.

## Meta

- Source: [NamedSocketAddress.java](../../../src/haven/NamedSocketAddress.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the named socket address Haven component.

## Members

### Constants

### Fields

#### `public final String host`
- Role: Stores the host value.
- Description: Backs the cached state for this file.

#### `public final int port`
- Role: Stores the port value.
- Description: Backs the cached state for this file.

### Methods

#### `public NamedSocketAddress(String host, int port)`
- Role: Creates a new NamedSocketAddress instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean equals(NamedSocketAddress that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public static NamedSocketAddress parse(String spec, int defport)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public static NamedSocketAddress parse(String spec)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public String toString(int defport)`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
