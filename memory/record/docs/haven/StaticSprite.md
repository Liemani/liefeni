---
source: [StaticSprite.java](../../../../src/haven/StaticSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# StaticSprite

Represents the static sprite Haven component.

## Members

### Constants

#### `public static final Factory fact = new Factory()`
- Role: Implements the fact operation.
- Description: Implements the factory operation.
- Value: `new Factory()`

### Fields

#### `public final RenderTree.Node[] parts`
- Role: Caches the parts value.
- Description: Caches the `parts` value for reuse.

### Methods

#### `public StaticSprite(Owner owner, Resource res, RenderTree.Node[] parts)`
- Role: Creates a new StaticSprite instance.
- Description: Constructs the StaticSprite instance from the supplied inputs.

#### `public StaticSprite(Owner owner, Resource res, RenderTree.Node part)`
- Role: Creates a new StaticSprite instance.
- Description: Constructs the StaticSprite instance from the supplied inputs.

#### `public StaticSprite(Owner owner, Resource res, Message sdt)`
- Role: Creates a new StaticSprite instance.
- Description: Constructs the StaticSprite instance from the supplied inputs.

#### `public static RenderTree.Node[] lsparts(Owner owner, Resource res, Message sdt)`
- Role: Handles the lsparts path.
- Description: Implements the lsparts operation.

#### `public static RenderTree.Node[] lsparts(Resource res, Message sdt)`
- Role: Handles the lsparts path.
- Description: Implements the lsparts operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.