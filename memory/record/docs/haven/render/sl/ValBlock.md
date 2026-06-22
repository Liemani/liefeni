---
source: [ValBlock.java](../../../../../../src/haven/render/sl/ValBlock.java)
created: 2026-06-13
updated: 2026-06-20
---

# ValBlock

Collects deferred shader values, orders their dependencies, and emits local declarations for them.

## Nested Types

### Value
Deferred value node with dependency tracking and a target local reference.

#### Members

##### Fields

#### `public final Type type`
- Role: Stores the value type.
- Description: Used when the value is materialized into a local declaration.

#### `public final Symbol name`
- Role: Stores the generated symbol.
- Description: Used when emitting the local declaration.

#### `public boolean used`
- Role: Tracks whether the value is required.
- Description: Set when the value participates in the emitted program.

#### `public LValue tgt`
- Role: Stores the emitted local target.
- Description: Filled during block construction.

#### `protected Expression init`
- Role: Stores the computed initializer.
- Description: Built from `root()` and post-modifiers.

##### Methods

#### `public Value(Type type, Symbol name)`
- Role: Builds a deferred value node.
- Description: Registers the value in the enclosing block.

#### `public Value(Type type)`
- Role: Builds a deferred value node with a generated name.
- Description: Uses an auto-generated symbol.

#### `public void mod(UnaryOperator<Expression> macro, int order)`
- Role: Adds a post-modifier.
- Description: Stores a transformation that runs after `root()`.

#### `public abstract Expression root()`
- Role: Produces the base expression.
- Description: Implemented by subclasses.

#### `public Expression modexpr(Expression expr)`
- Role: Applies all registered modifiers.
- Description: Runs the modifier pipeline in order.

#### `protected void cons1()`
- Role: Builds the initializer expression.
- Description: Computes the base expression and applies modifiers.

#### `protected void cons2(Block blk)`
- Role: Emits the local declaration.
- Description: Declares the local and stores the target reference.

#### `public Expression ref()`
- Role: Returns a reference expression.
- Description: Resolves to the emitted local once construction is complete.

#### `public Expression depref()`
- Role: Returns a dependency-tracking reference.
- Description: Registers the dependency while the value is under construction.

#### `public void force()`
- Role: Marks the value as required.
- Description: Ensures it is included in the emitted block.

#### `public void depend(Value dep)`
- Role: Adds a hard dependency.
- Description: Prevents the dependent value from being emitted after this one.

#### `public void softdep(Value dep)`
- Role: Adds a soft dependency.
- Description: Only forces the dependency when it is otherwise used.

#### `public String toString()`
- Role: Returns a debug string.
- Description: Shows the value type and name.

### Group
Groups several values that share construction and dependency handling.

#### Members

##### Nested Types

###### GValue
Grouped deferred value that shares construction with the parent group.

##### Methods

#### `protected abstract void cons1()`
- Role: Prepares the grouped value block.
- Description: Implemented by the concrete group owner.

#### `protected abstract void cons2(Block blk)`
- Role: Emits grouped declarations.
- Description: Implemented by the concrete group owner.

#### `public void depend(Value dep)`
- Role: Adds a hard dependency to all grouped values.
- Description: Propagates the dependency to every member value.

#### `public void softdep(Value dep)`
- Role: Adds a soft dependency to all grouped values.
- Description: Propagates the dependency to every member value.

### GValue
Grouped value that shares construction state with its parent group.

#### Members

##### Fields

#### `public Expression modexpr`
- Role: Stores the grouped modifier expression.
- Description: Computed after the shared base expression is resolved.

##### Methods

#### `public GValue(Type type, Symbol name)`
- Role: Builds a grouped value node.
- Description: Attaches the value to the parent group.

#### `public GValue(Type type)`
- Role: Builds a grouped value node with a generated name.
- Description: Uses an auto-generated symbol.

#### `protected void cons1()`
- Role: Initializes the shared construction state.
- Description: Runs the parent group setup once.

#### `protected void cons2(Block blk)`
- Role: Emits the grouped declaration.
- Description: Ensures the shared declaration exists before use.

#### `public void addmods(Block blk)`
- Role: Adds grouped modifiers to the block.
- Description: Emits the final assignment when the modified expression differs.

#### `public final Expression root()`
- Role: Disallows direct root construction.
- Description: Grouped values do not have an independent root expression.

#### `public void depend(Value dep)`
- Role: Adds a hard dependency for the whole group.
- Description: Propagates to the parent group.

#### `public void softdep(Value dep)`
- Role: Adds a soft dependency for the whole group.
- Description: Propagates to the parent group.

## Members

### Constants

#### `private static final ThreadLocal<Value> processing = new ThreadLocal<Value>()`
- Role: Tracks the value currently under construction.
- Description: Used to validate dependency references.

### Fields

#### `private final Collection<Value> values = new LinkedList<Value>()`
- Role: Stores all deferred values.
- Description: Iterated during block construction.

#### `private final Map<Object, Value> ext = new IdentityHashMap<Object, Value>()`
- Role: Stores extension values by identity.
- Description: Used by `ext()` to memoize external values.

#### `private boolean lock = false`
- Role: Locks the block during construction.
- Description: Prevents values from being added after emission starts.

### Methods

#### `public void cons(Block blk)`
- Role: Emits the deferred values into a block.
- Description: Resolves dependencies, then materializes the used values.

#### `public <T extends Value> T ext(Object id, Supplier<T> f)`
- Role: Returns a memoized extension value.
- Description: Creates the value once per identity key.