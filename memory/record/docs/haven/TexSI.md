---
source: [TexSI.java](../../../../src/haven/TexSI.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexSI

Represents the tex si Haven component.

## Members

### Constants

### Fields

#### `public final Tex parent`
- Role: Caches the parent value.
- Description: Caches the `parent` value for reuse.

#### `public final Coord ul, br`
- Role: Caches the br value.
- Description: Caches the `br` value for reuse.

#### `public final Coord ul, br`
- Role: Caches the br value.
- Description: Caches the `br` value for reuse.

### Methods

#### `public TexSI(Tex parent, Coord ul, Coord br)`
- Role: Creates a new TexSI instance.
- Description: Constructs the TexSI instance from the supplied inputs.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Returns the size of the sliced texture.

#### `public void render(GOut g, float[] gc, float[] tc)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.