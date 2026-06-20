---
source: [Moving.java](../../../src/haven/Moving.java)
created: 2026-06-13
updated: 2026-06-14
---

# Moving

Represents the moving Haven component.

## Members

### Constants

### Fields

### Methods

#### `public Moving(Gob gob)`
- Role: Creates a new Moving instance.
- Description: Constructs the instance and initializes its default state.

#### `public void move(Coord2d c)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public abstract Coord3f getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public abstract double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `public Object staticp()`
- Role: Performs staticp.
- Description: Supports the staticp operation used by the surrounding class.
