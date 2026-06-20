---
source: [Light.java](../../../src/haven/Light.java)
created: 2026-06-13
updated: 2026-06-14
---

# Light

Represents the light Haven component.

## Nested Types

### $cel

- Role: Represents $cel within Light.
- Description: Describes the nested $cel type used by the enclosing class.

### $col

- Role: Represents $col within Light.
- Description: Describes the nested $col type used by the enclosing class.

### $light

- Role: Represents $light within Light.
- Description: Describes the nested $light type used by the enclosing class.

### CelShade

- Role: Represents cel shade within Light.
- Description: Describes the nested cel shade type used by the enclosing class.

### LightList

- Role: Represents light list within Light.
- Description: Describes the nested light list type used by the enclosing class.

### PhongLight

- Role: Represents phong light within Light.
- Description: Describes the nested phong light type used by the enclosing class.

### Res

- Role: Represents res within Light.
- Description: Describes the nested res type used by the enclosing class.

## Members

### Constants

#### `private static final float[] defamb =`
- Role: Defines the shared light constant.
- Description: Shared constant used by the rest of the class.

#### `private static final float[] defdif =`
- Role: Defines the shared light constant.
- Description: Shared constant used by the rest of the class.

#### `private static final float[] defspc =`
- Role: Defines the shared light constant.
- Description: Shared constant used by the rest of the class.

#### `public static final State.Slot<LightList> lights = new State.Slot<>(State.Slot.Type.SYS, LightList.class)`
- Role: Defines the shared lights constant.
- Description: Shared constant used by the rest of the class.

#### `public static final State.Slot<PhongLight> lighting = new State.Slot<>(State.Slot.Type.DRAW, PhongLight.class)`
- Role: Defines the shared lighting constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ShaderMacro vlight = prog -> new Phong(prog.vctx, new Uniform.Data<>(p -> p.get(lighting).material, lighting))`
- Role: Defines the shared vlight constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ShaderMacro flight = prog -> new Phong(prog.fctx, new Uniform.Data<>(p -> p.get(lighting).material, lighting))`
- Role: Defines the shared flight constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor defamb = new FColor(0.2f, 0.2f, 0.2f)`
- Role: Defines the shared defamb constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor defdif = new FColor(0.8f, 0.8f, 0.8f)`
- Role: Defines the shared defdif constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor defspc = new FColor(0.0f, 0.0f, 0.0f)`
- Role: Defines the shared defspc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FColor defemi = new FColor(0.0f, 0.0f, 0.0f)`
- Role: Defines the shared defemi constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<CelShade> slot = new Slot<CelShade>(Slot.Type.DRAW, CelShade.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final CelShade celshade = new CelShade(true, false)`
- Role: Defines the shared celshade constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public float[] amb, dif, spc`
- Role: Stores the spc value.
- Description: Backs the cached state for this file.

#### `public float[] amb, dif, spc`
- Role: Stores the spc value.
- Description: Backs the cached state for this file.

#### `public float[] amb, dif, spc`
- Role: Stores the spc value.
- Description: Backs the cached state for this file.

#### `public int prio`
- Role: Stores the prio value.
- Description: Backs the cached state for this file.

#### `public final List<RenderList.Slot<Light>> ll = new ArrayList<>()`
- Role: Caches ll entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final ShaderMacro shader`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `private final Object[] material`
- Role: Holds the material state.
- Description: Backs the cached state for this file.

#### `private final ShaderMacro shader`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Color amb, dif, spc`
- Role: Stores the spc value.
- Description: Backs the cached state for this file.

#### `public final Color amb, dif, spc`
- Role: Stores the spc value.
- Description: Backs the cached state for this file.

#### `public final Color amb, dif, spc`
- Role: Stores the spc value.
- Description: Backs the cached state for this file.

#### `public boolean hatt, hexp`
- Role: Tracks the hexp flag.
- Description: Supports the hexp operation used by the surrounding class.

#### `public boolean hatt, hexp`
- Role: Tracks the hexp flag.
- Description: Supports the hexp operation used by the surrounding class.

#### `public float ac, al, aq, exp`
- Role: Stores the exp value.
- Description: Backs the cached state for this file.

#### `public float ac, al, aq, exp`
- Role: Stores the exp value.
- Description: Backs the cached state for this file.

#### `public float ac, al, aq, exp`
- Role: Stores the exp value.
- Description: Backs the cached state for this file.

#### `public float ac, al, aq, exp`
- Role: Stores the exp value.
- Description: Backs the cached state for this file.

#### `public Coord3f dir`
- Role: Stores the dir value.
- Description: Backs the cached state for this file.

### Methods

#### `public Light()`
- Role: Creates a new Light instance.
- Description: Constructs the instance and initializes its default state.

#### `public Light(FColor col)`
- Role: Creates a new Light instance.
- Description: Constructs the instance and initializes its default state.

#### `public Light(Color col)`
- Role: Creates a new Light instance.
- Description: Constructs the instance and initializes its default state.

#### `public Light(FColor amb, FColor dif, FColor spc)`
- Role: Creates a new Light instance.
- Description: Constructs the instance and initializes its default state.

#### `public Light(Color amb, Color dif, Color spc)`
- Role: Creates a new Light instance.
- Description: Constructs the instance and initializes its default state.

#### `public Light prio(int prio)`
- Role: Performs prio.
- Description: Supports the prio operation used by the surrounding class.

#### `public abstract Object[] params(GroupPipe state)`
- Role: Performs params.
- Description: Supports the params operation used by the surrounding class.

#### `public Object[][] params()`
- Role: Performs params.
- Description: Supports the params operation used by the surrounding class.

#### `public State compile()`
- Role: Performs compile.
- Description: Supports the compile operation used by the surrounding class.

#### `public void add(RenderList.Slot<Light> light)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(RenderList.Slot<Light> light)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public int index(Light l)`
- Role: Performs index.
- Description: Supports the index operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public PhongLight(boolean frag, FColor amb, FColor dif, FColor spc, FColor emi, float shine)`
- Role: Performs phong light.
- Description: Supports the phong light operation used by the surrounding class.

#### `public PhongLight(boolean frag, Color amb, Color dif, Color spc, Color emi, float shine)`
- Role: Performs phong light.
- Description: Supports the phong light operation used by the surrounding class.

#### `public PhongLight(boolean frag, FColor col)`
- Role: Performs phong light.
- Description: Supports the phong light operation used by the surrounding class.

#### `public PhongLight(boolean frag)`
- Role: Performs phong light.
- Description: Supports the phong light operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public CelShade(boolean dif, boolean spc)`
- Role: Performs cel shade.
- Description: Supports the cel shade operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `private static Color cold(Message buf)`
- Role: Performs cold.
- Description: Supports the cold operation used by the surrounding class.

#### `private static Color cold2(Message buf)`
- Role: Performs cold2.
- Description: Supports the cold2 operation used by the surrounding class.

#### `public Res(Resource res, Message buf)`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public Light make()`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.
