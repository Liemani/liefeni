---
source: [DefPipe.java](../../../../../src/haven/render/DefPipe.java)
created: 2026-06-13
updated: 2026-06-14
---

# DefPipe

Defines the def pipe render pipeline component.

## Members

### Constants

### Fields

#### `public boolean[] mask =`
- Role: Tracks whether  is active.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static int[] ret0 = new int[0]`
- Role: Caches the ret0 value.
- Description: Caches the `ret0` value for reuse.

### Methods

#### `public <T extends State> void put(Slot<? super T> slot, T state)`
- Role: Marks a state as defined.
- Description: Stores a state and records that the slot has been written.

#### `public int[] maskdiff(DefPipe that)`
- Role: Computes a definition-mask delta.
- Description: Returns which state slots differ between two definition pipes.