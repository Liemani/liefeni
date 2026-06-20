---
source: [SignKey.java](../../../src/haven/SignKey.java)
created: 2026-06-13
updated: 2026-06-14
---

# SignKey

Represents the sign key Haven component.

## Nested Types

### Curve

- Role: Represents curve within SignKey.
- Description: Describes the nested curve type used by the enclosing class.

### Format

- Role: Represents format within SignKey.
- Description: Describes the nested format type used by the enclosing class.

### Hash

- Role: Represents hash within SignKey.
- Description: Describes the nested hash type used by the enclosing class.

### JWKFormatException

- Role: Represents jwkformat exception within SignKey.
- Description: Describes the nested jwkformat exception type used by the enclosing class.

## Members

### Constants

#### `public static final Algorithm ES256 = () -> ECDSA.generate(ECDSA.Curve.SECP256R1, ECDSA.Hash.SHA256, ECDSA.Format.P1363)`
- Role: Defines the shared es256 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm ES384 = () -> ECDSA.generate(ECDSA.Curve.SECP384R1, ECDSA.Hash.SHA384, ECDSA.Format.P1363)`
- Role: Defines the shared es384 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm ES512 = () -> ECDSA.generate(ECDSA.Curve.SECP521R1, ECDSA.Hash.SHA512, ECDSA.Format.P1363)`
- Role: Defines the shared es512 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm RS256 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA256)`
- Role: Defines the shared rs256 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm RS384 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA384)`
- Role: Defines the shared rs384 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm RS512 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA512)`
- Role: Defines the shared rs512 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm PS256 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA256)`
- Role: Defines the shared ps256 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm PS384 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA384)`
- Role: Defines the shared ps384 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm PS512 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA512)`
- Role: Defines the shared ps512 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm HS256 = HMAC.alg(Digest.SHA256)`
- Role: Defines the shared hs256 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm HS384 = HMAC.alg(Digest.SHA384)`
- Role: Defines the shared hs384 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Algorithm HS512 = HMAC.alg(Digest.SHA512)`
- Role: Defines the shared hs512 constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Function<KeySpec, RSAPublicKey> rsapub = parser(RSAPublicKey.class, "RSA")`
- Role: Defines the shared rsapub constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Function<KeySpec, RSAPrivateKey> rsaprv = parser(RSAPrivateKey.class, "RSA")`
- Role: Defines the shared rsaprv constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Function<KeySpec, ECPublicKey> ecpub = parser(ECPublicKey.class, "EC")`
- Role: Defines the shared ecpub constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Function<KeySpec, ECPrivateKey> ecprv = parser(ECPrivateKey.class, "EC")`
- Role: Defines the shared ecprv constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Curve crv`
- Role: Holds the crv state.
- Description: Backs the cached state for this file.

#### `public final Hash hash`
- Role: Holds the hash state.
- Description: Backs the cached state for this file.

#### `public final Format fmt`
- Role: Holds the fmt state.
- Description: Backs the cached state for this file.

#### `public final ECPrivateKey prv`
- Role: Holds the prv state.
- Description: Backs the cached state for this file.

#### `public final ECPublicKey pub`
- Role: Holds the pub state.
- Description: Backs the cached state for this file.

#### `private final KeyPairGenerator gen`
- Role: Holds the gen state.
- Description: Backs the cached state for this file.

#### `private final ECParameterSpec params`
- Role: Stores the params value.
- Description: Backs the cached state for this file.

#### `public final int len`
- Role: Stores the len value.
- Description: Backs the cached state for this file.

#### `public final Curve defcurve`
- Role: Holds the defcurve state.
- Description: Backs the cached state for this file.

#### `public final RSAPrivateKey prv`
- Role: Holds the prv state.
- Description: Backs the cached state for this file.

#### `public final RSAPublicKey pub`
- Role: Holds the pub state.
- Description: Backs the cached state for this file.

#### `public final Hash hash`
- Role: Holds the hash state.
- Description: Backs the cached state for this file.

#### `public final Hash hash`
- Role: Holds the hash state.
- Description: Backs the cached state for this file.

#### `private final AlgorithmParameterSpec par`
- Role: Stores the par value.
- Description: Backs the cached state for this file.

#### `private final boolean supported`
- Role: Tracks the supported flag.
- Description: Supports the supported operation used by the surrounding class.

#### `private final Digest.Algorithm dig`
- Role: Holds the dig state.
- Description: Backs the cached state for this file.

