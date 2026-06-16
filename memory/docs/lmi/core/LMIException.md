# LMIException

This file documents the responsibilities and members of `LMIException`.

## Meta

- Source: [LMIException.java](../../../../src/lmi/core/LMIException.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an LMI-specific runtime error.

## Members

### Constants

### Fields

#### `public ExceptionReason reason`
- Role: Holds the reason state.
- Description: Backs the cached state for this file.

### Methods

#### `public LMIException(ExceptionReason reason)`
- Role: Creates a new LMIException instance.
- Description: Constructs the instance and initializes its default state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
