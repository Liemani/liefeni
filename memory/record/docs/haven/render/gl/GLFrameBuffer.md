---
source: [GLFrameBuffer.java](../../../../../../src/haven/render/gl/GLFrameBuffer.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLFrameBuffer

Provides GL backend support for glframe buffer.

## Nested Types

### Attach2D

- Role: Represents attach2 d within GLFrameBuffer.
- Description: Describes the nested attach2 d type used by the enclosing class.

### Attachment

- Role: Represents attachment within GLFrameBuffer.
- Description: Describes the nested attachment type used by the enclosing class.

### FormatException

- Role: Represents format exception within GLFrameBuffer.
- Description: Describes the nested format exception type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Attachment[] color`
- Role: Caches the color value.
- Description: Caches the `color` value for reuse.

#### `public final Attachment depth`
- Role: Caches the depth value.
- Description: Caches the `depth` value for reuse.

#### `public final Coord sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Coord sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `public final VectorFormat[] cfmt`
- Role: Caches the cfmt value.
- Description: Caches the `cfmt` value for reuse.

#### `public final VectorFormat dfmt`
- Role: Caches the dfmt value.
- Description: Caches the `dfmt` value for reuse.

#### `public final GLTexture tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public final int level, w, h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `public final int level, w, h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `public final int level, w, h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

### Methods

#### `public GLFrameBuffer(GLEnvironment env, Attachment[] color, Attachment depth)`
- Role: Creates a new GLFrameBuffer instance.
- Description: Constructs the GLFrameBuffer instance from the supplied inputs.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `public int glid()`
- Role: Handles the glid path.
- Description: Implements the glid operation.

#### `private void register(GLTexture tex)`
- Role: Handles the register path.
- Description: Implements the register operation.

#### `private void register()`
- Role: Handles the register path.
- Description: Implements the register operation.

#### `private void unregister(GLTexture tex)`
- Role: Handles the unregister path.
- Description: Implements the unregister operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public FormatException(String message, GLFrameBuffer fbo)`
- Role: Handles the format exception path.
- Description: Implements the format exception operation.

#### `public Attachment(GLTexture tex)`
- Role: Handles the attachment path.
- Description: Implements the attachment operation.

#### `public abstract void attach(BGL gl, GLFrameBuffer fbo, int point)`
- Role: Adds another output stream to receive copied bytes.
- Description: Adds another output stream to receive copied bytes.

#### `public abstract Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public Attach2D(GLTexture.Tex2D tex, Texture.Image<Texture2D> img)`
- Role: Handles the attach2 d path.
- Description: Implements the attach2 d operation.

#### `public void attach(BGL gl, GLFrameBuffer fbo, int point)`
- Role: Adds another output stream to receive copied bytes.
- Description: Adds another output stream to receive copied bytes.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static Attachment prepimg(GLEnvironment env, Texture.Image<?> img)`
- Role: Handles the prepimg path.
- Description: Implements the prepimg operation.