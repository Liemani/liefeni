---
source: [Coord.java](../../../../src/haven/Coord.java)
created: 2026-06-13
updated: 2026-06-14
---

# Coord

Represents a 2D integer coordinate used throughout map, UI, and render layout code.

## Members

### Constants

#### `public static final Coord ZERO = Coord.zero()`
- Role: Defines the zero coordinate constant.
- Description: Shared immutable zero coordinate used throughout Haven.
- Value: `Coord.zero()`

### Fields

#### `public int x, y`
- Role: Stores the integer components.
- Description: Holds the x and y values of the coordinate.

#### `public int x, y`
- Role: Stores the integer components.
- Description: Holds the x and y values of the coordinate.

#### `public static Coord z = new Coord(0, 0)`
- Role: Stores the zero alias.
- Description: Legacy mutable zero-coordinate alias used by older code.

#### `public static Coord[] uecw =`
- Role: Stores clockwise unit offsets.
- Description: Cached neighbor offsets for east-clockwise traversal.

#### `public static Coord[] uccw =`
- Role: Stores counterclockwise unit offsets.
- Description: Cached square-corner offsets for counterclockwise traversal.

#### `public static Coord[] upcw =`
- Role: Stores eight-way offsets.
- Description: Cached offsets for the eight cells around the origin.

#### `public static Coord[] usqc =`
- Role: Stores square-cell offsets.
- Description: Cached 3x3 neighborhood offsets centered on the origin.

### Methods

#### `public Coord(int x, int y)`
- Role: Creates a coordinate from two integers.
- Description: Stores the supplied x and y components.

#### `public Coord(Coord c)`
- Role: Copies another coordinate.
- Description: Creates a new coordinate with the same integer components.

#### `public Coord(Coord3f c)`
- Role: Projects a 3D coordinate into 2D.
- Description: Drops the z component and stores the integer x/y values.

#### `public Coord()`
- Role: Creates the origin.
- Description: Initializes the coordinate to `(0, 0)`.

#### `public Coord(java.awt.Dimension d)`
- Role: Converts an AWT dimension.
- Description: Copies width and height into integer coordinate form.

#### `public static Coord of(int x, int y)`
- Role: Builds a coordinate.
- Description: Returns a new coordinate with the supplied x and y values.

#### `public static Coord of(int x)`
- Role: Builds a square coordinate.
- Description: Returns a new coordinate with both components set to the same value.

#### `public static Coord of(Coord c)`
- Role: Copies a coordinate.
- Description: Returns a new coordinate with the same components as the source.

#### `public static Coord sc(double a, double r)`
- Role: Converts polar coordinates.
- Description: Returns an integer coordinate computed from angle and radius.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns true when the other object has the same components.

#### `public boolean equals(int X, int Y)`
- Role: Checks whether this value equals another value.
- Description: Returns true when both integer components match.

#### `public int compareTo(Coord c)`
- Role: Orders coordinates for sorting.
- Description: Sorts by y first and then by x, matching Haven's top-to-bottom ordering.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Combines the integer components into a stable hash value.

#### `public Coord add(int ax, int ay)`
- Role: Adds offsets.
- Description: Returns a new coordinate shifted by the supplied deltas.

#### `public Coord add(Coord b)`
- Role: Adds another coordinate.
- Description: Returns a new coordinate shifted by another coordinate.

#### `public Coord sub(int ax, int ay)`
- Role: Subtracts offsets.
- Description: Returns a new coordinate reduced by the supplied deltas.

#### `public Coord sub(Coord b)`
- Role: Subtracts another coordinate.
- Description: Returns a new coordinate reduced by another coordinate.

#### `public Coord mul(int f)`
- Role: Scales both components.
- Description: Returns a new coordinate multiplied by one integer scale factor.

#### `public Coord mul(int fx, int fy)`
- Role: Scales each component separately.
- Description: Returns a new coordinate multiplied by separate x and y scale factors.

#### `public Coord mul(double f)`
- Role: Scales both components.
- Description: Returns a rounded integer coordinate after multiplying by a scalar.

#### `public Coord mul(double fx, double fy)`
- Role: Scales each component separately.
- Description: Returns a rounded integer coordinate after multiplying x and y independently.

#### `public Coord inv()`
- Role: Negates the coordinate.
- Description: Returns the coordinate mirrored around the origin.

#### `public Coord mul(Coord f)`
- Role: Multiplies by another coordinate.
- Description: Returns a coordinate whose components are multiplied pairwise.

#### `public Coord2d mul(Coord2d f)`
- Role: Multiplies into floating-point space.
- Description: Returns a floating-point coordinate scaled by this integer coordinate.

#### `public Coord div(Coord d)`
- Role: Divides by another coordinate.
- Description: Returns floor-divided integer components using the supplied divisor.

#### `public Coord div(int d)`
- Role: Divides by one scalar.
- Description: Returns floor-divided integer components using the same divisor for both axes.

#### `public Coord div(double d)`
- Role: Divides by a floating-point scalar.
- Description: Returns rounded integer components after dividing by the supplied scalar.

#### `public Coord mod(Coord d)`
- Role: Computes component-wise modulo.
- Description: Returns wrapped coordinates using floor modulo for each axis.

#### `public boolean isect2(Coord ul, Coord br)`
- Role: Tests rectangle intersection.
- Description: Returns whether the coordinate lies inside the half-open rectangle.

#### `public boolean isect(Coord c, Coord s)`
- Role: Tests rectangle intersection.
- Description: Returns whether the coordinate lies inside a rectangle defined by origin and size.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats the coordinate as `(x, y)`.

#### `public double angle(Coord o)`
- Role: Computes the angle to another point.
- Description: Returns the direction from this coordinate to the supplied coordinate.

#### `public double abs()`
- Role: Computes the vector length.
- Description: Returns the Euclidean length of the coordinate vector.

#### `public Coord norm(double n)`
- Role: Normalizes to a target length.
- Description: Returns the coordinate scaled to the requested magnitude.

#### `public double dist(Coord o)`
- Role: Computes distance.
- Description: Returns the Euclidean distance to another coordinate.

#### `public Coord clip(Coord ul, Coord sz)`
- Role: Clamps to a rectangle.
- Description: Returns the coordinate clamped to the supplied origin and size.

#### `public Coord clip(Area area)`
- Role: Clamps to an area.
- Description: Returns the coordinate clamped to the supplied `Area`.

#### `public Coord clipi(Area area)`
- Role: Clamps to an integer area.
- Description: Returns the coordinate clamped while preserving interior inclusion rules.

#### `public Iterable<Coord> offsets(Coord... list)`
- Role: Iterates translated coordinates.
- Description: Returns each input offset added to this coordinate.

#### `public Coord wy(int y)`
- Role: Replaces only the y component.
- Description: Returns a copy with the same x value and the supplied y value.

#### `public Coord addy(int dy)`
- Role: Shifts only the y component.
- Description: Returns a copy moved vertically by `dy`.

#### `public Coord min(int x, int y)`
- Role: Clamps both components from above.
- Description: Returns a coordinate whose x and y are each limited by the supplied values.

#### `public Coord min(Coord c)`
- Role: Clamps both components from above.
- Description: Returns a coordinate with each component limited by another coordinate.

#### `public Coord max(int x, int y)`
- Role: Clamps both components from below.
- Description: Returns a coordinate whose x and y are each raised to the supplied minimum values.

#### `public Coord max(Coord c)`
- Role: Clamps both components from below.
- Description: Returns a coordinate with each component raised to another coordinate's value.

#### `public int max()`
- Role: Returns the larger component.
- Description: Compares x and y and returns the larger value.

#### `public int min()`
- Role: Returns the smaller component.
- Description: Compares x and y and returns the smaller value.

#### `public void init(int x, int y)`
- Role: Reinitializes this coordinate.
- Description: Overwrites the stored x and y values in place.

#### `public void init(Coord coord)`
- Role: Reinitializes this coordinate from another coordinate.
- Description: Overwrites the stored x and y values in place.

#### `public Coord assign(int x, int y)`
- Role: Assigns new coordinate values.
- Description: Updates this coordinate in place and returns it.

#### `public Coord assign(Coord coord)`
- Role: Assigns values from another coordinate.
- Description: Updates this coordinate in place and returns it.

