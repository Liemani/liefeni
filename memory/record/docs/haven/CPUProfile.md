---
source: [CPUProfile.java](../../../../src/haven/CPUProfile.java)
created: 2026-06-13
updated: 2026-06-14
---

# CPUProfile

Represents the cpuprofile Haven component.

## Nested Types

### Current

- Role: Tracks the active profiling scope on the current thread.
- Description: Holds the current `Part` and restores the previous one when the scope closes.

### Frame

- Role: Represents one top-level CPU profiling frame.
- Description: Creates a frame part, records its finish time, and appends it to the profile.

### Part

- Role: Represents one timed child span inside a CPU profile.
- Description: Extends `Profile.Part` with start/end timestamps measured in nanoseconds.

## Members

### Constants

#### `public static final ThreadLocal<Current> current = new ThreadLocal<>()`
- Role: Stores the active profiling scope for the current thread.
- Description: Lets nested profiling phases restore their parent scope when they end.
- Value: `new ThreadLocal<>()`

### Fields

#### `private final long epoch`
- Role: Stores the profile start epoch.
- Description: Used to convert raw timestamps into displayed profile units.

#### `private long fno = 1`
- Role: Tracks the frame number.
- Description: Increments for each profile frame.

#### `private long f, t`
- Role: Stores the current frame start and end timestamps.
- Description: Measured in nanoseconds relative to `epoch`.

#### `private long f, t`
- Role: Stores the current frame start and end timestamps.
- Description: Measured in nanoseconds relative to `epoch`.

#### `private Part curp = null`
- Role: Tracks the currently open profiling part.
- Description: Set while a nested phase is active.

#### `public final Part part`
- Role: Stores the profiling part associated with this scope.
- Description: This part receives any nested child measurements.

#### `private final Current parent`
- Role: Stores the parent profiling scope.
- Description: Restored when this scope is closed.

### Methods

#### `public CPUProfile(int hl)`
- Role: Creates a CPU profiling ring buffer.
- Description: Allocates history storage for the requested number of frames.

#### `private double txl(long tm)`
- Role: Converts a timestamp into profile display units.
- Description: Normalizes raw nanoseconds against the profile epoch.

#### `public Part(Object nm)`
- Role: Creates one profiling part.
- Description: Binds a name to the new timing span.

#### `public double f()`
- Role: Returns the profile span start time.
- Description: Converts the stored nanosecond timestamp to elapsed seconds.

#### `public double t()`
- Role: Returns the profile span end time.
- Description: Converts the stored nanosecond timestamp to elapsed seconds.

#### `public Part part(Object nm)`
- Role: Starts a nested profiling part.
- Description: Opens a child span under the current profiling scope.

#### `private void fin(long tm)`
- Role: Finishes the current frame at a specific timestamp.
- Description: Closes the frame and records the ending time.

#### `public void fin()`
- Role: Finishes the current frame.
- Description: Uses the current timestamp to close the profiling frame.

#### `public Frame()`
- Role: Creates one top-level profiling frame.
- Description: Opens a root part for the current frame and measures its span.

#### `public void fin()`
- Role: Closes the frame and stores its timing span.
- Description: Finalizes the frame and appends it to the profile history.

#### `public Current(Part part, Current parent)`
- Role: Pushes a new profiling scope.
- Description: Makes the supplied part the active scope on this thread.

#### `public void fin()`
- Role: Restores the previous profiling scope.
- Description: Closes the current scope and rebinds the parent scope.

#### `public void close()`
- Role: Closes the current profiling scope.
- Description: Convenience alias for `fin()`.

#### `public static Current set(Part part)`
- Role: Sets the current profiling scope.
- Description: Installs the supplied part as the current thread-local scope.

#### `public static Current begin(Object nm)`
- Role: Starts a new top-level profiling frame.
- Description: Opens a root frame with the supplied name.

#### `public static Current phase(Object nm)`
- Role: Starts a nested profiling phase.
- Description: Opens a child span under the current scope.

#### `public static Current phase(Current on, Object nm)`
- Role: Starts a nested profiling phase under the supplied scope.
- Description: Opens a child span under an explicit parent.

#### `public static void end(Current cur)`
- Role: Ends the supplied profiling scope.
- Description: Closes the specific scope if it is still current.

#### `public static void end()`
- Role: Ends the current profiling scope.
- Description: Closes the current thread-local scope.
