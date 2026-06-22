---
source: [Report.java](../../../../../src/haven/error/Report.java)
created: 2026-06-13
updated: 2026-06-14
---

# Report

Handles Haven error reporting for report.

## Members

### Constants

### Fields

#### `private boolean reported = false`
- Role: Tracks the reported flag.
- Description: Caches the `reported` value for reuse.

#### `public final Throwable t`
- Role: Caches the t value.
- Description: Caches the `t` value for reuse.

#### `public final long time`
- Role: Caches the time value.
- Description: Caches the `time` value for reuse.

#### `public final Map<String, Object> props = new HashMap<String, Object>()`
- Role: Implements the props operation.
- Description: Implements the public final map<string, object> props = new hash map<string, object>() operation.

### Methods

#### `public Report(Throwable t)`
- Role: Creates a new Report instance.
- Description: Constructs the Report instance from the supplied inputs.

#### `synchronized void join() throws InterruptedException`
- Role: Handles the join workflow.
- Description: Implements the join operation.

#### `synchronized void done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.