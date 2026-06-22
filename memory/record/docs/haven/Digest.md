---
source: [Digest.java](../../../../src/haven/Digest.java)
created: 2026-06-13
updated: 2026-06-14
---

# Digest

Represents the digest Haven component.

## Members

### Constants

#### `public static final Algorithm MD5 = Builtin.alg("MD5", 16, 64)`
- Role: Implements the md5 operation.
- Description: Implements the alg operation.
- Value: `Builtin.alg("MD5", 16, 64)`

#### `public static final Algorithm SHA1 = Builtin.alg("SHA-1", 20, 64)`
- Role: Implements the sha1 operation.
- Description: Implements the alg operation.
- Value: `Builtin.alg("SHA-1", 20, 64)`

#### `public static final Algorithm SHA256 = Builtin.alg("SHA-256", 32, 64)`
- Role: Implements the sha256 operation.
- Description: Implements the alg operation.
- Value: `Builtin.alg("SHA-256", 32, 64)`

#### `public static final Algorithm SHA384 = Builtin.alg("SHA-384", 48, 128)`
- Role: Implements the sha384 operation.
- Description: Implements the alg operation.
- Value: `Builtin.alg("SHA-384", 48, 128)`

#### `public static final Algorithm SHA512 = Builtin.alg("SHA-512", 64, 128)`
- Role: Implements the sha512 operation.
- Description: Implements the alg operation.
- Value: `Builtin.alg("SHA-512", 64, 128)`

#### `public static final Algorithm SHA3_256 = Builtin.alg("SHA3-256", 32, 136)`
- Role: Implements the sha3 256 operation.
- Description: Implements the alg operation.
- Value: `Builtin.alg("SHA3-256", 32, 136)`

#### `public static final Algorithm SHA3_384 = Builtin.alg("SHA3-384", 48, 104)`
- Role: Implements the sha3 384 operation.
- Description: Implements the alg operation.
- Value: `Builtin.alg("SHA3-384", 48, 104)`

#### `public static final Algorithm SHA3_512 = Builtin.alg("SHA3-512", 64, 72)`
- Role: Implements the sha3 512 operation.
- Description: Implements the alg operation.
- Value: `Builtin.alg("SHA3-512", 64, 72)`

#### `public static final Algorithm BLAKE2B = new Blake2b()`
- Role: Implements the blake2 b operation.
- Description: Implements the blake2b operation.
- Value: `new Blake2b()`

### Fields

#### `private final MessageDigest md`
- Role: Caches the md value.
- Description: Caches the `md` value for reuse.

#### `public final Algorithm dig`
- Role: Caches the dig value.
- Description: Caches the `dig` value for reuse.

#### `private final Digest inner, outer`
- Role: Caches the outer value.
- Description: Caches the `outer` value for reuse.

#### `private final Digest inner, outer`
- Role: Caches the outer value.
- Description: Caches the `outer` value for reuse.

### Methods

#### `public int diglen()`
- Role: Handles the diglen path.
- Description: Implements the diglen operation.

#### `public int blocklen()`
- Role: Handles the blocklen path.
- Description: Implements the blocklen operation.

#### `public Digest update(byte[] buf, int off, int len)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public default Digest update(byte[] part)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public byte[] digest()`
- Role: Handles the digest path.
- Description: Implements the digest operation.

#### `public Digest copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public default String hexdigest()`
- Role: Handles the hexdigest path.
- Description: Implements the hexdigest operation.

#### `public static byte[] hash(Algorithm alg, byte[]... parts)`
- Role: Handles the hash path.
- Description: Returns whether the h is present.

#### `Builtin(MessageDigest md)`
- Role: Handles the builtin workflow.
- Description: Implements the builtin operation.

#### `public Digest update(byte[] buf, int off, int len)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public byte[] digest()`
- Role: Handles the digest path.
- Description: Implements the digest operation.

#### `public Digest copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `private static Algorithm alg(String name, int dsz, int bsz)`
- Role: Handles the alg path.
- Description: Implements the alg operation.

#### `private Digest addkey(Digest dig, byte[] key, byte mod)`
- Role: Handles the addkey path.
- Description: Adds the key.

#### `private HMAC(HMAC that)`
- Role: Handles the hmac path.
- Description: Implements the hmac operation.

#### `public HMAC(Algorithm dig, byte[] key)`
- Role: Handles the hmac path.
- Description: Implements the hmac operation.

#### `public Digest update(byte[] part, int off, int len)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public byte[] digest()`
- Role: Handles the digest path.
- Description: Implements the digest operation.

#### `public Digest copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public static Algorithm of(Algorithm dig, byte[] key)`
- Role: Builds a Digest value from the supplied components.
- Description: Builds a Digest value from the supplied components.

#### `public static byte[] hkdf(Algorithm dig, byte[] salt, byte[] ikm, byte[] info, int len)`
- Role: Handles the hkdf path.
- Description: Implements the hkdf operation.

#### `public static byte[] pbkdf2(Algorithm prf, byte[] salt, int rounds, int len)`
- Role: Handles the pbkdf2 path.
- Description: Implements the pbkdf2 operation.