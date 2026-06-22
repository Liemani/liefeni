---
source: [IButton.java](../../../../src/haven/IButton.java)
created: 2026-06-13
updated: 2026-06-14
---

# IButton

Represents the ibutton Haven component.

## Nested Types

### $_

- Role: Registers the `ibtn` widget factory.
- Description: Builds an `IButton` from resource names or session resource ids.

## Members

### Constants

### Fields

#### `public final BufferedImage up, down, hover`
- Role: Caches the hover value.
- Description: Caches the `hover` value for reuse.

#### `public final BufferedImage up, down, hover`
- Role: Caches the hover value.
- Description: Caches the `hover` value for reuse.

#### `public final BufferedImage up, down, hover`
- Role: Caches the hover value.
- Description: Caches the `hover` value for reuse.

#### `public boolean h = false, a = false`
- Role: Tracks the h flag.
- Description: Caches the `h` value for reuse.

#### `public boolean h = false, a = false`
- Role: Tracks the h flag.
- Description: Caches the `h` value for reuse.

#### `public Runnable action = null`
- Role: Caches the action value.
- Description: Caches the `action` value for reuse.

#### `private UI.Grab d = null`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public IButton(BufferedImage up, BufferedImage down, BufferedImage hover, Runnable action)`
- Role: Creates a new IButton instance.
- Description: Constructs the IButton instance from the supplied inputs.

#### `public IButton(BufferedImage up, BufferedImage down, BufferedImage hover)`
- Role: Creates a new IButton instance.
- Description: Constructs the IButton instance from the supplied inputs.

#### `public IButton(BufferedImage up, BufferedImage down)`
- Role: Creates a new IButton instance.
- Description: Constructs the IButton instance from the supplied inputs.

#### `public IButton(String base, String up, String down, String hover, Runnable action)`
- Role: Creates a new IButton instance.
- Description: Constructs the IButton instance from the supplied inputs.

#### `public IButton(String base, String up, String down, String hover)`
- Role: Creates a new IButton instance.
- Description: Constructs the IButton instance from the supplied inputs.

#### `public IButton action(Runnable action)`
- Role: Handles the action path.
- Description: Implements the action operation.

#### `public void draw(BufferedImage buf)`
- Role: Draws the current content.
- Description: Draws the IButton content.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `public void click()`
- Role: Handles the click path.
- Description: Handles click input for this widget.

#### `public boolean gkeytype(GlobKeyEvent ev)`
- Role: Handles the gkeytype path.
- Description: Implements the gkeytype operation.

#### `protected void depress()`
- Role: Handles the depress path.
- Description: Implements the depress operation.

#### `protected void unpress()`
- Role: Handles the unpress path.
- Description: Implements the unpress operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public boolean mouseup(MouseUpEvent ev)`
- Role: Handles the mouseup path.
- Description: Finishes a drag or click interaction on the minimap.

#### `public void mousemove(MouseMoveEvent ev)`
- Role: Handles the mousemove path.
- Description: Updates drag state while the mouse moves across the minimap.