---
source: [Fence.java](../../../../../../src/haven/render/gl/Fence.java)
created: 2026-06-13
updated: 2026-06-14
---

# Fence

Provides GL backend support for fence.

## Members

### Constants

### Fields

#### `private int state`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

### Methods

#### `public Fence()`
- Role: Creates a new Fence instance.
- Description: Constructs the Fence instance from the supplied inputs.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void abort()`
- Role: Handles the abort path.
- Description: Implements the abort operation.

#### `public boolean waitfor() throws InterruptedException`
- Role: Handles the waitfor workflow.
- Description: Registers a callback to run when the waitable becomes ready.

#### `public static Fence make(BGL gl)`
- Role: Handles the make path.
- Description: Implements the make operation.