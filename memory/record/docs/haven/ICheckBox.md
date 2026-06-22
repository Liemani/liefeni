---
source: [ICheckBox.java](../../../../src/haven/ICheckBox.java)
created: 2026-06-13
updated: 2026-06-20
---

# ICheckBox

Image-backed checkbox widget with hover and alpha hit testing.

## Nested Types

### `$_`
- Role: Widget factory for the `ichk` resource name.

## Members

### Fields

#### `public final Tex up, down, hoverup, hoverdown`
- Role: Store the textures used for unchecked, checked, and hover states.

#### `private final BufferedImage img`
- Role: Stores the alpha mask used for hit testing when the texture has one.

#### `public boolean h`
- Role: Tracks whether the pointer is currently hovering over the checkbox.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Builds an `ICheckBox` from resource references.

#### `public ICheckBox(Tex up, Tex down, Tex hoverup, Tex hoverdown)`
- Role: Creates a checkbox with explicit textures for each state.

#### `public ICheckBox(Tex up, Tex down, Tex hover)`
- Role: Creates a checkbox using one hover texture for both states.

#### `public ICheckBox(Tex up, Tex down)`
- Role: Creates a checkbox that reuses the normal textures for hover.

#### `public ICheckBox(String base, String up, String down, String hoverup, String hoverdown)`
- Role: Creates a checkbox by loading textures from resource names.

#### `public ICheckBox(String base, String up, String down, String hover)`
- Role: Creates a checkbox by loading textures from resource names.

#### `public ICheckBox(String base, String up, String down)`
- Role: Creates a checkbox by loading the normal textures only.

#### `public void draw(GOut g)`
- Role: Draws the current state image and then the checkbox overlay.

#### `public boolean checkhit(Coord c)`
- Role: Tests whether a mouse position hits the visible checkbox area.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Toggles the checkbox when the left mouse button hits the widget.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Updates hover state from the current mouse position.

