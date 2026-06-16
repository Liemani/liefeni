# PMessage

This file documents the responsibilities and members of `PMessage`.

## Meta

- Source: [PMessage.java](../../../src/haven/PMessage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the pmessage Haven component.

## Members

### Constants

### Fields

#### `public int type`
- Role: Stores the type value.
- Description: Backs the cached state for this file.

### Methods

#### `public PMessage(int type, byte[] blob, int off, int len)`
- Role: Creates a new PMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public PMessage(int type, byte[] blob)`
- Role: Creates a new PMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public PMessage(int type)`
- Role: Creates a new PMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public PMessage(int type, Message msg, int len)`
- Role: Creates a new PMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public PMessage(int type, Message msg)`
- Role: Creates a new PMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public PMessage(PMessage msg)`
- Role: Creates a new PMessage instance.
- Description: Constructs the instance and initializes its default state.

#### `public PMessage clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.
