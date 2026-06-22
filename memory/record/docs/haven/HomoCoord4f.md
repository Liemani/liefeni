---
source: [HomoCoord4f.java](../../../../src/haven/HomoCoord4f.java)
created: 2026-06-13
updated: 2026-06-14
---

# HomoCoord4f

Represents the homo coord4f Haven component.

## Members

### Constants

### Fields

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Caches the nx value.
- Description: Caches the `NX` value for reuse.

#### `public float x, y, z, w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public float x, y, z, w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public float x, y, z, w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public float x, y, z, w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

### Methods

#### `public HomoCoord4f(float x, float y, float z, float w)`
- Role: Creates a new HomoCoord4f instance.
- Description: Constructs the HomoCoord4f instance from the supplied inputs.

#### `public static HomoCoord4f of(float x, float y, float z, float w)`
- Role: Builds a HomoCoord4f value from the supplied components.
- Description: Builds a HomoCoord4f value from the supplied components.

#### `public static HomoCoord4f of(float x, float y, float z)`
- Role: Builds a HomoCoord4f value from the supplied components.
- Description: Builds a HomoCoord4f value from the supplied components.

#### `public static HomoCoord4f of(Coord3f c)`
- Role: Builds a HomoCoord4f value from the supplied components.
- Description: Builds a HomoCoord4f value from the supplied components.

#### `public boolean equals(HomoCoord4f o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static HomoCoord4f fromiclip(Matrix4f iproj, Coord3f cc)`
- Role: Handles the fromiclip path.
- Description: Implements the fromiclip operation.

#### `public static HomoCoord4f fromclip(Matrix4f proj, Coord3f cc)`
- Role: Handles the fromclip path.
- Description: Implements the fromclip operation.

#### `public static HomoCoord4f fromindc(Matrix4f iproj, Coord3f nc)`
- Role: Handles the fromindc path.
- Description: Implements the fromindc operation.

#### `public static HomoCoord4f fromndc(Matrix4f proj, Coord3f nc)`
- Role: Handles the fromndc path.
- Description: Implements the fromndc operation.

#### `public static HomoCoord4f lineclip(HomoCoord4f a, HomoCoord4f b, int planes)`
- Role: Handles the lineclip path.
- Description: Implements the lineclip operation.

#### `public static HomoCoord4f lineclip(HomoCoord4f a, HomoCoord4f b)`
- Role: Handles the lineclip path.
- Description: Implements the lineclip operation.

#### `public boolean clipped(int planes)`
- Role: Handles the clipped path.
- Description: Implements the clipped operation.

#### `public boolean clipped()`
- Role: Handles the clipped path.
- Description: Implements the clipped operation.

#### `public Coord3f pdiv()`
- Role: Handles the pdiv path.
- Description: Implements the pdiv operation.

#### `public Coord3f toview(Area view)`
- Role: Handles the toview path.
- Description: Implements the toview operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this HomoCoord4f for debugging and logging.