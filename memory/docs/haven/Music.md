# Music

This file documents the responsibilities and members of `Music`.

## Meta

- Source: [Music.java](../../../src/haven/Music.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles music playback.

## Nested Types

### Player

- Description: TODO

## Members

### Constants

### Fields

#### `private static Player player`

- Description: TODO

#### `public static boolean enabled = true`

- Description: TODO

#### `private static boolean debug = false`

- Description: TODO

#### `private Indir<Resource> res`

- Description: TODO

#### `private Thread waitfor`

- Description: TODO

#### `private Sequencer seq`

- Description: TODO

#### `private Synthesizer synth`

- Description: TODO

#### `private boolean done`

- Description: TODO

#### `private boolean loop = false`

- Description: TODO

### Methods

#### `private static void debug(String str)`

- Description: TODO

#### `private Player(Indir<Resource> res, Thread waitfor)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public static void play(Indir<Resource> res, boolean loop)`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO

#### `public static void enable(boolean enabled)`

- Description: TODO
