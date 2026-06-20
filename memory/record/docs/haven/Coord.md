---
source: [Coord.java](../../../src/haven/Coord.java)
created: 2026-06-13
updated: 2026-06-14
---

# Coord

Represents a 2D integer coordinate.

## Members

### Constants

#### `public static final Coord ZERO = Coord.zero()`
- Role: Defines the shared zero constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public int x, y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

#### `public int x, y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

#### `public static Coord z = new Coord(0, 0)`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public static Coord[] uecw =`
- Role: Stores the coord state.
- Description: Backs the cached state for this file.

#### `public static Coord[] uccw =`
- Role: Stores the coord state.
- Description: Backs the cached state for this file.

#### `public static Coord[] upcw =`
- Role: Stores the coord state.
- Description: Backs the cached state for this file.

#### `public static Coord[] usqc =`
- Role: Stores the coord state.
- Description: Backs the cached state for this file.

### Methods

#### `public Coord(int x, int y)`
- Role: Creates a new Coord instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord(Coord c)`
- Role: Creates a new Coord instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord(Coord3f c)`
- Role: Creates a new Coord instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord()`
- Role: Creates a new Coord instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord(java.awt.Dimension d)`
- Role: Creates a new Coord instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Coord of(int x, int y)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord of(int x)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord of(Coord c)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord sc(double a, double r)`
- Role: Performs sc.
- Description: Supports the sc operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(int X, int Y)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int compareTo(Coord c)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public Coord add(int ax, int ay)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord add(Coord b)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord sub(int ax, int ay)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public Coord sub(Coord b)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public Coord mul(int f)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord mul(int fx, int fy)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord mul(double f)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord mul(double fx, double fy)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord inv()`
- Role: Performs inv.
- Description: Supports the inv operation used by the surrounding class.

#### `public Coord mul(Coord f)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord2d mul(Coord2d f)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord div(Coord d)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public Coord div(int d)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public Coord div(double d)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public Coord mod(Coord d)`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public boolean isect2(Coord ul, Coord br)`
- Role: Performs isect2.
- Description: Supports the isect2 operation used by the surrounding class.

#### `public boolean isect(Coord c, Coord s)`
- Role: Performs isect.
- Description: Supports the isect operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public double angle(Coord o)`
- Role: Performs angle.
- Description: Supports the angle operation used by the surrounding class.

#### `public double abs()`
- Role: Performs abs.
- Description: Supports the abs operation used by the surrounding class.

#### `public Coord norm(double n)`
- Role: Performs norm.
- Description: Supports the norm operation used by the surrounding class.

#### `public double dist(Coord o)`
- Role: Performs dist.
- Description: Supports the dist operation used by the surrounding class.

#### `public Coord clip(Coord ul, Coord sz)`
- Role: Performs clip.
- Description: Supports the clip operation used by the surrounding class.

#### `public Coord clip(Area area)`
- Role: Performs clip.
- Description: Supports the clip operation used by the surrounding class.

#### `public Coord clipi(Area area)`
- Role: Performs clipi.
- Description: Supports the clipi operation used by the surrounding class.

#### `public Iterable<Coord> offsets(Coord... list)`
- Role: Performs offsets.
- Description: Supports the offsets operation used by the surrounding class.

#### `public Coord wy(int y)`
- Role: Performs wy.
- Description: Supports the wy operation used by the surrounding class.

#### `public Coord addy(int dy)`
- Role: Performs addy.
- Description: Supports the addy operation used by the surrounding class.

#### `public Coord min(int x, int y)`
- Role: Performs min.
- Description: Supports the min operation used by the surrounding class.

#### `public Coord min(Coord c)`
- Role: Performs min.
- Description: Supports the min operation used by the surrounding class.

#### `public Coord max(int x, int y)`
- Role: Performs max.
- Description: Supports the max operation used by the surrounding class.

#### `public Coord max(Coord c)`
- Role: Performs max.
- Description: Supports the max operation used by the surrounding class.

#### `public int max()`
- Role: Performs max.
- Description: Supports the max operation used by the surrounding class.

#### `public int min()`
- Role: Performs min.
- Description: Supports the min operation used by the surrounding class.

#### `public void init(int x, int y)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public void init(Coord coord)`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Coord assign(int x, int y)`
- Role: Performs assign.
- Description: Supports the assign operation used by the surrounding class.

