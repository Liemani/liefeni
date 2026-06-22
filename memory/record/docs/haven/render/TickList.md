---
source: [TickList.java](../../../../../src/haven/render/TickList.java)
created: 2026-06-13
updated: 2026-06-14
---

# TickList

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
- Role: Implements the slot operation.
- Description: Implements the public static final slot<monitor> slot = new slot<>(slot.type.sys, monitor.class) operation.
- Value: `new Slot<>(Slot.Type.SYS, Monitor.class)`

### Fields

#### `private final Map<Ticking, Entry> cur = new HashMap<>()`
- Role: Implements the cur operation.
- Description: Implements the private final map<ticking, entry> cur = new hash map<>() operation.

#### `final Ticking tick`
- Role: Caches the tick value.
- Description: Caches the `tick` value for reuse.

#### `final Object mon`
- Role: Caches the mon value.
- Description: Caches the `mon` value for reuse.

#### `int rc = 0`
- Role: Caches the rc value.
- Description: Caches the `rc` value for reuse.

#### `Object users = null`
- Role: Caches the users value.
- Description: Caches the `users` value for reuse.

#### `public final Object mon`
- Role: Caches the mon value.
- Description: Caches the `mon` value for reuse.

### Methods

#### `public Entry(Ticking tick, Object mon)`
- Role: Handles the entry path.
- Description: Implements the entry operation.

#### `public void get(TickNode user)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public boolean put(TickNode user)`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `public default void autotick(double dt)`
- Role: Handles the autotick path.
- Description: Implements the autotick operation.

#### `public default void autogtick(Render g)`
- Role: Handles the autogtick path.
- Description: Implements the autogtick operation.

#### `public Ticking ticker()`
- Role: Handles the ticker path.
- Description: Advances the er state.

#### `public void add(Slot<? extends TickNode> slot)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Slot<? extends TickNode> slot)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void update(Slot<? extends TickNode> slot)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void update(Pipe group, int[] statemask)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public Monitor(Object mon)`
- Role: Handles the monitor path.
- Description: Implements the monitor operation.

#### `public haven.render.sl.ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.