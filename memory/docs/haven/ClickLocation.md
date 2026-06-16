# ClickLocation

This file documents the responsibilities and members of `ClickLocation`.

## Meta

- Source: [ClickLocation.java](../../../src/haven/ClickLocation.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the click location Haven component.

## Nested Types

### LocData

- Role: Represents loc data within ClickLocation.
- Description: Describes the nested loc data type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<ClickLocation> tex = new Slot<>(Slot.Type.SYS, ClickLocation.class)`
- Role: Defines the shared tex constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FragData fragloc = new FragData(Type.VEC2, "fragloc", p -> p.get(tex).image, tex)`
- Role: Defines the shared fragloc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute vertex = new Attribute(VEC2, "location")`
- Role: Defines the shared vertex constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying vertloc = new AutoVarying(VEC2)`
- Role: Defines the shared vertloc constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog -> fragloc(prog.fctx).force()`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final T image`
- Role: Holds the image state.
- Description: Backs the cached state for this file.

### Methods

#### `public ClickLocation(T image)`
- Role: Creates a new ClickLocation instance.
- Description: Constructs the instance and initializes its default state.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static Value fragloc(FragmentContext fctx)`
- Role: Performs fragloc.
- Description: Supports the fragloc operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public LocData(FloatBuffer data)`
- Role: Performs loc data.
- Description: Supports the loc data operation used by the surrounding class.
