# SinglePipe

This file documents the responsibilities and members of `SinglePipe`.

## Meta

- Source: [SinglePipe.java](../../../../src/haven/render/SinglePipe.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the single pipe render pipeline component.

## Members

### Constants

### Fields

#### `public final Slot<T> slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

#### `public final T value`
- Role: Holds the value state.
- Description: Backs the cached state for this file.

### Methods

#### `public SinglePipe(Slot<T> slot, T value)`
- Role: Creates a new SinglePipe instance.
- Description: Constructs the instance and initializes its default state.

#### `public <G extends State> G get(Slot<G> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Pipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.
