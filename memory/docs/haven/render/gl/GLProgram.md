# GLProgram

This file documents the responsibilities and members of `GLProgram`.

## Meta

- Source: [GLProgram.java](../../../../../src/haven/render/gl/GLProgram.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glprogram.

## Nested Types

### AttrID

- Role: Represents attr id within GLProgram.
- Description: Describes the nested attr id type used by the enclosing class.

### Dump

- Role: Represents dump within GLProgram.
- Description: Describes the nested dump type used by the enclosing class.

### LinkException

- Role: Represents link exception within GLProgram.
- Description: Describes the nested link exception type used by the enclosing class.

### ProgOb

- Role: Represents prog ob within GLProgram.
- Description: Describes the nested prog ob type used by the enclosing class.

### ProgramException

- Role: Represents program exception within GLProgram.
- Description: Describes the nested program exception type used by the enclosing class.

### ShaderException

- Role: Represents shader exception within GLProgram.
- Description: Describes the nested shader exception type used by the enclosing class.

### ShaderOb

- Role: Represents shader ob within GLProgram.
- Description: Describes the nested shader ob type used by the enclosing class.

### UniformID

- Role: Represents uniform id within GLProgram.
- Description: Describes the nested uniform id type used by the enclosing class.

### UnknownExternException

- Role: Represents unknown extern exception within GLProgram.
- Description: Describes the nested unknown extern exception type used by the enclosing class.

### VarID

- Role: Represents var id within GLProgram.
- Description: Describes the nested var id type used by the enclosing class.

## Members

### Constants

### Fields

#### `public static boolean dumpall = false`
- Role: Tracks the dumpall flag.
- Description: Supports the dumpall operation used by the surrounding class.

#### `public final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `public final String vsrc, fsrc`
- Role: Stores the fsrc value.
- Description: Backs the cached state for this file.

#### `public final String vsrc, fsrc`
- Role: Stores the fsrc value.
- Description: Backs the cached state for this file.

#### `public final Uniform[] uniforms`
- Role: Holds the uniforms state.
- Description: Backs the cached state for this file.

#### `public final FragData[] fragdata`
- Role: Holds the fragdata state.
- Description: Backs the cached state for this file.

#### `public final int[][] umap`
- Role: Stores the umap value.
- Description: Backs the cached state for this file.

#### `public final boolean[] fmap`
- Role: Tracks the fmap flag.
- Description: Supports the fmap operation used by the surrounding class.

#### `public final Attribute[] attribs`
- Role: Holds the attribs state.
- Description: Backs the cached state for this file.

#### `public final Map<Uniform, Integer> samplerids`
- Role: Caches samplerids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Uniform[] samplers`
- Role: Holds the samplers state.
- Description: Backs the cached state for this file.

#### `public final AtomicInteger locked = new AtomicInteger(0)`
- Role: Stores the locked value.
- Description: Backs the cached state for this file.

#### `private final Map<Uniform, String> unifnms`
- Role: Caches unifnms entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Attribute, AttrID> amap`
- Role: Caches amap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final String[] fragnms`
- Role: Stores the fragnms value.
- Description: Backs the cached state for this file.

#### `private ProgOb glp`
- Role: Stores the glp value.
- Description: Backs the cached state for this file.

#### `boolean disposed = false`
- Role: Tracks the disposed flag.
- Description: Supports the disposed operation used by the surrounding class.

#### `public final int type`
- Role: Stores the type value.
- Description: Backs the cached state for this file.

#### `public final String text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public final String info`
- Role: Stores the info value.
- Description: Backs the cached state for this file.

#### `public final int type`
- Role: Stores the type value.
- Description: Backs the cached state for this file.

#### `public final String text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `private int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Dump program`
- Role: Holds the program state.
- Description: Backs the cached state for this file.

#### `public final String type, symbol`
- Role: Stores the symbol value.
- Description: Backs the cached state for this file.

#### `public final String type, symbol`
- Role: Stores the symbol value.
- Description: Backs the cached state for this file.

#### `public final String info`
- Role: Stores the info value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `protected int id = -1`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final ShaderOb[] shaders`
- Role: Holds the shaders state.
- Description: Backs the cached state for this file.

#### `private int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public UniformID[] sub = null`
- Role: Holds the sub state.
- Description: Backs the cached state for this file.

#### `public int sampler = -1`
- Role: Stores the sampler value.
- Description: Backs the cached state for this file.

#### `private final transient Map<Uniform, UniformID> umap = new IdentityHashMap<>()`
- Role: Caches umap entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final String vsrc, fsrc`
- Role: Stores the fsrc value.
- Description: Backs the cached state for this file.

#### `public final String vsrc, fsrc`
- Role: Stores the fsrc value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final String[] fragnms, attrnms`
- Role: Stores the attrnms value.
- Description: Backs the cached state for this file.

#### `public final String[] fragnms, attrnms`
- Role: Stores the attrnms value.
- Description: Backs the cached state for this file.

#### `public final int[] attrlocs`
- Role: Stores the attrlocs value.
- Description: Backs the cached state for this file.

### Methods

#### `public GLProgram(GLEnvironment env, ProgramContext ctx)`
- Role: Creates a new GLProgram instance.
- Description: Constructs the instance and initializes its default state.

#### `public static int attrsize(Attribute attr)`
- Role: Performs attrsize.
- Description: Supports the attrsize operation used by the surrounding class.

#### `public static GLProgram build(GLEnvironment env, Collection<ShaderMacro> mods)`
- Role: Performs build.
- Description: Supports the build operation used by the surrounding class.

#### `public ShaderException(String msg, ShaderOb shader, String info)`
- Role: Performs shader exception.
- Description: Supports the shader exception operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public ShaderOb(GLEnvironment env, int type, String text)`
- Role: Performs shader ob.
- Description: Supports the shader ob operation used by the surrounding class.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `public int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `public ProgramException(String msg, GLProgram program)`
- Role: Performs program exception.
- Description: Supports the program exception operation used by the surrounding class.

#### `public UnknownExternException(String msg, GLProgram program, String type, String symbol)`
- Role: Performs unknown extern exception.
- Description: Supports the unknown extern exception operation used by the surrounding class.

#### `public LinkException(String msg, GLProgram program, String info)`
- Role: Performs link exception.
- Description: Supports the link exception operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private AttrID(String name, int id)`
- Role: Performs attr id.
- Description: Supports the attr id operation used by the surrounding class.

#### `public int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private VarID(String name)`
- Role: Performs var id.
- Description: Supports the var id operation used by the surrounding class.

#### `public abstract int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `public ProgOb(GLEnvironment env, ShaderOb... shaders)`
- Role: Performs prog ob.
- Description: Supports the prog ob operation used by the surrounding class.

#### `private UniformID uniresolve(Type type, String name)`
- Role: Performs uniresolve.
- Description: Supports the uniresolve operation used by the surrounding class.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `private UniformID(String name)`
- Role: Performs uniform id.
- Description: Supports the uniform id operation used by the surrounding class.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public UniformID cuniform(Uniform var)`
- Role: Performs cuniform.
- Description: Supports the cuniform operation used by the surrounding class.

#### `public ProgOb glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `public static void apply(BGL gl, GLProgram from, GLProgram to)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public AttrID cattrib(Attribute var)`
- Role: Performs cattrib.
- Description: Supports the cattrib operation used by the surrounding class.

#### `public AttrID attrib(Attribute var)`
- Role: Performs attrib.
- Description: Supports the attrib operation used by the surrounding class.

#### `public ProgOb.UniformID cuniform(Uniform var)`
- Role: Performs cuniform.
- Description: Supports the cuniform operation used by the surrounding class.

#### `public ProgOb.UniformID uniform(Uniform var)`
- Role: Performs uniform.
- Description: Supports the uniform operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void lock()`
- Role: Performs lock.
- Description: Supports the lock operation used by the surrounding class.

#### `public void unlock()`
- Role: Performs unlock.
- Description: Supports the unlock operation used by the surrounding class.

#### `public Dump(GLProgram prog)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public Dump dump()`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.
