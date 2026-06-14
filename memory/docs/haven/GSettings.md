# GSettings

## Meta

- Source: [GSettings.java](../../../src/haven/GSettings.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Holds graphics settings.

## Code Members

### Member Index

#### Fields

- [slot](#member-1)
- [settings](#member-2)
- [nm](#member-4)
- [val](#member-5)
- [set](#member-6)
- [real](#member-16)
- [lshadow](#member-24)
- [shadowres](#member-25)
- [vsync](#member-26)
- [hz](#member-30)
- [bghz](#member-31)
- [rscale](#member-32)
- [syncmode](#member-33)
- [lightmode](#member-34)
- [maxlights](#member-35)

#### Methods

- [SettingException(String msg)](#member-3)
- [Setting(String nm)](#member-7)
- [public abstract T parse(String val);](#member-8)
- [validate(Environment env, T val)](#member-9)
- [public abstract T defval();](#member-10)
- [reduce(T val)](#member-11)
- [restore(String prs)](#member-12)
- [clone()](#member-13)
- [BoolSetting(String nm)](#member-14)
- [parse(String val)](#member-15)
- [EnumSetting(String nm, Class<E> real)](#member-17)
- [parse(String val)](#member-18)
- [restore(String prs)](#member-19)
- [IntSetting(String nm)](#member-20)
- [parse(String val)](#member-21)
- [FloatSetting(String nm)](#member-22)
- [parse(String val)](#member-23)
- [HertzSetting(String nm)](#member-27)
- [parse(String val)](#member-28)
- [validate(Environment env, Float val)](#member-29)
- [find(String name)](#member-36)
- [update(Setting<T> set, T val)](#member-37)
- [supdate(Setting<T> set, T val)](#member-38)
- [validate0(Environment env, Setting<T> set)](#member-39)
- [validate(Environment env)](#member-40)
- [update(Environment env, Setting<T> set, T val)](#member-41)
- [setdef(Setting<T> set)](#member-42)
- [defaults()](#member-43)
- [reduce0(Setting<T> s)](#member-44)
- [save()](#member-45)
- [restore0(Setting<T> s, String prs)](#member-46)
- [load(boolean failsafe)](#member-47)
- [shader()](#member-48)
- [apply(Pipe p)](#member-49)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `slot`

- Description: TODO

<a id="member-2"></a>
##### `settings`

- Description: TODO

<a id="member-4"></a>
##### `nm`

- Description: TODO

<a id="member-5"></a>
##### `val`

- Description: TODO

<a id="member-6"></a>
##### `set`

- Description: TODO

<a id="member-16"></a>
##### `real`

- Description: TODO

<a id="member-24"></a>
##### `lshadow`

- Description: TODO

<a id="member-25"></a>
##### `shadowres`

- Description: TODO

<a id="member-26"></a>
##### `vsync`

- Description: TODO

<a id="member-30"></a>
##### `hz`

- Description: TODO

<a id="member-31"></a>
##### `bghz`

- Description: TODO

<a id="member-32"></a>
##### `rscale`

- Description: TODO

<a id="member-33"></a>
##### `syncmode`

- Description: TODO

<a id="member-34"></a>
##### `lightmode`

- Description: TODO

<a id="member-35"></a>
##### `maxlights`

- Description: TODO

#### Methods

<a id="member-3"></a>
##### `SettingException(String msg)`

- Description: TODO

<a id="member-7"></a>
##### `Setting(String nm)`

- Description: TODO

<a id="member-8"></a>
##### `public abstract T parse(String val);`

- Description: TODO

<a id="member-9"></a>
##### `validate(Environment env, T val)`

- Description: TODO

<a id="member-10"></a>
##### `public abstract T defval();`

- Description: TODO

<a id="member-11"></a>
##### `reduce(T val)`

- Description: TODO

<a id="member-12"></a>
##### `restore(String prs)`

- Description: TODO

<a id="member-13"></a>
##### `clone()`

- Description: TODO

<a id="member-14"></a>
##### `BoolSetting(String nm)`

- Description: TODO

<a id="member-15"></a>
##### `parse(String val)`

- Description: TODO

<a id="member-17"></a>
##### `EnumSetting(String nm, Class<E> real)`

- Description: TODO

<a id="member-18"></a>
##### `parse(String val)`

- Description: TODO

<a id="member-19"></a>
##### `restore(String prs)`

- Description: TODO

<a id="member-20"></a>
##### `IntSetting(String nm)`

- Description: TODO

<a id="member-21"></a>
##### `parse(String val)`

- Description: TODO

<a id="member-22"></a>
##### `FloatSetting(String nm)`

- Description: TODO

<a id="member-23"></a>
##### `parse(String val)`

- Description: TODO

<a id="member-27"></a>
##### `HertzSetting(String nm)`

- Description: TODO

<a id="member-28"></a>
##### `parse(String val)`

- Description: TODO

<a id="member-29"></a>
##### `validate(Environment env, Float val)`

- Description: TODO

<a id="member-36"></a>
##### `find(String name)`

- Description: TODO

<a id="member-37"></a>
##### `update(Setting<T> set, T val)`

- Description: TODO

<a id="member-38"></a>
##### `supdate(Setting<T> set, T val)`

- Description: TODO

<a id="member-39"></a>
##### `validate0(Environment env, Setting<T> set)`

- Description: TODO

<a id="member-40"></a>
##### `validate(Environment env)`

- Description: TODO

<a id="member-41"></a>
##### `update(Environment env, Setting<T> set, T val)`

- Description: TODO

<a id="member-42"></a>
##### `setdef(Setting<T> set)`

- Description: TODO

<a id="member-43"></a>
##### `defaults()`

- Description: TODO

<a id="member-44"></a>
##### `reduce0(Setting<T> s)`

- Description: TODO

<a id="member-45"></a>
##### `save()`

- Description: TODO

<a id="member-46"></a>
##### `restore0(Setting<T> s, String prs)`

- Description: TODO

<a id="member-47"></a>
##### `load(boolean failsafe)`

- Description: TODO

<a id="member-48"></a>
##### `shader()`

- Description: TODO

<a id="member-49"></a>
##### `apply(Pipe p)`

- Description: TODO
