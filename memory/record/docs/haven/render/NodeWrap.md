---
source: [NodeWrap.java](../../../../src/haven/render/NodeWrap.java)
created: 2026-06-13
updated: 2026-06-14
---

# NodeWrap

Defines the node wrap render pipeline component.

## Members

### Constants

#### `public static final NodeWrap nil = n -> n`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final NodeWrap[] wraps`
- Role: Stores the wraps value.
- Description: Backs the cached state for this file.

### Methods

#### `public RenderTree.Node apply(RenderTree.Node node)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public NodeWrap wrap()`
- Role: Performs wrap.
- Description: Supports the wrap operation used by the surrounding class.

#### `public RenderTree.Node wrapped()`
- Role: Performs wrapped.
- Description: Supports the wrapped operation used by the surrounding class.

#### `public Composed(NodeWrap... wraps)`
- Role: Performs composed.
- Description: Supports the composed operation used by the surrounding class.

#### `public RenderTree.Node apply(RenderTree.Node node)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static NodeWrap compose(NodeWrap... w)`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.
