# Light

This file documents the responsibilities and members of `Light`.

## Meta

- Source: [Light.java](../../../src/haven/Light.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a light source.

## Nested Types

### $cel

- Description: TODO

### $col

- Description: TODO

### $light

- Description: TODO

### CelShade

- Description: TODO

### LightList

- Description: TODO

### PhongLight

- Description: TODO

### Res

- Description: TODO

## Members

### Constants

#### `private static final float[] defamb =`

- Description: TODO

#### `private static final float[] defdif =`

- Description: TODO

#### `private static final float[] defspc =`

- Description: TODO

#### `public static final State.Slot<LightList> lights = new State.Slot<>(State.Slot.Type.SYS, LightList.class)`

- Description: TODO

#### `public static final State.Slot<PhongLight> lighting = new State.Slot<>(State.Slot.Type.DRAW, PhongLight.class)`

- Description: TODO

#### `public static final ShaderMacro vlight = prog -> new Phong(prog.vctx, new Uniform.Data<>(p -> p.get(lighting).material, lighting))`

- Description: TODO

#### `public static final ShaderMacro flight = prog -> new Phong(prog.fctx, new Uniform.Data<>(p -> p.get(lighting).material, lighting))`

- Description: TODO

#### `public static final FColor defamb = new FColor(0.2f, 0.2f, 0.2f)`

- Description: TODO

#### `public static final FColor defdif = new FColor(0.8f, 0.8f, 0.8f)`

- Description: TODO

#### `public static final FColor defspc = new FColor(0.0f, 0.0f, 0.0f)`

- Description: TODO

#### `public static final FColor defemi = new FColor(0.0f, 0.0f, 0.0f)`

- Description: TODO

#### `public static final Slot<CelShade> slot = new Slot<CelShade>(Slot.Type.DRAW, CelShade.class)`

- Description: TODO

#### `public static final CelShade celshade = new CelShade(true, false)`

- Description: TODO

### Fields

#### `public float[] amb, dif, spc`

- Description: TODO

#### `public float[] amb, dif, spc`

- Description: TODO

#### `public float[] amb, dif, spc`

- Description: TODO

#### `public int prio`

- Description: TODO

#### `public final List<RenderList.Slot<Light>> ll = new ArrayList<>()`

- Description: TODO

#### `private final ShaderMacro shader`

- Description: TODO

#### `private final Object[] material`

- Description: TODO

#### `private final ShaderMacro shader`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final Color amb, dif, spc`

- Description: TODO

#### `public final Color amb, dif, spc`

- Description: TODO

#### `public final Color amb, dif, spc`

- Description: TODO

#### `public boolean hatt, hexp`

- Description: TODO

#### `public boolean hatt, hexp`

- Description: TODO

#### `public float ac, al, aq, exp`

- Description: TODO

#### `public float ac, al, aq, exp`

- Description: TODO

#### `public float ac, al, aq, exp`

- Description: TODO

#### `public float ac, al, aq, exp`

- Description: TODO

#### `public Coord3f dir`

- Description: TODO

### Methods

#### `public Light()`

- Description: TODO

#### `public Light(FColor col)`

- Description: TODO

#### `public Light(Color col)`

- Description: TODO

#### `public Light(FColor amb, FColor dif, FColor spc)`

- Description: TODO

#### `public Light(Color amb, Color dif, Color spc)`

- Description: TODO

#### `public Light prio(int prio)`

- Description: TODO

#### `public abstract Object[] params(GroupPipe state)`

- Description: TODO

#### `public Object[][] params()`

- Description: TODO

#### `public State compile()`

- Description: TODO

#### `public void add(RenderList.Slot<Light> light)`

- Description: TODO

#### `public void remove(RenderList.Slot<Light> light)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public int index(Light l)`

- Description: TODO

#### `public void added(RenderTree.Slot slot)`

- Description: TODO

#### `public void removed(RenderTree.Slot slot)`

- Description: TODO

#### `public PhongLight(boolean frag, FColor amb, FColor dif, FColor spc, FColor emi, float shine)`

- Description: TODO

#### `public PhongLight(boolean frag, Color amb, Color dif, Color spc, Color emi, float shine)`

- Description: TODO

#### `public PhongLight(boolean frag, FColor col)`

- Description: TODO

#### `public PhongLight(boolean frag)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO

#### `public CelShade(boolean dif, boolean spc)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public void cons(Material.Buffer buf, Object... args)`

- Description: TODO

#### `private static Color cold(Message buf)`

- Description: TODO

#### `private static Color cold2(Message buf)`

- Description: TODO

#### `public Res(Resource res, Message buf)`

- Description: TODO

#### `public Light make()`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Integer layerid()`

- Description: TODO
