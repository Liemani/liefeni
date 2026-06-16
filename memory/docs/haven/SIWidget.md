# SIWidget

This file documents the responsibilities and members of `SIWidget`.

## Meta

- Source: [SIWidget.java](../../../src/haven/SIWidget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the siwidget Haven component.

## Members

### Constants

### Fields

#### `private Tex surf = null`
- Role: Stores the surf value.
- Description: Backs the cached state for this file.

### Methods

#### `public SIWidget(Coord sz)`
- Role: Creates a new SIWidget instance.
- Description: Constructs the instance and initializes its default state.

#### `protected abstract void draw(BufferedImage buf)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public BufferedImage draw()`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void redraw()`
- Role: Performs redraw.
- Description: Supports the redraw operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
