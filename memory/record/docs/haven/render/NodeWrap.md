---
source: [NodeWrap.java](../../../../../src/haven/render/NodeWrap.java)
created: 2026-06-13
updated: 2026-06-14
---

# NodeWrap

Composes render-tree node wrappers into one wrapping chain.

## Members

### Constants

#### `public static final NodeWrap nil = n -> n`
- Role: Provides the identity node wrapper.
- Description: Returns nodes unchanged.
- Value: `n -> n`

### Fields

#### `private final NodeWrap[] wraps`
- Role: Stores the wrapper chain.
- Description: Applied in sequence when a node is wrapped.

### Methods

#### `public RenderTree.Node apply(RenderTree.Node node)`
- Role: Wraps one render-tree node.
- Description: Applies the configured wrapper chain and returns the resulting node.

#### `public NodeWrap wrap()`
- Role: Returns the reusable wrapper function.
- Description: Exposes the current wrapper chain as a `NodeWrap`.

#### `public RenderTree.Node wrapped()`
- Role: Returns the wrapped node.
- Description: Exposes the node after all wrappers have been applied.

#### `public Composed(NodeWrap... wraps)`
- Role: Builds a composed wrapper chain.
- Description: Stores the input wrappers in the order they will be applied.

#### `public RenderTree.Node apply(RenderTree.Node node)`
- Role: Applies the wrapper chain to a node.
- Description: Returns the node after passing it through all composed wrappers.

#### `public boolean equals(Object o)`
- Role: Compares wrapper chains.
- Description: Treats two composed wrappers as equal when they contain the same chain.

#### `public int hashCode()`
- Role: Returns the chain hash code.
- Description: Hashes the wrapper sequence for interning and comparisons.

#### `public String toString()`
- Role: Formats the wrapper chain.
- Description: Returns a debug string for the composed wrapper sequence.

#### `public static NodeWrap compose(NodeWrap... w)`
- Role: Builds one composed wrapper.
- Description: Returns a wrapper that applies the input wrappers in order.
