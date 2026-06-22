---
source: [Pufferfish2.java](../../../../src/haven/Pufferfish2.java)
created: 2026-06-13
updated: 2026-06-14
---

# Pufferfish2

Represents the pufferfish2 Haven component.

## Nested Types

### Instance

- Role: Represents one parameterized Pufferfish2 hashing instance.
- Description: Stores the cost parameters and precomputed state for repeated hashing calls.

## Members

### Constants

#### `private static final Utils.BinAscii ENCODING = new Utils.Base64("./ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", '\0')`
- Role: Implements the encoding operation.
- Description: Implements the base64 operation.
- Value: `new Utils.Base64("./ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", '\0')`

#### `private static final long[] IV =`
- Role: Caches the iv value.
- Description: Caches the `IV` value for reuse.
- Value: ``

#### `private static final Digest.Algorithm DIGEST = Digest.SHA512`
- Role: Caches the digest value.
- Description: Caches the `DIGEST` value for reuse.
- Value: `Digest.SHA512`

#### `private static final int DIGEST_LENGTH = DIGEST.diglen()`
- Role: Implements the digest length operation.
- Description: Implements the diglen operation.
- Value: `DIGEST.diglen()`

#### `private static final int SBOX_N = 4`
- Role: Caches the sbox n value.
- Description: Caches the `SBOX_N` value for reuse.
- Value: `4`

### Fields

#### `private final int cost_t, cost_m`
- Role: Caches the cost m value.
- Description: Caches the `cost_m` value for reuse.

#### `private final int cost_t, cost_m`
- Role: Caches the cost m value.
- Description: Caches the `cost_m` value for reuse.

#### `private final int log2_sbox_sz, sbox_sz`
- Role: Caches the sbox sz value.
- Description: Caches the `sbox_sz` value for reuse.

#### `private final int log2_sbox_sz, sbox_sz`
- Role: Caches the sbox sz value.
- Description: Caches the `sbox_sz` value for reuse.

#### `private final long[][] S`
- Role: Caches the s value.
- Description: Caches the `S` value for reuse.

#### `private final long[] P = new long[18]`
- Role: Caches the p value.
- Description: Caches the `P` value for reuse.

#### `private long L = 0, R = 0`
- Role: Caches the l value.
- Description: Caches the `L` value for reuse.

#### `private long L = 0, R = 0`
- Role: Caches the l value.
- Description: Caches the `L` value for reuse.

#### `private long[] salt_u64`
- Role: Caches the salt u64 value.
- Description: Caches the `salt_u64` value for reuse.

### Methods

#### `private static long[] b2l(byte[] buf)`
- Role: Handles the b2l path.
- Description: Implements the b2l operation.

#### `private static byte[] l2b(long[] buf)`
- Role: Handles the l2b path.
- Description: Implements the l2b operation.

#### `private static byte[] HMAC(byte[] key, byte[] data)`
- Role: Handles the hmac path.
- Description: Implements the hmac operation.

#### `private byte[] HASH_SBOX(byte[] x)`
- Role: Handles the hash sbox path.
- Description: Implements the hash sbox operation.

#### `private long F(long x)`
- Role: Handles the f path.
- Description: Implements the f operation.

#### `private void ENCIPHER()`
- Role: Handles the encipher path.
- Description: Implements the encipher operation.

#### `private void EXPANDSTATE(long[] buf, long a, long b, int c, int d)`
- Role: Handles the expandstate path.
- Description: Implements the expandstate operation.

#### `private void EXPANDSTATE_NULL(long[] buf, int a, int b)`
- Role: Handles the expandstate null path.
- Description: Implements the expandstate null operation.

#### `private void ENCRYPT_P()`
- Role: Handles the encrypt p path.
- Description: Implements the encrypt p operation.

#### `private void ENCRYPT_S()`
- Role: Handles the encrypt s path.
- Description: Implements the encrypt s operation.

#### `private void REKEY(byte[] key)`
- Role: Handles the rekey path.
- Description: Implements the rekey operation.

#### `public Instance(int cost_t, int cost_m)`
- Role: Handles the instance path.
- Description: Implements the instance operation.

#### `public byte[] hash(byte[] key_r, byte[] salt_r)`
- Role: Handles the hash path.
- Description: Returns whether the h is present.

#### `public static byte[] hash(byte[] key, byte[] salt, int t, int m)`
- Role: Handles the hash path.
- Description: Returns whether the h is present.

#### `public static void main(String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.