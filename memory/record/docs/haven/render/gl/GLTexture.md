---
source: [GLTexture.java](../../../../../../src/haven/render/gl/GLTexture.java)
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
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `protected int id, state = 0`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `Collection<GLFrameBuffer> fbos = null`
- Role: Caches the fbos value.
- Description: Caches the `fbos` value for reuse.

#### `private final WeakReference<Texture2D> desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `Sampler2D sampler`
- Role: Caches the sampler value.
- Description: Caches the `sampler` value for reuse.

#### `private final WeakReference<Texture3D> desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `Sampler3D sampler`
- Role: Caches the sampler value.
- Description: Caches the `sampler` value for reuse.

#### `private final WeakReference<Texture2DArray> desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `Sampler2DArray sampler`
- Role: Caches the sampler value.
- Description: Caches the `sampler` value for reuse.

#### `private final WeakReference<Texture2DMS> desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `private final WeakReference<TextureCube> desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `SamplerCube sampler`
- Role: Caches the sampler value.
- Description: Caches the `sampler` value for reuse.

### Methods

#### `public GLTexture(GLEnvironment env)`
- Role: Creates a new GLTexture instance.
- Description: Constructs the GLTexture instance from the supplied inputs.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `public int glid()`
- Role: Handles the glid path.
- Description: Implements the glid operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLTexture for debugging and logging.

#### `protected void dispose0()`
- Role: Handles the dispose0 path.
- Description: Implements the dispose0 operation.

#### `public abstract void bind(BGL gl)`
- Role: Handles the bind path.
- Description: Implements the bind operation.

#### `public abstract void unbind(BGL gl)`
- Role: Handles the unbind path.
- Description: Implements the unbind operation.

#### `static int magfilter(Sampler smp)`
- Role: Handles the magfilter path.
- Description: Implements the magfilter operation.

#### `static int minfilter(Sampler smp)`
- Role: Handles the minfilter path.
- Description: Implements the minfilter operation.

#### `static int wrapmode(Texture.Wrapping w)`
- Role: Handles the wrapmode path.
- Description: Implements the wrapmode operation.

#### `public static boolean glattribint(NumberFormat fmt)`
- Role: Handles the glattribint path.
- Description: Implements the glattribint operation.

#### `static int texifmt(Texture data)`
- Role: Handles the texifmt path.
- Description: Implements the texifmt operation.

#### `static int texefmt1(VectorFormat ifmt, VectorFormat efmt, Swizzle perm)`
- Role: Handles the texefmt1 path.
- Description: Implements the texefmt1 operation.

#### `static int texefmt2(VectorFormat ifmt, VectorFormat efmt)`
- Role: Handles the texefmt2 path.
- Description: Implements the texefmt2 operation.

#### `static int texface(TextureCube.Face face)`
- Role: Handles the texface path.
- Description: Implements the texface operation.

#### `public abstract Texture desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public Tex2D(GLEnvironment env, Texture2D data, FillBuffers.Array[] pixels)`
- Role: Handles the tex2 d path.
- Description: Implements the tex2 d operation.

#### `public static Tex2D create(GLEnvironment env, Texture2D data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(Sampler2D data)`
- Role: Handles the setsampler path.
- Description: Updates the sampler.

#### `public void bind(BGL gl)`
- Role: Handles the bind path.
- Description: Implements the bind operation.

#### `public void unbind(BGL gl)`
- Role: Handles the unbind path.
- Description: Implements the unbind operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLTexture for debugging and logging.

#### `public Texture2D desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public Tex3D(GLEnvironment env, Texture3D data, FillBuffers.Array[] pixels)`
- Role: Handles the tex3 d path.
- Description: Implements the tex3 d operation.

#### `public static Tex3D create(GLEnvironment env, Texture3D data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(Sampler3D data)`
- Role: Handles the setsampler path.
- Description: Updates the sampler.

#### `public void bind(BGL gl)`
- Role: Handles the bind path.
- Description: Implements the bind operation.

#### `public void unbind(BGL gl)`
- Role: Handles the unbind path.
- Description: Implements the unbind operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLTexture for debugging and logging.

#### `public Texture3D desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public Tex2DArray(GLEnvironment env, Texture2DArray data, FillBuffers.Array[][] pixels)`
- Role: Handles the tex2 darray path.
- Description: Implements the tex2 d array operation.

#### `public static Tex2DArray create(GLEnvironment env, Texture2DArray data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(Sampler2DArray data)`
- Role: Handles the setsampler path.
- Description: Updates the sampler.

#### `public void bind(BGL gl)`
- Role: Handles the bind path.
- Description: Implements the bind operation.

#### `public void unbind(BGL gl)`
- Role: Handles the unbind path.
- Description: Implements the unbind operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLTexture for debugging and logging.

#### `public Texture2DArray desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public Tex2DMS(GLEnvironment env, Texture2DMS data)`
- Role: Handles the tex2 dms path.
- Description: Implements the tex2 dms operation.

#### `public static Tex2DMS create(GLEnvironment env, Texture2DMS data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(Sampler2DMS data)`
- Role: Handles the setsampler path.
- Description: Updates the sampler.

#### `public void bind(BGL gl)`
- Role: Handles the bind path.
- Description: Implements the bind operation.

#### `public void unbind(BGL gl)`
- Role: Handles the unbind path.
- Description: Implements the unbind operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLTexture for debugging and logging.

#### `public Texture2DMS desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public TexCube(GLEnvironment env, TextureCube data, CubeImage[] images, FillBuffers.Array[] pixels)`
- Role: Handles the texture cube path.
- Description: Implements the tex cube operation.

#### `public static TexCube create(GLEnvironment env, TextureCube data)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void setsampler(SamplerCube data)`
- Role: Handles the setsampler path.
- Description: Updates the sampler.

#### `public void bind(BGL gl)`
- Role: Handles the bind path.
- Description: Implements the bind operation.

#### `public void unbind(BGL gl)`
- Role: Handles the unbind path.
- Description: Implements the unbind operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLTexture for debugging and logging.

#### `public TextureCube desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.