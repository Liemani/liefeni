---
source: [IMeter.java](../../../../src/haven/IMeter.java)
created: 2026-06-13
updated: 2026-06-14
---

# IMeter

Represents the imeter Haven component.

## Nested Types

### $_

- Role: Registers the inventory meter widget resource.
- Description: Factory that creates an IMeter from a meter background resource and meter list.

## Members

### Constants

#### `public static final Coord off = UI.scale(22, 7)`
- Role: Implements the off operation.
- Description: Implements the scale operation.
- Value: `UI.scale(22, 7)`

#### `public static final Coord fsz = UI.scale(101, 24)`
- Role: Implements the fsz operation.
- Description: Implements the scale operation.
- Value: `UI.scale(101, 24)`

#### `public static final Coord msz = UI.scale(75, 10)`
- Role: Implements the msz operation.
- Description: Implements the scale operation.
- Value: `UI.scale(75, 10)`

### Fields

#### `public final Indir<Resource> bg`
- Role: Caches the bg value.
- Description: Caches the `bg` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public IMeter(Indir<Resource> bg, List<Meter> meters)`
- Role: Creates a new IMeter instance.
- Description: Constructs the IMeter instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the IMeter content.

#### `public String resourceName()`
- Role: Handles the resource name path.
- Description: Implements the resource name operation.