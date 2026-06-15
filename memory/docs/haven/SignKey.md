# SignKey

This file documents the responsibilities and members of `SignKey`.

## Meta

- Source: [SignKey.java](../../../src/haven/SignKey.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a signing key.

## Nested Types

### Curve

- Description: TODO

### Format

- Description: TODO

### Hash

- Description: TODO

### JWKFormatException

- Description: TODO

## Members

### Constants

#### `public static final Algorithm ES256 = () -> ECDSA.generate(ECDSA.Curve.SECP256R1, ECDSA.Hash.SHA256, ECDSA.Format.P1363)`

- Description: TODO

#### `public static final Algorithm ES384 = () -> ECDSA.generate(ECDSA.Curve.SECP384R1, ECDSA.Hash.SHA384, ECDSA.Format.P1363)`

- Description: TODO

#### `public static final Algorithm ES512 = () -> ECDSA.generate(ECDSA.Curve.SECP521R1, ECDSA.Hash.SHA512, ECDSA.Format.P1363)`

- Description: TODO

#### `public static final Algorithm RS256 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA256)`

- Description: TODO

#### `public static final Algorithm RS384 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA384)`

- Description: TODO

#### `public static final Algorithm RS512 = () -> RSA_PKCS1.generate(RSA_PKCS1.Hash.SHA512)`

- Description: TODO

#### `public static final Algorithm PS256 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA256)`

- Description: TODO

#### `public static final Algorithm PS384 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA384)`

- Description: TODO

#### `public static final Algorithm PS512 = () -> RSA_PSS.generate(RSA_PSS.Hash.SHA512)`

- Description: TODO

#### `public static final Algorithm HS256 = HMAC.alg(Digest.SHA256)`

- Description: TODO

#### `public static final Algorithm HS384 = HMAC.alg(Digest.SHA384)`

- Description: TODO

#### `public static final Algorithm HS512 = HMAC.alg(Digest.SHA512)`

- Description: TODO

#### `private static final Function<KeySpec, RSAPublicKey> rsapub = parser(RSAPublicKey.class, "RSA")`

- Description: TODO

#### `private static final Function<KeySpec, RSAPrivateKey> rsaprv = parser(RSAPrivateKey.class, "RSA")`

- Description: TODO

#### `private static final Function<KeySpec, ECPublicKey> ecpub = parser(ECPublicKey.class, "EC")`

- Description: TODO

#### `private static final Function<KeySpec, ECPrivateKey> ecprv = parser(ECPrivateKey.class, "EC")`

- Description: TODO

### Fields

#### `public final Curve crv`

- Description: TODO

#### `public final Hash hash`

- Description: TODO

#### `public final Format fmt`

- Description: TODO

#### `public final ECPrivateKey prv`

- Description: TODO

#### `public final ECPublicKey pub`

- Description: TODO

#### `private final KeyPairGenerator gen`

- Description: TODO

#### `private final ECParameterSpec params`

- Description: TODO

#### `public final int len`

- Description: TODO

#### `public final Curve defcurve`

- Description: TODO

#### `public final RSAPrivateKey prv`

- Description: TODO

#### `public final RSAPublicKey pub`

- Description: TODO

#### `public final Hash hash`

- Description: TODO

#### `public final Hash hash`

- Description: TODO

#### `private final AlgorithmParameterSpec par`

- Description: TODO

#### `private final boolean supported`

- Description: TODO

#### `private final Digest.Algorithm dig`

- Description: TODO

#### `public final byte[] key`

- Description: TODO

#### `public final Map<?, ?> data`

- Description: TODO

### Methods

#### `public SignKey generate()`

- Description: TODO

#### `public Signer update(byte[] buf, int off, int len)`

- Description: TODO

#### `public default Signer update(byte[] part)`

- Description: TODO

#### `public byte[] sign()`

- Description: TODO

#### `public Verifier update(byte[] buf, int off, int len)`

- Description: TODO

#### `public default Verifier update(byte[] part)`

- Description: TODO

#### `public boolean verify(byte[] sig)`

- Description: TODO

#### `public Signer sign()`

- Description: TODO

#### `public Verifier verify()`

- Description: TODO

#### `public default byte[] sign(byte[]... parts)`

- Description: TODO

#### `public default boolean verify(byte[] sig, byte[]... parts)`

- Description: TODO

#### `protected abstract Signature signer()`

- Description: TODO

#### `protected abstract Signature verifier()`

- Description: TODO

#### `protected byte[] int2ext(byte[] sig)`

- Description: TODO

#### `protected byte[] ext2int(byte[] sig)`

- Description: TODO

#### `public Signer sign()`

- Description: TODO

#### `public Verifier verify()`

- Description: TODO

#### `private static KeyPairGenerator getgen(String nm, AlgorithmParameterSpec... pars)`

- Description: TODO

#### `Curve(AlgorithmParameterSpec par)`

- Description: TODO

#### `Hash(int len, Curve crv)`

- Description: TODO

#### `public ECDSA(Curve crv, Hash hash, Format fmt, ECPublicKey pub, ECPrivateKey prv)`

- Description: TODO

#### `private Signature instance()`

- Description: TODO

#### `protected Signature signer()`

- Description: TODO

#### `protected Signature verifier()`

- Description: TODO

#### `private byte[] unsign(byte[] n)`

- Description: TODO

#### `private byte[] decberblock(Message data, int checktag)`

- Description: TODO

#### `private byte[] encderblock(int tag, byte[] data)`

- Description: TODO

#### `protected byte[] int2ext(byte[] sig)`

- Description: TODO

#### `protected byte[] ext2int(byte[] sig)`

- Description: TODO

#### `public static ECDSA generate(Curve crv, Hash hash, Format fmt)`

- Description: TODO

#### `public RSA(RSAPublicKey pub, RSAPrivateKey prv)`

- Description: TODO

#### `public RSA_PKCS1(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)`

- Description: TODO

#### `private Signature instance()`

- Description: TODO

#### `protected Signature signer()`

- Description: TODO

#### `protected Signature verifier()`

- Description: TODO

#### `public static RSA_PKCS1 generate(int size, Hash hash)`

- Description: TODO

#### `public static RSA_PKCS1 generate(Hash hash)`

- Description: TODO

#### `Hash(int len, String name)`

- Description: TODO

#### `public RSA_PSS(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)`

- Description: TODO

#### `private Signature instance()`

- Description: TODO

#### `protected Signature signer()`

- Description: TODO

#### `protected Signature verifier()`

- Description: TODO

#### `public static RSA_PSS generate(int size, Hash hash)`

- Description: TODO

#### `public static RSA_PSS generate(Hash hash)`

- Description: TODO

#### `public HMAC(Digest.Algorithm dig, byte[] key)`

- Description: TODO

#### `public Digest hmac()`

- Description: TODO

#### `public Signer sign()`

- Description: TODO

#### `public Verifier verify()`

- Description: TODO

#### `public static Algorithm alg(Digest.Algorithm dig)`

- Description: TODO

#### `public EncodingException(String msg)`

- Description: TODO

#### `public FormatException(String msg)`

- Description: TODO

#### `public static BigInteger b2i(byte[] b)`

- Description: TODO

#### `public static byte[] i2b(BigInteger i)`

- Description: TODO

#### `private static void format(Map<Object, Object> buf, ECDSA sig, boolean pub)`

- Description: TODO

#### `private static void format(Map<Object, Object> buf, RSA sig, boolean pub)`

- Description: TODO

#### `private static void format(Map<Object, Object> buf, RSA_PKCS1 sig, boolean pub)`

- Description: TODO

#### `private static void format(Map<Object, Object> buf, RSA_PSS sig, boolean pub)`

- Description: TODO

#### `private static void format(Map<Object, Object> buf, HMAC sig, boolean pub)`

- Description: TODO

#### `public static Map<Object, Object> format(SignKey sig, boolean pub)`

- Description: TODO

#### `public JWKFormatException(Map<?, ?> data, String msg)`

- Description: TODO

#### `private static <T extends Key> Function<KeySpec, T> parser(Class<T> kcl, String algo)`

- Description: TODO

#### `private static Pair<RSAPublicKey, RSAPrivateKey> rsaparse(Map<?, ?> data)`

- Description: TODO

#### `private static ECDSA parse(Map<?, ?> data, ECDSA.Hash hash)`

- Description: TODO

#### `private static RSA_PKCS1 parse(Map<?, ?> data, RSA_PKCS1.Hash hash)`

- Description: TODO

#### `private static RSA_PSS parse(Map<?, ?> data, RSA_PSS.Hash hash)`

- Description: TODO

#### `private static HMAC hmacparse(Map<?, ?> data, Digest.Algorithm dig)`

- Description: TODO

#### `public static SignKey parse(Map<?, ?> data)`

- Description: TODO

#### `public static void main(String[] args)`

- Description: TODO
