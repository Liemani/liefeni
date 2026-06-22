---
source: [UID.java](../../../../src/haven/UID.java)
created: 2026-06-13
updated: 2026-06-14
---

# UID

Represents the uid Haven component.

## Members

### Constants

#### `public static final UID nil = new UID(0)`
- Role: Implements the nil operation.
- Description: Implements the uid operation.
- Value: `new UID(0)`

### Fields

#### `public final long bits`
- Role: Caches the bits value.
- Description: Caches the `bits` value for reuse.

### Methods

#### `private UID(long bits)`
- Role: Creates a new UID instance.
- Description: Constructs the UID instance from the supplied inputs.

#### `public static UID of(long bits)`
- Role: Builds a UID value from the supplied components.
- Description: Builds a UID value from the supplied components.

#### `public long longValue()`
- Role: Handles the long value path.
- Description: Implements the long value operation.

#### `public byte byteValue()`
- Role: Handles the byte value path.
- Description: Implements the byte value operation.

#### `public short shortValue()`
- Role: Handles the short value path.
- Description: Implements the short value operation.

#### `public int intValue()`
- Role: Handles the int value path.
- Description: Implements the int value operation.

#### `public float floatValue()`
- Role: Handles the float value path.
- Description: Implements the float value operation.

#### `public double doubleValue()`
- Role: Handles the double value path.
- Description: Implements the double value operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this UID for debugging and logging.