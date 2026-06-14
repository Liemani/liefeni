# Cons

## Meta

- Source: [Cons.java](../../../../../src/haven/render/sl/Cons.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a shader constructor expression.

## Code Members

### Member Index

#### Fields

- [idm](#member-102)

#### Methods

- [stmt(Expression e)](#member-1)
- [ass(LValue l, Expression r)](#member-2)
- [ass(Variable l, Expression r)](#member-3)
- [add(Expression... terms)](#member-4)
- [mul(Expression... terms)](#member-5)
- [sub(Expression l, Expression r)](#member-6)
- [div(Expression l, Expression r)](#member-7)
- [aadd(LValue l, Expression r)](#member-8)
- [asub(LValue l, Expression r)](#member-9)
- [amul(LValue l, Expression r)](#member-10)
- [adiv(LValue l, Expression r)](#member-11)
- [inv(Expression op)](#member-12)
- [neg(Expression op)](#member-13)
- [incl(LValue op)](#member-14)
- [decl(LValue op)](#member-15)
- [linc(LValue op)](#member-16)
- [ldec(LValue op)](#member-17)
- [eq(Expression l, Expression r)](#member-18)
- [ne(Expression l, Expression r)](#member-19)
- [lt(Expression l, Expression r)](#member-20)
- [gt(Expression l, Expression r)](#member-21)
- [le(Expression l, Expression r)](#member-22)
- [ge(Expression l, Expression r)](#member-23)
- [or(Expression l, Expression r)](#member-24)
- [and(Expression l, Expression r)](#member-25)
- [bitor(Expression l, Expression r)](#member-26)
- [bitand(Expression l, Expression r)](#member-27)
- [lshift(Expression l, Expression r)](#member-28)
- [rshift(Expression l, Expression r)](#member-29)
- [pick(LValue val, String el)](#member-30)
- [pick(Expression val, String el)](#member-31)
- [fref(LValue val, String el)](#member-32)
- [fref(Expression val, String el)](#member-33)
- [idx(Expression val, Expression idx)](#member-34)
- [l(int val)](#member-35)
- [ul(int val)](#member-36)
- [l(double val)](#member-37)
- [vec4(Expression... els)](#member-38)
- [vec3(Expression... els)](#member-39)
- [vec2(Expression... els)](#member-40)
- [floatcons(Expression init)](#member-41)
- [ivec4(Expression... els)](#member-42)
- [ivec3(Expression... els)](#member-43)
- [ivec2(Expression... els)](#member-44)
- [intcons(Expression init)](#member-45)
- [uvec4(Expression... els)](#member-46)
- [uvec3(Expression... els)](#member-47)
- [uvec2(Expression... els)](#member-48)
- [uintcons(Expression init)](#member-49)
- [mat3(Expression... els)](#member-50)
- [sin(Expression x)](#member-51)
- [abs(Expression x)](#member-52)
- [sign(Expression x)](#member-53)
- [floor(Expression x)](#member-54)
- [ceil(Expression x)](#member-55)
- [fract(Expression x)](#member-56)
- [mod(Expression x, Expression y)](#member-57)
- [length(Expression x)](#member-58)
- [normalize(Expression x)](#member-59)
- [distance(Expression x, Expression y)](#member-60)
- [dot(Expression x, Expression y)](#member-61)
- [pow(Expression x, Expression y)](#member-62)
- [exp(Expression x)](#member-63)
- [log(Expression x)](#member-64)
- [exp2(Expression x)](#member-65)
- [log2(Expression x)](#member-66)
- [sqrt(Expression x)](#member-67)
- [inversesqrt(Expression x)](#member-68)
- [cross(Expression x, Expression y)](#member-69)
- [reflect(Expression x, Expression y)](#member-70)
- [texture2D(Expression s, Expression c)](#member-71)
- [shadow2D(Expression s, Expression c)](#member-72)
- [texture3D(Expression s, Expression c)](#member-73)
- [textureCube(Expression s, Expression c)](#member-74)
- [texelFetch(Expression s, Expression c, Expression l)](#member-75)
- [textureSize(Expression s, Expression lod)](#member-76)
- [mix(Expression x, Expression y, Expression a)](#member-77)
- [clamp(Expression x, Expression a, Expression b)](#member-78)
- [step(Expression edge, Expression x)](#member-79)
- [smoothstep(Expression a, Expression b, Expression x)](#member-80)
- [reduce(Function fun, Expression... es)](#member-81)
- [min(Expression... es)](#member-82)
- [max(Expression... es)](#member-83)
- [col4(java.awt.Color c)](#member-84)
- [col3(java.awt.Color c)](#member-85)
- [col4(haven.FColor c)](#member-86)
- [col3(haven.FColor c)](#member-87)
- [vec2(haven.Coord c)](#member-88)
- [vec3(haven.Coord3f c)](#member-89)
- [vec2(double a, double b)](#member-90)
- [vec3(double a, double b, double c)](#member-91)
- [vec4(double a, double b, double c, double d)](#member-92)
- [ivec2(haven.Coord c)](#member-93)
- [ivec2(int a, int b)](#member-94)
- [ivec3(int a, int b, int c)](#member-95)
- [ivec4(int a, int b, int c, int d)](#member-96)
- [uvec2(haven.Coord c)](#member-97)
- [uvec2(int a, int b)](#member-98)
- [uvec3(int a, int b, int c)](#member-99)
- [uvec4(int a, int b, int c, int d)](#member-100)
- [id(T a)](#member-101)

### Member Reference

#### Fields

<a id="member-102"></a>
##### `idm`

- Description: TODO

#### Methods

<a id="member-1"></a>
##### `stmt(Expression e)`

- Description: TODO

<a id="member-2"></a>
##### `ass(LValue l, Expression r)`

- Description: TODO

<a id="member-3"></a>
##### `ass(Variable l, Expression r)`

- Description: TODO

<a id="member-4"></a>
##### `add(Expression... terms)`

- Description: TODO

<a id="member-5"></a>
##### `mul(Expression... terms)`

- Description: TODO

<a id="member-6"></a>
##### `sub(Expression l, Expression r)`

- Description: TODO

<a id="member-7"></a>
##### `div(Expression l, Expression r)`

- Description: TODO

<a id="member-8"></a>
##### `aadd(LValue l, Expression r)`

- Description: TODO

<a id="member-9"></a>
##### `asub(LValue l, Expression r)`

- Description: TODO

<a id="member-10"></a>
##### `amul(LValue l, Expression r)`

- Description: TODO

<a id="member-11"></a>
##### `adiv(LValue l, Expression r)`

- Description: TODO

<a id="member-12"></a>
##### `inv(Expression op)`

- Description: TODO

<a id="member-13"></a>
##### `neg(Expression op)`

- Description: TODO

<a id="member-14"></a>
##### `incl(LValue op)`

- Description: TODO

<a id="member-15"></a>
##### `decl(LValue op)`

- Description: TODO

<a id="member-16"></a>
##### `linc(LValue op)`

- Description: TODO

<a id="member-17"></a>
##### `ldec(LValue op)`

- Description: TODO

<a id="member-18"></a>
##### `eq(Expression l, Expression r)`

- Description: TODO

<a id="member-19"></a>
##### `ne(Expression l, Expression r)`

- Description: TODO

<a id="member-20"></a>
##### `lt(Expression l, Expression r)`

- Description: TODO

<a id="member-21"></a>
##### `gt(Expression l, Expression r)`

- Description: TODO

<a id="member-22"></a>
##### `le(Expression l, Expression r)`

- Description: TODO

<a id="member-23"></a>
##### `ge(Expression l, Expression r)`

- Description: TODO

<a id="member-24"></a>
##### `or(Expression l, Expression r)`

- Description: TODO

<a id="member-25"></a>
##### `and(Expression l, Expression r)`

- Description: TODO

<a id="member-26"></a>
##### `bitor(Expression l, Expression r)`

- Description: TODO

<a id="member-27"></a>
##### `bitand(Expression l, Expression r)`

- Description: TODO

<a id="member-28"></a>
##### `lshift(Expression l, Expression r)`

- Description: TODO

<a id="member-29"></a>
##### `rshift(Expression l, Expression r)`

- Description: TODO

<a id="member-30"></a>
##### `pick(LValue val, String el)`

- Description: TODO

<a id="member-31"></a>
##### `pick(Expression val, String el)`

- Description: TODO

<a id="member-32"></a>
##### `fref(LValue val, String el)`

- Description: TODO

<a id="member-33"></a>
##### `fref(Expression val, String el)`

- Description: TODO

<a id="member-34"></a>
##### `idx(Expression val, Expression idx)`

- Description: TODO

<a id="member-35"></a>
##### `l(int val)`

- Description: TODO

<a id="member-36"></a>
##### `ul(int val)`

- Description: TODO

<a id="member-37"></a>
##### `l(double val)`

- Description: TODO

<a id="member-38"></a>
##### `vec4(Expression... els)`

- Description: TODO

<a id="member-39"></a>
##### `vec3(Expression... els)`

- Description: TODO

<a id="member-40"></a>
##### `vec2(Expression... els)`

- Description: TODO

<a id="member-41"></a>
##### `floatcons(Expression init)`

- Description: TODO

<a id="member-42"></a>
##### `ivec4(Expression... els)`

- Description: TODO

<a id="member-43"></a>
##### `ivec3(Expression... els)`

- Description: TODO

<a id="member-44"></a>
##### `ivec2(Expression... els)`

- Description: TODO

<a id="member-45"></a>
##### `intcons(Expression init)`

- Description: TODO

<a id="member-46"></a>
##### `uvec4(Expression... els)`

- Description: TODO

<a id="member-47"></a>
##### `uvec3(Expression... els)`

- Description: TODO

<a id="member-48"></a>
##### `uvec2(Expression... els)`

- Description: TODO

<a id="member-49"></a>
##### `uintcons(Expression init)`

- Description: TODO

<a id="member-50"></a>
##### `mat3(Expression... els)`

- Description: TODO

<a id="member-51"></a>
##### `sin(Expression x)`

- Description: TODO

<a id="member-52"></a>
##### `abs(Expression x)`

- Description: TODO

<a id="member-53"></a>
##### `sign(Expression x)`

- Description: TODO

<a id="member-54"></a>
##### `floor(Expression x)`

- Description: TODO

<a id="member-55"></a>
##### `ceil(Expression x)`

- Description: TODO

<a id="member-56"></a>
##### `fract(Expression x)`

- Description: TODO

<a id="member-57"></a>
##### `mod(Expression x, Expression y)`

- Description: TODO

<a id="member-58"></a>
##### `length(Expression x)`

- Description: TODO

<a id="member-59"></a>
##### `normalize(Expression x)`

- Description: TODO

<a id="member-60"></a>
##### `distance(Expression x, Expression y)`

- Description: TODO

<a id="member-61"></a>
##### `dot(Expression x, Expression y)`

- Description: TODO

<a id="member-62"></a>
##### `pow(Expression x, Expression y)`

- Description: TODO

<a id="member-63"></a>
##### `exp(Expression x)`

- Description: TODO

<a id="member-64"></a>
##### `log(Expression x)`

- Description: TODO

<a id="member-65"></a>
##### `exp2(Expression x)`

- Description: TODO

<a id="member-66"></a>
##### `log2(Expression x)`

- Description: TODO

<a id="member-67"></a>
##### `sqrt(Expression x)`

- Description: TODO

<a id="member-68"></a>
##### `inversesqrt(Expression x)`

- Description: TODO

<a id="member-69"></a>
##### `cross(Expression x, Expression y)`

- Description: TODO

<a id="member-70"></a>
##### `reflect(Expression x, Expression y)`

- Description: TODO

<a id="member-71"></a>
##### `texture2D(Expression s, Expression c)`

- Description: TODO

<a id="member-72"></a>
##### `shadow2D(Expression s, Expression c)`

- Description: TODO

<a id="member-73"></a>
##### `texture3D(Expression s, Expression c)`

- Description: TODO

<a id="member-74"></a>
##### `textureCube(Expression s, Expression c)`

- Description: TODO

<a id="member-75"></a>
##### `texelFetch(Expression s, Expression c, Expression l)`

- Description: TODO

<a id="member-76"></a>
##### `textureSize(Expression s, Expression lod)`

- Description: TODO

<a id="member-77"></a>
##### `mix(Expression x, Expression y, Expression a)`

- Description: TODO

<a id="member-78"></a>
##### `clamp(Expression x, Expression a, Expression b)`

- Description: TODO

<a id="member-79"></a>
##### `step(Expression edge, Expression x)`

- Description: TODO

<a id="member-80"></a>
##### `smoothstep(Expression a, Expression b, Expression x)`

- Description: TODO

<a id="member-81"></a>
##### `reduce(Function fun, Expression... es)`

- Description: TODO

<a id="member-82"></a>
##### `min(Expression... es)`

- Description: TODO

<a id="member-83"></a>
##### `max(Expression... es)`

- Description: TODO

<a id="member-84"></a>
##### `col4(java.awt.Color c)`

- Description: TODO

<a id="member-85"></a>
##### `col3(java.awt.Color c)`

- Description: TODO

<a id="member-86"></a>
##### `col4(haven.FColor c)`

- Description: TODO

<a id="member-87"></a>
##### `col3(haven.FColor c)`

- Description: TODO

<a id="member-88"></a>
##### `vec2(haven.Coord c)`

- Description: TODO

<a id="member-89"></a>
##### `vec3(haven.Coord3f c)`

- Description: TODO

<a id="member-90"></a>
##### `vec2(double a, double b)`

- Description: TODO

<a id="member-91"></a>
##### `vec3(double a, double b, double c)`

- Description: TODO

<a id="member-92"></a>
##### `vec4(double a, double b, double c, double d)`

- Description: TODO

<a id="member-93"></a>
##### `ivec2(haven.Coord c)`

- Description: TODO

<a id="member-94"></a>
##### `ivec2(int a, int b)`

- Description: TODO

<a id="member-95"></a>
##### `ivec3(int a, int b, int c)`

- Description: TODO

<a id="member-96"></a>
##### `ivec4(int a, int b, int c, int d)`

- Description: TODO

<a id="member-97"></a>
##### `uvec2(haven.Coord c)`

- Description: TODO

<a id="member-98"></a>
##### `uvec2(int a, int b)`

- Description: TODO

<a id="member-99"></a>
##### `uvec3(int a, int b, int c)`

- Description: TODO

<a id="member-100"></a>
##### `uvec4(int a, int b, int c, int d)`

- Description: TODO

<a id="member-101"></a>
##### `id(T a)`

- Description: TODO
