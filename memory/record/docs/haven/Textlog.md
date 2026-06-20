---
source: [Textlog.java](../../../src/haven/Textlog.java)
created: 2026-06-13
updated: 2026-06-14
---

# Textlog

Represents the textlog Haven component.

## Nested Types

### $_

- Role: Represents $ within Textlog.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

### Fields

#### `static Tex texpap = Resource.loadtex("gfx/hud/texpap")`
- Role: Stores the texpap value.
- Description: Backs the cached state for this file.

#### `static Tex schain = Resource.loadtex("gfx/hud/schain")`
- Role: Stores the schain value.
- Description: Backs the cached state for this file.

#### `static Tex sflarp = Resource.loadtex("gfx/hud/sflarp")`
- Role: Stores the sflarp value.
- Description: Backs the cached state for this file.

#### `static RichText.Foundry fnd = new RichText.Foundry(TextAttribute.FAMILY, "SansSerif", TextAttribute.SIZE, UI.scale(9f), TextAttribute.FOREGROUND, Color.BLACK)`
- Role: Stores the fnd value.
- Description: Backs the cached state for this file.

#### `List<Text> lines`
- Role: Caches lines entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `int maxy, cury`
- Role: Stores the cury value.
- Description: Backs the cached state for this file.

#### `int maxy, cury`
- Role: Stores the cury value.
- Description: Backs the cached state for this file.

#### `int margin = UI.scale(3)`
- Role: Stores the margin value.
- Description: Backs the cached state for this file.

#### `UI.Grab sdrag = null`
- Role: Stores the sdrag value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Textlog(Coord sz)`
- Role: Creates a new Textlog instance.
- Description: Constructs the instance and initializes its default state.

#### `public void append(String line, Color col)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public void append(String line)`
- Role: Performs append.
- Description: Supports the append operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

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
