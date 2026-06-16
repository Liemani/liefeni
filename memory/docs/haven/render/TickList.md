# TickList

This file documents the responsibilities and members of `TickList`.

## Meta

- Source: [TickList.java](../../../../src/haven/render/TickList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the tick list render pipeline component.

## Nested Types

### Entry

- Role: Represents entry within TickList.
- Description: Describes the nested entry type used by the enclosing class.

### Monitor

- Role: Represents monitor within TickList.
- Description: Describes the nested monitor type used by the enclosing class.

### TickNode

- Role: Represents tick node within TickList.
- Description: Describes the nested tick node type used by the enclosing class.

### Ticking

- Role: Represents ticking within TickList.
- Description: Describes the nested ticking type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<Monitor> slot = new Slot<>(Slot.Type.SYS, Monitor.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Map<Ticking, Entry> cur = new HashMap<>()`
- Role: Caches cur entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Ticking tick`
- Role: Holds the tick state.
- Description: Backs the cached state for this file.

#### `final Object mon`
- Role: Holds the mon state.
- Description: Backs the cached state for this file.

#### `int rc = 0`
- Role: Stores the rc value.
- Description: Backs the cached state for this file.

#### `Object users = null`
- Role: Holds the users state.
- Description: Backs the cached state for this file.

#### `public final Object mon`
- Role: Holds the mon state.
- Description: Backs the cached state for this file.

### Methods

#### `public Entry(Ticking tick, Object mon)`
- Role: Performs entry.
- Description: Supports the entry operation used by the surrounding class.

#### `public void get(TickNode user)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public boolean put(TickNode user)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public default void autotick(double dt)`
- Role: Performs autotick.
- Description: Supports the autotick operation used by the surrounding class.

#### `public default void autogtick(Render g)`
- Role: Performs autogtick.
- Description: Supports the autogtick operation used by the surrounding class.

#### `public Ticking ticker()`
- Role: Performs ticker.
- Description: Supports the ticker operation used by the surrounding class.

#### `public void add(Slot<? extends TickNode> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Slot<? extends TickNode> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void update(Slot<? extends TickNode> slot)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update(Pipe group, int[] statemask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Monitor(Object mon)`
- Role: Performs monitor.
- Description: Supports the monitor operation used by the surrounding class.

#### `public haven.render.sl.ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
