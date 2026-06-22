---
source: [GLProgram.java](../../../../../../src/haven/render/gl/GLProgram.java)
created: 2026-06-13
updated: 2026-06-20
---

# GLProgram

Builds and owns one linked OpenGL program, including shader sources, uniforms, attributes, fragment outputs, and sampler bindings.

## Nested Types

### `ShaderException`, `ProgramException`, `LinkException`, `UnknownExternException`
- Role: Represent shader and program build failures.

### `ShaderOb`, `ProgOb`
- Role: Wrap the GL shader and program objects.

### `AttrID`, `VarID`, `UniformID`
- Role: Provide typed OpenGL identifiers for attributes and uniforms.

### `Dump`
- Role: Captures a serializable snapshot of compiled program state.

## Members

### Constants

#### `public static boolean dumpall = false`
- Role: Enables shader source dumping during program build.

### Fields

#### `public final GLEnvironment env`
- Role: Holds the GL environment that owns this program.

#### `public final String vsrc, fsrc`
- Role: Stores the generated vertex and fragment shader source.

#### `public final Uniform[] uniforms`
- Role: Stores the uniforms referenced by the program.

#### `public final FragData[] fragdata`
- Role: Stores the fragment outputs referenced by the program.

#### `public final int[][] umap`
- Role: Maps render slots to uniform indices.

#### `public final boolean[] fmap`
- Role: Marks fragment-buffer dependencies.

#### `public final Attribute[] attribs`
- Role: Stores the sorted vertex attributes.

#### `public final Map<Uniform, Integer> samplerids`
- Role: Maps sampler uniforms to sampler indices.

#### `public final Uniform[] samplers`
- Role: Stores only the sampler uniforms.

#### `public final AtomicInteger locked = new AtomicInteger(0)`
- Role: Tracks external program lock usage.

#### `private final Map<Uniform, String> unifnms`
- Role: Maps uniforms to their generated symbol names.

#### `private final Map<Attribute, AttrID> amap`
- Role: Maps attributes to their GL attribute ids.

#### `private final String[] fragnms`
- Role: Stores fragment output symbol names.

#### `private ProgOb glp`
- Role: Stores the created GL program object.

### Methods

#### `public GLProgram(GLEnvironment env, ProgramContext ctx)`
- Role: Builds one linked program from a prepared program context.

#### `public static int attrsize(Attribute attr)`
- Role: Returns how many attribute slots one vertex attribute consumes.

#### `public static GLProgram build(GLEnvironment env, Collection<ShaderMacro> mods)`
- Role: Builds a program from shader macros.

#### `public static GLProgram apply(BGL gl, GLProgram from, GLProgram to)`
- Role: Switches the currently applied program state.

#### `public AttrID cattrib(Attribute var)` / `attrib(Attribute var)`
- Role: Resolve a vertex attribute id.

#### `public ProgOb.UniformID cuniform(Uniform var)` / `uniform(Uniform var)`
- Role: Resolve a uniform id.

#### `public void dispose()`
- Role: Releases the linked program and its GL resources.

#### `public void lock()` / `public void unlock()`
- Role: Pin the program while it is in use.

#### `public Dump dump()`
- Role: Returns a serializable snapshot of the compiled program.

