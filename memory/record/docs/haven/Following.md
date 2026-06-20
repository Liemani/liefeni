---
source: [Following.java](../../../src/haven/Following.java)
created: 2026-06-13
updated: 2026-06-14
---

# Following

Represents the following Haven component.

## Nested Types

### $follow

- Role: Represents $follow within Following.
- Description: Describes the nested $follow type used by the enclosing class.

### XfResolver

- Role: Represents xf resolver within Following.
- Description: Describes the nested xf resolver type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final long tgt`
- Role: Stores the tgt value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> xfres`
- Role: Stores the xfres value.
- Description: Backs the cached state for this file.

#### `public final String xfname`
- Role: Stores the xfname value.
- Description: Backs the cached state for this file.

#### `private double lastv = 0.0`
- Role: Stores the lastv value.
- Description: Backs the cached state for this file.

#### `final Gob tgt`
- Role: Stores the tgt value.
- Description: Backs the cached state for this file.

#### `Supplier<? extends Pipe.Op> xf = null`
- Role: Holds the xf state.
- Description: Backs the cached state for this file.

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`
- Role: Holds the xf state.
- Description: Backs the cached state for this file.

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`
- Role: Holds the xf state.
- Description: Backs the cached state for this file.

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`
- Role: Holds the xf state.
- Description: Backs the cached state for this file.

#### `private XfResolver bxf = null`
- Role: Holds the bxf state.
- Description: Backs the cached state for this file.

### Methods

#### `public Following(Gob gob, long tgt, Indir<Resource> xfres, String xfname)`
- Role: Creates a new Following instance.
- Description: Constructs the instance and initializes its default state.

#### `public Gob followingTarget()`
- Role: Performs following target.
- Description: Supports the following target operation used by the surrounding class.

#### `public Coord3f getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `public double getv()`
- Role: Returns the avatar value.
- Description: Exposes the requested value without mutating state.

#### `public Gob tgt()`
- Role: Performs tgt.
- Description: Supports the tgt operation used by the surrounding class.

#### `XfResolver(Gob tgt)`
- Role: Handles the xf resolver workflow.
- Description: Supports the xf resolver operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public Pipe.Op xf()`
- Role: Performs xf.
- Description: Supports the xf operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
