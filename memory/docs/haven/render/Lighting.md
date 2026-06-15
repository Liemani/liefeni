# Lighting

This file documents the responsibilities and members of `Lighting`.

## Meta

- Source: [Lighting.java](../../../../src/haven/render/Lighting.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents lighting state.

## Nested Types

### Compiler

- Description: TODO

### GridLights

- Description: TODO

### Params

- Description: TODO

### Shader

- Description: TODO

## Members

### Constants

#### `public static final State.Slot<State> lights = new State.Slot<>(State.Slot.Type.SYS, State.class)`

- Description: TODO

#### `public static final Struct s_light = Struct.make(new Symbol.Shared("light"),`

- Description: TODO

#### `public static final boolean unroll = true`

- Description: TODO

#### `public static final int defmax = 4`

- Description: TODO

#### `public static final boolean visnlights = false`

- Description: TODO

#### `public static final boolean stats = false`

- Description: TODO

#### `public static final int defmax = 16`

- Description: TODO

#### `private static final Hash<short[]> sahash = new Hash<short[]>()`

- Description: TODO

#### `private static final Coord3f[] clipcorn =`

- Description: TODO

#### `private static final Uniform u_bboxm = new Uniform(VEC3, "lboxm", p -> ((GridLights)p.get(lights)).bboxm(), lights)`

- Description: TODO

#### `private static final Uniform u_bboxk = new Uniform(VEC3, "lboxk", p -> ((GridLights)p.get(lights)).bboxk(), lights)`

- Description: TODO

#### `private static final Uniform u_lstex = new Uniform(USAMPLER2D, "lstex", p -> ((GridLights)p.get(lights)).lstex, lights)`

- Description: TODO

#### `private static final Uniform u_ldtex = new Uniform(SAMPLER2D, "ldtex", p -> ((GridLights)p.get(lights)).ldtex, lights)`

- Description: TODO

### Fields

#### `public Expression idx, lpar`

- Description: TODO

#### `public Expression idx, lpar`

- Description: TODO

#### `private final Object[][] list`

- Description: TODO

#### `public int maxlights = defmax`

- Description: TODO

#### `public final int maxlights`

- Description: TODO

#### `private static WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`

- Description: TODO

#### `private ShaderMacro shader = null`

- Description: TODO

#### `public final int w, h, d`

- Description: TODO

#### `public final int w, h, d`

- Description: TODO

#### `public final int w, h, d`

- Description: TODO

#### `public final int wb, hb, db`

- Description: TODO

#### `public final int wb, hb, db`

- Description: TODO

#### `public final int wb, hb, db`

- Description: TODO

#### `public int maxlights = defmax`

- Description: TODO

#### `private final int lswb`

- Description: TODO

#### `private GridLights last`

- Description: TODO

#### `final Volume3f bbox`

- Description: TODO

#### `final Coord3f gsz, szf`

- Description: TODO

#### `final Coord3f gsz, szf`

- Description: TODO

#### `final Collection<Short> global = new ArrayList<>()`

- Description: TODO

#### `final short[] grid = new short[w * h * d]`

- Description: TODO

#### `short[] listbuf = new short[256]`

- Description: TODO

#### `int lboff = 0`

- Description: TODO

#### `short[][] lists = new short[][]`

- Description: TODO

#### `short[][] table = new short[32][]`

- Description: TODO

#### `int nlists = 1`

- Description: TODO

#### `int maxlist = 0`

- Description: TODO

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`

- Description: TODO

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`

- Description: TODO

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`

- Description: TODO

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`

- Description: TODO

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`

- Description: TODO

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`

- Description: TODO

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`

- Description: TODO

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`

- Description: TODO

#### `private static WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`

- Description: TODO

#### `private ShaderMacro shader = null`

- Description: TODO

#### `public final Texture2D.Sampler2D ldtex, lstex`

- Description: TODO

#### `public final Texture2D.Sampler2D ldtex, lstex`

- Description: TODO

#### `public final Volume3f bbox`

- Description: TODO

### Methods

#### `public abstract void construct(Block blk, java.util.function.Function<Params, Statement> body)`

- Description: TODO

#### `public Params(Expression idx, Expression lpar)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public SimpleLights(Object[][] lights)`

- Description: TODO

#### `public Shader(int maxlights)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Shader o)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public static ShaderMacro get(int maxlights)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public LightGrid(int w, int h, int d)`

- Description: TODO

#### `Compiler(Projection proj)`

- Description: TODO

#### `int us(short v)`

- Description: TODO

#### `void rehash(int nlen)`

- Description: TODO

#### `void ckrehash()`

- Description: TODO

#### `short addlist(short[] plist, short add)`

- Description: TODO

#### `short getlist(short[] plist, short add)`

- Description: TODO

#### `void addpoint(int idx, Object[] light, float[] pos)`

- Description: TODO

#### `void addglobal(int idx, Object[] light)`

- Description: TODO

#### `void addlight(int idx, Object[] light)`

- Description: TODO

#### `void compact()`

- Description: TODO

#### `void dump()`

- Description: TODO

#### `public State compile(Object[][] lights, Projection proj)`

- Description: TODO

#### `Shader(LightGrid pars)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Shader o)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `private static ShaderMacro get(LightGrid pars)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public GridLights(Object[][] lights, Volume3f bbox, short[] grid, short[] lists, int listlen)`

- Description: TODO

#### `private Texture2D listtex(short[] grid, short[] lists, int listlen)`

- Description: TODO

#### `private Texture2D lighttex(Object[][] lights)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public Coord3f bboxm()`

- Description: TODO

#### `public Coord3f bboxk()`

- Description: TODO

#### `public void dispose()`

- Description: TODO
