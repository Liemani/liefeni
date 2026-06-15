# VaoBindState

This file documents the responsibilities and members of `VaoBindState`.

## Meta

- Source: [VaoBindState.java](../../../../../src/haven/render/gl/VaoBindState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents VAO binding state.

## Members

### Constants

#### `public static final boolean DO_GL_EBO_FIXUP = true`

- Description: TODO

### Fields

#### `public final GLVertexArray vao`

- Description: TODO

#### `public final GLBuffer ebo`

- Description: TODO

### Methods

#### `public VaoBindState(GLVertexArray vao, GLBuffer ebo)`

- Description: TODO

#### `public void apply(BGL gl)`

- Description: TODO

#### `public void unapply(BGL gl)`

- Description: TODO

#### `public void applyto(BGL gl, GLState sthat)`

- Description: TODO

#### `public static void apply(BGL gl, Applier st, GLVertexArray vao, GLBuffer ebo)`

- Description: TODO
