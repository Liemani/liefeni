# Scrollbar

This file documents the responsibilities and members of `Scrollbar`.

## Meta

- Source: [Scrollbar.java](../../../src/haven/Scrollbar.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the scrollbar Haven component.

## Members

### Constants

#### `public static final Tex schain = Resource.loadtex("gfx/hud/schain")`
- Role: Defines the shared schain constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex sflarp = Resource.loadtex("gfx/hud/sflarp")`
- Role: Defines the shared sflarp constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int chcut = UI.scale(7)`
- Role: Defines the shared chcut constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int width = sflarp.sz().x`
- Role: Defines the shared width constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Scrollable ctl`
- Role: Holds the ctl state.
- Description: Backs the cached state for this file.

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

#### `private double acc = 0.5`
- Role: Stores the acc value.
- Description: Backs the cached state for this file.

### Methods

#### `public Scrollbar(int h, int min, int max)`
- Role: Creates a new Scrollbar instance.
- Description: Constructs the instance and initializes its default state.

#### `public Scrollbar(int h, Scrollable ctl)`
- Role: Creates a new Scrollbar instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean vis()`
- Role: Performs vis.
- Description: Supports the vis operation used by the surrounding class.

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

#### `public void ch(int a)`
- Role: Performs ch.
- Description: Supports the ch operation used by the surrounding class.

#### `public void ch(double a)`
- Role: Performs ch.
- Description: Supports the ch operation used by the surrounding class.

#### `public void resize(int h)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void move(Coord c)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.
