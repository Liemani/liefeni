---
source: [AudioSprite.java](../../../src/haven/AudioSprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# AudioSprite

Connects audio playback to sprite lifecycles.

## Nested Types

### Ambience

- Role: Represents ambience within AudioSprite.
- Description: Describes the nested ambience type used by the enclosing class.

### ClipSprite

- Role: Represents clip sprite within AudioSprite.
- Description: Describes the nested clip sprite type used by the enclosing class.

### RepeatSprite

- Role: Represents repeat sprite within AudioSprite.
- Description: Describes the nested repeat sprite type used by the enclosing class.

## Members

### Constants

#### `public static final Sprite.Factory fact = new Sprite.Factory()`
- Role: Defines the shared fact constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final ActAudio.PosClip clip`
- Role: Stores the clip value.
- Description: Backs the cached state for this file.

#### `private boolean done = false`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `private ActAudio.PosClip clip`
- Role: Stores the clip value.
- Description: Backs the cached state for this file.

#### `private final Audio.Clip end`
- Role: Stores the end value.
- Description: Backs the cached state for this file.

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final RenderTree.Node amb`
- Role: Stores the amb value.
- Description: Backs the cached state for this file.

### Methods

#### `public static List<Audio.Clip> clips(Resource res, String id)`
- Role: Performs clips.
- Description: Supports the clips operation used by the surrounding class.

#### `public static Audio.Clip randoom(Resource res, String id)`
- Role: Performs randoom.
- Description: Supports the randoom operation used by the surrounding class.

#### `public ClipSprite(Owner owner, Resource res, Audio.Clip clip)`
- Role: Performs clip sprite.
- Description: Supports the clip sprite operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public RepeatSprite(Owner owner, Resource res, Audio.Clip beg, List<Audio.Clip> clips, Audio.Clip end)`
- Role: Performs repeat sprite.
- Description: Supports the repeat sprite operation used by the surrounding class.

#### `private void parts(RenderTree.Slot slot)`
- Role: Performs parts.
- Description: Supports the parts operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void delete()`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `public Ambience(Owner owner, Resource res)`
- Role: Performs ambience.
- Description: Supports the ambience operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.
