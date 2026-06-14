# Config

## Meta

- Source: [Config.java](../../../src/haven/Config.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Holds client configuration and option access.

## Code Members

### Member Index

#### Fields

- [jarprops](#member-1)
- [confid](#member-2)
- [par](#member-3)
- [localprops](#member-4)
- [global](#member-5)
- [init](#member-12)
- [inited](#member-13)
- [val](#member-14)
- [directory](#member-30)
- [rel](#member-31)
- [props](#member-32)
- [global](#member-35)

#### Methods

- [get()](#member-6)
- [getjarprops()](#member-7)
- [getlocalprops()](#member-8)
- [getprop(String name, String def)](#member-9)
- [parsepath(String p)](#member-10)
- [parseuri(String url)](#member-11)
- [Variable(Function<Config, T> init)](#member-15)
- [get()](#member-16)
- [set(T val)](#member-17)
- [def(Supplier<V> defval)](#member-18)
- [prop(String name, Function<String, V> parse, Supplier<V> defval)](#member-19)
- [prop(String name, String defval)](#member-20)
- [propi(String name, int defval)](#member-21)
- [propb(String name, boolean defval)](#member-22)
- [propf(String name, Double defval)](#member-23)
- [propb(String name, byte[] defval)](#member-24)
- [proph(String name, int defport, NamedSocketAddress defval)](#member-25)
- [propu(String name, URI defval)](#member-26)
- [propu(String name, String defval)](#member-27)
- [propp(String name, Path defval)](#member-28)
- [propp(String name, String defval)](#member-29)
- [Services(URI rel, Properties props)](#member-33)
- [fetch(URI uri)](#member-34)
- [get()](#member-36)
- [geturi(String name)](#member-37)
- [var(String name, String defval)](#member-38)
- [usage(PrintStream out)](#member-39)
- [cmdline(String[] args)](#member-40)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `jarprops`

- Description: TODO

<a id="member-2"></a>
##### `confid`

- Description: TODO

<a id="member-3"></a>
##### `par`

- Description: TODO

<a id="member-4"></a>
##### `localprops`

- Description: TODO

<a id="member-5"></a>
##### `global`

- Description: TODO

<a id="member-12"></a>
##### `init`

- Description: TODO

<a id="member-13"></a>
##### `inited`

- Description: TODO

<a id="member-14"></a>
##### `val`

- Description: TODO

<a id="member-30"></a>
##### `directory`

- Description: TODO

<a id="member-31"></a>
##### `rel`

- Description: TODO

<a id="member-32"></a>
##### `props`

- Description: TODO

<a id="member-35"></a>
##### `global`

- Description: TODO

#### Methods

<a id="member-6"></a>
##### `get()`

- Description: TODO

<a id="member-7"></a>
##### `getjarprops()`

- Description: TODO

<a id="member-8"></a>
##### `getlocalprops()`

- Description: TODO

<a id="member-9"></a>
##### `getprop(String name, String def)`

- Description: TODO

<a id="member-10"></a>
##### `parsepath(String p)`

- Description: TODO

<a id="member-11"></a>
##### `parseuri(String url)`

- Description: TODO

<a id="member-15"></a>
##### `Variable(Function<Config, T> init)`

- Description: TODO

<a id="member-16"></a>
##### `get()`

- Description: TODO

<a id="member-17"></a>
##### `set(T val)`

- Description: TODO

<a id="member-18"></a>
##### `def(Supplier<V> defval)`

- Description: TODO

<a id="member-19"></a>
##### `prop(String name, Function<String, V> parse, Supplier<V> defval)`

- Description: TODO

<a id="member-20"></a>
##### `prop(String name, String defval)`

- Description: TODO

<a id="member-21"></a>
##### `propi(String name, int defval)`

- Description: TODO

<a id="member-22"></a>
##### `propb(String name, boolean defval)`

- Description: TODO

<a id="member-23"></a>
##### `propf(String name, Double defval)`

- Description: TODO

<a id="member-24"></a>
##### `propb(String name, byte[] defval)`

- Description: TODO

<a id="member-25"></a>
##### `proph(String name, int defport, NamedSocketAddress defval)`

- Description: TODO

<a id="member-26"></a>
##### `propu(String name, URI defval)`

- Description: TODO

<a id="member-27"></a>
##### `propu(String name, String defval)`

- Description: TODO

<a id="member-28"></a>
##### `propp(String name, Path defval)`

- Description: TODO

<a id="member-29"></a>
##### `propp(String name, String defval)`

- Description: TODO

<a id="member-33"></a>
##### `Services(URI rel, Properties props)`

- Description: TODO

<a id="member-34"></a>
##### `fetch(URI uri)`

- Description: TODO

<a id="member-36"></a>
##### `get()`

- Description: TODO

<a id="member-37"></a>
##### `geturi(String name)`

- Description: TODO

<a id="member-38"></a>
##### `var(String name, String defval)`

- Description: TODO

<a id="member-39"></a>
##### `usage(PrintStream out)`

- Description: TODO

<a id="member-40"></a>
##### `cmdline(String[] args)`

- Description: TODO
