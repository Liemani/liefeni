---
source: [Img.java](../../../src/haven/Img.java)
created: 2026-06-13
updated: 2026-06-14
---

# Img

Represents the img Haven component.

## Nested Types

### $_

- Role: Represents $ within Img.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

### Fields

#### `private Tex img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private BufferedImage rimg`
- Role: Stores the rimg value.
- Description: Backs the cached state for this file.

#### `public boolean hit = false, opaque = false`
- Role: Tracks the hit flag.
- Description: Supports the hit operation used by the surrounding class.

#### `public boolean hit = false, opaque = false`
- Role: Tracks the hit flag.
- Description: Supports the hit operation used by the surrounding class.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setimg(Tex img)`
- Role: Performs setimg.
- Description: Supports the setimg operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Img(Tex img)`
- Role: Creates a new Img instance.
- Description: Constructs the instance and initializes its default state.

#### `public void uimsg(String name, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.
