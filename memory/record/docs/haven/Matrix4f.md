---
source: [Matrix4f.java](../../../src/haven/Matrix4f.java)
created: 2026-06-13
updated: 2026-06-14
---

# Matrix4f

Represents the matrix4f Haven component.

## Members

### Constants

#### `public static final Matrix4f id = identity()`
- Role: Defines the shared id constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final float[] m`
- Role: Stores the m value.
- Description: Backs the cached state for this file.

### Methods

#### `public Matrix4f()`
- Role: Creates a new Matrix4f instance.
- Description: Constructs the instance and initializes its default state.

#### `public Matrix4f(Matrix4f b)`
- Role: Creates a new Matrix4f instance.
- Description: Constructs the instance and initializes its default state.

#### `public Matrix4f(float e00, float e01, float e02, float e03, float e10, float e11, float e12, float e13, float e20, float e21, float e22, float e23, float e30, float e31, float e32, float e33)`
- Role: Creates a new Matrix4f instance.
- Description: Constructs the instance and initializes its default state.

#### `public Matrix4f(float[] m)`
- Role: Creates a new Matrix4f instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Matrix4f identity()`
- Role: Performs identity.
- Description: Supports the identity operation used by the surrounding class.

#### `public Matrix4f load(Matrix4f o)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public float get(int x, int y)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void set(int x, int y, float v)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public boolean equals(Matrix4f that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public Matrix4f add(Matrix4f b)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord3f mul4(Coord3f b)`
- Role: Performs mul4.
- Description: Supports the mul4 operation used by the surrounding class.

#### `public float[] mul4(float[] b)`
- Role: Performs mul4.
- Description: Supports the mul4 operation used by the surrounding class.

#### `public HomoCoord4f mul4(HomoCoord4f b)`
- Role: Performs mul4.
- Description: Supports the mul4 operation used by the surrounding class.

#### `public Matrix4f mul(Matrix4f o)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Matrix4f mul1(Matrix4f o)`
- Role: Performs mul1.
- Description: Supports the mul1 operation used by the surrounding class.

#### `public Matrix4f transpose()`
- Role: Performs transpose.
- Description: Supports the transpose operation used by the surrounding class.

#### `public float[] trim3()`
- Role: Performs trim3.
- Description: Supports the trim3 operation used by the surrounding class.

#### `public Matrix4f trim3(float e33)`
- Role: Performs trim3.
- Description: Supports the trim3 operation used by the surrounding class.

#### `public Matrix4f invert()`
- Role: Performs invert.
- Description: Supports the invert operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public String toString2()`
- Role: Performs to string2.
- Description: Supports the to string2 operation used by the surrounding class.
