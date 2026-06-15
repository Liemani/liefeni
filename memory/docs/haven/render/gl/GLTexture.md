# GLTexture

This file documents the responsibilities and members of `GLTexture`.

## Meta

- Source: [GLTexture.java](../../../../../src/haven/render/gl/GLTexture.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a GL texture.

## Nested Types

### Tex2D

- Description: TODO

### Tex2DArray

- Description: TODO

### Tex2DMS

- Description: TODO

### Tex3D

- Description: TODO

### TexCube

- Description: TODO

## Members

### Constants

### Fields

#### `protected int id, state = 0`

- Description: TODO

#### `protected int id, state = 0`

- Description: TODO

#### `Collection<GLFrameBuffer> fbos = null`

- Description: TODO

#### `private final WeakReference<Texture2D> desc`

- Description: TODO

#### `Sampler2D sampler`

- Description: TODO

#### `private final WeakReference<Texture3D> desc`

- Description: TODO

#### `Sampler3D sampler`

- Description: TODO

#### `private final WeakReference<Texture2DArray> desc`

- Description: TODO

#### `Sampler2DArray sampler`

- Description: TODO

#### `private final WeakReference<Texture2DMS> desc`

- Description: TODO

#### `private final WeakReference<TextureCube> desc`

- Description: TODO

#### `SamplerCube sampler`

- Description: TODO

### Methods

#### `public GLTexture(GLEnvironment env)`

- Description: TODO

#### `public void create(GL gl)`

- Description: TODO

#### `protected void delete(GL gl)`

- Description: TODO

#### `public int glid()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `protected void dispose0()`

- Description: TODO

#### `public abstract void bind(BGL gl)`

- Description: TODO

#### `public abstract void unbind(BGL gl)`

- Description: TODO

#### `static int magfilter(Sampler smp)`

- Description: TODO

#### `static int minfilter(Sampler smp)`

- Description: TODO

#### `static int wrapmode(Texture.Wrapping w)`

- Description: TODO

#### `public static boolean glattribint(NumberFormat fmt)`

- Description: TODO

#### `static int texifmt(Texture data)`

- Description: TODO

#### `static int texefmt1(VectorFormat ifmt, VectorFormat efmt, Swizzle perm)`

- Description: TODO

#### `static int texefmt2(VectorFormat ifmt, VectorFormat efmt)`

- Description: TODO

#### `static int texface(TextureCube.Face face)`

- Description: TODO

#### `public abstract Texture desc()`

- Description: TODO

#### `public Tex2D(GLEnvironment env, Texture2D data, FillBuffers.Array[] pixels)`

- Description: TODO

#### `public static Tex2D create(GLEnvironment env, Texture2D data)`

- Description: TODO

#### `public void setsampler(Sampler2D data)`

- Description: TODO

#### `public void bind(BGL gl)`

- Description: TODO

#### `public void unbind(BGL gl)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Texture2D desc()`

- Description: TODO

#### `public Tex3D(GLEnvironment env, Texture3D data, FillBuffers.Array[] pixels)`

- Description: TODO

#### `public static Tex3D create(GLEnvironment env, Texture3D data)`

- Description: TODO

#### `public void setsampler(Sampler3D data)`

- Description: TODO

#### `public void bind(BGL gl)`

- Description: TODO

#### `public void unbind(BGL gl)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Texture3D desc()`

- Description: TODO

#### `public Tex2DArray(GLEnvironment env, Texture2DArray data, FillBuffers.Array[][] pixels)`

- Description: TODO

#### `public static Tex2DArray create(GLEnvironment env, Texture2DArray data)`

- Description: TODO

#### `public void setsampler(Sampler2DArray data)`

- Description: TODO

#### `public void bind(BGL gl)`

- Description: TODO

#### `public void unbind(BGL gl)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Texture2DArray desc()`

- Description: TODO

#### `public Tex2DMS(GLEnvironment env, Texture2DMS data)`

- Description: TODO

#### `public static Tex2DMS create(GLEnvironment env, Texture2DMS data)`

- Description: TODO

#### `public void setsampler(Sampler2DMS data)`

- Description: TODO

#### `public void bind(BGL gl)`

- Description: TODO

#### `public void unbind(BGL gl)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Texture2DMS desc()`

- Description: TODO

#### `public TexCube(GLEnvironment env, TextureCube data, CubeImage[] images, FillBuffers.Array[] pixels)`

- Description: TODO

#### `public static TexCube create(GLEnvironment env, TextureCube data)`

- Description: TODO

#### `public void setsampler(SamplerCube data)`

- Description: TODO

#### `public void bind(BGL gl)`

- Description: TODO

#### `public void unbind(BGL gl)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public TextureCube desc()`

- Description: TODO
