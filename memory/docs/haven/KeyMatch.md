# KeyMatch

## Meta

- Source: [KeyMatch.java](../../../src/haven/KeyMatch.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Matches key input against bindings.

## Code Members

### Member Index

#### Constants

- [S](#member-1)
- [C](#member-2)
- [M](#member-3)
- [SUPER](#member-4)
- [MODS](#member-5)

#### Fields

- [nil](#member-6)
- [chr](#member-7)
- [casematch](#member-8)
- [extmatch](#member-9)
- [code](#member-10)
- [keyname](#member-11)
- [modmask](#member-12)
- [modmatch](#member-13)
- [key](#member-29)
- [grab](#member-30)
- [mask](#member-39)
- [match](#member-40)
- [nmatch](#member-41)
- [grab](#member-42)

#### Methods

- [mods(KeyEvent ev)](#member-14)
- [match(KeyEvent ev, int modign)](#member-15)
- [match(KeyEvent ev)](#member-16)
- [match(Widget.KbdEvent ev)](#member-17)
- [name()](#member-18)
- [equals(KeyMatch that)](#member-19)
- [equals(Object o)](#member-20)
- [forchar(char chr, int modmask, int modmatch)](#member-21)
- [forchar(char chr, int mods)](#member-22)
- [forcode(int code, int modmask, int modmatch)](#member-23)
- [forcode(int code, int mods)](#member-24)
- [forevent(KeyEvent ev, int modmask)](#member-25)
- [reduce()](#member-26)
- [reduce(KeyMatch key)](#member-27)
- [restore(String desc)](#member-28)
- [namefor(KeyMatch key)](#member-31)
- [Capture(int w, KeyMatch key)](#member-32)
- [set(KeyMatch key)](#member-33)
- [click()](#member-34)
- [mkmatch(KeyEvent ev)](#member-35)
- [handle(KeyEvent ev)](#member-36)
- [keydown(KeyDownEvent ev)](#member-37)
- [modname(int mods)](#member-38)
- [ModCapture(int w, int mask, int match)](#member-43)
- [ModCapture(int w, int match)](#member-44)
- [set(int match)](#member-45)
- [click()](#member-46)
- [handle(KeyEvent ev)](#member-47)
- [keyup(KeyUpEvent ev)](#member-48)
- [keydown(KeyDownEvent ev)](#member-49)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `S`

- Description: TODO

<a id="member-2"></a>
##### `C`

- Description: TODO

<a id="member-3"></a>
##### `M`

- Description: TODO

<a id="member-4"></a>
##### `SUPER`

- Description: TODO

<a id="member-5"></a>
##### `MODS`

- Description: TODO

#### Fields

<a id="member-6"></a>
##### `nil`

- Description: TODO

<a id="member-7"></a>
##### `chr`

- Description: TODO

<a id="member-8"></a>
##### `casematch`

- Description: TODO

<a id="member-9"></a>
##### `extmatch`

- Description: TODO

<a id="member-10"></a>
##### `code`

- Description: TODO

<a id="member-11"></a>
##### `keyname`

- Description: TODO

<a id="member-12"></a>
##### `modmask`

- Description: TODO

<a id="member-13"></a>
##### `modmatch`

- Description: TODO

<a id="member-29"></a>
##### `key`

- Description: TODO

<a id="member-30"></a>
##### `grab`

- Description: TODO

<a id="member-39"></a>
##### `mask`

- Description: TODO

<a id="member-40"></a>
##### `match`

- Description: TODO

<a id="member-41"></a>
##### `nmatch`

- Description: TODO

<a id="member-42"></a>
##### `grab`

- Description: TODO

#### Methods

<a id="member-14"></a>
##### `mods(KeyEvent ev)`

- Description: TODO

<a id="member-15"></a>
##### `match(KeyEvent ev, int modign)`

- Description: TODO

<a id="member-16"></a>
##### `match(KeyEvent ev)`

- Description: TODO

<a id="member-17"></a>
##### `match(Widget.KbdEvent ev)`

- Description: TODO

<a id="member-18"></a>
##### `name()`

- Description: TODO

<a id="member-19"></a>
##### `equals(KeyMatch that)`

- Description: TODO

<a id="member-20"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-21"></a>
##### `forchar(char chr, int modmask, int modmatch)`

- Description: TODO

<a id="member-22"></a>
##### `forchar(char chr, int mods)`

- Description: TODO

<a id="member-23"></a>
##### `forcode(int code, int modmask, int modmatch)`

- Description: TODO

<a id="member-24"></a>
##### `forcode(int code, int mods)`

- Description: TODO

<a id="member-25"></a>
##### `forevent(KeyEvent ev, int modmask)`

- Description: TODO

<a id="member-26"></a>
##### `reduce()`

- Description: TODO

<a id="member-27"></a>
##### `reduce(KeyMatch key)`

- Description: TODO

<a id="member-28"></a>
##### `restore(String desc)`

- Description: TODO

<a id="member-31"></a>
##### `namefor(KeyMatch key)`

- Description: TODO

<a id="member-32"></a>
##### `Capture(int w, KeyMatch key)`

- Description: TODO

<a id="member-33"></a>
##### `set(KeyMatch key)`

- Description: TODO

<a id="member-34"></a>
##### `click()`

- Description: TODO

<a id="member-35"></a>
##### `mkmatch(KeyEvent ev)`

- Description: TODO

<a id="member-36"></a>
##### `handle(KeyEvent ev)`

- Description: TODO

<a id="member-37"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-38"></a>
##### `modname(int mods)`

- Description: TODO

<a id="member-43"></a>
##### `ModCapture(int w, int mask, int match)`

- Description: TODO

<a id="member-44"></a>
##### `ModCapture(int w, int match)`

- Description: TODO

<a id="member-45"></a>
##### `set(int match)`

- Description: TODO

<a id="member-46"></a>
##### `click()`

- Description: TODO

<a id="member-47"></a>
##### `handle(KeyEvent ev)`

- Description: TODO

<a id="member-48"></a>
##### `keyup(KeyUpEvent ev)`

- Description: TODO

<a id="member-49"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO
