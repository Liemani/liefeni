---
source: [CoordNd.java](../../../../src/haven/CoordNd.java)
created: 2026-06-13
updated: 2026-06-14
---

# CoordNd

Represents an N-dimensional coordinate.

## Members

### Constants

#### `public static final CoordNd o = new CoordNd(0)`
- Role: Implements the o operation.
- Description: Implements the coord nd operation.
- Value: `new CoordNd(0)`

### Fields

#### `public final double[] el`
- Role: Caches the el value.
- Description: Caches the `el` value for reuse.

### Methods

#### `public CoordNd(int n)`
- Role: Creates a new CoordNd instance.
- Description: Constructs the CoordNd instance from the supplied inputs.

#### `public CoordNd(double... el)`
- Role: Creates a new CoordNd instance.
- Description: Constructs the CoordNd instance from the supplied inputs.

#### `public double el(int i)`
- Role: Handles the el path.
- Description: Implements the el operation.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `private CoordNd op(DoubleUnaryOperator op)`
- Role: Handles the op path.
- Description: Implements the op operation.

#### `private CoordNd op(DoubleBinaryOperator op, double[] b)`
- Role: Handles the op path.
- Description: Implements the op operation.

#### `public CoordNd add(CoordNd b)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public CoordNd inv()`
- Role: Handles the inv path.
- Description: Implements the inv operation.

#### `public CoordNd sub(CoordNd b)`
- Role: Subtracts the supplied value from this CoordNd.
- Description: Subtracts the supplied value from this CoordNd.

#### `public CoordNd mul(double f)`
- Role: Multiplies this CoordNd by the supplied value.
- Description: Multiplies this CoordNd by the supplied value.

#### `public CoordNd mul(CoordNd b)`
- Role: Multiplies this CoordNd by the supplied value.
- Description: Multiplies this CoordNd by the supplied value.

#### `public CoordNd div(double f)`
- Role: Divides this CoordNd by the supplied value.
- Description: Divides this CoordNd by the supplied value.

#### `public CoordNd div(CoordNd b)`
- Role: Divides this CoordNd by the supplied value.
- Description: Divides this CoordNd by the supplied value.

#### `public CoordNd mod(double b)`
- Role: Handles the mod path.
- Description: Implements the mod operation.

#### `public CoordNd mod(CoordNd b)`
- Role: Handles the mod path.
- Description: Implements the mod operation.

#### `public CoordNd round()`
- Role: Handles the round path.
- Description: Implements the round operation.

#### `public CoordNd floor()`
- Role: Handles the floor path.
- Description: Implements the floor operation.

#### `public CoordNd ceil()`
- Role: Handles the ceil path.
- Description: Implements the ceil operation.

#### `public double dmul(CoordNd b)`
- Role: Handles the dmul path.
- Description: Implements the dmul operation.

#### `public double abs()`
- Role: Returns the vector length of this CoordNd.
- Description: Returns the vector length of this CoordNd.

#### `public CoordNd norm(double l)`
- Role: Normalizes this CoordNd to the requested length.
- Description: Normalizes this CoordNd to the requested length.

#### `public CoordNd norm()`
- Role: Normalizes this CoordNd to the requested length.
- Description: Normalizes this CoordNd to the requested length.

#### `public double dist(CoordNd o)`
- Role: Computes the distance to another CoordNd.
- Description: Computes the distance to another CoordNd.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this CoordNd for debugging and logging.