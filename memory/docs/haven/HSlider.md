# HSlider

This file documents the responsibilities and members of `HSlider`.

## Meta

- Source: [HSlider.java](../../../src/haven/HSlider.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the hslider Haven component.

## Members

### Constants

#### `static final Tex sflarp = Resource.loadtex("gfx/hud/sflarp")`
- Role: Defines the shared sflarp constant.
- Description: Shared constant used by the rest of the class.

#### `static final Tex schain`
- Role: Defines the shared schain constant.
- Description: Shared constant used by the rest of the class.

#### `static final int chcut = UI.scale(7)`
- Role: Defines the shared chcut constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public int val, min, max`
- Role: Stores the max value.
- Description: Backs the cached state for this file.

#### `public int val, min, max`
- Role: Stores the max value.
- Description: Backs the cached state for this file.

#### `public int val, min, max`
- Role: Stores the max value.
- Description: Backs the cached state for this file.

#### `private UI.Grab drag = null`
- Role: Stores the drag value.
- Description: Backs the cached state for this file.

### Methods

#### `public HSlider(int w, int min, int max, int val)`
- Role: Creates a new HSlider instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private void update(Coord c)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public void changed()`
- Role: Performs changed.
- Description: Supports the changed operation used by the surrounding class.

#### `public void fchanged()`
- Role: Performs fchanged.
- Description: Supports the fchanged operation used by the surrounding class.

#### `public void resize(int w)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.
