# Render

This file documents the responsibilities and members of `Render`.

## Meta

- Source: [Render.java](../../../../src/haven/render/Render.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides render execution support.

## Members

### Constants

### Fields

### Methods

#### `public Environment env()`

- Description: TODO

#### `public void submit(Render sub)`

- Description: TODO

#### `public void draw(Pipe pipe, Model data)`

- Description: TODO

#### `public void clear(Pipe pipe, FragData buf, FColor val)`

- Description: TODO

#### `public void clear(Pipe pipe, double val)`

- Description: TODO

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to)`

- Description: TODO

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> data)`

- Description: TODO

#### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`

- Description: TODO

#### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`

- Description: TODO

#### `public void timestamp(Consumer<Long> callback)`

- Description: TODO

#### `public void fence(Runnable callback)`

- Description: TODO

#### `public default void draw1(Pipe pipe, Model data)`

- Description: TODO

#### `public default void draw(Pipe pipe, Model.Mode mode, short[] ind, VertexArray.Layout fmt, int n, float[] data)`

- Description: TODO

#### `public default void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, Consumer<ByteBuffer> callback)`

- Description: TODO

#### `public default void pget(Texture.Image img, VectorFormat fmt, Consumer<ByteBuffer> callback)`

- Description: TODO
