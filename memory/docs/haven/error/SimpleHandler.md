# SimpleHandler

This file documents the responsibilities and members of `SimpleHandler`.

## Meta

- Source: [SimpleHandler.java](../../../../src/haven/error/SimpleHandler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles Haven error reporting for simple handler.

## Members

### Constants

### Fields

#### `private final boolean dump`
- Role: Tracks the dump flag.
- Description: Supports the dump operation used by the surrounding class.

### Methods

#### `public SimpleHandler(String name, boolean dump)`
- Role: Creates a new SimpleHandler instance.
- Description: Constructs the instance and initializes its default state.

#### `public void uncaughtException(Thread t, Throwable e)`
- Role: Performs uncaught exception.
- Description: Supports the uncaught exception operation used by the surrounding class.
