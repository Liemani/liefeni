# Type

This file documents the responsibilities and members of `Type`.

## Meta

- Source: [Type.java](../../../../../src/haven/render/sl/Type.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a shader type.

## Nested Types

### Sampler

- Description: TODO

### Simple

- Description: TODO

## Members

### Constants

#### `public static final Type VOID = new Simple("void")`

- Description: TODO

#### `public static final Type INT = new Simple("int")`

- Description: TODO

#### `public static final Type UINT = new Simple("uint")`

- Description: TODO

#### `public static final Type FLOAT = new Simple("float")`

- Description: TODO

#### `public static final Type VEC2 = new Simple("vec2")`

- Description: TODO

#### `public static final Type VEC3 = new Simple("vec3")`

- Description: TODO

#### `public static final Type VEC4 = new Simple("vec4")`

- Description: TODO

#### `public static final Type IVEC2 = new Simple("ivec2")`

- Description: TODO

#### `public static final Type IVEC3 = new Simple("ivec3")`

- Description: TODO

#### `public static final Type IVEC4 = new Simple("ivec4")`

- Description: TODO

#### `public static final Type UVEC2 = new Simple("uvec2")`

- Description: TODO

#### `public static final Type UVEC3 = new Simple("uvec3")`

- Description: TODO

#### `public static final Type UVEC4 = new Simple("uvec4")`

- Description: TODO

#### `public static final Type MAT3 = new Simple("mat3")`

- Description: TODO

#### `public static final Type MAT4 = new Simple("mat4")`

- Description: TODO

#### `public static final Type SAMPLER1D = new Sampler("sampler1D")`

- Description: TODO

#### `public static final Type SAMPLER1DARRAY = new Sampler("sampler1DArray")`

- Description: TODO

#### `public static final Type SAMPLER2D = new Sampler("sampler2D")`

- Description: TODO

#### `public static final Type SAMPLER2DARRAY = new Sampler("sampler2DArray")`

- Description: TODO

#### `public static final Type SAMPLER2DMS = new Sampler("sampler2DMS")`

- Description: TODO

#### `public static final Type SAMPLER2DMSARRAY = new Sampler("sampler2DMSArray")`

- Description: TODO

#### `public static final Type SAMPLER3D = new Sampler("sampler3D")`

- Description: TODO

#### `public static final Type SAMPLERCUBE = new Sampler("samplerCube")`

- Description: TODO

#### `public static final Type SAMPLERCUBEARRAY = new Sampler("samplerCubeArray")`

- Description: TODO

#### `public static final Type SAMPLERBUFFER = new Sampler("samplerBuffer")`

- Description: TODO

#### `public static final Type ISAMPLER1D = new Sampler("isampler1D")`

- Description: TODO

#### `public static final Type ISAMPLER1DARRAY = new Sampler("isampler1DArray")`

- Description: TODO

#### `public static final Type ISAMPLER2D = new Sampler("isampler2D")`

- Description: TODO

#### `public static final Type ISAMPLER2DARRAY = new Sampler("isampler2DArray")`

- Description: TODO

#### `public static final Type ISAMPLER2DMS = new Sampler("isampler2DMS")`

- Description: TODO

#### `public static final Type ISAMPLER2DMSARRAY = new Sampler("isampler2DMSArray")`

- Description: TODO

#### `public static final Type ISAMPLER3D = new Sampler("isampler3D")`

- Description: TODO

#### `public static final Type ISAMPLERCUBE = new Sampler("isamplerCube")`

- Description: TODO

#### `public static final Type ISAMPLERCUBEARRAY = new Sampler("isamplerCubeArray")`

- Description: TODO

#### `public static final Type ISAMPLERBUFFER = new Sampler("isamplerBuffer")`

- Description: TODO

#### `public static final Type USAMPLER1D = new Sampler("usampler1D")`

- Description: TODO

#### `public static final Type USAMPLER1DARRAY = new Sampler("usampler1DArray")`

- Description: TODO

#### `public static final Type USAMPLER2D = new Sampler("usampler2D")`

- Description: TODO

#### `public static final Type USAMPLER2DARRAY = new Sampler("usampler2DArray")`

- Description: TODO

#### `public static final Type USAMPLER2DMS = new Sampler("usampler2DMS")`

- Description: TODO

#### `public static final Type USAMPLER2DMSARRAY = new Sampler("usampler2DMSArray")`

- Description: TODO

#### `public static final Type USAMPLER3D = new Sampler("usampler3D")`

- Description: TODO

#### `public static final Type USAMPLERCUBE = new Sampler("usamplerCube")`

- Description: TODO

#### `public static final Type USAMPLERCUBEARRAY = new Sampler("usamplerCubeArray")`

- Description: TODO

#### `public static final Type USAMPLERBUFFER = new Sampler("usamplerBuffer")`

- Description: TODO

#### `public static final Type SAMPLER2DSHADOW = new Sampler("sampler2DShadow")`

- Description: TODO

#### `public static final Type SAMPLERCUBESHADOW = new Sampler("samplerCubeShadow")`

- Description: TODO

### Fields

#### `private final String name`

- Description: TODO

### Methods

#### `private Simple(String name)`

- Description: TODO

#### `public String name(Context ctx)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private Sampler(String name)`

- Description: TODO

#### `public abstract String name(Context ctx)`

- Description: TODO

#### `public void use(Context ctx)`

- Description: TODO
