---
source: [Scrollbar.java](../../../../src/haven/Scrollbar.java)
created: 2026-06-13
updated: 2026-06-14
---

# Scrollbar

Represents the scrollbar Haven component.

## Members

### Constants

#### `public static final Tex schain = Resource.loadtex("gfx/hud/schain")`
- Role: Implements the schain operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/schain")`

#### `public static final Tex sflarp = Resource.loadtex("gfx/hud/sflarp")`
- Role: Implements the sflarp operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/sflarp")`

#### `public static final int chcut = UI.scale(7)`
- Role: Implements the chcut operation.
- Description: Implements the scale operation.
- Value: `UI.scale(7)`

#### `public static final int width = sflarp.sz().x`
- Role: Implements the width operation.
- Description: Implements the sz operation.
- Value: `sflarp.sz().x`

### Fields

#### `public Scrollable ctl`
- Role: Caches the ctl value.
- Description: Caches the `ctl` value for reuse.

#### `public int val, min, max`
- Role: Caches the max value.
- Description: Caches the `max` value for reuse.

#### `public int val, min, max`
- Role: Caches the max value.
- Description: Caches the `max` value for reuse.

#### `public int val, min, max`
- Role: Caches the max value.
- Description: Caches the `max` value for reuse.

#### `private UI.Grab drag = null`
- Role: Caches the drag value.
- Description: Caches the `drag` value for reuse.

#### `private double acc = 0.5`
- Role: Caches the acc value.
- Description: Caches the `acc` value for reuse.

### Methods

#### `public Scrollbar(int h, int min, int max)`
- Role: Creates a new Scrollbar instance.
- Description: Constructs the Scrollbar instance from the supplied inputs.

#### `public Scrollbar(int h, Scrollable ctl)`
- Role: Creates a new Scrollbar instance.
- Description: Constructs the Scrollbar instance from the supplied inputs.

#### `public boolean vis()`
- Role: Handles the vis path.
- Description: Implements the vis operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Scrollbar content.

#### `private void update(Coord c)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public void changed()`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public void ch(int a)`
- Role: Handles the ch path.
- Description: Implements the ch operation.

#### `public void ch(double a)`
- Role: Handles the ch path.
- Description: Implements the ch operation.

#### `public void resize(int h)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void move(Coord c)`
- Role: Moves the current state.
- Description: Implements the move operation.