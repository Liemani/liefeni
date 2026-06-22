---
source: [Drawable.java](../../../../src/haven/Drawable.java)
created: 2026-06-13
updated: 2026-06-14
---

# Drawable

Provides gob-attached drawable state and placement lookup for renderable attributes.

## Members

### Constants

### Fields

#### `protected Gob.Placer placer = null`
- Role: Caches the gob placement strategy.
- Description: Stores the resolved placer used to anchor this drawable in world space.

### Methods

#### `public Drawable(Gob gob)`
- Role: Binds this drawable to a gob.
- Description: Attaches the attribute to the owning gob so render code can resolve placement from it.

#### `public abstract Resource getres()`
- Role: Returns the backing resource.
- Description: Exposes the resource whose placement metadata drives this drawable.

#### `private MCache.SurfaceID getsurf(String surf)`
- Role: Resolves a surface identifier.
- Description: Maps a placement surface name such as `map` or `trn` to the corresponding `MCache.SurfaceID`.

#### `public Gob.Placer placer()`
- Role: Returns the resolved gob placer.
- Description: Lazily builds and caches the placement strategy used to position the gob on the map.

#### `public void gtick(Render g)`
- Role: Provides the per-frame drawable update hook.
- Description: Subclasses override this to refresh transient render state before the next frame is drawn.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Drawable for debugging and logging.
