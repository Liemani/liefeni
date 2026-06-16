# ClickData

This file documents the responsibilities and members of `ClickData`.

## Meta

- Source: [ClickData.java](../../../src/haven/ClickData.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the click data Haven component.

## Members

### Constants

### Fields

#### `public final Clickable ci`
- Role: Holds the ci state.
- Description: Backs the cached state for this file.

#### `public final Slot slot`
- Role: Holds the slot state.
- Description: Backs the cached state for this file.

### Methods

#### `public ClickData(Clickable ci, Slot slot)`
- Role: Creates a new ClickData instance.
- Description: Constructs the instance and initializes its default state.

#### `public Object[] array()`
- Role: Performs array.
- Description: Supports the array operation used by the surrounding class.

#### `public Object[] clickargs()`
- Role: Performs clickargs.
- Description: Supports the clickargs operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
