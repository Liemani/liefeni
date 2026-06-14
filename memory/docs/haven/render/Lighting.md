# Lighting

## Meta

- Source: [Lighting.java](../../../../src/haven/render/Lighting.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents lighting state.

## Code Members

### Member Index

#### Fields

- [lights](#member-1)
- [s_light](#member-2)
- [idx](#member-4)
- [lpar](#member-5)
- [unroll](#member-8)
- [defmax](#member-9)
- [list](#member-10)
- [maxlights](#member-11)
- [maxlights](#member-13)
- [interned](#member-19)
- [shader](#member-21)
- [visnlights](#member-24)
- [stats](#member-25)
- [defmax](#member-26)
- [w](#member-27)
- [h](#member-28)
- [d](#member-29)
- [wb](#member-30)
- [hb](#member-31)
- [db](#member-32)
- [maxlights](#member-33)
- [lswb](#member-34)
- [last](#member-35)
- [sahash](#member-37)
- [clipcorn](#member-38)
- [bbox](#member-39)
- [gsz](#member-40)
- [szf](#member-41)
- [global](#member-42)
- [grid](#member-43)
- [listbuf](#member-44)
- [lboff](#member-45)
- [lists](#member-46)
- [table](#member-47)
- [nlists](#member-48)
- [maxlist](#member-49)
- [u_bboxm](#member-62)
- [u_bboxk](#member-63)
- [u_lstex](#member-64)
- [u_ldtex](#member-65)
- [w](#member-66)
- [h](#member-67)
- [d](#member-68)
- [wb](#member-69)
- [hb](#member-70)
- [db](#member-71)
- [lswb](#member-72)
- [maxlights](#member-73)
- [interned](#member-79)
- [shader](#member-81)
- [ldtex](#member-83)
- [lstex](#member-84)
- [bbox](#member-85)

#### Methods

- [public abstract void construct(Block blk, java.util.function.Function<Params, Statement> body);](#member-3)
- [Params(Expression idx, Expression lpar)](#member-6)
- [modify(ProgramContext prog)](#member-7)
- [SimpleLights(Object[][] lights)](#member-12)
- [Shader(int maxlights)](#member-14)
- [modify(ProgramContext prog)](#member-15)
- [hashCode()](#member-16)
- [equals(Shader o)](#member-17)
- [equals(Object o)](#member-18)
- [get(int maxlights)](#member-20)
- [shader()](#member-22)
- [apply(Pipe p)](#member-23)
- [LightGrid(int w, int h, int d)](#member-36)
- [Compiler(Projection proj)](#member-50)
- [us(short v)](#member-51)
- [rehash(int nlen)](#member-52)
- [ckrehash()](#member-53)
- [addlist(short[] plist, short add)](#member-54)
- [getlist(short[] plist, short add)](#member-55)
- [addpoint(int idx, Object[] light, float[] pos)](#member-56)
- [addglobal(int idx, Object[] light)](#member-57)
- [addlight(int idx, Object[] light)](#member-58)
- [compact()](#member-59)
- [dump()](#member-60)
- [compile(Object[][] lights, Projection proj)](#member-61)
- [Shader(LightGrid pars)](#member-74)
- [modify(ProgramContext prog)](#member-75)
- [hashCode()](#member-76)
- [equals(Shader o)](#member-77)
- [equals(Object o)](#member-78)
- [get(LightGrid pars)](#member-80)
- [shader()](#member-82)
- [GridLights(Object[][] lights, Volume3f bbox, short[] grid, short[] lists, int listlen)](#member-86)
- [listtex(short[] grid, short[] lists, int listlen)](#member-87)
- [lighttex(Object[][] lights)](#member-88)
- [shader()](#member-89)
- [apply(Pipe p)](#member-90)
- [bboxm()](#member-91)
- [bboxk()](#member-92)
- [dispose()](#member-93)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `lights`

- Description: TODO

<a id="member-2"></a>
##### `s_light`

- Description: TODO

<a id="member-4"></a>
##### `idx`

- Description: TODO

<a id="member-5"></a>
##### `lpar`

- Description: TODO

<a id="member-8"></a>
##### `unroll`

- Description: TODO

<a id="member-9"></a>
##### `defmax`

- Description: TODO

<a id="member-10"></a>
##### `list`

- Description: TODO

<a id="member-11"></a>
##### `maxlights`

- Description: TODO

<a id="member-13"></a>
##### `maxlights`

- Description: TODO

<a id="member-19"></a>
##### `interned`

- Description: TODO

<a id="member-21"></a>
##### `shader`

- Description: TODO

<a id="member-24"></a>
##### `visnlights`

- Description: TODO

<a id="member-25"></a>
##### `stats`

- Description: TODO

<a id="member-26"></a>
##### `defmax`

- Description: TODO

<a id="member-27"></a>
##### `w`

- Description: TODO

<a id="member-28"></a>
##### `h`

- Description: TODO

<a id="member-29"></a>
##### `d`

- Description: TODO

<a id="member-30"></a>
##### `wb`

- Description: TODO

<a id="member-31"></a>
##### `hb`

- Description: TODO

<a id="member-32"></a>
##### `db`

- Description: TODO

<a id="member-33"></a>
##### `maxlights`

- Description: TODO

<a id="member-34"></a>
##### `lswb`

- Description: TODO

<a id="member-35"></a>
##### `last`

- Description: TODO

<a id="member-37"></a>
##### `sahash`

- Description: TODO

<a id="member-38"></a>
##### `clipcorn`

- Description: TODO

<a id="member-39"></a>
##### `bbox`

- Description: TODO

<a id="member-40"></a>
##### `gsz`

- Description: TODO

<a id="member-41"></a>
##### `szf`

- Description: TODO

<a id="member-42"></a>
##### `global`

- Description: TODO

<a id="member-43"></a>
##### `grid`

- Description: TODO

<a id="member-44"></a>
##### `listbuf`

- Description: TODO

<a id="member-45"></a>
##### `lboff`

- Description: TODO

<a id="member-46"></a>
##### `lists`

- Description: TODO

<a id="member-47"></a>
##### `table`

- Description: TODO

<a id="member-48"></a>
##### `nlists`

- Description: TODO

<a id="member-49"></a>
##### `maxlist`

- Description: TODO

<a id="member-62"></a>
##### `u_bboxm`

- Description: TODO

<a id="member-63"></a>
##### `u_bboxk`

- Description: TODO

<a id="member-64"></a>
##### `u_lstex`

- Description: TODO

<a id="member-65"></a>
##### `u_ldtex`

- Description: TODO

<a id="member-66"></a>
##### `w`

- Description: TODO

<a id="member-67"></a>
##### `h`

- Description: TODO

<a id="member-68"></a>
##### `d`

- Description: TODO

<a id="member-69"></a>
##### `wb`

- Description: TODO

<a id="member-70"></a>
##### `hb`

- Description: TODO

<a id="member-71"></a>
##### `db`

- Description: TODO

<a id="member-72"></a>
##### `lswb`

- Description: TODO

<a id="member-73"></a>
##### `maxlights`

- Description: TODO

<a id="member-79"></a>
##### `interned`

- Description: TODO

<a id="member-81"></a>
##### `shader`

- Description: TODO

<a id="member-83"></a>
##### `ldtex`

- Description: TODO

<a id="member-84"></a>
##### `lstex`

- Description: TODO

<a id="member-85"></a>
##### `bbox`

- Description: TODO

#### Methods

<a id="member-3"></a>
##### `public abstract void construct(Block blk, java.util.function.Function<Params, Statement> body);`

- Description: TODO

<a id="member-6"></a>
##### `Params(Expression idx, Expression lpar)`

- Description: TODO

<a id="member-7"></a>
##### `modify(ProgramContext prog)`

- Description: TODO

<a id="member-12"></a>
##### `SimpleLights(Object[][] lights)`

- Description: TODO

<a id="member-14"></a>
##### `Shader(int maxlights)`

- Description: TODO

<a id="member-15"></a>
##### `modify(ProgramContext prog)`

- Description: TODO

<a id="member-16"></a>
##### `hashCode()`

- Description: TODO

<a id="member-17"></a>
##### `equals(Shader o)`

- Description: TODO

<a id="member-18"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-20"></a>
##### `get(int maxlights)`

- Description: TODO

<a id="member-22"></a>
##### `shader()`

- Description: TODO

<a id="member-23"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-36"></a>
##### `LightGrid(int w, int h, int d)`

- Description: TODO

<a id="member-50"></a>
##### `Compiler(Projection proj)`

- Description: TODO

<a id="member-51"></a>
##### `us(short v)`

- Description: TODO

<a id="member-52"></a>
##### `rehash(int nlen)`

- Description: TODO

<a id="member-53"></a>
##### `ckrehash()`

- Description: TODO

<a id="member-54"></a>
##### `addlist(short[] plist, short add)`

- Description: TODO

<a id="member-55"></a>
##### `getlist(short[] plist, short add)`

- Description: TODO

<a id="member-56"></a>
##### `addpoint(int idx, Object[] light, float[] pos)`

- Description: TODO

<a id="member-57"></a>
##### `addglobal(int idx, Object[] light)`

- Description: TODO

<a id="member-58"></a>
##### `addlight(int idx, Object[] light)`

- Description: TODO

<a id="member-59"></a>
##### `compact()`

- Description: TODO

<a id="member-60"></a>
##### `dump()`

- Description: TODO

<a id="member-61"></a>
##### `compile(Object[][] lights, Projection proj)`

- Description: TODO

<a id="member-74"></a>
##### `Shader(LightGrid pars)`

- Description: TODO

<a id="member-75"></a>
##### `modify(ProgramContext prog)`

- Description: TODO

<a id="member-76"></a>
##### `hashCode()`

- Description: TODO

<a id="member-77"></a>
##### `equals(Shader o)`

- Description: TODO

<a id="member-78"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-80"></a>
##### `get(LightGrid pars)`

- Description: TODO

<a id="member-82"></a>
##### `shader()`

- Description: TODO

<a id="member-86"></a>
##### `GridLights(Object[][] lights, Volume3f bbox, short[] grid, short[] lists, int listlen)`

- Description: TODO

<a id="member-87"></a>
##### `listtex(short[] grid, short[] lists, int listlen)`

- Description: TODO

<a id="member-88"></a>
##### `lighttex(Object[][] lights)`

- Description: TODO

<a id="member-89"></a>
##### `shader()`

- Description: TODO

<a id="member-90"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-91"></a>
##### `bboxm()`

- Description: TODO

<a id="member-92"></a>
##### `bboxk()`

- Description: TODO

<a id="member-93"></a>
##### `dispose()`

- Description: TODO
