---
source: [Tex.java](../../../../src/haven/Tex.java)
created: 2026-06-13
updated: 2026-06-14
---

# Tex

Represents the tex Haven component.

## Members

### Constants

#### `public static final Tex nil = new Tex()`
- Role: Implements the nil operation.
- Description: Implements the tex operation.
- Value: `new Tex()`

### Fields

### Methods

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public default void render(GOut g, Coord dul, Coord dbr, Coord tul, Coord tbr)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public default void render(GOut g, Coord c)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public default void crender(GOut g, Coord c, Coord dsz, Coord cul, Coord cbr)`
- Role: Draws the resource with explicit crop and destination coordinates.
- Description: Draws the resource with explicit crop and destination coordinates.

#### `public default void crender(GOut g, Coord c, Coord ul, Coord br)`
- Role: Draws the resource with explicit crop and destination coordinates.
- Description: Draws the resource with explicit crop and destination coordinates.

#### `public static int nextp2(int in)`
- Role: Handles the nextp2 path.
- Description: Implements the nextp2 operation.

#### `public default void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.