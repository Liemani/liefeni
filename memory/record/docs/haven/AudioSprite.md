---
source: [AudioSprite.java](../../../../src/haven/AudioSprite.java)
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
- Role: Implements the fact operation.
- Description: Implements the factory operation.
- Value: `new Sprite.Factory()`

### Fields

#### `public final ActAudio.PosClip clip`
- Role: Caches the clip value.
- Description: Caches the `clip` value for reuse.

#### `private boolean done = false`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `private ActAudio.PosClip clip`
- Role: Caches the clip value.
- Description: Caches the `clip` value for reuse.

#### `private final Audio.Clip end`
- Role: Caches the end value.
- Description: Caches the `end` value for reuse.

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`
- Role: Implements the slots operation.
- Description: Implements the private final collection<render tree.slot> slots = new array list<>(1) operation.

#### `public final RenderTree.Node amb`
- Role: Caches the amb value.
- Description: Caches the `amb` value for reuse.

### Methods

#### `public static List<Audio.Clip> clips(Resource res, String id)`
- Role: Handles the clips path.
- Description: Implements the clips operation.

#### `public static Audio.Clip randoom(Resource res, String id)`
- Role: Handles the randoom path.
- Description: Implements the randoom operation.

#### `public ClipSprite(Owner owner, Resource res, Audio.Clip clip)`
- Role: Handles the clip sprite path.
- Description: Implements the clip sprite operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public RepeatSprite(Owner owner, Resource res, Audio.Clip beg, List<Audio.Clip> clips, Audio.Clip end)`
- Role: Handles the repeat sprite path.
- Description: Implements the repeat sprite operation.

#### `private void parts(RenderTree.Slot slot)`
- Role: Handles the parts path.
- Description: Implements the parts operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void delete()`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `public Ambience(Owner owner, Resource res)`
- Role: Handles the ambience path.
- Description: Implements the ambience operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.