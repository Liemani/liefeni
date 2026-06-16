# Coord3f

This file documents the responsibilities and members of `Coord3f`.

## Meta

- Source: [Coord3f.java](../../../src/haven/Coord3f.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a 3D floating-point coordinate.

## Members

### Constants

### Fields

#### `public float x, y, z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public float x, y, z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public float x, y, z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public static Coord3f o = new Coord3f(0, 0, 0)`
- Role: Stores the o value.
- Description: Backs the cached state for this file.

#### `public static Coord3f xu = of(1, 0, 0)`
- Role: Stores the xu value.
- Description: Backs the cached state for this file.

#### `public static Coord3f yu = of(0, 1, 0)`
- Role: Stores the yu value.
- Description: Backs the cached state for this file.

#### `public static Coord3f zu = of(0, 0, 1)`
- Role: Stores the zu value.
- Description: Backs the cached state for this file.

### Methods

#### `public Coord3f(float x, float y, float z)`
- Role: Creates a new Coord3f instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord3f(Coord3f c)`
- Role: Creates a new Coord3f instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord3f(Coord c)`
- Role: Creates a new Coord3f instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Coord3f of(float x, float y, float z)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord3f of(Coord3f c)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord3f of(HomoCoord4f c)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord3f of(Coord c)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public boolean equals(Coord3f o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public Coord3f add(float ax, float ay, float az)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord3f add(Coord3f b)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord3f sadd(float e, float a, float r)`
- Role: Performs sadd.
- Description: Supports the sadd operation used by the surrounding class.

#### `public Coord3f neg()`
- Role: Performs neg.
- Description: Supports the neg operation used by the surrounding class.

#### `public Coord3f sub(float ax, float ay, float az)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public Coord3f sub(Coord3f b)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public Coord3f mul(float f)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord3f mul(float X, float Y, float Z)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord3f mul(Coord3f b)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord3f div(float f)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public Coord3f div(float X, float Y, float Z)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public Coord3f div(Coord3f b)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public Coord3f inv()`
- Role: Performs inv.
- Description: Supports the inv operation used by the surrounding class.

#### `public Coord3f invy()`
- Role: Performs invy.
- Description: Supports the invy operation used by the surrounding class.

#### `public float dmul(float X, float Y, float Z)`
- Role: Performs dmul.
- Description: Supports the dmul operation used by the surrounding class.

#### `public float dmul(Coord3f b)`
- Role: Performs dmul.
- Description: Supports the dmul operation used by the surrounding class.

#### `public Coord3f cmul(float X, float Y, float Z)`
- Role: Performs cmul.
- Description: Supports the cmul operation used by the surrounding class.

#### `public Coord3f cmul(Coord3f b)`
- Role: Performs cmul.
- Description: Supports the cmul operation used by the surrounding class.

#### `public Coord3f rot(Coord3f p, float a)`
- Role: Performs rot.
- Description: Supports the rot operation used by the surrounding class.

#### `public float abs()`
- Role: Performs abs.
- Description: Supports the abs operation used by the surrounding class.

#### `public Coord3f norm()`
- Role: Performs norm.
- Description: Supports the norm operation used by the surrounding class.

#### `public float dist(Coord3f o)`
- Role: Performs dist.
- Description: Supports the dist operation used by the surrounding class.

#### `public float xyangle(Coord3f o)`
- Role: Performs xyangle.
- Description: Supports the xyangle operation used by the surrounding class.

#### `public float[] to3a()`
- Role: Performs to3a.
- Description: Supports the to3a operation used by the surrounding class.

#### `public float[] to4a(float w)`
- Role: Performs to4a.
- Description: Supports the to4a operation used by the surrounding class.

#### `public Coord round2()`
- Role: Performs round2.
- Description: Supports the round2 operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
