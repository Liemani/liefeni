# UniformApplier

This file documents the responsibilities and members of `UniformApplier`.

## Meta

- Source: [UniformApplier.java](../../../../../src/haven/render/gl/UniformApplier.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for uniform applier.

## Members

### Constants

#### `private static final Map<Type, TypeMapping> mappings = new HashMap<>()`
- Role: Defines the shared mappings constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final String varnm`
- Role: Stores the varnm value.
- Description: Backs the cached state for this file.

#### `public final Type vartype`
- Role: Holds the vartype state.
- Description: Backs the cached state for this file.

#### `public final Class<?> valtype`
- Role: Holds the valtype state.
- Description: Backs the cached state for this file.

#### `private final Map<Class<?>, UniformApplier<?>> reg = new HashMap<>()`
- Role: Caches reg entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Class<?>, UniformApplier<?>> cache = new HashMap<>()`
- Role: Caches cache entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public NoMappingException(String varnm, Type vartype, Class<?> valtype)`
- Role: Performs no mapping exception.
- Description: Supports the no mapping exception operation used by the surrounding class.

#### `public static <T> void register(Type type, Class<T> cl, UniformApplier<T> fn)`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `public static <T> UniformApplier<T> get(Type type, Class<T> cl)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private static <T> void apply0(BGL gl, UniformApplier<T> fn, UniformID var, Type type, Object val)`
- Role: Performs apply0.
- Description: Supports the apply0 operation used by the surrounding class.

#### `private static void apply(BGL gl, Type type, UniformID var, Object val)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static void apply(BGL gl, GLProgram prog, Uniform var, Object val)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(BGL gl, UniformID var, Type type, T value)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
