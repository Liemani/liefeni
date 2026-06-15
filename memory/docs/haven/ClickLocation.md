# ClickLocation

This file documents the responsibilities and members of `ClickLocation`.

## Meta

- Source: [ClickLocation.java](../../../src/haven/ClickLocation.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Describes where a click occurred.

## Nested Types

### LocData

- Description: TODO

## Members

### Constants

#### `public static final Slot<ClickLocation> tex = new Slot<>(Slot.Type.SYS, ClickLocation.class)`

- Description: TODO

#### `public static final FragData fragloc = new FragData(Type.VEC2, "fragloc", p -> p.get(tex).image, tex)`

- Description: TODO

#### `public static final Attribute vertex = new Attribute(VEC2, "location")`

- Description: TODO

#### `public static final AutoVarying vertloc = new AutoVarying(VEC2)`

- Description: TODO

#### `private static final ShaderMacro shader = prog -> fragloc(prog.fctx).force()`

- Description: TODO

### Fields

#### `public final T image`

- Description: TODO

### Methods

#### `public ClickLocation(T image)`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public static Value fragloc(FragmentContext fctx)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public LocData(FloatBuffer data)`

- Description: TODO
