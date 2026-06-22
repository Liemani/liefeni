---
source: [ILabel.java](../../../../src/haven/ILabel.java)
created: 2026-06-13
updated: 2026-06-14
---

# ILabel

Represents the ilabel Haven component.

## Members

### Constants

### Fields

#### `public final Text.Furnace f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `public Text text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

### Methods

#### `public ILabel(String text, Text.Furnace f)`
- Role: Creates a new ILabel instance.
- Description: Constructs the ILabel instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the ILabel content.

#### `public String text()`
- Role: Handles the text path.
- Description: Implements the text operation.

#### `public void settext(String text)`
- Role: Handles the settext path.
- Description: Updates the text.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.