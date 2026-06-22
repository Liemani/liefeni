---
source: [Coord3f.java](../../../../src/haven/Coord3f.java)
created: 2026-06-13
updated: 2026-06-14
---

# Coord3f

Represents a 3D floating-point coordinate.

## Members

### Constants

### Fields

#### `public float x, y, z`
- Role: Caches the z value.
- Description: Caches the `z` value for reuse.

#### `public float x, y, z`
- Role: Caches the z value.
- Description: Caches the `z` value for reuse.

#### `public float x, y, z`
- Role: Caches the z value.
- Description: Caches the `z` value for reuse.

#### `public static Coord3f o = new Coord3f(0, 0, 0)`
- Role: Implements the o operation.
- Description: Implements the coord3f operation.

#### `public static Coord3f xu = of(1, 0, 0)`
- Role: Implements the xu operation.
- Description: Implements the of operation.

#### `public static Coord3f yu = of(0, 1, 0)`
- Role: Implements the yu operation.
- Description: Implements the of operation.

#### `public static Coord3f zu = of(0, 0, 1)`
- Role: Implements the zu operation.
- Description: Implements the of operation.

### Methods

#### `public Coord3f(float x, float y, float z)`
- Role: Creates a new Coord3f instance.
- Description: Constructs the Coord3f instance from the supplied inputs.

#### `public Coord3f(Coord3f c)`
- Role: Creates a new Coord3f instance.
- Description: Constructs the Coord3f instance from the supplied inputs.

#### `public Coord3f(Coord c)`
- Role: Creates a new Coord3f instance.
- Description: Constructs the Coord3f instance from the supplied inputs.

#### `public static Coord3f of(float x, float y, float z)`
- Role: Builds a Coord3f value from the supplied components.
- Description: Builds a Coord3f value from the supplied components.

#### `public static Coord3f of(Coord3f c)`
- Role: Builds a Coord3f value from the supplied components.
- Description: Builds a Coord3f value from the supplied components.

#### `public static Coord3f of(HomoCoord4f c)`
- Role: Builds a Coord3f value from the supplied components.
- Description: Builds a Coord3f value from the supplied components.

#### `public static Coord3f of(Coord c)`
- Role: Builds a Coord3f value from the supplied components.
- Description: Builds a Coord3f value from the supplied components.

#### `public boolean equals(Coord3f o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public Coord3f add(float ax, float ay, float az)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Coord3f add(Coord3f b)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Coord3f sadd(float e, float a, float r)`
- Role: Handles the sadd path.
- Description: Implements the sadd operation.

#### `public Coord3f neg()`
- Role: Handles the neg path.
- Description: Implements the neg operation.

#### `public Coord3f sub(float ax, float ay, float az)`
- Role: Subtracts the supplied value from this Coord3f.
- Description: Subtracts the supplied value from this Coord3f.

#### `public Coord3f sub(Coord3f b)`
- Role: Subtracts the supplied value from this Coord3f.
- Description: Subtracts the supplied value from this Coord3f.

#### `public Coord3f mul(float f)`
- Role: Multiplies this Coord3f by the supplied value.
- Description: Multiplies this Coord3f by the supplied value.

#### `public Coord3f mul(float X, float Y, float Z)`
- Role: Multiplies this Coord3f by the supplied value.
- Description: Multiplies this Coord3f by the supplied value.

#### `public Coord3f mul(Coord3f b)`
- Role: Multiplies this Coord3f by the supplied value.
- Description: Multiplies this Coord3f by the supplied value.

#### `public Coord3f div(float f)`
- Role: Divides this Coord3f by the supplied value.
- Description: Divides this Coord3f by the supplied value.

#### `public Coord3f div(float X, float Y, float Z)`
- Role: Divides this Coord3f by the supplied value.
- Description: Divides this Coord3f by the supplied value.

#### `public Coord3f div(Coord3f b)`
- Role: Divides this Coord3f by the supplied value.
- Description: Divides this Coord3f by the supplied value.

#### `public Coord3f inv()`
- Role: Handles the inv path.
- Description: Implements the inv operation.

#### `public Coord3f invy()`
- Role: Handles the invy path.
- Description: Implements the invy operation.

#### `public float dmul(float X, float Y, float Z)`
- Role: Handles the dmul path.
- Description: Implements the dmul operation.

#### `public float dmul(Coord3f b)`
- Role: Handles the dmul path.
- Description: Implements the dmul operation.

#### `public Coord3f cmul(float X, float Y, float Z)`
- Role: Handles the cmul path.
- Description: Implements the cmul operation.

#### `public Coord3f cmul(Coord3f b)`
- Role: Handles the cmul path.
- Description: Implements the cmul operation.

#### `public Coord3f rot(Coord3f p, float a)`
- Role: Handles the rot path.
- Description: Implements the rot operation.

#### `public float abs()`
- Role: Returns the vector length of this Coord3f.
- Description: Returns the vector length of this Coord3f.

#### `public Coord3f norm()`
- Role: Normalizes this Coord3f to the requested length.
- Description: Normalizes this Coord3f to the requested length.

#### `public float dist(Coord3f o)`
- Role: Computes the distance to another Coord3f.
- Description: Computes the distance to another Coord3f.

#### `public float xyangle(Coord3f o)`
- Role: Handles the xyangle path.
- Description: Implements the xyangle operation.

#### `public float[] to3a()`
- Role: Handles the to3a path.
- Description: Implements the to3a operation.

#### `public float[] to4a(float w)`
- Role: Handles the to4a path.
- Description: Implements the to4a operation.

#### `public Coord round2()`
- Role: Handles the round2 path.
- Description: Implements the round2 operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Coord3f for debugging and logging.