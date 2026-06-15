# Outlines

This file documents the responsibilities and members of `Outlines`.

## Meta

- Source: [Outlines.java](../../../src/haven/Outlines.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides outline rendering support.

## Nested Types

### Draw

- Description: TODO

## Members

### Constants

### Fields

#### `private boolean symmetric`

- Description: TODO

#### `private final static Uniform snrm = new Uniform(SAMPLER2D, p -> ((Draw)p.get(RUtils.adhoc)).nrm, RUtils.adhoc)`

- Description: TODO

#### `private final static Uniform sdep = new Uniform(SAMPLER2D, p -> ((Draw)p.get(RUtils.adhoc)).depth, RUtils.adhoc)`

- Description: TODO

#### `private final static Uniform msnrm = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).nrm, RUtils.adhoc)`

- Description: TODO

#### `private final static Uniform msdep = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).depth, RUtils.adhoc)`

- Description: TODO

#### `private final static ShaderMacro[] shaders = new ShaderMacro[4]`

- Description: TODO

#### `final Texture2D.Sampler2D nrm, depth`

- Description: TODO

#### `final Texture2D.Sampler2D nrm, depth`

- Description: TODO

### Methods

#### `Draw(ShaderMacro code, Texture2D.Sampler2D nrm, Texture2D.Sampler2D depth)`

- Description: TODO

#### `private static ShaderMacro shader(final boolean symmetric, final boolean ms)`

- Description: TODO

#### `public Outlines(boolean symmetric)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO
