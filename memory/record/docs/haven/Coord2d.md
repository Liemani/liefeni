---
source: [Coord2d.java](../../../../src/haven/Coord2d.java)
created: 2026-06-13
updated: 2026-06-14
---

# Coord2d

Represents a 2D floating-point coordinate used for world-space math.

## Members

### Constants

#### `public static final Coord2d z = new Coord2d(0, 0)`
- Role: Defines the zero coordinate constant.
- Description: Shared zero-valued floating-point coordinate.
- Value: `new Coord2d(0, 0)`

### Fields

#### `public double x, y`
- Role: Stores the floating-point components.
- Description: Holds the x and y values of the coordinate.

#### `public double x, y`
- Role: Stores the floating-point components.
- Description: Holds the x and y values of the coordinate.

### Methods

#### `public Coord2d(double x, double y)`
- Role: Creates a floating-point coordinate.
- Description: Stores the supplied x and y components.

#### `public Coord2d(Coord c)`
- Role: Promotes an integer coordinate.
- Description: Copies the integer coordinate into floating-point form.

#### `public Coord2d(Coord3f c)`
- Role: Projects a 3D coordinate into 2D.
- Description: Copies x and y while dropping z.

#### `public Coord2d()`
- Role: Creates the origin.
- Description: Initializes the coordinate to `(0.0, 0.0)`.

#### `public static Coord2d of(double x, double y)`
- Role: Builds a coordinate.
- Description: Returns a new coordinate with the supplied components.

#### `public static Coord2d of(double x)`
- Role: Builds a square coordinate.
- Description: Returns a new coordinate with both components set to the same value.

#### `public static Coord2d of(Coord c)`
- Role: Promotes an integer coordinate.
- Description: Returns a floating-point copy of the supplied integer coordinate.

#### `public static Coord2d of(Coord3f c)`
- Role: Projects a 3D coordinate.
- Description: Returns a floating-point coordinate containing only x and y.

#### `public boolean equals(double X, double Y)`
- Role: Checks whether this value equals another value.
- Description: Returns true when both floating-point components match.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns true when the other object is the same coordinate.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Combines the floating-point components into a stable hash value.

#### `public int compareTo(Coord2d c)`
- Role: Orders coordinates.
- Description: Sorts by y first, then x, to match Haven's coordinate ordering.

#### `public Coord2d add(double X, double Y)`
- Role: Adds offsets.
- Description: Returns a new coordinate shifted by the supplied deltas.

#### `public Coord2d add(Coord2d b)`
- Role: Adds another coordinate.
- Description: Returns a new coordinate shifted by another coordinate.

#### `public Coord2d inv()`
- Role: Negates the coordinate.
- Description: Returns the coordinate mirrored around the origin.

#### `public Coord2d perp()`
- Role: Computes the perpendicular vector.
- Description: Returns the left-hand perpendicular vector used for 2D rotation math.

#### `public Coord2d sub(double X, double Y)`
- Role: Subtracts offsets.
- Description: Returns a new coordinate reduced by the supplied deltas.

#### `public Coord2d sub(Coord2d b)`
- Role: Subtracts another coordinate.
- Description: Returns a new coordinate reduced by another coordinate.

#### `public Coord2d mul(double f)`
- Role: Scales both components.
- Description: Returns a new coordinate multiplied by a scalar.

#### `public Coord2d mul(double X, double Y)`
- Role: Scales each component separately.
- Description: Returns a new coordinate multiplied by separate x and y factors.

#### `public Coord2d mul(Coord2d b)`
- Role: Multiplies by another coordinate.
- Description: Returns a new coordinate whose components are multiplied pairwise.

#### `public Coord2d div(double f)`
- Role: Divides by a scalar.
- Description: Returns a new coordinate divided by one floating-point factor.

#### `public Coord2d div(double X, double Y)`
- Role: Divides each component separately.
- Description: Returns a new coordinate divided by separate x and y factors.

