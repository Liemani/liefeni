# Message

## Meta

- Source: [Message.java](../../../src/haven/Message.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a protocol or UI message.

## Code Members

### Member Index

#### Constants

- [T_END](#member-1)
- [T_INT](#member-2)
- [T_STR](#member-3)
- [T_COORD](#member-4)
- [T_UINT8](#member-5)
- [T_UINT16](#member-6)
- [T_COLOR](#member-7)
- [T_FCOLOR](#member-8)
- [T_TTOL](#member-9)
- [T_INT8](#member-10)
- [T_INT16](#member-11)
- [T_NIL](#member-12)
- [T_UID](#member-13)
- [T_BYTES](#member-14)
- [T_FLOAT32](#member-15)
- [T_FLOAT64](#member-16)
- [T_FCOORD32](#member-17)
- [T_FCOORD64](#member-18)
- [T_FLOAT8](#member-19)
- [T_FLOAT16](#member-20)
- [T_SNORM8](#member-21)
- [T_UNORM8](#member-22)
- [T_MNORM8](#member-23)
- [T_SNORM16](#member-24)
- [T_UNORM16](#member-25)
- [T_MNORM16](#member-26)
- [T_SNORM32](#member-27)
- [T_UNORM32](#member-28)
- [T_MNORM32](#member-29)
- [T_MAP](#member-30)
- [T_LONG](#member-31)
- [T_RESSPEC](#member-32)
- [T_RESID](#member-33)

#### Fields

- [empty](#member-34)
- [rh](#member-35)
- [rt](#member-36)
- [wh](#member-37)
- [wt](#member-38)
- [rbuf](#member-39)
- [wbuf](#member-40)
- [nil](#member-41)
- [msg](#member-42)

#### Methods

- [BinError(String message)](#member-43)
- [BinError(String message, Throwable cause)](#member-44)
- [BinError(Throwable cause)](#member-45)
- [msg(Message msg)](#member-46)
- [EOF(String message)](#member-47)
- [FormatError(String message)](#member-48)
- [FormatError(String message, Throwable cause)](#member-49)
- [public abstract boolean underflow(int hint);](#member-50)
- [rensure(int len)](#member-51)
- [rget(int len)](#member-52)
- [eom()](#member-53)
- [int8()](#member-54)
- [uint8()](#member-55)
- [int16()](#member-56)
- [uint16()](#member-57)
- [int32()](#member-58)
- [uint32()](#member-59)
- [int64()](#member-60)
- [uniqid()](#member-61)
- [string()](#member-62)
- [skip(int n)](#member-63)
- [skip()](#member-64)
- [bytes(int n)](#member-65)
- [bytes()](#member-66)
- [bytes(byte[] b, int off, int len)](#member-67)
- [bytes(byte[] b)](#member-68)
- [coord()](#member-69)
- [color()](#member-70)
- [fcolor()](#member-71)
- [float8()](#member-72)
- [float16()](#member-73)
- [float32()](#member-74)
- [float64()](#member-75)
- [cpfloat()](#member-76)
- [snorm8()](#member-77)
- [unorm8()](#member-78)
- [mnorm8()](#member-79)
- [snorm16()](#member-80)
- [unorm16()](#member-81)
- [mnorm16()](#member-82)
- [snorm32()](#member-83)
- [unorm32()](#member-84)
- [mnorm32()](#member-85)
- [tto0(int type, Function<Object, ? extends Object> mapper)](#member-86)
- [tto(int type, Function<Object, ? extends Object> mapper)](#member-87)
- [tto(int type)](#member-88)
- [tto(Function<Object, ? extends Object> mapper)](#member-89)
- [tto()](#member-90)
- [list(Function<Object, ? extends Object> mapper)](#member-91)
- [list()](#member-92)
- [map(Function<Object, ? extends Object> mapper)](#member-93)
- [map()](#member-94)
- [public abstract void overflow(int min);](#member-95)
- [wensure(int len)](#member-96)
- [wget(int len)](#member-97)
- [addbytes(byte[] src, int off, int len)](#member-98)
- [addbytes(byte[] src)](#member-99)
- [addint8(byte num)](#member-100)
- [adduint8(int num)](#member-101)
- [addint16(short num)](#member-102)
- [adduint16(int num)](#member-103)
- [addint32(int num)](#member-104)
- [adduint32(long num)](#member-105)
- [addint64(long num)](#member-106)
- [adduniqid(UID uid)](#member-107)
- [addstring2(String str)](#member-108)
- [addstring(String str)](#member-109)
- [addcoord(Coord c)](#member-110)
- [addcolor(Color color)](#member-111)
- [addfloat8(float num)](#member-112)
- [addfloat16(float num)](#member-113)
- [addfloat32(float num)](#member-114)
- [addfloat64(double num)](#member-115)
- [addfcolor(FColor color)](#member-116)
- [addtto(Object o)](#member-117)
- [addlist(Object... args)](#member-118)
- [addmap(Map<?, ?> map)](#member-119)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `T_END`

- Description: TODO

<a id="member-2"></a>
##### `T_INT`

- Description: TODO

<a id="member-3"></a>
##### `T_STR`

- Description: TODO

<a id="member-4"></a>
##### `T_COORD`

- Description: TODO

<a id="member-5"></a>
##### `T_UINT8`

- Description: TODO

<a id="member-6"></a>
##### `T_UINT16`

- Description: TODO

<a id="member-7"></a>
##### `T_COLOR`

- Description: TODO

<a id="member-8"></a>
##### `T_FCOLOR`

- Description: TODO

<a id="member-9"></a>
##### `T_TTOL`

- Description: TODO

<a id="member-10"></a>
##### `T_INT8`

- Description: TODO

<a id="member-11"></a>
##### `T_INT16`

- Description: TODO

<a id="member-12"></a>
##### `T_NIL`

- Description: TODO

<a id="member-13"></a>
##### `T_UID`

- Description: TODO

<a id="member-14"></a>
##### `T_BYTES`

- Description: TODO

<a id="member-15"></a>
##### `T_FLOAT32`

- Description: TODO

<a id="member-16"></a>
##### `T_FLOAT64`

- Description: TODO

<a id="member-17"></a>
##### `T_FCOORD32`

- Description: TODO

<a id="member-18"></a>
##### `T_FCOORD64`

- Description: TODO

<a id="member-19"></a>
##### `T_FLOAT8`

- Description: TODO

<a id="member-20"></a>
##### `T_FLOAT16`

- Description: TODO

<a id="member-21"></a>
##### `T_SNORM8`

- Description: TODO

<a id="member-22"></a>
##### `T_UNORM8`

- Description: TODO

<a id="member-23"></a>
##### `T_MNORM8`

- Description: TODO

<a id="member-24"></a>
##### `T_SNORM16`

- Description: TODO

<a id="member-25"></a>
##### `T_UNORM16`

- Description: TODO

<a id="member-26"></a>
##### `T_MNORM16`

- Description: TODO

<a id="member-27"></a>
##### `T_SNORM32`

- Description: TODO

<a id="member-28"></a>
##### `T_UNORM32`

- Description: TODO

<a id="member-29"></a>
##### `T_MNORM32`

- Description: TODO

<a id="member-30"></a>
##### `T_MAP`

- Description: TODO

<a id="member-31"></a>
##### `T_LONG`

- Description: TODO

<a id="member-32"></a>
##### `T_RESSPEC`

- Description: TODO

<a id="member-33"></a>
##### `T_RESID`

- Description: TODO

#### Fields

<a id="member-34"></a>
##### `empty`

- Description: TODO

<a id="member-35"></a>
##### `rh`

- Description: TODO

<a id="member-36"></a>
##### `rt`

- Description: TODO

<a id="member-37"></a>
##### `wh`

- Description: TODO

<a id="member-38"></a>
##### `wt`

- Description: TODO

<a id="member-39"></a>
##### `rbuf`

- Description: TODO

<a id="member-40"></a>
##### `wbuf`

- Description: TODO

<a id="member-41"></a>
##### `nil`

- Description: TODO

<a id="member-42"></a>
##### `msg`

- Description: TODO

#### Methods

<a id="member-43"></a>
##### `BinError(String message)`

- Description: TODO

<a id="member-44"></a>
##### `BinError(String message, Throwable cause)`

- Description: TODO

<a id="member-45"></a>
##### `BinError(Throwable cause)`

- Description: TODO

<a id="member-46"></a>
##### `msg(Message msg)`

- Description: TODO

<a id="member-47"></a>
##### `EOF(String message)`

- Description: TODO

<a id="member-48"></a>
##### `FormatError(String message)`

- Description: TODO

<a id="member-49"></a>
##### `FormatError(String message, Throwable cause)`

- Description: TODO

<a id="member-50"></a>
##### `public abstract boolean underflow(int hint);`

- Description: TODO

<a id="member-51"></a>
##### `rensure(int len)`

- Description: TODO

<a id="member-52"></a>
##### `rget(int len)`

- Description: TODO

<a id="member-53"></a>
##### `eom()`

- Description: TODO

<a id="member-54"></a>
##### `int8()`

- Description: TODO

<a id="member-55"></a>
##### `uint8()`

- Description: TODO

<a id="member-56"></a>
##### `int16()`

- Description: TODO

<a id="member-57"></a>
##### `uint16()`

- Description: TODO

<a id="member-58"></a>
##### `int32()`

- Description: TODO

<a id="member-59"></a>
##### `uint32()`

- Description: TODO

<a id="member-60"></a>
##### `int64()`

- Description: TODO

<a id="member-61"></a>
##### `uniqid()`

- Description: TODO

<a id="member-62"></a>
##### `string()`

- Description: TODO

<a id="member-63"></a>
##### `skip(int n)`

- Description: TODO

<a id="member-64"></a>
##### `skip()`

- Description: TODO

<a id="member-65"></a>
##### `bytes(int n)`

- Description: TODO

<a id="member-66"></a>
##### `bytes()`

- Description: TODO

<a id="member-67"></a>
##### `bytes(byte[] b, int off, int len)`

- Description: TODO

<a id="member-68"></a>
##### `bytes(byte[] b)`

- Description: TODO

<a id="member-69"></a>
##### `coord()`

- Description: TODO

<a id="member-70"></a>
##### `color()`

- Description: TODO

<a id="member-71"></a>
##### `fcolor()`

- Description: TODO

<a id="member-72"></a>
##### `float8()`

- Description: TODO

<a id="member-73"></a>
##### `float16()`

- Description: TODO

<a id="member-74"></a>
##### `float32()`

- Description: TODO

<a id="member-75"></a>
##### `float64()`

- Description: TODO

<a id="member-76"></a>
##### `cpfloat()`

- Description: TODO

<a id="member-77"></a>
##### `snorm8()`

- Description: TODO

<a id="member-78"></a>
##### `unorm8()`

- Description: TODO

<a id="member-79"></a>
##### `mnorm8()`

- Description: TODO

<a id="member-80"></a>
##### `snorm16()`

- Description: TODO

<a id="member-81"></a>
##### `unorm16()`

- Description: TODO

<a id="member-82"></a>
##### `mnorm16()`

- Description: TODO

<a id="member-83"></a>
##### `snorm32()`

- Description: TODO

<a id="member-84"></a>
##### `unorm32()`

- Description: TODO

<a id="member-85"></a>
##### `mnorm32()`

- Description: TODO

<a id="member-86"></a>
##### `tto0(int type, Function<Object, ? extends Object> mapper)`

- Description: TODO

<a id="member-87"></a>
##### `tto(int type, Function<Object, ? extends Object> mapper)`

- Description: TODO

<a id="member-88"></a>
##### `tto(int type)`

- Description: TODO

<a id="member-89"></a>
##### `tto(Function<Object, ? extends Object> mapper)`

- Description: TODO

<a id="member-90"></a>
##### `tto()`

- Description: TODO

<a id="member-91"></a>
##### `list(Function<Object, ? extends Object> mapper)`

- Description: TODO

<a id="member-92"></a>
##### `list()`

- Description: TODO

<a id="member-93"></a>
##### `map(Function<Object, ? extends Object> mapper)`

- Description: TODO

<a id="member-94"></a>
##### `map()`

- Description: TODO

<a id="member-95"></a>
##### `public abstract void overflow(int min);`

- Description: TODO

<a id="member-96"></a>
##### `wensure(int len)`

- Description: TODO

<a id="member-97"></a>
##### `wget(int len)`

- Description: TODO

<a id="member-98"></a>
##### `addbytes(byte[] src, int off, int len)`

- Description: TODO

<a id="member-99"></a>
##### `addbytes(byte[] src)`

- Description: TODO

<a id="member-100"></a>
##### `addint8(byte num)`

- Description: TODO

<a id="member-101"></a>
##### `adduint8(int num)`

- Description: TODO

<a id="member-102"></a>
##### `addint16(short num)`

- Description: TODO

<a id="member-103"></a>
##### `adduint16(int num)`

- Description: TODO

<a id="member-104"></a>
##### `addint32(int num)`

- Description: TODO

<a id="member-105"></a>
##### `adduint32(long num)`

- Description: TODO

<a id="member-106"></a>
##### `addint64(long num)`

- Description: TODO

<a id="member-107"></a>
##### `adduniqid(UID uid)`

- Description: TODO

<a id="member-108"></a>
##### `addstring2(String str)`

- Description: TODO

<a id="member-109"></a>
##### `addstring(String str)`

- Description: TODO

<a id="member-110"></a>
##### `addcoord(Coord c)`

- Description: TODO

<a id="member-111"></a>
##### `addcolor(Color color)`

- Description: TODO

<a id="member-112"></a>
##### `addfloat8(float num)`

- Description: TODO

<a id="member-113"></a>
##### `addfloat16(float num)`

- Description: TODO

<a id="member-114"></a>
##### `addfloat32(float num)`

- Description: TODO

<a id="member-115"></a>
##### `addfloat64(double num)`

- Description: TODO

<a id="member-116"></a>
##### `addfcolor(FColor color)`

- Description: TODO

<a id="member-117"></a>
##### `addtto(Object o)`

- Description: TODO

<a id="member-118"></a>
##### `addlist(Object... args)`

- Description: TODO

<a id="member-119"></a>
##### `addmap(Map<?, ?> map)`

- Description: TODO
