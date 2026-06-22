---
source: [VboState.java](../../../../../../src/haven/render/gl/VboState.java)
created: 2026-06-13
updated: 2026-06-14
---

# VboState

Provides GL backend support for vbo state.

## Members

### Constants

### Fields

#### `public final GLBuffer buf`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

#### `public static int slot = slotidx(VboState.class)`
- Role: Implements the slot operation.
- Description: Implements the slotidx operation.

### Methods

#### `public VboState(GLBuffer buf)`
- Role: Creates a new VboState instance.
- Description: Constructs the VboState instance from the supplied inputs.

#### `public void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void unapply(BGL gl)`
- Role: Handles the unapply path.
- Description: Implements the unapply operation.

#### `public void applyto(BGL gl, GLState to)`
- Role: Handles the applyto path.
- Description: Implements the applyto operation.

#### `public static void apply(BGL gl, Applier st, GLBuffer buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public static void set(Applier st, GLBuffer buf)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public static GLBuffer get(Applier st)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public int slotidx()`
- Role: Handles the slotidx path.
- Description: Implements the slotidx operation.