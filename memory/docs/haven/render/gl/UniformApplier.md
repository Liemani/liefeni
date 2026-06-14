# UniformApplier

## Meta

- Source: [UniformApplier.java](../../../../../src/haven/render/gl/UniformApplier.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Applies uniform values to GL programs.

## Code Members

### Member Index

#### Fields

- [varnm](#member-1)
- [vartype](#member-2)
- [valtype](#member-3)
- [mappings](#member-5)
- [reg](#member-6)
- [cache](#member-7)

#### Methods

- [NoMappingException(String varnm, Type vartype, Class<?> valtype)](#member-4)
- [register(Type type, Class<T> cl, UniformApplier<T> fn)](#member-8)
- [get(Type type, Class<T> cl)](#member-9)
- [apply0(BGL gl, UniformApplier<T> fn, UniformID var, Type type, Object val)](#member-10)
- [apply(BGL gl, Type type, UniformID var, Object val)](#member-11)
- [apply(BGL gl, GLProgram prog, Uniform var, Object val)](#member-12)
- [public void apply(BGL gl, UniformID var, Type type, T value);](#member-13)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `varnm`

- Description: TODO

<a id="member-2"></a>
##### `vartype`

- Description: TODO

<a id="member-3"></a>
##### `valtype`

- Description: TODO

<a id="member-5"></a>
##### `mappings`

- Description: TODO

<a id="member-6"></a>
##### `reg`

- Description: TODO

<a id="member-7"></a>
##### `cache`

- Description: TODO

#### Methods

<a id="member-4"></a>
##### `NoMappingException(String varnm, Type vartype, Class<?> valtype)`

- Description: TODO

<a id="member-8"></a>
##### `register(Type type, Class<T> cl, UniformApplier<T> fn)`

- Description: TODO

<a id="member-9"></a>
##### `get(Type type, Class<T> cl)`

- Description: TODO

<a id="member-10"></a>
##### `apply0(BGL gl, UniformApplier<T> fn, UniformID var, Type type, Object val)`

- Description: TODO

<a id="member-11"></a>
##### `apply(BGL gl, Type type, UniformID var, Object val)`

- Description: TODO

<a id="member-12"></a>
##### `apply(BGL gl, GLProgram prog, Uniform var, Object val)`

- Description: TODO

<a id="member-13"></a>
##### `public void apply(BGL gl, UniformID var, Type type, T value);`

- Description: TODO
