---
source: [GLVertexArray.java](../../../../../../src/haven/render/gl/GLVertexArray.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLVertexArray

Provides GL backend support for glvertex array.

## Nested Types

### Indexed

- Role: Represents indexed within GLVertexArray.
- Description: Describes the nested indexed type used by the enclosing class.

### ProgIndex

- Role: Represents prog index within GLVertexArray.
- Description: Describes the nested prog index type used by the enclosing class.

## Members

### Constants

### Fields

#### `private int id, state = 0`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `private int id, state = 0`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `final GLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `final WeakReference<Model> desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `Indexed[] vaos = new Indexed[2]`
- Role: Caches the vaos value.
- Description: Caches the `vaos` value for reuse.

#### `int n = 0`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `final Collection<GLProgram> progs = new HashSet<>()`
- Role: Implements the progs operation.
- Description: Implements the final collection<gl program> progs = new hash set<>() operation.

#### `final Attribute[] attribs`
- Role: Caches the attribs value.
- Description: Caches the `attribs` value for reuse.

### Methods

#### `public GLVertexArray(GLEnvironment env)`
- Role: Creates a new GLVertexArray instance.
- Description: Constructs the GLVertexArray instance from the supplied inputs.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `public int glid()`
- Role: Handles the glid path.
- Description: Implements the glid operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLVertexArray for debugging and logging.

#### `static boolean ephemeralp(VertexArray va)`
- Role: Handles the ephemeralp path.
- Description: Implements the ephemeralp operation.

#### `static boolean ephemeralp(Model m)`
- Role: Handles the ephemeralp path.
- Description: Implements the ephemeralp operation.

#### `public void init(GLProgram prog, Model mod)`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public ProgIndex(GLEnvironment env, Model desc)`
- Role: Handles the prog index path.
- Description: Implements the prog index operation.

#### `Indexed(GLEnvironment env, Attribute[] attribs)`
- Role: Handles the indexed workflow.
- Description: Implements the indexed operation.

#### `boolean cleanprogs()`
- Role: Handles the cleanprogs path.
- Description: Implements the cleanprogs operation.

#### `void useprog(GLProgram prog)`
- Role: Handles the useprog path.
- Description: Implements the useprog operation.

#### `void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `void add(Indexed vao)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `GLVertexArray get(GLProgram prog, Model mod)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this GLVertexArray for debugging and logging.