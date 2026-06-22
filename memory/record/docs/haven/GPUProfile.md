---
source: [GPUProfile.java](../../../../src/haven/GPUProfile.java)
created: 2026-06-13
updated: 2026-06-14
---

# GPUProfile

Represents the gpuprofile Haven component.

## Nested Types

### Frame

- Role: Represents frame within GPUProfile.
- Description: Describes the nested frame type used by the enclosing class.

### FramePart

- Role: Represents frame part within GPUProfile.
- Description: Describes the nested frame part type used by the enclosing class.

### Part

- Role: Represents part within GPUProfile.
- Description: Describes the nested part type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final Collection<Frame> waiting = new LinkedList<>()`
- Role: Implements the waiting operation.
- Description: Implements the private final collection<frame> waiting = new linked list<>() operation.

#### `private long fno = 1`
- Role: Caches the fno value.
- Description: Caches the `fno` value for reuse.

#### `private long f, t`
- Role: Caches the t value.
- Description: Caches the `t` value for reuse.

#### `private long f, t`
- Role: Caches the t value.
- Description: Caches the `t` value for reuse.

#### `private Part curp`
- Role: Caches the curp value.
- Description: Caches the `curp` value for reuse.

#### `private boolean fin`
- Role: Tracks the fin flag.
- Description: Caches the `fin` value for reuse.

#### `boolean done`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `private final Frame frame`
- Role: Caches the frame value.
- Description: Caches the `frame` value for reuse.

#### `private List<Part> waiting = new LinkedList<>()`
- Role: Implements the waiting operation.
- Description: Implements the private list<part> waiting = new linked list<>() operation.

### Methods

#### `public GPUProfile(int hl)`
- Role: Creates a new GPUProfile instance.
- Description: Constructs the GPUProfile instance from the supplied inputs.

#### `public Part(Object nm)`
- Role: Handles the part path.
- Description: Implements the part operation.

#### `public double f()`
- Role: Handles the f path.
- Description: Implements the f operation.

#### `public double t()`
- Role: Handles the t path.
- Description: Implements the t operation.

#### `protected abstract Frame frame()`
- Role: Handles the frame path.
- Description: Implements the frame operation.

#### `void query(Render out, Consumer<Long> prev)`
- Role: Handles the query path.
- Description: Implements the query operation.

#### `public Part part(Render out, Object nm)`
- Role: Handles the part path.
- Description: Implements the part operation.

#### `private Consumer<Long> tfin()`
- Role: Handles the tfin path.
- Description: Implements the tfin operation.

#### `public void fin(Render out)`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `private FramePart(Object nm, Frame frame)`
- Role: Handles the frame part path.
- Description: Implements the frame part operation.

#### `protected Frame frame()`
- Role: Handles the frame path.
- Description: Implements the frame operation.

#### `public Frame(Render out)`
- Role: Handles the frame path.
- Description: Implements the frame operation.

#### `protected Frame frame()`
- Role: Handles the frame path.
- Description: Implements the frame operation.

#### `public void fin(Render out)`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `private void fin2()`
- Role: Handles the fin2 path.
- Description: Implements the fin2 operation.

#### `public void check()`
- Role: Handles the check path.
- Description: Implements the check operation.