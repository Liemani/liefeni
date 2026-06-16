# GroupPipe

This file documents the responsibilities and members of `GroupPipe`.

## Meta

- Source: [GroupPipe.java](../../../../src/haven/render/GroupPipe.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the group pipe render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public Pipe group(int g)`
- Role: Performs group.
- Description: Supports the group operation used by the surrounding class.

#### `public int gstate(int id)`
- Role: Performs gstate.
- Description: Supports the gstate operation used by the surrounding class.

#### `public int nstates()`
- Role: Performs nstates.
- Description: Supports the nstates operation used by the surrounding class.

#### `public default <T extends State> T get(State.Slot<T> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public default Pipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public default State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.
