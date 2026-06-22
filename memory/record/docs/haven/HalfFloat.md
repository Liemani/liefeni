---
source: [HalfFloat.java](../../../../src/haven/HalfFloat.java)
created: 2026-06-13
updated: 2026-06-14
---

# HalfFloat

Represents the half float Haven component.

## Members

### Constants

### Fields

#### `public final short bits`
- Role: Caches the bits value.
- Description: Caches the `bits` value for reuse.

### Methods

#### `public HalfFloat(short bits)`
- Role: Creates a new HalfFloat instance.
- Description: Constructs the HalfFloat instance from the supplied inputs.

#### `public static HalfFloat decode(short bits)`
- Role: Handles the decode path.
- Description: Implements the decode operation.

#### `public static HalfFloat of(float val)`
- Role: Builds a HalfFloat value from the supplied components.
- Description: Builds a HalfFloat value from the supplied components.

#### `public static HalfFloat of(double val)`
- Role: Builds a HalfFloat value from the supplied components.
- Description: Builds a HalfFloat value from the supplied components.

#### `public boolean equals(HalfFloat that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public float floatValue()`
- Role: Handles the float value path.
- Description: Implements the float value operation.

#### `public byte byteValue()`
- Role: Handles the byte value path.
- Description: Implements the byte value operation.

#### `public short shortValue()`
- Role: Handles the short value path.
- Description: Implements the short value operation.

#### `public int intValue()`
- Role: Handles the int value path.
- Description: Implements the int value operation.

#### `public long longValue()`
- Role: Handles the long value path.
- Description: Implements the long value operation.

#### `public double doubleValue()`
- Role: Handles the double value path.
- Description: Implements the double value operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this HalfFloat for debugging and logging.

#### `public static float bits(short bits)`
- Role: Handles the bits path.
- Description: Implements the bits operation.

#### `public static short bits(float f)`
- Role: Handles the bits path.
- Description: Implements the bits operation.