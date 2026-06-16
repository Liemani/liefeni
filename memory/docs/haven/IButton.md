# IButton

This file documents the responsibilities and members of `IButton`.

## Meta

- Source: [IButton.java](../../../src/haven/IButton.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the ibutton Haven component.

## Nested Types

### $_

- Role: Represents $ within IButton.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final BufferedImage up, down, hover`
- Role: Stores the hover value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage up, down, hover`
- Role: Stores the hover value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage up, down, hover`
- Role: Stores the hover value.
- Description: Backs the cached state for this file.

#### `public boolean h = false, a = false`
- Role: Tracks the h flag.
- Description: Supports the h operation used by the surrounding class.

#### `public boolean h = false, a = false`
- Role: Tracks the h flag.
- Description: Supports the h operation used by the surrounding class.

#### `public Runnable action = null`
- Role: Holds the action state.
- Description: Backs the cached state for this file.

#### `private UI.Grab d = null`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public IButton(BufferedImage up, BufferedImage down, BufferedImage hover, Runnable action)`
- Role: Creates a new IButton instance.
- Description: Constructs the instance and initializes its default state.

#### `public IButton(BufferedImage up, BufferedImage down, BufferedImage hover)`
- Role: Creates a new IButton instance.
- Description: Constructs the instance and initializes its default state.

#### `public IButton(BufferedImage up, BufferedImage down)`
- Role: Creates a new IButton instance.
- Description: Constructs the instance and initializes its default state.

#### `public IButton(String base, String up, String down, String hover, Runnable action)`
- Role: Creates a new IButton instance.
- Description: Constructs the instance and initializes its default state.

#### `public IButton(String base, String up, String down, String hover)`
- Role: Creates a new IButton instance.
- Description: Constructs the instance and initializes its default state.

#### `public IButton action(Runnable action)`
- Role: Performs action.
- Description: Supports the action operation used by the surrounding class.

#### `public void draw(BufferedImage buf)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public void click()`
- Role: Performs click.
- Description: Supports the click operation used by the surrounding class.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Performs gkeytype.
- Description: Supports the gkeytype operation used by the surrounding class.

#### `protected void depress()`
- Role: Performs depress.
- Description: Supports the depress operation used by the surrounding class.

#### `protected void unpress()`
- Role: Performs unpress.
- Description: Supports the unpress operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Performs mouseup.
- Description: Supports the mouseup operation used by the surrounding class.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Performs mousemove.
- Description: Supports the mousemove operation used by the surrounding class.
