---
source: [GLTexture.java](../../../../../src/haven/render/gl/GLTexture.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLTexture

Provides GL backend support for gltexture.

## Nested Types

### Tex2D

- Role: Represents tex2 d within GLTexture.
- Description: Describes the nested tex2 d type used by the enclosing class.

### Tex2DArray

- Role: Represents tex2 darray within GLTexture.
- Description: Describes the nested tex2 darray type used by the enclosing class.

### Tex2DMS

- Role: Represents tex2 dms within GLTexture.
- Description: Describes the nested tex2 dms type used by the enclosing class.

### Tex3D

- Role: Represents tex3 d within GLTexture.
- Description: Describes the nested tex3 d type used by the enclosing class.

### TexCube

- Role: Represents tex cube within GLTexture.
- Description: Describes the nested tex cube type used by the enclosing class.

## Members

### Constants

### Fields

#### `protected int id, state = 0`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

#### `protected int id, state = 0`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

#### `Collection<GLFrameBuffer> fbos = null`
- Role: Caches fbos entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final WeakReference<Texture2D> desc`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `Sampler2D sampler`
- Role: Holds the sampler state.
- Description: Backs the cached state for this file.

#### `private final WeakReference<Texture3D> desc`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `Sampler3D sampler`
- Role: Holds the sampler state.
- Description: Backs the cached state for this file.

#### `private final WeakReference<Texture2DArray> desc`
- Role: Caches desc entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Sampler2DArray sampler`
- Role: Caches sampler entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final WeakReference<Texture2DMS> desc`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `private final WeakReference<TextureCube> desc`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `SamplerCube sampler`
- Role: Holds the sampler state.
- Description: Backs the cached state for this file.

### Methods

#### `public GLTexture(GLEnvironment env)`
- Role: Creates a new GLTexture instance.
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

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `protected void dispose0()`
- Role: Performs dispose0.
- Description: Supports the dispose0 operation used by the surrounding class.

#### `public abstract void bind(BGL gl)`
- Role: Performs bind.
- Description: Supports the bind operation used by the surrounding class.

#### `public abstract void unbind(BGL gl)`
- Role: Performs unbind.
- Description: Supports the unbind operation used by the surrounding class.

#### `static int magfilter(Sampler smp)`
- Role: Performs magfilter.
- Description: Supports the magfilter operation used by the surrounding class.

#### `static int minfilter(Sampler smp)`
- Role: Performs minfilter.
- Description: Supports the minfilter operation used by the surrounding class.

#### `static int wrapmode(Texture.Wrapping w)`
- Role: Performs wrapmode.
- Description: Supports the wrapmode operation used by the surrounding class.

#### `public static boolean glattribint(NumberFormat fmt)`
- Role: Performs glattribint.
- Description: Supports the glattribint operation used by the surrounding class.

#### `static int texifmt(Texture data)`
- Role: Performs texifmt.
- Description: Supports the texifmt operation used by the surrounding class.

#### `static int texefmt1(VectorFormat ifmt, VectorFormat efmt, Swizzle perm)`
- Role: Performs texefmt1.
- Description: Supports the texefmt1 operation used by the surrounding class.

#### `static int texefmt2(VectorFormat ifmt, VectorFormat efmt)`
- Role: Performs texefmt2.
- Description: Supports the texefmt2 operation used by the surrounding class.

#### `static int texface(TextureCube.Face face)`
- Role: Performs texface.
- Description: Supports the texface operation used by the surrounding class.

#### `public abstract Texture desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public Tex2D(GLEnvironment env, Texture2D data, FillBuffers.Array[] pixels)`
- Role: Performs tex2 d.
- Description: Supports the tex2 d operation used by the surrounding class.

#### `public static Tex2D create(GLEnvironment env, Texture2D data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(Sampler2D data)`
- Role: Performs setsampler.
- Description: Supports the setsampler operation used by the surrounding class.

#### `public void bind(BGL gl)`
- Role: Performs bind.
- Description: Supports the bind operation used by the surrounding class.

#### `public void unbind(BGL gl)`
- Role: Performs unbind.
- Description: Supports the unbind operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Texture2D desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public Tex3D(GLEnvironment env, Texture3D data, FillBuffers.Array[] pixels)`
- Role: Performs tex3 d.
- Description: Supports the tex3 d operation used by the surrounding class.

#### `public static Tex3D create(GLEnvironment env, Texture3D data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(Sampler3D data)`
- Role: Performs setsampler.
- Description: Supports the setsampler operation used by the surrounding class.

#### `public void bind(BGL gl)`
- Role: Performs bind.
- Description: Supports the bind operation used by the surrounding class.

#### `public void unbind(BGL gl)`
- Role: Performs unbind.
- Description: Supports the unbind operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Texture3D desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public Tex2DArray(GLEnvironment env, Texture2DArray data, FillBuffers.Array[][] pixels)`
- Role: Performs tex2 darray.
- Description: Supports the tex2 darray operation used by the surrounding class.

#### `public static Tex2DArray create(GLEnvironment env, Texture2DArray data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(Sampler2DArray data)`
- Role: Performs setsampler.
- Description: Supports the setsampler operation used by the surrounding class.

#### `public void bind(BGL gl)`
- Role: Performs bind.
- Description: Supports the bind operation used by the surrounding class.

#### `public void unbind(BGL gl)`
- Role: Performs unbind.
- Description: Supports the unbind operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Texture2DArray desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public Tex2DMS(GLEnvironment env, Texture2DMS data)`
- Role: Performs tex2 dms.
- Description: Supports the tex2 dms operation used by the surrounding class.

#### `public static Tex2DMS create(GLEnvironment env, Texture2DMS data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(Sampler2DMS data)`
- Role: Performs setsampler.
- Description: Supports the setsampler operation used by the surrounding class.

#### `public void bind(BGL gl)`
- Role: Performs bind.
- Description: Supports the bind operation used by the surrounding class.

#### `public void unbind(BGL gl)`
- Role: Performs unbind.
- Description: Supports the unbind operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Texture2DMS desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public TexCube(GLEnvironment env, TextureCube data, CubeImage[] images, FillBuffers.Array[] pixels)`
- Role: Performs tex cube.
- Description: Supports the tex cube operation used by the surrounding class.

#### `public static TexCube create(GLEnvironment env, TextureCube data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(SamplerCube data)`
- Role: Performs setsampler.
- Description: Supports the setsampler operation used by the surrounding class.

#### `public void bind(BGL gl)`
- Role: Performs bind.
- Description: Supports the bind operation used by the surrounding class.

#### `public void unbind(BGL gl)`
- Role: Performs unbind.
- Description: Supports the unbind operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public TextureCube desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.
