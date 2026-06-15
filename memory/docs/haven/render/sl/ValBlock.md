# ValBlock

This file documents the responsibilities and members of `ValBlock`.

## Meta

- Source: [ValBlock.java](../../../../../src/haven/render/sl/ValBlock.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a value block.

## Nested Types

### GValue

- Description: TODO

### Group

- Description: TODO

### Value

- Description: TODO

## Members

### Constants

#### `private static final ThreadLocal<Value> processing = new ThreadLocal<Value>()`

- Description: TODO

### Fields

#### `private final Collection<Value> values = new LinkedList<Value>()`

- Description: TODO

#### `private final Map<Object, Value> ext = new IdentityHashMap<Object, Value>()`

- Description: TODO

#### `private boolean lock = false`

- Description: TODO

#### `public final Type type`

- Description: TODO

#### `public final Symbol name`

- Description: TODO

#### `public boolean used`

- Description: TODO

#### `public LValue tgt`

- Description: TODO

#### `protected Expression init`

- Description: TODO

#### `private final Collection<Value> deps = new LinkedList<Value>()`

- Description: TODO

#### `private final Collection<Value> sdeps = new LinkedList<Value>()`

- Description: TODO

#### `private final OrderList<UnaryOperator<Expression>> mods = new OrderList<UnaryOperator<Expression>>()`

- Description: TODO

#### `private boolean forced`

- Description: TODO

#### `private final Collection<GValue> values = new LinkedList<GValue>()`

- Description: TODO

#### `private final Collection<Value> deps = new LinkedList<Value>()`

- Description: TODO

#### `private final Collection<Value> sdeps = new LinkedList<Value>()`

- Description: TODO

#### `private int state = 0`

- Description: TODO

#### `public Expression modexpr`

- Description: TODO

### Methods

#### `public Value(Type type, Symbol name)`

- Description: TODO

#### `public Value(Type type)`

- Description: TODO

#### `public void mod(UnaryOperator<Expression> macro, int order)`

- Description: TODO

#### `public abstract Expression root()`

- Description: TODO

#### `public Expression modexpr(Expression expr)`

- Description: TODO

#### `protected void cons1()`

- Description: TODO

#### `protected void cons2(Block blk)`

- Description: TODO

#### `public Expression ref()`

- Description: TODO

#### `public Expression depref()`

- Description: TODO

#### `public void force()`

- Description: TODO

#### `public void depend(Value dep)`

- Description: TODO

#### `public void softdep(Value dep)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `protected abstract void cons1()`

- Description: TODO

#### `protected abstract void cons2(Block blk)`

- Description: TODO

#### `public GValue(Type type, Symbol name)`

- Description: TODO

#### `public GValue(Type type)`

- Description: TODO

#### `protected void cons1()`

- Description: TODO

#### `protected void cons2(Block blk)`

- Description: TODO

#### `public void addmods(Block blk)`

- Description: TODO

#### `public final Expression root()`

- Description: TODO

#### `private void depend1(Value dep)`

- Description: TODO

#### `public void depend(Value dep)`

- Description: TODO

#### `private void softdep1(Value dep)`

- Description: TODO

#### `public void softdep(Value dep)`

- Description: TODO

#### `public void depend(Value dep)`

- Description: TODO

#### `public void softdep(Value dep)`

- Description: TODO

#### `private void use(Value val)`

- Description: TODO

#### `private void add(List<Value> buf, List<Value> closed, Value val)`

- Description: TODO

#### `public void cons(Block blk)`

- Description: TODO

#### `public <T extends Value> T ext(Object id, Supplier<T> f)`

- Description: TODO
