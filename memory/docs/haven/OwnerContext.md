# OwnerContext

This file documents the responsibilities and members of `OwnerContext`.

## Meta

- Source: [OwnerContext.java](../../../src/haven/OwnerContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the owner context Haven component.

## Members

### Constants

#### `public static final ClassResolver<UI> uictx = new ClassResolver<UI>()`
- Role: Defines the shared uictx constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Class<?> requested`
- Role: Holds the requested state.
- Description: Backs the cached state for this file.

#### `private final Map<Class<?>, Function<T, ?>> reg = new HashMap<>()`
- Role: Caches reg entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public default <T> T fcontext(Class<T> cl, boolean fail)`
- Role: Performs fcontext.
- Description: Supports the fcontext operation used by the surrounding class.

#### `public default <T> Optional<T> ocontext(Class<T> cl)`
- Role: Performs ocontext.
- Description: Supports the ocontext operation used by the surrounding class.

#### `public NoContext(String message, Throwable cause, Class<?> requested)`
- Role: Performs no context.
- Description: Supports the no context operation used by the surrounding class.

#### `public NoContext(String message, Class<?> requested)`
- Role: Performs no context.
- Description: Supports the no context operation used by the surrounding class.

#### `public NoContext(Class<?> requested)`
- Role: Performs no context.
- Description: Supports the no context operation used by the surrounding class.

#### `public <C> ClassResolver<T> add(Class<C> cl, Function<T, ? extends C> p)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `private <C> Function<T, ? extends C> get(Class<C> cl)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public <C> C context(Class<C> cl, T on, boolean fail)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public <C> C context(Class<C> cl, T on)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public OwnerContext curry(T on)`
- Role: Performs curry.
- Description: Supports the curry operation used by the surrounding class.

#### `public static <C> C orparent(Class<C> cl, C val, OwnerContext parent)`
- Role: Performs orparent.
- Description: Supports the orparent operation used by the surrounding class.
