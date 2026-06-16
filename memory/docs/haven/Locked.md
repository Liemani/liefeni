# Locked

This file documents the responsibilities and members of `Locked`.

## Meta

- Source: [Locked.java](../../../src/haven/Locked.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the locked Haven component.

## Members

### Constants

### Fields

#### `private final Lock lk`
- Role: Holds the lk state.
- Description: Backs the cached state for this file.

#### `private boolean held`
- Role: Tracks the held flag.
- Description: Supports the held operation used by the surrounding class.

### Methods

#### `public Locked(Lock lk)`
- Role: Creates a new Locked instance.
- Description: Constructs the instance and initializes its default state.

#### `public void unlock()`
- Role: Performs unlock.
- Description: Supports the unlock operation used by the surrounding class.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.
