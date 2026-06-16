# Render

This file documents the responsibilities and members of `Render`.

## Meta

- Source: [Render.java](../../../../src/haven/render/Render.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the render render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public Environment env()`
- Role: Performs env.
- Description: Supports the env operation used by the surrounding class.

#### `public void submit(Render sub)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public void draw(Pipe pipe, Model data)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void clear(Pipe pipe, FragData buf, FColor val)`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public void clear(Pipe pipe, double val)`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> data)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`
- Role: Performs pget.
- Description: Supports the pget operation used by the surrounding class.

#### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`
- Role: Performs pget.
- Description: Supports the pget operation used by the surrounding class.

#### `public void timestamp(Consumer<Long> callback)`
- Role: Performs timestamp.
- Description: Supports the timestamp operation used by the surrounding class.

#### `public void fence(Runnable callback)`
- Role: Performs fence.
- Description: Supports the fence operation used by the surrounding class.

#### `public default void draw1(Pipe pipe, Model data)`
- Role: Performs draw1.
- Description: Supports the draw1 operation used by the surrounding class.

#### `public default void draw(Pipe pipe, Model.Mode mode, short[] ind, VertexArray.Layout fmt, int n, float[] data)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public default void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, Consumer<ByteBuffer> callback)`
- Role: Performs pget.
- Description: Supports the pget operation used by the surrounding class.

#### `public default void pget(Texture.Image img, VectorFormat fmt, Consumer<ByteBuffer> callback)`
- Role: Performs pget.
- Description: Supports the pget operation used by the surrounding class.
