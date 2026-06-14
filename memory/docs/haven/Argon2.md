# Argon2

## Meta

- Source: [Argon2.java](../../../src/haven/Argon2.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides Argon2 hashing support.

## Code Members

### Member Index

#### Constants

- [SYNC_POINTS](#member-1)
- [BLOCK_SIZE](#member-2)
- [PREHASH_DIGEST_LENGTH](#member-3)
- [PREHASH_SEED_LENGTH](#member-4)
- [N](#member-5)

#### Fields

- [type](#member-6)
- [t](#member-7)
- [m](#member-8)
- [p](#member-9)
- [version](#member-10)
- [id](#member-11)
- [id](#member-13)
- [zero](#member-15)
- [lanes](#member-16)
- [passes](#member-17)
- [m_cost](#member-18)
- [outlen](#member-19)
- [memory_blocks](#member-20)
- [segment_length](#member-21)
- [lane_length](#member-22)
- [memory](#member-23)

#### Methods

- [Type(int id)](#member-12)
- [Version(int id)](#member-14)
- [Instance(int outlen)](#member-24)
- [copy_block(long[] dst, long[] src)](#member-25)
- [xor_block(long[] dst, long[] src)](#member-26)
- [load_block(long[] block, byte[] bytes)](#member-27)
- [store_block(long[] block, byte[] bytes)](#member-28)
- [blake2b_long(byte[] out, int outoff, int outlen, byte[] in, int inoff, int inlen)](#member-29)
- [initial_hash(byte[] key, byte[] salt)](#member-30)
- [fill_first_blocks(byte[] blockhash)](#member-31)
- [fBlaMka(long x, long y)](#member-32)
- [G(long[] B, int a, int b, int c, int d)](#member-33)
- [BLAKE2_ROUND_NOMSG(long[] B, int i0, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15)](#member-34)
- [fill_block(long[] prev_block, long[] ref_block, long[] next_block, boolean with_xor)](#member-35)
- [next_addresses(long[] address_block, long[] input_block)](#member-36)
- [index_alpha(int pass, int slice, int lane, int index, long pseudo_rand, boolean same_lane)](#member-37)
- [fill_segment(int pass, int slice, int lane)](#member-38)
- [phinalize()](#member-39)
- [fill_memory_blocks()](#member-40)
- [hash(byte[] key, byte[] salt)](#member-41)
- [hash(byte[] key, byte[] salt, int len)](#member-42)
- [main(String[] args)](#member-43)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `SYNC_POINTS`

- Description: TODO

<a id="member-2"></a>
##### `BLOCK_SIZE`

- Description: TODO

<a id="member-3"></a>
##### `PREHASH_DIGEST_LENGTH`

- Description: TODO

<a id="member-4"></a>
##### `PREHASH_SEED_LENGTH`

- Description: TODO

<a id="member-5"></a>
##### `N`

- Description: TODO

#### Fields

<a id="member-6"></a>
##### `type`

- Description: TODO

<a id="member-7"></a>
##### `t`

- Description: TODO

<a id="member-8"></a>
##### `m`

- Description: TODO

<a id="member-9"></a>
##### `p`

- Description: TODO

<a id="member-10"></a>
##### `version`

- Description: TODO

<a id="member-11"></a>
##### `id`

- Description: TODO

<a id="member-13"></a>
##### `id`

- Description: TODO

<a id="member-15"></a>
##### `zero`

- Description: TODO

<a id="member-16"></a>
##### `lanes`

- Description: TODO

<a id="member-17"></a>
##### `passes`

- Description: TODO

<a id="member-18"></a>
##### `m_cost`

- Description: TODO

<a id="member-19"></a>
##### `outlen`

- Description: TODO

<a id="member-20"></a>
##### `memory_blocks`

- Description: TODO

<a id="member-21"></a>
##### `segment_length`

- Description: TODO

<a id="member-22"></a>
##### `lane_length`

- Description: TODO

<a id="member-23"></a>
##### `memory`

- Description: TODO

#### Methods

<a id="member-12"></a>
##### `Type(int id)`

- Description: TODO

<a id="member-14"></a>
##### `Version(int id)`

- Description: TODO

<a id="member-24"></a>
##### `Instance(int outlen)`

- Description: TODO

<a id="member-25"></a>
##### `copy_block(long[] dst, long[] src)`

- Description: TODO

<a id="member-26"></a>
##### `xor_block(long[] dst, long[] src)`

- Description: TODO

<a id="member-27"></a>
##### `load_block(long[] block, byte[] bytes)`

- Description: TODO

<a id="member-28"></a>
##### `store_block(long[] block, byte[] bytes)`

- Description: TODO

<a id="member-29"></a>
##### `blake2b_long(byte[] out, int outoff, int outlen, byte[] in, int inoff, int inlen)`

- Description: TODO

<a id="member-30"></a>
##### `initial_hash(byte[] key, byte[] salt)`

- Description: TODO

<a id="member-31"></a>
##### `fill_first_blocks(byte[] blockhash)`

- Description: TODO

<a id="member-32"></a>
##### `fBlaMka(long x, long y)`

- Description: TODO

<a id="member-33"></a>
##### `G(long[] B, int a, int b, int c, int d)`

- Description: TODO

<a id="member-34"></a>
##### `BLAKE2_ROUND_NOMSG(long[] B, int i0, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15)`

- Description: TODO

<a id="member-35"></a>
##### `fill_block(long[] prev_block, long[] ref_block, long[] next_block, boolean with_xor)`

- Description: TODO

<a id="member-36"></a>
##### `next_addresses(long[] address_block, long[] input_block)`

- Description: TODO

<a id="member-37"></a>
##### `index_alpha(int pass, int slice, int lane, int index, long pseudo_rand, boolean same_lane)`

- Description: TODO

<a id="member-38"></a>
##### `fill_segment(int pass, int slice, int lane)`

- Description: TODO

<a id="member-39"></a>
##### `phinalize()`

- Description: TODO

<a id="member-40"></a>
##### `fill_memory_blocks()`

- Description: TODO

<a id="member-41"></a>
##### `hash(byte[] key, byte[] salt)`

- Description: TODO

<a id="member-42"></a>
##### `hash(byte[] key, byte[] salt, int len)`

- Description: TODO

<a id="member-43"></a>
##### `main(String[] args)`

- Description: TODO
