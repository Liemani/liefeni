# HomoCoord4f

This file documents the responsibilities and members of `HomoCoord4f`.

## Meta

- Source: [HomoCoord4f.java](../../../src/haven/HomoCoord4f.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the homo coord4f Haven component.

## Members

### Constants

### Fields

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public static int NX = 1, PX = 2, NY = 4, PY = 8, NZ = 16, PZ = 32, AX = NX | PX, AY = NY | PY, AZ = NZ | PZ`
- Role: Stores the nx value.
- Description: Backs the cached state for this file.

#### `public float x, y, z, w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public float x, y, z, w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public float x, y, z, w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public float x, y, z, w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

### Methods

#### `public HomoCoord4f(float x, float y, float z, float w)`
- Role: Creates a new HomoCoord4f instance.
- Description: Constructs the instance and initializes its default state.

#### `public static HomoCoord4f of(float x, float y, float z, float w)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static HomoCoord4f of(float x, float y, float z)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static HomoCoord4f of(Coord3f c)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public boolean equals(HomoCoord4f o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static HomoCoord4f fromiclip(Matrix4f iproj, Coord3f cc)`
- Role: Performs fromiclip.
- Description: Supports the fromiclip operation used by the surrounding class.

#### `public static HomoCoord4f fromclip(Matrix4f proj, Coord3f cc)`
- Role: Performs fromclip.
- Description: Supports the fromclip operation used by the surrounding class.

#### `public static HomoCoord4f fromindc(Matrix4f iproj, Coord3f nc)`
- Role: Performs fromindc.
- Description: Supports the fromindc operation used by the surrounding class.

#### `public static HomoCoord4f fromndc(Matrix4f proj, Coord3f nc)`
- Role: Performs fromndc.
- Description: Supports the fromndc operation used by the surrounding class.

#### `public static HomoCoord4f lineclip(HomoCoord4f a, HomoCoord4f b, int planes)`
- Role: Performs lineclip.
- Description: Supports the lineclip operation used by the surrounding class.

#### `public static HomoCoord4f lineclip(HomoCoord4f a, HomoCoord4f b)`
- Role: Performs lineclip.
- Description: Supports the lineclip operation used by the surrounding class.

#### `public boolean clipped(int planes)`
- Role: Performs clipped.
- Description: Supports the clipped operation used by the surrounding class.

#### `public boolean clipped()`
- Role: Performs clipped.
- Description: Supports the clipped operation used by the surrounding class.

#### `public Coord3f pdiv()`
- Role: Performs pdiv.
- Description: Supports the pdiv operation used by the surrounding class.

#### `public Coord3f toview(Area view)`
- Role: Performs toview.
- Description: Supports the toview operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
