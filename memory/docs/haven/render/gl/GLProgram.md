# GLProgram

This file documents the responsibilities and members of `GLProgram`.

## Meta

- Source: [GLProgram.java](../../../../../src/haven/render/gl/GLProgram.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a GL program.

## Nested Types

### AttrID

- Description: TODO

### Dump

- Description: TODO

### LinkException

- Description: TODO

### ProgOb

- Description: TODO

### ProgramException

- Description: TODO

### ShaderException

- Description: TODO

### ShaderOb

- Description: TODO

### UniformID

- Description: TODO

### UnknownExternException

- Description: TODO

### VarID

- Description: TODO

## Members

### Constants

### Fields

#### `public static boolean dumpall = false`

- Description: TODO

#### `public final GLEnvironment env`

- Description: TODO

#### `public final String vsrc, fsrc`

- Description: TODO

#### `public final String vsrc, fsrc`

- Description: TODO

#### `public final Uniform[] uniforms`

- Description: TODO

#### `public final FragData[] fragdata`

- Description: TODO

#### `public final int[][] umap`

- Description: TODO

#### `public final boolean[] fmap`

- Description: TODO

#### `public final Attribute[] attribs`

- Description: TODO

#### `public final Map<Uniform, Integer> samplerids`

- Description: TODO

#### `public final Uniform[] samplers`

- Description: TODO

#### `public final AtomicInteger locked = new AtomicInteger(0)`

- Description: TODO

#### `private final Map<Uniform, String> unifnms`

- Description: TODO

#### `private final Map<Attribute, AttrID> amap`

- Description: TODO

#### `private final String[] fragnms`

- Description: TODO

#### `private ProgOb glp`

- Description: TODO

#### `boolean disposed = false`

- Description: TODO

#### `public final int type`

- Description: TODO

#### `public final String text`

- Description: TODO

#### `public final String info`

- Description: TODO

#### `public final int type`

- Description: TODO

#### `public final String text`

- Description: TODO

#### `private int id`

- Description: TODO

#### `public final Dump program`

- Description: TODO

#### `public final String type, symbol`

- Description: TODO

#### `public final String type, symbol`

- Description: TODO

#### `public final String info`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `protected int id = -1`

- Description: TODO

#### `public final ShaderOb[] shaders`

- Description: TODO

#### `private int id`

- Description: TODO

#### `public UniformID[] sub = null`

- Description: TODO

#### `public int sampler = -1`

- Description: TODO

#### `private final transient Map<Uniform, UniformID> umap = new IdentityHashMap<>()`

- Description: TODO

#### `public final String vsrc, fsrc`

- Description: TODO

#### `public final String vsrc, fsrc`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final String[] fragnms, attrnms`

- Description: TODO

#### `public final String[] fragnms, attrnms`

- Description: TODO

#### `public final int[] attrlocs`

- Description: TODO

### Methods

#### `public GLProgram(GLEnvironment env, ProgramContext ctx)`

- Description: TODO

#### `public static int attrsize(Attribute attr)`

- Description: TODO

#### `public static GLProgram build(GLEnvironment env, Collection<ShaderMacro> mods)`

- Description: TODO

#### `public ShaderException(String msg, ShaderOb shader, String info)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public ShaderOb(GLEnvironment env, int type, String text)`

- Description: TODO

#### `public void create(GL gl)`

- Description: TODO

#### `protected void delete(GL gl)`

- Description: TODO

#### `public int glid()`

- Description: TODO

#### `public ProgramException(String msg, GLProgram program)`

- Description: TODO

#### `public UnknownExternException(String msg, GLProgram program, String type, String symbol)`

- Description: TODO

#### `public LinkException(String msg, GLProgram program, String info)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private AttrID(String name, int id)`

- Description: TODO

#### `public int glid()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private VarID(String name)`

- Description: TODO

#### `public abstract int glid()`

- Description: TODO

#### `public ProgOb(GLEnvironment env, ShaderOb... shaders)`

- Description: TODO

#### `private UniformID uniresolve(Type type, String name)`

- Description: TODO

#### `public void create(GL gl)`

- Description: TODO

#### `protected void delete(GL gl)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public int glid()`

- Description: TODO

#### `private UniformID(String name)`

- Description: TODO

#### `public void run(GL gl)`

- Description: TODO

#### `public int glid()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public UniformID cuniform(Uniform var)`

- Description: TODO

#### `public ProgOb glid()`

- Description: TODO

#### `public static void apply(BGL gl, GLProgram from, GLProgram to)`

- Description: TODO

#### `public AttrID cattrib(Attribute var)`

- Description: TODO

#### `public AttrID attrib(Attribute var)`

- Description: TODO

#### `public ProgOb.UniformID cuniform(Uniform var)`

- Description: TODO

#### `public ProgOb.UniformID uniform(Uniform var)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public void lock()`

- Description: TODO

#### `public void unlock()`

- Description: TODO

#### `public Dump(GLProgram prog)`

- Description: TODO

#### `public Dump dump()`

- Description: TODO
