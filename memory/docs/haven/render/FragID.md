# FragID

This file documents the responsibilities and members of `FragID`.

## Meta

- Source: [FragID.java](../../../../src/haven/render/FragID.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a fragment identifier.

## Nested Types

### ID

- Description: TODO

## Members

### Constants

#### `public static final Slot<FragID> tex = new Slot<>(Slot.Type.SYS, FragID.class)`

- Description: TODO

#### `public static final Slot<ID> id = new Slot<>(Slot.Type.DRAW, ID.class)`

- Description: TODO

#### `public static final FragData fragid = new FragData(Type.INT, "fragid", p -> p.get(tex).image, tex)`

- Description: TODO

#### `private static final InstancedUniform uid = new InstancedUniform.Int("id", p ->`

- Description: TODO

#### `static final Instancer<ID> instancer = new Instancer<ID>()`

- Description: TODO

#### `public static final AutoVarying transfer = new AutoVarying(Type.INT)`

- Description: TODO

#### `private static final ShaderMacro shader = prog -> fragid(prog.fctx).force()`

- Description: TODO

### Fields

#### `public final T image`

- Description: TODO

#### `public final int val`

- Description: TODO

### Methods

#### `public FragID(T image)`

- Description: TODO

#### `public ID(int val)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public InstancedAttribute[] attribs()`

- Description: TODO

#### `public static Value fragid(FragmentContext fctx)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO
