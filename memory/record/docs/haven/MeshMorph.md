---
source: [MeshMorph.java](../../../src/haven/MeshMorph.java)
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
- Role: Stores the vctx value.
- Description: Backs the cached state for this file.

#### `private final Collection<Morpher> morphs = new ArrayList<>()`
- Role: Caches morphs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Attrib> morphed = new ArrayList<>()`
- Role: Caches morphed entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Value va`
- Role: Holds the va state.
- Description: Backs the cached state for this file.

#### `final MorphType type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

### Methods

#### `public void morph(Value val, MorphType type, VertexContext vctx)`
- Role: Performs morph.
- Description: Supports the morph operation used by the surrounding class.

#### `Attrib(Value va, MorphType type)`
- Role: Handles the attrib workflow.
- Description: Supports the attrib operation used by the surrounding class.

#### `private MeshMorph(VertexContext vctx)`
- Role: Creates a new MeshMorph instance.
- Description: Constructs the instance and initializes its default state.

#### `public void add(Morpher morph)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void add(Value va, MorphType type)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public static MeshMorph get(VertexContext vctx)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.
