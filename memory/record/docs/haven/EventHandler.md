---
source: [EventHandler.java](../../../../src/haven/EventHandler.java)
created: 2026-06-13
updated: 2026-06-14
---

# EventHandler

Represents the event handler Haven component.

## Members

### Constants

### Fields

#### `public final Class<E> t`
- Role: Caches the t value.
- Description: Caches the `t` value for reuse.

#### `public final EventHandler<? super E> h`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `public final EventHandler<? super E> bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final Predicate<? super E> sel`
- Role: Caches the sel value.
- Description: Caches the `sel` value for reuse.

### Methods

#### `public boolean handle(E ev)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public Listener(Class<E> t, EventHandler<? super E> h)`
- Role: Handles the listener path.
- Description: Implements the listener operation.

#### `public boolean check(Object ev)`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public Filter(EventHandler<? super E> bk, Predicate<? super E> sel)`
- Role: Handles the filter path.
- Description: Implements the filter operation.

#### `public boolean handle(E ev)`
- Role: Handles the handle path.
- Description: Implements the handle operation.