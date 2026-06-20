---
source: [Phong.java](../../../../src/haven/render/Phong.java)
created: 2026-06-13
updated: 2026-06-14
---

# Phong

Defines the phong render pipeline component.

## Nested Types

### CelShade

- Role: Represents cel shade within Phong.
- Description: Describes the nested cel shade type used by the enclosing class.

### DoLight

- Role: Represents do light within Phong.
- Description: Describes the nested do light type used by the enclosing class.

## Members

### Constants

#### `public static final Struct s_material = Struct.make(new Symbol.Shared("material"),`
- Role: Defines the shared s material constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Function celramp = new Function.Def(VEC3)`
- Role: Defines the shared celramp constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Uniform material`
- Role: Holds the material state.
- Description: Backs the cached state for this file.

#### `public final GValue bcol = new GValue(VEC3), scol = new GValue(VEC3)`
- Role: Holds the bcol state.
- Description: Backs the cached state for this file.

#### `public final GValue bcol = new GValue(VEC3), scol = new GValue(VEC3)`
- Role: Holds the bcol state.
- Description: Backs the cached state for this file.

#### `public final boolean pfrag`
- Role: Tracks the pfrag flag.
- Description: Supports the pfrag operation used by the surrounding class.

#### `private final ProgramContext prog`
- Role: Stores the prog value.
- Description: Backs the cached state for this file.

#### `private final Expression vert, edir, norm`
- Role: Holds the norm state.
- Description: Backs the cached state for this file.

#### `private final Expression vert, edir, norm`
- Role: Holds the norm state.
- Description: Backs the cached state for this file.

#### `private final Expression vert, edir, norm`
- Role: Holds the norm state.
- Description: Backs the cached state for this file.

#### `public final boolean dif, spc`
- Role: Tracks the spc flag.
- Description: Supports the spc operation used by the surrounding class.

#### `public final boolean dif, spc`
- Role: Tracks the spc flag.
- Description: Supports the spc operation used by the surrounding class.

#### `public final Expression ls = param(IN, s_light).ref()`
- Role: Holds the ls state.
- Description: Backs the cached state for this file.

#### `public final Expression i = param(IN, INT).ref()`
- Role: Holds the i state.
- Description: Backs the cached state for this file.

#### `public final Expression vert = param(IN, VEC3).ref()`
- Role: Holds the vert state.
- Description: Backs the cached state for this file.

#### `public final Expression edir = param(IN, VEC3).ref()`
- Role: Holds the edir state.
- Description: Backs the cached state for this file.

#### `public final Expression norm = param(IN, VEC3).ref()`
- Role: Holds the norm state.
- Description: Backs the cached state for this file.

#### `public final LValue diff = param(INOUT, VEC3).ref()`
- Role: Holds the diff state.
- Description: Backs the cached state for this file.

#### `public final LValue spec = param(INOUT, VEC3).ref()`
- Role: Holds the spec state.
- Description: Backs the cached state for this file.

#### `public final Expression mat = material.ref()`
- Role: Holds the mat state.
- Description: Backs the cached state for this file.

#### `public final Expression shine = fref(mat, "shine")`
- Role: Holds the shine state.
- Description: Backs the cached state for this file.

#### `public final Value lvl, dir, dl, sl`
- Role: Holds the sl state.
- Description: Backs the cached state for this file.

#### `public final Value lvl, dir, dl, sl`
- Role: Holds the sl state.
- Description: Backs the cached state for this file.

#### `public final Value lvl, dir, dl, sl`
- Role: Holds the sl state.
- Description: Backs the cached state for this file.

#### `public final Value lvl, dir, dl, sl`
- Role: Holds the sl state.
- Description: Backs the cached state for this file.

#### `public final ValBlock dvals = new ValBlock()`
- Role: Holds the dvals state.
- Description: Backs the cached state for this file.

#### `public final ValBlock svals = new ValBlock()`
- Role: Holds the svals state.
- Description: Backs the cached state for this file.

#### `private final OrderList<Runnable> mods = new OrderList<Runnable>()`
- Role: Caches mods entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Block dcalc, scalc`
- Role: Holds the scalc state.
- Description: Backs the cached state for this file.

#### `public Block dcalc, scalc`
- Role: Holds the scalc state.
- Description: Backs the cached state for this file.

#### `public Statement dcurs, scurs`
- Role: Holds the scurs state.
- Description: Backs the cached state for this file.

#### `public Statement dcurs, scurs`
- Role: Holds the scurs state.
- Description: Backs the cached state for this file.

#### `public final DoLight dolight`
- Role: Holds the dolight state.
- Description: Backs the cached state for this file.

### Methods

#### `public CelShade(boolean dif, boolean spc)`
- Role: Performs cel shade.
- Description: Supports the cel shade operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `private DoLight()`
- Role: Performs do light.
- Description: Supports the do light operation used by the surrounding class.

#### `protected void cons()`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void mod(Runnable mod, int order)`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public void cons1()`
- Role: Performs cons1.
- Description: Supports the cons1 operation used by the surrounding class.

#### `public void cons2(Block blk)`
- Role: Performs cons2.
- Description: Supports the cons2 operation used by the surrounding class.

#### `private void fmod(final FragmentContext fctx, final Expression bcol, final Expression scol)`
- Role: Performs fmod.
- Description: Supports the fmod operation used by the surrounding class.

#### `public Phong(VertexContext vctx, Uniform.Data<?> material)`
- Role: Creates a new Phong instance.
- Description: Constructs the instance and initializes its default state.

#### `public Phong(FragmentContext fctx, Uniform.Data<?> material)`
- Role: Creates a new Phong instance.
- Description: Constructs the instance and initializes its default state.
