---
source: [Phong.java](../../../../../src/haven/render/Phong.java)
created: 2026-06-13
updated: 2026-06-14
---

# Phong

Defines the phong render pipeline component.

## Nested Types

### CelShade

- Role: Builds cel-shading lighting code.
- Description: Generates the shader variant that quantizes lighting into bands.

### DoLight

- Role: Assembles per-fragment lighting code.
- Description: Builds the lighting expressions that combine material and light state.

## Members

### Constants

#### `public static final Struct s_material = Struct.make(new Symbol.Shared("material"),`
- Role: Implements the s material operation.
- Description: Implements the shared operation.
- Value: `Struct.make(new Symbol.Shared("material"),`

#### `public static final Function celramp = new Function.Def(VEC3)`
- Role: Implements the celramp operation.
- Description: Implements the def operation.
- Value: `new Function.Def(VEC3)`

### Fields

#### `private final Uniform material`
- Role: Caches the material value.
- Description: Caches the `material` value for reuse.

#### `public final GValue bcol = new GValue(VEC3), scol = new GValue(VEC3)`
- Role: Implements the bcol operation.
- Description: Implements the g value operation.

#### `public final GValue bcol = new GValue(VEC3), scol = new GValue(VEC3)`
- Role: Implements the bcol operation.
- Description: Implements the g value operation.

#### `public final boolean pfrag`
- Role: Tracks the pfrag flag.
- Description: Caches the `pfrag` value for reuse.

#### `private final ProgramContext prog`
- Role: Caches the prog value.
- Description: Caches the `prog` value for reuse.

#### `private final Expression vert, edir, norm`
- Role: Caches the norm value.
- Description: Caches the `norm` value for reuse.

#### `private final Expression vert, edir, norm`
- Role: Caches the norm value.
- Description: Caches the `norm` value for reuse.

#### `private final Expression vert, edir, norm`
- Role: Caches the norm value.
- Description: Caches the `norm` value for reuse.

#### `public final boolean dif, spc`
- Role: Tracks the spc flag.
- Description: Caches the `spc` value for reuse.

#### `public final boolean dif, spc`
- Role: Tracks the spc flag.
- Description: Caches the `spc` value for reuse.

#### `public final Expression ls = param(IN, s_light).ref()`
- Role: Implements the ls operation.
- Description: Implements the ref operation.

#### `public final Expression i = param(IN, INT).ref()`
- Role: Implements the i operation.
- Description: Implements the ref operation.

#### `public final Expression vert = param(IN, VEC3).ref()`
- Role: Implements the vert operation.
- Description: Implements the ref operation.

#### `public final Expression edir = param(IN, VEC3).ref()`
- Role: Implements the edir operation.
- Description: Implements the ref operation.

#### `public final Expression norm = param(IN, VEC3).ref()`
- Role: Implements the norm operation.
- Description: Implements the ref operation.

#### `public final LValue diff = param(INOUT, VEC3).ref()`
- Role: Implements the diff operation.
- Description: Implements the ref operation.

#### `public final LValue spec = param(INOUT, VEC3).ref()`
- Role: Implements the spec operation.
- Description: Implements the ref operation.

#### `public final Expression mat = material.ref()`
- Role: Implements the mat operation.
- Description: Implements the ref operation.

#### `public final Expression shine = fref(mat, "shine")`
- Role: Implements the shine operation.
- Description: Implements the fref operation.

#### `public final Value lvl, dir, dl, sl`
- Role: Caches the sl value.
- Description: Caches the `sl` value for reuse.

#### `public final Value lvl, dir, dl, sl`
- Role: Caches the sl value.
- Description: Caches the `sl` value for reuse.

#### `public final Value lvl, dir, dl, sl`
- Role: Caches the sl value.
- Description: Caches the `sl` value for reuse.

#### `public final Value lvl, dir, dl, sl`
- Role: Caches the sl value.
- Description: Caches the `sl` value for reuse.

#### `public final ValBlock dvals = new ValBlock()`
- Role: Implements the dvals operation.
- Description: Implements the val block operation.

#### `public final ValBlock svals = new ValBlock()`
- Role: Implements the svals operation.
- Description: Implements the val block operation.

#### `private final OrderList<Runnable> mods = new OrderList<Runnable>()`
- Role: Implements the mods operation.
- Description: Implements the private final order list<runnable> mods = new order list<runnable>() operation.

#### `public Block dcalc, scalc`
- Role: Caches the scalc value.
- Description: Caches the `scalc` value for reuse.

#### `public Block dcalc, scalc`
- Role: Caches the scalc value.
- Description: Caches the `scalc` value for reuse.

#### `public Statement dcurs, scurs`
- Role: Caches the scurs value.
- Description: Caches the `scurs` value for reuse.

#### `public Statement dcurs, scurs`
- Role: Caches the scurs value.
- Description: Caches the `scurs` value for reuse.

#### `public final DoLight dolight`
- Role: Caches the dolight value.
- Description: Caches the `dolight` value for reuse.

### Methods

#### `public CelShade(boolean dif, boolean spc)`
- Role: Handles the cel shade path.
- Description: Implements the cel shade operation.

#### `public void modify(ProgramContext prog)`
- Role: Handles the modify path.
- Description: Implements the modify operation.

#### `private DoLight()`
- Role: Handles the do light path.
- Description: Implements the do light operation.

#### `protected void cons()`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public void mod(Runnable mod, int order)`
- Role: Handles the mod path.
- Description: Implements the mod operation.

#### `public void cons1()`
- Role: Handles the cons1 path.
- Description: Implements the cons1 operation.

#### `public void cons2(Block blk)`
- Role: Handles the cons2 path.
- Description: Implements the cons2 operation.

#### `private void fmod(final FragmentContext fctx, final Expression bcol, final Expression scol)`
- Role: Handles the fmod path.
- Description: Implements the fmod operation.

#### `public Phong(VertexContext vctx, Uniform.Data<?> material)`
- Role: Creates a new Phong instance.
- Description: Constructs the Phong instance from the supplied inputs.

#### `public Phong(FragmentContext fctx, Uniform.Data<?> material)`
- Role: Creates a new Phong instance.
- Description: Constructs the Phong instance from the supplied inputs.