# EnumInterval

This file documents the responsibilities and members of `EnumInterval`.

## Meta

- Source: [EnumInterval.java](../../../src/haven/EnumInterval.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the enum interval Haven component.

## Members

### Constants

### Fields

#### `private final Class<? extends E> cl`
- Role: Holds the cl state.
- Description: Backs the cached state for this file.

#### `private final E lo, hi`
- Role: Holds the hi state.
- Description: Backs the cached state for this file.

#### `private final E lo, hi`
- Role: Holds the hi state.
- Description: Backs the cached state for this file.

### Methods

#### `public EnumInterval(E lo, E hi)`
- Role: Creates a new EnumInterval instance.
- Description: Constructs the instance and initializes its default state.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public E get(int i)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public int indexOf(Object o)`
- Role: Performs index of.
- Description: Supports the index of operation used by the surrounding class.

#### `public boolean contains(Object o)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.
