---
source: [AnimSprite.java](../../../../src/haven/AnimSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# AnimSprite

Represents the anim sprite Haven component.

## Members

### Constants

#### `public static final Factory fact = new Factory()`
- Role: Implements the fact operation.
- Description: Implements the factory operation.
- Value: `new Factory()`

### Fields

#### `private final RenderTree.Node[] parts`
- Role: Caches the parts value.
- Description: Caches the `parts` value for reuse.

#### `private final MeshAnim.Animation[] anims`
- Role: Caches the anims value.
- Description: Caches the `anims` value for reuse.

### Methods

#### `private AnimSprite(Owner owner, Resource res, Message sdt)`
- Role: Creates a new AnimSprite instance.
- Description: Constructs the AnimSprite instance from the supplied inputs.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public boolean tick(double ddt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.