# Profiler

This file documents the responsibilities and members of `Profiler`.

## Meta

- Source: [Profiler.java](../../../src/haven/Profiler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides profiling support.

## Nested Types

### Function

- Description: TODO

### Loop

- Description: TODO

### Sampler

- Description: TODO

## Members

### Constants

### Fields

#### `private static Loop loop`

- Description: TODO

#### `public final Thread th`

- Description: TODO

#### `private boolean enabled`

- Description: TODO

#### `public final String cl, nm`

- Description: TODO

#### `public final String cl, nm`

- Description: TODO

#### `public int dticks, iticks`

- Description: TODO

#### `public int dticks, iticks`

- Description: TODO

#### `public Map<Function, Integer> tticks = new HashMap<Function, Integer>()`

- Description: TODO

#### `public Map<Function, Integer> fticks = new HashMap<Function, Integer>()`

- Description: TODO

#### `public Map<Integer, Integer> lticks = new HashMap<Integer, Integer>()`

- Description: TODO

#### `private int hc = 0`

- Description: TODO

#### `private Map<Function, Function> funs = new HashMap<Function, Function>()`

- Description: TODO

#### `private int nticks = 0`

- Description: TODO

#### `private Collection<Profiler> current = new LinkedList<Profiler>()`

- Description: TODO

#### `public final Thread th`

- Description: TODO

### Methods

#### `public Profiler(Thread th)`

- Description: TODO

#### `public Profiler()`

- Description: TODO

#### `public void enable()`

- Description: TODO

#### `public void disable()`

- Description: TODO

#### `public Function(String cl, String nm)`

- Description: TODO

#### `public Function(StackTraceElement f)`

- Description: TODO

#### `public boolean equals(Object bp)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `private Function getfun(StackTraceElement f)`

- Description: TODO

#### `protected void tick(StackTraceElement[] bt)`

- Description: TODO

#### `public void outputlp(OutputStream out, String cl, String fnm)`

- Description: TODO

#### `public void output(OutputStream out)`

- Description: TODO

#### `public void output(String path)`

- Description: TODO

#### `Loop()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `private Sampler(Thread th)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public static void sample(Thread th)`

- Description: TODO
