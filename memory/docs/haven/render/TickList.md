# TickList

This file documents the responsibilities and members of `TickList`.

## Meta

- Source: [TickList.java](../../../../src/haven/render/TickList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a ticking list.

## Nested Types

### Entry

- Description: TODO

### Monitor

- Description: TODO

### TickNode

- Description: TODO

### Ticking

- Description: TODO

## Members

### Constants

#### `public static final Slot<Monitor> slot = new Slot<>(Slot.Type.SYS, Monitor.class)`

- Description: TODO

### Fields

#### `private final Map<Ticking, Entry> cur = new HashMap<>()`

- Description: TODO

#### `final Ticking tick`

- Description: TODO

#### `final Object mon`

- Description: TODO

#### `int rc = 0`

- Description: TODO

#### `Object users = null`

- Description: TODO

#### `public final Object mon`

- Description: TODO

### Methods

#### `public Entry(Ticking tick, Object mon)`

- Description: TODO

#### `public void get(TickNode user)`

- Description: TODO

#### `public boolean put(TickNode user)`

- Description: TODO

#### `public default void autotick(double dt)`

- Description: TODO

#### `public default void autogtick(Render g)`

- Description: TODO

#### `public Ticking ticker()`

- Description: TODO

#### `public void add(Slot<? extends TickNode> slot)`

- Description: TODO

#### `public void remove(Slot<? extends TickNode> slot)`

- Description: TODO

#### `public void update(Slot<? extends TickNode> slot)`

- Description: TODO

#### `public void update(Pipe group, int[] statemask)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public Monitor(Object mon)`

- Description: TODO

#### `public haven.render.sl.ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO
