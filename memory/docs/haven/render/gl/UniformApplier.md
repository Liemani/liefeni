# UniformApplier

This file documents the responsibilities and members of `UniformApplier`.

## Meta

- Source: [UniformApplier.java](../../../../../src/haven/render/gl/UniformApplier.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Applies uniform values to GL programs.

## Members

### Constants

#### `private static final Map<Type, TypeMapping> mappings = new HashMap<>()`

- Description: TODO

### Fields

#### `public final String varnm`

- Description: TODO

#### `public final Type vartype`

- Description: TODO

#### `public final Class<?> valtype`

- Description: TODO

#### `private final Map<Class<?>, UniformApplier<?>> reg = new HashMap<>()`

- Description: TODO

#### `private final Map<Class<?>, UniformApplier<?>> cache = new HashMap<>()`

- Description: TODO

### Methods

#### `public NoMappingException(String varnm, Type vartype, Class<?> valtype)`

- Description: TODO

#### `public static <T> void register(Type type, Class<T> cl, UniformApplier<T> fn)`

- Description: TODO

#### `public static <T> UniformApplier<T> get(Type type, Class<T> cl)`

- Description: TODO

#### `private static <T> void apply0(BGL gl, UniformApplier<T> fn, UniformID var, Type type, Object val)`

- Description: TODO

#### `private static void apply(BGL gl, Type type, UniformID var, Object val)`

- Description: TODO

#### `public static void apply(BGL gl, GLProgram prog, Uniform var, Object val)`

- Description: TODO

#### `public void apply(BGL gl, UniformID var, Type type, T value)`

- Description: TODO
