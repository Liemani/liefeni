# ValBlock

## Meta

- Source: [ValBlock.java](../../../../../src/haven/render/sl/ValBlock.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a value block.

## Code Members

### Member Index

#### Fields

- [processing](#member-1)
- [values](#member-2)
- [ext](#member-3)
- [lock](#member-4)
- [type](#member-5)
- [name](#member-6)
- [used](#member-7)
- [tgt](#member-8)
- [init](#member-9)
- [deps](#member-10)
- [sdeps](#member-11)
- [mods](#member-12)
- [forced](#member-13)
- [values](#member-27)
- [deps](#member-28)
- [sdeps](#member-29)
- [state](#member-30)
- [modexpr](#member-33)

#### Methods

- [Value(Type type, Symbol name)](#member-14)
- [Value(Type type)](#member-15)
- [mod(UnaryOperator<Expression> macro, int order)](#member-16)
- [public abstract Expression root();](#member-17)
- [modexpr(Expression expr)](#member-18)
- [cons1()](#member-19)
- [cons2(Block blk)](#member-20)
- [ref()](#member-21)
- [depref()](#member-22)
- [force()](#member-23)
- [depend(Value dep)](#member-24)
- [softdep(Value dep)](#member-25)
- [toString()](#member-26)
- [protected abstract void cons1();](#member-31)
- [protected abstract void cons2(Block blk);](#member-32)
- [GValue(Type type, Symbol name)](#member-34)
- [GValue(Type type)](#member-35)
- [cons1()](#member-36)
- [cons2(Block blk)](#member-37)
- [addmods(Block blk)](#member-38)
- [root()](#member-39)
- [depend1(Value dep)](#member-40)
- [depend(Value dep)](#member-41)
- [softdep1(Value dep)](#member-42)
- [softdep(Value dep)](#member-43)
- [depend(Value dep)](#member-44)
- [softdep(Value dep)](#member-45)
- [use(Value val)](#member-46)
- [add(List<Value> buf, List<Value> closed, Value val)](#member-47)
- [cons(Block blk)](#member-48)
- [ext(Object id, Supplier<T> f)](#member-49)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `processing`

- Description: TODO

<a id="member-2"></a>
##### `values`

- Description: TODO

<a id="member-3"></a>
##### `ext`

- Description: TODO

<a id="member-4"></a>
##### `lock`

- Description: TODO

<a id="member-5"></a>
##### `type`

- Description: TODO

<a id="member-6"></a>
##### `name`

- Description: TODO

<a id="member-7"></a>
##### `used`

- Description: TODO

<a id="member-8"></a>
##### `tgt`

- Description: TODO

<a id="member-9"></a>
##### `init`

- Description: TODO

<a id="member-10"></a>
##### `deps`

- Description: TODO

<a id="member-11"></a>
##### `sdeps`

- Description: TODO

<a id="member-12"></a>
##### `mods`

- Description: TODO

<a id="member-13"></a>
##### `forced`

- Description: TODO

<a id="member-27"></a>
##### `values`

- Description: TODO

<a id="member-28"></a>
##### `deps`

- Description: TODO

<a id="member-29"></a>
##### `sdeps`

- Description: TODO

<a id="member-30"></a>
##### `state`

- Description: TODO

<a id="member-33"></a>
##### `modexpr`

- Description: TODO

#### Methods

<a id="member-14"></a>
##### `Value(Type type, Symbol name)`

- Description: TODO

<a id="member-15"></a>
##### `Value(Type type)`

- Description: TODO

<a id="member-16"></a>
##### `mod(UnaryOperator<Expression> macro, int order)`

- Description: TODO

<a id="member-17"></a>
##### `public abstract Expression root();`

- Description: TODO

<a id="member-18"></a>
##### `modexpr(Expression expr)`

- Description: TODO

<a id="member-19"></a>
##### `cons1()`

- Description: TODO

<a id="member-20"></a>
##### `cons2(Block blk)`

- Description: TODO

<a id="member-21"></a>
##### `ref()`

- Description: TODO

<a id="member-22"></a>
##### `depref()`

- Description: TODO

<a id="member-23"></a>
##### `force()`

- Description: TODO

<a id="member-24"></a>
##### `depend(Value dep)`

- Description: TODO

<a id="member-25"></a>
##### `softdep(Value dep)`

- Description: TODO

<a id="member-26"></a>
##### `toString()`

- Description: TODO

<a id="member-31"></a>
##### `protected abstract void cons1();`

- Description: TODO

<a id="member-32"></a>
##### `protected abstract void cons2(Block blk);`

- Description: TODO

<a id="member-34"></a>
##### `GValue(Type type, Symbol name)`

- Description: TODO

<a id="member-35"></a>
##### `GValue(Type type)`

- Description: TODO

<a id="member-36"></a>
##### `cons1()`

- Description: TODO

<a id="member-37"></a>
##### `cons2(Block blk)`

- Description: TODO

<a id="member-38"></a>
##### `addmods(Block blk)`

- Description: TODO

<a id="member-39"></a>
##### `root()`

- Description: TODO

<a id="member-40"></a>
##### `depend1(Value dep)`

- Description: TODO

<a id="member-41"></a>
##### `depend(Value dep)`

- Description: TODO

<a id="member-42"></a>
##### `softdep1(Value dep)`

- Description: TODO

<a id="member-43"></a>
##### `softdep(Value dep)`

- Description: TODO

<a id="member-44"></a>
##### `depend(Value dep)`

- Description: TODO

<a id="member-45"></a>
##### `softdep(Value dep)`

- Description: TODO

<a id="member-46"></a>
##### `use(Value val)`

- Description: TODO

<a id="member-47"></a>
##### `add(List<Value> buf, List<Value> closed, Value val)`

- Description: TODO

<a id="member-48"></a>
##### `cons(Block blk)`

- Description: TODO

<a id="member-49"></a>
##### `ext(Object id, Supplier<T> f)`

- Description: TODO
