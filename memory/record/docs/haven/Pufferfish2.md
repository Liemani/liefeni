---
source: [Pufferfish2.java](../../../src/haven/Pufferfish2.java)
created: 2026-06-13
updated: 2026-06-14
---

# Pufferfish2

Represents the pufferfish2 Haven component.

## Nested Types

### Instance

- Role: Represents instance within Pufferfish2.
- Description: Describes the nested instance type used by the enclosing class.

## Members

### Constants

#### `private static final Utils.BinAscii ENCODING = new Utils.Base64("./ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", '\0')`
- Role: Defines the shared encoding constant.
- Description: Shared constant used by the rest of the class.

#### `private static final long[] IV =`
- Role: Defines the shared pufferfish2 constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Digest.Algorithm DIGEST = Digest.SHA512`
- Role: Defines the shared digest constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int DIGEST_LENGTH = DIGEST.diglen()`
- Role: Defines the shared digest length constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int SBOX_N = 4`
- Role: Defines the shared sbox n constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final int cost_t, cost_m`
- Role: Stores the cost m value.
- Description: Backs the cached state for this file.

#### `private final int cost_t, cost_m`
- Role: Stores the cost m value.
- Description: Backs the cached state for this file.

#### `private final int log2_sbox_sz, sbox_sz`
- Role: Stores the sbox sz value.
- Description: Backs the cached state for this file.

#### `private final int log2_sbox_sz, sbox_sz`
- Role: Stores the sbox sz value.
- Description: Backs the cached state for this file.

#### `private final long[][] S`
- Role: Stores the s value.
- Description: Backs the cached state for this file.

#### `private final long[] P = new long[18]`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

#### `private long L = 0, R = 0`
- Role: Stores the l value.
- Description: Backs the cached state for this file.

#### `private long L = 0, R = 0`
- Role: Stores the l value.
- Description: Backs the cached state for this file.

#### `private long[] salt_u64`
- Role: Stores the salt u64 value.
- Description: Backs the cached state for this file.

### Methods

#### `private static long[] b2l(byte[] buf)`
- Role: Performs b2l.
- Description: Supports the b2l operation used by the surrounding class.

#### `private static byte[] l2b(long[] buf)`
- Role: Performs l2b.
- Description: Supports the l2b operation used by the surrounding class.

#### `private static byte[] HMAC(byte[] key, byte[] data)`
- Role: Performs hmac.
- Description: Supports the hmac operation used by the surrounding class.

#### `private byte[] HASH_SBOX(byte[] x)`
- Role: Performs hash sbox.
- Description: Supports the hash sbox operation used by the surrounding class.

#### `private long F(long x)`
- Role: Performs f.
- Description: Supports the f operation used by the surrounding class.

#### `private void ENCIPHER()`
- Role: Performs encipher.
- Description: Supports the encipher operation used by the surrounding class.

#### `private void EXPANDSTATE(long[] buf, long a, long b, int c, int d)`
- Role: Performs expandstate.
- Description: Supports the expandstate operation used by the surrounding class.

#### `private void EXPANDSTATE_NULL(long[] buf, int a, int b)`
- Role: Performs expandstate null.
- Description: Supports the expandstate null operation used by the surrounding class.

#### `private void ENCRYPT_P()`
- Role: Performs encrypt p.
- Description: Supports the encrypt p operation used by the surrounding class.

#### `private void ENCRYPT_S()`
- Role: Performs encrypt s.
- Description: Supports the encrypt s operation used by the surrounding class.

#### `private void REKEY(byte[] key)`
- Role: Performs rekey.
- Description: Supports the rekey operation used by the surrounding class.

#### `public Instance(int cost_t, int cost_m)`
- Role: Performs instance.
- Description: Supports the instance operation used by the surrounding class.

#### `public byte[] hash(byte[] key_r, byte[] salt_r)`
- Role: Performs hash.
- Description: Supports the hash operation used by the surrounding class.

#### `public static byte[] hash(byte[] key, byte[] salt, int t, int m)`
- Role: Performs hash.
- Description: Supports the hash operation used by the surrounding class.

#### `public static void main(String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.
