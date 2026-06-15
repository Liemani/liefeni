# GLRender

This file documents the responsibilities and members of `GLRender`.

## Meta

- Source: [GLRender.java](../../../../../src/haven/render/gl/GLRender.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL render support.

## Members

### Constants

### Fields

#### `public final GLEnvironment env`

- Description: TODO

#### `BufferBGL gl = null`

- Description: TODO

#### `final Applier state`

- Description: TODO

#### `Applier init = null`

- Description: TODO

#### `private final GLEnvironment.Sequence seq`

- Description: TODO

#### `private final AtomicBoolean disposed = new AtomicBoolean(false)`

- Description: TODO

### Methods

#### `GLRender(GLEnvironment env)`

- Description: TODO

#### `public GLEnvironment env()`

- Description: TODO

#### `BGL gl()`

- Description: TODO

#### `public static int glmode(Model.Mode mode)`

- Description: TODO

#### `public static int glattribfmt(NumberFormat fmt)`

- Description: TODO

#### `public static boolean glattribnorm(NumberFormat fmt)`

- Description: TODO

#### `public static int glindexfmt(NumberFormat fmt)`

- Description: TODO

#### `public static int glsamplertarget(Type type)`

- Description: TODO

#### `public void submit(Render gsub)`

- Description: TODO

#### `public void draw(Pipe pipe, Model data)`

- Description: TODO

#### `public void clear(Pipe pipe, FragData buf, FColor val)`

- Description: TODO

#### `public void clear(Pipe pipe, double val)`

- Description: TODO

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> fill)`

- Description: TODO

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> fill, int from, int to)`

- Description: TODO

#### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`

- Description: TODO

#### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`

- Description: TODO

#### `public void timestamp(Consumer<Long> callback)`

- Description: TODO

#### `public void fence(Runnable callback)`

- Description: TODO

#### `public void submit(BGL.Request req)`

- Description: TODO

#### `public void dispose()`

- Description: TODO
