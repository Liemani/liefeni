---
source: [PostProc.java](../../../../../../src/haven/render/sl/PostProc.java)
created: 2026-06-13
updated: 2026-06-20
---

# PostProc

Runs post-processing passes over shader-language trees and expands deferred expressions.

## Nested Types

### Processed
Marker interface for nodes that participate in post-processing.

#### Members

##### Methods

#### `public void process(PostProc proc)`
- Role: Runs the node-specific post-processing step.
- Description: Called when the post-processor matches the node id.

#### `public Object ppid()`
- Role: Returns the processing id.
- Description: Used to match nodes against post-processing passes.

### AutoID
Named automatic post-processing pass descriptor.

#### Members

##### Fields

#### `public final String name`
- Role: Stores the pass name.
- Description: Used in diagnostics and errors.

#### `public final int order`
- Role: Stores the pass order.
- Description: Lower orders run first.

##### Methods

#### `public AutoID(String name, int order)`
- Role: Builds a named pass descriptor.
- Description: Stores name and ordering priority.

#### `public AutoID(int order)`
- Role: Builds an unnamed pass descriptor.
- Description: Uses `<nil>` as the anonymous shader name.

#### `public void proc(Context ctx)`
- Role: Runs the pass over a context.
- Description: Repeatedly walks the tree until this id is processed.

#### `public String toString()`
- Role: Returns a debug string.
- Description: Shows the pass name and order.

### ProcExpression
Expression node that participates in post-processing.

#### Members

##### Fields

#### `public final Object id`
- Role: Stores the post-processing id.
- Description: Used to match the node against a pass.

##### Methods

#### `public ProcExpression(Object id)`
- Role: Builds a post-processing expression.
- Description: Stores the id for later matching.

#### `public Object ppid()`
- Role: Returns the processing id.
- Description: Used by the post-processor to match nodes.

### AutoMacro
Deferred macro expansion expression.

#### Members

##### Fields

#### `protected Expression exp = null`
- Role: Stores the expanded expression.
- Description: Filled during post-processing.

##### Methods

#### `public AutoMacro(Object id)`
- Role: Builds a deferred macro.
- Description: Stores the post-processing id.

#### `protected abstract Expression expand(Context ctx)`
- Role: Expands the macro.
- Description: Implemented by subclasses.

#### `protected Expression expand0(PostProc proc)`
- Role: Expands using the processor context.
- Description: Delegates to `expand`.

#### `public void process(PostProc proc)`
- Role: Runs macro expansion.
- Description: Stores the expanded expression for later walking/output.

#### `public void walk(Walker w)`
- Role: Walks the expanded expression.
- Description: Walks only when expansion already exists.

#### `public void output(Output out)`
- Role: Emits the expanded expression.
- Description: Writes the post-processed expression.

## Members

### Constants

#### `public static final AutoID misc = new AutoID("misc", 0)`
- Role: Defines the default automatic pass.
- Description: Runs before the higher-order passes.

### Fields

#### `public final Object id`
- Role: Stores the processor id.
- Description: Used when matching nodes to a pass.

#### `public final Context ctx`
- Role: Stores the processing context.
- Description: Passed to the current pass implementation.

### Methods

#### `public PostProc(Object id, Context ctx)`
- Role: Builds a post-processor.
- Description: Stores the target id and context.

#### `public PostProc(Object id)`
- Role: Builds a post-processor without a context.
- Description: Stores the target id only.

#### `public PostProc()`
- Role: Builds a self-id post-processor.
- Description: Uses the instance itself as the pass id.

#### `public void el(Element el)`
- Role: Visits an element for post-processing.
- Description: Processes matching nodes before recursing into children.

#### `public static void autoproc(Context ctx)`
- Role: Runs all automatic post-processing passes.
- Description: Repeats passes in order until none remain.