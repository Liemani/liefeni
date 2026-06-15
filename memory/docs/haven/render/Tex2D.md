# Tex2D

This file documents the responsibilities and members of `Tex2D`.

## Meta

- Source: [Tex2D.java](../../../../src/haven/render/Tex2D.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a 2D texture.

## Members

### Constants

#### `public static final Attribute texc = new Attribute(VEC2, "ctexc")`

- Description: TODO

#### `public static final AutoVarying rtexcoord = new AutoVarying(VEC2, "s_tex2d")`

- Description: TODO

#### `public static final ShaderMacro mod = prog ->`

- Description: TODO

#### `public static final ShaderMacro clip = prog ->`

- Description: TODO

### Fields

#### `public final ProgramContext prog`

- Description: TODO

#### `public Varying.Interpol ipol = Varying.Interpol.NORMAL`

- Description: TODO

#### `public Uniform tex2d`

- Description: TODO

### Methods

#### `public Value texcoord()`

- Description: TODO

#### `public Value color()`

- Description: TODO

#### `public void tex2d(Uniform.Data<Object> data)`

- Description: TODO

#### `public Tex2D(ProgramContext prog)`

- Description: TODO

#### `public static Tex2D get(ProgramContext prog)`

- Description: TODO
