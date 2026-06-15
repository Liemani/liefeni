# Following

This file documents the responsibilities and members of `Following`.

## Meta

- Source: [Following.java](../../../src/haven/Following.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents follow behavior or state.

## Nested Types

### $follow

- Description: TODO

### XfResolver

- Description: TODO

## Members

### Constants

### Fields

#### `public final long tgt`

- Description: TODO

#### `public final Indir<Resource> xfres`

- Description: TODO

#### `public final String xfname`

- Description: TODO

#### `private double lastv = 0.0`

- Description: TODO

#### `final Gob tgt`

- Description: TODO

#### `Supplier<? extends Pipe.Op> xf = null`

- Description: TODO

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`

- Description: TODO

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`

- Description: TODO

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`

- Description: TODO

#### `private XfResolver bxf = null`

- Description: TODO

### Methods

#### `public Following(Gob gob, long tgt, Indir<Resource> xfres, String xfname)`

- Description: TODO

#### `public Gob followingTarget()`

- Description: TODO

#### `public Coord3f getc()`

- Description: TODO

#### `public double getv()`

- Description: TODO

#### `public Gob tgt()`

- Description: TODO

#### `XfResolver(Gob tgt)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public Pipe.Op xf()`

- Description: TODO

#### `public void apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO
