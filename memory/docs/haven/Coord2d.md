# Coord2d

This file documents the responsibilities and members of `Coord2d`.

## Meta

- Source: [Coord2d.java](../../../src/haven/Coord2d.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a 2D floating-point coordinate.

## Members

### Constants

#### `public static final Coord2d z = new Coord2d(0, 0)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public double x, y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

#### `public double x, y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

### Methods

#### `public Coord2d(double x, double y)`
- Role: Creates a new Coord2d instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord2d(Coord c)`
- Role: Creates a new Coord2d instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord2d(Coord3f c)`
- Role: Creates a new Coord2d instance.
- Description: Constructs the instance and initializes its default state.

#### `public Coord2d()`
- Role: Creates a new Coord2d instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Coord2d of(double x, double y)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord2d of(double x)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord2d of(Coord c)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Coord2d of(Coord3f c)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public boolean equals(double X, double Y)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public int compareTo(Coord2d c)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public Coord2d add(double X, double Y)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord2d add(Coord2d b)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Coord2d inv()`
- Role: Performs inv.
- Description: Supports the inv operation used by the surrounding class.

#### `public Coord2d perp()`
- Role: Performs perp.
- Description: Supports the perp operation used by the surrounding class.

#### `public Coord2d sub(double X, double Y)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public Coord2d sub(Coord2d b)`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `public Coord2d mul(double f)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord2d mul(double X, double Y)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord2d mul(Coord2d b)`
- Role: Performs mul.
- Description: Supports the mul operation used by the surrounding class.

#### `public Coord2d div(double f)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public Coord2d div(double X, double Y)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public Coord2d div(Coord2d b)`
- Role: Performs div.
- Description: Supports the div operation used by the surrounding class.

#### `public double dmul(double X, double Y)`
- Role: Performs dmul.
- Description: Supports the dmul operation used by the surrounding class.

#### `public double dmul(Coord2d b)`
- Role: Performs dmul.
- Description: Supports the dmul operation used by the surrounding class.

#### `public Coord round()`
- Role: Performs round.
- Description: Supports the round operation used by the surrounding class.

#### `public Coord2d roundf()`
- Role: Performs roundf.
- Description: Supports the roundf operation used by the surrounding class.

#### `public Coord round(double X, double Y)`
- Role: Performs round.
- Description: Supports the round operation used by the surrounding class.

#### `public Coord round(Coord2d f)`
- Role: Performs round.
- Description: Supports the round operation used by the surrounding class.

#### `public Coord floor()`
- Role: Performs floor.
- Description: Supports the floor operation used by the surrounding class.

#### `public Coord2d floorf()`
- Role: Performs floorf.
- Description: Supports the floorf operation used by the surrounding class.

#### `public Coord floor(double X, double Y)`
- Role: Performs floor.
- Description: Supports the floor operation used by the surrounding class.

#### `public Coord floor(Coord2d f)`
- Role: Performs floor.
- Description: Supports the floor operation used by the surrounding class.

#### `public Coord ceil()`
- Role: Performs ceil.
- Description: Supports the ceil operation used by the surrounding class.

#### `public Coord2d ceilf()`
- Role: Performs ceilf.
- Description: Supports the ceilf operation used by the surrounding class.

#### `public Coord ceil(double X, double Y)`
- Role: Performs ceil.
- Description: Supports the ceil operation used by the surrounding class.

#### `public Coord ceil(Coord2d f)`
- Role: Performs ceil.
- Description: Supports the ceil operation used by the surrounding class.

#### `public Coord2d mod()`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public Coord2d mod(double X, double Y)`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public Coord2d mod(Coord2d f)`
- Role: Performs mod.
- Description: Supports the mod operation used by the surrounding class.

#### `public double angle(Coord2d o)`
- Role: Performs angle.
- Description: Supports the angle operation used by the surrounding class.

#### `public double dist(Coord2d o)`
- Role: Performs dist.
- Description: Supports the dist operation used by the surrounding class.

#### `public double abs()`
- Role: Performs abs.
- Description: Supports the abs operation used by the surrounding class.

#### `public Coord2d norm(double n)`
- Role: Performs norm.
- Description: Supports the norm operation used by the surrounding class.

#### `public Coord2d norm()`
- Role: Performs norm.
- Description: Supports the norm operation used by the surrounding class.

#### `public Coord2d rot(double a)`
- Role: Performs rot.
- Description: Supports the rot operation used by the surrounding class.

#### `public static Coord2d sc(double a, double r)`
- Role: Performs sc.
- Description: Supports the sc operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Coord2d(Coord2d c)`
- Role: Creates a new Coord2d instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean equals(Coord2d c)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.
