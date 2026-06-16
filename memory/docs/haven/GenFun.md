# GenFun

This file documents the responsibilities and members of `GenFun`.

## Meta

- Source: [GenFun.java](../../../src/haven/GenFun.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the gen fun Haven component.

## Nested Types

### Handler

- Role: Represents handler within GenFun.
- Description: Describes the nested handler type used by the enclosing class.

### MissingImplementationException

- Role: Represents missing implementation exception within GenFun.
- Description: Describes the nested missing implementation exception type used by the enclosing class.

## Members

### Constants

#### `private static final InvocationHandler passthrough = new InvocationHandler()`
- Role: Defines the shared passthrough constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Class<T> iface`
- Role: Holds the iface state.
- Description: Backs the cached state for this file.

#### `public final T call`
- Role: Holds the call state.
- Description: Backs the cached state for this file.

#### `private final Map<Class<?>, T> cache = new java.util.concurrent.ConcurrentHashMap<>()`
- Role: Caches cache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Class<?>, T> registry = new HashMap<>()`
- Role: Caches registry entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public GenFun(Class<T> iface)`
- Role: Creates a new GenFun instance.
- Description: Constructs the instance and initializes its default state.

#### `public GenFun<T> register(Class<?> cl, T impl)`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `public MissingImplementationException(GenFun function, Object target)`
- Role: Performs missing implementation exception.
- Description: Supports the missing implementation exception operation used by the surrounding class.

#### `public Object invoke(Object proxy, Method method, Object[] args)`
- Role: Performs invoke.
- Description: Supports the invoke operation used by the surrounding class.
