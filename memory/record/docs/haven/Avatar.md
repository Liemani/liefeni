---
source: [Avatar.java](../../../src/haven/Avatar.java)
created: 2026-06-13
updated: 2026-06-14
---

# Avatar

Represents the avatar Haven component.

## Nested Types

### $avatar

- Role: Represents $avatar within Avatar.
- Description: Describes the nested $avatar type used by the enclosing class.

## Members

### Constants

### Fields

#### `public List<Indir<Resource>> layers = null`
- Role: Caches layers entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private List<Resource.Image> images = null`
- Role: Caches images entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Avatar(Gob gob)`
- Role: Creates a new Avatar instance.
- Description: Constructs the instance and initializes its default state.

#### `void setlayers(List<Indir<Resource>> layers)`
- Role: Performs setlayers.
- Description: Supports the setlayers operation used by the surrounding class.

#### `public List<Resource.Image> images()`
- Role: Performs images.
- Description: Supports the images operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
