# Tex2D

This file documents the responsibilities and members of `Tex2D`.

## Meta

- Source: [Tex2D.java](../../../../src/haven/render/Tex2D.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the tex2 d render pipeline component.

## Members

### Constants

#### `public static final Attribute texc = new Attribute(VEC2, "ctexc")`
- Role: Defines the shared texc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying rtexcoord = new AutoVarying(VEC2, "s_tex2d")`
- Role: Defines the shared rtexcoord constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ShaderMacro mod = prog ->`
- Role: Defines the shared mod constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ShaderMacro clip = prog ->`
- Role: Defines the shared clip constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final ProgramContext prog`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

#### `public Varying.Interpol ipol = Varying.Interpol.NORMAL`
- Role: Stores the ipol value.
- Description: Backs the cached state for this file.

#### `public Uniform tex2d`
- Role: Holds the tex2d state.
- Description: Backs the cached state for this file.

### Methods

#### `public Value texcoord()`
- Role: Performs texcoord.
- Description: Supports the texcoord operation used by the surrounding class.

#### `public Value color()`
- Role: Performs color.
- Description: Supports the color operation used by the surrounding class.

#### `public void tex2d(Uniform.Data<Object> data)`
- Role: Performs tex2d.
- Description: Supports the tex2d operation used by the surrounding class.

#### `public Tex2D(ProgramContext prog)`
- Role: Creates a new Tex2D instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Tex2D get(ProgramContext prog)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.
