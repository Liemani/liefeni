# RichTextBox

This file documents the responsibilities and members of `RichTextBox`.

## Meta

- Source: [RichTextBox.java](../../../src/haven/RichTextBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the rich text box Haven component.

## Members

### Constants

#### `private static final int marg = UI.scale(10)`
- Role: Defines the shared marg constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final RichText.Foundry fnd`
- Role: Stores the fnd value.
- Description: Backs the cached state for this file.

#### `public Color bg = Color.BLACK`
- Role: Stores the bg value.
- Description: Backs the cached state for this file.

#### `private Indir<? extends RichText.Document> render`
- Role: Stores the render value.
- Description: Backs the cached state for this file.

#### `private RichText text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `private Scrollbar sb`
- Role: Holds the sb state.
- Description: Backs the cached state for this file.

### Methods

#### `public RichTextBox(Coord sz, RichText.Foundry fnd, Indir<? extends RichText.Document> doc)`
- Role: Creates a new RichTextBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public RichTextBox(Coord sz, Indir<? extends RichText.Document> doc)`
- Role: Creates a new RichTextBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public RichTextBox(Coord sz, String text, RichText.Foundry fnd)`
- Role: Creates a new RichTextBox instance.
- Description: Constructs the instance and initializes its default state.

#### `public RichTextBox(Coord sz, String text, Object... attrs)`
- Role: Creates a new RichTextBox instance.
- Description: Constructs the instance and initializes its default state.

#### `private void ckrender()`
- Role: Performs ckrender.
- Description: Supports the ckrender operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void set(Indir<? extends RichText.Document> doc)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void set(RichText.Document doc)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void settext(Indir<String> text)`
- Role: Performs settext.
- Description: Supports the settext operation used by the surrounding class.

#### `public void settext(String text, Object... attrs)`
- Role: Performs settext.
- Description: Supports the settext operation used by the surrounding class.

#### `public void settext(String text)`
- Role: Performs settext.
- Description: Supports the settext operation used by the surrounding class.

#### `public boolean mousewheel(MouseWheelEvent ev)`
- Role: Performs mousewheel.
- Description: Supports the mousewheel operation used by the surrounding class.

#### `public void resize(Coord sz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.
