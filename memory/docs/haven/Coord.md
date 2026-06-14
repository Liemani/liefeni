# Coord

## Meta

- Source: [Coord.java](../../../src/haven/Coord.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides integer coordinate math.

## Code Members

### Member Index

#### Constants

- [ZERO](#member-56)

#### Fields

- [x](#member-1)
- [y](#member-2)
- [z](#member-3)
- [uecw](#member-4)
- [uccw](#member-5)
- [upcw](#member-6)
- [usqc](#member-7)

#### Methods

- [of(int x, int y)](#member-8)
- [of(int x)](#member-9)
- [of(Coord c)](#member-10)
- [sc(double a, double r)](#member-11)
- [equals(Object o)](#member-12)
- [equals(int X, int Y)](#member-13)
- [compareTo(Coord c)](#member-14)
- [hashCode()](#member-15)
- [add(int ax, int ay)](#member-16)
- [add(Coord b)](#member-17)
- [sub(int ax, int ay)](#member-18)
- [sub(Coord b)](#member-19)
- [mul(int f)](#member-20)
- [mul(int fx, int fy)](#member-21)
- [mul(double f)](#member-22)
- [mul(double fx, double fy)](#member-23)
- [inv()](#member-24)
- [mul(Coord f)](#member-25)
- [mul(Coord2d f)](#member-26)
- [div(Coord d)](#member-27)
- [div(int d)](#member-28)
- [div(double d)](#member-29)
- [mod(Coord d)](#member-30)
- [isect2(Coord ul, Coord br)](#member-31)
- [isect(Coord c, Coord s)](#member-32)
- [toString()](#member-33)
- [angle(Coord o)](#member-34)
- [abs()](#member-35)
- [norm(double n)](#member-36)
- [dist(Coord o)](#member-37)
- [clip(Coord ul, Coord sz)](#member-38)
- [clip(Area area)](#member-39)
- [clipi(Area area)](#member-40)
- [offsets(Coord... list)](#member-41)
- [wy(int y)](#member-42)
- [addy(int dy)](#member-43)
- [min(int x, int y)](#member-44)
- [min(Coord c)](#member-45)
- [max(int x, int y)](#member-46)
- [max(Coord c)](#member-47)
- [max()](#member-48)
- [min()](#member-49)
- [init(int x, int y)](#member-50)
- [init(Coord coord)](#member-51)
- [assign(int x, int y)](#member-52)
- [assign(Coord coord)](#member-53)
- [of(haven.Coord2d coord2d)](#member-54)
- [zero()](#member-55)
- [toCoord2d()](#member-57)
- [equals(Coord coord)](#member-58)
- [subtract(int x, int y)](#member-59)
- [multiply(int x, int y)](#member-60)
- [divide(int x, int y)](#member-61)
- [floorDivide(int x, int y)](#member-62)
- [ceilDivide(int x, int y)](#member-63)
- [subtract(Coord coord)](#member-64)
- [multiply(Coord coord)](#member-65)
- [divide(Coord coord)](#member-66)
- [floorDivide(Coord coord)](#member-67)
- [ceilDivide(Coord coord)](#member-68)
- [add(int value)](#member-69)
- [subtract(int value)](#member-70)
- [multiply(int value)](#member-71)
- [divide(int value)](#member-72)
- [floorDivide(int value)](#member-73)
- [ceilDivide(int value)](#member-74)
- [assignAdd(int x, int y)](#member-75)
- [assignSubtract(int x, int y)](#member-76)
- [assignMultiply(int x, int y)](#member-77)
- [assignDivide(int x, int y)](#member-78)
- [assignFloorDivide(int x, int y)](#member-79)
- [assignCeilDivide(int x, int y)](#member-80)
- [assignAdd(Coord coord)](#member-81)
- [assignSubtract(Coord coord)](#member-82)
- [assignMultiply(Coord coord)](#member-83)
- [assignDivide(Coord coord)](#member-84)
- [assignFloorDivide(Coord coord)](#member-85)
- [assignCeilDivide(Coord coord)](#member-86)
- [assignAdd(int value)](#member-87)
- [assignSubtract(int value)](#member-88)
- [assignMultiply(int value)](#member-89)
- [assignDivide(int value)](#member-90)
- [assignFloorDivide(int value)](#member-91)
- [assignCeilDivide(int value)](#member-92)
- [assignAdd(double value)](#member-93)
- [assignSubtract(double value)](#member-94)
- [assignMultiply(double value)](#member-95)
- [assignDivide(double value)](#member-96)
- [assignFloorDivide(double value)](#member-97)
- [assignCeilDivide(double value)](#member-98)
- [center()](#member-99)
- [north()](#member-100)
- [east()](#member-101)
- [west()](#member-102)
- [south()](#member-103)
- [offset(int x, int y)](#member-104)
- [tileMin()](#member-105)
- [tileMax()](#member-106)
- [diagonal()](#member-107)
- [distance(Coord coord)](#member-108)
- [rectilinearDistance(Coord coord)](#member-109)

### Member Reference

#### Constants

<a id="member-56"></a>
##### `ZERO`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `x`

- Description: TODO

<a id="member-2"></a>
##### `y`

- Description: TODO

<a id="member-3"></a>
##### `z`

- Description: TODO

<a id="member-4"></a>
##### `uecw`

- Description: TODO

<a id="member-5"></a>
##### `uccw`

- Description: TODO

<a id="member-6"></a>
##### `upcw`

- Description: TODO

<a id="member-7"></a>
##### `usqc`

- Description: TODO

#### Methods

<a id="member-8"></a>
##### `of(int x, int y)`

- Description: TODO

<a id="member-9"></a>
##### `of(int x)`

- Description: TODO

<a id="member-10"></a>
##### `of(Coord c)`

- Description: TODO

<a id="member-11"></a>
##### `sc(double a, double r)`

- Description: TODO

<a id="member-12"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-13"></a>
##### `equals(int X, int Y)`

- Description: TODO

<a id="member-14"></a>
##### `compareTo(Coord c)`

- Description: TODO

<a id="member-15"></a>
##### `hashCode()`

- Description: TODO

<a id="member-16"></a>
##### `add(int ax, int ay)`

- Description: TODO

<a id="member-17"></a>
##### `add(Coord b)`

- Description: TODO

<a id="member-18"></a>
##### `sub(int ax, int ay)`

- Description: TODO

<a id="member-19"></a>
##### `sub(Coord b)`

- Description: TODO

<a id="member-20"></a>
##### `mul(int f)`

- Description: TODO

<a id="member-21"></a>
##### `mul(int fx, int fy)`

- Description: TODO

<a id="member-22"></a>
##### `mul(double f)`

- Description: TODO

<a id="member-23"></a>
##### `mul(double fx, double fy)`

- Description: TODO

<a id="member-24"></a>
##### `inv()`

- Description: TODO

<a id="member-25"></a>
##### `mul(Coord f)`

- Description: TODO

<a id="member-26"></a>
##### `mul(Coord2d f)`

- Description: TODO

<a id="member-27"></a>
##### `div(Coord d)`

- Description: TODO

<a id="member-28"></a>
##### `div(int d)`

- Description: TODO

<a id="member-29"></a>
##### `div(double d)`

- Description: TODO

<a id="member-30"></a>
##### `mod(Coord d)`

- Description: TODO

<a id="member-31"></a>
##### `isect2(Coord ul, Coord br)`

- Description: TODO

<a id="member-32"></a>
##### `isect(Coord c, Coord s)`

- Description: TODO

<a id="member-33"></a>
##### `toString()`

- Description: TODO

<a id="member-34"></a>
##### `angle(Coord o)`

- Description: TODO

<a id="member-35"></a>
##### `abs()`

- Description: TODO

<a id="member-36"></a>
##### `norm(double n)`

- Description: TODO

<a id="member-37"></a>
##### `dist(Coord o)`

- Description: TODO

<a id="member-38"></a>
##### `clip(Coord ul, Coord sz)`

- Description: TODO

<a id="member-39"></a>
##### `clip(Area area)`

- Description: TODO

<a id="member-40"></a>
##### `clipi(Area area)`

- Description: TODO

<a id="member-41"></a>
##### `offsets(Coord... list)`

- Description: TODO

<a id="member-42"></a>
##### `wy(int y)`

- Description: TODO

<a id="member-43"></a>
##### `addy(int dy)`

- Description: TODO

<a id="member-44"></a>
##### `min(int x, int y)`

- Description: TODO

<a id="member-45"></a>
##### `min(Coord c)`

- Description: TODO

<a id="member-46"></a>
##### `max(int x, int y)`

- Description: TODO

<a id="member-47"></a>
##### `max(Coord c)`

- Description: TODO

<a id="member-48"></a>
##### `max()`

- Description: TODO

<a id="member-49"></a>
##### `min()`

- Description: TODO

<a id="member-50"></a>
##### `init(int x, int y)`

- Description: TODO

<a id="member-51"></a>
##### `init(Coord coord)`

- Description: TODO

<a id="member-52"></a>
##### `assign(int x, int y)`

- Description: TODO

<a id="member-53"></a>
##### `assign(Coord coord)`

- Description: TODO

<a id="member-54"></a>
##### `of(haven.Coord2d coord2d)`

- Description: TODO

<a id="member-55"></a>
##### `zero()`

- Description: TODO

<a id="member-57"></a>
##### `toCoord2d()`

- Description: TODO

<a id="member-58"></a>
##### `equals(Coord coord)`

- Description: TODO

<a id="member-59"></a>
##### `subtract(int x, int y)`

- Description: TODO

<a id="member-60"></a>
##### `multiply(int x, int y)`

- Description: TODO

<a id="member-61"></a>
##### `divide(int x, int y)`

- Description: TODO

<a id="member-62"></a>
##### `floorDivide(int x, int y)`

- Description: TODO

<a id="member-63"></a>
##### `ceilDivide(int x, int y)`

- Description: TODO

<a id="member-64"></a>
##### `subtract(Coord coord)`

- Description: TODO

<a id="member-65"></a>
##### `multiply(Coord coord)`

- Description: TODO

<a id="member-66"></a>
##### `divide(Coord coord)`

- Description: TODO

<a id="member-67"></a>
##### `floorDivide(Coord coord)`

- Description: TODO

<a id="member-68"></a>
##### `ceilDivide(Coord coord)`

- Description: TODO

<a id="member-69"></a>
##### `add(int value)`

- Description: TODO

<a id="member-70"></a>
##### `subtract(int value)`

- Description: TODO

<a id="member-71"></a>
##### `multiply(int value)`

- Description: TODO

<a id="member-72"></a>
##### `divide(int value)`

- Description: TODO

<a id="member-73"></a>
##### `floorDivide(int value)`

- Description: TODO

<a id="member-74"></a>
##### `ceilDivide(int value)`

- Description: TODO

<a id="member-75"></a>
##### `assignAdd(int x, int y)`

- Description: TODO

<a id="member-76"></a>
##### `assignSubtract(int x, int y)`

- Description: TODO

<a id="member-77"></a>
##### `assignMultiply(int x, int y)`

- Description: TODO

<a id="member-78"></a>
##### `assignDivide(int x, int y)`

- Description: TODO

<a id="member-79"></a>
##### `assignFloorDivide(int x, int y)`

- Description: TODO

<a id="member-80"></a>
##### `assignCeilDivide(int x, int y)`

- Description: TODO

<a id="member-81"></a>
##### `assignAdd(Coord coord)`

- Description: TODO

<a id="member-82"></a>
##### `assignSubtract(Coord coord)`

- Description: TODO

<a id="member-83"></a>
##### `assignMultiply(Coord coord)`

- Description: TODO

<a id="member-84"></a>
##### `assignDivide(Coord coord)`

- Description: TODO

<a id="member-85"></a>
##### `assignFloorDivide(Coord coord)`

- Description: TODO

<a id="member-86"></a>
##### `assignCeilDivide(Coord coord)`

- Description: TODO

<a id="member-87"></a>
##### `assignAdd(int value)`

- Description: TODO

<a id="member-88"></a>
##### `assignSubtract(int value)`

- Description: TODO

<a id="member-89"></a>
##### `assignMultiply(int value)`

- Description: TODO

<a id="member-90"></a>
##### `assignDivide(int value)`

- Description: TODO

<a id="member-91"></a>
##### `assignFloorDivide(int value)`

- Description: TODO

<a id="member-92"></a>
##### `assignCeilDivide(int value)`

- Description: TODO

<a id="member-93"></a>
##### `assignAdd(double value)`

- Description: TODO

<a id="member-94"></a>
##### `assignSubtract(double value)`

- Description: TODO

<a id="member-95"></a>
##### `assignMultiply(double value)`

- Description: TODO

<a id="member-96"></a>
##### `assignDivide(double value)`

- Description: TODO

<a id="member-97"></a>
##### `assignFloorDivide(double value)`

- Description: TODO

<a id="member-98"></a>
##### `assignCeilDivide(double value)`

- Description: TODO

<a id="member-99"></a>
##### `center()`

- Description: TODO

<a id="member-100"></a>
##### `north()`

- Description: TODO

<a id="member-101"></a>
##### `east()`

- Description: TODO

<a id="member-102"></a>
##### `west()`

- Description: TODO

<a id="member-103"></a>
##### `south()`

- Description: TODO

<a id="member-104"></a>
##### `offset(int x, int y)`

- Description: TODO

<a id="member-105"></a>
##### `tileMin()`

- Description: TODO

<a id="member-106"></a>
##### `tileMax()`

- Description: TODO

<a id="member-107"></a>
##### `diagonal()`

- Description: TODO

<a id="member-108"></a>
##### `distance(Coord coord)`

- Description: TODO

<a id="member-109"></a>
##### `rectilinearDistance(Coord coord)`

- Description: TODO
