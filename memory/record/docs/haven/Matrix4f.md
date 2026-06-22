---
source: [Matrix4f.java](../../../../src/haven/Matrix4f.java)
created: 2026-06-13
updated: 2026-06-14
---

# Matrix4f

Represents the matrix4f Haven component.

## Members

### Constants

#### `public static final Matrix4f id = identity()`
- Role: Implements the id operation.
- Description: Implements the identity operation.
- Value: `identity()`

### Fields

#### `public final float[] m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

### Methods

#### `public Matrix4f()`
- Role: Creates a new Matrix4f instance.
- Description: Constructs the Matrix4f instance from the supplied inputs.

#### `public Matrix4f(Matrix4f b)`
- Role: Creates a new Matrix4f instance.
- Description: Constructs the Matrix4f instance from the supplied inputs.

#### `public Matrix4f(float e00, float e01, float e02, float e03, float e10, float e11, float e12, float e13, float e20, float e21, float e22, float e23, float e30, float e31, float e32, float e33)`
- Role: Creates a new Matrix4f instance.
- Description: Constructs the Matrix4f instance from the supplied inputs.

#### `public Matrix4f(float[] m)`
- Role: Creates a new Matrix4f instance.
- Description: Constructs the Matrix4f instance from the supplied inputs.

#### `public static Matrix4f identity()`
- Role: Handles the identity path.
- Description: Implements the identity operation.

#### `public Matrix4f load(Matrix4f o)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public float get(int x, int y)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void set(int x, int y, float v)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public boolean equals(Matrix4f that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public Matrix4f add(Matrix4f b)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Coord3f mul4(Coord3f b)`
- Role: Handles the mul4 path.
- Description: Implements the mul4 operation.

#### `public float[] mul4(float[] b)`
- Role: Handles the mul4 path.
- Description: Implements the mul4 operation.

#### `public HomoCoord4f mul4(HomoCoord4f b)`
- Role: Handles the mul4 path.
- Description: Implements the mul4 operation.

#### `public Matrix4f mul(Matrix4f o)`
- Role: Multiplies this Matrix4f by the supplied value.
- Description: Multiplies this Matrix4f by the supplied value.

#### `public Matrix4f mul1(Matrix4f o)`
- Role: Handles the mul1 path.
- Description: Implements the mul1 operation.

#### `public Matrix4f transpose()`
- Role: Handles the transpose path.
- Description: Implements the transpose operation.

#### `public float[] trim3()`
- Role: Handles the trim3 path.
- Description: Implements the trim3 operation.

#### `public Matrix4f trim3(float e33)`
- Role: Handles the trim3 path.
- Description: Implements the trim3 operation.

#### `public Matrix4f invert()`
- Role: Handles the invert path.
- Description: Implements the invert operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Matrix4f for debugging and logging.

#### `public String toString2()`
- Role: Handles the to string2 path.
- Description: Implements the to string2 operation.