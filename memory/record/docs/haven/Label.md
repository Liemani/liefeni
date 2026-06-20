---
source: [Label.java](../../../src/haven/Label.java)
created: 2026-06-13
updated: 2026-06-14
---

# Label

Represents the label Haven component.

## Nested Types

### $_

- Role: Represents $ within Label.
- Description: Describes the nested $  type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Text.Foundry f`
- Role: Stores the f value.
- Description: Backs the cached state for this file.

#### `public Text text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public String texts`
- Role: Stores the texts value.
- Description: Backs the cached state for this file.

#### `public Color col = Color.WHITE`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Label(String text, int w, Text.Foundry f)`
- Role: Creates a new Label instance.
- Description: Constructs the instance and initializes its default state.

#### `public Label(String text, Text.Foundry f)`
- Role: Creates a new Label instance.
- Description: Constructs the instance and initializes its default state.

#### `public Label(String text, int w)`
- Role: Creates a new Label instance.
- Description: Constructs the instance and initializes its default state.

#### `public Label(String text)`
- Role: Creates a new Label instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void settext(String text)`
- Role: Performs settext.
- Description: Supports the settext operation used by the surrounding class.

#### `public void setcolor(Color color)`
- Role: Performs setcolor.
- Description: Supports the setcolor operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