#### `public Coord2d div(Coord2d b)`
- Role: Divides by another coordinate.
- Description: Returns a new coordinate divided pairwise by another coordinate.

#### `public double dmul(double X, double Y)`
- Role: Computes a dot product.
- Description: Returns the dot product between this coordinate and the supplied vector.

#### `public double dmul(Coord2d b)`
- Role: Computes a dot product.
- Description: Returns the dot product between this coordinate and another coordinate.

#### `public Coord round()`
- Role: Rounds to integer coordinates.
- Description: Returns the coordinate rounded to the nearest integers.

#### `public Coord2d roundf()`
- Role: Rounds to floating-point integers.
- Description: Returns a floating-point coordinate with rounded component values.

#### `public Coord round(double X, double Y)`
- Role: Rounds relative to a scale.
- Description: Returns integer coordinates rounded after dividing by the supplied factors.

#### `public Coord round(Coord2d f)`
- Role: Rounds relative to another vector.
- Description: Returns integer coordinates rounded using the supplied factor vector.

#### `public Coord floor()`
- Role: Floors to integer coordinates.
- Description: Returns the coordinate rounded down on both axes.

#### `public Coord2d floorf()`
- Role: Floors to floating-point integers.
- Description: Returns a `Coord2d` whose components are floored values.

#### `public Coord floor(double X, double Y)`
- Role: Floors relative to a scale.
- Description: Returns integer coordinates after dividing and flooring by the supplied factors.

#### `public Coord floor(Coord2d f)`
- Role: Floors relative to another vector.
- Description: Returns integer coordinates after component-wise division and flooring.

#### `public Coord ceil()`
- Role: Ceils to integer coordinates.
- Description: Returns the coordinate rounded up on both axes.

#### `public Coord2d ceilf()`
- Role: Ceils to floating-point integers.
- Description: Returns a `Coord2d` whose components are ceiled values.

#### `public Coord ceil(double X, double Y)`
- Role: Ceils relative to a scale.
- Description: Returns integer coordinates after dividing and ceiling by the supplied factors.

#### `public Coord ceil(Coord2d f)`
- Role: Ceils relative to another vector.
- Description: Returns integer coordinates after component-wise division and ceiling.

#### `public Coord2d mod()`
- Role: Returns the fractional remainder.
- Description: Keeps only the fractional components of the coordinate.

#### `public Coord2d mod(double X, double Y)`
- Role: Returns the fractional remainder at a scale.
- Description: Keeps only the component-wise remainders after division by the supplied factors.

#### `public Coord2d mod(Coord2d f)`
- Role: Returns the fractional remainder relative to another vector.
- Description: Keeps only the component-wise remainders after division by another coordinate.

#### `public double angle(Coord2d o)`
- Role: Computes the angle to another point.
- Description: Returns the direction from this coordinate to `o`.

#### `public double dist(Coord2d o)`
- Role: Computes the distance to another coordinate.
- Description: Returns the Euclidean distance between the two points.

#### `public double abs()`
- Role: Returns the vector length.
- Description: Computes the Euclidean length of the vector.

#### `public Coord2d norm(double n)`
- Role: Normalizes the vector to a target length.
- Description: Scales the vector so its magnitude becomes `n`.

#### `public Coord2d norm()`
- Role: Normalizes the vector to unit length.
- Description: Scales the vector so its magnitude becomes `1`.

#### `public Coord2d rot(double a)`
- Role: Rotates the vector.
- Description: Returns this coordinate rotated by angle `a`.

#### `public static Coord2d sc(double a, double r)`
- Role: Converts polar coordinates.
- Description: Returns a coordinate computed from angle and radius.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Coord2d for debugging and logging.

#### `public Coord2d(Coord2d c)`
- Role: Copies a floating-point coordinate.
- Description: Stores the same x and y values in a new instance.

#### `public boolean equals(Coord2d c)`
- Role: Compares two floating-point coordinates.
- Description: Returns true when both components match exactly.
