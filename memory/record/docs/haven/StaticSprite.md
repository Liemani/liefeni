---
source: [StaticSprite.java](../../../src/haven/StaticSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# StaticSprite

Represents the static sprite Haven component.

## Members

### Constants

#### `public static final Factory fact = new Factory()`
- Role: Defines the shared fact constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final RenderTree.Node[] parts`
- Role: Stores the parts value.
- Description: Backs the cached state for this file.

### Methods

#### `public StaticSprite(Owner owner, Resource res, RenderTree.Node[] parts)`
- Role: Creates a new StaticSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public StaticSprite(Owner owner, Resource res, RenderTree.Node part)`
- Role: Creates a new StaticSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public StaticSprite(Owner owner, Resource res, Message sdt)`
- Role: Creates a new StaticSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public static RenderTree.Node[] lsparts(Owner owner, Resource res, Message sdt)`
- Role: Performs lsparts.
- Description: Supports the lsparts operation used by the surrounding class.

#### `public static RenderTree.Node[] lsparts(Resource res, Message sdt)`
- Role: Performs lsparts.
- Description: Supports the lsparts operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.
