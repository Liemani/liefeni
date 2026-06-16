# ResID

This file documents the responsibilities and members of `ResID`.

## Meta

- Source: [ResID.java](../../../src/haven/ResID.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the res id Haven component.

## Nested Types

### ResolveMapper

- Role: Represents resolve mapper within ResID.
- Description: Describes the nested resolve mapper type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Resource.Resolver src`
- Role: Stores the src value.
- Description: Backs the cached state for this file.

#### `public final Resource.Resolver rr`
- Role: Stores the rr value.
- Description: Backs the cached state for this file.

### Methods

#### `private ResID(int id, Resource.Resolver src)`
- Role: Creates a new ResID instance.
- Description: Constructs the instance and initializes its default state.

#### `private ResID(int id)`
- Role: Creates a new ResID instance.
- Description: Constructs the instance and initializes its default state.

#### `public static ResID of(int id)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public ResID src(Resource.Resolver src)`
- Role: Performs src.
- Description: Supports the src operation used by the surrounding class.

#### `public Resource get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public int intValue()`
- Role: Performs int value.
- Description: Supports the int value operation used by the surrounding class.

#### `public byte byteValue()`
- Role: Performs byte value.
- Description: Supports the byte value operation used by the surrounding class.

#### `public short shortValue()`
- Role: Performs short value.
- Description: Supports the short value operation used by the surrounding class.

#### `public long longValue()`
- Role: Performs long value.
- Description: Supports the long value operation used by the surrounding class.

#### `public float floatValue()`
- Role: Performs float value.
- Description: Supports the float value operation used by the surrounding class.

#### `public double doubleValue()`
- Role: Performs double value.
- Description: Supports the double value operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public ResolveMapper(Resource.Resolver rr)`
- Role: Performs resolve mapper.
- Description: Supports the resolve mapper operation used by the surrounding class.

#### `public Object apply(Object obj)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
