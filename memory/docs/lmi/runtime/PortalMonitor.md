# PortalMonitor

This file documents the responsibilities and members of `PortalMonitor`.

## Meta

- Source: [PortalMonitor.java](../../../../src/lmi/runtime/PortalMonitor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Observes a narrow slice of runtime state for automation.

## Members

### Constants

#### `private static final Object lock = new Object()`

- Description: TODO

### Fields

#### `private static long enteredGeneration = 0L`

- Description: TODO

### Methods

#### `private PortalMonitor()`

- Description: TODO

#### `public static void clear()`

- Description: TODO

#### `public static long generation()`

- Description: TODO

#### `public static void waitNextEnter(long previousGeneration)`

- Description: TODO

#### `public static void notifyDidEnterPortal()`

- Description: TODO
