# PType

## Meta

- Source: [PType.java](../../../src/haven/PType.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Defines protocol or packet types.

## Code Members

### Member Index

#### Constants

- [STR](#member-1)
- [NUM](#member-2)
- [INT](#member-3)
- [UINT](#member-4)
- [FLOAT](#member-5)
- [DOUBLE](#member-6)
- [BOOL](#member-7)
- [BYTES](#member-8)
- [IRES](#member-9)
- [RES](#member-10)
- [OBJS](#member-11)
- [LIST](#member-12)
- [MAP](#member-13)
- [COORD](#member-14)
- [FCOORD](#member-15)
- [COLOR](#member-16)
- [FCOLOR](#member-17)
- [UNIQID](#member-18)

#### Fields

- [expected](#member-22)
- [got](#member-23)
- [args](#member-26)
- [idx](#member-27)
- [name](#member-31)
- [variants](#member-32)
- [name](#member-35)
- [fun](#member-36)
- [cl](#member-39)
- [bk](#member-42)
- [xf](#member-43)

#### Methods

- [public Maybe<T> opt(Object val);](#member-19)
- [of(Object val)](#member-20)
- [is(Object val)](#member-21)
- [ValueFormatException(String expected, Object got)](#member-24)
- [getMessage()](#member-25)
- [MissingArgumentException(Object[] args, int idx)](#member-28)
- [getMessage()](#member-29)
- [opt(Object[] arr, int idx)](#member-30)
- [Or(String name, PType<T>... variants)](#member-33)
- [opt(Object val)](#member-34)
- [OFunction(String name, Function<Object, Maybe<T>> fun)](#member-37)
- [opt(Object val)](#member-38)
- [Cast(Class<T> cl)](#member-40)
- [opt(Object val)](#member-41)
- [MapValue(PType<P> bk, Function<P, R> xf)](#member-44)
- [opt(Object val)](#member-45)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `STR`

- Description: TODO

<a id="member-2"></a>
##### `NUM`

- Description: TODO

<a id="member-3"></a>
##### `INT`

- Description: TODO

<a id="member-4"></a>
##### `UINT`

- Description: TODO

<a id="member-5"></a>
##### `FLOAT`

- Description: TODO

<a id="member-6"></a>
##### `DOUBLE`

- Description: TODO

<a id="member-7"></a>
##### `BOOL`

- Description: TODO

<a id="member-8"></a>
##### `BYTES`

- Description: TODO

<a id="member-9"></a>
##### `IRES`

- Description: TODO

<a id="member-10"></a>
##### `RES`

- Description: TODO

<a id="member-11"></a>
##### `OBJS`

- Description: TODO

<a id="member-12"></a>
##### `LIST`

- Description: TODO

<a id="member-13"></a>
##### `MAP`

- Description: TODO

<a id="member-14"></a>
##### `COORD`

- Description: TODO

<a id="member-15"></a>
##### `FCOORD`

- Description: TODO

<a id="member-16"></a>
##### `COLOR`

- Description: TODO

<a id="member-17"></a>
##### `FCOLOR`

- Description: TODO

<a id="member-18"></a>
##### `UNIQID`

- Description: TODO

#### Fields

<a id="member-22"></a>
##### `expected`

- Description: TODO

<a id="member-23"></a>
##### `got`

- Description: TODO

<a id="member-26"></a>
##### `args`

- Description: TODO

<a id="member-27"></a>
##### `idx`

- Description: TODO

<a id="member-31"></a>
##### `name`

- Description: TODO

<a id="member-32"></a>
##### `variants`

- Description: TODO

<a id="member-35"></a>
##### `name`

- Description: TODO

<a id="member-36"></a>
##### `fun`

- Description: TODO

<a id="member-39"></a>
##### `cl`

- Description: TODO

<a id="member-42"></a>
##### `bk`

- Description: TODO

<a id="member-43"></a>
##### `xf`

- Description: TODO

#### Methods

<a id="member-19"></a>
##### `public Maybe<T> opt(Object val);`

- Description: TODO

<a id="member-20"></a>
##### `of(Object val)`

- Description: TODO

<a id="member-21"></a>
##### `is(Object val)`

- Description: TODO

<a id="member-24"></a>
##### `ValueFormatException(String expected, Object got)`

- Description: TODO

<a id="member-25"></a>
##### `getMessage()`

- Description: TODO

<a id="member-28"></a>
##### `MissingArgumentException(Object[] args, int idx)`

- Description: TODO

<a id="member-29"></a>
##### `getMessage()`

- Description: TODO

<a id="member-30"></a>
##### `opt(Object[] arr, int idx)`

- Description: TODO

<a id="member-33"></a>
##### `Or(String name, PType<T>... variants)`

- Description: TODO

<a id="member-34"></a>
##### `opt(Object val)`

- Description: TODO

<a id="member-37"></a>
##### `OFunction(String name, Function<Object, Maybe<T>> fun)`

- Description: TODO

<a id="member-38"></a>
##### `opt(Object val)`

- Description: TODO

<a id="member-40"></a>
##### `Cast(Class<T> cl)`

- Description: TODO

<a id="member-41"></a>
##### `opt(Object val)`

- Description: TODO

<a id="member-44"></a>
##### `MapValue(PType<P> bk, Function<P, R> xf)`

- Description: TODO

<a id="member-45"></a>
##### `opt(Object val)`

- Description: TODO
