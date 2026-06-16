# IMeter

This file documents the responsibilities and members of `IMeter`.

## Meta

- Source: [IMeter.java](../../../src/haven/IMeter.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the imeter Haven component.

## Nested Types

### $_

- Role: Represents $ within IMeter.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Coord off = UI.scale(22, 7)`
- Role: Defines the shared off constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord fsz = UI.scale(101, 24)`
- Role: Defines the shared fsz constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Coord msz = UI.scale(75, 10)`
- Role: Defines the shared msz constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Indir<Resource> bg`
- Role: Stores the bg value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public IMeter(Indir<Resource> bg, List<Meter> meters)`
- Role: Creates a new IMeter instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public String resourceName()`
- Role: Performs resource name.
- Description: Supports the resource name operation used by the surrounding class.
