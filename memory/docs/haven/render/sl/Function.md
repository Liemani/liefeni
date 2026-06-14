# Function

## Meta

- Source: [Function.java](../../../../../src/haven/render/sl/Function.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a shader function.

## Code Members

### Member Index

#### Fields

- [name](#member-1)
- [pars](#member-2)
- [params](#member-3)
- [type](#member-9)
- [code](#member-10)
- [fin](#member-11)
- [type](#member-24)
- [sin](#member-27)
- [cos](#member-28)
- [tan](#member-29)
- [asin](#member-30)
- [acos](#member-31)
- [atan](#member-32)
- [pow](#member-33)
- [exp](#member-34)
- [log](#member-35)
- [exp2](#member-36)
- [log2](#member-37)
- [sqrt](#member-38)
- [inversesqrt](#member-39)
- [abs](#member-40)
- [sign](#member-41)
- [floor](#member-42)
- [ceil](#member-43)
- [fract](#member-44)
- [mod](#member-45)
- [min](#member-46)
- [max](#member-47)
- [clamp](#member-48)
- [mix](#member-49)
- [step](#member-50)
- [smoothstep](#member-51)
- [length](#member-52)
- [distance](#member-53)
- [dot](#member-54)
- [cross](#member-55)
- [normalize](#member-56)
- [reflect](#member-57)
- [transpose](#member-58)
- [texture](#member-59)
- [texture2D](#member-60)
- [shadow2D](#member-61)
- [texture3D](#member-62)
- [textureCube](#member-63)
- [texelFetch](#member-64)
- [textureSize](#member-65)
- [dir](#member-66)

#### Methods

- [Call(Expression... params)](#member-4)
- [walk(Walker w)](#member-5)
- [output(Output out)](#member-6)
- [fun()](#member-7)
- [call(Expression... params)](#member-8)
- [Def(Type type, Symbol name)](#member-12)
- [Def(Type type, String prefix)](#member-13)
- [Def(Type type)](#member-14)
- [walk(Walker w)](#member-15)
- [output(Output out)](#member-16)
- [fun()](#member-17)
- [cons()](#member-18)
- [define(final Context ctx)](#member-19)
- [prototype(Output out)](#member-20)
- [type(Expression... params)](#member-21)
- [code(Statement stmt)](#member-22)
- [code(Expression expr)](#member-23)
- [Builtin(Type type, Symbol name, int nargs)](#member-25)
- [type(Expression... params)](#member-26)
- [Parameter(PDir dir, Type type, Symbol name)](#member-67)
- [param(PDir dir, Type type, Symbol name)](#member-68)
- [param(PDir dir, Type type, String prefix)](#member-69)
- [param(PDir dir, Type type)](#member-70)
- [param1(PDir dir, Type type)](#member-71)
- [ckparams(Expression... params)](#member-72)
- [public abstract Type type(Expression... params);](#member-73)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `name`

- Description: TODO

<a id="member-2"></a>
##### `pars`

- Description: TODO

<a id="member-3"></a>
##### `params`

- Description: TODO

<a id="member-9"></a>
##### `type`

- Description: TODO

<a id="member-10"></a>
##### `code`

- Description: TODO

<a id="member-11"></a>
##### `fin`

- Description: TODO

<a id="member-24"></a>
##### `type`

- Description: TODO

<a id="member-27"></a>
##### `sin`

- Description: TODO

<a id="member-28"></a>
##### `cos`

- Description: TODO

<a id="member-29"></a>
##### `tan`

- Description: TODO

<a id="member-30"></a>
##### `asin`

- Description: TODO

<a id="member-31"></a>
##### `acos`

- Description: TODO

<a id="member-32"></a>
##### `atan`

- Description: TODO

<a id="member-33"></a>
##### `pow`

- Description: TODO

<a id="member-34"></a>
##### `exp`

- Description: TODO

<a id="member-35"></a>
##### `log`

- Description: TODO

<a id="member-36"></a>
##### `exp2`

- Description: TODO

<a id="member-37"></a>
##### `log2`

- Description: TODO

<a id="member-38"></a>
##### `sqrt`

- Description: TODO

<a id="member-39"></a>
##### `inversesqrt`

- Description: TODO

<a id="member-40"></a>
##### `abs`

- Description: TODO

<a id="member-41"></a>
##### `sign`

- Description: TODO

<a id="member-42"></a>
##### `floor`

- Description: TODO

<a id="member-43"></a>
##### `ceil`

- Description: TODO

<a id="member-44"></a>
##### `fract`

- Description: TODO

<a id="member-45"></a>
##### `mod`

- Description: TODO

<a id="member-46"></a>
##### `min`

- Description: TODO

<a id="member-47"></a>
##### `max`

- Description: TODO

<a id="member-48"></a>
##### `clamp`

- Description: TODO

<a id="member-49"></a>
##### `mix`

- Description: TODO

<a id="member-50"></a>
##### `step`

- Description: TODO

<a id="member-51"></a>
##### `smoothstep`

- Description: TODO

<a id="member-52"></a>
##### `length`

- Description: TODO

<a id="member-53"></a>
##### `distance`

- Description: TODO

<a id="member-54"></a>
##### `dot`

- Description: TODO

<a id="member-55"></a>
##### `cross`

- Description: TODO

<a id="member-56"></a>
##### `normalize`

- Description: TODO

<a id="member-57"></a>
##### `reflect`

- Description: TODO

<a id="member-58"></a>
##### `transpose`

- Description: TODO

<a id="member-59"></a>
##### `texture`

- Description: TODO

<a id="member-60"></a>
##### `texture2D`

- Description: TODO

<a id="member-61"></a>
##### `shadow2D`

- Description: TODO

<a id="member-62"></a>
##### `texture3D`

- Description: TODO

<a id="member-63"></a>
##### `textureCube`

- Description: TODO

<a id="member-64"></a>
##### `texelFetch`

- Description: TODO

<a id="member-65"></a>
##### `textureSize`

- Description: TODO

<a id="member-66"></a>
##### `dir`

- Description: TODO

#### Methods

<a id="member-4"></a>
##### `Call(Expression... params)`

- Description: TODO

<a id="member-5"></a>
##### `walk(Walker w)`

- Description: TODO

<a id="member-6"></a>
##### `output(Output out)`

- Description: TODO

<a id="member-7"></a>
##### `fun()`

- Description: TODO

<a id="member-8"></a>
##### `call(Expression... params)`

- Description: TODO

<a id="member-12"></a>
##### `Def(Type type, Symbol name)`

- Description: TODO

<a id="member-13"></a>
##### `Def(Type type, String prefix)`

- Description: TODO

<a id="member-14"></a>
##### `Def(Type type)`

- Description: TODO

<a id="member-15"></a>
##### `walk(Walker w)`

- Description: TODO

<a id="member-16"></a>
##### `output(Output out)`

- Description: TODO

<a id="member-17"></a>
##### `fun()`

- Description: TODO

<a id="member-18"></a>
##### `cons()`

- Description: TODO

<a id="member-19"></a>
##### `define(final Context ctx)`

- Description: TODO

<a id="member-20"></a>
##### `prototype(Output out)`

- Description: TODO

<a id="member-21"></a>
##### `type(Expression... params)`

- Description: TODO

<a id="member-22"></a>
##### `code(Statement stmt)`

- Description: TODO

<a id="member-23"></a>
##### `code(Expression expr)`

- Description: TODO

<a id="member-25"></a>
##### `Builtin(Type type, Symbol name, int nargs)`

- Description: TODO

<a id="member-26"></a>
##### `type(Expression... params)`

- Description: TODO

<a id="member-67"></a>
##### `Parameter(PDir dir, Type type, Symbol name)`

- Description: TODO

<a id="member-68"></a>
##### `param(PDir dir, Type type, Symbol name)`

- Description: TODO

<a id="member-69"></a>
##### `param(PDir dir, Type type, String prefix)`

- Description: TODO

<a id="member-70"></a>
##### `param(PDir dir, Type type)`

- Description: TODO

<a id="member-71"></a>
##### `param1(PDir dir, Type type)`

- Description: TODO

<a id="member-72"></a>
##### `ckparams(Expression... params)`

- Description: TODO

<a id="member-73"></a>
##### `public abstract Type type(Expression... params);`

- Description: TODO
