# SkillWnd

## Meta

- Source: [SkillWnd.java](../../../src/haven/SkillWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the skills window.

## Code Members

### Member Index

#### Fields

- [skg](#member-1)
- [credos](#member-2)
- [exps](#member-3)
- [chr](#member-4)
- [skill](#member-5)
- [credo](#member-6)
- [expls](#member-7)
- [nm](#member-11)
- [res](#member-12)
- [cost](#member-13)
- [has](#member-14)
- [sortkey](#member-15)
- [small](#member-16)
- [tooltip](#member-19)
- [nm](#member-21)
- [res](#member-22)
- [has](#member-23)
- [sortkey](#member-24)
- [small](#member-25)
- [tooltip](#member-28)
- [res](#member-30)
- [mtime](#member-31)
- [score](#member-32)
- [sortkey](#member-33)
- [small](#member-34)
- [tooltip](#member-37)
- [nsk](#member-39)
- [csk](#member-40)
- [loading](#member-41)
- [crsz](#member-47)
- [btnw](#member-48)
- [credoufr](#member-49)
- [credosfr](#member-50)
- [prsf](#member-51)
- [m](#member-52)
- [ncr](#member-53)
- [ccr](#member-54)
- [pcr](#member-55)
- [pcl](#member-56)
- [pclt](#member-57)
- [pcql](#member-58)
- [pcqlt](#member-59)
- [pqid](#member-60)
- [cost](#member-61)
- [sel](#member-62)
- [pcrc](#member-63)
- [ncrc](#member-64)
- [ccrc](#member-65)
- [pbtn](#member-66)
- [qbtn](#member-67)
- [loading](#member-68)
- [cr](#member-71)
- [seen](#member-84)
- [loading](#member-85)

#### Methods

- [create(UI ui, Object[] args)](#member-8)
- [create(UI ui, Object[] args)](#member-9)
- [create(UI ui, Object[] args)](#member-10)
- [Skill(String nm, Indir<Resource> res, int cost, boolean has)](#member-17)
- [rendertext()](#member-18)
- [tooltip()](#member-20)
- [Credo(String nm, Indir<Resource> res, boolean has)](#member-26)
- [rendertext()](#member-27)
- [tooltip()](#member-29)
- [Experience(Indir<Resource> res, int mtime, int score)](#member-35)
- [rendertext()](#member-36)
- [tooltip()](#member-38)
- [SkillGrid(Coord sz)](#member-42)
- [drawitem(GOut g, Skill sk)](#member-43)
- [update()](#member-44)
- [sksort(List<Skill> skills)](#member-45)
- [tick(double dt)](#member-46)
- [CredoGrid(Coord sz)](#member-69)
- [crtex(Credo cr)](#member-70)
- [CredoImg(Credo cr)](#member-72)
- [draw(GOut g)](#member-73)
- [mousedown(MouseDownEvent ev)](#member-74)
- [crgrid(int y, Collection<Credo> crs)](#member-75)
- [sort(List<Credo> buf)](#member-76)
- [update()](#member-77)
- [tick(double dt)](#member-78)
- [change(Credo cr)](#member-79)
- [pcr(Credo cr, int crl, int crlt, int crql, int crqlt, int qid)](#member-80)
- [ncr(List<Credo> cr)](#member-81)
- [ccr(List<Credo> cr)](#member-82)
- [mousedown(MouseDownEvent ev)](#member-83)
- [ExpGrid(Coord sz)](#member-86)
- [drawitem(GOut g, Experience exp)](#member-87)
- [update()](#member-88)
- [tick(double dt)](#member-89)
- [attached()](#member-90)
- [decsklist(Object[] args, int a, boolean has)](#member-91)
- [deccrlist(Object[] args, int a, boolean has)](#member-92)
- [decexplist(Object[] args, int a)](#member-93)
- [addchild(Widget child, Object... args)](#member-94)
- [uimsg(String nm, Object... args)](#member-95)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `skg`

- Description: TODO

<a id="member-2"></a>
##### `credos`

- Description: TODO

<a id="member-3"></a>
##### `exps`

- Description: TODO

<a id="member-4"></a>
##### `chr`

- Description: TODO

<a id="member-5"></a>
##### `skill`

- Description: TODO

<a id="member-6"></a>
##### `credo`

- Description: TODO

<a id="member-7"></a>
##### `expls`

- Description: TODO

<a id="member-11"></a>
##### `nm`

- Description: TODO

<a id="member-12"></a>
##### `res`

- Description: TODO

<a id="member-13"></a>
##### `cost`

- Description: TODO

<a id="member-14"></a>
##### `has`

- Description: TODO

<a id="member-15"></a>
##### `sortkey`

- Description: TODO

<a id="member-16"></a>
##### `small`

- Description: TODO

<a id="member-19"></a>
##### `tooltip`

- Description: TODO

<a id="member-21"></a>
##### `nm`

- Description: TODO

<a id="member-22"></a>
##### `res`

- Description: TODO

<a id="member-23"></a>
##### `has`

- Description: TODO

<a id="member-24"></a>
##### `sortkey`

- Description: TODO

<a id="member-25"></a>
##### `small`

- Description: TODO

<a id="member-28"></a>
##### `tooltip`

- Description: TODO

<a id="member-30"></a>
##### `res`

- Description: TODO

<a id="member-31"></a>
##### `mtime`

- Description: TODO

<a id="member-32"></a>
##### `score`

- Description: TODO

<a id="member-33"></a>
##### `sortkey`

- Description: TODO

<a id="member-34"></a>
##### `small`

- Description: TODO

<a id="member-37"></a>
##### `tooltip`

- Description: TODO

<a id="member-39"></a>
##### `nsk`

- Description: TODO

<a id="member-40"></a>
##### `csk`

- Description: TODO

<a id="member-41"></a>
##### `loading`

- Description: TODO

<a id="member-47"></a>
##### `crsz`

- Description: TODO

<a id="member-48"></a>
##### `btnw`

- Description: TODO

<a id="member-49"></a>
##### `credoufr`

- Description: TODO

<a id="member-50"></a>
##### `credosfr`

- Description: TODO

<a id="member-51"></a>
##### `prsf`

- Description: TODO

<a id="member-52"></a>
##### `m`

- Description: TODO

<a id="member-53"></a>
##### `ncr`

- Description: TODO

<a id="member-54"></a>
##### `ccr`

- Description: TODO

<a id="member-55"></a>
##### `pcr`

- Description: TODO

<a id="member-56"></a>
##### `pcl`

- Description: TODO

<a id="member-57"></a>
##### `pclt`

- Description: TODO

<a id="member-58"></a>
##### `pcql`

- Description: TODO

<a id="member-59"></a>
##### `pcqlt`

- Description: TODO

<a id="member-60"></a>
##### `pqid`

- Description: TODO

<a id="member-61"></a>
##### `cost`

- Description: TODO

<a id="member-62"></a>
##### `sel`

- Description: TODO

<a id="member-63"></a>
##### `pcrc`

- Description: TODO

<a id="member-64"></a>
##### `ncrc`

- Description: TODO

<a id="member-65"></a>
##### `ccrc`

- Description: TODO

<a id="member-66"></a>
##### `pbtn`

- Description: TODO

<a id="member-67"></a>
##### `qbtn`

- Description: TODO

<a id="member-68"></a>
##### `loading`

- Description: TODO

<a id="member-71"></a>
##### `cr`

- Description: TODO

<a id="member-84"></a>
##### `seen`

- Description: TODO

<a id="member-85"></a>
##### `loading`

- Description: TODO

#### Methods

<a id="member-8"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-9"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-10"></a>
##### `create(UI ui, Object[] args)`

- Description: TODO

<a id="member-17"></a>
##### `Skill(String nm, Indir<Resource> res, int cost, boolean has)`

- Description: TODO

<a id="member-18"></a>
##### `rendertext()`

- Description: TODO

<a id="member-20"></a>
##### `tooltip()`

- Description: TODO

<a id="member-26"></a>
##### `Credo(String nm, Indir<Resource> res, boolean has)`

- Description: TODO

<a id="member-27"></a>
##### `rendertext()`

- Description: TODO

<a id="member-29"></a>
##### `tooltip()`

- Description: TODO

<a id="member-35"></a>
##### `Experience(Indir<Resource> res, int mtime, int score)`

- Description: TODO

<a id="member-36"></a>
##### `rendertext()`

- Description: TODO

<a id="member-38"></a>
##### `tooltip()`

- Description: TODO

<a id="member-42"></a>
##### `SkillGrid(Coord sz)`

- Description: TODO

<a id="member-43"></a>
##### `drawitem(GOut g, Skill sk)`

- Description: TODO

<a id="member-44"></a>
##### `update()`

- Description: TODO

<a id="member-45"></a>
##### `sksort(List<Skill> skills)`

- Description: TODO

<a id="member-46"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-69"></a>
##### `CredoGrid(Coord sz)`

- Description: TODO

<a id="member-70"></a>
##### `crtex(Credo cr)`

- Description: TODO

<a id="member-72"></a>
##### `CredoImg(Credo cr)`

- Description: TODO

<a id="member-73"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-74"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-75"></a>
##### `crgrid(int y, Collection<Credo> crs)`

- Description: TODO

<a id="member-76"></a>
##### `sort(List<Credo> buf)`

- Description: TODO

<a id="member-77"></a>
##### `update()`

- Description: TODO

<a id="member-78"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-79"></a>
##### `change(Credo cr)`

- Description: TODO

<a id="member-80"></a>
##### `pcr(Credo cr, int crl, int crlt, int crql, int crqlt, int qid)`

- Description: TODO

<a id="member-81"></a>
##### `ncr(List<Credo> cr)`

- Description: TODO

<a id="member-82"></a>
##### `ccr(List<Credo> cr)`

- Description: TODO

<a id="member-83"></a>
##### `mousedown(MouseDownEvent ev)`

- Description: TODO

<a id="member-86"></a>
##### `ExpGrid(Coord sz)`

- Description: TODO

<a id="member-87"></a>
##### `drawitem(GOut g, Experience exp)`

- Description: TODO

<a id="member-88"></a>
##### `update()`

- Description: TODO

<a id="member-89"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-90"></a>
##### `attached()`

- Description: TODO

<a id="member-91"></a>
##### `decsklist(Object[] args, int a, boolean has)`

- Description: TODO

<a id="member-92"></a>
##### `deccrlist(Object[] args, int a, boolean has)`

- Description: TODO

<a id="member-93"></a>
##### `decexplist(Object[] args, int a)`

- Description: TODO

<a id="member-94"></a>
##### `addchild(Widget child, Object... args)`

- Description: TODO

<a id="member-95"></a>
##### `uimsg(String nm, Object... args)`

- Description: TODO
