---
source: [Tex2D.java](../../../../../src/haven/render/Tex2D.java)
created: 2026-06-13
updated: 2026-06-14
---

# Tex2D

Defines the tex2 d render pipeline component.

## Members

### Constants

#### `public static final Attribute texc = new Attribute(VEC2, "ctexc")`
- Role: Implements the texc operation.
- Description: Implements the attribute operation.
- Value: `new Attribute(VEC2, "ctexc")`

#### `public static final AutoVarying rtexcoord = new AutoVarying(VEC2, "s_tex2d")`
- Role: Implements the rtexcoord operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC2, "s_tex2d")`

#### `public static final ShaderMacro mod = prog ->`
- Role: Caches the mod value.
- Description: Caches the `mod` value for reuse.
- Value: `prog ->`

#### `public static final ShaderMacro clip = prog ->`
- Role: Caches the clip value.
- Description: Caches the `clip` value for reuse.
- Value: `prog ->`

### Fields

#### `public final ProgramContext prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `public Varying.Interpol ipol = Varying.Interpol.NORMAL`
- Role: Caches the ipol value.
- Description: Caches the `ipol` value for reuse.

#### `public Uniform tex2d`
- Role: Caches the tex2d value.
- Description: Caches the `tex2d` value for reuse.

### Methods

#### `public Value texcoord()`
- Role: Implements the texcoord operation.
- Description: Implements the texcoord operation.

#### `public Value color()`
- Role: Implements the color operation.
- Description: Implements the color operation.

#### `public void tex2d(Uniform.Data<Object> data)`
- Role: Installs 2D texture state.
- Description: Writes the texture binding into the current program context.

#### `public Tex2D(ProgramContext prog)`
- Role: Creates one 2D texture helper.
- Description: Binds the helper to a shader program context.

#### `public static Tex2D get(ProgramContext prog)`
- Role: Returns the 2D texture helper.
- Description: Reuses the helper attached to the given program context.