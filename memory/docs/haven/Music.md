# Music

This file documents the responsibilities and members of `Music`.

## Meta

- Source: [Music.java](../../../src/haven/Music.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the music Haven component.

## Nested Types

### Player

- Role: Represents player within Music.
- Description: Describes the nested player type used by the enclosing class.

## Members

### Constants

### Fields

#### `private static Player player`
- Role: Holds the player state.
- Description: Backs the cached state for this file.

#### `public static boolean enabled = true`
- Role: Tracks whether enabled is enabled.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static boolean debug = false`
- Role: Tracks the debug flag.
- Description: Supports the debug operation used by the surrounding class.

#### `private Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `private Thread waitfor`
- Role: Holds the waitfor state.
- Description: Backs the cached state for this file.

#### `private Sequencer seq`
- Role: Holds the seq state.
- Description: Backs the cached state for this file.

#### `private Synthesizer synth`
- Role: Holds the synth state.
- Description: Backs the cached state for this file.

#### `private boolean done`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `private boolean loop = false`
- Role: Tracks the loop flag.
- Description: Supports the loop operation used by the surrounding class.

### Methods

#### `private static void debug(String str)`
- Role: Performs debug.
- Description: Supports the debug operation used by the surrounding class.

#### `private Player(Indir<Resource> res, Thread waitfor)`
- Role: Performs player.
- Description: Supports the player operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static void play(Indir<Resource> res, boolean loop)`
- Role: Performs play.
- Description: Supports the play operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.

#### `public static void enable(boolean enabled)`
- Role: Performs enable.
- Description: Supports the enable operation used by the surrounding class.
