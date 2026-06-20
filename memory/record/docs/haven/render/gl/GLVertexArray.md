---
source: [GLVertexArray.java](../../../../../src/haven/render/gl/GLVertexArray.java)
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
- Role: Stores the state value.
- Description: Backs the cached state for this file.

#### `private int id, state = 0`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

#### `final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `final WeakReference<Model> desc`
- Role: Holds the desc state.
- Description: Backs the cached state for this file.

#### `Indexed[] vaos = new Indexed[2]`
- Role: Holds the vaos state.
- Description: Backs the cached state for this file.

#### `int n = 0`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `final Collection<GLProgram> progs = new HashSet<>()`
- Role: Caches progs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Attribute[] attribs`
- Role: Holds the attribs state.
- Description: Backs the cached state for this file.

### Methods

#### `public GLVertexArray(GLEnvironment env)`
- Role: Creates a new GLVertexArray instance.
- Description: Constructs the instance and initializes its default state.

#### `public void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `protected void delete(GL gl)`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `public int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `static boolean ephemeralp(VertexArray va)`
- Role: Performs ephemeralp.
- Description: Supports the ephemeralp operation used by the surrounding class.

#### `static boolean ephemeralp(Model m)`
- Role: Performs ephemeralp.
- Description: Supports the ephemeralp operation used by the surrounding class.

#### `public void init(GLProgram prog, Model mod)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public ProgIndex(GLEnvironment env, Model desc)`
- Role: Performs prog index.
- Description: Supports the prog index operation used by the surrounding class.

#### `Indexed(GLEnvironment env, Attribute[] attribs)`
- Role: Handles the indexed workflow.
- Description: Supports the indexed operation used by the surrounding class.

#### `boolean cleanprogs()`
- Role: Performs cleanprogs.
- Description: Supports the cleanprogs operation used by the surrounding class.

#### `void useprog(GLProgram prog)`
- Role: Performs useprog.
- Description: Supports the useprog operation used by the surrounding class.

#### `void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `void add(Indexed vao)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `GLVertexArray get(GLProgram prog, Model mod)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
