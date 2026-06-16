# Clickable

This file documents the responsibilities and members of `Clickable`.

## Meta

- Source: [Clickable.java](../../../src/haven/Clickable.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the clickable Haven component.

## Members

### Constants

#### `public static final Slot<Clickable> slot = new Slot<Clickable>(Slot.Type.DRAW, Clickable.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public Object[] clickargs(ClickData cd)`
- Role: Performs clickargs.
- Description: Supports the clickargs operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
