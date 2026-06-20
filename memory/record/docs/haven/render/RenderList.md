---
source: [RenderList.java](../../../../src/haven/render/RenderList.java)
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
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `public R obj()`
- Role: Performs obj.
- Description: Supports the obj operation used by the surrounding class.

#### `public default <T> Slot<T> cast(Class<T> cl)`
- Role: Performs cast.
- Description: Supports the cast operation used by the surrounding class.

#### `public Locked lock()`
- Role: Performs lock.
- Description: Supports the lock operation used by the surrounding class.

#### `public Iterable<? extends Slot<?>> slots()`
- Role: Performs slots.
- Description: Supports the slots operation used by the surrounding class.

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(RenderList<?> list)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public default String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `public void add(Slot<? extends R> slot)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Slot<? extends R> slot)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void update(Slot<? extends R> slot)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void update(Pipe group, int[] statemask)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public default void syncadd(Adapter tree, Class<? extends R> type)`
- Role: Performs syncadd.
- Description: Supports the syncadd operation used by the surrounding class.

#### `public default void asyncadd(Adapter tree, Class<? extends R> type)`
- Role: Performs asyncadd.
- Description: Supports the asyncadd operation used by the surrounding class.
