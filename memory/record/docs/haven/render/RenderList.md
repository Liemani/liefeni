---
source: [RenderList.java](../../../../../src/haven/render/RenderList.java)
created: 2026-06-13
updated: 2026-06-14
---

# RenderList

Defines the render list render pipeline component.

## Members

### Constants

### Fields

### Methods

#### `public GroupPipe state()`
- Role: Handles the state path.
- Description: Implements the state operation.

#### `public R obj()`
- Role: Handles the obj path.
- Description: Implements the obj operation.

#### `public default <T> Slot<T> cast(Class<T> cl)`
- Role: Handles the cast path.
- Description: Implements the cast operation.

#### `public Locked lock()`
- Role: Handles the lock path.
- Description: Implements the lock operation.

#### `public Iterable<? extends Slot<?>> slots()`
- Role: Handles the slots path.
- Description: Implements the slots operation.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(RenderList<?> list)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public default String stats()`
- Role: Handles the stats path.
- Description: Implements the stats operation.

#### `public void add(Slot<? extends R> slot)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Slot<? extends R> slot)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void update(Slot<? extends R> slot)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void update(Pipe group, int[] statemask)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public default void syncadd(Adapter tree, Class<? extends R> type)`
- Role: Handles the syncadd path.
- Description: Implements the syncadd operation.

#### `public default void asyncadd(Adapter tree, Class<? extends R> type)`
- Role: Handles the asyncadd path.
- Description: Implements the asyncadd operation.