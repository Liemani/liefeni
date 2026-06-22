---
source: [SignKey.java](../../../../src/haven/SignKey.java)
created: 2026-06-13
updated: 2026-06-14
---

# SignKey

Represents the sign key Haven component.

## Nested Types

### Curve

- Role: Enumerates supported elliptic-curve key families.
- Description: Curve selection used when generating or parsing ECDSA keys.

### Format

- Role: Enumerates supported key encoding formats.
- Description: Signature or key format selection used by RSA and ECDSA helpers.

### Hash

- Role: Enumerates supported digest algorithms.
- Description: Digest selection used when signing or verifying key material.

### JWKFormatException

- Role: Signals an invalid JWK encoding.
- Description: Runtime exception thrown when a JWK cannot be parsed or serialized.

## Members

### Constants

#### `public static final Algorithm ES256 = () -> ECDSA.generate(ECDSA.Curve.SECP256R1, ECDSA.Hash.SHA256, ECDSA.Format.P1363)`
- Role: Implements the es256 operation.
- Description: Implements the generate operation.
- Value: `() -> ECDSA.generate(ECDSA.Curve.SECP256R1, ECDSA.Hash.SHA256, ECDSA.Format.P1363)`

#### `public static final Algorithm ES384 = () -> ECDSA.generate(ECDSA.Curve.SECP384R1, ECDSA.Hash.SHA384, ECDSA.Format.P1363)`
- Role: Implements the es384 operation.
- Description: Implements the generate operation.
- Value: `() -> ECDSA.generate(ECDSA.Curve.SECP384R1, ECDSA.Hash.SHA384, ECDSA.Format.P1363)`

#### `public static final Algorithm ES512 = () -> ECDSA.generate(ECDSA.Curve.SECP521R1, ECDSA.Hash.SHA512, ECDSA.Format.P1363)`
- Role: Implements the es512 operation.
- Description: Implements the generate operation.
- Value: `() -> ECDSA.generate(ECDSA.Curve.SECP521R1, ECDSA.Hash.SHA512, ECDSA.Format.P1363)`

#### `public static final Algorithm RS256 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA256)`
- Role: Implements the rs256 operation.
- Description: Implements the generate operation.
- Value: `() -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA256)`

#### `public static final Algorithm RS384 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA384)`
- Role: Implements the rs384 operation.
- Description: Implements the generate operation.
- Value: `() -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA384)`

#### `public static final Algorithm RS512 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA512)`
- Role: Implements the rs512 operation.
- Description: Implements the generate operation.
- Value: `() -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA512)`

#### `public static final Algorithm PS256 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA256)`
- Role: Implements the ps256 operation.
- Description: Implements the generate operation.
- Value: `() -> RSA_PSS.generate(RSA_PSS.Hash.SHA256)`

#### `public static final Algorithm PS384 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA384)`
- Role: Implements the ps384 operation.
- Description: Implements the generate operation.
- Value: `() -> RSA_PSS.generate(RSA_PSS.Hash.SHA384)`

#### `public static final Algorithm PS512 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA512)`
- Role: Implements the ps512 operation.
- Description: Implements the generate operation.
- Value: `() -> RSA_PSS.generate(RSA_PSS.Hash.SHA512)`

#### `public static final Algorithm HS256 = HMAC.alg(Digest.SHA256)`
- Role: Implements the hs256 operation.
- Description: Implements the alg operation.
- Value: `HMAC.alg(Digest.SHA256)`

#### `public static final Algorithm HS384 = HMAC.alg(Digest.SHA384)`
- Role: Implements the hs384 operation.
- Description: Implements the alg operation.
- Value: `HMAC.alg(Digest.SHA384)`

#### `public static final Algorithm HS512 = HMAC.alg(Digest.SHA512)`
- Role: Implements the hs512 operation.
- Description: Implements the alg operation.
- Value: `HMAC.alg(Digest.SHA512)`

#### `private static final Function<KeySpec, RSAPublicKey> rsapub = parser(RSAPublicKey.class, "RSA")`
- Role: Implements the rsapub operation.
- Description: Implements the parser operation.
- Value: `parser(RSAPublicKey.class, "RSA")`

#### `private static final Function<KeySpec, RSAPrivateKey> rsaprv = parser(RSAPrivateKey.class, "RSA")`
- Role: Implements the rsaprv operation.
- Description: Implements the parser operation.
- Value: `parser(RSAPrivateKey.class, "RSA")`

#### `private static final Function<KeySpec, ECPublicKey> ecpub = parser(ECPublicKey.class, "EC")`
- Role: Implements the ecpub operation.
- Description: Implements the parser operation.
- Value: `parser(ECPublicKey.class, "EC")`

