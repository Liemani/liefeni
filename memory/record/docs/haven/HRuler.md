---
source: [HRuler.java](../../../../src/haven/HRuler.java)
created: 2026-06-13
updated: 2026-06-14
---

# HRuler

Represents the hruler Haven component.

## Nested Types

### $_

- Role: Registers the `hruler` widget factory.
- Description: Creates a horizontal rule widget from optional width, margin, and color arguments.

## Members

### Constants

#### `public static final Color defcol = new Color(192, 192, 192, 128)`
- Role: Implements the defcol operation.
- Description: Implements the color operation.
- Value: `new Color(192, 192, 192, 128)`

### Fields

#### `public final Coord marg`
- Role: Caches the marg value.
- Description: Caches the `marg` value for reuse.

#### `public final Color color`
- Role: Caches the color value.
- Description: Caches the `color` value for reuse.

### Methods

#### `public HRuler(int w, Coord marg, Color color)`
- Role: Creates a new HRuler instance.
- Description: Constructs the HRuler instance from the supplied inputs.

#### `public HRuler(int w, Coord marg)`
- Role: Creates a new HRuler instance.
- Description: Constructs the HRuler instance from the supplied inputs.

#### `private static Coord defmarg(int w)`
- Role: Handles the defmarg path.
- Description: Implements the defmarg operation.

#### `public HRuler(int w, Color color)`
- Role: Creates a new HRuler instance.
- Description: Constructs the HRuler instance from the supplied inputs.

#### `public HRuler(int w)`
- Role: Creates a new HRuler instance.
- Description: Constructs the HRuler instance from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the HRuler content.