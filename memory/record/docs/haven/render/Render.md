---
source: [Render.java](../../../../../src/haven/render/Render.java)
created: 2026-06-13
updated: 2026-06-20
---

# Render

Abstract render backend contract for drawing, clearing, data updates, pixel reads, and synchronization.

## Members

### Methods

#### `public Environment env()`
- Role: Returns the environment used by this render backend.

#### `public void submit(Render sub)`
- Role: Submits one render subtree or nested render target.

#### `public void draw(Pipe pipe, Model data)`
- Role: Draws one model with the supplied render state.

#### `public void clear(Pipe pipe, FragData buf, FColor val)`
- Role: Clears a fragment buffer to a color value.

#### `public void clear(Pipe pipe, double val)`
- Role: Clears the depth buffer or similar scalar buffer.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to)`
- Role: Updates part of a GPU buffer.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> data)`
- Role: Updates a GPU buffer from a complete filler.

#### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`
- Role: Reads back a region from a fragment buffer.

#### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`
- Role: Reads back a texture image.

#### `public void timestamp(Consumer<Long> callback)`
- Role: Returns a GPU timestamp or schedules a timestamp callback.

#### `public void fence(Runnable callback)`
- Role: Schedules a callback after pending GPU work finishes.

#### `public default void draw1(Pipe pipe, Model data)`
- Role: Draws one model and disposes it afterward.

#### `public default void draw(Pipe pipe, Model.Mode mode, short[] ind, VertexArray.Layout fmt, int n, float[] data)`
- Role: Convenience overload for building and drawing an ephemeral model.

#### `public default void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, Consumer<ByteBuffer> callback)`
- Role: Convenience overload that allocates the destination buffer.

#### `public default void pget(Texture.Image img, VectorFormat fmt, Consumer<ByteBuffer> callback)`
- Role: Convenience overload that allocates the destination buffer.

