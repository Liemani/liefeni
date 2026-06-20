---
source: [GLRender.java](../../../../../src/haven/render/gl/GLRender.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLRender

Provides GL backend support for glrender.

## Members

### Constants

### Fields

#### `public final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `BufferBGL gl = null`
- Role: Stores the gl value.
- Description: Backs the cached state for this file.

#### `final Applier state`
- Role: Holds the state state.
- Description: Backs the cached state for this file.

#### `Applier init = null`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

#### `private final GLEnvironment.Sequence seq`
- Role: Holds the seq state.
- Description: Backs the cached state for this file.

#### `private final AtomicBoolean disposed = new AtomicBoolean(false)`
- Role: Tracks the disposed flag.
- Description: Supports the atomic boolean operation used by the surrounding class.

### Methods

#### `GLRender(GLEnvironment env)`
- Role: Creates a new GLRender instance.
- Description: Constructs the instance and initializes its default state.

#### `public GLEnvironment env()`
- Role: Performs env.
- Description: Supports the env operation used by the surrounding class.

#### `BGL gl()`
- Role: Performs gl.
- Description: Supports the gl operation used by the surrounding class.

#### `public static int glmode(Model.Mode mode)`
- Role: Performs glmode.
- Description: Supports the glmode operation used by the surrounding class.

#### `public static int glattribfmt(NumberFormat fmt)`
- Role: Performs glattribfmt.
- Description: Supports the glattribfmt operation used by the surrounding class.

#### `public static boolean glattribnorm(NumberFormat fmt)`
- Role: Performs glattribnorm.
- Description: Supports the glattribnorm operation used by the surrounding class.

#### `public static int glindexfmt(NumberFormat fmt)`
- Role: Performs glindexfmt.
- Description: Supports the glindexfmt operation used by the surrounding class.

#### `public static int glsamplertarget(Type type)`
- Role: Performs glsamplertarget.
- Description: Supports the glsamplertarget operation used by the surrounding class.

#### `public void submit(Render gsub)`
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

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> fill)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> fill, int from, int to)`
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

#### `public void submit(BGL.Request req)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
