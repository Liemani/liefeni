# ILabel

This file documents the responsibilities and members of `ILabel`.

## Meta

- Source: [ILabel.java](../../../src/haven/ILabel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the ilabel Haven component.

## Members

### Constants

### Fields

#### `public final Text.Furnace f`
- Role: Stores the f value.
- Description: Backs the cached state for this file.

#### `public Text text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

### Methods

#### `public ILabel(String text, Text.Furnace f)`
- Role: Creates a new ILabel instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public String text()`
- Role: Performs text.
- Description: Supports the text operation used by the surrounding class.

#### `public void settext(String text)`
- Role: Performs settext.
- Description: Supports the settext operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
