---
source: [Profile.java](../../../../src/haven/Profile.java)
created: 2026-06-13
updated: 2026-06-14
---

# Profile

Represents the profile Haven component.

## Nested Types

### Part

- Role: Represents one node in the profile tree.
- Description: Stores a named timing span, child parts, and frame ordering for reporting.

## Members

### Constants

#### `private static final String[] units =`
- Role: Lists the profiling time units.
- Description: Used to print durations in seconds down to nanoseconds.
- Value: ``

### Fields

#### `public final Part[] hist`
- Role: Stores the profiling ring buffer.
- Description: Holds the last recorded frames for summary output.

#### `protected int i = 0`
- Role: Tracks the next write position.
- Description: Advances as new profile frames are recorded.

#### `public final Object nm`
- Role: Stores the part name.
- Description: Used as the label in profile dumps.

#### `private List<Part> ch = null`
- Role: Stores nested sub-parts.
- Description: Child profile parts are dumped beneath their parent part.

### Methods

#### `public Part(Object nm)`
- Role: Creates one profiling part.
- Description: Stores the label for one timed span.

#### `public abstract double f()`
- Role: Returns the start timestamp.
- Description: Implemented by subclasses to report when the measurement began.

#### `public abstract double t()`
- Role: Returns the end timestamp.
- Description: Implemented by subclasses to report when the measurement ended.

#### `public double d()`
- Role: Returns the measured duration.
- Description: Computes `t() - f()` for the current part.

#### `public void add(Part sub)`
- Role: Adds a child part.
- Description: Appends a nested part to the current profile tree.

#### `public List<Part> sub()`
- Role: Returns the child parts.
- Description: Exposes the nested profile parts, or an empty list when none exist.

#### `private void dump(PrintStream out, int indent)`
- Role: Dumps one part with indentation.
- Description: Prints this span and its children sorted by duration.

#### `public void dump(PrintStream out)`
- Role: Dumps the full profile tree.
- Description: Prints the current frame summary starting from this part.

#### `public String toString()`
- Role: Formats the current frame summary.
- Description: Returns a compact one-line view of the nested parts.

#### `public void add(Part frame)`
- Role: Records one profiling frame.
- Description: Writes the frame into the ring buffer and advances the cursor.

#### `public Profile(int hl)`
- Role: Creates a profile ring buffer.
- Description: Allocates space for the requested number of frames.

#### `public Part last()`
- Role: Returns the most recent frame.
- Description: Reads the last entry written into the ring buffer.

#### `public Profile copy()`
- Role: Copies the profile history.
- Description: Duplicates the ring buffer contents and write cursor.

#### `public void dump(PrintStream out)`
- Role: Dumps aggregate timing statistics.
- Description: Prints average, deviation, min, and max across the captured history.