#### `private static final Function<KeySpec, ECPrivateKey> ecprv = parser(ECPrivateKey.class, "EC")`
- Role: Implements the ecprv operation.
- Description: Implements the parser operation.
- Value: `parser(ECPrivateKey.class, "EC")`

### Fields

#### `public final Curve crv`
- Role: Caches the crv value.
- Description: Caches the `crv` value for reuse.

#### `public final Hash hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `public final Format fmt`
- Role: Caches the fmt value.
- Description: Caches the `fmt` value for reuse.

#### `public final ECPrivateKey prv`
- Role: Caches the prv value.
- Description: Caches the `prv` value for reuse.

#### `public final ECPublicKey pub`
- Role: Caches the pub value.
- Description: Caches the `pub` value for reuse.

#### `private final KeyPairGenerator gen`
- Role: Caches the gen value.
- Description: Caches the `gen` value for reuse.

#### `private final ECParameterSpec params`
- Role: Caches the params value.
- Description: Caches the `params` value for reuse.

#### `public final int len`
- Role: Caches the len value.
- Description: Caches the `len` value for reuse.

#### `public final Curve defcurve`
- Role: Caches the defcurve value.
- Description: Caches the `defcurve` value for reuse.

#### `public final RSAPrivateKey prv`
- Role: Caches the prv value.
- Description: Caches the `prv` value for reuse.

#### `public final RSAPublicKey pub`
- Role: Caches the pub value.
- Description: Caches the `pub` value for reuse.

#### `public final Hash hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `public final Hash hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `private final AlgorithmParameterSpec par`
- Role: Caches the par value.
- Description: Caches the `par` value for reuse.

#### `private final boolean supported`
- Role: Tracks the supported flag.
- Description: Caches the `supported` value for reuse.

#### `private final Digest.Algorithm dig`
- Role: Caches the dig value.
- Description: Caches the `dig` value for reuse.

#### `public final byte[] key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `public final Map<?, ?> data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

### Methods

#### `public SignKey generate()`
- Role: Handles the generate path.
- Description: Implements the generate operation.

#### `public Signer update(byte[] buf, int off, int len)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public default Signer update(byte[] part)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public byte[] sign()`
- Role: Handles the sign path.
- Description: Implements the sign operation.

#### `public Verifier update(byte[] buf, int off, int len)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public default Verifier update(byte[] part)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public boolean verify(byte[] sig)`
- Role: Handles the verify path.
- Description: Implements the verify operation.

#### `public Signer sign()`
- Role: Handles the sign path.
- Description: Implements the sign operation.

#### `public Verifier verify()`
- Role: Handles the verify path.
- Description: Implements the verify operation.

#### `public default byte[] sign(byte[]... parts)`
- Role: Handles the sign path.
- Description: Implements the sign operation.

#### `public default boolean verify(byte[] sig, byte[]... parts)`
- Role: Handles the verify path.
- Description: Implements the verify operation.

#### `protected abstract Signature signer()`
- Role: Handles the signer path.
- Description: Implements the signer operation.

#### `protected abstract Signature verifier()`
- Role: Handles the verifier path.
- Description: Implements the verifier operation.

#### `protected byte[] int2ext(byte[] sig)`
- Role: Handles the int2ext path.
- Description: Implements the int2ext operation.

#### `protected byte[] ext2int(byte[] sig)`
- Role: Handles the ext2int path.
- Description: Implements the ext2int operation.

#### `public Signer sign()`
- Role: Handles the sign path.
- Description: Implements the sign operation.

#### `public Verifier verify()`
- Role: Handles the verify path.
- Description: Implements the verify operation.

#### `private static KeyPairGenerator getgen(String nm, AlgorithmParameterSpec... pars)`
- Role: Handles the getgen path.
- Description: Returns the gen.

#### `Curve(AlgorithmParameterSpec par)`
- Role: Handles the curve workflow.
- Description: Implements the curve operation.

#### `Hash(int len, Curve crv)`
- Role: Handles the hash workflow.
- Description: Implements the hash operation.

#### `public ECDSA(Curve crv, Hash hash, Format fmt, ECPublicKey pub, ECPrivateKey prv)`
- Role: Handles the ecdsa path.
- Description: Implements the ecdsa operation.

#### `private Signature instance()`
- Role: Handles the instance path.
- Description: Implements the instance operation.

#### `protected Signature signer()`
- Role: Handles the signer path.
- Description: Implements the signer operation.

#### `protected Signature verifier()`
- Role: Handles the verifier path.
- Description: Implements the verifier operation.

#### `private byte[] unsign(byte[] n)`
- Role: Handles the unsign path.
- Description: Implements the unsign operation.

#### `private byte[] decberblock(Message data, int checktag)`
- Role: Handles the decberblock path.
- Description: Implements the decberblock operation.

#### `private byte[] encderblock(int tag, byte[] data)`
- Role: Handles the encderblock path.
- Description: Implements the encderblock operation.

