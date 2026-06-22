---
source: [Transform.java](../../../../../src/haven/render/Transform.java)
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
- Role: Implements the none operation.
- Description: Implements the private static final pair<matrix4f, matrix4f> none = new pair<>(null, null) operation.
- Value: `new Pair<>(null, null)`

#### `public static final Function<Matrix4f, Matrix4f> nullrot = new Function<Matrix4f, Matrix4f>()`
- Role: Implements the nullrot operation.
- Description: Implements the public static final function<matrix4f, matrix4f> nullrot = new function<matrix4f, matrix4f>() operation.
- Value: `new Function<Matrix4f, Matrix4f>()`

### Fields

#### `private final Function<Matrix4f, Matrix4f> xf`
- Role: Caches the xf value.
- Description: Caches the `xf` value for reuse.

#### `private Pair<Matrix4f, Matrix4f> last = NONE`
- Role: Caches the last .
- Description: Caches the last  value.

#### `public final Matrix4f xf`
- Role: Caches the xf value.
- Description: Caches the `xf` value for reuse.

### Methods

#### `public Transform(Function<Matrix4f, Matrix4f> xf)`
- Role: Creates a new Transform instance.
- Description: Constructs the Transform instance from the supplied inputs.

#### `public Transform(Matrix4f xf)`
- Role: Creates a new Transform instance.
- Description: Constructs the Transform instance from the supplied inputs.

#### `public haven.render.sl.ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public Matrix4f fin(Matrix4f p)`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public ByMatrix(Matrix4f xf)`
- Role: Handles the by matrix path.
- Description: Implements the by matrix operation.

#### `public Matrix4f apply(Matrix4f p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Transform for debugging and logging.

#### `public static Matrix4f makexlate(Matrix4f d, Coord3f c)`
- Role: Handles the makexlate path.
- Description: Implements the makexlate operation.

#### `public static Matrix4f makerot(Matrix4f d, Coord3f axis, float s, float c)`
- Role: Handles the makerot path.
- Description: Implements the makerot operation.

#### `public static Matrix4f makerot(Matrix4f d, Coord3f axis, float angle)`
- Role: Handles the makerot path.
- Description: Implements the makerot operation.

#### `public static Matrix4f makescale(Matrix4f d, float x, float y, float z)`
- Role: Handles the makescale path.
- Description: Implements the makescale operation.

#### `public static Matrix4f makescale(Matrix4f d, float s)`
- Role: Handles the makescale path.
- Description: Implements the makescale operation.

#### `public static Matrix4f rxinvert(Matrix4f m)`
- Role: Handles the rxinvert path.
- Description: Implements the rxinvert operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Transform for debugging and logging.