---
source: [CSprite.java](../../../../../src/haven/resutil/CSprite.java)
created: 2026-06-13
updated: 2026-06-20
---

# CSprite

Builds a composite sprite by placing render-tree parts around the owning gob's position.

## Members

### Fields

#### `private final Coord3f cc`
- Role: Stores the gob's world-space center point.
- Description: Captured once from the owning `Gob` and used as the placement origin.

#### `private final List<RenderTree.Node> parts = new ArrayList<>()`
- Role: Collects the sprite's child render nodes.
- Description: Each node is already transformed before it is stored.

#### `private final Random rnd`
- Role: Supplies randomized part rotation.
- Description: Seeded from the owner's random source.

### Methods

#### `public CSprite(Owner owner, Resource res)`
- Role: Creates the composite sprite.
- Description: Reads the gob position and initializes the random source.

#### `public void addpart(Location loc, Pipe.Op mat, RenderTree.Node part)`
- Role: Adds a prepared part to the sprite.
- Description: Applies an optional material override before storing the node.

#### `public void addpart(float xo, float yo, float a, Pipe.Op mat, RenderTree.Node part)`
- Role: Adds a part using a local offset and angle.
- Description: Anchors the part against the map height at the gob position.

#### `public void addpart(float xo, float yo, Pipe.Op mat, RenderTree.Node part)`
- Role: Adds a part with a random angle.
- Description: Convenience overload for decorative attachments.

#### `public void added(RenderTree.Slot slot)`
- Role: Inserts the collected parts into the render tree.
- Description: Re-roots the nodes under the gob transform before attaching them.