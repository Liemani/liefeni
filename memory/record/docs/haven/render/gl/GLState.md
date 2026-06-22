---
source: [GLState.java](../../../../../../src/haven/render/gl/GLState.java)
created: 2026-06-13
updated: 2026-06-20
---

# GLState

Base class for one OpenGL pipeline state slot. Concrete states apply and unapply themselves to a `BGL`.

## Members

### Constants

#### `public static final Class<? extends GLState>[] slots = (Class<? extends GLState>[])new Class[]`
- Role: Declares the ordered GL state slot list.
- Value: `(Class<? extends GLState>[])new Class[] {VaoState.class, VboState.class, FboState.class}`

### Methods

#### `public static int slotidx(Class<? extends GLState> cl)`
- Role: Returns the slot index for a concrete GL state class.

#### `public abstract void apply(BGL gl)`
- Role: Applies this state to the backend.

#### `public abstract void unapply(BGL gl)`
- Role: Removes this state from the backend.

#### `public abstract int slotidx()`
- Role: Returns this state's slot index.

#### `public void applyto(BGL gl, GLState to)`
- Role: Switches from this state to another state.

