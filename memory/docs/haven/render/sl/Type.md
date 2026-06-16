# Type

This file documents the responsibilities and members of `Type`.

## Meta

- Source: [Type.java](../../../../../src/haven/render/sl/Type.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the type shader-language AST node.

## Nested Types

### Sampler

- Role: Represents sampler within Type.
- Description: Describes the nested sampler type used by the enclosing class.

### Simple

- Role: Represents simple within Type.
- Description: Describes the nested simple type used by the enclosing class.

## Members

### Constants

#### `public static final Type VOID = new Simple("void")`
- Role: Defines the shared void constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type INT = new Simple("int")`
- Role: Defines the shared int constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type UINT = new Simple("uint")`
- Role: Defines the shared uint constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type FLOAT = new Simple("float")`
- Role: Defines the shared float constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type VEC2 = new Simple("vec2")`
- Role: Defines the shared vec2 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type VEC3 = new Simple("vec3")`
- Role: Defines the shared vec3 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type VEC4 = new Simple("vec4")`
- Role: Defines the shared vec4 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type IVEC2 = new Simple("ivec2")`
- Role: Defines the shared ivec2 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type IVEC3 = new Simple("ivec3")`
- Role: Defines the shared ivec3 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type IVEC4 = new Simple("ivec4")`
- Role: Defines the shared ivec4 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type UVEC2 = new Simple("uvec2")`
- Role: Defines the shared uvec2 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type UVEC3 = new Simple("uvec3")`
- Role: Defines the shared uvec3 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type UVEC4 = new Simple("uvec4")`
- Role: Defines the shared uvec4 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type MAT3 = new Simple("mat3")`
- Role: Defines the shared mat3 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type MAT4 = new Simple("mat4")`
- Role: Defines the shared mat4 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLER1D = new Sampler("sampler1D")`
- Role: Defines the shared sampler1 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLER1DARRAY = new Sampler("sampler1DArray")`
- Role: Defines the shared sampler1 darray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLER2D = new Sampler("sampler2D")`
- Role: Defines the shared sampler2 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLER2DARRAY = new Sampler("sampler2DArray")`
- Role: Defines the shared sampler2 darray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLER2DMS = new Sampler("sampler2DMS")`
- Role: Defines the shared sampler2 dms constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLER2DMSARRAY = new Sampler("sampler2DMSArray")`
- Role: Defines the shared sampler2 dmsarray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLER3D = new Sampler("sampler3D")`
- Role: Defines the shared sampler3 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLERCUBE = new Sampler("samplerCube")`
- Role: Defines the shared samplercube constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLERCUBEARRAY = new Sampler("samplerCubeArray")`
- Role: Defines the shared samplercubearray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLERBUFFER = new Sampler("samplerBuffer")`
- Role: Defines the shared samplerbuffer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLER1D = new Sampler("isampler1D")`
- Role: Defines the shared isampler1 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLER1DARRAY = new Sampler("isampler1DArray")`
- Role: Defines the shared isampler1 darray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLER2D = new Sampler("isampler2D")`
- Role: Defines the shared isampler2 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLER2DARRAY = new Sampler("isampler2DArray")`
- Role: Defines the shared isampler2 darray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLER2DMS = new Sampler("isampler2DMS")`
- Role: Defines the shared isampler2 dms constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLER2DMSARRAY = new Sampler("isampler2DMSArray")`
- Role: Defines the shared isampler2 dmsarray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLER3D = new Sampler("isampler3D")`
- Role: Defines the shared isampler3 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLERCUBE = new Sampler("isamplerCube")`
- Role: Defines the shared isamplercube constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLERCUBEARRAY = new Sampler("isamplerCubeArray")`
- Role: Defines the shared isamplercubearray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type ISAMPLERBUFFER = new Sampler("isamplerBuffer")`
- Role: Defines the shared isamplerbuffer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLER1D = new Sampler("usampler1D")`
- Role: Defines the shared usampler1 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLER1DARRAY = new Sampler("usampler1DArray")`
- Role: Defines the shared usampler1 darray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLER2D = new Sampler("usampler2D")`
- Role: Defines the shared usampler2 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLER2DARRAY = new Sampler("usampler2DArray")`
- Role: Defines the shared usampler2 darray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLER2DMS = new Sampler("usampler2DMS")`
- Role: Defines the shared usampler2 dms constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLER2DMSARRAY = new Sampler("usampler2DMSArray")`
- Role: Defines the shared usampler2 dmsarray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLER3D = new Sampler("usampler3D")`
- Role: Defines the shared usampler3 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLERCUBE = new Sampler("usamplerCube")`
- Role: Defines the shared usamplercube constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLERCUBEARRAY = new Sampler("usamplerCubeArray")`
- Role: Defines the shared usamplercubearray constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type USAMPLERBUFFER = new Sampler("usamplerBuffer")`
- Role: Defines the shared usamplerbuffer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLER2DSHADOW = new Sampler("sampler2DShadow")`
- Role: Defines the shared sampler2 dshadow constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Type SAMPLERCUBESHADOW = new Sampler("samplerCubeShadow")`
- Role: Defines the shared samplercubeshadow constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

### Methods

#### `private Simple(String name)`
- Role: Performs simple.
- Description: Supports the simple operation used by the surrounding class.

#### `public String name(Context ctx)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private Sampler(String name)`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public abstract String name(Context ctx)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.
