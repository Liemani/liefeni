---
source: [ResID.java](../../../../src/haven/ResID.java)
created: 2026-06-13
updated: 2026-06-14
---

# ResID

Represents the res id Haven component.

## Nested Types

### ResolveMapper

- Role: Rewrites ResID instances through a resource resolver.
- Description: Function adapter that replaces unresolved resource ids with ids bound to a specific resolver.

## Members

### Constants

### Fields

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Resource.Resolver src`
- Role: Caches the src value.
- Description: Carries the source drag widget.

#### `public final Resource.Resolver rr`
- Role: Caches the rr value.
- Description: Caches the `rr` value for reuse.

### Methods

#### `private ResID(int id, Resource.Resolver src)`
- Role: Creates a new ResID instance.
- Description: Constructs the ResID instance from the supplied inputs.

#### `private ResID(int id)`
- Role: Creates a new ResID instance.
- Description: Constructs the ResID instance from the supplied inputs.

#### `public static ResID of(int id)`
- Role: Builds a ResID value from the supplied components.
- Description: Builds a ResID value from the supplied components.

#### `public ResID src(Resource.Resolver src)`
- Role: Handles the src path.
- Description: Implements the src operation.

#### `public Resource get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public int intValue()`
- Role: Handles the int value path.
- Description: Implements the int value operation.

#### `public byte byteValue()`
- Role: Handles the byte value path.
- Description: Implements the byte value operation.

#### `public short shortValue()`
- Role: Handles the short value path.
- Description: Implements the short value operation.

#### `public long longValue()`
- Role: Handles the long value path.
- Description: Implements the long value operation.

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
- Description: Formats this ResID for debugging and logging.

#### `public ResolveMapper(Resource.Resolver rr)`
- Role: Handles the resolve mapper path.
- Description: Implements the resolve mapper operation.

#### `public Object apply(Object obj)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.