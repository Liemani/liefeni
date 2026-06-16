# Report

This file documents the responsibilities and members of `Report`.

## Meta

- Source: [Report.java](../../../../src/haven/error/Report.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles Haven error reporting for report.

## Members

### Constants

### Fields

#### `private boolean reported = false`
- Role: Tracks the reported flag.
- Description: Supports the reported operation used by the surrounding class.

#### `public final Throwable t`
- Role: Holds the t state.
- Description: Backs the cached state for this file.

#### `public final long time`
- Role: Stores the time value.
- Description: Backs the cached state for this file.

#### `public final Map<String, Object> props = new HashMap<String, Object>()`
- Role: Caches props entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Report(Throwable t)`
- Role: Creates a new Report instance.
- Description: Constructs the instance and initializes its default state.

#### `synchronized void join() throws InterruptedException`
- Role: Handles the join workflow.
- Description: Supports the join operation used by the surrounding class.

#### `synchronized void done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.
