# Fightsess

## Meta

- Source: [Fightsess.java](../../../src/haven/Fightsess.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents fight session state.

## Code Members

### Member Index

#### Fields

- [off](#member-1)
- [cdframe](#member-2)
- [actframe](#member-3)
- [actframeo](#member-4)
- [indframe](#member-5)
- [indframeo](#member-6)
- [indbframe](#member-7)
- [indbframeo](#member-8)
- [useframe](#member-9)
- [useframeo](#member-10)
- [actpitch](#member-11)
- [actions](#member-12)
- [use](#member-13)
- [useb](#member-14)
- [pcc](#member-15)
- [pho](#member-16)
- [fv](#member-17)
- [res](#member-18)
- [cs](#member-19)
- [ct](#member-20)
- [spr](#member-26)
- [slot](#member-27)
- [used](#member-28)
- [tgtfx](#member-31)
- [curfx](#member-32)
- [ipf](#member-36)
- [ip](#member-37)
- [oip](#member-38)
- [cmc](#member-40)
- [usec1](#member-41)
- [usec2](#member-42)
- [lastact1](#member-43)
- [lastact2](#member-44)
- [lastacttip1](#member-45)
- [lastacttip2](#member-46)
- [curtgtfx](#member-47)
- [prevtt](#member-49)
- [acttip](#member-50)
- [keytips](#member-51)
- [kb_acts](#member-54)
- [kb_relcycle](#member-55)
- [n](#member-56)
- [holdgrab](#member-59)
- [held](#member-60)

#### Methods

- [Action(Indir<Resource> res)](#member-21)
- [create(UI ui, Object[] args)](#member-22)
- [added()](#member-23)
- [presize()](#member-24)
- [updatepos()](#member-25)
- [Effect(Sprite spr)](#member-29)
- [added(RenderTree.Slot slot)](#member-30)
- [fxon(long gobid, Resource fx, Effect cur)](#member-33)
- [tick(double dt)](#member-34)
- [destroy()](#member-35)
- [actc(int i)](#member-39)
- [draw(GOut g)](#member-48)
- [tooltip(Coord c, Widget prev)](#member-52)
- [uimsg(String msg, Object... args)](#member-53)
- [Release(int n)](#member-57)
- [run()](#member-58)
- [globtype(GlobKeyEvent ev)](#member-61)
- [keydown(KeyDownEvent ev)](#member-62)
- [keyup(KeyUpEvent ev)](#member-63)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `off`

- Description: TODO

<a id="member-2"></a>
##### `cdframe`

- Description: TODO

<a id="member-3"></a>
##### `actframe`

- Description: TODO

<a id="member-4"></a>
##### `actframeo`

- Description: TODO

<a id="member-5"></a>
##### `indframe`

- Description: TODO

<a id="member-6"></a>
##### `indframeo`

- Description: TODO

<a id="member-7"></a>
##### `indbframe`

- Description: TODO

<a id="member-8"></a>
##### `indbframeo`

- Description: TODO

<a id="member-9"></a>
##### `useframe`

- Description: TODO

<a id="member-10"></a>
##### `useframeo`

- Description: TODO

<a id="member-11"></a>
##### `actpitch`

- Description: TODO

<a id="member-12"></a>
##### `actions`

- Description: TODO

<a id="member-13"></a>
##### `use`

- Description: TODO

<a id="member-14"></a>
##### `useb`

- Description: TODO

<a id="member-15"></a>
##### `pcc`

- Description: TODO

<a id="member-16"></a>
##### `pho`

- Description: TODO

<a id="member-17"></a>
##### `fv`

- Description: TODO

<a id="member-18"></a>
##### `res`

- Description: TODO

<a id="member-19"></a>
##### `cs`

- Description: TODO

<a id="member-20"></a>
##### `ct`

- Description: TODO

<a id="member-26"></a>
##### `spr`

- Description: TODO

<a id="member-27"></a>
##### `slot`

- Description: TODO

<a id="member-28"></a>
##### `used`

- Description: TODO

<a id="member-31"></a>
##### `tgtfx`

- Description: TODO

<a id="member-32"></a>
##### `curfx`

- Description: TODO

<a id="member-36"></a>
##### `ipf`

- Description: TODO

<a id="member-37"></a>
##### `ip`

- Description: TODO

<a id="member-38"></a>
##### `oip`

- Description: TODO

<a id="member-40"></a>
##### `cmc`

- Description: TODO

<a id="member-41"></a>
##### `usec1`

- Description: TODO

<a id="member-42"></a>
##### `usec2`

- Description: TODO

<a id="member-43"></a>
##### `lastact1`

- Description: TODO

<a id="member-44"></a>
##### `lastact2`

- Description: TODO

<a id="member-45"></a>
##### `lastacttip1`

- Description: TODO

<a id="member-46"></a>
##### `lastacttip2`

- Description: TODO

<a id="member-47"></a>
##### `curtgtfx`

- Description: TODO

<a id="member-49"></a>
##### `prevtt`

- Description: TODO

<a id="member-50"></a>
##### `acttip`

- Description: TODO

<a id="member-51"></a>
##### `keytips`

- Description: TODO

<a id="member-54"></a>
##### `kb_acts`

- Description: TODO

<a id="member-55"></a>
##### `kb_relcycle`

- Description: TODO

<a id="member-56"></a>
##### `n`

- Description: TODO

<a id="member-59"></a>
##### `holdgrab`

- Description: TODO

<a id="member-60"></a>
##### `held`

- Description: TODO

#### Methods

<a id="member-21"></a>
##### `Action(Indir<Resource> res)`

- Description: TODO

<a id="member-22"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-23"></a>
##### `added()`

- Description: TODO

<a id="member-24"></a>
##### `presize()`

- Description: TODO

<a id="member-25"></a>
##### `updatepos()`

- Description: TODO

<a id="member-29"></a>
##### `Effect(Sprite spr)`

- Description: TODO

<a id="member-30"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-33"></a>
##### `fxon(long gobid, Resource fx, Effect cur)`

- Description: TODO

<a id="member-34"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-35"></a>
##### `destroy()`

- Description: TODO

<a id="member-39"></a>
##### `actc(int i)`

- Description: TODO

<a id="member-48"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-52"></a>
##### `tooltip(Coord c, Widget prev)`

- Description: TODO

<a id="member-53"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-57"></a>
##### `Release(int n)`

- Description: TODO

<a id="member-58"></a>
##### `run()`

- Description: TODO

<a id="member-61"></a>
##### `globtype(GlobKeyEvent ev)`

- Description: TODO

<a id="member-62"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-63"></a>
##### `keyup(KeyUpEvent ev)`

- Description: TODO
