---
source: [Bufflist.java](../../../../src/haven/Bufflist.java)
created: 2026-06-13
updated: 2026-06-14
---

# Bufflist

Represents the bufflist Haven component.

## Nested Types

### Managed

- Role: Marks a buff slot managed by external layout logic.
- Description: Interface for buff widgets that are positioned and refreshed by the buff list controller.

## Members

### Constants

#### `public static final int margin = UI.scale(2)`
- Role: Implements the margin operation.
- Description: Implements the scale operation.
- Value: `UI.scale(2)`

#### `public static final int num = 5`
- Role: Caches the num value.
- Description: Caches the `num` value for reuse.
- Value: `5`

### Fields

### Methods

#### `public void move(Coord c, double off)`
- Role: Moves the current state.
- Description: Implements the move operation.

#### `public Bufflist()`
- Role: Creates a new Bufflist instance.
- Description: Constructs the Bufflist instance from the supplied inputs.

#### `private void arrange(Widget imm)`
- Role: Handles the arrange path.
- Description: Implements the arrange operation.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void cdestroy(Widget ch)`
- Role: Handles the cdestroy path.
- Description: Implements the cdestroy operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Bufflist content.