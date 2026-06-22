---
source: [ClickData.java](../../../../src/haven/ClickData.java)
created: 2026-06-13
updated: 2026-06-14
---

# ClickData

Represents the click data Haven component.

## Members

### Constants

### Fields

#### `public final Clickable ci`
- Role: Caches the ci value.
- Description: Caches the `ci` value for reuse.

#### `public final Slot slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

### Methods

#### `public ClickData(Clickable ci, Slot slot)`
- Role: Creates a new ClickData instance.
- Description: Constructs the ClickData instance from the supplied inputs.

#### `public Object[] array()`
- Role: Handles the array path.
- Description: Implements the array operation.

#### `public Object[] clickargs()`
- Role: Handles the clickargs path.
- Description: Handles args interaction.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this ClickData for debugging and logging.