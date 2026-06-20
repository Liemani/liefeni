---
source: [Blake2b.java](../../../src/haven/Blake2b.java)
created: 2026-06-13
updated: 2026-06-14
---

# Blake2b

Represents the blake2b Haven component.

## Nested Types

### State

- Role: Represents state within Blake2b.
- Description: Describes the nested state type used by the enclosing class.

## Members

### Constants

#### `public static final int BLOCKBYTES = 128`
- Role: Defines the shared blockbytes constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int OUTBYTES = 64`
- Role: Defines the shared outbytes constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int KEYBYTES = 64`
- Role: Defines the shared keybytes constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int SALTBYTES = 16`
- Role: Defines the shared saltbytes constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int PERSONALBYTES = 16`
- Role: Defines the shared personalbytes constant.
- Description: Shared constant used by the rest of the class.

#### `private static final long IV[] =`
- Role: Defines the shared blake2b constant.
- Description: Shared constant used by the rest of the class.

#### `private static final byte Σ[][] =`
- Role: Defines the shared blake2b constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final int digest_length`
- Role: Stores the digest length value.
- Description: Backs the cached state for this file.

#### `private final int key_length`
- Role: Stores the key length value.
- Description: Backs the cached state for this file.

#### `private final int fanout = 1, depth = 1`
- Role: Stores the fanout value.
- Description: Backs the cached state for this file.

#### `private final int fanout = 1, depth = 1`
- Role: Stores the fanout value.
- Description: Backs the cached state for this file.

#### `private final int leaf_length = 0, node_offset = 0`
- Role: Stores the leaf length value.
- Description: Backs the cached state for this file.

#### `private final int leaf_length = 0, node_offset = 0`
- Role: Stores the leaf length value.
- Description: Backs the cached state for this file.

#### `private final int xof_length = 0, node_depth = 0`
- Role: Stores the xof length value.
- Description: Backs the cached state for this file.

#### `private final int xof_length = 0, node_depth = 0`
- Role: Stores the xof length value.
- Description: Backs the cached state for this file.

#### `private final int inner_length = 0`
- Role: Stores the inner length value.
- Description: Backs the cached state for this file.

#### `private final byte[] salt = new byte[SALTBYTES]`
- Role: Stores the salt value.
- Description: Backs the cached state for this file.

#### `private final byte[] personal = new byte[PERSONALBYTES]`
- Role: Stores the personal value.
- Description: Backs the cached state for this file.

#### `private State zygote = null`
- Role: Holds the zygote state.
- Description: Backs the cached state for this file.

#### `private boolean first = true`
- Role: Tracks the first flag.
- Description: Supports the first operation used by the surrounding class.

#### `private final long[] h = new long[8]`
- Role: Stores the h value.
- Description: Backs the cached state for this file.

#### `private final long[] t = new long[2]`
- Role: Stores the t value.
- Description: Backs the cached state for this file.

#### `private final long[] f = new long[2]`
- Role: Stores the f value.
- Description: Backs the cached state for this file.

#### `private final byte[] buf = new byte[BLOCKBYTES]`
- Role: Stores the buf value.
- Description: Backs the cached state for this file.

#### `private final int outlen = digest_length`
- Role: Stores the outlen value.
- Description: Backs the cached state for this file.

#### `private int buflen = 0`
- Role: Stores the buflen value.
- Description: Backs the cached state for this file.

#### `private boolean last_node = false`
- Role: Tracks the last node flag.
- Description: Supports the last node operation used by the surrounding class.

### Methods

#### `public Blake2b(int digest_length, byte[] key, byte[] salt, byte[] personal)`
- Role: Creates a new Blake2b instance.
- Description: Constructs the instance and initializes its default state.

#### `public Blake2b(byte[] key)`
- Role: Creates a new Blake2b instance.
- Description: Constructs the instance and initializes its default state.

#### `public Blake2b(int digest_length)`
- Role: Creates a new Blake2b instance.
- Description: Constructs the instance and initializes its default state.

#### `public Blake2b()`
- Role: Creates a new Blake2b instance.
- Description: Constructs the instance and initializes its default state.

#### `public int diglen()`
- Role: Performs diglen.
- Description: Supports the diglen operation used by the surrounding class.

#### `public int blocklen()`
- Role: Performs blocklen.
- Description: Supports the blocklen operation used by the surrounding class.

#### `public Digest get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private byte[] packed()`
- Role: Performs packed.
- Description: Supports the packed operation used by the surrounding class.

#### `private State()`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `private State(State from)`
- Role: Performs state.
- Description: Supports the state operation used by the surrounding class.

#### `private void increment_counter(long inc)`
- Role: Performs increment counter.
- Description: Supports the increment counter operation used by the surrounding class.

#### `private void set_lastnode()`
- Role: Sets the lastnode.
- Description: Mutates the owning object to keep runtime state in sync.

#### `private boolean is_lastblock()`
- Role: Checks whether the lastblock.
- Description: Returns a boolean result for the described condition.

#### `private void set_lastblock()`
- Role: Sets the lastblock.
- Description: Mutates the owning object to keep runtime state in sync.

#### `private void G(long[] m, long[] v, int r, int i, int a, int b, int c, int d)`
- Role: Performs g.
- Description: Supports the g operation used by the surrounding class.

#### `private void ROUND(long[] m, long[] v, int r)`
- Role: Performs round.
- Description: Supports the round operation used by the surrounding class.

#### `private void compress(byte[] buf, int off)`
- Role: Performs compress.
- Description: Supports the compress operation used by the surrounding class.

#### `public Digest update(byte[] src, int off, int len)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public byte[] digest()`
- Role: Performs digest.
- Description: Supports the digest operation used by the surrounding class.

#### `public State copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.
