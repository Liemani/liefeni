---
source: [Transform.java](../../../../src/haven/render/Transform.java)
created: 2026-06-13
updated: 2026-06-14
---

# Transform

Defines the transform render pipeline component.

## Nested Types

### ByMatrix

- Role: Represents by matrix within Transform.
- Description: Describes the nested by matrix type used by the enclosing class.

## Members

### Constants

#### `private static final Pair<Matrix4f, Matrix4f> NONE = new Pair<>(null, null)`
- Role: Defines the shared none constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function<Matrix4f, Matrix4f> nullrot = new Function<Matrix4f, Matrix4f>()`
- Role: Defines the shared nullrot constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Function<Matrix4f, Matrix4f> xf`
- Role: Holds the xf state.
- Description: Backs the cached state for this file.

#### `private Pair<Matrix4f, Matrix4f> last = NONE`
- Role: Holds the last state.
- Description: Backs the cached state for this file.

#### `public final Matrix4f xf`
- Role: Holds the xf state.
- Description: Backs the cached state for this file.

### Methods

#### `public Transform(Function<Matrix4f, Matrix4f> xf)`
- Role: Creates a new Transform instance.
- Description: Constructs the instance and initializes its default state.

#### `public Transform(Matrix4f xf)`
- Role: Creates a new Transform instance.
- Description: Constructs the instance and initializes its default state.

#### `public haven.render.sl.ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public Matrix4f fin(Matrix4f p)`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public ByMatrix(Matrix4f xf)`
- Role: Performs by matrix.
- Description: Supports the by matrix operation used by the surrounding class.

#### `public Matrix4f apply(Matrix4f p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static Matrix4f makexlate(Matrix4f d, Coord3f c)`
- Role: Performs makexlate.
- Description: Supports the makexlate operation used by the surrounding class.

#### `public static Matrix4f makerot(Matrix4f d, Coord3f axis, float s, float c)`
- Role: Performs makerot.
- Description: Supports the makerot operation used by the surrounding class.

#### `public static Matrix4f makerot(Matrix4f d, Coord3f axis, float angle)`
- Role: Performs makerot.
- Description: Supports the makerot operation used by the surrounding class.

#### `public static Matrix4f makescale(Matrix4f d, float x, float y, float z)`
- Role: Performs makescale.
- Description: Supports the makescale operation used by the surrounding class.

#### `public static Matrix4f makescale(Matrix4f d, float s)`
- Role: Performs makescale.
- Description: Supports the makescale operation used by the surrounding class.

#### `public static Matrix4f rxinvert(Matrix4f m)`
- Role: Performs rxinvert.
- Description: Supports the rxinvert operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
