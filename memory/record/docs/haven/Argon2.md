---
source: [Argon2.java](../../../../src/haven/Argon2.java)
created: 2026-06-13
updated: 2026-06-14
---

# Argon2

Represents the argon2 Haven component.

## Nested Types

### Instance

- Role: Represents instance within Argon2.
- Description: Describes the nested instance type used by the enclosing class.

### Type

- Role: Represents type within Argon2.
- Description: Describes the nested type type used by the enclosing class.

### Version

- Role: Represents version within Argon2.
- Description: Describes the nested version type used by the enclosing class.

## Members

### Constants

#### `private static final int SYNC_POINTS = 4`
- Role: Caches the sync points value.
- Description: Caches the `SYNC_POINTS` value for reuse.
- Value: `4`

#### `private static final int BLOCK_SIZE = 1024`
- Role: Caches the block size value.
- Description: Caches the `BLOCK_SIZE` value for reuse.
- Value: `1024`

#### `private static final int PREHASH_DIGEST_LENGTH = 64`
- Role: Caches the prehash digest length value.
- Description: Caches the `PREHASH_DIGEST_LENGTH` value for reuse.
- Value: `64`

#### `private static final int PREHASH_SEED_LENGTH = 72`
- Role: Caches the prehash seed length value.
- Description: Caches the `PREHASH_SEED_LENGTH` value for reuse.
- Value: `72`

#### `private static final int N = BLOCK_SIZE / 8`
- Role: Caches the n value.
- Description: Caches the `N` value for reuse.
- Value: `BLOCK_SIZE / 8`

#### `private static final long[] zero = new long[N]`
- Role: Caches the zero value.
- Description: Caches the `zero` value for reuse.
- Value: `new long[N]`

### Fields

#### `private Type type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `private int t, m, p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `private int t, m, p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `private int t, m, p`
- Role: Caches the p value.
- Description: Caches the `p` value for reuse.

#### `private Version version = Version.V13`
- Role: Caches the version value.
- Description: Caches the `version` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private final int lanes, passes, m_cost`
- Role: Caches the m cost value.
- Description: Caches the `m_cost` value for reuse.

#### `private final int lanes, passes, m_cost`
- Role: Caches the m cost value.
- Description: Caches the `m_cost` value for reuse.

#### `private final int lanes, passes, m_cost`
- Role: Caches the m cost value.
- Description: Caches the `m_cost` value for reuse.

#### `private final int outlen`
- Role: Caches the outlen value.
- Description: Caches the `outlen` value for reuse.

#### `private final int memory_blocks, segment_length, lane_length`
- Role: Caches the lane length value.
- Description: Caches the `lane_length` value for reuse.

#### `private final int memory_blocks, segment_length, lane_length`
- Role: Caches the lane length value.
- Description: Caches the `lane_length` value for reuse.

#### `private final int memory_blocks, segment_length, lane_length`
- Role: Caches the lane length value.
- Description: Caches the `lane_length` value for reuse.

#### `private final long[][] memory`
- Role: Caches the memory value.
- Description: Caches the `memory` value for reuse.

### Methods

#### `Type(int id)`
- Role: Handles the type workflow.
- Description: Implements the type operation.

#### `Version(int id)`
- Role: Handles the version workflow.
- Description: Implements the version operation.

#### `public Argon2(Type type, int t, int m, int p)`
- Role: Creates a new Argon2 instance.
- Description: Constructs the Argon2 instance from the supplied inputs.

#### `private Instance(int outlen)`
- Role: Handles the instance path.
- Description: Implements the instance operation.

#### `private void copy_block(long[] dst, long[] src)`
- Role: Handles the copy block path.
- Description: Implements the copy block operation.

#### `private void xor_block(long[] dst, long[] src)`
- Role: Handles the xor block path.
- Description: Implements the xor block operation.

#### `private void load_block(long[] block, byte[] bytes)`
- Role: Returns the block.
- Description: Loads the block.

#### `private void store_block(long[] block, byte[] bytes)`
- Role: Handles the store block path.
- Description: Implements the store block operation.

#### `private void blake2b_long(byte[] out, int outoff, int outlen, byte[] in, int inoff, int inlen)`
- Role: Handles the blake2b long path.
- Description: Implements the blake2b long operation.

#### `private byte[] initial_hash(byte[] key, byte[] salt)`
- Role: Handles the initial hash path.
- Description: Implements the initial hash operation.

#### `private void fill_first_blocks(byte[] blockhash)`
- Role: Handles the fill first blocks path.
- Description: Implements the fill first blocks operation.

#### `private long fBlaMka(long x, long y)`
- Role: Handles the f bla mka path.
- Description: Implements the f bla mka operation.

#### `private void G(long[] B, int a, int b, int c, int d)`
- Role: Handles the g path.
- Description: Implements the g operation.

#### `private void BLAKE2_ROUND_NOMSG(long[] B, int i0, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15)`
- Role: Handles the blake2 round nomsg path.
- Description: Implements the blake2 round nomsg operation.

#### `private void fill_block(long[] prev_block, long[] ref_block, long[] next_block, boolean with_xor)`
- Role: Handles the fill block path.
- Description: Implements the fill block operation.

#### `private void next_addresses(long[] address_block, long[] input_block)`
- Role: Handles the next addresses path.
- Description: Implements the next addresses operation.

#### `private int index_alpha(int pass, int slice, int lane, int index, long pseudo_rand, boolean same_lane)`
- Role: Handles the index alpha path.
- Description: Implements the index alpha operation.

#### `private void fill_segment(int pass, int slice, int lane)`
- Role: Handles the fill segment path.
- Description: Implements the fill segment operation.

#### `private byte[] phinalize()`
- Role: Handles the phinalize path.
- Description: Implements the phinalize operation.

#### `private void fill_memory_blocks()`
- Role: Handles the fill memory blocks path.
- Description: Implements the fill memory blocks operation.

#### `public byte[] hash(byte[] key, byte[] salt)`
- Role: Handles the hash path.
- Description: Returns whether the h is present.

#### `public byte[] hash(byte[] key, byte[] salt, int len)`
- Role: Handles the hash path.
- Description: Returns whether the h is present.

#### `public static void main(String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.