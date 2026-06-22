---
source: [EnumInterval.java](../../../../src/haven/EnumInterval.java)
created: 2026-06-13
updated: 2026-06-14
---

# EnumInterval

Represents the enum interval Haven component.

## Members

### Constants

### Fields

#### `private final Class<? extends E> cl`
- Role: Caches the cl value.
- Description: Caches the `cl` value for reuse.

#### `private final E lo, hi`
- Role: Caches the hi value.
- Description: Caches the `hi` value for reuse.

#### `private final E lo, hi`
- Role: Caches the hi value.
- Description: Caches the `hi` value for reuse.

### Methods

#### `public EnumInterval(E lo, E hi)`
- Role: Creates a new EnumInterval instance.
- Description: Constructs the EnumInterval instance from the supplied inputs.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public E get(int i)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public int indexOf(Object o)`
- Role: Handles the index of path.
- Description: Implements the index of operation.

#### `public boolean contains(Object o)`
- Role: Handles the contains path.
- Description: Implements the contains operation.