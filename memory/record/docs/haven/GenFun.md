---
source: [GenFun.java](../../../../src/haven/GenFun.java)
created: 2026-06-13
updated: 2026-06-14
---

# GenFun

Represents the gen fun Haven component.

## Nested Types

### Handler

- Role: Handles a generated interface invocation.
- Description: Invocation handler used by the dynamic proxy instance.

### MissingImplementationException

- Role: Signals a missing generated implementation.
- Description: Runtime exception thrown when no implementation is registered for a requested interface.

## Members

### Constants

#### `private static final InvocationHandler passthrough = new InvocationHandler()`
- Role: Implements the passthrough operation.
- Description: Implements the invocation handler operation.
- Value: `new InvocationHandler()`

### Fields

#### `public final Class<T> iface`
- Role: Caches the iface value.
- Description: Caches the `iface` value for reuse.

#### `public final T call`
- Role: Caches the call value.
- Description: Caches the `call` value for reuse.

#### `private final Map<Class<?>, T> cache = new java.util.concurrent.ConcurrentHashMap<>()`
- Role: Implements the cache operation.
- Description: Implements the private final map<class<?>, t> cache = new java.util.concurrent.concurrent hash map<>() operation.

#### `private final Map<Class<?>, T> registry = new HashMap<>()`
- Role: Implements the registry operation.
- Description: Implements the private final map<class<?>, t> registry = new hash map<>() operation.

### Methods

#### `public GenFun(Class<T> iface)`
- Role: Creates a new GenFun instance.
- Description: Constructs the GenFun instance from the supplied inputs.

#### `public GenFun<T> register(Class<?> cl, T impl)`
- Role: Handles the register path.
- Description: Implements the register operation.

#### `public MissingImplementationException(GenFun function, Object target)`
- Role: Handles the missing implementation exception path.
- Description: Implements the missing implementation exception operation.

#### `public Object invoke(Object proxy, Method method, Object[] args)`
- Role: Handles the invoke path.
- Description: Implements the invoke operation.