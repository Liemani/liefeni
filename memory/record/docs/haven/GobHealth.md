---
source: [GobHealth.java](../../../../src/haven/GobHealth.java)
created: 2026-06-13
updated: 2026-06-14
---

# GobHealth

Represents the gob health Haven component.

## Nested Types

### $health

- Role: Applies gob health updates from the object cache.
- Description: Delta decoder that reads the health byte and installs a GobHealth attribute.

## Members

### Constants

### Fields

#### `public final float hp`
- Role: Caches the hp value.
- Description: Caches the `hp` value for reuse.

#### `public final Pipe.Op fx`
- Role: Caches the fx value.
- Description: Caches the `fx` value for reuse.

### Methods

#### `public GobHealth(Gob g, float hp)`
- Role: Creates a new GobHealth instance.
- Description: Constructs the GobHealth instance from the supplied inputs.

#### `public Pipe.Op gobstate()`
- Role: Handles the gobstate path.
- Description: Implements the gobstate operation.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.