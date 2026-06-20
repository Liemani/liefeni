---
source: [Frame.java](../../../src/haven/Frame.java)
created: 2026-06-13
updated: 2026-06-14
---

# Frame

Represents the frame Haven component.

## Members

### Constants

### Fields

#### `public final IBox box`
- Role: Holds the box state.
- Description: Backs the cached state for this file.

### Methods

#### `public Frame(Coord sz, boolean inner, IBox box)`
- Role: Creates a new Frame instance.
- Description: Constructs the instance and initializes its default state.

#### `public Frame(Coord sz, boolean inner)`
- Role: Creates a new Frame instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Frame around(Widget parent, Area area, IBox box)`
- Role: Performs around.
- Description: Supports the around operation used by the surrounding class.

#### `public static Frame around(Widget parent, Area area)`
- Role: Performs around.
- Description: Supports the around operation used by the surrounding class.

#### `public static Frame around(Widget parent, Iterable<? extends Widget> wl)`
- Role: Performs around.
- Description: Supports the around operation used by the surrounding class.

#### `public static Frame around(Widget parent, Widget... ch)`
- Role: Performs around.
- Description: Supports the around operation used by the surrounding class.

#### `public static Frame with(Widget child, boolean resize)`
- Role: Performs with.
- Description: Supports the with operation used by the surrounding class.

#### `public Coord inner()`
- Role: Performs inner.
- Description: Supports the inner operation used by the surrounding class.

#### `public Coord xlate(Coord c, boolean in)`
- Role: Performs xlate.
- Description: Supports the xlate operation used by the surrounding class.

#### `public Position getpos(String nm)`
- Role: Performs getpos.
- Description: Supports the getpos operation used by the surrounding class.

#### `public void drawframe(GOut g)`
- Role: Performs drawframe.
- Description: Supports the drawframe operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public <T extends Widget> T addin(T child)`
- Role: Performs addin.
- Description: Supports the addin operation used by the surrounding class.
