---
source: [Lighting.java](../../../../../src/haven/render/Lighting.java)
created: 2026-06-13
updated: 2026-06-14
---

# Lighting

Compiles lights into shader inputs for the render pipeline.

## Nested Types

### Compiler

- Role: Builds the light-grid lookup data for one projection.
- Description: Projects the camera frustum into grid space and compiles the lights visible in each cell.

### GridLights

- Role: Stores the compiled light grid for one resource.
- Description: Holds the generated light texture, lookup tables, and bounding box for a grid volume.

### Params

- Role: Carries the current light index and list expression.
- Description: Used while generating the loop or unrolled light access code.

### Shader

- Role: Emits the light sampling shader.
- Description: Generates the code that reads the compiled light lists and applies them to shading.

## Members

### Constants

#### `public static final State.Slot<State> lights = new State.Slot<>(State.Slot.Type.SYS, State.class)`
- Role: Stores the active lighting state in the pipe.
- Description: Lets the shader read whichever lighting implementation the current draw uses.
- Value: `new State.Slot<>(State.Slot.Type.SYS, State.class)`

#### `public static final Struct s_light = Struct.make(new Symbol.Shared("light"),`
- Role: Defines the shader-side light record layout.
- Description: Describes the ambient, diffuse, specular, position, and attenuation fields.
- Value: `Struct.make(new Symbol.Shared("light"),`

#### `public static final boolean unroll = true`
- Role: Controls whether the lighting loop is unrolled.
- Description: Keeps compatibility with drivers that handle loops poorly.
- Value: `true`

#### `public static final int defmax = 4`
- Role: Sets the default maximum light count for simple lighting.
- Description: Used by `SimpleLights` when no override is present.
- Value: `4`

#### `public static final boolean visnlights = false`
- Role: Enables debug visualization of the number of lights.
- Description: Left off in normal builds.
- Value: `false`

#### `public static final boolean stats = false`
- Role: Enables lighting statistics output.
- Description: Left off in normal builds.
- Value: `false`

#### `public static final int defmax = 16`
- Role: Sets the default maximum light count for grid lighting.
- Description: Used by `LightGrid` as the initial shader limit.
- Value: `16`

#### `private static final Hash<short[]> sahash = new Hash<short[]>()`
- Role: Hashes compiled light lists.
- Description: Uses array equality to deduplicate identical compiled light lists.
- Value: `new Hash<short[]>()`

#### `private static final Coord3f[] clipcorn =`
- Role: Stores the clip-space frustum corners.
- Description: Used to rebuild the world-space bounding box of the camera frustum.
- Value: ``

#### `private static final Uniform u_bboxm = new Uniform(VEC3, "lboxm", p -> ((GridLights)p.get(lights)).bboxm(), lights)`
- Role: Exposes the light-grid minimum bounds.
- Description: Supplies the shader with the lower bounding box corner for the active grid.
- Value: `new Uniform(VEC3, "lboxm", p -> ((GridLights)p.get(lights)).bboxm(), lights)`

#### `private static final Uniform u_bboxk = new Uniform(VEC3, "lboxk", p -> ((GridLights)p.get(lights)).bboxk(), lights)`
- Role: Exposes the light-grid scale factors.
- Description: Supplies the shader with the inverse box size for grid lookup.
- Value: `new Uniform(VEC3, "lboxk", p -> ((GridLights)p.get(lights)).bboxk(), lights)`

#### `private static final Uniform u_lstex = new Uniform(USAMPLER2D, "lstex", p -> ((GridLights)p.get(lights)).lstex, lights)`
- Role: Exposes the light list texture.
- Description: Binds the texture holding per-cell light indices.
- Value: `new Uniform(USAMPLER2D, "lstex", p -> ((GridLights)p.get(lights)).lstex, lights)`

#### `private static final Uniform u_ldtex = new Uniform(SAMPLER2D, "ldtex", p -> ((GridLights)p.get(lights)).ldtex, lights)`
- Role: Exposes the light data texture.
- Description: Binds the texture holding the packed light records.
- Value: `new Uniform(SAMPLER2D, "ldtex", p -> ((GridLights)p.get(lights)).ldtex, lights)`

### Fields

