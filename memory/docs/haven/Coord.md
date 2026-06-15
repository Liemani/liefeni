# Coord

This file documents the responsibilities and members of `Coord`.

## Meta

- Source: [Coord.java](../../../src/haven/Coord.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides integer coordinate math.

## Members

### Constants

#### `public static final Coord ZERO = Coord.zero()`

- Description: TODO

### Fields

#### `public int x, y`

- Description: TODO

#### `public int x, y`

- Description: TODO

#### `public static Coord z = new Coord(0, 0)`

- Description: TODO

#### `public static Coord[] uecw =`

- Description: TODO

#### `public static Coord[] uccw =`

- Description: TODO

#### `public static Coord[] upcw =`

- Description: TODO

#### `public static Coord[] usqc =`

- Description: TODO

### Methods

#### `public Coord(int x, int y)`

- Description: TODO

#### `public Coord(Coord c)`

- Description: TODO

#### `public Coord(Coord3f c)`

- Description: TODO

#### `public Coord()`

- Description: TODO

#### `public Coord(java.awt.Dimension d)`

- Description: TODO

#### `public static Coord of(int x, int y)`

- Description: TODO

#### `public static Coord of(int x)`

- Description: TODO

#### `public static Coord of(Coord c)`

- Description: TODO

#### `public static Coord sc(double a, double r)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public boolean equals(int X, int Y)`

- Description: TODO

#### `public int compareTo(Coord c)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public Coord add(int ax, int ay)`

- Description: TODO

#### `public Coord add(Coord b)`

- Description: TODO

#### `public Coord sub(int ax, int ay)`

- Description: TODO

#### `public Coord sub(Coord b)`

- Description: TODO

#### `public Coord mul(int f)`

- Description: TODO

#### `public Coord mul(int fx, int fy)`

- Description: TODO

#### `public Coord mul(double f)`

- Description: TODO

#### `public Coord mul(double fx, double fy)`

- Description: TODO

#### `public Coord inv()`

- Description: TODO

#### `public Coord mul(Coord f)`

- Description: TODO

#### `public Coord2d mul(Coord2d f)`

- Description: TODO

#### `public Coord div(Coord d)`

- Description: TODO

#### `public Coord div(int d)`

- Description: TODO

#### `public Coord div(double d)`

- Description: TODO

#### `public Coord mod(Coord d)`

- Description: TODO

#### `public boolean isect2(Coord ul, Coord br)`

- Description: TODO

#### `public boolean isect(Coord c, Coord s)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public double angle(Coord o)`

- Description: TODO

#### `public double abs()`

- Description: TODO

#### `public Coord norm(double n)`

- Description: TODO

#### `public double dist(Coord o)`

- Description: TODO

#### `public Coord clip(Coord ul, Coord sz)`

- Description: TODO

#### `public Coord clip(Area area)`

- Description: TODO

#### `public Coord clipi(Area area)`

- Description: TODO

#### `public Iterable<Coord> offsets(Coord... list)`

- Description: TODO

#### `public Coord wy(int y)`

- Description: TODO

#### `public Coord addy(int dy)`

- Description: TODO

#### `public Coord min(int x, int y)`

- Description: TODO

#### `public Coord min(Coord c)`

- Description: TODO

#### `public Coord max(int x, int y)`

- Description: TODO

#### `public Coord max(Coord c)`

- Description: TODO

#### `public int max()`

- Description: TODO

#### `public int min()`

- Description: TODO

#### `public void init(int x, int y)`

- Description: TODO

#### `public void init(Coord coord)`

- Description: TODO

#### `public Coord assign(int x, int y)`

- Description: TODO

#### `public Coord assign(Coord coord)`

- Description: TODO

#### `public static Coord of(haven.Coord2d coord2d)`

- Description: TODO

#### `public static Coord zero()`

- Description: TODO

#### `public haven.Coord2d toCoord2d()`

- Description: TODO

#### `public boolean equals(Coord coord)`

- Description: TODO

#### `public Coord subtract(int x, int y)`

- Description: TODO

#### `public Coord multiply(int x, int y)`

- Description: TODO

#### `public Coord divide(int x, int y)`

- Description: TODO

#### `public Coord floorDivide(int x, int y)`

- Description: TODO

#### `public Coord ceilDivide(int x, int y)`

- Description: TODO

#### `public Coord subtract(Coord coord)`

- Description: TODO

#### `public Coord multiply(Coord coord)`

- Description: TODO

#### `public Coord divide(Coord coord)`

- Description: TODO

#### `public Coord floorDivide(Coord coord)`

- Description: TODO

#### `public Coord ceilDivide(Coord coord)`

- Description: TODO

#### `public Coord add(int value)`

- Description: TODO

#### `public Coord subtract(int value)`

- Description: TODO

#### `public Coord multiply(int value)`

- Description: TODO

#### `public Coord divide(int value)`

- Description: TODO

#### `public Coord floorDivide(int value)`

- Description: TODO

#### `public Coord ceilDivide(int value)`

- Description: TODO

#### `public Coord assignAdd(int x, int y)`

- Description: TODO

#### `public Coord assignSubtract(int x, int y)`

- Description: TODO

#### `public Coord assignMultiply(int x, int y)`

- Description: TODO

#### `public Coord assignDivide(int x, int y)`

- Description: TODO

#### `public Coord assignFloorDivide(int x, int y)`

- Description: TODO

#### `public Coord assignCeilDivide(int x, int y)`

- Description: TODO

#### `public Coord assignAdd(Coord coord)`

- Description: TODO

#### `public Coord assignSubtract(Coord coord)`

- Description: TODO

#### `public Coord assignMultiply(Coord coord)`

- Description: TODO

#### `public Coord assignDivide(Coord coord)`

- Description: TODO

#### `public Coord assignFloorDivide(Coord coord)`

- Description: TODO

#### `public Coord assignCeilDivide(Coord coord)`

- Description: TODO

#### `public Coord assignAdd(int value)`

- Description: TODO

#### `public Coord assignSubtract(int value)`

- Description: TODO

#### `public Coord assignMultiply(int value)`

- Description: TODO

#### `public Coord assignDivide(int value)`

- Description: TODO

#### `public Coord assignFloorDivide(int value)`

- Description: TODO

#### `public Coord assignCeilDivide(int value)`

- Description: TODO

#### `public Coord assignAdd(double value)`

- Description: TODO

#### `public Coord assignSubtract(double value)`

- Description: TODO

#### `public Coord assignMultiply(double value)`

- Description: TODO

#### `public Coord assignDivide(double value)`

- Description: TODO

#### `public Coord assignFloorDivide(double value)`

- Description: TODO

#### `public Coord assignCeilDivide(double value)`

- Description: TODO

#### `public Coord center()`

- Description: TODO

#### `public Coord north()`

- Description: TODO

#### `public Coord east()`

- Description: TODO

#### `public Coord west()`

- Description: TODO

#### `public Coord south()`

- Description: TODO

#### `public Coord offset(int x, int y)`

- Description: TODO

#### `public Coord tileMin()`

- Description: TODO

#### `public Coord tileMax()`

- Description: TODO

#### `public double diagonal()`

- Description: TODO

#### `public double distance(Coord coord)`

- Description: TODO

#### `public int rectilinearDistance(Coord coord)`

- Description: TODO
