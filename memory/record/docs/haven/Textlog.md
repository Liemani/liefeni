---
source: [Textlog.java](../../../../src/haven/Textlog.java)
created: 2026-06-13
updated: 2026-06-14
---

# Textlog

Represents the textlog Haven component.

## Nested Types

### $_

- Role: Registers the `textlog` widget factory.
- Description: Creates the scrolling text log widget from resource arguments.

## Members

### Constants

### Fields

#### `static Tex texpap = Resource.loadtex("gfx/hud/texpap")`
- Role: Implements the texpap operation.
- Description: Implements the loadtex operation.

#### `static Tex schain = Resource.loadtex("gfx/hud/schain")`
- Role: Implements the schain operation.
- Description: Implements the loadtex operation.

#### `static Tex sflarp = Resource.loadtex("gfx/hud/sflarp")`
- Role: Implements the sflarp operation.
- Description: Implements the loadtex operation.

#### `static RichText.Foundry fnd = new RichText.Foundry(TextAttribute.FAMILY, "SansSerif", TextAttribute.SIZE, UI.scale(9f), TextAttribute.FOREGROUND, Color.BLACK)`
- Role: Implements the fnd operation.
- Description: Implements the scale operation.

#### `List<Text> lines`
- Role: Caches the lines value.
- Description: Caches the `lines` value for reuse.

#### `int maxy, cury`
- Role: Caches the cury value.
- Description: Caches the `cury` value for reuse.

#### `int maxy, cury`
- Role: Caches the cury value.
- Description: Caches the `cury` value for reuse.

#### `int margin = UI.scale(3)`
- Role: Implements the margin operation.
- Description: Implements the scale operation.

#### `UI.Grab sdrag = null`
- Role: Caches the sdrag value.
- Description: Caches the `sdrag` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Textlog content.

#### `public Textlog(Coord sz)`
- Role: Creates a new Textlog instance.
- Description: Constructs the Textlog instance from the supplied inputs.

#### `public void append(String line, Color col)`
- Role: Handles the append path.
- Description: Implements the append operation.

#### `public void append(String line)`
- Role: Handles the append path.
- Description: Implements the append operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

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