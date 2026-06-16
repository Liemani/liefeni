# Lighting

This file documents the responsibilities and members of `Lighting`.

## Meta

- Source: [Lighting.java](../../../../src/haven/render/Lighting.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the lighting render pipeline component.

## Nested Types

### Compiler

- Role: Represents compiler within Lighting.
- Description: Describes the nested compiler type used by the enclosing class.

### GridLights

- Role: Represents grid lights within Lighting.
- Description: Describes the nested grid lights type used by the enclosing class.

### Params

- Role: Represents params within Lighting.
- Description: Describes the nested params type used by the enclosing class.

### Shader

- Role: Represents shader within Lighting.
- Description: Describes the nested shader type used by the enclosing class.

## Members

### Constants

#### `public static final State.Slot<State> lights = new State.Slot<>(State.Slot.Type.SYS, State.class)`
- Role: Defines the shared lights constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Struct s_light = Struct.make(new Symbol.Shared("light"),`
- Role: Defines the shared s light constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean unroll = true`
- Role: Defines the shared unroll constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int defmax = 4`
- Role: Defines the shared defmax constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean visnlights = false`
- Role: Defines the shared visnlights constant.
- Description: Shared constant used by the rest of the class.

#### `public static final boolean stats = false`
- Role: Defines the shared stats constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int defmax = 16`
- Role: Defines the shared defmax constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Hash<short[]> sahash = new Hash<short[]>()`
- Role: Defines the shared sahash constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Coord3f[] clipcorn =`
- Role: Defines the shared lighting constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform u_bboxm = new Uniform(VEC3, "lboxm", p -> ((GridLights)p.get(lights)).bboxm(), lights)`
- Role: Defines the shared u bboxm constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform u_bboxk = new Uniform(VEC3, "lboxk", p -> ((GridLights)p.get(lights)).bboxk(), lights)`
- Role: Defines the shared u bboxk constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform u_lstex = new Uniform(USAMPLER2D, "lstex", p -> ((GridLights)p.get(lights)).lstex, lights)`
- Role: Defines the shared u lstex constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform u_ldtex = new Uniform(SAMPLER2D, "ldtex", p -> ((GridLights)p.get(lights)).ldtex, lights)`
- Role: Defines the shared u ldtex constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Expression idx, lpar`
- Role: Holds the lpar state.
- Description: Backs the cached state for this file.

#### `public Expression idx, lpar`
- Role: Holds the lpar state.
- Description: Backs the cached state for this file.

#### `private final Object[][] list`
- Role: Holds the list state.
- Description: Backs the cached state for this file.

#### `public int maxlights = defmax`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `public final int maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private static WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Caches interned entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private ShaderMacro shader = null`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public final int w, h, d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `public final int wb, hb, db`
- Role: Stores the db value.
- Description: Backs the cached state for this file.

#### `public final int wb, hb, db`
- Role: Stores the db value.
- Description: Backs the cached state for this file.

#### `public final int wb, hb, db`
- Role: Stores the db value.
- Description: Backs the cached state for this file.

#### `public int maxlights = defmax`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private final int lswb`
- Role: Stores the lswb value.
- Description: Backs the cached state for this file.

#### `private GridLights last`
- Role: Stores the last value.
- Description: Backs the cached state for this file.

#### `final Volume3f bbox`
- Role: Holds the bbox state.
- Description: Backs the cached state for this file.

#### `final Coord3f gsz, szf`
- Role: Stores the szf value.
- Description: Backs the cached state for this file.

#### `final Coord3f gsz, szf`
- Role: Stores the szf value.
- Description: Backs the cached state for this file.

#### `final Collection<Short> global = new ArrayList<>()`
- Role: Caches global entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final short[] grid = new short[w * h * d]`
- Role: Stores the grid value.
- Description: Backs the cached state for this file.

#### `short[] listbuf = new short[256]`
- Role: Stores the listbuf value.
- Description: Backs the cached state for this file.

#### `int lboff = 0`
- Role: Stores the lboff value.
- Description: Backs the cached state for this file.

#### `short[][] lists = new short[][]`
- Role: Stores the lists value.
- Description: Backs the cached state for this file.

#### `short[][] table = new short[32][]`
- Role: Stores the table value.
- Description: Backs the cached state for this file.

#### `int nlists = 1`
- Role: Stores the nlists value.
- Description: Backs the cached state for this file.

#### `int maxlist = 0`
- Role: Stores the maxlist value.
- Description: Backs the cached state for this file.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

#### `private static WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Caches interned entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private ShaderMacro shader = null`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `public final Texture2D.Sampler2D ldtex, lstex`
- Role: Stores the lstex value.
- Description: Backs the cached state for this file.

#### `public final Texture2D.Sampler2D ldtex, lstex`
- Role: Stores the lstex value.
- Description: Backs the cached state for this file.

#### `public final Volume3f bbox`
- Role: Holds the bbox state.
- Description: Backs the cached state for this file.

### Methods

#### `public abstract void construct(Block blk, java.util.function.Function<Params, Statement> body)`
- Role: Performs construct.
- Description: Supports the construct operation used by the surrounding class.

#### `public Params(Expression idx, Expression lpar)`
- Role: Performs params.
- Description: Supports the params operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public SimpleLights(Object[][] lights)`
- Role: Performs simple lights.
- Description: Supports the simple lights operation used by the surrounding class.

#### `public Shader(int maxlights)`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Shader o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public static ShaderMacro get(int maxlights)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public LightGrid(int w, int h, int d)`
- Role: Performs light grid.
- Description: Supports the light grid operation used by the surrounding class.

#### `Compiler(Projection proj)`
- Role: Handles the compiler workflow.
- Description: Supports the compiler operation used by the surrounding class.

#### `int us(short v)`
- Role: Performs us.
- Description: Supports the us operation used by the surrounding class.

#### `void rehash(int nlen)`
- Role: Performs rehash.
- Description: Supports the rehash operation used by the surrounding class.

#### `void ckrehash()`
- Role: Performs ckrehash.
- Description: Supports the ckrehash operation used by the surrounding class.

#### `short addlist(short[] plist, short add)`
- Role: Performs addlist.
- Description: Supports the addlist operation used by the surrounding class.

#### `short getlist(short[] plist, short add)`
- Role: Performs getlist.
- Description: Supports the getlist operation used by the surrounding class.

#### `void addpoint(int idx, Object[] light, float[] pos)`
- Role: Performs addpoint.
- Description: Supports the addpoint operation used by the surrounding class.

#### `void addglobal(int idx, Object[] light)`
- Role: Performs addglobal.
- Description: Supports the addglobal operation used by the surrounding class.

#### `void addlight(int idx, Object[] light)`
- Role: Performs addlight.
- Description: Supports the addlight operation used by the surrounding class.

#### `void compact()`
- Role: Performs compact.
- Description: Supports the compact operation used by the surrounding class.

#### `void dump()`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public State compile(Object[][] lights, Projection proj)`
- Role: Performs compile.
- Description: Supports the compile operation used by the surrounding class.

#### `Shader(LightGrid pars)`
- Role: Handles the shader workflow.
- Description: Supports the shader operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Shader o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `private static ShaderMacro get(LightGrid pars)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public GridLights(Object[][] lights, Volume3f bbox, short[] grid, short[] lists, int listlen)`
- Role: Performs grid lights.
- Description: Supports the grid lights operation used by the surrounding class.

#### `private Texture2D listtex(short[] grid, short[] lists, int listlen)`
- Role: Performs listtex.
- Description: Supports the listtex operation used by the surrounding class.

#### `private Texture2D lighttex(Object[][] lights)`
- Role: Performs lighttex.
- Description: Supports the lighttex operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public Coord3f bboxm()`
- Role: Performs bboxm.
- Description: Supports the bboxm operation used by the surrounding class.

#### `public Coord3f bboxk()`
- Role: Performs bboxk.
- Description: Supports the bboxk operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
