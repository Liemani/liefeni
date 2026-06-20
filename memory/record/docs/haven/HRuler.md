---
source: [HRuler.java](../../../src/haven/HRuler.java)
created: 2026-06-13
updated: 2026-06-14
---

# HRuler

Represents the hruler Haven component.

## Nested Types

### $_

- Role: Represents $ within HRuler.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

#### `public static final Color defcol = new Color(192, 192, 192, 128)`
- Role: Defines the shared defcol constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Coord marg`
- Role: Stores the marg value.
- Description: Backs the cached state for this file.

#### `public final Color color`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

### Methods

#### `public HRuler(int w, Coord marg, Color color)`
- Role: Creates a new HRuler instance.
- Description: Constructs the instance and initializes its default state.

#### `public HRuler(int w, Coord marg)`
- Role: Creates a new HRuler instance.
- Description: Constructs the instance and initializes its default state.

#### `private static Coord defmarg(int w)`
- Role: Performs defmarg.
- Description: Supports the defmarg operation used by the surrounding class.

#### `public HRuler(int w, Color color)`
- Role: Creates a new HRuler instance.
- Description: Constructs the instance and initializes its default state.

#### `public HRuler(int w)`
- Role: Creates a new HRuler instance.
- Description: Constructs the instance and initializes its default state.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.
