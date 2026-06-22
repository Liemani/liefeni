---
source: [BaseTest.java](../../../../../src/haven/test/BaseTest.java)
created: 2026-06-13
updated: 2026-06-14
---

# BaseTest

Provides a Haven test helper for base test.

## Members

### Constants

### Fields

#### `public ThreadGroup tg`
- Role: Caches the tg value.
- Description: Caches the `tg` value for reuse.

#### `public Thread me`
- Role: Caches the me value.
- Description: Caches the `me` value for reuse.

### Methods

#### `public BaseTest()`
- Role: Creates a new BaseTest instance.
- Description: Constructs the BaseTest instance from the supplied inputs.

#### `public static void printf(String fmt, Object... args)`
- Role: Handles the printf path.
- Description: Implements the printf operation.

#### `public void start()`
- Role: Starts the current workflow.
- Description: Implements the start operation.

#### `public void stop()`
- Role: Stops the current workflow.
- Description: Implements the stop operation.