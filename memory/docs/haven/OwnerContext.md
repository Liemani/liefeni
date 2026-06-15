# OwnerContext

This file documents the responsibilities and members of `OwnerContext`.

## Meta

- Source: [OwnerContext.java](../../../src/haven/OwnerContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an owner context contract.

## Members

### Constants

#### `public static final ClassResolver<UI> uictx = new ClassResolver<UI>()`

- Description: TODO

### Fields

#### `public final Class<?> requested`

- Description: TODO

#### `private final Map<Class<?>, Function<T, ?>> reg = new HashMap<>()`

- Description: TODO

### Methods

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public default <T> T fcontext(Class<T> cl, boolean fail)`

- Description: TODO

#### `public default <T> Optional<T> ocontext(Class<T> cl)`

- Description: TODO

#### `public NoContext(String message, Throwable cause, Class<?> requested)`

- Description: TODO

#### `public NoContext(String message, Class<?> requested)`

- Description: TODO

#### `public NoContext(Class<?> requested)`

- Description: TODO

#### `public <C> ClassResolver<T> add(Class<C> cl, Function<T, ? extends C> p)`

- Description: TODO

#### `private <C> Function<T, ? extends C> get(Class<C> cl)`

- Description: TODO

#### `public <C> C context(Class<C> cl, T on, boolean fail)`

- Description: TODO

#### `public <C> C context(Class<C> cl, T on)`

- Description: TODO

#### `public OwnerContext curry(T on)`

- Description: TODO

#### `public static <C> C orparent(Class<C> cl, C val, OwnerContext parent)`

- Description: TODO
