---
source: [GPUProfile.java](../../../src/haven/GPUProfile.java)
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
- Role: Caches waiting entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private long fno = 1`
- Role: Stores the fno value.
- Description: Backs the cached state for this file.

#### `private long f, t`
- Role: Stores the t value.
- Description: Backs the cached state for this file.

#### `private long f, t`
- Role: Stores the t value.
- Description: Backs the cached state for this file.

#### `private Part curp`
- Role: Holds the curp state.
- Description: Backs the cached state for this file.

#### `private boolean fin`
- Role: Tracks the fin flag.
- Description: Supports the fin operation used by the surrounding class.

#### `boolean done`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `private final Frame frame`
- Role: Holds the frame state.
- Description: Backs the cached state for this file.

#### `private List<Part> waiting = new LinkedList<>()`
- Role: Caches waiting entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public GPUProfile(int hl)`
- Role: Creates a new GPUProfile instance.
- Description: Constructs the instance and initializes its default state.

#### `public Part(Object nm)`
- Role: Performs part.
- Description: Supports the part operation used by the surrounding class.

#### `public double f()`
- Role: Performs f.
- Description: Supports the f operation used by the surrounding class.

#### `public double t()`
- Role: Performs t.
- Description: Supports the t operation used by the surrounding class.

#### `protected abstract Frame frame()`
- Role: Performs frame.
- Description: Supports the frame operation used by the surrounding class.

#### `void query(Render out, Consumer<Long> prev)`
- Role: Performs query.
- Description: Supports the query operation used by the surrounding class.

#### `public Part part(Render out, Object nm)`
- Role: Performs part.
- Description: Supports the part operation used by the surrounding class.

#### `private Consumer<Long> tfin()`
- Role: Performs tfin.
- Description: Supports the tfin operation used by the surrounding class.

#### `public void fin(Render out)`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `private FramePart(Object nm, Frame frame)`
- Role: Performs frame part.
- Description: Supports the frame part operation used by the surrounding class.

#### `protected Frame frame()`
- Role: Performs frame.
- Description: Supports the frame operation used by the surrounding class.

#### `public Frame(Render out)`
- Role: Performs frame.
- Description: Supports the frame operation used by the surrounding class.

#### `protected Frame frame()`
- Role: Performs frame.
- Description: Supports the frame operation used by the surrounding class.

#### `public void fin(Render out)`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `private void fin2()`
- Role: Performs fin2.
- Description: Supports the fin2 operation used by the surrounding class.

#### `public void check()`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.
