---
source: [GLFrameBuffer.java](../../../../../src/haven/render/gl/GLFrameBuffer.java)
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
- Role: Holds the color state.
- Description: Backs the cached state for this file.

#### `public final Attachment depth`
- Role: Holds the depth state.
- Description: Backs the cached state for this file.

#### `public final Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `public final VectorFormat[] cfmt`
- Role: Holds the cfmt state.
- Description: Backs the cached state for this file.

#### `public final VectorFormat dfmt`
- Role: Holds the dfmt state.
- Description: Backs the cached state for this file.

#### `public final GLTexture tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `public final int level, w, h`
- Role: Stores the h value.
- Description: Backs the cached state for this file.

#### `public final int level, w, h`
- Role: Stores the h value.
- Description: Backs the cached state for this file.

#### `public final int level, w, h`
- Role: Stores the h value.
- Description: Backs the cached state for this file.

### Methods

#### `public GLFrameBuffer(GLEnvironment env, Attachment[] color, Attachment depth)`
- Role: Creates a new GLFrameBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `public int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `private void register(GLTexture tex)`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `private void register()`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `private void unregister(GLTexture tex)`
- Role: Performs unregister.
- Description: Supports the unregister operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public FormatException(String message, GLFrameBuffer fbo)`
- Role: Performs format exception.
- Description: Supports the format exception operation used by the surrounding class.

#### `public Attachment(GLTexture tex)`
- Role: Performs attachment.
- Description: Supports the attachment operation used by the surrounding class.

#### `public abstract void attach(BGL gl, GLFrameBuffer fbo, int point)`
- Role: Performs attach.
- Description: Supports the attach operation used by the surrounding class.

#### `public abstract Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public Attach2D(GLTexture.Tex2D tex, Texture.Image<Texture2D> img)`
- Role: Performs attach2 d.
- Description: Supports the attach2 d operation used by the surrounding class.

#### `public void attach(BGL gl, GLFrameBuffer fbo, int point)`
- Role: Performs attach.
- Description: Supports the attach operation used by the surrounding class.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static Attachment prepimg(GLEnvironment env, Texture.Image<?> img)`
- Role: Performs prepimg.
- Description: Supports the prepimg operation used by the surrounding class.
