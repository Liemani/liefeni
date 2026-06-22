---
source: [Blake2b.java](../../../../src/haven/Blake2b.java)
created: 2026-06-13
updated: 2026-06-14
---

# Blake2b

Implements the BLAKE2b digest algorithm used by the client.

## Nested Types

### State

- Role: Holds the incremental BLAKE2b compression state.
- Description: Keeps chaining values, byte counters, flags, and the buffered input block.

## Members

### Constants

#### `public static final int BLOCKBYTES = 128`
- Role: Defines the compression block size.
- Description: BLAKE2b processes input in 128-byte blocks.
- Value: `128`

#### `public static final int OUTBYTES = 64`
- Role: Defines the default digest size.
- Description: The unqualified constructor returns a 64-byte digest.
- Value: `64`

#### `public static final int KEYBYTES = 64`
- Role: Defines the maximum key size.
- Description: Keyed hashing rejects keys longer than 64 bytes.
- Value: `64`

#### `public static final int SALTBYTES = 16`
- Role: Defines the salt field size.
- Description: The parameter block reserves 16 bytes for salt.
- Value: `16`

#### `public static final int PERSONALBYTES = 16`
- Role: Defines the personalization field size.
- Description: The parameter block reserves 16 bytes for personalization.
- Value: `16`

#### `private static final long IV[] =`
- Role: Stores the BLAKE2b initialization vector.
- Description: These are the fixed IV words from the BLAKE2b specification.
- Value: ``

#### `private static final byte Σ[][] =`
- Role: Stores the BLAKE2b message permutation schedule.
- Description: Each row defines one round's message word order.
- Value: ``

### Fields

#### `private final int digest_length`
- Role: Stores the requested digest length.
- Description: Controls how many bytes are returned from `digest()`.

#### `private final int key_length`
- Role: Stores the key length used for parameter packing.
- Description: Written into the parameter block when keyed mode is enabled.

#### `private final int fanout = 1, depth = 1`
- Role: Fixes the tree hashing fanout and depth.
- Description: This implementation uses the standard sequential mode parameters.

#### `private final int fanout = 1, depth = 1`
- Role: Caches the fanout value.
- Description: Caches the `fanout` value for reuse.

#### `private final int leaf_length = 0, node_offset = 0`
- Role: Leaves the tree leaf parameters unset.
- Description: Sequential hashing does not use tree leaves or node offsets here.

#### `private final int leaf_length = 0, node_offset = 0`
- Role: Caches the leaf length value.
- Description: Caches the `leaf_length` value for reuse.

#### `private final int xof_length = 0, node_depth = 0`
- Role: Leaves the extended-output and node-depth parameters unset.
- Description: These parameters stay zero for the sequential client hash use.

#### `private final int xof_length = 0, node_depth = 0`
- Role: Caches the xof length value.
- Description: Caches the `xof_length` value for reuse.

#### `private final int inner_length = 0`
- Role: Leaves the inner digest length unset.
- Description: Tree hashing support is not used by this implementation.

#### `private final byte[] salt = new byte[SALTBYTES]`
- Role: Stores the optional salt parameter.
- Description: Mixed into the parameter block when the caller supplies salt bytes.

#### `private final byte[] personal = new byte[PERSONALBYTES]`
- Role: Stores the optional personalization parameter.
- Description: Mixed into the parameter block when the caller supplies personalization bytes.

#### `private State zygote = null`
- Role: Stores the precomputed keyed initial state.
- Description: Used to clone the keyed digest setup without rebuilding it each time.

#### `private boolean first = true`
- Role: Tracks whether the initial unkeyed state has been handed out.
- Description: The first call to `get()` creates a fresh state, later calls clone the zygote.

#### `private final long[] h = new long[8]`
- Role: Caches the h value.
- Description: Caches the `h` value for reuse.

#### `private final long[] t = new long[2]`
- Role: Caches the t value.
- Description: Caches the `t` value for reuse.

#### `private final long[] f = new long[2]`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `private final byte[] buf = new byte[BLOCKBYTES]`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

#### `private final int outlen = digest_length`
- Role: Caches the outlen value.
- Description: Caches the `outlen` value for reuse.

#### `private int buflen = 0`
- Role: Caches the buflen value.
- Description: Caches the `buflen` value for reuse.

#### `private boolean last_node = false`
- Role: Tracks the last node flag.
- Description: Caches the last node value.

### Methods

#### `public Blake2b(int digest_length, byte[] key, byte[] salt, byte[] personal)`
- Role: Creates a new Blake2b instance.
- Description: Constructs the Blake2b instance from the supplied inputs.

#### `public Blake2b(byte[] key)`
- Role: Creates a new Blake2b instance.
- Description: Constructs the Blake2b instance from the supplied inputs.

#### `public Blake2b(int digest_length)`
- Role: Creates a new Blake2b instance.
- Description: Constructs the Blake2b instance from the supplied inputs.

#### `public Blake2b()`
- Role: Creates a new Blake2b instance.
- Description: Constructs the Blake2b instance from the supplied inputs.

#### `public int diglen()`
- Role: Returns the configured digest length.
- Description: Reports how many bytes this algorithm instance produces.

#### `public int blocklen()`
- Role: Returns the compression block size.
- Description: Reports the fixed 128-byte block length.

#### `public Digest get()`
- Role: Returns a new digest state.
- Description: Creates the first state lazily and then clones the keyed zygote for later callers.

#### `private byte[] packed()`
- Role: Builds the parameter block.
- Description: Encodes digest size, key size, tree parameters, salt, and personalization.

#### `private State()`
- Role: Creates a fresh compression state.
- Description: Seeds the chaining values from the IV and packed parameters.

#### `private State(State from)`
- Role: Copies an existing compression state.
- Description: Clones the chaining values, counters, flags, and buffered bytes.

#### `private void increment_counter(long inc)`
- Role: Advances the processed byte counter.
- Description: Updates the low and high counter words with overflow handling.

#### `private void set_lastnode()`
- Role: Marks the current node as the last leaf/node.
- Description: Sets the final-node flag used by tree hashing.

#### `private boolean is_lastblock()`
- Role: Checks whether finalization already happened.
- Description: Returns true after the final block flag has been set.

#### `private void set_lastblock()`
- Role: Marks the current input block as final.
- Description: Also propagates the last-node flag when needed.

#### `private void G(long[] m, long[] v, int r, int i, int a, int b, int c, int d)`
- Role: Performs one BLAKE2b mixing step.
- Description: Applies the G function to the selected message words and working state words.

#### `private void ROUND(long[] m, long[] v, int r)`
- Role: Runs one full compression round.
- Description: Applies the G function in both column and diagonal passes.

#### `private void compress(byte[] buf, int off)`
- Role: Mixes one input block into the chaining state.
- Description: Loads the message words, runs 12 rounds, and folds the result back into `h`.

#### `public Digest update(byte[] src, int off, int len)`
- Role: Absorbs more input bytes into the hash state.
- Description: Buffers partial blocks and compresses each full block as it becomes available.

#### `public byte[] digest()`
- Role: Finalizes the hash and returns the output bytes.
- Description: Pads the last block, compresses it, and serializes the chaining value.

#### `public State copy()`
- Role: Duplicates the current digest state.
- Description: Lets callers continue from the same partial hash without reprocessing input.
