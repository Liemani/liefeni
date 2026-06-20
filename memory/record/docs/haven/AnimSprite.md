---
source: [AnimSprite.java](../../../src/haven/AnimSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# AnimSprite

Represents the anim sprite Haven component.

## Members

### Constants

#### `public static final Factory fact = new Factory()`
- Role: Defines the shared fact constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final RenderTree.Node[] parts`
- Role: Stores the parts value.
- Description: Backs the cached state for this file.

#### `private final MeshAnim.Animation[] anims`
- Role: Holds the anims state.
- Description: Backs the cached state for this file.

### Methods

#### `private AnimSprite(Owner owner, Resource res, Message sdt)`
- Role: Creates a new AnimSprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public boolean tick(double ddt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.
