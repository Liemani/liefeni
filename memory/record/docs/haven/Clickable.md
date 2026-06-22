---
source: [Clickable.java](../../../../src/haven/Clickable.java)
created: 2026-06-13
updated: 2026-06-14
---

# Clickable

Represents the clickable Haven component.

## Members

### Constants

#### `public static final Slot<Clickable> slot = new Slot<Clickable>(Slot.Type.DRAW, Clickable.class)`
- Role: Implements the slot operation.
- Description: Implements the public static final slot<clickable> slot = new slot<clickable>(slot.type.draw, clickable.class) operation.
- Value: `new Slot<Clickable>(Slot.Type.DRAW, Clickable.class)`

### Fields

### Methods

#### `public Object[] clickargs(ClickData cd)`
- Role: Handles the clickargs path.
- Description: Handles args interaction.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Clickable for debugging and logging.