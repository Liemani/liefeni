# GLVertexArray

This file documents the responsibilities and members of `GLVertexArray`.

## Meta

- Source: [GLVertexArray.java](../../../../../src/haven/render/gl/GLVertexArray.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a GL vertex array.

## Nested Types

### Indexed

- Description: TODO

### ProgIndex

- Description: TODO

## Members

### Constants

### Fields

#### `private int id, state = 0`

- Description: TODO

#### `private int id, state = 0`

- Description: TODO

#### `final GLEnvironment env`

- Description: TODO

#### `final WeakReference<Model> desc`

- Description: TODO

#### `Indexed[] vaos = new Indexed[2]`

- Description: TODO

#### `int n = 0`

- Description: TODO

#### `final Collection<GLProgram> progs = new HashSet<>()`

- Description: TODO

#### `final Attribute[] attribs`

- Description: TODO

### Methods

#### `public GLVertexArray(GLEnvironment env)`

- Description: TODO

#### `public void create(GL gl)`

- Description: TODO

#### `protected void delete(GL gl)`

- Description: TODO

#### `public int glid()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `static boolean ephemeralp(VertexArray va)`

- Description: TODO

#### `static boolean ephemeralp(Model m)`

- Description: TODO

#### `public void init(GLProgram prog, Model mod)`

- Description: TODO

#### `public ProgIndex(GLEnvironment env, Model desc)`

- Description: TODO

#### `Indexed(GLEnvironment env, Attribute[] attribs)`

- Description: TODO

#### `boolean cleanprogs()`

- Description: TODO

#### `void useprog(GLProgram prog)`

- Description: TODO

#### `void clean()`

- Description: TODO

#### `void add(Indexed vao)`

- Description: TODO

#### `GLVertexArray get(GLProgram prog, Model mod)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String toString()`

- Description: TODO
