# Defer

## Meta

- Source: [Defer.java](../../../src/haven/Defer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Schedules deferred work.

## Code Members

### Member Index

#### Fields

- [groups](#member-1)
- [queue](#member-2)
- [pool](#member-3)
- [maxthreads](#member-4)
- [busy](#member-5)
- [future](#member-10)
- [task](#member-16)
- [wq](#member-17)
- [prio](#member-18)
- [val](#member-19)
- [state](#member-20)
- [exc](#member-21)
- [lastload](#member-22)
- [running](#member-23)
- [threadno](#member-34)

#### Methods

- [public T call() throws InterruptedException;](#member-6)
- [CancelledException()](#member-7)
- [CancelledException(Throwable cause)](#member-8)
- [DeferredException(Throwable cause)](#member-9)
- [NotDoneException(Future future)](#member-11)
- [NotDoneException(Future future, Loading cause)](#member-12)
- [getMessage()](#member-13)
- [waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)](#member-14)
- [boostprio(int prio)](#member-15)
- [Future(Callable<T> task)](#member-24)
- [cancel()](#member-25)
- [chstate(String nst)](#member-26)
- [run()](#member-27)
- [get(int prio)](#member-28)
- [get()](#member-29)
- [done(int prio)](#member-30)
- [done()](#member-31)
- [priority()](#member-32)
- [boostprio(int prio)](#member-33)
- [Worker()](#member-35)
- [run()](#member-36)
- [defer(final Future<?> f)](#member-37)
- [defer(Callable<T> task)](#member-38)
- [getgroup()](#member-39)
- [later(Callable<T> task)](#member-40)
- [later(Runnable task, T result)](#member-41)
- [stats()](#member-42)
- [gstats()](#member-43)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `groups`

- Description: TODO

<a id="member-2"></a>
##### `queue`

- Description: TODO

<a id="member-3"></a>
##### `pool`

- Description: TODO

<a id="member-4"></a>
##### `maxthreads`

- Description: TODO

<a id="member-5"></a>
##### `busy`

- Description: TODO

<a id="member-10"></a>
##### `future`

- Description: TODO

<a id="member-16"></a>
##### `task`

- Description: TODO

<a id="member-17"></a>
##### `wq`

- Description: TODO

<a id="member-18"></a>
##### `prio`

- Description: TODO

<a id="member-19"></a>
##### `val`

- Description: TODO

<a id="member-20"></a>
##### `state`

- Description: TODO

<a id="member-21"></a>
##### `exc`

- Description: TODO

<a id="member-22"></a>
##### `lastload`

- Description: TODO

<a id="member-23"></a>
##### `running`

- Description: TODO

<a id="member-34"></a>
##### `threadno`

- Description: TODO

#### Methods

<a id="member-6"></a>
##### `public T call() throws InterruptedException;`

- Description: TODO

<a id="member-7"></a>
##### `CancelledException()`

- Description: TODO

<a id="member-8"></a>
##### `CancelledException(Throwable cause)`

- Description: TODO

<a id="member-9"></a>
##### `DeferredException(Throwable cause)`

- Description: TODO

<a id="member-11"></a>
##### `NotDoneException(Future future)`

- Description: TODO

<a id="member-12"></a>
##### `NotDoneException(Future future, Loading cause)`

- Description: TODO

<a id="member-13"></a>
##### `getMessage()`

- Description: TODO

<a id="member-14"></a>
##### `waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

<a id="member-15"></a>
##### `boostprio(int prio)`

- Description: TODO

<a id="member-24"></a>
##### `Future(Callable<T> task)`

- Description: TODO

<a id="member-25"></a>
##### `cancel()`

- Description: TODO

<a id="member-26"></a>
##### `chstate(String nst)`

- Description: TODO

<a id="member-27"></a>
##### `run()`

- Description: TODO

<a id="member-28"></a>
##### `get(int prio)`

- Description: TODO

<a id="member-29"></a>
##### `get()`

- Description: TODO

<a id="member-30"></a>
##### `done(int prio)`

- Description: TODO

<a id="member-31"></a>
##### `done()`

- Description: TODO

<a id="member-32"></a>
##### `priority()`

- Description: TODO

<a id="member-33"></a>
##### `boostprio(int prio)`

- Description: TODO

<a id="member-35"></a>
##### `Worker()`

- Description: TODO

<a id="member-36"></a>
##### `run()`

- Description: TODO

<a id="member-37"></a>
##### `defer(final Future<?> f)`

- Description: TODO

<a id="member-38"></a>
##### `defer(Callable<T> task)`

- Description: TODO

<a id="member-39"></a>
##### `getgroup()`

- Description: TODO

<a id="member-40"></a>
##### `later(Callable<T> task)`

- Description: TODO

<a id="member-41"></a>
##### `later(Runnable task, T result)`

- Description: TODO

<a id="member-42"></a>
##### `stats()`

- Description: TODO

<a id="member-43"></a>
##### `gstats()`

- Description: TODO
