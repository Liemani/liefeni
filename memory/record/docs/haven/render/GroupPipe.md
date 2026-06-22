---
source: [GroupPipe.java](../../../../../src/haven/render/GroupPipe.java)
created: 2026-06-13
updated: 2026-06-14
---

# GroupPipe

Defines the group pipe render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public Pipe group(int g)`
- Role: Returns one grouped pipe.
- Description: Exposes the pipe stored in the requested group index.

#### `public int gstate(int id)`
- Role: Returns one grouped state hash.
- Description: Exposes the cached state id for the requested group slot.

#### `public int nstates()`
- Role: Reports the grouped state count.
- Description: Returns how many state slots are tracked by this pipe.

#### `public default <T extends State> T get(State.Slot<T> slot)`
- Role: Reads one grouped state.
- Description: Returns the state exposed by the underlying group pipe.

#### `public default Pipe copy()`
- Role: Copies grouped pipe state.
- Description: Produces a pipe snapshot from the current group pipe.

#### `public default State[] states()`
- Role: Exposes grouped states.
- Description: Returns the state array represented by the group pipe.