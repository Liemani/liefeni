# GenFun

This file documents the responsibilities and members of `GenFun`.

## Meta

- Source: [GenFun.java](../../../src/haven/GenFun.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides generic function dispatch support.

## Nested Types

### Handler

- Description: TODO

### MissingImplementationException

- Description: TODO

## Members

### Constants

#### `private static final InvocationHandler passthrough = new InvocationHandler()`

- Description: TODO

### Fields

#### `public final Class<T> iface`

- Description: TODO

#### `public final T call`

- Description: TODO

#### `private final Map<Class<?>, T> cache = new java.util.concurrent.ConcurrentHashMap<>()`

- Description: TODO

#### `private final Map<Class<?>, T> registry = new HashMap<>()`

- Description: TODO

### Methods

#### `public GenFun(Class<T> iface)`

- Description: TODO

#### `public GenFun<T> register(Class<?> cl, T impl)`

- Description: TODO

#### `public MissingImplementationException(GenFun function, Object target)`

- Description: TODO

#### `public Object invoke(Object proxy, Method method, Object[] args)`

- Description: TODO
