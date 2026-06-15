# Defrag

This file documents the responsibilities and members of `Defrag`.

## Meta

- Source: [Defrag.java](../../../src/haven/Defrag.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides file or cache defragmentation support.

## Members

### Constants

### Fields

#### `byte[] blob`

- Description: TODO

#### `int len`

- Description: TODO

#### `long last = 0`

- Description: TODO

#### `final int[] ms1 = new int[20], ms2 = new int[20]`

- Description: TODO

#### `final int[] ms1 = new int[20], ms2 = new int[20]`

- Description: TODO

### Methods

#### `public Defrag(int len)`

- Description: TODO

#### `private void addm(int m1, int m2)`

- Description: TODO

#### `public void add(byte[] blob, int boff, int blen, int off)`

- Description: TODO

#### `public void add(byte[] blob, int off)`

- Description: TODO

#### `public boolean done()`

- Description: TODO

#### `public Message msg()`

- Description: TODO
