---
source: [OwnerContext.java](../../../../src/haven/OwnerContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# OwnerContext

Represents the owner context Haven component.

## Members

### Constants

#### `public static final ClassResolver<UI> uictx = new ClassResolver<UI>()`
- Role: Implements the uictx operation.
- Description: Implements the public static final class resolver<ui> uictx = new class resolver<ui>() operation.
- Value: `new ClassResolver<UI>()`

### Fields

#### `public final Class<?> requested`
- Role: Caches the requested value.
- Description: Caches the `requested` value for reuse.

#### `private final Map<Class<?>, Function<T, ?>> reg = new HashMap<>()`
- Role: Implements the reg operation.
- Description: Implements the private final map<class<?>, function<t, ?>> reg = new hash map<>() operation.

### Methods

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public default <T> T fcontext(Class<T> cl, boolean fail)`
- Role: Handles the fcontext path.
- Description: Implements the fcontext operation.

#### `public default <T> Optional<T> ocontext(Class<T> cl)`
- Role: Handles the ocontext path.
- Description: Implements the ocontext operation.

#### `public NoContext(String message, Throwable cause, Class<?> requested)`
- Role: Handles the no context path.
- Description: Implements the no context operation.

#### `public NoContext(String message, Class<?> requested)`
- Role: Handles the no context path.
- Description: Implements the no context operation.

#### `public NoContext(Class<?> requested)`
- Role: Handles the no context path.
- Description: Implements the no context operation.

#### `public <C> ClassResolver<T> add(Class<C> cl, Function<T, ? extends C> p)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `private <C> Function<T, ? extends C> get(Class<C> cl)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public <C> C context(Class<C> cl, T on, boolean fail)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public <C> C context(Class<C> cl, T on)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public OwnerContext curry(T on)`
- Role: Handles the curry path.
- Description: Implements the curry operation.

#### `public static <C> C orparent(Class<C> cl, C val, OwnerContext parent)`
- Role: Handles the orparent path.
- Description: Implements the orparent operation.