#### `protected byte[] int2ext(byte[] sig)`
- Role: Handles the int2ext path.
- Description: Implements the int2ext operation.

#### `protected byte[] ext2int(byte[] sig)`
- Role: Handles the ext2int path.
- Description: Implements the ext2int operation.

#### `public static ECDSA generate(Curve crv, Hash hash, Format fmt)`
- Role: Handles the generate path.
- Description: Implements the generate operation.

#### `public RSA(RSAPublicKey pub, RSAPrivateKey prv)`
- Role: Handles the rsa path.
- Description: Implements the rsa operation.

#### `public RSA_PKCS1(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)`
- Role: Handles the rsa pkcs1 path.
- Description: Implements the rsa pkcs1 operation.

#### `private Signature instance()`
- Role: Handles the instance path.
- Description: Implements the instance operation.

#### `protected Signature signer()`
- Role: Handles the signer path.
- Description: Implements the signer operation.

#### `protected Signature verifier()`
- Role: Handles the verifier path.
- Description: Implements the verifier operation.

#### `public static RSA_PKCS1 generate(int size, Hash hash)`
- Role: Handles the generate path.
- Description: Implements the generate operation.

#### `public static RSA_PKCS1 generate(Hash hash)`
- Role: Handles the generate path.
- Description: Implements the generate operation.

#### `Hash(int len, String name)`
- Role: Handles the hash workflow.
- Description: Implements the hash operation.

#### `public RSA_PSS(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)`
- Role: Handles the rsa pss path.
- Description: Implements the rsa pss operation.

#### `private Signature instance()`
- Role: Handles the instance path.
- Description: Implements the instance operation.

#### `protected Signature signer()`
- Role: Handles the signer path.
- Description: Implements the signer operation.

#### `protected Signature verifier()`
- Role: Handles the verifier path.
- Description: Implements the verifier operation.

#### `public static RSA_PSS generate(int size, Hash hash)`
- Role: Handles the generate path.
- Description: Implements the generate operation.

#### `public static RSA_PSS generate(Hash hash)`
- Role: Handles the generate path.
- Description: Implements the generate operation.

#### `public HMAC(Digest.Algorithm dig, byte[] key)`
- Role: Handles the hmac path.
- Description: Implements the hmac operation.

#### `public Digest hmac()`
- Role: Handles the hmac path.
- Description: Implements the hmac operation.

#### `public Signer sign()`
- Role: Handles the sign path.
- Description: Implements the sign operation.

#### `public Verifier verify()`
- Role: Handles the verify path.
- Description: Implements the verify operation.

#### `public static Algorithm alg(Digest.Algorithm dig)`
- Role: Handles the alg path.
- Description: Implements the alg operation.

#### `public EncodingException(String msg)`
- Role: Handles the encoding exception path.
- Description: Implements the encoding exception operation.

#### `public FormatException(String msg)`
- Role: Handles the format exception path.
- Description: Implements the format exception operation.

#### `public static BigInteger b2i(byte[] b)`
- Role: Handles the b2i path.
- Description: Implements the b2i operation.

#### `public static byte[] i2b(BigInteger i)`
- Role: Handles the i2b path.
- Description: Implements the i2b operation.

#### `private static void format(Map<Object, Object> buf, ECDSA sig, boolean pub)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `private static void format(Map<Object, Object> buf, RSA sig, boolean pub)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `private static void format(Map<Object, Object> buf, RSA_PKCS1 sig, boolean pub)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `private static void format(Map<Object, Object> buf, RSA_PSS sig, boolean pub)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `private static void format(Map<Object, Object> buf, HMAC sig, boolean pub)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `public static Map<Object, Object> format(SignKey sig, boolean pub)`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `public JWKFormatException(Map<?, ?> data, String msg)`
- Role: Handles the jwkformat exception path.
- Description: Implements the jwk format exception operation.

#### `private static <T extends Key> Function<KeySpec, T> parser(Class<T> kcl, String algo)`
- Role: Handles the parser path.
- Description: Implements the parser operation.

#### `private static Pair<RSAPublicKey, RSAPrivateKey> rsaparse(Map<?, ?> data)`
- Role: Handles the rsaparse path.
- Description: Implements the rsaparse operation.

#### `private static ECDSA parse(Map<?, ?> data, ECDSA.Hash hash)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `private static RSA_PKCS1 parse(Map<?, ?> data, RSA_PKCS1.Hash hash)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `private static RSA_PSS parse(Map<?, ?> data, RSA_PSS.Hash hash)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `private static HMAC hmacparse(Map<?, ?> data, Digest.Algorithm dig)`
- Role: Handles the hmacparse path.
- Description: Implements the hmacparse operation.

#### `public static SignKey parse(Map<?, ?> data)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public static void main(String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.