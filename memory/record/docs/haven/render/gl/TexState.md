---
source: [TexState.java](../../../../../../src/haven/render/gl/TexState.java)
created: 2026-06-13
updated: 2026-06-14
---

# TexState

Provides GL backend support for tex state.

## Members

### Constants

### Fields

#### `public final GLTexture[] bound`
- Role: Caches the bound value.
- Description: Caches the `bound` value for reuse.

#### `public final int active`
- Role: Caches the active value.
- Description: Caches the `active` value for reuse.

#### `public static int slot = slotidx(TexState.class)`
- Role: Implements the slot operation.
- Description: Implements the slotidx operation.

### Methods

#### `public TexState(GLTexture[] bound, int active)`
- Role: Creates a new TexState instance.
- Description: Constructs the TexState instance from the supplied inputs.

#### `public void apply(BGL gl)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void unapply(BGL gl)`
- Role: Handles the unapply path.
- Description: Implements the unapply operation.

#### `public void applyto(BGL gl, GLState to)`
- Role: Handles the applyto path.
- Description: Implements the applyto operation.

#### `public static void act(BGL gl, Applier st, int unit)`
- Role: Handles the act path.
- Description: Implements the act operation.

#### `public static void bind(BGL gl, Applier st, int unit, GLTexture tex)`
- Role: Handles the bind path.
- Description: Implements the bind operation.

#### `public int slotidx()`
- Role: Handles the slotidx path.
- Description: Implements the slotidx operation.