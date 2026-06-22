---
source: [NamedSocketAddress.java](../../../../src/haven/NamedSocketAddress.java)
created: 2026-06-13
updated: 2026-06-14
---

# NamedSocketAddress

Represents the named socket address Haven component.

## Members

### Constants

### Fields

#### `public final String host`
- Role: Caches the host value.
- Description: Caches the `host` value for reuse.

#### `public final int port`
- Role: Caches the port value.
- Description: Caches the `port` value for reuse.

### Methods

#### `public NamedSocketAddress(String host, int port)`
- Role: Creates a new NamedSocketAddress instance.
- Description: Constructs the NamedSocketAddress instance from the supplied inputs.

#### `public boolean equals(NamedSocketAddress that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public static NamedSocketAddress parse(String spec, int defport)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public static NamedSocketAddress parse(String spec)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public String toString(int defport)`
- Role: Formats the string representation.
- Description: Formats this NamedSocketAddress for debugging and logging.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this NamedSocketAddress for debugging and logging.