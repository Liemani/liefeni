---
source: [DrawList.java](../../../../../src/haven/render/DrawList.java)
created: 2026-06-13
updated: 2026-06-14
---

# DrawList

Defines the draw list render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public void draw(Render out)`
- Role: Issues the draw pass.
- Description: Renders all queued draw commands into the provided renderer.

#### `public default String stats()`
- Role: Reports draw-list stats.
- Description: Returns a human-readable summary of the current list state.

#### `public default DrawList desc(Object desc)`
- Role: Attaches a debug description.
- Description: Stores a label or debug object for diagnostics.