# CoordNd

This file documents the responsibilities and members of `CoordNd`.

## Meta

- Source: [CoordNd.java](../../../src/haven/CoordNd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an N-dimensional coordinate.

## Members

### Constants

#### `public static final CoordNd o = new CoordNd(0)`
- Role: Defines the shared o constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final double[] el`
- Role: Stores the el value.
- Description: Backs the cached state for this file.

### Methods

#### `public CoordNd(int n)`
- Role: Creates a new CoordNd instance.
- Description: Constructs the instance and initializes its default state.

#### `public CoordNd(double... el)`
- Role: Creates a new CoordNd instance.
- Description: Constructs the instance and initializes its default state.

#### `public double el(int i)`
- Role: Performs el.
- Description: Supports the el operation used by the surrounding class.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `private CoordNd op(DoubleUnaryOperator op)`
- Role: Performs op.
- Description: Supports the op operation used by the surrounding class.

#### `private CoordNd op(DoubleBinaryOperator op, double[] b)`
- Role: Performs op.
- Description: Supports the op operation used by the surrounding class.

#### `public CoordNd add(CoordNd b)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public CoordNd inv()`
- Role: Performs inv.
- Description: Supports the inv operation used by the surrounding class.

#### `public CoordNd sub(CoordNd b)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public CoordNd mul(double f)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public CoordNd mul(CoordNd b)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public CoordNd div(double f)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public CoordNd div(CoordNd b)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public CoordNd mod(double b)`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public CoordNd mod(CoordNd b)`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public CoordNd round()`
- Role: Performs round.
- Description: Supports the round operation used by the surrounding class.

#### `public CoordNd floor()`
- Role: Performs floor.
- Description: Supports the floor operation used by the surrounding class.

#### `public CoordNd ceil()`
- Role: Performs ceil.
- Description: Supports the ceil operation used by the surrounding class.

#### `public double dmul(CoordNd b)`
- Role: Performs dmul.
- Description: Supports the dmul operation used by the surrounding class.

#### `public double abs()`
- Role: Performs abs.
- Description: Supports the abs operation used by the surrounding class.

#### `public CoordNd norm(double l)`
- Role: Performs norm.
- Description: Supports the norm operation used by the surrounding class.

#### `public CoordNd norm()`
- Role: Performs norm.
- Description: Supports the norm operation used by the surrounding class.

#### `public double dist(CoordNd o)`
- Role: Performs dist.
- Description: Supports the dist operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
