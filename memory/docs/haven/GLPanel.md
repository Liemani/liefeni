# GLPanel

## Meta

- Source: [GLPanel.java](../../../src/haven/GLPanel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Hosts the OpenGL-backed UI panel.

## Code Members

### Member Index

#### Fields

- [gldebug](#member-5)
- [p](#member-6)
- [uprof](#member-7)
- [rprof](#member-8)
- [gprof](#member-9)
- [bgmode](#member-10)
- [fps](#member-11)
- [framelag](#member-12)
- [frameno](#member-13)
- [uidle](#member-14)
- [ridle](#member-15)
- [lastrcycle](#member-16)
- [ridletime](#member-17)
- [lockedui](#member-18)
- [ui](#member-19)
- [ed](#member-20)
- [uilock](#member-21)
- [ttime](#member-24)
- [prof](#member-29)
- [prev](#member-30)
- [frame](#member-31)
- [curp](#member-32)
- [prof](#member-35)
- [label](#member-36)
- [prevtooltip](#member-39)
- [prevtooltex](#member-40)
- [freetooltex](#member-41)
- [cursmode](#member-44)
- [lastcursor](#member-45)
- [curshotspot](#member-46)
- [prevfree](#member-48)
- [framealloc](#member-49)
- [streamout](#member-51)
- [cmdmap](#member-55)

#### Methods

- [public GLEnvironment env();](#member-1)
- [public Area shape();](#member-2)
- [public Pipe basestate();](#member-3)
- [public void glswap(GL gl);](#member-4)
- [Loop(GLPanel p)](#member-22)
- [framedur()](#member-23)
- [BufferSwap(double ttime)](#member-25)
- [run(GL gl)](#member-26)
- [run(GL gl)](#member-27)
- [run(GL gl)](#member-28)
- [ProfileCycle(CPUProfile prof, ProfileCycle prev, GLRender out)](#member-33)
- [run(GL gl)](#member-34)
- [ProfilePart(ProfileCycle prof, String label)](#member-37)
- [run(GL gl)](#member-38)
- [drawtooltip(UI ui, GOut g)](#member-42)
- [defaultcurs()](#member-43)
- [drawcursor(UI ui, GOut g)](#member-47)
- [drawstats(UI ui, GOut g, GLRender buf)](#member-50)
- [display(UI ui, GLRender buf)](#member-52)
- [public void run() throws InterruptedException](#member-53)
- [newui(UI.Runner fun)](#member-54)
- [findcmds()](#member-56)

### Member Reference

#### Fields

<a id="member-5"></a>
##### `gldebug`

- Description: TODO

<a id="member-6"></a>
##### `p`

- Description: TODO

<a id="member-7"></a>
##### `uprof`

- Description: TODO

<a id="member-8"></a>
##### `rprof`

- Description: TODO

<a id="member-9"></a>
##### `gprof`

- Description: TODO

<a id="member-10"></a>
##### `bgmode`

- Description: TODO

<a id="member-11"></a>
##### `fps`

- Description: TODO

<a id="member-12"></a>
##### `framelag`

- Description: TODO

<a id="member-13"></a>
##### `frameno`

- Description: TODO

<a id="member-14"></a>
##### `uidle`

- Description: TODO

<a id="member-15"></a>
##### `ridle`

- Description: TODO

<a id="member-16"></a>
##### `lastrcycle`

- Description: TODO

<a id="member-17"></a>
##### `ridletime`

- Description: TODO

<a id="member-18"></a>
##### `lockedui`

- Description: TODO

<a id="member-19"></a>
##### `ui`

- Description: TODO

<a id="member-20"></a>
##### `ed`

- Description: TODO

<a id="member-21"></a>
##### `uilock`

- Description: TODO

<a id="member-24"></a>
##### `ttime`

- Description: TODO

<a id="member-29"></a>
##### `prof`

- Description: TODO

<a id="member-30"></a>
##### `prev`

- Description: TODO

<a id="member-31"></a>
##### `frame`

- Description: TODO

<a id="member-32"></a>
##### `curp`

- Description: TODO

<a id="member-35"></a>
##### `prof`

- Description: TODO

<a id="member-36"></a>
##### `label`

- Description: TODO

<a id="member-39"></a>
##### `prevtooltip`

- Description: TODO

<a id="member-40"></a>
##### `prevtooltex`

- Description: TODO

<a id="member-41"></a>
##### `freetooltex`

- Description: TODO

<a id="member-44"></a>
##### `cursmode`

- Description: TODO

<a id="member-45"></a>
##### `lastcursor`

- Description: TODO

<a id="member-46"></a>
##### `curshotspot`

- Description: TODO

<a id="member-48"></a>
##### `prevfree`

- Description: TODO

<a id="member-49"></a>
##### `framealloc`

- Description: TODO

<a id="member-51"></a>
##### `streamout`

- Description: TODO

<a id="member-55"></a>
##### `cmdmap`

- Description: TODO

#### Methods

<a id="member-1"></a>
##### `public GLEnvironment env();`

- Description: TODO

<a id="member-2"></a>
##### `public Area shape();`

- Description: TODO

<a id="member-3"></a>
##### `public Pipe basestate();`

- Description: TODO

<a id="member-4"></a>
##### `public void glswap(GL gl);`

- Description: TODO

<a id="member-22"></a>
##### `Loop(GLPanel p)`

- Description: TODO

<a id="member-23"></a>
##### `framedur()`

- Description: TODO

<a id="member-25"></a>
##### `BufferSwap(double ttime)`

- Description: TODO

<a id="member-26"></a>
##### `run(GL gl)`

- Description: TODO

<a id="member-27"></a>
##### `run(GL gl)`

- Description: TODO

<a id="member-28"></a>
##### `run(GL gl)`

- Description: TODO

<a id="member-33"></a>
##### `ProfileCycle(CPUProfile prof, ProfileCycle prev, GLRender out)`

- Description: TODO

<a id="member-34"></a>
##### `run(GL gl)`

- Description: TODO

<a id="member-37"></a>
##### `ProfilePart(ProfileCycle prof, String label)`

- Description: TODO

<a id="member-38"></a>
##### `run(GL gl)`

- Description: TODO

<a id="member-42"></a>
##### `drawtooltip(UI ui, GOut g)`

- Description: TODO

<a id="member-43"></a>
##### `defaultcurs()`

- Description: TODO

<a id="member-47"></a>
##### `drawcursor(UI ui, GOut g)`

- Description: TODO

<a id="member-50"></a>
##### `drawstats(UI ui, GOut g, GLRender buf)`

- Description: TODO

<a id="member-52"></a>
##### `display(UI ui, GLRender buf)`

- Description: TODO

<a id="member-53"></a>
##### `public void run() throws InterruptedException`

- Description: TODO

<a id="member-54"></a>
##### `newui(UI.Runner fun)`

- Description: TODO

<a id="member-56"></a>
##### `findcmds()`

- Description: TODO
