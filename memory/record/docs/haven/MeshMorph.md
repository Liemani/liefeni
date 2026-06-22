---
source: [MeshMorph.java](../../../../src/haven/MeshMorph.java)
created: 2026-06-13
updated: 2026-06-14
---

# MeshMorph

Represents the mesh morph Haven component.

## Nested Types

### Attrib

- Role: Represents attrib within MeshMorph.
- Description: Describes the nested attrib type used by the enclosing class.

### MorphType

- Role: Represents morph type within MeshMorph.
- Description: Describes the nested morph type type used by the enclosing class.

### Morpher

- Role: Represents morpher within MeshMorph.
- Description: Describes the nested morpher type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final VertexContext vctx`
- Role: Caches the vctx value.
- Description: Caches the `vctx` value for reuse.

#### `private final Collection<Morpher> morphs = new ArrayList<>()`
- Role: Implements the morphs operation.
- Description: Implements the private final collection<morpher> morphs = new array list<>() operation.

#### `private final Collection<Attrib> morphed = new ArrayList<>()`
- Role: Implements the morphed operation.
- Description: Implements the private final collection<attrib> morphed = new array list<>() operation.

#### `final Value va`
- Role: Caches the va value.
- Description: Caches the `va` value for reuse.

#### `final MorphType type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

### Methods

#### `public void morph(Value val, MorphType type, VertexContext vctx)`
- Role: Handles the morph path.
- Description: Implements the morph operation.

#### `Attrib(Value va, MorphType type)`
- Role: Handles the attrib workflow.
- Description: Implements the attrib operation.

#### `private MeshMorph(VertexContext vctx)`
- Role: Creates a new MeshMorph instance.
- Description: Constructs the MeshMorph instance from the supplied inputs.

#### `public void add(Morpher morph)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void add(Value va, MorphType type)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public static MeshMorph get(VertexContext vctx)`
- Role: Handles the get path.
- Description: Returns the cached get.