#### `public final byte[] key`
- Role: Stores the key value.
- Description: Backs the cached state for this file.

#### `public final Map<?, ?> data`
- Role: Caches data entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public SignKey generate()`
- Role: Performs generate.
- Description: Supports the generate operation used by the surrounding class.

#### `public Signer update(byte[] buf, int off, int len)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public default Signer update(byte[] part)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public byte[] sign()`
- Role: Performs sign.
- Description: Supports the sign operation used by the surrounding class.

#### `public Verifier update(byte[] buf, int off, int len)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public default Verifier update(byte[] part)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public boolean verify(byte[] sig)`
- Role: Performs verify.
- Description: Supports the verify operation used by the surrounding class.

#### `public Signer sign()`
- Role: Performs sign.
- Description: Supports the sign operation used by the surrounding class.

#### `public Verifier verify()`
- Role: Performs verify.
- Description: Supports the verify operation used by the surrounding class.

#### `public default byte[] sign(byte[]... parts)`
- Role: Performs sign.
- Description: Supports the sign operation used by the surrounding class.

#### `public default boolean verify(byte[] sig, byte[]... parts)`
- Role: Performs verify.
- Description: Supports the verify operation used by the surrounding class.

#### `protected abstract Signature signer()`
- Role: Performs signer.
- Description: Supports the signer operation used by the surrounding class.

#### `protected abstract Signature verifier()`
- Role: Performs verifier.
- Description: Supports the verifier operation used by the surrounding class.

#### `protected byte[] int2ext(byte[] sig)`
- Role: Performs int2ext.
- Description: Supports the int2ext operation used by the surrounding class.

#### `protected byte[] ext2int(byte[] sig)`
- Role: Performs ext2int.
- Description: Supports the ext2int operation used by the surrounding class.

#### `public Signer sign()`
- Role: Performs sign.
- Description: Supports the sign operation used by the surrounding class.

#### `public Verifier verify()`
- Role: Performs verify.
- Description: Supports the verify operation used by the surrounding class.

#### `private static KeyPairGenerator getgen(String nm, AlgorithmParameterSpec... pars)`
- Role: Performs getgen.
- Description: Supports the getgen operation used by the surrounding class.

#### `Curve(AlgorithmParameterSpec par)`
- Role: Handles the curve workflow.
- Description: Supports the curve operation used by the surrounding class.

#### `Hash(int len, Curve crv)`
- Role: Handles the hash workflow.
- Description: Supports the hash operation used by the surrounding class.

#### `public ECDSA(Curve crv, Hash hash, Format fmt, ECPublicKey pub, ECPrivateKey prv)`
- Role: Performs ecdsa.
- Description: Supports the ecdsa operation used by the surrounding class.

#### `private Signature instance()`
- Role: Performs instance.
- Description: Supports the instance operation used by the surrounding class.

#### `protected Signature signer()`
- Role: Performs signer.
- Description: Supports the signer operation used by the surrounding class.

#### `protected Signature verifier()`
- Role: Performs verifier.
- Description: Supports the verifier operation used by the surrounding class.

#### `private byte[] unsign(byte[] n)`
- Role: Performs unsign.
- Description: Supports the unsign operation used by the surrounding class.

#### `private byte[] decberblock(Message data, int checktag)`
- Role: Performs decberblock.
- Description: Supports the decberblock operation used by the surrounding class.

#### `private byte[] encderblock(int tag, byte[] data)`
- Role: Performs encderblock.
- Description: Supports the encderblock operation used by the surrounding class.

#### `protected byte[] int2ext(byte[] sig)`
- Role: Performs int2ext.
- Description: Supports the int2ext operation used by the surrounding class.

#### `protected byte[] ext2int(byte[] sig)`
- Role: Performs ext2int.
- Description: Supports the ext2int operation used by the surrounding class.

#### `public static ECDSA generate(Curve crv, Hash hash, Format fmt)`
- Role: Performs generate.
- Description: Supports the generate operation used by the surrounding class.

#### `public RSA(RSAPublicKey pub, RSAPrivateKey prv)`
- Role: Performs rsa.
- Description: Supports the rsa operation used by the surrounding class.

#### `public RSA_PKCS1(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)`
- Role: Performs rsa pkcs1.
- Description: Supports the rsa pkcs1 operation used by the surrounding class.

#### `private Signature instance()`
- Role: Performs instance.
- Description: Supports the instance operation used by the surrounding class.

#### `protected Signature signer()`
- Role: Performs signer.
- Description: Supports the signer operation used by the surrounding class.

#### `protected Signature verifier()`
- Role: Performs verifier.
- Description: Supports the verifier operation used by the surrounding class.

#### `public static RSA_PKCS1 generate(int size, Hash hash)`
- Role: Performs generate.
- Description: Supports the generate operation used by the surrounding class.

#### `public static RSA_PKCS1 generate(Hash hash)`
- Role: Performs generate.
- Description: Supports the generate operation used by the surrounding class.

#### `Hash(int len, String name)`
- Role: Handles the hash workflow.
- Description: Supports the hash operation used by the surrounding class.

#### `public RSA_PSS(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)`
- Role: Performs rsa pss.
- Description: Supports the rsa pss operation used by the surrounding class.

#### `private Signature instance()`
- Role: Performs instance.
- Description: Supports the instance operation used by the surrounding class.

#### `protected Signature signer()`
- Role: Performs signer.
- Description: Supports the signer operation used by the surrounding class.

#### `protected Signature verifier()`
- Role: Performs verifier.
- Description: Supports the verifier operation used by the surrounding class.

#### `public static RSA_PSS generate(int size, Hash hash)`
- Role: Performs generate.
- Description: Supports the generate operation used by the surrounding class.

#### `public static RSA_PSS generate(Hash hash)`
- Role: Performs generate.
- Description: Supports the generate operation used by the surrounding class.

#### `public HMAC(Digest.Algorithm dig, byte[] key)`
- Role: Performs hmac.
- Description: Supports the hmac operation used by the surrounding class.

#### `public Digest hmac()`
- Role: Performs hmac.
- Description: Supports the hmac operation used by the surrounding class.

#### `public Signer sign()`
- Role: Performs sign.
- Description: Supports the sign operation used by the surrounding class.

#### `public Verifier verify()`
- Role: Performs verify.
- Description: Supports the verify operation used by the surrounding class.

#### `public static Algorithm alg(Digest.Algorithm dig)`
- Role: Performs alg.
- Description: Supports the alg operation used by the surrounding class.

#### `public EncodingException(String msg)`
- Role: Performs encoding exception.
- Description: Supports the encoding exception operation used by the surrounding class.

#### `public FormatException(String msg)`
- Role: Performs format exception.
- Description: Supports the format exception operation used by the surrounding class.

#### `public static BigInteger b2i(byte[] b)`
- Role: Performs b2i.
- Description: Supports the b2i operation used by the surrounding class.

#### `public static byte[] i2b(BigInteger i)`
- Role: Performs i2b.
- Description: Supports the i2b operation used by the surrounding class.

#### `private static void format(Map<Object, Object> buf, ECDSA sig, boolean pub)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `private static void format(Map<Object, Object> buf, RSA sig, boolean pub)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `private static void format(Map<Object, Object> buf, RSA_PKCS1 sig, boolean pub)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `private static void format(Map<Object, Object> buf, RSA_PSS sig, boolean pub)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `private static void format(Map<Object, Object> buf, HMAC sig, boolean pub)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `public static Map<Object, Object> format(SignKey sig, boolean pub)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `public JWKFormatException(Map<?, ?> data, String msg)`
- Role: Performs jwkformat exception.
- Description: Supports the jwkformat exception operation used by the surrounding class.

#### `private static <T extends Key> Function<KeySpec, T> parser(Class<T> kcl, String algo)`
- Role: Performs parser.
- Description: Supports the parser operation used by the surrounding class.

#### `private static Pair<RSAPublicKey, RSAPrivateKey> rsaparse(Map<?, ?> data)`
- Role: Performs rsaparse.
- Description: Supports the rsaparse operation used by the surrounding class.

#### `private static ECDSA parse(Map<?, ?> data, ECDSA.Hash hash)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `private static RSA_PKCS1 parse(Map<?, ?> data, RSA_PKCS1.Hash hash)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `private static RSA_PSS parse(Map<?, ?> data, RSA_PSS.Hash hash)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `private static HMAC hmacparse(Map<?, ?> data, Digest.Algorithm dig)`
- Role: Performs hmacparse.
- Description: Supports the hmacparse operation used by the surrounding class.

#### `public static SignKey parse(Map<?, ?> data)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public static void main(String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.
