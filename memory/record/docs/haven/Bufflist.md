---
source: [Bufflist.java](../../../src/haven/Bufflist.java)
created: 2026-06-13
updated: 2026-06-14
---

# Bufflist

Represents the bufflist Haven component.

## Nested Types

### Managed

- Role: Represents managed within Bufflist.
- Description: Describes the nested managed type used by the enclosing class.

## Members

### Constants

#### `public static final int margin = UI.scale(2)`
- Role: Defines the shared margin constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int num = 5`
- Role: Defines the shared num constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public void move(Coord c, double off)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public Bufflist()`
- Role: Creates a new Bufflist instance.
- Description: Constructs the instance and initializes its default state.

#### `private void arrange(Widget imm)`
- Role: Performs arrange.
- Description: Supports the arrange operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void cdestroy(Widget ch)`
- Role: Performs cdestroy.
- Description: Supports the cdestroy operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.
