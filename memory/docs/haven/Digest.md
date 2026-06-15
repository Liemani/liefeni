# Digest

This file documents the responsibilities and members of `Digest`.

## Meta

- Source: [Digest.java](../../../src/haven/Digest.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides message digest support.

## Members

### Constants

#### `public static final Algorithm MD5 = Builtin.alg("MD5", 16, 64)`

- Description: TODO

#### `public static final Algorithm SHA1 = Builtin.alg("SHA-1", 20, 64)`

- Description: TODO

#### `public static final Algorithm SHA256 = Builtin.alg("SHA-256", 32, 64)`

- Description: TODO

#### `public static final Algorithm SHA384 = Builtin.alg("SHA-384", 48, 128)`

- Description: TODO

#### `public static final Algorithm SHA512 = Builtin.alg("SHA-512", 64, 128)`

- Description: TODO

#### `public static final Algorithm SHA3_256 = Builtin.alg("SHA3-256", 32, 136)`

- Description: TODO

#### `public static final Algorithm SHA3_384 = Builtin.alg("SHA3-384", 48, 104)`

- Description: TODO

#### `public static final Algorithm SHA3_512 = Builtin.alg("SHA3-512", 64, 72)`

- Description: TODO

#### `public static final Algorithm BLAKE2B = new Blake2b()`

- Description: TODO

### Fields

#### `private final MessageDigest md`

- Description: TODO

#### `public final Algorithm dig`

- Description: TODO

#### `private final Digest inner, outer`

- Description: TODO

#### `private final Digest inner, outer`

- Description: TODO

### Methods

#### `public int diglen()`

- Description: TODO

#### `public int blocklen()`

- Description: TODO

#### `public Digest update(byte[] buf, int off, int len)`

- Description: TODO

#### `public default Digest update(byte[] part)`

- Description: TODO

#### `public byte[] digest()`

- Description: TODO

#### `public Digest copy()`

- Description: TODO

#### `public default String hexdigest()`

- Description: TODO

#### `public static byte[] hash(Algorithm alg, byte[]... parts)`

- Description: TODO

#### `Builtin(MessageDigest md)`

- Description: TODO

#### `public Digest update(byte[] buf, int off, int len)`

- Description: TODO

#### `public byte[] digest()`

- Description: TODO

#### `public Digest copy()`

- Description: TODO

#### `private static Algorithm alg(String name, int dsz, int bsz)`

- Description: TODO

#### `private Digest addkey(Digest dig, byte[] key, byte mod)`

- Description: TODO

#### `private HMAC(HMAC that)`

- Description: TODO

#### `public HMAC(Algorithm dig, byte[] key)`

- Description: TODO

#### `public Digest update(byte[] part, int off, int len)`

- Description: TODO

#### `public byte[] digest()`

- Description: TODO

#### `public Digest copy()`

- Description: TODO

#### `public static Algorithm of(Algorithm dig, byte[] key)`

- Description: TODO

#### `public static byte[] hkdf(Algorithm dig, byte[] salt, byte[] ikm, byte[] info, int len)`

- Description: TODO

#### `public static byte[] pbkdf2(Algorithm prf, byte[] salt, int rounds, int len)`

- Description: TODO
