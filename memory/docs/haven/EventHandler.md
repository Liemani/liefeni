# EventHandler

This file documents the responsibilities and members of `EventHandler`.

## Meta

- Source: [EventHandler.java](../../../src/haven/EventHandler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the event handler Haven component.

## Members

### Constants

### Fields

#### `public final Class<E> t`
- Role: Holds the t state.
- Description: Backs the cached state for this file.

#### `public final EventHandler<? super E> h`
- Role: Stores the h value.
- Description: Backs the cached state for this file.

#### `public final EventHandler<? super E> bk`
- Role: Stores the bk value.
- Description: Backs the cached state for this file.

#### `public final Predicate<? super E> sel`
- Role: Holds the sel state.
- Description: Backs the cached state for this file.

### Methods

#### `public boolean handle(E ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public Listener(Class<E> t, EventHandler<? super E> h)`
- Role: Performs listener.
- Description: Supports the listener operation used by the surrounding class.

#### `public boolean check(Object ev)`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public Filter(EventHandler<? super E> bk, Predicate<? super E> sel)`
- Role: Performs filter.
- Description: Supports the filter operation used by the surrounding class.

#### `public boolean handle(E ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.
