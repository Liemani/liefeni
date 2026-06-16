# Argon2

This file documents the responsibilities and members of `Argon2`.

## Meta

- Source: [Argon2.java](../../../src/haven/Argon2.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Role: Defines the shared sync points constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int BLOCK_SIZE = 1024`
- Role: Defines the shared block size constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int PREHASH_DIGEST_LENGTH = 64`
- Role: Defines the shared prehash digest length constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int PREHASH_SEED_LENGTH = 72`
- Role: Defines the shared prehash seed length constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int N = BLOCK_SIZE / 8`
- Role: Defines the shared n constant.
- Description: Shared constant used by the rest of the class.

#### `private static final long[] zero = new long[N]`
- Role: Defines the shared zero constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private Type type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `private int t, m, p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `private int t, m, p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `private int t, m, p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `private Version version = Version.V13`
- Role: Holds the version state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private final int lanes, passes, m_cost`
- Role: Stores the m cost value.
- Description: Backs the cached state for this file.

#### `private final int lanes, passes, m_cost`
- Role: Stores the m cost value.
- Description: Backs the cached state for this file.

#### `private final int lanes, passes, m_cost`
- Role: Stores the m cost value.
- Description: Backs the cached state for this file.

#### `private final int outlen`
- Role: Stores the outlen value.
- Description: Backs the cached state for this file.

#### `private final int memory_blocks, segment_length, lane_length`
- Role: Stores the lane length value.
- Description: Backs the cached state for this file.

#### `private final int memory_blocks, segment_length, lane_length`
- Role: Stores the lane length value.
- Description: Backs the cached state for this file.

#### `private final int memory_blocks, segment_length, lane_length`
- Role: Stores the lane length value.
- Description: Backs the cached state for this file.

#### `private final long[][] memory`
- Role: Stores the memory value.
- Description: Backs the cached state for this file.

### Methods

#### `Type(int id)`
- Role: Handles the type workflow.
- Description: Supports the type operation used by the surrounding class.

#### `Version(int id)`
- Role: Handles the version workflow.
- Description: Supports the version operation used by the surrounding class.

#### `public Argon2(Type type, int t, int m, int p)`
- Role: Creates a new Argon2 instance.
- Description: Constructs the instance and initializes its default state.

#### `private Instance(int outlen)`
- Role: Performs instance.
- Description: Supports the instance operation used by the surrounding class.

#### `private void copy_block(long[] dst, long[] src)`
- Role: Performs copy block.
- Description: Supports the copy block operation used by the surrounding class.

#### `private void xor_block(long[] dst, long[] src)`
- Role: Performs xor block.
- Description: Supports the xor block operation used by the surrounding class.

#### `private void load_block(long[] block, byte[] bytes)`
- Role: Returns the block.
- Description: Exposes the requested value without mutating state.

#### `private void store_block(long[] block, byte[] bytes)`
- Role: Performs store block.
- Description: Supports the store block operation used by the surrounding class.

#### `private void blake2b_long(byte[] out, int outoff, int outlen, byte[] in, int inoff, int inlen)`
- Role: Performs blake2b long.
- Description: Supports the blake2b long operation used by the surrounding class.

#### `private byte[] initial_hash(byte[] key, byte[] salt)`
- Role: Performs initial hash.
- Description: Supports the initial hash operation used by the surrounding class.

#### `private void fill_first_blocks(byte[] blockhash)`
- Role: Performs fill first blocks.
- Description: Supports the fill first blocks operation used by the surrounding class.

#### `private long fBlaMka(long x, long y)`
- Role: Performs f bla mka.
- Description: Supports the f bla mka operation used by the surrounding class.

#### `private void G(long[] B, int a, int b, int c, int d)`
- Role: Performs g.
- Description: Supports the g operation used by the surrounding class.

#### `private void BLAKE2_ROUND_NOMSG(long[] B, int i0, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15)`
- Role: Performs blake2 round nomsg.
- Description: Supports the blake2 round nomsg operation used by the surrounding class.

#### `private void fill_block(long[] prev_block, long[] ref_block, long[] next_block, boolean with_xor)`
- Role: Performs fill block.
- Description: Supports the fill block operation used by the surrounding class.

#### `private void next_addresses(long[] address_block, long[] input_block)`
- Role: Performs next addresses.
- Description: Supports the next addresses operation used by the surrounding class.

#### `private int index_alpha(int pass, int slice, int lane, int index, long pseudo_rand, boolean same_lane)`
- Role: Performs index alpha.
- Description: Supports the index alpha operation used by the surrounding class.

#### `private void fill_segment(int pass, int slice, int lane)`
- Role: Performs fill segment.
- Description: Supports the fill segment operation used by the surrounding class.

#### `private byte[] phinalize()`
- Role: Performs phinalize.
- Description: Supports the phinalize operation used by the surrounding class.

#### `private void fill_memory_blocks()`
- Role: Performs fill memory blocks.
- Description: Supports the fill memory blocks operation used by the surrounding class.

#### `public byte[] hash(byte[] key, byte[] salt)`
- Role: Performs hash.
- Description: Supports the hash operation used by the surrounding class.

#### `public byte[] hash(byte[] key, byte[] salt, int len)`
- Role: Performs hash.
- Description: Supports the hash operation used by the surrounding class.

#### `public static void main(String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.
