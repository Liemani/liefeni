---
source: [Light.java](../../../../src/haven/Light.java)
created: 2026-06-13
updated: 2026-06-14
---

# Light

Describes lights, light lists, and the shader state used for scene lighting.

## Nested Types

### $cel

- Role: Builds the cel-shading shader helper.
- Description: Provides the cel-shading variant of the lighting pipeline.

### $col

- Role: Builds a color-based light helper.
- Description: Provides shader support for lighting from color input.

### $light

- Role: Builds the standard light helper.
- Description: Provides the base lighting shader state used by the render pipeline.

### CelShade

- Role: Represents a cel-shading render state.
- Description: Controls whether cel shading is applied and whether outlines are emphasized.

### LightList

- Role: Collects lights for one render tree branch.
- Description: Stores light slots sorted by priority so the shader can consume them.

### PhongLight

- Role: Carries the lighting material for Phong shading.
- Description: Supplies ambient, diffuse, specular, and attenuation parameters to the shader.

### Res

- Role: Loads light definitions from a resource layer.
- Description: Parses resource data into a `Light` instance or related helper.

## Members

### Constants

#### `private static final float[] defamb =`
- Role: Caches the defamb value.
- Description: Caches the `defamb` value for reuse.
- Value: ``

#### `private static final float[] defdif =`
- Role: Caches the defdif value.
- Description: Caches the `defdif` value for reuse.
- Value: ``

#### `private static final float[] defspc =`
- Role: Caches the defspc value.
- Description: Caches the `defspc` value for reuse.
- Value: ``

#### `public static final State.Slot<LightList> lights = new State.Slot<>(State.Slot.Type.SYS, LightList.class)`
- Role: Stores the current light list in the render pipe.
- Description: Lets the shader fetch all active lights for the current branch.
- Value: `new State.Slot<>(State.Slot.Type.SYS, LightList.class)`

#### `public static final State.Slot<PhongLight> lighting = new State.Slot<>(State.Slot.Type.DRAW, PhongLight.class)`
- Role: Stores the active Phong light material in the draw pipe.
- Description: Supplies the shader with the current light parameters.
- Value: `new State.Slot<>(State.Slot.Type.DRAW, PhongLight.class)`

#### `public static final ShaderMacro vlight = prog -> new Phong(prog.vctx, new Uniform.Data<>(p -> p.get(lighting).material, lighting))`
- Role: Installs the vertex lighting shader.
- Description: Builds a Phong shader that uses the current light material in the vertex stage.
- Value: `prog -> new Phong(prog.vctx, new Uniform.Data<>(p -> p.get(lighting).material, lighting))`

#### `public static final ShaderMacro flight = prog -> new Phong(prog.fctx, new Uniform.Data<>(p -> p.get(lighting).material, lighting))`
- Role: Installs the fragment lighting shader.
- Description: Builds a Phong shader that uses the current light material in the fragment stage.
- Value: `prog -> new Phong(prog.fctx, new Uniform.Data<>(p -> p.get(lighting).material, lighting))`

#### `public static final FColor defamb = new FColor(0.2f, 0.2f, 0.2f)`
- Role: Defines the default ambient light color.
- Description: Used when a light does not specify an explicit ambient term.
- Value: `new FColor(0.2f, 0.2f, 0.2f)`

#### `public static final FColor defdif = new FColor(0.8f, 0.8f, 0.8f)`
- Role: Defines the default diffuse light color.
- Description: Used when a light does not specify an explicit diffuse term.
- Value: `new FColor(0.8f, 0.8f, 0.8f)`

#### `public static final FColor defspc = new FColor(0.0f, 0.0f, 0.0f)`
- Role: Defines the default specular light color.
- Description: Used when a light does not specify an explicit specular term.
- Value: `new FColor(0.0f, 0.0f, 0.0f)`

#### `public static final FColor defemi = new FColor(0.0f, 0.0f, 0.0f)`
- Role: Defines the default emission color.
- Description: Used when a light contributes no emission term.
- Value: `new FColor(0.0f, 0.0f, 0.0f)`

#### `public static final Slot<CelShade> slot = new Slot<CelShade>(Slot.Type.DRAW, CelShade.class)`
- Role: Stores the active cel-shading state.
- Description: Lets the shader read whether cel shading is enabled.
- Value: `new Slot<CelShade>(Slot.Type.DRAW, CelShade.class)`

#### `public static final CelShade celshade = new CelShade(true, false)`
- Role: Provides the default cel-shading state.
- Description: Enables cel shading with the default outline behavior.
- Value: `new CelShade(true, false)`

### Fields