#### `public Coord assign(Coord coord)`
- Role: Performs assign.
- Description: Supports the assign operation used by the surrounding class.

#### `public static Coord of(haven.Coord2d coord2d)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord zero()`
- Role: Performs zero.
- Description: Supports the zero operation used by the surrounding class.

#### `public haven.Coord2d toCoord2d()`
- Role: Performs to coord2d.
- Description: Supports the to coord2d operation used by the surrounding class.

#### `public boolean equals(Coord coord)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public Coord subtract(int x, int y)`
- Role: Performs subtract.
- Description: Supports the subtract operation used by the surrounding class.

#### `public Coord multiply(int x, int y)`
- Role: Performs multiply.
- Description: Supports the multiply operation used by the surrounding class.

#### `public Coord divide(int x, int y)`
- Role: Performs divide.
- Description: Supports the divide operation used by the surrounding class.

#### `public Coord floorDivide(int x, int y)`
- Role: Performs floor divide.
- Description: Supports the floor divide operation used by the surrounding class.

#### `public Coord ceilDivide(int x, int y)`
- Role: Performs ceil divide.
- Description: Supports the ceil divide operation used by the surrounding class.

#### `public Coord subtract(Coord coord)`
- Role: Performs subtract.
- Description: Supports the subtract operation used by the surrounding class.

#### `public Coord multiply(Coord coord)`
- Role: Performs multiply.
- Description: Supports the multiply operation used by the surrounding class.

#### `public Coord divide(Coord coord)`
- Role: Performs divide.
- Description: Supports the divide operation used by the surrounding class.

#### `public Coord floorDivide(Coord coord)`
- Role: Performs floor divide.
- Description: Supports the floor divide operation used by the surrounding class.

#### `public Coord ceilDivide(Coord coord)`
- Role: Performs ceil divide.
- Description: Supports the ceil divide operation used by the surrounding class.

#### `public Coord add(int value)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord subtract(int value)`
- Role: Performs subtract.
- Description: Supports the subtract operation used by the surrounding class.

#### `public Coord multiply(int value)`
- Role: Performs multiply.
- Description: Supports the multiply operation used by the surrounding class.

#### `public Coord divide(int value)`
- Role: Performs divide.
- Description: Supports the divide operation used by the surrounding class.

#### `public Coord floorDivide(int value)`
- Role: Performs floor divide.
- Description: Supports the floor divide operation used by the surrounding class.

#### `public Coord ceilDivide(int value)`
- Role: Performs ceil divide.
- Description: Supports the ceil divide operation used by the surrounding class.

#### `public Coord assignAdd(int x, int y)`
- Role: Performs assign add.
- Description: Supports the assign add operation used by the surrounding class.

#### `public Coord assignSubtract(int x, int y)`
- Role: Performs assign subtract.
- Description: Supports the assign subtract operation used by the surrounding class.

#### `public Coord assignMultiply(int x, int y)`
- Role: Performs assign multiply.
- Description: Supports the assign multiply operation used by the surrounding class.

#### `public Coord assignDivide(int x, int y)`
- Role: Performs assign divide.
- Description: Supports the assign divide operation used by the surrounding class.

#### `public Coord assignFloorDivide(int x, int y)`
- Role: Performs assign floor divide.
- Description: Supports the assign floor divide operation used by the surrounding class.

#### `public Coord assignCeilDivide(int x, int y)`
- Role: Performs assign ceil divide.
- Description: Supports the assign ceil divide operation used by the surrounding class.