#### `public static Coord of(haven.Coord2d coord2d)`
- Role: Builds a Coord value from the supplied components.
- Description: Builds a Coord value from the supplied components.

#### `public static Coord zero()`
- Role: Returns the origin coordinate.
- Description: Returns a new coordinate set to `(0, 0)`.

#### `public haven.Coord2d toCoord2d()`
- Role: Converts to floating-point coordinates.
- Description: Returns the same point as a `Coord2d`.

#### `public boolean equals(Coord coord)`
- Role: Compares two coordinates.
- Description: Returns true when both x and y values match.

#### `public Coord subtract(int x, int y)`
- Role: Subtracts raw offsets.
- Description: Returns a coordinate shifted by the supplied deltas.

#### `public Coord multiply(int x, int y)`
- Role: Multiplies by raw scale factors.
- Description: Returns a coordinate scaled independently per axis.

#### `public Coord divide(int x, int y)`
- Role: Divides by raw scale factors.
- Description: Returns a floor-divided coordinate scaled independently per axis.

#### `public Coord floorDivide(int x, int y)`
- Role: Floor-divides by raw scale factors.
- Description: Returns a floor-divided coordinate scaled independently per axis.

#### `public Coord ceilDivide(int x, int y)`
- Role: Ceil-divides by raw scale factors.
- Description: Returns a ceiling-divided coordinate scaled independently per axis.

#### `public Coord subtract(Coord coord)`
- Role: Subtracts another coordinate.
- Description: Returns the component-wise difference.

#### `public Coord multiply(Coord coord)`
- Role: Multiplies by another coordinate.
- Description: Returns the component-wise product.

#### `public Coord divide(Coord coord)`
- Role: Divides by another coordinate.
- Description: Returns the component-wise floor division.

#### `public Coord floorDivide(Coord coord)`
- Role: Floor-divides by another coordinate.
- Description: Returns the component-wise floor division.

#### `public Coord ceilDivide(Coord coord)`
- Role: Ceil-divides by another coordinate.
- Description: Returns the component-wise ceiling division.

#### `public Coord add(int value)`
- Role: Adds the same value to both axes.
- Description: Returns a coordinate shifted by `value` on x and y.

#### `public Coord subtract(int value)`
- Role: Subtracts the same value from both axes.
- Description: Returns a coordinate shifted negatively by `value`.

#### `public Coord multiply(int value)`
- Role: Scales both axes equally.
- Description: Returns a coordinate multiplied by `value`.

#### `public Coord divide(int value)`
- Role: Divides both axes equally.
- Description: Returns a coordinate floor-divided by `value`.

#### `public Coord floorDivide(int value)`
- Role: Floor-divides both axes equally.
- Description: Returns a coordinate floor-divided by `value`.

#### `public Coord ceilDivide(int value)`
- Role: Ceil-divides both axes equally.
- Description: Returns a coordinate ceiling-divided by `value`.

#### `public Coord assignAdd(int x, int y)`
- Role: Adds raw offsets in place.
- Description: Mutates this coordinate by adding the supplied deltas.

#### `public Coord assignSubtract(int x, int y)`
- Role: Subtracts raw offsets in place.
- Description: Mutates this coordinate by subtracting the supplied deltas.

#### `public Coord assignMultiply(int x, int y)`
- Role: Multiplies by raw factors in place.
- Description: Mutates this coordinate by multiplying x and y separately.

#### `public Coord assignDivide(int x, int y)`
- Role: Divides by raw factors in place.
- Description: Mutates this coordinate by floor-dividing x and y separately.

#### `public Coord assignFloorDivide(int x, int y)`
- Role: Floor-divides by raw factors in place.
- Description: Mutates this coordinate by floor-dividing x and y separately.

#### `public Coord assignCeilDivide(int x, int y)`
- Role: Ceil-divides by raw factors in place.
- Description: Mutates this coordinate by ceiling-dividing x and y separately.

#### `public Coord assignAdd(Coord coord)`
- Role: Adds another coordinate in place.
- Description: Mutates this coordinate by adding another coordinate's components.

#### `public Coord assignSubtract(Coord coord)`
- Role: Subtracts another coordinate in place.
- Description: Mutates this coordinate by subtracting another coordinate's components.

