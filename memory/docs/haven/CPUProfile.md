# CPUProfile

This file documents the responsibilities and members of `CPUProfile`.

## Meta

- Source: [CPUProfile.java](../../../src/haven/CPUProfile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides CPU profiling support.

## Nested Types

### Current

- Description: TODO

### Frame

- Description: TODO

### Part

- Description: TODO

## Members

### Constants

#### `public static final ThreadLocal<Current> current = new ThreadLocal<>()`

- Description: TODO

### Fields

#### `private final long epoch`

- Description: TODO

#### `private long fno = 1`

- Description: TODO

#### `private long f, t`

- Description: TODO

#### `private long f, t`

- Description: TODO

#### `private Part curp = null`

- Description: TODO

#### `public final Part part`

- Description: TODO

#### `private final Current parent`

- Description: TODO

### Methods

#### `public CPUProfile(int hl)`

- Description: TODO

#### `private double txl(long tm)`

- Description: TODO

#### `public Part(Object nm)`

- Description: TODO

#### `public double f()`

- Description: TODO

#### `public double t()`

- Description: TODO

#### `public Part part(Object nm)`

- Description: TODO

#### `private void fin(long tm)`

- Description: TODO

#### `public void fin()`

- Description: TODO

#### `public Frame()`

- Description: TODO

#### `public void fin()`

- Description: TODO

#### `public Current(Part part, Current parent)`

- Description: TODO

#### `public void fin()`

- Description: TODO

#### `public void close()`

- Description: TODO

#### `public static Current set(Part part)`

- Description: TODO

#### `public static Current begin(Object nm)`

- Description: TODO

#### `public static Current phase(Object nm)`

- Description: TODO

#### `public static Current phase(Current on, Object nm)`

- Description: TODO

#### `public static void end(Current cur)`

- Description: TODO

#### `public static void end()`

- Description: TODO
