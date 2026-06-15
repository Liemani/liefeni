# GLFrameBuffer

This file documents the responsibilities and members of `GLFrameBuffer`.

## Meta

- Source: [GLFrameBuffer.java](../../../../../src/haven/render/gl/GLFrameBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a GL framebuffer.

## Nested Types

### Attach2D

- Description: TODO

### Attachment

- Description: TODO

### FormatException

- Description: TODO

## Members

### Constants

### Fields

#### `public final Attachment[] color`

- Description: TODO

#### `public final Attachment depth`

- Description: TODO

#### `public final Coord sz`

- Description: TODO

#### `private int id`

- Description: TODO

#### `public final Coord sz`

- Description: TODO

#### `public final VectorFormat[] cfmt`

- Description: TODO

#### `public final VectorFormat dfmt`

- Description: TODO

#### `public final GLTexture tex`

- Description: TODO

#### `public final int level, w, h`

- Description: TODO

#### `public final int level, w, h`

- Description: TODO

#### `public final int level, w, h`

- Description: TODO

### Methods

#### `public GLFrameBuffer(GLEnvironment env, Attachment[] color, Attachment depth)`

- Description: TODO

#### `public void create(GL gl)`

- Description: TODO

#### `protected void delete(GL gl)`

- Description: TODO

#### `public int glid()`

- Description: TODO

#### `private void register(GLTexture tex)`

- Description: TODO

#### `private void register()`

- Description: TODO

#### `private void unregister(GLTexture tex)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public FormatException(String message, GLFrameBuffer fbo)`

- Description: TODO

#### `public Attachment(GLTexture tex)`

- Description: TODO

#### `public abstract void attach(BGL gl, GLFrameBuffer fbo, int point)`

- Description: TODO

#### `public abstract Coord sz()`

- Description: TODO

#### `public Attach2D(GLTexture.Tex2D tex, Texture.Image<Texture2D> img)`

- Description: TODO

#### `public void attach(BGL gl, GLFrameBuffer fbo, int point)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public static Attachment prepimg(GLEnvironment env, Texture.Image<?> img)`

- Description: TODO
