---
source: [UniformApplier.java](../../../../../../src/haven/render/gl/UniformApplier.java)
created: 2026-06-13
updated: 2026-06-14
---

# UniformApplier

Provides GL backend support for uniform applier.

## Members

### Constants

#### `private static final Map<Type, TypeMapping> mappings = new HashMap<>()`
- Role: Implements the mappings operation.
- Description: Implements the private static final map<type, type mapping> mappings = new hash map<>() operation.
- Value: `new HashMap<>()`

### Fields

#### `public final String varnm`
- Role: Caches the varnm value.
- Description: Caches the `varnm` value for reuse.

#### `public final Type vartype`
- Role: Caches the vartype value.
- Description: Caches the `vartype` value for reuse.

#### `public final Class<?> valtype`
- Role: Caches the valtype value.
- Description: Caches the `valtype` value for reuse.

#### `private final Map<Class<?>, UniformApplier<?>> reg = new HashMap<>()`
- Role: Implements the reg operation.
- Description: Implements the private final map<class<?>, uniform applier<?>> reg = new hash map<>() operation.

#### `private final Map<Class<?>, UniformApplier<?>> cache = new HashMap<>()`
- Role: Implements the cache operation.
- Description: Implements the private final map<class<?>, uniform applier<?>> cache = new hash map<>() operation.

### Methods

#### `public NoMappingException(String varnm, Type vartype, Class<?> valtype)`
- Role: Handles the no mapping exception path.
- Description: Implements the no mapping exception operation.

#### `public static <T> void register(Type type, Class<T> cl, UniformApplier<T> fn)`
- Role: Handles the register path.
- Description: Implements the register operation.

#### `public static <T> UniformApplier<T> get(Type type, Class<T> cl)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `private static <T> void apply0(BGL gl, UniformApplier<T> fn, UniformID var, Type type, Object val)`
- Role: Handles the apply0 path.
- Description: Implements the apply0 operation.

#### `private static void apply(BGL gl, Type type, UniformID var, Object val)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public static void apply(BGL gl, GLProgram prog, Uniform var, Object val)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void apply(BGL gl, UniformID var, Type type, T value)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.