---
source: [ProxyPipe.java](../../../../../src/haven/render/ProxyPipe.java)
created: 2026-06-13
updated: 2026-06-14
---

# ProxyPipe

Defines the proxy pipe render pipeline component.

## Members

### Constants

### Fields

#### `private Pipe bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

### Methods

#### `public ProxyPipe(Pipe bk)`
- Role: Creates a new ProxyPipe instance.
- Description: Constructs the ProxyPipe instance from the supplied inputs.

#### `public ProxyPipe()`
- Role: Creates a new ProxyPipe instance.
- Description: Constructs the ProxyPipe instance from the supplied inputs.

#### `public <T extends State> T get(Slot<T> slot)`
- Role: Reads through to a backing pipe.
- Description: Returns the state from the proxied pipe.

#### `public State[] states()`
- Role: Exposes proxied states.
- Description: Returns the state snapshot from the backing pipe.

#### `public Pipe copy()`
- Role: Copies the proxied pipe.
- Description: Produces a copy of the current backing pipe reference.

#### `public Pipe update(Pipe np)`
- Role: Replaces the backing pipe.
- Description: Swaps the proxied pipe and returns the updated wrapper.

#### `public int[] dupdate(Pipe np)`
- Role: Computes proxy update deltas.
- Description: Returns the state differences caused by a new backing pipe.