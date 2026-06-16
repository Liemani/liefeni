# CPUProfile

This file documents the responsibilities and members of `CPUProfile`.

## Meta

- Source: [CPUProfile.java](../../../src/haven/CPUProfile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the cpuprofile Haven component.

## Nested Types

### Current

- Role: Represents current within CPUProfile.
- Description: Describes the nested current type used by the enclosing class.

### Frame

- Role: Represents frame within CPUProfile.
- Description: Describes the nested frame type used by the enclosing class.

### Part

- Role: Represents part within CPUProfile.
- Description: Describes the nested part type used by the enclosing class.

## Members

### Constants

#### `public static final ThreadLocal<Current> current = new ThreadLocal<>()`
- Role: Defines the shared current constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final long epoch`
- Role: Stores the epoch value.
- Description: Backs the cached state for this file.

#### `private long fno = 1`
- Role: Stores the fno value.
- Description: Backs the cached state for this file.

#### `private long f, t`
- Role: Stores the t value.
- Description: Backs the cached state for this file.

#### `private long f, t`
- Role: Stores the t value.
- Description: Backs the cached state for this file.

#### `private Part curp = null`
- Role: Holds the curp state.
- Description: Backs the cached state for this file.

#### `public final Part part`
- Role: Holds the part state.
- Description: Backs the cached state for this file.

#### `private final Current parent`
- Role: Holds the parent state.
- Description: Backs the cached state for this file.

### Methods

#### `public CPUProfile(int hl)`
- Role: Creates a new CPUProfile instance.
- Description: Constructs the instance and initializes its default state.

#### `private double txl(long tm)`
- Role: Performs txl.
- Description: Supports the txl operation used by the surrounding class.

#### `public Part(Object nm)`
- Role: Performs part.
- Description: Supports the part operation used by the surrounding class.

#### `public double f()`
- Role: Performs f.
- Description: Supports the f operation used by the surrounding class.

#### `public double t()`
- Role: Performs t.
- Description: Supports the t operation used by the surrounding class.

#### `public Part part(Object nm)`
- Role: Performs part.
- Description: Supports the part operation used by the surrounding class.

#### `private void fin(long tm)`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public void fin()`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public Frame()`
- Role: Performs frame.
- Description: Supports the frame operation used by the surrounding class.

#### `public void fin()`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public Current(Part part, Current parent)`
- Role: Performs current.
- Description: Supports the current operation used by the surrounding class.

#### `public void fin()`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public static Current set(Part part)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public static Current begin(Object nm)`
- Role: Performs begin.
- Description: Supports the begin operation used by the surrounding class.

#### `public static Current phase(Object nm)`
- Role: Performs phase.
- Description: Supports the phase operation used by the surrounding class.

#### `public static Current phase(Current on, Object nm)`
- Role: Performs phase.
- Description: Supports the phase operation used by the surrounding class.

#### `public static void end(Current cur)`
- Role: Performs end.
- Description: Supports the end operation used by the surrounding class.

#### `public static void end()`
- Role: Performs end.
- Description: Supports the end operation used by the surrounding class.