#### `public Coord assignAdd(Coord coord)`
- Role: Performs assign add.
- Description: Supports the assign add operation used by the surrounding class.

#### `public Coord assignSubtract(Coord coord)`
- Role: Performs assign subtract.
- Description: Supports the assign subtract operation used by the surrounding class.

#### `public Coord assignMultiply(Coord coord)`
- Role: Performs assign multiply.
- Description: Supports the assign multiply operation used by the surrounding class.

#### `public Coord assignDivide(Coord coord)`
- Role: Performs assign divide.
- Description: Supports the assign divide operation used by the surrounding class.

#### `public Coord assignFloorDivide(Coord coord)`
- Role: Performs assign floor divide.
- Description: Supports the assign floor divide operation used by the surrounding class.

#### `public Coord assignCeilDivide(Coord coord)`
- Role: Performs assign ceil divide.
- Description: Supports the assign ceil divide operation used by the surrounding class.

#### `public Coord assignAdd(int value)`
- Role: Performs assign add.
- Description: Supports the assign add operation used by the surrounding class.

#### `public Coord assignSubtract(int value)`
- Role: Performs assign subtract.
- Description: Supports the assign subtract operation used by the surrounding class.

#### `public Coord assignMultiply(int value)`
- Role: Performs assign multiply.
- Description: Supports the assign multiply operation used by the surrounding class.

#### `public Coord assignDivide(int value)`
- Role: Performs assign divide.
- Description: Supports the assign divide operation used by the surrounding class.

#### `public Coord assignFloorDivide(int value)`
- Role: Performs assign floor divide.
- Description: Supports the assign floor divide operation used by the surrounding class.

#### `public Coord assignCeilDivide(int value)`
- Role: Performs assign ceil divide.
- Description: Supports the assign ceil divide operation used by the surrounding class.

#### `public Coord assignAdd(double value)`
- Role: Performs assign add.
- Description: Supports the assign add operation used by the surrounding class.

#### `public Coord assignSubtract(double value)`
- Role: Performs assign subtract.
- Description: Supports the assign subtract operation used by the surrounding class.

#### `public Coord assignMultiply(double value)`
- Role: Performs assign multiply.
- Description: Supports the assign multiply operation used by the surrounding class.

#### `public Coord assignDivide(double value)`
- Role: Performs assign divide.
- Description: Supports the assign divide operation used by the surrounding class.

#### `public Coord assignFloorDivide(double value)`
- Role: Performs assign floor divide.
- Description: Supports the assign floor divide operation used by the surrounding class.

#### `public Coord assignCeilDivide(double value)`
- Role: Performs assign ceil divide.
- Description: Supports the assign ceil divide operation used by the surrounding class.

#### `public Coord center()`
- Role: Performs center.
- Description: Supports the center operation used by the surrounding class.

#### `public Coord north()`
- Role: Performs north.
- Description: Supports the north operation used by the surrounding class.

#### `public Coord east()`
- Role: Performs east.
- Description: Supports the east operation used by the surrounding class.

#### `public Coord west()`
- Role: Performs west.
- Description: Supports the west operation used by the surrounding class.

#### `public Coord south()`
- Role: Performs south.
- Description: Supports the south operation used by the surrounding class.

#### `public Coord offset(int x, int y)`
- Role: Performs offset.
- Description: Supports the offset operation used by the surrounding class.

#### `public Coord tileMin()`
- Role: Performs tile min.
- Description: Supports the tile min operation used by the surrounding class.

#### `public Coord tileMax()`
- Role: Performs tile max.
- Description: Supports the tile max operation used by the surrounding class.

#### `public double diagonal()`
- Role: Performs diagonal.
- Description: Supports the diagonal operation used by the surrounding class.

#### `public double distance(Coord coord)`
- Role: Returns the distance from the local player.
- Description: Measures the distance from the current local player position.

#### `public int rectilinearDistance(Coord coord)`
- Role: Performs rectilinear distance.
- Description: Supports the rectilinear distance operation used by the surrounding class.
