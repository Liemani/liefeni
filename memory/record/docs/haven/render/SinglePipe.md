---
source: [SinglePipe.java](../../../../../src/haven/render/SinglePipe.java)
created: 2026-06-13
updated: 2026-06-14
---

# SinglePipe

Defines the single pipe render pipeline component.

## Members

### Constants

### Fields

#### `public final Slot<T> slot`
- Role: Caches the slot value.
- Description: Caches the `slot` value for reuse.

#### `public final T value`
- Role: Caches the value value.
- Description: Caches the `value` value for reuse.

### Methods

#### `public SinglePipe(Slot<T> slot, T value)`
- Role: Creates a new SinglePipe instance.
- Description: Constructs the SinglePipe instance from the supplied inputs.

#### `public <G extends State> G get(Slot<G> slot)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public Pipe copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public State[] states()`
- Role: Handles the states path.
- Description: Implements the states operation.