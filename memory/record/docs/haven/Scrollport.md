---
source: [Scrollport.java](../../../../src/haven/Scrollport.java)
created: 2026-06-13
updated: 2026-06-14
---

# Scrollport

Represents the scrollport Haven component.

## Nested Types

### $_

- Role: Registers the scrollport widget resource.
- Description: Factory that creates a Scrollport from the requested size.

### Scrollcont

- Role: Hosts the scrollable content area.
- Description: Inner widget that applies the vertical scroll offset and clips children to the visible area.

## Members

### Constants

### Fields

#### `public final Scrollbar bar`
- Role: Caches the bar value.
- Description: Caches the `bar` value for reuse.

#### `public final Scrollcont cont`
- Role: Caches the cont value.
- Description: Caches the `cont` value for reuse.

#### `public int sy = 0`
- Role: Caches the sy value.
- Description: Caches the `sy` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Scrollport(Coord sz)`
- Role: Creates a new Scrollport instance.
- Description: Constructs the Scrollport instance from the supplied inputs.

#### `public Scrollcont(Coord sz)`
- Role: Handles the scrollcont path.
- Description: Implements the scrollcont operation.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public <T extends Widget> T add(T child)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Coord xlate(Coord c, boolean in)`
- Role: Handles the xlate path.
- Description: Implements the xlate operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Scrollport content.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void resize(Coord nsz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.