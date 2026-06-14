# ReadLine

## Meta

- Source: [ReadLine.java](../../../src/haven/ReadLine.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Supports line-by-line reading.

## Code Members

### Member Index

#### Fields

- [nil](#member-18)
- [owner](#member-19)
- [buf](#member-20)
- [length](#member-21)
- [point](#member-22)
- [seq](#member-23)
- [mtime](#member-24)
- [tcache](#member-41)
- [mark](#member-43)
- [mark](#member-53)
- [yankpos](#member-54)
- [undopos](#member-55)
- [tmm](#member-56)
- [last](#member-57)
- [yanklist](#member-58)
- [undolist](#member-59)
- [line](#member-61)
- [point](#member-62)
- [lastsel](#member-66)
- [lastclip](#member-67)

#### Methods

- [public char[] buffer();](#member-1)
- [public int length();](#member-2)
- [public int point();](#member-3)
- [public void point(int p);](#member-4)
- [public int mark();](#member-5)
- [public void mark(int m);](#member-6)
- [public void setline(String line);](#member-7)
- [public boolean key(char c, KeyEvent ev, int mod);](#member-8)
- [public double mtime();](#member-9)
- [empty()](#member-10)
- [line()](#member-11)
- [render(Text.Foundry f)](#member-12)
- [select(int from, int to)](#member-13)
- [lneq(String ln)](#member-14)
- [key(KeyEvent ev)](#member-15)
- [changed(ReadLine buf)](#member-16)
- [done(ReadLine buf)](#member-17)
- [Base(Owner owner, String init)](#member-25)
- [line(int off, int len)](#member-26)
- [line(String ln)](#member-27)
- [remove(int off, int len)](#member-28)
- [ensure(int off, int len)](#member-29)
- [wordchar(char c)](#member-30)
- [wordstart(int from)](#member-31)
- [wordend(int from)](#member-32)
- [protected abstract boolean key2(char c, KeyEvent ev, int mod);](#member-33)
- [key(char c, KeyEvent ev, int mod)](#member-34)
- [buffer()](#member-35)
- [length()](#member-36)
- [point()](#member-37)
- [point(int p)](#member-38)
- [mtime()](#member-39)
- [setline(String line)](#member-40)
- [render(Text.Foundry f)](#member-42)
- [PCLine(Owner owner, String init)](#member-44)
- [clipset(Clipboard c)](#member-45)
- [cliptext()](#member-46)
- [mark()](#member-47)
- [mark(int mark)](#member-48)
- [setline(String line)](#member-49)
- [rmsel()](#member-50)
- [cksel()](#member-51)
- [key2(char c, KeyEvent ev, int mod)](#member-52)
- [EmacsLine(Owner owner, String init)](#member-60)
- [UndoState()](#member-63)
- [save()](#member-64)
- [mode(String mode)](#member-65)
- [killclipboard()](#member-68)
- [kill(String text)](#member-69)
- [cliptext(Clipboard c)](#member-70)
- [mark()](#member-71)
- [mark(int m)](#member-72)
- [rmsel()](#member-73)
- [key2(char c, KeyEvent ev, int mod)](#member-74)
- [make(Owner owner, String init)](#member-75)

### Member Reference

#### Fields

<a id="member-18"></a>
##### `nil`

- Description: TODO

<a id="member-19"></a>
##### `owner`

- Description: TODO

<a id="member-20"></a>
##### `buf`

- Description: TODO

<a id="member-21"></a>
##### `length`

- Description: TODO

<a id="member-22"></a>
##### `point`

- Description: TODO

<a id="member-23"></a>
##### `seq`

- Description: TODO

<a id="member-24"></a>
##### `mtime`

- Description: TODO

<a id="member-41"></a>
##### `tcache`

- Description: TODO

<a id="member-43"></a>
##### `mark`

- Description: TODO

<a id="member-53"></a>
##### `mark`

- Description: TODO

<a id="member-54"></a>
##### `yankpos`

- Description: TODO

<a id="member-55"></a>
##### `undopos`

- Description: TODO

<a id="member-56"></a>
##### `tmm`

- Description: TODO

<a id="member-57"></a>
##### `last`

- Description: TODO

<a id="member-58"></a>
##### `yanklist`

- Description: TODO

<a id="member-59"></a>
##### `undolist`

- Description: TODO

<a id="member-61"></a>
##### `line`

- Description: TODO

<a id="member-62"></a>
##### `point`

- Description: TODO

<a id="member-66"></a>
##### `lastsel`

- Description: TODO

<a id="member-67"></a>
##### `lastclip`

- Description: TODO

#### Methods

<a id="member-1"></a>
##### `public char[] buffer();`

- Description: TODO

<a id="member-2"></a>
##### `public int length();`

- Description: TODO

<a id="member-3"></a>
##### `public int point();`

- Description: TODO

<a id="member-4"></a>
##### `public void point(int p);`

- Description: TODO

<a id="member-5"></a>
##### `public int mark();`

- Description: TODO

<a id="member-6"></a>
##### `public void mark(int m);`

- Description: TODO

<a id="member-7"></a>
##### `public void setline(String line);`

- Description: TODO

<a id="member-8"></a>
##### `public boolean key(char c, KeyEvent ev, int mod);`

- Description: TODO

<a id="member-9"></a>
##### `public double mtime();`

- Description: TODO

<a id="member-10"></a>
##### `empty()`

- Description: TODO

<a id="member-11"></a>
##### `line()`

- Description: TODO

<a id="member-12"></a>
##### `render(Text.Foundry f)`

- Description: TODO

<a id="member-13"></a>
##### `select(int from, int to)`

- Description: TODO

<a id="member-14"></a>
##### `lneq(String ln)`

- Description: TODO

<a id="member-15"></a>
##### `key(KeyEvent ev)`

- Description: TODO

<a id="member-16"></a>
##### `changed(ReadLine buf)`

- Description: TODO

<a id="member-17"></a>
##### `done(ReadLine buf)`

- Description: TODO

<a id="member-25"></a>
##### `Base(Owner owner, String init)`

- Description: TODO

<a id="member-26"></a>
##### `line(int off, int len)`

- Description: TODO

<a id="member-27"></a>
##### `line(String ln)`

- Description: TODO

<a id="member-28"></a>
##### `remove(int off, int len)`

- Description: TODO

<a id="member-29"></a>
##### `ensure(int off, int len)`

- Description: TODO

<a id="member-30"></a>
##### `wordchar(char c)`

- Description: TODO

<a id="member-31"></a>
##### `wordstart(int from)`

- Description: TODO

<a id="member-32"></a>
##### `wordend(int from)`

- Description: TODO

<a id="member-33"></a>
##### `protected abstract boolean key2(char c, KeyEvent ev, int mod);`

- Description: TODO

<a id="member-34"></a>
##### `key(char c, KeyEvent ev, int mod)`

- Description: TODO

<a id="member-35"></a>
##### `buffer()`

- Description: TODO

<a id="member-36"></a>
##### `length()`

- Description: TODO

<a id="member-37"></a>
##### `point()`

- Description: TODO

<a id="member-38"></a>
##### `point(int p)`

- Description: TODO

<a id="member-39"></a>
##### `mtime()`

- Description: TODO

<a id="member-40"></a>
##### `setline(String line)`

- Description: TODO

<a id="member-42"></a>
##### `render(Text.Foundry f)`

- Description: TODO

<a id="member-44"></a>
##### `PCLine(Owner owner, String init)`

- Description: TODO

<a id="member-45"></a>
##### `clipset(Clipboard c)`

- Description: TODO

<a id="member-46"></a>
##### `cliptext()`

- Description: TODO

<a id="member-47"></a>
##### `mark()`

- Description: TODO

<a id="member-48"></a>
##### `mark(int mark)`

- Description: TODO

<a id="member-49"></a>
##### `setline(String line)`

- Description: TODO

<a id="member-50"></a>
##### `rmsel()`

- Description: TODO

<a id="member-51"></a>
##### `cksel()`

- Description: TODO

<a id="member-52"></a>
##### `key2(char c, KeyEvent ev, int mod)`

- Description: TODO

<a id="member-60"></a>
##### `EmacsLine(Owner owner, String init)`

- Description: TODO

<a id="member-63"></a>
##### `UndoState()`

- Description: TODO

<a id="member-64"></a>
##### `save()`

- Description: TODO

<a id="member-65"></a>
##### `mode(String mode)`

- Description: TODO

<a id="member-68"></a>
##### `killclipboard()`

- Description: TODO

<a id="member-69"></a>
##### `kill(String text)`

- Description: TODO

<a id="member-70"></a>
##### `cliptext(Clipboard c)`

- Description: TODO

<a id="member-71"></a>
##### `mark()`

- Description: TODO

<a id="member-72"></a>
##### `mark(int m)`

- Description: TODO

<a id="member-73"></a>
##### `rmsel()`

- Description: TODO

<a id="member-74"></a>
##### `key2(char c, KeyEvent ev, int mod)`

- Description: TODO

<a id="member-75"></a>
##### `make(Owner owner, String init)`

- Description: TODO
