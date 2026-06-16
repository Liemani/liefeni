# ValBlock

This file documents the responsibilities and members of `ValBlock`.

## Meta

- Source: [ValBlock.java](../../../../../src/haven/render/sl/ValBlock.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the val block shader-language AST node.

## Nested Types

### GValue

- Role: Represents gvalue within ValBlock.
- Description: Describes the nested gvalue type used by the enclosing class.

### Group

- Role: Represents group within ValBlock.
- Description: Describes the nested group type used by the enclosing class.

### Value

- Role: Represents value within ValBlock.
- Description: Describes the nested value type used by the enclosing class.

## Members

### Constants

#### `private static final ThreadLocal<Value> processing = new ThreadLocal<Value>()`
- Role: Defines the shared processing constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Collection<Value> values = new LinkedList<Value>()`
- Role: Caches values entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Object, Value> ext = new IdentityHashMap<Object, Value>()`
- Role: Caches ext entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean lock = false`
- Role: Tracks the lock flag.
- Description: Supports the lock operation used by the surrounding class.

#### `public final Type type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final Symbol name`
- Role: Holds the name state.
- Description: Backs the cached state for this file.

#### `public boolean used`
- Role: Tracks the used flag.
- Description: Supports the used operation used by the surrounding class.

#### `public LValue tgt`
- Role: Holds the tgt state.
- Description: Backs the cached state for this file.

#### `protected Expression init`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

#### `private final Collection<Value> deps = new LinkedList<Value>()`
- Role: Caches deps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Value> sdeps = new LinkedList<Value>()`
- Role: Caches sdeps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final OrderList<UnaryOperator<Expression>> mods = new OrderList<UnaryOperator<Expression>>()`
- Role: Caches mods entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean forced`
- Role: Tracks the forced flag.
- Description: Supports the forced operation used by the surrounding class.

#### `private final Collection<GValue> values = new LinkedList<GValue>()`
- Role: Caches values entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Value> deps = new LinkedList<Value>()`
- Role: Caches deps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Value> sdeps = new LinkedList<Value>()`
- Role: Caches sdeps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int state = 0`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

#### `public Expression modexpr`
- Role: Holds the modexpr state.
- Description: Backs the cached state for this file.

### Methods

#### `public Value(Type type, Symbol name)`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public Value(Type type)`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public void mod(UnaryOperator<Expression> macro, int order)`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public abstract Expression root()`
- Role: Performs root.
- Description: Supports the root operation used by the surrounding class.

#### `public Expression modexpr(Expression expr)`
- Role: Performs modexpr.
- Description: Supports the modexpr operation used by the surrounding class.

#### `protected void cons1()`
- Role: Performs cons1.
- Description: Supports the cons1 operation used by the surrounding class.

#### `protected void cons2(Block blk)`
- Role: Performs cons2.
- Description: Supports the cons2 operation used by the surrounding class.

#### `public Expression ref()`
- Role: Performs ref.
- Description: Supports the ref operation used by the surrounding class.

#### `public Expression depref()`
- Role: Performs depref.
- Description: Supports the depref operation used by the surrounding class.

#### `public void force()`
- Role: Performs force.
- Description: Supports the force operation used by the surrounding class.

#### `public void depend(Value dep)`
- Role: Performs depend.
- Description: Supports the depend operation used by the surrounding class.

#### `public void softdep(Value dep)`
- Role: Performs softdep.
- Description: Supports the softdep operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `protected abstract void cons1()`
- Role: Performs cons1.
- Description: Supports the cons1 operation used by the surrounding class.

#### `protected abstract void cons2(Block blk)`
- Role: Performs cons2.
- Description: Supports the cons2 operation used by the surrounding class.

#### `public GValue(Type type, Symbol name)`
- Role: Performs gvalue.
- Description: Supports the gvalue operation used by the surrounding class.

#### `public GValue(Type type)`
- Role: Performs gvalue.
- Description: Supports the gvalue operation used by the surrounding class.

#### `protected void cons1()`
- Role: Performs cons1.
- Description: Supports the cons1 operation used by the surrounding class.

#### `protected void cons2(Block blk)`
- Role: Performs cons2.
- Description: Supports the cons2 operation used by the surrounding class.

#### `public void addmods(Block blk)`
- Role: Performs addmods.
- Description: Supports the addmods operation used by the surrounding class.

#### `public final Expression root()`
- Role: Performs root.
- Description: Supports the root operation used by the surrounding class.

#### `private void depend1(Value dep)`
- Role: Performs depend1.
- Description: Supports the depend1 operation used by the surrounding class.

#### `public void depend(Value dep)`
- Role: Performs depend.
- Description: Supports the depend operation used by the surrounding class.

#### `private void softdep1(Value dep)`
- Role: Performs softdep1.
- Description: Supports the softdep1 operation used by the surrounding class.

#### `public void softdep(Value dep)`
- Role: Performs softdep.
- Description: Supports the softdep operation used by the surrounding class.

#### `public void depend(Value dep)`
- Role: Performs depend.
- Description: Supports the depend operation used by the surrounding class.

#### `public void softdep(Value dep)`
- Role: Performs softdep.
- Description: Supports the softdep operation used by the surrounding class.

#### `private void use(Value val)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `private void add(List<Value> buf, List<Value> closed, Value val)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void cons(Block blk)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public <T extends Value> T ext(Object id, Supplier<T> f)`
- Role: Performs ext.
- Description: Supports the ext operation used by the surrounding class.
