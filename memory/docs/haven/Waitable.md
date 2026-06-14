# Waitable

## Meta

- Source: [Waitable.java](../../../src/haven/Waitable.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Defines a waitable contract.

## Code Members

### Member Index

#### Fields

- [dummy](#member-3)
- [waiters](#member-4)
- [callback](#member-5)
- [ops](#member-12)
- [callback](#member-13)
- [done](#member-14)
- [ready](#member-15)
- [callback](#member-20)
- [cw](#member-21)

#### Methods

- [public void waitfor(Runnable callback, Consumer<Waiting> reg);](#member-1)
- [public void cancel();](#member-2)
- [Waiter(Runnable callback)](#member-6)
- [cancel()](#member-7)
- [wnotify()](#member-8)
- [add(Waiter w)](#member-9)
- [add(Runnable callback)](#member-10)
- [waitfor(Runnable callback, Consumer<Waiting> reg)](#member-11)
- [Disjunction(Runnable callback, Waitable... ops)](#member-16)
- [run()](#member-17)
- [cancel()](#member-18)
- [or(Runnable callback, Consumer<Waiting> reg, Waitable... ops)](#member-19)
- [Checker(Runnable callback)](#member-22)
- [protected abstract Object monitor();](#member-23)
- [protected abstract boolean check();](#member-24)
- [protected abstract Waiting add();](#member-25)
- [addi()](#member-26)
- [run()](#member-27)
- [cancel()](#member-28)

### Member Reference

#### Fields

<a id="member-3"></a>
##### `dummy`

- Description: TODO

<a id="member-4"></a>
##### `waiters`

- Description: TODO

<a id="member-5"></a>
##### `callback`

- Description: TODO

<a id="member-12"></a>
##### `ops`

- Description: TODO

<a id="member-13"></a>
##### `callback`

- Description: TODO

<a id="member-14"></a>
##### `done`

- Description: TODO

<a id="member-15"></a>
##### `ready`

- Description: TODO

<a id="member-20"></a>
##### `callback`

- Description: TODO

<a id="member-21"></a>
##### `cw`

- Description: TODO

#### Methods

<a id="member-1"></a>
##### `public void waitfor(Runnable callback, Consumer<Waiting> reg);`

- Description: TODO

<a id="member-2"></a>
##### `public void cancel();`

- Description: TODO

<a id="member-6"></a>
##### `Waiter(Runnable callback)`

- Description: TODO

<a id="member-7"></a>
##### `cancel()`

- Description: TODO

<a id="member-8"></a>
##### `wnotify()`

- Description: TODO

<a id="member-9"></a>
##### `add(Waiter w)`

- Description: TODO

<a id="member-10"></a>
##### `add(Runnable callback)`

- Description: TODO

<a id="member-11"></a>
##### `waitfor(Runnable callback, Consumer<Waiting> reg)`

- Description: TODO

<a id="member-16"></a>
##### `Disjunction(Runnable callback, Waitable... ops)`

- Description: TODO

<a id="member-17"></a>
##### `run()`

- Description: TODO

<a id="member-18"></a>
##### `cancel()`

- Description: TODO

<a id="member-19"></a>
##### `or(Runnable callback, Consumer<Waiting> reg, Waitable... ops)`

- Description: TODO

<a id="member-22"></a>
##### `Checker(Runnable callback)`

- Description: TODO

<a id="member-23"></a>
##### `protected abstract Object monitor();`

- Description: TODO

<a id="member-24"></a>
##### `protected abstract boolean check();`

- Description: TODO

<a id="member-25"></a>
##### `protected abstract Waiting add();`

- Description: TODO

<a id="member-26"></a>
##### `addi()`

- Description: TODO

<a id="member-27"></a>
##### `run()`

- Description: TODO

<a id="member-28"></a>
##### `cancel()`

- Description: TODO
