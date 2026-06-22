---
source: [HSlider.java](../../../../src/haven/HSlider.java)
created: 2026-06-13
updated: 2026-06-14
---

# HSlider

Represents the hslider Haven component.

## Members

### Constants

#### `static final Tex sflarp = Resource.loadtex("gfx/hud/sflarp")`
- Role: Implements the sflarp operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/sflarp")`

#### `static final Tex schain`
#### `static final Tex schain`
- Role: Caches the schain value.
- Description: Caches the `schain` value for reuse.

#### `static final int chcut = UI.scale(7)`
- Role: Implements the chcut operation.
- Description: Implements the scale operation.
- Value: `UI.scale(7)`

### Fields

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

### Methods

#### `public HSlider(int w, int min, int max, int val)`
- Role: Creates a new HSlider instance.
- Description: Constructs the HSlider instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the HSlider content.

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

#### `public void fchanged()`
- Role: Handles the fchanged path.
- Description: Implements the fchanged operation.

#### `public void resize(int w)`
- Role: Handles the resize path.
- Description: Implements the resize operation.