# HalfFloat

This file documents the responsibilities and members of `HalfFloat`.

## Meta

- Source: [HalfFloat.java](../../../src/haven/HalfFloat.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the half float Haven component.

## Members

### Constants

### Fields

#### `public final short bits`
- Role: Stores the bits value.
- Description: Backs the cached state for this file.

### Methods

#### `public HalfFloat(short bits)`
- Role: Creates a new HalfFloat instance.
- Description: Constructs the instance and initializes its default state.

#### `public static HalfFloat decode(short bits)`
- Role: Performs decode.
- Description: Supports the decode operation used by the surrounding class.

#### `public static HalfFloat of(float val)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static HalfFloat of(double val)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public boolean equals(HalfFloat that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public float floatValue()`
- Role: Performs float value.
- Description: Supports the float value operation used by the surrounding class.

#### `public byte byteValue()`
- Role: Performs byte value.
- Description: Supports the byte value operation used by the surrounding class.

#### `public short shortValue()`
- Role: Performs short value.
- Description: Supports the short value operation used by the surrounding class.

#### `public int intValue()`
- Role: Performs int value.
- Description: Supports the int value operation used by the surrounding class.

#### `public long longValue()`
- Role: Performs long value.
- Description: Supports the long value operation used by the surrounding class.

#### `public double doubleValue()`
- Role: Performs double value.
- Description: Supports the double value operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static float bits(short bits)`
- Role: Performs bits.
- Description: Supports the bits operation used by the surrounding class.

#### `public static short bits(float f)`
- Role: Performs bits.
- Description: Supports the bits operation used by the surrounding class.
