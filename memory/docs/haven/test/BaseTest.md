# BaseTest

This file documents the responsibilities and members of `BaseTest`.

## Meta

- Source: [BaseTest.java](../../../../src/haven/test/BaseTest.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a Haven test helper for base test.

## Members

### Constants

### Fields

#### `public ThreadGroup tg`
- Role: Holds the tg state.
- Description: Backs the cached state for this file.

#### `public Thread me`
- Role: Holds the me state.
- Description: Backs the cached state for this file.

### Methods

#### `public BaseTest()`
- Role: Creates a new BaseTest instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void printf(String fmt, Object... args)`
- Role: Performs printf.
- Description: Supports the printf operation used by the surrounding class.

#### `public void start()`
- Role: Starts the current workflow.
- Description: Supports the start operation used by the surrounding class.

#### `public void stop()`
- Role: Stops the current workflow.
- Description: Supports the stop operation used by the surrounding class.
