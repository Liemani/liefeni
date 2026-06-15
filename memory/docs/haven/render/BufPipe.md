# BufPipe

This file documents the responsibilities and members of `BufPipe`.

## Meta

- Source: [BufPipe.java](../../../../src/haven/render/BufPipe.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a buffer-backed render pipe.

## Members

### Constants

### Fields

#### `private State[] states`

- Description: TODO

### Methods

#### `public BufPipe(State[] states)`

- Description: TODO

#### `public BufPipe()`

- Description: TODO

#### `public <T extends State> T get(Slot<T> slot)`

- Description: TODO

#### `public <T extends State> void put(Slot<? super T> slot, T state)`

- Description: TODO

#### `public State[] states()`

- Description: TODO

#### `public BufPipe copy()`

- Description: TODO

#### `public void copy(Pipe from)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO
