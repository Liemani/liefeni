---
source: [CSprite.java](../../../../src/haven/resutil/CSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# CSprite

Provides resource helper logic for csprite.

## Members

### Constants

### Fields

#### `private final Coord3f cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `private final List<RenderTree.Node> parts = new ArrayList<>()`
- Role: Caches parts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Random rnd`
- Role: Holds the rnd state.
- Description: Backs the cached state for this file.

### Methods

#### `public CSprite(Owner owner, Resource res)`
- Role: Creates a new CSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public void addpart(Location loc, Pipe.Op mat, RenderTree.Node part)`
- Role: Performs addpart.
- Description: Supports the addpart operation used by the surrounding class.

#### `public void addpart(float xo, float yo, float a, Pipe.Op mat, RenderTree.Node part)`
- Role: Performs addpart.
- Description: Supports the addpart operation used by the surrounding class.

#### `public void addpart(float xo, float yo, Pipe.Op mat, RenderTree.Node part)`
- Role: Performs addpart.
- Description: Supports the addpart operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.
