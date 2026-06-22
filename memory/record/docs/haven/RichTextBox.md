---
source: [RichTextBox.java](../../../../src/haven/RichTextBox.java)
created: 2026-06-13
updated: 2026-06-14
---

# RichTextBox

Represents the rich text box Haven component.

## Members

### Constants

#### `private static final int marg = UI.scale(10)`
- Role: Implements the marg operation.
- Description: Implements the scale operation.
- Value: `UI.scale(10)`

### Fields

#### `public final RichText.Foundry fnd`
- Role: Caches the fnd value.
- Description: Caches the `fnd` value for reuse.

#### `public Color bg = Color.BLACK`
- Role: Caches the bg value.
- Description: Caches the `bg` value for reuse.

#### `private Indir<? extends RichText.Document> render`
- Role: Caches the render value.
- Description: Caches the `render` value for reuse.

#### `private RichText text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

#### `private Scrollbar sb`
- Role: Caches the sb value.
- Description: Caches the `sb` value for reuse.

### Methods

#### `public RichTextBox(Coord sz, RichText.Foundry fnd, Indir<? extends RichText.Document> doc)`
- Role: Creates a new RichTextBox instance.
- Description: Constructs the RichTextBox instance from the supplied inputs.

#### `public RichTextBox(Coord sz, Indir<? extends RichText.Document> doc)`
- Role: Creates a new RichTextBox instance.
- Description: Constructs the RichTextBox instance from the supplied inputs.

#### `public RichTextBox(Coord sz, String text, RichText.Foundry fnd)`
- Role: Creates a new RichTextBox instance.
- Description: Constructs the RichTextBox instance from the supplied inputs.

#### `public RichTextBox(Coord sz, String text, Object... attrs)`
- Role: Creates a new RichTextBox instance.
- Description: Constructs the RichTextBox instance from the supplied inputs.

#### `private void ckrender()`
- Role: Handles the ckrender path.
- Description: Implements the ckrender operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the RichTextBox content.

#### `public void set(Indir<? extends RichText.Document> doc)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void set(RichText.Document doc)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void settext(Indir<String> text)`
- Role: Handles the settext path.
- Description: Updates the text.

#### `public void settext(String text, Object... attrs)`
- Role: Handles the settext path.
- Description: Updates the text.

#### `public void settext(String text)`
- Role: Handles the settext path.
- Description: Updates the text.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Handles the mousewheel path.
- Description: Zooms or pans the minimap in response to the mouse wheel.

#### `public void resize(Coord sz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.