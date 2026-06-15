# Report

This file documents the responsibilities and members of `Report`.

## Meta

- Source: [Report.java](../../../../src/haven/error/Report.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an error report.

## Members

### Constants

### Fields

#### `private boolean reported = false`

- Description: TODO

#### `public final Throwable t`

- Description: TODO

#### `public final long time`

- Description: TODO

#### `public final Map<String, Object> props = new HashMap<String, Object>()`

- Description: TODO

### Methods

#### `public Report(Throwable t)`

- Description: TODO

#### `synchronized void join() throws InterruptedException`

- Description: TODO

#### `synchronized void done()`

- Description: TODO
