---
source: [Frame.java](../../../../src/haven/Frame.java)
created: 2026-06-13
updated: 2026-06-14
---

# Frame

Represents the frame Haven component.

## Members

### Constants

### Fields

#### `public final IBox box`
- Role: Caches the box value.
- Description: Caches the `box` value for reuse.

### Methods

#### `public Frame(Coord sz, boolean inner, IBox box)`
- Role: Creates a new Frame instance.
- Description: Constructs the Frame instance from the supplied inputs.

#### `public Frame(Coord sz, boolean inner)`
- Role: Creates a new Frame instance.
- Description: Constructs the Frame instance from the supplied inputs.

#### `public static Frame around(Widget parent, Area area, IBox box)`
- Role: Handles the around path.
- Description: Implements the around operation.

#### `public static Frame around(Widget parent, Area area)`
- Role: Handles the around path.
- Description: Implements the around operation.

#### `public static Frame around(Widget parent, Iterable<? extends Widget> wl)`
- Role: Handles the around path.
- Description: Implements the around operation.

#### `public static Frame around(Widget parent, Widget... ch)`
- Role: Handles the around path.
- Description: Implements the around operation.

#### `public static Frame with(Widget child, boolean resize)`
- Role: Handles the with path.
- Description: Implements the with operation.

#### `public Coord inner()`
- Role: Handles the inner path.
- Description: Implements the inner operation.

#### `public Coord xlate(Coord c, boolean in)`
- Role: Handles the xlate path.
- Description: Implements the xlate operation.

#### `public Position getpos(String nm)`
- Role: Handles the getpos path.
- Description: Returns the pos.

#### `public void drawframe(GOut g)`
- Role: Handles the drawframe path.
- Description: Draws the frame.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Frame content.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `public <T extends Widget> T addin(T child)`
- Role: Handles the addin path.
- Description: Adds the in.