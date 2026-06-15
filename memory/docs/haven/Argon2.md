# Argon2

This file documents the responsibilities and members of `Argon2`.

## Meta

- Source: [Argon2.java](../../../src/haven/Argon2.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides Argon2 hashing support.

## Nested Types

### Instance

- Description: TODO

### Type

- Description: TODO

### Version

- Description: TODO

## Members

### Constants

#### `private static final int SYNC_POINTS = 4`

- Description: TODO

#### `private static final int BLOCK_SIZE = 1024`

- Description: TODO

#### `private static final int PREHASH_DIGEST_LENGTH = 64`

- Description: TODO

#### `private static final int PREHASH_SEED_LENGTH = 72`

- Description: TODO

#### `private static final int N = BLOCK_SIZE / 8`

- Description: TODO

#### `private static final long[] zero = new long[N]`

- Description: TODO

### Fields

#### `private Type type`

- Description: TODO

#### `private int t, m, p`

- Description: TODO

#### `private int t, m, p`

- Description: TODO

#### `private int t, m, p`

- Description: TODO

#### `private Version version = Version.V13`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `private final int lanes, passes, m_cost`

- Description: TODO

#### `private final int lanes, passes, m_cost`

- Description: TODO

#### `private final int lanes, passes, m_cost`

- Description: TODO

#### `private final int outlen`

- Description: TODO

#### `private final int memory_blocks, segment_length, lane_length`

- Description: TODO

#### `private final int memory_blocks, segment_length, lane_length`

- Description: TODO

#### `private final int memory_blocks, segment_length, lane_length`

- Description: TODO

#### `private final long[][] memory`

- Description: TODO

### Methods

#### `Type(int id)`

- Description: TODO

#### `Version(int id)`

- Description: TODO

#### `public Argon2(Type type, int t, int m, int p)`

- Description: TODO

#### `private Instance(int outlen)`

- Description: TODO

#### `private void copy_block(long[] dst, long[] src)`

- Description: TODO

#### `private void xor_block(long[] dst, long[] src)`

- Description: TODO

#### `private void load_block(long[] block, byte[] bytes)`

- Description: TODO

#### `private void store_block(long[] block, byte[] bytes)`

- Description: TODO

#### `private void blake2b_long(byte[] out, int outoff, int outlen, byte[] in, int inoff, int inlen)`

- Description: TODO

#### `private byte[] initial_hash(byte[] key, byte[] salt)`

- Description: TODO

#### `private void fill_first_blocks(byte[] blockhash)`

- Description: TODO

#### `private long fBlaMka(long x, long y)`

- Description: TODO

#### `private void G(long[] B, int a, int b, int c, int d)`

- Description: TODO

#### `private void BLAKE2_ROUND_NOMSG(long[] B, int i0, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15)`

- Description: TODO

#### `private void fill_block(long[] prev_block, long[] ref_block, long[] next_block, boolean with_xor)`

- Description: TODO

#### `private void next_addresses(long[] address_block, long[] input_block)`

- Description: TODO

#### `private int index_alpha(int pass, int slice, int lane, int index, long pseudo_rand, boolean same_lane)`

- Description: TODO

#### `private void fill_segment(int pass, int slice, int lane)`

- Description: TODO

#### `private byte[] phinalize()`

- Description: TODO

#### `private void fill_memory_blocks()`

- Description: TODO

#### `public byte[] hash(byte[] key, byte[] salt)`

- Description: TODO

#### `public byte[] hash(byte[] key, byte[] salt, int len)`

- Description: TODO

#### `public static void main(String[] args)`

- Description: TODO
