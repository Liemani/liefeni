---
source: [DefPipe.java](../../../../src/haven/render/DefPipe.java)
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
- Role: Stores the ret0 value.
- Description: Backs the cached state for this file.

### Methods

#### `public <T extends State> void put(Slot<? super T> slot, T state)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public int[] maskdiff(DefPipe that)`
- Role: Performs maskdiff.
- Description: Supports the maskdiff operation used by the surrounding class.
