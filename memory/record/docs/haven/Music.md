---
source: [Music.java](../../../../src/haven/Music.java)
created: 2026-06-13
updated: 2026-06-14
---

# Music

Represents the music Haven component.

## Nested Types

### Player

- Role: Plays one music track in the background.
- Description: Worker thread that loads and streams a music resource until playback completes.

## Members

### Constants

### Fields

#### `private static Player player`
- Role: Caches the player value.
- Description: Caches the `player` value for reuse.

#### `public static boolean enabled = true`
- Role: Tracks whether enabled is enabled.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static boolean debug = false`
- Role: Tracks the debug flag.
- Description: Caches the `debug` value for reuse.

#### `private Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `private Thread waitfor`
- Role: Caches the waitfor value.
- Description: Caches the `waitfor` value for reuse.

#### `private Sequencer seq`
- Role: Caches the seq value.
- Description: Caches the `seq` value for reuse.

#### `private Synthesizer synth`
- Role: Caches the synth value.
- Description: Caches the `synth` value for reuse.

#### `private boolean done`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `private boolean loop = false`
- Role: Tracks the loop flag.
- Description: Caches the `loop` value for reuse.

### Methods

#### `private static void debug(String str)`
- Role: Handles the debug path.
- Description: Implements the debug operation.

#### `private Player(Indir<Resource> res, Thread waitfor)`
- Role: Handles the player path.
- Description: Implements the player operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public static void play(Indir<Resource> res, boolean loop)`
- Role: Handles the play path.
- Description: Implements the play operation.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.

#### `public static void enable(boolean enabled)`
- Role: Handles the enable path.
- Description: Implements the enable operation.