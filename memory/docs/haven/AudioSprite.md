# AudioSprite

This file documents the responsibilities and members of `AudioSprite`.

## Meta

- Source: [AudioSprite.java](../../../src/haven/AudioSprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Binds audio behavior to sprite logic.

## Nested Types

### Ambience

- Description: TODO

### ClipSprite

- Description: TODO

### RepeatSprite

- Description: TODO

## Members

### Constants

#### `public static final Sprite.Factory fact = new Sprite.Factory()`

- Description: TODO

### Fields

#### `public final ActAudio.PosClip clip`

- Description: TODO

#### `private boolean done = false`

- Description: TODO

#### `private ActAudio.PosClip clip`

- Description: TODO

#### `private final Audio.Clip end`

- Description: TODO

#### `private final Collection<RenderTree.Slot> slots = new ArrayList<>(1)`

- Description: TODO

#### `public final RenderTree.Node amb`

- Description: TODO

### Methods

#### `public static List<Audio.Clip> clips(Resource res, String id)`

- Description: TODO

#### `public static Audio.Clip randoom(Resource res, String id)`

- Description: TODO

#### `public ClipSprite(Owner owner, Resource res, Audio.Clip clip)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public RepeatSprite(Owner owner, Resource res, Audio.Clip beg, List<Audio.Clip> clips, Audio.Clip end)`

- Description: TODO

#### `private void parts(RenderTree.Slot slot)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public void delete()`

- Description: TODO

#### `public Ambience(Owner owner, Resource res)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO
