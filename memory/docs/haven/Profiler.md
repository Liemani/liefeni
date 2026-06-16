# Profiler

This file documents the responsibilities and members of `Profiler`.

## Meta

- Source: [Profiler.java](../../../src/haven/Profiler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the profiler Haven component.

## Nested Types

### Function

- Role: Represents function within Profiler.
- Description: Describes the nested function type used by the enclosing class.

### Loop

- Role: Represents loop within Profiler.
- Description: Describes the nested loop type used by the enclosing class.

### Sampler

- Role: Represents sampler within Profiler.
- Description: Describes the nested sampler type used by the enclosing class.

## Members

### Constants

### Fields

#### `private static Loop loop`
- Role: Holds the loop state.
- Description: Backs the cached state for this file.

#### `public final Thread th`
- Role: Holds the th state.
- Description: Backs the cached state for this file.

#### `private boolean enabled`
- Role: Tracks whether enabled is enabled.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final String cl, nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public final String cl, nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public int dticks, iticks`
- Role: Stores the iticks value.
- Description: Backs the cached state for this file.

#### `public int dticks, iticks`
- Role: Stores the iticks value.
- Description: Backs the cached state for this file.

#### `public Map<Function, Integer> tticks = new HashMap<Function, Integer>()`
- Role: Caches tticks entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Map<Function, Integer> fticks = new HashMap<Function, Integer>()`
- Role: Caches fticks entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Map<Integer, Integer> lticks = new HashMap<Integer, Integer>()`
- Role: Caches lticks entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int hc = 0`
- Role: Stores the hc value.
- Description: Backs the cached state for this file.

#### `private Map<Function, Function> funs = new HashMap<Function, Function>()`
- Role: Caches funs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int nticks = 0`
- Role: Stores the nticks value.
- Description: Backs the cached state for this file.

#### `private Collection<Profiler> current = new LinkedList<Profiler>()`
- Role: Caches current entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Thread th`
- Role: Holds the th state.
- Description: Backs the cached state for this file.

### Methods

#### `public Profiler(Thread th)`
- Role: Creates a new Profiler instance.
- Description: Constructs the instance and initializes its default state.

#### `public Profiler()`
- Role: Creates a new Profiler instance.
- Description: Constructs the instance and initializes its default state.

#### `public void enable()`
- Role: Performs enable.
- Description: Supports the enable operation used by the surrounding class.

#### `public void disable()`
- Role: Performs disable.
- Description: Supports the disable operation used by the surrounding class.

#### `public Function(String cl, String nm)`
- Role: Performs function.
- Description: Supports the function operation used by the surrounding class.

#### `public Function(StackTraceElement f)`
- Role: Performs function.
- Description: Supports the function operation used by the surrounding class.

#### `public boolean equals(Object bp)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `private Function getfun(StackTraceElement f)`
- Role: Performs getfun.
- Description: Supports the getfun operation used by the surrounding class.

#### `protected void tick(StackTraceElement[] bt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void outputlp(OutputStream out, String cl, String fnm)`
- Role: Performs outputlp.
- Description: Supports the outputlp operation used by the surrounding class.

#### `public void output(OutputStream out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public void output(String path)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `Loop()`
- Role: Handles the loop workflow.
- Description: Supports the loop operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private Sampler(Thread th)`
- Role: Performs sampler.
- Description: Supports the sampler operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static void sample(Thread th)`
- Role: Performs sample.
- Description: Supports the sample operation used by the surrounding class.
