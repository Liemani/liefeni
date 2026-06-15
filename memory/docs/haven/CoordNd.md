# CoordNd

This file documents the responsibilities and members of `CoordNd`.

## Meta

- Source: [CoordNd.java](../../../src/haven/CoordNd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides N-dimensional coordinate helpers.

## Members

### Constants

#### `public static final CoordNd o = new CoordNd(0)`

- Description: TODO

### Fields

#### `public final double[] el`

- Description: TODO

### Methods

#### `public CoordNd(int n)`

- Description: TODO

#### `public CoordNd(double... el)`

- Description: TODO

#### `public double el(int i)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `private CoordNd op(DoubleUnaryOperator op)`

- Description: TODO

#### `private CoordNd op(DoubleBinaryOperator op, double[] b)`

- Description: TODO

#### `public CoordNd add(CoordNd b)`

- Description: TODO

#### `public CoordNd inv()`

- Description: TODO

#### `public CoordNd sub(CoordNd b)`

- Description: TODO

#### `public CoordNd mul(double f)`

- Description: TODO

#### `public CoordNd mul(CoordNd b)`

- Description: TODO

#### `public CoordNd div(double f)`

- Description: TODO

#### `public CoordNd div(CoordNd b)`

- Description: TODO

#### `public CoordNd mod(double b)`

- Description: TODO

#### `public CoordNd mod(CoordNd b)`

- Description: TODO

#### `public CoordNd round()`

- Description: TODO

#### `public CoordNd floor()`

- Description: TODO

#### `public CoordNd ceil()`

- Description: TODO

#### `public double dmul(CoordNd b)`

- Description: TODO

#### `public double abs()`

- Description: TODO

#### `public CoordNd norm(double l)`

- Description: TODO

#### `public CoordNd norm()`

- Description: TODO

#### `public double dist(CoordNd o)`

- Description: TODO

#### `public String toString()`

- Description: TODO
