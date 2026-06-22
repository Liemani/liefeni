---
source: [FragID.java](../../../../../src/haven/render/FragID.java)
created: 2026-06-13
updated: 2026-06-14
---

# FragID

Carries a fragment identifier through the render pipeline.

## Nested Types

### ID

- Role: Stores one fragment-id value.
- Description: Holds the integer id written into the fragment output path.

## Members

### Constants

#### `public static final Slot<FragID> tex = new Slot<>(Slot.Type.SYS, FragID.class)`
- Role: Stores the active fragment-id image state.
- Description: Lets the shader write the selected id into a texture image.
- Value: `new Slot<>(Slot.Type.SYS, FragID.class)`

#### `public static final Slot<ID> id = new Slot<>(Slot.Type.DRAW, ID.class)`
- Role: Stores the per-draw fragment-id source.
- Description: Carries the integer id used for instance selection and picking.
- Value: `new Slot<>(Slot.Type.DRAW, ID.class)`

#### `public static final FragData fragid = new FragData(Type.INT, "fragid", p -> p.get(tex).image, tex)`
- Role: Exposes the fragment-id image to the shader.
- Description: Binds the output image that receives the selected id.
- Value: `new FragData(Type.INT, "fragid", p -> p.get(tex).image, tex)`

#### `private static final InstancedUniform uid = new InstancedUniform.Int("id", p ->`
- Role: Exposes the per-instance integer id.
- Description: Uploads the id value as instanced shader data.
- Value: `new InstancedUniform.Int("id", p ->`

#### `static final Instancer<ID> instancer = new Instancer<ID>()`
- Role: Provides instanced fragment-id state.
- Description: Reuses one instancer to supply the id state.
- Value: `new Instancer<ID>()`

#### `public static final AutoVarying transfer = new AutoVarying(Type.INT)`
- Role: Transfers the fragment id through the shader pipeline.
- Description: Carries the id into the fragment stage.
- Value: `new AutoVarying(Type.INT)`

#### `private static final ShaderMacro shader = prog -> fragid(prog.fctx).force()`
- Role: Forces the fragment-id shader hook.
- Description: Ensures the shader writes the active id output.
- Value: `prog -> fragid(prog.fctx).force()`

### Fields

#### `public final T image`
- Role: Stores the output image for fragment ids.
- Description: This image receives the selected fragment identifier.

#### `public final int val`
- Role: Stores the id value.
- Description: Carries the fragment identifier for this instance.

### Methods

#### `public FragID(T image)`
- Role: Stores one fragment-id binding.
- Description: Wraps a texture image used to derive fragment identifiers.

#### `public ID(int val)`
- Role: Stores one fragment id value.
- Description: Carries the integer identifier written to the fragment pipeline.

#### `public ShaderMacro shader()`
- Role: Returns the fragment-id shader macro.
- Description: Produces the shader hook that writes the active id.

#### `public void apply(Pipe p)`
- Role: Installs fragment-id state into the pipe.
- Description: Makes the id output image visible to the shader pipeline.

#### `public int hashCode()`
- Role: Returns the hash code of the fragment-id state.
- Description: Hashes the wrapped id value for instancing comparisons.

#### `public boolean equals(Object o)`
- Role: Compares fragment-id states by wrapped value.
- Description: Treats two states as equal when they carry the same id.

#### `public InstancedAttribute[] attribs()`
- Role: Exposes the instanced id attribute.
- Description: Returns the shader attribute used for per-instance ids.

#### `public static Value fragid(FragmentContext fctx)`
- Role: Creates the fragment-id output value.
- Description: Lazily installs the fragment output bound to `fragid`.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.
