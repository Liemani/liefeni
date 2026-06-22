---
source: [Avatar.java](../../../../src/haven/Avatar.java)
created: 2026-06-13
updated: 2026-06-14
---

# Avatar

Represents the avatar Haven component.

## Nested Types

### $avatar

- Role: Decodes avatar layer deltas from `OCache`.
- Description: Reads layer ids from the network message and applies them to the gob's `Avatar` attribute.

## Members

### Constants

### Fields

#### `public List<Indir<Resource>> layers = null`
- Role: Caches the layers value.
- Description: Caches the `layers` value for reuse.

#### `private List<Resource.Image> images = null`
- Role: Caches the images value.
- Description: Caches the `images` value for reuse.

### Methods

#### `public Avatar(Gob gob)`
- Role: Creates a new Avatar instance.
- Description: Constructs the Avatar instance from the supplied inputs.

#### `void setlayers(List<Indir<Resource>> layers)`
- Role: Handles the setlayers path.
- Description: Updates the layers.

#### `public List<Resource.Image> images()`
- Role: Handles the images path.
- Description: Implements the images operation.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.