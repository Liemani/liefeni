---
source: [ClickLocation.java](../../../../src/haven/ClickLocation.java)
created: 2026-06-13
updated: 2026-06-14
---

# ClickLocation

Carries 2D click coordinates through the render pipeline and into the fragment shader.

## Nested Types

### LocData

- Role: Provides vertex-buffer data for click-location coordinates.
- Description: Stores 2D float vertex data for the location attribute used by the shader.

## Members

### Constants

#### `public static final Slot<ClickLocation> tex = new Slot<>(Slot.Type.SYS, ClickLocation.class)`
- Role: Stores the active click-location state in the render pipe.
- Description: Lets shaders recover the image backing the click coordinate buffer.
- Value: `new Slot<>(Slot.Type.SYS, ClickLocation.class)`

#### `public static final FragData fragloc = new FragData(Type.VEC2, "fragloc", p -> p.get(tex).image, tex)`
- Role: Exposes the fragment target for click coordinates.
- Description: Binds the destination texture image where the shader writes the click location.
- Value: `new FragData(Type.VEC2, "fragloc", p -> p.get(tex).image, tex)`

#### `public static final Attribute vertex = new Attribute(VEC2, "location")`
- Role: Names the vertex attribute that carries click coordinates.
- Description: The mesh supplies 2D location data under the `location` attribute.
- Value: `new Attribute(VEC2, "location")`

#### `public static final AutoVarying vertloc = new AutoVarying(VEC2)`
- Role: Bridges the vertex click coordinate into the fragment stage.
- Description: Passes the location attribute through a varying without extra transformation.
- Value: `new AutoVarying(VEC2)`

#### `private static final ShaderMacro shader = prog -> fragloc(prog.fctx).force()`
- Role: Forces the click-location fragment output into the active shader.
- Description: Ensures the shader writes the click coordinate into the target image.
- Value: `prog -> fragloc(prog.fctx).force()`

### Fields

#### `public final T image`
- Role: Stores the target image for click coordinates.
- Description: This is the fragment image written by the shader.

### Methods

#### `public ClickLocation(T image)`
- Role: Creates a new ClickLocation instance.
- Description: Constructs the ClickLocation instance from the supplied inputs.

#### `public void apply(Pipe p)`
- Role: Installs the click-location render state.
- Description: Makes the target image available to the shader pipeline.

#### `public static Value fragloc(FragmentContext fctx)`
- Role: Creates the fragment output that stores click coordinates.
- Description: Lazily installs a writable fragment value bound to `fragloc`.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro for click-location capture.
- Description: Produces the macro that writes the fragment coordinate output.

#### `public LocData(FloatBuffer data)`
- Role: Wraps vertex data for click locations.
- Description: Packs the 2D location buffer into the vertex attribute stream.
