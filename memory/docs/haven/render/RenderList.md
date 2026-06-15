# RenderList

This file documents the responsibilities and members of `RenderList`.

## Meta

- Source: [RenderList.java](../../../../src/haven/render/RenderList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a list of render tasks.

## Members

### Constants

### Fields

### Methods

#### `public GroupPipe state()`

- Description: TODO

#### `public R obj()`

- Description: TODO

#### `public default <T> Slot<T> cast(Class<T> cl)`

- Description: TODO

#### `public Locked lock()`

- Description: TODO

#### `public Iterable<? extends Slot<?>> slots()`

- Description: TODO

#### `public <R> void add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

#### `public void remove(RenderList<?> list)`

- Description: TODO

#### `public default String stats()`

- Description: TODO

#### `public void add(Slot<? extends R> slot)`

- Description: TODO

#### `public void remove(Slot<? extends R> slot)`

- Description: TODO

#### `public void update(Slot<? extends R> slot)`

- Description: TODO

#### `public void update(Pipe group, int[] statemask)`

- Description: TODO

#### `public default void syncadd(Adapter tree, Class<? extends R> type)`

- Description: TODO

#### `public default void asyncadd(Adapter tree, Class<? extends R> type)`

- Description: TODO
