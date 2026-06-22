---
source: [Following.java](../../../../src/haven/Following.java)
created: 2026-06-13
updated: 2026-06-14
---

# Following

Represents the following Haven component.

## Nested Types

### $follow

- Role: Registers the `follow` attribute delta.
- Description: Resolves and applies follow-target transformation state.

### XfResolver

- Role: Resolves the follow transform from a resource.
- Description: Loads and caches the transform state that makes the gob follow its target.

## Members

### Constants

### Fields

#### `public final long tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `public final Indir<Resource> xfres`
- Role: Caches the xfres value.
- Description: Caches the `xfres` value for reuse.

#### `public final String xfname`
- Role: Caches the xfname value.
- Description: Caches the `xfname` value for reuse.

#### `private double lastv = 0.0`
- Role: Caches the last v.
- Description: Caches the last v value.

#### `final Gob tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `Supplier<? extends Pipe.Op> xf = null`
- Role: Caches the xf value.
- Description: Caches the `xf` value for reuse.

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`
- Role: Caches the xf value.
- Description: Caches the `xf` value for reuse.

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`
- Role: Caches the xf value.
- Description: Caches the `xf` value for reuse.

#### `private Pipe.Op xf = null, lpxf = null, lbxf = null`
- Role: Caches the xf value.
- Description: Caches the `xf` value for reuse.

#### `private XfResolver bxf = null`
- Role: Caches the bxf value.
- Description: Caches the `bxf` value for reuse.

### Methods

#### `public Following(Gob gob, long tgt, Indir<Resource> xfres, String xfname)`
- Role: Creates a new Following instance.
- Description: Constructs the Following instance from the supplied inputs.

#### `public Gob followingTarget()`
- Role: Handles the following target path.
- Description: Follows the ing target.

#### `public Coord3f getc()`
- Role: Handles the getc path.
- Description: Returns the c.

#### `public double getv()`
- Role: Returns the v.
- Description: Returns the v.

#### `public Gob tgt()`
- Role: Handles the tgt path.
- Description: Implements the tgt operation.

#### `XfResolver(Gob tgt)`
- Role: Handles the xf resolver workflow.
- Description: Implements the xf resolver operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public Pipe.Op xf()`
- Role: Handles the xf path.
- Description: Implements the xf operation.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.