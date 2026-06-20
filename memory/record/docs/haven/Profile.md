---
source: [Profile.java](../../../src/haven/Profile.java)
created: 2026-06-13
updated: 2026-06-14
---

# Profile

Represents the profile Haven component.

## Nested Types

### Part

- Role: Represents part within Profile.
- Description: Describes the nested part type used by the enclosing class.

## Members

### Constants

#### `private static final String[] units =`
- Role: Defines the shared profile constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Part[] hist`
- Role: Holds the hist state.
- Description: Backs the cached state for this file.

#### `protected int i = 0`
- Role: Stores the i value.
- Description: Backs the cached state for this file.

#### `public final Object nm`
- Role: Holds the nm state.
- Description: Backs the cached state for this file.

#### `private List<Part> ch = null`
- Role: Caches ch entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Part(Object nm)`
- Role: Performs part.
- Description: Supports the part operation used by the surrounding class.

#### `public abstract double f()`
- Role: Performs f.
- Description: Supports the f operation used by the surrounding class.

#### `public abstract double t()`
- Role: Performs t.
- Description: Supports the t operation used by the surrounding class.

#### `public double d()`
- Role: Performs d.
- Description: Supports the d operation used by the surrounding class.

#### `public void add(Part sub)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public List<Part> sub()`
- Role: Performs sub.
- Description: Supports the sub operation used by the surrounding class.

#### `private void dump(PrintStream out, int indent)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public void dump(PrintStream out)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void add(Part frame)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Profile(int hl)`
- Role: Creates a new Profile instance.
- Description: Constructs the instance and initializes its default state.

#### `public Part last()`
- Role: Performs last.
- Description: Supports the last operation used by the surrounding class.

#### `public Profile copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public void dump(PrintStream out)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.
