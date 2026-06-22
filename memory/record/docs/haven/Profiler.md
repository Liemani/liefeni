---
source: [Profiler.java](../../../../src/haven/Profiler.java)
created: 2026-06-13
updated: 2026-06-14
---

# Profiler

Represents the profiler Haven component.

## Nested Types

### Function

- Role: Aggregates profiling data for one function.
- Description: Keyed profiling record that stores direct, indirect, and line-level tick counts.

### Loop

- Role: Runs the background profiling sampler.
- Description: Sampling thread that periodically records stack traces from profiled threads.

### Sampler

- Role: Samples stack traces from a thread.
- Description: Worker that drives profiler tick collection for a specific target thread.

## Members

### Constants

### Fields

#### `private static Loop loop`
- Role: Caches the loop value.
- Description: Caches the `loop` value for reuse.

#### `public final Thread th`
- Role: Caches the th value.
- Description: Caches the `th` value for reuse.

#### `private boolean enabled`
- Role: Tracks whether enabled is enabled.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final String cl, nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `public final String cl, nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `public int dticks, iticks`
- Role: Caches the iticks value.
- Description: Caches the `iticks` value for reuse.

#### `public int dticks, iticks`
- Role: Caches the iticks value.
- Description: Caches the `iticks` value for reuse.

#### `public Map<Function, Integer> tticks = new HashMap<Function, Integer>()`
- Role: Implements the tticks operation.
- Description: Implements the public map<function, integer> tticks = new hash map<function, integer>() operation.

#### `public Map<Function, Integer> fticks = new HashMap<Function, Integer>()`
- Role: Implements the fticks operation.
- Description: Implements the public map<function, integer> fticks = new hash map<function, integer>() operation.

#### `public Map<Integer, Integer> lticks = new HashMap<Integer, Integer>()`
- Role: Implements the lticks operation.
- Description: Implements the public map<integer, integer> lticks = new hash map<integer, integer>() operation.

#### `private int hc = 0`
- Role: Caches the hc value.
- Description: Caches the `hc` value for reuse.

#### `private Map<Function, Function> funs = new HashMap<Function, Function>()`
- Role: Implements the funs operation.
- Description: Implements the private map<function, function> funs = new hash map<function, function>() operation.

#### `private int nticks = 0`
- Role: Caches the nticks value.
- Description: Caches the `nticks` value for reuse.

#### `private Collection<Profiler> current = new LinkedList<Profiler>()`
- Role: Implements the current operation.
- Description: Implements the private collection<profiler> current = new linked list<profiler>() operation.

#### `public final Thread th`
- Role: Caches the th value.
- Description: Caches the `th` value for reuse.

### Methods

#### `public Profiler(Thread th)`
- Role: Creates a new Profiler instance.
- Description: Constructs the Profiler instance from the supplied inputs.

#### `public Profiler()`
- Role: Creates a new Profiler instance.
- Description: Constructs the Profiler instance from the supplied inputs.

#### `public void enable()`
- Role: Handles the enable path.
- Description: Implements the enable operation.

#### `public void disable()`
- Role: Handles the disable path.
- Description: Implements the disable operation.

#### `public Function(String cl, String nm)`
- Role: Handles the function path.
- Description: Implements the function operation.

#### `public Function(StackTraceElement f)`
- Role: Handles the function path.
- Description: Implements the function operation.

#### `public boolean equals(Object bp)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `private Function getfun(StackTraceElement f)`
- Role: Handles the getfun path.
- Description: Returns the fun.

#### `protected void tick(StackTraceElement[] bt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void outputlp(OutputStream out, String cl, String fnm)`
- Role: Handles the outputlp path.
- Description: Implements the outputlp operation.

#### `public void output(OutputStream out)`
- Role: Handles the output path.
- Description: Implements the output operation.

#### `public void output(String path)`
- Role: Handles the output path.
- Description: Implements the output operation.

#### `Loop()`
- Role: Handles the loop workflow.
- Description: Implements the loop operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private Sampler(Thread th)`
- Role: Handles the sampler path.
- Description: Implements the sampler operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public static void sample(Thread th)`
- Role: Handles the sample path.
- Description: Implements the sample operation.