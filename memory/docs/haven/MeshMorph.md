# MeshMorph

This file documents the responsibilities and members of `MeshMorph`.

## Meta

- Source: [MeshMorph.java](../../../src/haven/MeshMorph.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents mesh morphing support.

## Nested Types

### Attrib

- Description: TODO

### MorphType

- Description: TODO

### Morpher

- Description: TODO

## Members

### Constants

### Fields

#### `public final VertexContext vctx`

- Description: TODO

#### `private final Collection<Morpher> morphs = new ArrayList<>()`

- Description: TODO

#### `private final Collection<Attrib> morphed = new ArrayList<>()`

- Description: TODO

#### `final Value va`

- Description: TODO

#### `final MorphType type`

- Description: TODO

### Methods

#### `public void morph(Value val, MorphType type, VertexContext vctx)`

- Description: TODO

#### `Attrib(Value va, MorphType type)`

- Description: TODO

#### `private MeshMorph(VertexContext vctx)`

- Description: TODO

#### `public void add(Morpher morph)`

- Description: TODO

#### `public void add(Value va, MorphType type)`

- Description: TODO

#### `public static MeshMorph get(VertexContext vctx)`

- Description: TODO