#### `public Coord assignMultiply(Coord coord)`
- Role: Multiplies by another coordinate in place.
- Description: Mutates this coordinate by multiplying x and y separately.

#### `public Coord assignDivide(Coord coord)`
- Role: Divides by another coordinate in place.
- Description: Mutates this coordinate by floor-dividing x and y separately.

#### `public Coord assignFloorDivide(Coord coord)`
- Role: Floor-divides by another coordinate in place.
- Description: Mutates this coordinate by floor-dividing x and y separately.

#### `public Coord assignCeilDivide(Coord coord)`
- Role: Ceil-divides by another coordinate in place.
- Description: Mutates this coordinate by ceiling-dividing x and y separately.

#### `public Coord assignAdd(int value)`
- Role: Adds the same value to both axes in place.
- Description: Mutates this coordinate by adding `value` to x and y.

#### `public Coord assignSubtract(int value)`
- Role: Subtracts the same value from both axes in place.
- Description: Mutates this coordinate by subtracting `value` from x and y.

#### `public Coord assignMultiply(int value)`
- Role: Scales both axes equally in place.
- Description: Mutates this coordinate by multiplying x and y by `value`.

#### `public Coord assignDivide(int value)`
- Role: Divides both axes equally in place.
- Description: Mutates this coordinate by floor-dividing x and y by `value`.

#### `public Coord assignFloorDivide(int value)`
- Role: Floor-divides both axes equally in place.
- Description: Mutates this coordinate by floor-dividing x and y by `value`.

#### `public Coord assignCeilDivide(int value)`
- Role: Ceil-divides both axes equally in place.
- Description: Mutates this coordinate by ceiling-dividing x and y by `value`.

#### `public Coord assignAdd(double value)`
- Role: Adds a scalar to both axes in place.
- Description: Mutates this coordinate by adding the same floating value to x and y.

#### `public Coord assignSubtract(double value)`
- Role: Subtracts a scalar from both axes in place.
- Description: Mutates this coordinate by subtracting the same floating value from x and y.

#### `public Coord assignMultiply(double value)`
- Role: Scales both axes by a scalar in place.
- Description: Mutates this coordinate by multiplying x and y by the same floating value.

#### `public Coord assignDivide(double value)`
- Role: Divides both axes by a scalar in place.
- Description: Mutates this coordinate by dividing x and y by the same floating value.

#### `public Coord assignFloorDivide(double value)`
- Role: Floor-divides both axes by a scalar in place.
- Description: Mutates this coordinate by floor-dividing x and y by the same floating value.

#### `public Coord assignCeilDivide(double value)`
- Role: Ceil-divides both axes by a scalar in place.
- Description: Mutates this coordinate by ceiling-dividing x and y by the same floating value.

#### `public Coord center()`
- Role: Returns the coordinate centered on the tile grid.
- Description: Adjusts this coordinate to the center point of the current tile.

#### `public Coord north()`
- Role: Returns the coordinate one tile north.
- Description: Shifts the y component upward by one tile step.

#### `public Coord east()`
- Role: Returns the coordinate one tile east.
- Description: Shifts the x component right by one tile step.

#### `public Coord west()`
- Role: Returns the coordinate one tile west.
- Description: Shifts the x component left by one tile step.

#### `public Coord south()`
- Role: Returns the coordinate one tile south.
- Description: Shifts the y component downward by one tile step.

#### `public Coord offset(int x, int y)`
- Role: Returns a coordinate offset by raw deltas.
- Description: Adds the supplied x and y values to this coordinate.

#### `public Coord tileMin()`
- Role: Returns the lower tile corner.
- Description: Floors this coordinate to the tile grid minimum.

#### `public Coord tileMax()`
- Role: Returns the upper tile corner.
- Description: Ceils this coordinate to the tile grid maximum.

#### `public double diagonal()`
- Role: Returns the diagonal distance estimate.
- Description: Uses the Euclidean length rounded up to the nearest whole value.

#### `public double distance(Coord coord)`
- Role: Returns the Euclidean distance to another coordinate.
- Description: Measures the straight-line distance between two map positions.

#### `public int rectilinearDistance(Coord coord)`
- Role: Returns the Manhattan distance to another coordinate.
- Description: Adds the absolute x and y differences.
