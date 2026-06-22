---
source: [Img.java](../../../../src/haven/Img.java)
created: 2026-06-13
updated: 2026-06-14
---

# Img

Represents the img Haven component.

## Nested Types

### $_

- Role: Registers the image widget resource.
- Description: Factory that creates an Img from a resource-backed texture.

## Members

### Constants

### Fields

#### `private Tex img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `private BufferedImage rimg`
- Role: Caches the rimg value.
- Description: Caches the `rimg` value for reuse.

#### `public boolean hit = false, opaque = false`
- Role: Tracks the hit flag.
- Description: Caches the `hit` value for reuse.

#### `public boolean hit = false, opaque = false`
- Role: Tracks the hit flag.
- Description: Caches the `hit` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setimg(Tex img)`
- Role: Handles the setimg path.
- Description: Updates the img.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Img content.

#### `public Img(Tex img)`
- Role: Creates a new Img instance.
- Description: Constructs the Img instance from the supplied inputs.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.