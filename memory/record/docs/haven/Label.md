---
source: [Label.java](../../../../src/haven/Label.java)
created: 2026-06-13
updated: 2026-06-14
---

# Label

Represents the label Haven component.

## Nested Types

### $_

- Role: Registers the `lbl` widget factory.
- Description: Creates a `Label` from widget arguments and optional width.

## Members

### Constants

### Fields

#### `public final Text.Foundry f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `public Text text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `public String texts`
- Role: Caches the texts value.
- Description: Caches the `texts` value for reuse.

#### `public Color col = Color.WHITE`
- Role: Caches the col value.
- Description: Caches the `col` value for reuse.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Label(String text, int w, Text.Foundry f)`
- Role: Creates a new Label instance.
- Description: Constructs the Label instance from the supplied inputs.

#### `public Label(String text, Text.Foundry f)`
- Role: Creates a new Label instance.
- Description: Constructs the Label instance from the supplied inputs.

#### `public Label(String text, int w)`
- Role: Creates a new Label instance.
- Description: Constructs the Label instance from the supplied inputs.

#### `public Label(String text)`
- Role: Creates a new Label instance.
- Description: Constructs the Label instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Label content.

#### `public void settext(String text)`
- Role: Handles the settext path.
- Description: Updates the text.

#### `public void setcolor(Color color)`
- Role: Handles the setcolor path.
- Description: Updates the color.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.