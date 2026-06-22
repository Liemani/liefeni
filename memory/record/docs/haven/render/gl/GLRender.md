---
source: [GLRender.java](../../../../../../src/haven/render/gl/GLRender.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLRender

Provides GL backend support for glrender.

## Members

### Constants

### Fields

#### `public final GLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `BufferBGL gl = null`
- Role: Caches the gl value.
- Description: Caches the `gl` value for reuse.

#### `final Applier state`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `Applier init = null`
- Role: Caches the init value.
- Description: Caches the `init` value for reuse.

#### `private final GLEnvironment.Sequence seq`
- Role: Caches the seq value.
- Description: Caches the `seq` value for reuse.

#### `private final AtomicBoolean disposed = new AtomicBoolean(false)`
- Role: Tracks the disposed flag.
- Description: Implements the atomic boolean operation.

### Methods

#### `GLRender(GLEnvironment env)`
- Role: Creates a new GLRender instance.
- Description: Constructs the GLRender instance from the supplied inputs.

#### `public GLEnvironment env()`
- Role: Handles the env path.
- Description: Implements the env operation.

#### `BGL gl()`
- Role: Handles the gl path.
- Description: Implements the gl operation.

#### `public static int glmode(Model.Mode mode)`
- Role: Handles the glmode path.
- Description: Implements the glmode operation.

#### `public static int glattribfmt(NumberFormat fmt)`
- Role: Handles the glattribfmt path.
- Description: Implements the glattribfmt operation.

#### `public static boolean glattribnorm(NumberFormat fmt)`
- Role: Handles the glattribnorm path.
- Description: Implements the glattribnorm operation.

#### `public static int glindexfmt(NumberFormat fmt)`
- Role: Handles the glindexfmt path.
- Description: Implements the glindexfmt operation.

#### `public static int glsamplertarget(Type type)`
- Role: Handles the glsamplertarget path.
- Description: Implements the glsamplertarget operation.

#### `public void submit(Render gsub)`
- Role: Handles the submit path.
- Description: Implements the submit operation.

#### `public void draw(Pipe pipe, Model data)`
- Role: Draws the current content.
- Description: Draws the GLRender content.

#### `public void clear(Pipe pipe, FragData buf, FColor val)`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public void clear(Pipe pipe, double val)`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.Filler<? super T> fill)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public <T extends DataBuffer> void update(T buf, DataBuffer.PartFiller<? super T> fill, int from, int to)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`
- Role: Handles the pget path.
- Description: Implements the pget operation.

#### `public void pget(Texture.Image img, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`
- Role: Handles the pget path.
- Description: Implements the pget operation.

#### `public void timestamp(Consumer<Long> callback)`
- Role: Handles the timestamp path.
- Description: Implements the timestamp operation.

#### `public void fence(Runnable callback)`
- Role: Handles the fence path.
- Description: Implements the fence operation.

#### `public void submit(BGL.Request req)`
- Role: Handles the submit path.
- Description: Implements the submit operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.