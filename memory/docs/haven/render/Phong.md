# Phong

This file documents the responsibilities and members of `Phong`.

## Meta

- Source: [Phong.java](../../../../src/haven/render/Phong.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents Phong shading state.

## Nested Types

### CelShade

- Description: TODO

### DoLight

- Description: TODO

## Members

### Constants

#### `public static final Struct s_material = Struct.make(new Symbol.Shared("material"),`

- Description: TODO

#### `public static final Function celramp = new Function.Def(VEC3)`

- Description: TODO

### Fields

#### `private final Uniform material`

- Description: TODO

#### `public final GValue bcol = new GValue(VEC3), scol = new GValue(VEC3)`

- Description: TODO

#### `public final GValue bcol = new GValue(VEC3), scol = new GValue(VEC3)`

- Description: TODO

#### `public final boolean pfrag`

- Description: TODO

#### `private final ProgramContext prog`

- Description: TODO

#### `private final Expression vert, edir, norm`

- Description: TODO

#### `private final Expression vert, edir, norm`

- Description: TODO

#### `private final Expression vert, edir, norm`

- Description: TODO

#### `public final boolean dif, spc`

- Description: TODO

#### `public final boolean dif, spc`

- Description: TODO

#### `public final Expression ls = param(IN, s_light).ref()`

- Description: TODO

#### `public final Expression i = param(IN, INT).ref()`

- Description: TODO

#### `public final Expression vert = param(IN, VEC3).ref()`

- Description: TODO

#### `public final Expression edir = param(IN, VEC3).ref()`

- Description: TODO

#### `public final Expression norm = param(IN, VEC3).ref()`

- Description: TODO

#### `public final LValue diff = param(INOUT, VEC3).ref()`

- Description: TODO

#### `public final LValue spec = param(INOUT, VEC3).ref()`

- Description: TODO

#### `public final Expression mat = material.ref()`

- Description: TODO

#### `public final Expression shine = fref(mat, "shine")`

- Description: TODO

#### `public final Value lvl, dir, dl, sl`

- Description: TODO

#### `public final Value lvl, dir, dl, sl`

- Description: TODO

#### `public final Value lvl, dir, dl, sl`

- Description: TODO

#### `public final Value lvl, dir, dl, sl`

- Description: TODO

#### `public final ValBlock dvals = new ValBlock()`

- Description: TODO

#### `public final ValBlock svals = new ValBlock()`

- Description: TODO

#### `private final OrderList<Runnable> mods = new OrderList<Runnable>()`

- Description: TODO

#### `public Block dcalc, scalc`

- Description: TODO

#### `public Block dcalc, scalc`

- Description: TODO

#### `public Statement dcurs, scurs`

- Description: TODO

#### `public Statement dcurs, scurs`

- Description: TODO

#### `public final DoLight dolight`

- Description: TODO

### Methods

#### `public CelShade(boolean dif, boolean spc)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `private DoLight()`

- Description: TODO

#### `protected void cons()`

- Description: TODO

#### `public void mod(Runnable mod, int order)`

- Description: TODO

#### `public void cons1()`

- Description: TODO

#### `public void cons2(Block blk)`

- Description: TODO

#### `private void fmod(final FragmentContext fctx, final Expression bcol, final Expression scol)`

- Description: TODO

#### `public Phong(VertexContext vctx, Uniform.Data<?> material)`

- Description: TODO

#### `public Phong(FragmentContext fctx, Uniform.Data<?> material)`

- Description: TODO
