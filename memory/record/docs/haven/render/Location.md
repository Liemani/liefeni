---
source: [Location.java](../../../../src/haven/render/Location.java)
created: 2026-06-13
updated: 2026-06-14
---

# Location

Defines the location render pipeline component.

## Nested Types

### Chain

- Role: Represents chain within Location.
- Description: Describes the nested chain type used by the enclosing class.

## Members

### Constants

#### `public static final Instancer<Chain> instancer = new Instancer<Chain>()`
- Role: Defines the shared instancer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Location nullrot = new Location(Transform.nullrot)`
- Role: Defines the shared nullrot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Location onlyxl = new Location(Matrix4f.id)`
- Role: Defines the shared onlyxl constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Location loc`
- Role: Holds the loc state.
- Description: Backs the cached state for this file.

#### `public final Chain p`
- Role: Holds the p state.
- Description: Backs the cached state for this file.

#### `private Matrix4f bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

### Methods

#### `public Location(Function<Matrix4f, Matrix4f> xf, String id)`
- Role: Creates a new Location instance.
- Description: Constructs the instance and initializes its default state.

#### `public Location(Matrix4f xf, String id)`
- Role: Creates a new Location instance.
- Description: Constructs the instance and initializes its default state.

#### `public Location(Function<Matrix4f, Matrix4f> xf)`
- Role: Creates a new Location instance.
- Description: Constructs the instance and initializes its default state.

#### `public Location(Matrix4f xf)`
- Role: Creates a new Location instance.
- Description: Constructs the instance and initializes its default state.

#### `private Chain(Location loc, Chain p)`
- Role: Performs chain.
- Description: Supports the chain operation used by the surrounding class.

#### `public Matrix4f fin(Matrix4f o)`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public Chain back(String id)`
- Role: Performs back.
- Description: Supports the back operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public InstancedAttribute[] attribs()`
- Role: Performs attribs.
- Description: Supports the attribs operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static Chain back(Pipe p, String id)`
- Role: Performs back.
- Description: Supports the back operation used by the surrounding class.

#### `public static Chain goback(Pipe p, String id)`
- Role: Performs goback.
- Description: Supports the goback operation used by the surrounding class.

#### `public static Pipe.Op goback(String id)`
- Role: Performs goback.
- Description: Supports the goback operation used by the surrounding class.

#### `public static Location xlate(Coord3f c)`
- Role: Performs xlate.
- Description: Supports the xlate operation used by the surrounding class.

#### `public static Location rot(Coord3f axis, float angle)`
- Role: Performs rot.
- Description: Supports the rot operation used by the surrounding class.

#### `public static Location scale(float x, float y, float z)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static Location scale(Coord3f c)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.

#### `public static Location scale(float s)`
- Role: Performs scale.
- Description: Supports the scale operation used by the surrounding class.
