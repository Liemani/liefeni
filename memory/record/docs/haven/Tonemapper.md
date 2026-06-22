---
source: [Tonemapper.java](../../../../src/haven/Tonemapper.java)
created: 2026-06-13
updated: 2026-06-14
---

# Tonemapper

Represents the tonemapper Haven component.

## Members

### Constants

#### `public static final State justgamma = new RUtils.AdHoc(prog ->`
- Role: Implements the justgamma operation.
- Description: Implements the ad hoc operation.
- Value: `new RUtils.AdHoc(prog ->`

### Fields

#### `public final State draw`
- Role: Caches the draw value.
- Description: Caches the `draw` value for reuse.

### Methods

#### `public Tonemapper(State draw)`
- Role: Creates a new Tonemapper instance.
- Description: Constructs the Tonemapper instance from the supplied inputs.

#### `public void run(GOut g, Texture2D.Sampler2D in)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public int order()`
- Role: Implements the order operation.
- Description: Implements the order operation.

#### `public FrameFormat outformat(FrameFormat in)`
- Role: Returns the output framebuffer format.
- Description: Returns the output framebuffer format.