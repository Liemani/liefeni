# Pufferfish2

This file documents the responsibilities and members of `Pufferfish2`.

## Meta

- Source: [Pufferfish2.java](../../../src/haven/Pufferfish2.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a bitset or packing helper.

## Nested Types

### Instance

- Description: TODO

## Members

### Constants

#### `private static final Utils.BinAscii ENCODING = new Utils.Base64("./ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", '\0')`

- Description: TODO

#### `private static final long[] IV =`

- Description: TODO

#### `private static final Digest.Algorithm DIGEST = Digest.SHA512`

- Description: TODO

#### `private static final int DIGEST_LENGTH = DIGEST.diglen()`

- Description: TODO

#### `private static final int SBOX_N = 4`

- Description: TODO

### Fields

#### `private final int cost_t, cost_m`

- Description: TODO

#### `private final int cost_t, cost_m`

- Description: TODO

#### `private final int log2_sbox_sz, sbox_sz`

- Description: TODO

#### `private final int log2_sbox_sz, sbox_sz`

- Description: TODO

#### `private final long[][] S`

- Description: TODO

#### `private final long[] P = new long[18]`

- Description: TODO

#### `private long L = 0, R = 0`

- Description: TODO

#### `private long L = 0, R = 0`

- Description: TODO

#### `private long[] salt_u64`

- Description: TODO

### Methods

#### `private static long[] b2l(byte[] buf)`

- Description: TODO

#### `private static byte[] l2b(long[] buf)`

- Description: TODO

#### `private static byte[] HMAC(byte[] key, byte[] data)`

- Description: TODO

#### `private byte[] HASH_SBOX(byte[] x)`

- Description: TODO

#### `private long F(long x)`

- Description: TODO

#### `private void ENCIPHER()`

- Description: TODO

#### `private void EXPANDSTATE(long[] buf, long a, long b, int c, int d)`

- Description: TODO

#### `private void EXPANDSTATE_NULL(long[] buf, int a, int b)`

- Description: TODO

#### `private void ENCRYPT_P()`

- Description: TODO

#### `private void ENCRYPT_S()`

- Description: TODO

#### `private void REKEY(byte[] key)`

- Description: TODO

#### `public Instance(int cost_t, int cost_m)`

- Description: TODO

#### `public byte[] hash(byte[] key_r, byte[] salt_r)`

- Description: TODO

#### `public static byte[] hash(byte[] key, byte[] salt, int t, int m)`

- Description: TODO

#### `public static void main(String[] args)`

- Description: TODO