#### `public Expression idx, lpar`
- Role: Caches the lpar value.
- Description: Caches the `lpar` value for reuse.

#### `public Expression idx, lpar`
- Role: Caches the lpar value.
- Description: Caches the `lpar` value for reuse.

#### `private final Object[][] list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `public int maxlights = defmax`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `public final int maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private static WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Implements the interned operation.
- Description: Implements the private static weak hashed set<shader> interned = new weak hashed set<>(hash.eq) operation.

#### `private ShaderMacro shader = null`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.

#### `public final int w, h, d`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final int w, h, d`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final int w, h, d`
- Role: Caches the d value.
- Description: Caches the `d` value for reuse.

#### `public final int wb, hb, db`
- Role: Caches the db value.
- Description: Caches the `db` value for reuse.

#### `public final int wb, hb, db`
- Role: Caches the db value.
- Description: Caches the `db` value for reuse.

#### `public final int wb, hb, db`
- Role: Caches the db value.
- Description: Caches the `db` value for reuse.

#### `public int maxlights = defmax`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private final int lswb`
- Role: Caches the lswb value.
- Description: Caches the `lswb` value for reuse.

#### `private GridLights last`
- Role: Caches the last .
- Description: Caches the last  value.

#### `final Volume3f bbox`
- Role: Caches the bbox value.
- Description: Caches the `bbox` value for reuse.

#### `final Coord3f gsz, szf`
- Role: Caches the szf value.
- Description: Caches the `szf` value for reuse.

#### `final Coord3f gsz, szf`
- Role: Caches the szf value.
- Description: Caches the `szf` value for reuse.

#### `final Collection<Short> global = new ArrayList<>()`
- Role: Implements the global operation.
- Description: Implements the final collection<short> global = new array list<>() operation.

#### `final short[] grid = new short[w * h * d]`
- Role: Caches the grid value.
- Description: Caches the `grid` value for reuse.

#### `short[] listbuf = new short[256]`
- Role: Caches the listbuf value.
- Description: Caches the `listbuf` value for reuse.

#### `int lboff = 0`
- Role: Caches the lboff value.
- Description: Caches the `lboff` value for reuse.

#### `short[][] lists = new short[][]`
- Role: Caches the lists value.
- Description: Caches the `lists` value for reuse.

#### `short[][] table = new short[32][]`
- Role: Caches the table value.
- Description: Caches the `table` value for reuse.

#### `int nlists = 1`
- Role: Caches the nlists value.
- Description: Caches the `nlists` value for reuse.

#### `int maxlist = 0`
- Role: Caches the maxlist value.
- Description: Caches the `maxlist` value for reuse.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private final int w, h, d, wb, hb, db, lswb, maxlights`
- Role: Caches the maxlights value.
- Description: Caches the `maxlights` value for reuse.

#### `private static WeakHashedSet<Shader> interned = new WeakHashedSet<>(Hash.eq)`
- Role: Implements the interned operation.
- Description: Implements the private static weak hashed set<shader> interned = new weak hashed set<>(hash.eq) operation.

#### `private ShaderMacro shader = null`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.

#### `public final Texture2D.Sampler2D ldtex, lstex`
- Role: Caches the lstex value.
- Description: Caches the `lstex` value for reuse.

#### `public final Texture2D.Sampler2D ldtex, lstex`
- Role: Caches the lstex value.
- Description: Caches the `lstex` value for reuse.

#### `public final Volume3f bbox`
- Role: Caches the bbox value.
- Description: Caches the `bbox` value for reuse.

### Methods

#### `public abstract void construct(Block blk, java.util.function.Function<Params, Statement> body)`
- Role: Emits light-iteration shader code.
- Description: Builds the shader loop or unrolled blocks for the current light list.

#### `public Params(Expression idx, Expression lpar)`
- Role: Stores light loop parameters.
- Description: Carries the loop index and light parameter expression into shader generation.

#### `public void modify(ProgramContext prog)`
- Role: Installs the light-list shader module.
- Description: Registers the light generator with the active shader program.

#### `public SimpleLights(Object[][] lights)`
- Role: Stores a fixed light list.
- Description: Wraps raw light objects for the simple-light shader path.

#### `public Shader(int maxlights)`
- Role: Configures the light shader.
- Description: Stores the maximum number of lights that the shader will emit.

#### `public void modify(ProgramContext prog)`
- Role: Installs the simple-light shader.
- Description: Registers the fixed-size light shader module.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Shader o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public static ShaderMacro get(int maxlights)`
- Role: Returns a cached simple-light shader.
- Description: Reuses the shader macro for the requested light count.

