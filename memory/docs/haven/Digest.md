# Digest

This file documents the responsibilities and members of `Digest`.

## Meta

- Source: [Digest.java](../../../src/haven/Digest.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the digest Haven component.

## Members

### Constants

#### `public static final Algorithm MD5 = Builtin.alg("MD5", 16, 64)`
- Role: Defines the shared md5 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm SHA1 = Builtin.alg("SHA-1", 20, 64)`
- Role: Defines the shared sha1 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm SHA256 = Builtin.alg("SHA-256", 32, 64)`
- Role: Defines the shared sha256 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm SHA384 = Builtin.alg("SHA-384", 48, 128)`
- Role: Defines the shared sha384 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm SHA512 = Builtin.alg("SHA-512", 64, 128)`
- Role: Defines the shared sha512 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm SHA3_256 = Builtin.alg("SHA3-256", 32, 136)`
- Role: Defines the shared sha3 256 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm SHA3_384 = Builtin.alg("SHA3-384", 48, 104)`
- Role: Defines the shared sha3 384 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm SHA3_512 = Builtin.alg("SHA3-512", 64, 72)`
- Role: Defines the shared sha3 512 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm BLAKE2B = new Blake2b()`
- Role: Defines the shared blake2 b constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final MessageDigest md`
- Role: Holds the md state.
- Description: Backs the cached state for this file.

#### `public final Algorithm dig`
- Role: Holds the dig state.
- Description: Backs the cached state for this file.

#### `private final Digest inner, outer`
- Role: Holds the outer state.
- Description: Backs the cached state for this file.

#### `private final Digest inner, outer`
- Role: Holds the outer state.
- Description: Backs the cached state for this file.

### Methods

#### `public int diglen()`
- Role: Performs diglen.
- Description: Supports the diglen operation used by the surrounding class.

#### `public int blocklen()`
- Role: Performs blocklen.
- Description: Supports the blocklen operation used by the surrounding class.

#### `public Digest update(byte[] buf, int off, int len)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public default Digest update(byte[] part)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public byte[] digest()`
- Role: Performs digest.
- Description: Supports the digest operation used by the surrounding class.

#### `public Digest copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public default String hexdigest()`
- Role: Performs hexdigest.
- Description: Supports the hexdigest operation used by the surrounding class.

#### `public static byte[] hash(Algorithm alg, byte[]... parts)`
- Role: Performs hash.
- Description: Supports the hash operation used by the surrounding class.

#### `Builtin(MessageDigest md)`
- Role: Handles the builtin workflow.
- Description: Supports the builtin operation used by the surrounding class.

#### `public Digest update(byte[] buf, int off, int len)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public byte[] digest()`
- Role: Performs digest.
- Description: Supports the digest operation used by the surrounding class.

#### `public Digest copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `private static Algorithm alg(String name, int dsz, int bsz)`
- Role: Performs alg.
- Description: Supports the alg operation used by the surrounding class.

#### `private Digest addkey(Digest dig, byte[] key, byte mod)`
- Role: Performs addkey.
- Description: Supports the addkey operation used by the surrounding class.

#### `private HMAC(HMAC that)`
- Role: Performs hmac.
- Description: Supports the hmac operation used by the surrounding class.

#### `public HMAC(Algorithm dig, byte[] key)`
- Role: Performs hmac.
- Description: Supports the hmac operation used by the surrounding class.

#### `public Digest update(byte[] part, int off, int len)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public byte[] digest()`
- Role: Performs digest.
- Description: Supports the digest operation used by the surrounding class.

#### `public Digest copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public static Algorithm of(Algorithm dig, byte[] key)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static byte[] hkdf(Algorithm dig, byte[] salt, byte[] ikm, byte[] info, int len)`
- Role: Performs hkdf.
- Description: Supports the hkdf operation used by the surrounding class.

#### `public static byte[] pbkdf2(Algorithm prf, byte[] salt, int rounds, int len)`
- Role: Performs pbkdf2.
- Description: Supports the pbkdf2 operation used by the surrounding class.
