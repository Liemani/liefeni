# Vao0State

This file documents the responsibilities and members of `Vao0State`.

## Meta

- Source: [Vao0State.java](../../../../../src/haven/render/gl/Vao0State.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents VAO state.

## Members

### Constants

#### `private static final BGL.ID[] nilen =`

- Description: TODO

#### `private static final boolean[] nilinst =`

- Description: TODO

### Fields

#### `public final GLEnvironment env`

- Description: TODO

#### `public final BGL.ID[] enable`

- Description: TODO

#### `public final boolean[] instanced`

- Description: TODO

#### `public final GLBuffer ebo`

- Description: TODO

#### `private final GLVertexArray vao0`

- Description: TODO

### Methods

#### `public Vao0State(GLEnvironment env, BGL.ID[] enable, boolean[] instanced, GLBuffer ebo)`

- Description: TODO

#### `public void apply(BGL gl)`

- Description: TODO

#### `public void unapply(BGL gl)`

- Description: TODO

#### `public void applyto(BGL gl, GLState sthat)`

- Description: TODO

#### `public static void apply(GLEnvironment env, BGL gl, Applier st, BGL.ID[] enable, boolean[] instanced)`

- Description: TODO

#### `public static void apply(GLEnvironment env, BGL gl, Applier st, GLBuffer ebo)`

- Description: TODO
