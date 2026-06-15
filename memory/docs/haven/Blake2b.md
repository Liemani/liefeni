# Blake2b

This file documents the responsibilities and members of `Blake2b`.

## Meta

- Source: [Blake2b.java](../../../src/haven/Blake2b.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides BLAKE2b hashing support.

## Nested Types

### State

- Description: TODO

## Members

### Constants

#### `public static final int BLOCKBYTES = 128`

- Description: TODO

#### `public static final int OUTBYTES = 64`

- Description: TODO

#### `public static final int KEYBYTES = 64`

- Description: TODO

#### `public static final int SALTBYTES = 16`

- Description: TODO

#### `public static final int PERSONALBYTES = 16`

- Description: TODO

#### `private static final long IV[] =`

- Description: TODO

#### `private static final byte Σ[][] =`

- Description: TODO

### Fields

#### `private final int digest_length`

- Description: TODO

#### `private final int key_length`

- Description: TODO

#### `private final int fanout = 1, depth = 1`

- Description: TODO

#### `private final int fanout = 1, depth = 1`

- Description: TODO

#### `private final int leaf_length = 0, node_offset = 0`

- Description: TODO

#### `private final int leaf_length = 0, node_offset = 0`

- Description: TODO

#### `private final int xof_length = 0, node_depth = 0`

- Description: TODO

#### `private final int xof_length = 0, node_depth = 0`

- Description: TODO

#### `private final int inner_length = 0`

- Description: TODO

#### `private final byte[] salt = new byte[SALTBYTES]`

- Description: TODO

#### `private final byte[] personal = new byte[PERSONALBYTES]`

- Description: TODO

#### `private State zygote = null`

- Description: TODO

#### `private boolean first = true`

- Description: TODO

#### `private final long[] h = new long[8]`

- Description: TODO

#### `private final long[] t = new long[2]`

- Description: TODO

#### `private final long[] f = new long[2]`

- Description: TODO

#### `private final byte[] buf = new byte[BLOCKBYTES]`

- Description: TODO

#### `private final int outlen = digest_length`

- Description: TODO

#### `private int buflen = 0`

- Description: TODO

#### `private boolean last_node = false`

- Description: TODO

### Methods

#### `public Blake2b(int digest_length, byte[] key, byte[] salt, byte[] personal)`

- Description: TODO

#### `public Blake2b(byte[] key)`

- Description: TODO

#### `public Blake2b(int digest_length)`

- Description: TODO

#### `public Blake2b()`

- Description: TODO

#### `public int diglen()`

- Description: TODO

#### `public int blocklen()`

- Description: TODO

#### `public Digest get()`

- Description: TODO

#### `private byte[] packed()`

- Description: TODO

#### `private State()`

- Description: TODO

#### `private State(State from)`

- Description: TODO

#### `private void increment_counter(long inc)`

- Description: TODO

#### `private void set_lastnode()`

- Description: TODO

#### `private boolean is_lastblock()`

- Description: TODO

#### `private void set_lastblock()`

- Description: TODO

#### `private void G(long[] m, long[] v, int r, int i, int a, int b, int c, int d)`

- Description: TODO

#### `private void ROUND(long[] m, long[] v, int r)`

- Description: TODO

#### `private void compress(byte[] buf, int off)`

- Description: TODO

#### `public Digest update(byte[] src, int off, int len)`

- Description: TODO

#### `public byte[] digest()`

- Description: TODO

#### `public State copy()`

- Description: TODO
