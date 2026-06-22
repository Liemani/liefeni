---
source: [SIWidget.java](../../../../src/haven/SIWidget.java)
created: 2026-06-13
updated: 2026-06-14
---

# SIWidget

Represents the siwidget Haven component.

## Members

### Constants

### Fields

#### `private Tex surf = null`
- Role: Caches the surf value.
- Description: Caches the `surf` value for reuse.

### Methods

#### `public SIWidget(Coord sz)`
- Role: Creates a new SIWidget instance.
- Description: Constructs the SIWidget instance from the supplied inputs.

#### `protected abstract void draw(BufferedImage buf)`
- Role: Draws the current content.
- Description: Draws the SIWidget content.

#### `public BufferedImage draw()`
- Role: Draws the current content.
- Description: Draws the SIWidget content.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the SIWidget content.

#### `public void redraw()`
- Role: Handles the redraw path.
- Description: Implements the redraw operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.