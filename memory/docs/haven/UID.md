# UID

This file documents the responsibilities and members of `UID`.

## Meta

- Source: [UID.java](../../../src/haven/UID.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the uid Haven component.

## Members

### Constants

#### `public static final UID nil = new UID(0)`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final long bits`
- Role: Stores the bits value.
- Description: Backs the cached state for this file.

### Methods

#### `private UID(long bits)`
- Role: Creates a new UID instance.
- Description: Constructs the instance and initializes its default state.

#### `public static UID of(long bits)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public long longValue()`
- Role: Performs long value.
- Description: Supports the long value operation used by the surrounding class.

#### `public byte byteValue()`
- Role: Performs byte value.
- Description: Supports the byte value operation used by the surrounding class.

#### `public short shortValue()`
- Role: Performs short value.
- Description: Supports the short value operation used by the surrounding class.

#### `public int intValue()`
- Role: Performs int value.
- Description: Supports the int value operation used by the surrounding class.

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
