# BufPipe

This file documents the responsibilities and members of `BufPipe`.

## Meta

- Source: [BufPipe.java](../../../../src/haven/render/BufPipe.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the buf pipe render pipeline component.

## Members

### Constants

### Fields

#### `private State[] states`
- Role: Holds the states state.
- Description: Backs the cached state for this file.

### Methods

#### `public BufPipe(State[] states)`
- Role: Creates a new BufPipe instance.
- Description: Constructs the instance and initializes its default state.

#### `public BufPipe()`
- Role: Creates a new BufPipe instance.
- Description: Constructs the instance and initializes its default state.

#### `public <T extends State> T get(Slot<T> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public <T extends State> void put(Slot<? super T> slot, T state)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.

#### `public BufPipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public void copy(Pipe from)`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
