# SIterator

This file documents the responsibilities and members of `SIterator`.

## Meta

- Source: [SIterator.java](../../../src/haven/SIterator.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the siterator Haven component.

## Members

### Constants

### Fields

#### `private int st = 0`
- Role: Stores the st value.
- Description: Backs the cached state for this file.

#### `private T n`
- Role: Holds the n state.
- Description: Backs the cached state for this file.

### Methods

#### `public abstract T snext() throws NoSuchElementException`
- Role: Handles the snext workflow.
- Description: Supports the snext operation used by the surrounding class.

#### `private void ref()`
- Role: Performs ref.
- Description: Supports the ref operation used by the surrounding class.

#### `public boolean hasNext()`
- Role: Checks whether the next.
- Description: Returns a boolean result for the described condition.

#### `public T next()`
- Role: Performs next.
- Description: Supports the next operation used by the surrounding class.

#### `public void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.