#### `public float[] amb, dif, spc`
- Role: Caches the spc value.
- Description: Caches the `spc` value for reuse.

#### `public float[] amb, dif, spc`
- Role: Caches the spc value.
- Description: Caches the `spc` value for reuse.

#### `public float[] amb, dif, spc`
- Role: Caches the spc value.
- Description: Caches the `spc` value for reuse.

#### `public int prio`
- Role: Caches the prio value.
- Description: Caches the `prio` value for reuse.

#### `public final List<RenderList.Slot<Light>> ll = new ArrayList<>()`
- Role: Implements the ll operation.
- Description: Implements the public final list<render list.slot<light>> ll = new array list<>() operation.

#### `private final ShaderMacro shader`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.

#### `private final Object[] material`
- Role: Caches the material value.
- Description: Caches the `material` value for reuse.

#### `private final ShaderMacro shader`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Color amb, dif, spc`
- Role: Caches the spc value.
- Description: Caches the `spc` value for reuse.

#### `public final Color amb, dif, spc`
- Role: Caches the spc value.
- Description: Caches the `spc` value for reuse.

#### `public final Color amb, dif, spc`
- Role: Caches the spc value.
- Description: Caches the `spc` value for reuse.

#### `public boolean hatt, hexp`
- Role: Tracks the hexp flag.
- Description: Caches the `hexp` value for reuse.

#### `public boolean hatt, hexp`
- Role: Tracks the hexp flag.
- Description: Caches the `hexp` value for reuse.

#### `public float ac, al, aq, exp`
- Role: Caches the exp value.
- Description: Caches the `exp` value for reuse.

#### `public float ac, al, aq, exp`
- Role: Caches the exp value.
- Description: Caches the `exp` value for reuse.

#### `public float ac, al, aq, exp`
- Role: Caches the exp value.
- Description: Caches the `exp` value for reuse.

#### `public float ac, al, aq, exp`
- Role: Caches the exp value.
- Description: Caches the `exp` value for reuse.

#### `public Coord3f dir`
- Role: Caches the dir value.
- Description: Caches the `dir` value for reuse.

### Methods

#### `public Light()`
- Role: Creates a light with default colors.
- Description: Initializes ambient, diffuse, and specular terms from the default constants.

#### `public Light(FColor col)`
- Role: Creates a monochrome light.
- Description: Uses one color for the ambient, diffuse, and specular terms.

#### `public Light(Color col)`
- Role: Creates a monochrome light from an AWT color.
- Description: Converts the color into the light's ambient, diffuse, and specular terms.

#### `public Light(FColor amb, FColor dif, FColor spc)`
- Role: Creates a light from explicit color terms.
- Description: Stores separate ambient, diffuse, and specular colors.

#### `public Light(Color amb, Color dif, Color spc)`
- Role: Creates a light from explicit AWT color terms.
- Description: Converts the supplied colors into the internal float representation.

#### `public Light prio(int prio)`
- Role: Sets the light priority.
- Description: Returns the same light after updating its sort priority.

#### `public abstract Object[] params(GroupPipe state)`
- Role: Handles the params path.
- Description: Implements the params operation.

#### `public Object[][] params()`
- Role: Handles the params path.
- Description: Implements the params operation.

#### `public State compile()`
- Role: Handles the compile path.
- Description: Implements the compile operation.

#### `public void add(RenderList.Slot<Light> light)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(RenderList.Slot<Light> light)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public int index(Light l)`
- Role: Handles the index path.
- Description: Implements the index operation.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public PhongLight(boolean frag, FColor amb, FColor dif, FColor spc, FColor emi, float shine)`
- Role: Handles the phong light path.
- Description: Implements the phong light operation.

#### `public PhongLight(boolean frag, Color amb, Color dif, Color spc, Color emi, float shine)`
- Role: Handles the phong light path.
- Description: Implements the phong light operation.

#### `public PhongLight(boolean frag, FColor col)`
- Role: Handles the phong light path.
- Description: Implements the phong light operation.

#### `public PhongLight(boolean frag)`
- Role: Handles the phong light path.
- Description: Implements the phong light operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public CelShade(boolean dif, boolean spc)`
- Role: Handles the cel shade path.
- Description: Implements the cel shade operation.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `private static Color cold(Message buf)`
- Role: Handles the cold path.
- Description: Implements the cold operation.

#### `private static Color cold2(Message buf)`
- Role: Handles the cold2 path.
- Description: Implements the cold2 operation.

#### `public Res(Resource res, Message buf)`
- Role: Handles the resource path.
- Description: Implements the res operation.

#### `public Light make()`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public Integer layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.