#### `public ShaderMacro shader()`
- Role: Returns the simple-light shader.
- Description: Exposes the shader macro used to apply the current light list.

#### `public void apply(Pipe p)`
- Role: Applies simple-light state.
- Description: Writes the light list into the current pipe.

#### `public LightGrid(int w, int h, int d)`
- Role: Defines a light grid volume.
- Description: Stores the grid dimensions and derived bit widths for compiled light placement.

#### `Compiler(Projection proj)`
- Role: Builds one grid-light compile pass.
- Description: Derives bounding boxes and grid sizing from the projection.

#### `int us(short v)`
- Role: Converts one unsigned short.
- Description: Returns the unsigned integer form of a packed short value.

#### `void rehash(int nlen)`
- Role: Rebuilds the hash table.
- Description: Rehashes the packed light lists into a new table size.

#### `void ckrehash()`
- Role: Checks whether a rehash is needed.
- Description: Triggers table resizing when the current load is too high.

#### `short addlist(short[] plist, short add)`
- Role: Appends one light-list entry.
- Description: Adds a light index to the packed list representation.

#### `short getlist(short[] plist, short add)`
- Role: Resolves one packed light list.
- Description: Reuses or creates a list entry for a light index.

#### `void addpoint(int idx, Object[] light, float[] pos)`
- Role: Adds one positional light.
- Description: Inserts a light with a 3D position into the grid compiler.

#### `void addglobal(int idx, Object[] light)`
- Role: Adds one global light.
- Description: Inserts a light that affects the whole grid.

#### `void addlight(int idx, Object[] light)`
- Role: Routes one light into the compiler.
- Description: Dispatches a light to the point or global path.

#### `void compact()`
- Role: Compacts the compiled light lists.
- Description: Shrinks the packed tables after compilation.

#### `void dump()`
- Role: Dumps the compiled light data.
- Description: Emits debugging output for the current light grid.

#### `public State compile(Object[][] lights, Projection proj)`
- Role: Compiles light data for one projection.
- Description: Produces a render state containing the packed light grid.

#### `Shader(LightGrid pars)`
- Role: Configures the grid-light shader.
- Description: Stores the compiled light grid parameters used by the shader.

#### `public void modify(ProgramContext prog)`
- Role: Installs the grid-light shader.
- Description: Registers the grid-light shader module with the program.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Shader o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `private static ShaderMacro get(LightGrid pars)`
- Role: Returns a cached grid-light shader.
- Description: Reuses the shader macro for the compiled grid-light parameters.

#### `public ShaderMacro shader()`
- Role: Returns the grid-light shader.
- Description: Exposes the shader macro for the compiled grid-light state.

#### `public GridLights(Object[][] lights, Volume3f bbox, short[] grid, short[] lists, int listlen)`
- Role: Stores compiled grid-light state.
- Description: Holds the packed light grid, bounding box, and list data for rendering.

#### `private Texture2D listtex(short[] grid, short[] lists, int listlen)`
- Role: Builds the list texture.
- Description: Converts packed light-list data into a texture.

#### `private Texture2D lighttex(Object[][] lights)`
- Role: Builds the light texture.
- Description: Converts raw light data into the texture sampled by the shader.

#### `public ShaderMacro shader()`
- Role: Returns the grid-light shader.
- Description: Exposes the shader macro for the compiled grid-light state.

#### `public void apply(Pipe p)`
- Role: Applies grid-light state.
- Description: Writes the compiled grid light data into the pipe.

#### `public Coord3f bboxm()`
- Role: Returns the bounding-box minimum.
- Description: Exposes the minimum corner of the compiled light volume.

#### `public Coord3f bboxk()`
- Role: Returns the bounding-box scale.
- Description: Exposes the scale factor used to convert grid coordinates.

#### `public void dispose()`
- Role: Disposes the compiled light state.
- Description: Releases the textures and cached data owned by the grid lights.
