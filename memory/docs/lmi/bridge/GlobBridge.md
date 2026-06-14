# GlobBridge

## Meta

- Source: [Glob.java](../../../../src/haven/Glob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Owns the current Haven `Glob` reference and provides narrow world/map lookup helpers.

## Code Members

### Member Index

#### Fields

- [oc](#member-1)
- [map](#member-2)
- [sess](#member-3)
- [loader](#member-4)
- [gtime](#member-5)
- [sgtime](#member-6)
- [epoch](#member-7)
- [ast](#member-8)
- [party](#member-9)
- [lightamb](#member-10)
- [lightdif](#member-11)
- [lightspc](#member-12)
- [olightamb](#member-13)
- [olightdif](#member-14)
- [olightspc](#member-15)
- [tlightamb](#member-16)
- [tlightdif](#member-17)
- [tlightspc](#member-18)
- [lightang](#member-19)
- [lightelev](#member-20)
- [olightang](#member-21)
- [olightelev](#member-22)
- [tlightang](#member-23)
- [tlightelev](#member-24)
- [lchange](#member-25)
- [sky1](#member-26)
- [sky2](#member-27)
- [skyblend](#member-28)
- [cattr](#member-29)
- [wmap](#member-30)
- [glob](#member-37)
- [nm](#member-38)
- [base](#member-39)
- [comp](#member-40)
- [info](#member-41)
- [lastctick](#member-47)
- [itimefac](#member-50)
- [stimefac](#member-51)
- [ctimefac](#member-52)
- [slot](#member-62)
- [u_globtime](#member-63)
- [globtime](#member-64)

#### Methods

- [state()](#member-31)
- [update(Object... args)](#member-32)
- [remove()](#member-33)
- [tick(double dt)](#member-34)
- [FactMaker()](#member-35)
- [public Weather weather(Glob glob, Object... args);](#member-36)
- [CAttr(Glob glob, String nm, int base, int comp, ItemInfo.Raw info)](#member-42)
- [update(int base, int comp, ItemInfo.Raw info)](#member-43)
- [res()](#member-44)
- [colstep(Color o, Color t, double a)](#member-45)
- [ticklight(double dt)](#member-46)
- [ctick()](#member-48)
- [gtick(Render g)](#member-49)
- [tickgtime(double now, double dt)](#member-53)
- [updgtime(double sgtime, boolean inc)](#member-54)
- [gtimestats()](#member-55)
- [globtime()](#member-56)
- [blob(Message msg)](#member-57)
- [weather()](#member-58)
- [amblight(Pipe st)](#member-59)
- [getcattr(String nm)](#member-60)
- [cattr(String nm, int base, int comp, ItemInfo.Raw info)](#member-61)
- [FrameInfo(Glob glob)](#member-65)
- [shader()](#member-66)
- [apply(Pipe p)](#member-67)
- [globtime()](#member-68)
- [toString()](#member-69)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `oc`

- Description: TODO

<a id="member-2"></a>
##### `map`

- Description: TODO

<a id="member-3"></a>
##### `sess`

- Description: TODO

<a id="member-4"></a>
##### `loader`

- Description: TODO

<a id="member-5"></a>
##### `gtime`

- Description: TODO

<a id="member-6"></a>
##### `sgtime`

- Description: TODO

<a id="member-7"></a>
##### `epoch`

- Description: TODO

<a id="member-8"></a>
##### `ast`

- Description: TODO

<a id="member-9"></a>
##### `party`

- Description: TODO

<a id="member-10"></a>
##### `lightamb`

- Description: TODO

<a id="member-11"></a>
##### `lightdif`

- Description: TODO

<a id="member-12"></a>
##### `lightspc`

- Description: TODO

<a id="member-13"></a>
##### `olightamb`

- Description: TODO

<a id="member-14"></a>
##### `olightdif`

- Description: TODO

<a id="member-15"></a>
##### `olightspc`

- Description: TODO

<a id="member-16"></a>
##### `tlightamb`

- Description: TODO

<a id="member-17"></a>
##### `tlightdif`

- Description: TODO

<a id="member-18"></a>
##### `tlightspc`

- Description: TODO

<a id="member-19"></a>
##### `lightang`

- Description: TODO

<a id="member-20"></a>
##### `lightelev`

- Description: TODO

<a id="member-21"></a>
##### `olightang`

- Description: TODO

<a id="member-22"></a>
##### `olightelev`

- Description: TODO

<a id="member-23"></a>
##### `tlightang`

- Description: TODO

<a id="member-24"></a>
##### `tlightelev`

- Description: TODO

<a id="member-25"></a>
##### `lchange`

- Description: TODO

<a id="member-26"></a>
##### `sky1`

- Description: TODO

<a id="member-27"></a>
##### `sky2`

- Description: TODO

<a id="member-28"></a>
##### `skyblend`

- Description: TODO

<a id="member-29"></a>
##### `cattr`

- Description: TODO

<a id="member-30"></a>
##### `wmap`

- Description: TODO

<a id="member-37"></a>
##### `glob`

- Description: TODO

<a id="member-38"></a>
##### `nm`

- Description: TODO

<a id="member-39"></a>
##### `base`

- Description: TODO

<a id="member-40"></a>
##### `comp`

- Description: TODO

<a id="member-41"></a>
##### `info`

- Description: TODO

<a id="member-47"></a>
##### `lastctick`

- Description: TODO

<a id="member-50"></a>
##### `itimefac`

- Description: TODO

<a id="member-51"></a>
##### `stimefac`

- Description: TODO

<a id="member-52"></a>
##### `ctimefac`

- Description: TODO

<a id="member-62"></a>
##### `slot`

- Description: TODO

<a id="member-63"></a>
##### `u_globtime`

- Description: TODO

<a id="member-64"></a>
##### `globtime`

- Description: TODO

#### Methods

<a id="member-31"></a>
##### `state()`

- Description: TODO

<a id="member-32"></a>
##### `update(Object... args)`

- Description: TODO

<a id="member-33"></a>
##### `remove()`

- Description: TODO

<a id="member-34"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-35"></a>
##### `FactMaker()`

- Description: TODO

<a id="member-36"></a>
##### `public Weather weather(Glob glob, Object... args);`

- Description: TODO

<a id="member-42"></a>
##### `CAttr(Glob glob, String nm, int base, int comp, ItemInfo.Raw info)`

- Description: TODO

<a id="member-43"></a>
##### `update(int base, int comp, ItemInfo.Raw info)`

- Description: TODO

<a id="member-44"></a>
##### `res()`

- Description: TODO

<a id="member-45"></a>
##### `colstep(Color o, Color t, double a)`

- Description: TODO

<a id="member-46"></a>
##### `ticklight(double dt)`

- Description: TODO

<a id="member-48"></a>
##### `ctick()`

- Description: TODO

<a id="member-49"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-53"></a>
##### `tickgtime(double now, double dt)`

- Description: TODO

<a id="member-54"></a>
##### `updgtime(double sgtime, boolean inc)`

- Description: TODO

<a id="member-55"></a>
##### `gtimestats()`

- Description: TODO

<a id="member-56"></a>
##### `globtime()`

- Description: TODO

<a id="member-57"></a>
##### `blob(Message msg)`

- Description: TODO

<a id="member-58"></a>
##### `weather()`

- Description: TODO

<a id="member-59"></a>
##### `amblight(Pipe st)`

- Description: TODO

<a id="member-60"></a>
##### `getcattr(String nm)`

- Description: TODO

<a id="member-61"></a>
##### `cattr(String nm, int base, int comp, ItemInfo.Raw info)`

- Description: TODO

<a id="member-65"></a>
##### `FrameInfo(Glob glob)`

- Description: TODO

<a id="member-66"></a>
##### `shader()`

- Description: TODO

<a id="member-67"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-68"></a>
##### `globtime()`

- Description: TODO

<a id="member-69"></a>
##### `toString()`

- Description: TODO## Rules

- `Glob` reference ownership should live in the bridge layer, not in `AppContext`.
- `gridAtGc(Coord)` and `gridAtWorld(Coord2d)` should be the canonical lookup helpers.
- bridge helpers should not grow into general world-state storage.
