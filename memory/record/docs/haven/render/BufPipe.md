---
source: [BufPipe.java](../../../../../src/haven/render/BufPipe.java)
created: 2026-06-13
updated: 2026-06-14
---

# BufPipe

Defines the buf pipe render pipeline component.

## Members

### Constants

### Fields

#### `private State[] states`
- Role: Caches the states value.
- Description: Caches the `states` value for reuse.

### Methods

#### `public BufPipe(State[] states)`
- Role: Creates a new BufPipe instance.
- Description: Constructs the BufPipe instance from the supplied inputs.

#### `public BufPipe()`
- Role: Creates a new BufPipe instance.
- Description: Constructs the BufPipe instance from the supplied inputs.

#### `public <T extends State> T get(Slot<T> slot)`
- Role: Reads one pipe state.
- Description: Returns the state currently stored for the requested slot.

#### `public <T extends State> void put(Slot<? super T> slot, T state)`
- Role: Writes one pipe state.
- Description: Stores a new state value into the pipe slot.

#### `public State[] states()`
- Role: Exposes the current pipe states.
- Description: Returns the backing state array for inspection or copy.

#### `public BufPipe copy()`
- Role: Copies the pipe state.
- Description: Produces a separate pipe with the same state array content.

#### `public void copy(Pipe from)`
- Role: Imports pipe state.
- Description: Copies state values from another pipe into this one.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this BufPipe for debugging and logging.