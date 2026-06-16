# Defrag

This file documents the responsibilities and members of `Defrag`.

## Meta

- Source: [Defrag.java](../../../src/haven/Defrag.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the defrag Haven component.

## Members

### Constants

### Fields

#### `byte[] blob`
- Role: Stores the blob value.
- Description: Backs the cached state for this file.

#### `int len`
- Role: Stores the len value.
- Description: Backs the cached state for this file.

#### `long last = 0`
- Role: Stores the last value.
- Description: Backs the cached state for this file.

#### `final int[] ms1 = new int[20], ms2 = new int[20]`
- Role: Stores the ms1 value.
- Description: Backs the cached state for this file.

#### `final int[] ms1 = new int[20], ms2 = new int[20]`
- Role: Stores the ms1 value.
- Description: Backs the cached state for this file.

### Methods

#### `public Defrag(int len)`
- Role: Creates a new Defrag instance.
- Description: Constructs the instance and initializes its default state.

#### `private void addm(int m1, int m2)`
- Role: Performs addm.
- Description: Supports the addm operation used by the surrounding class.

#### `public void add(byte[] blob, int boff, int blen, int off)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void add(byte[] blob, int off)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public boolean done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public Message msg()`
- Role: Displays an in-game message.
- Description: Supports the msg operation used by the surrounding class.
