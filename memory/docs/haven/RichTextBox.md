# RichTextBox

This file documents the responsibilities and members of `RichTextBox`.

## Meta

- Source: [RichTextBox.java](../../../src/haven/RichTextBox.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays rich text in a widget.

## Members

### Constants

#### `private static final int marg = UI.scale(10)`

- Description: TODO

### Fields

#### `public final RichText.Foundry fnd`

- Description: TODO

#### `public Color bg = Color.BLACK`

- Description: TODO

#### `private Indir<? extends RichText.Document> render`

- Description: TODO

#### `private RichText text`

- Description: TODO

#### `private Scrollbar sb`

- Description: TODO

### Methods

#### `public RichTextBox(Coord sz, RichText.Foundry fnd, Indir<? extends RichText.Document> doc)`

- Description: TODO

#### `public RichTextBox(Coord sz, Indir<? extends RichText.Document> doc)`

- Description: TODO

#### `public RichTextBox(Coord sz, String text, RichText.Foundry fnd)`

- Description: TODO

#### `public RichTextBox(Coord sz, String text, Object... attrs)`

- Description: TODO

#### `private void ckrender()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void set(Indir<? extends RichText.Document> doc)`

- Description: TODO

#### `public void set(RichText.Document doc)`

- Description: TODO

#### `public void settext(Indir<String> text)`

- Description: TODO

#### `public void settext(String text, Object... attrs)`

- Description: TODO

#### `public void settext(String text)`

- Description: TODO

#### `public boolean mousewheel(MouseWheelEvent ev)`

- Description: TODO

#### `public void resize(Coord sz)`

- Description: TODO
