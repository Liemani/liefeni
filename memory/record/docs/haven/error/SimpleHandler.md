---
source: [SimpleHandler.java](../../../../../src/haven/error/SimpleHandler.java)
created: 2026-06-13
updated: 2026-06-14
---

# SimpleHandler

Handles Haven error reporting for simple handler.

## Members

### Constants

### Fields

#### `private final boolean dump`
- Role: Tracks the dump flag.
- Description: Caches the `dump` value for reuse.

### Methods

#### `public SimpleHandler(String name, boolean dump)`
- Role: Creates a new SimpleHandler instance.
- Description: Constructs the SimpleHandler instance from the supplied inputs.

#### `public void uncaughtException(Thread t, Throwable e)`
- Role: Handles the uncaught exception path.
- Description: Implements the uncaught exception operation.