# Scrollport

This file documents the responsibilities and members of `Scrollport`.

## Meta

- Source: [Scrollport.java](../../../src/haven/Scrollport.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the scrollport Haven component.

## Nested Types

### $_

- Role: Represents $ within Scrollport.
- Description: Describes the nested $  type used by the enclosing class.

### Scrollcont

- Role: Represents scrollcont within Scrollport.
- Description: Describes the nested scrollcont type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Scrollbar bar`
- Role: Holds the bar state.
- Description: Backs the cached state for this file.

#### `public final Scrollcont cont`
- Role: Holds the cont state.
- Description: Backs the cached state for this file.

#### `public int sy = 0`
- Role: Stores the sy value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Scrollport(Coord sz)`
- Role: Creates a new Scrollport instance.
- Description: Constructs the instance and initializes its default state.

#### `public Scrollcont(Coord sz)`
- Role: Performs scrollcont.
- Description: Supports the scrollcont operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public <T extends Widget> T add(T child)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord xlate(Coord c, boolean in)`
- Role: Performs xlate.
- Description: Supports the xlate operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void resize(Coord nsz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
