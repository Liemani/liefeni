---
source: [Location.java](../../../../../src/haven/render/Location.java)
created: 2026-06-13
updated: 2026-06-14
---

# Location

Defines the location render pipeline component.

## Nested Types

### Chain

- Role: Stores a transform chain.
- Description: Keeps a named location chain for instance-state composition.

## Members

### Constants

#### `public static final Instancer<Chain> instancer = new Instancer<Chain>()`
- Role: Implements the instancer operation.
- Description: Implements the public static final instancer<chain> instancer = new instancer<chain>() operation.
- Value: `new Instancer<Chain>()`

#### `public static final Location nullrot = new Location(Transform.nullrot)`
- Role: Implements the nullrot operation.
- Description: Implements the location operation.
- Value: `new Location(Transform.nullrot)`

#### `public static final Location onlyxl = new Location(Matrix4f.id)`
- Role: Implements the onlyxl operation.
- Description: Implements the location operation.
- Value: `new Location(Matrix4f.id)`

### Fields

#### `public final String id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Location loc`
- Role: Caches the loc value.
- Description: Caches the `loc` value for reuse.

#### `public final Chain p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `private Matrix4f bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

### Methods

#### `public Location(Function<Matrix4f, Matrix4f> xf, String id)`
- Role: Creates a new Location instance.
- Description: Constructs the Location instance from the supplied inputs.

#### `public Location(Matrix4f xf, String id)`
- Role: Creates a new Location instance.
- Description: Constructs the Location instance from the supplied inputs.

#### `public Location(Function<Matrix4f, Matrix4f> xf)`
- Role: Creates a new Location instance.
- Description: Constructs the Location instance from the supplied inputs.

#### `public Location(Matrix4f xf)`
- Role: Creates a new Location instance.
- Description: Constructs the Location instance from the supplied inputs.

#### `private Chain(Location loc, Chain p)`
- Role: Handles the chain path.
- Description: Implements the chain operation.

#### `public Matrix4f fin(Matrix4f o)`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public Chain back(String id)`
- Role: Handles the backing data path.
- Description: Implements the back operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public InstancedAttribute[] attribs()`
- Role: Handles the attribs path.
- Description: Implements the attribs operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Location for debugging and logging.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public static Chain back(Pipe p, String id)`
- Role: Handles the backing data path.
- Description: Implements the back operation.

#### `public static Chain goback(Pipe p, String id)`
- Role: Handles the goback path.
- Description: Implements the goback operation.

#### `public static Pipe.Op goback(String id)`
- Role: Handles the goback path.
- Description: Implements the goback operation.

#### `public static Location xlate(Coord3f c)`
- Role: Handles the xlate path.
- Description: Implements the xlate operation.

#### `public static Location rot(Coord3f axis, float angle)`
- Role: Handles the rot path.
- Description: Implements the rot operation.

#### `public static Location scale(float x, float y, float z)`
- Role: Handles the scale path.
- Description: Implements the scale operation.

#### `public static Location scale(Coord3f c)`
- Role: Handles the scale path.
- Description: Implements the scale operation.

#### `public static Location scale(float s)`
- Role: Handles the scale path.
- Description: Implements the scale operation.