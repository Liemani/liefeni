# GPUProfile

This file documents the responsibilities and members of `GPUProfile`.

## Meta

- Source: [GPUProfile.java](../../../src/haven/GPUProfile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GPU profiling support.

## Nested Types

### Frame

- Description: TODO

### FramePart

- Description: TODO

### Part

- Description: TODO

## Members

### Constants

### Fields

#### `private final Collection<Frame> waiting = new LinkedList<>()`

- Description: TODO

#### `private long fno = 1`

- Description: TODO

#### `private long f, t`

- Description: TODO

#### `private long f, t`

- Description: TODO

#### `private Part curp`

- Description: TODO

#### `private boolean fin`

- Description: TODO

#### `boolean done`

- Description: TODO

#### `private final Frame frame`

- Description: TODO

#### `private List<Part> waiting = new LinkedList<>()`

- Description: TODO

### Methods

#### `public GPUProfile(int hl)`

- Description: TODO

#### `public Part(Object nm)`

- Description: TODO

#### `public double f()`

- Description: TODO

#### `public double t()`

- Description: TODO

#### `protected abstract Frame frame()`

- Description: TODO

#### `void query(Render out, Consumer<Long> prev)`

- Description: TODO

#### `public Part part(Render out, Object nm)`

- Description: TODO

#### `private Consumer<Long> tfin()`

- Description: TODO

#### `public void fin(Render out)`

- Description: TODO

#### `private FramePart(Object nm, Frame frame)`

- Description: TODO

#### `protected Frame frame()`

- Description: TODO

#### `public Frame(Render out)`

- Description: TODO

#### `protected Frame frame()`

- Description: TODO

#### `public void fin(Render out)`

- Description: TODO

#### `private void fin2()`

- Description: TODO

#### `public void check()`

- Description: TODO
