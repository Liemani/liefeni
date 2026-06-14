# SignKey

## Meta

- Source: [SignKey.java](../../../src/haven/SignKey.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a signing key.

## Code Members

### Member Index

#### Constants

- [ES256](#member-69)
- [ES384](#member-70)
- [ES512](#member-71)
- [RS256](#member-72)
- [RS384](#member-73)
- [RS512](#member-74)
- [PS256](#member-75)
- [PS384](#member-76)
- [PS512](#member-77)
- [HS256](#member-78)
- [HS384](#member-79)
- [HS512](#member-80)

#### Fields

- [crv](#member-19)
- [hash](#member-20)
- [fmt](#member-21)
- [prv](#member-22)
- [pub](#member-23)
- [gen](#member-24)
- [params](#member-25)
- [len](#member-27)
- [defcurve](#member-28)
- [prv](#member-40)
- [pub](#member-41)
- [hash](#member-43)
- [hash](#member-50)
- [par](#member-51)
- [supported](#member-52)
- [dig](#member-60)
- [key](#member-61)
- [data](#member-89)
- [rsapub](#member-92)
- [rsaprv](#member-93)
- [ecpub](#member-95)
- [ecprv](#member-96)

#### Methods

- [public SignKey generate();](#member-1)
- [public Signer update(byte[] buf, int off, int len);](#member-2)
- [update(byte[] part)](#member-3)
- [public byte[] sign();](#member-4)
- [public Verifier update(byte[] buf, int off, int len);](#member-5)
- [update(byte[] part)](#member-6)
- [public boolean verify(byte[] sig);](#member-7)
- [public Signer sign();](#member-8)
- [public Verifier verify();](#member-9)
- [sign(byte[]... parts)](#member-10)
- [verify(byte[] sig, byte[]... parts)](#member-11)
- [protected abstract Signature signer();](#member-12)
- [protected abstract Signature verifier();](#member-13)
- [int2ext(byte[] sig)](#member-14)
- [ext2int(byte[] sig)](#member-15)
- [sign()](#member-16)
- [verify()](#member-17)
- [getgen(String nm, AlgorithmParameterSpec... pars)](#member-18)
- [Curve(AlgorithmParameterSpec par)](#member-26)
- [Hash(int len, Curve crv)](#member-29)
- [ECDSA(Curve crv, Hash hash, Format fmt, ECPublicKey pub, ECPrivateKey prv)](#member-30)
- [instance()](#member-31)
- [signer()](#member-32)
- [verifier()](#member-33)
- [unsign(byte[] n)](#member-34)
- [decberblock(Message data, int checktag)](#member-35)
- [encderblock(int tag, byte[] data)](#member-36)
- [int2ext(byte[] sig)](#member-37)
- [ext2int(byte[] sig)](#member-38)
- [generate(Curve crv, Hash hash, Format fmt)](#member-39)
- [RSA(RSAPublicKey pub, RSAPrivateKey prv)](#member-42)
- [RSA_PKCS1(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)](#member-44)
- [instance()](#member-45)
- [signer()](#member-46)
- [verifier()](#member-47)
- [generate(int size, Hash hash)](#member-48)
- [generate(Hash hash)](#member-49)
- [Hash(int len, String name)](#member-53)
- [RSA_PSS(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)](#member-54)
- [instance()](#member-55)
- [signer()](#member-56)
- [verifier()](#member-57)
- [generate(int size, Hash hash)](#member-58)
- [generate(Hash hash)](#member-59)
- [HMAC(Digest.Algorithm dig, byte[] key)](#member-62)
- [hmac()](#member-63)
- [sign()](#member-64)
- [verify()](#member-65)
- [alg(Digest.Algorithm dig)](#member-66)
- [EncodingException(String msg)](#member-67)
- [FormatException(String msg)](#member-68)
- [b2i(byte[] b)](#member-81)
- [i2b(BigInteger i)](#member-82)
- [format(Map<Object, Object> buf, ECDSA sig, boolean pub)](#member-83)
- [format(Map<Object, Object> buf, RSA sig, boolean pub)](#member-84)
- [format(Map<Object, Object> buf, RSA_PKCS1 sig, boolean pub)](#member-85)
- [format(Map<Object, Object> buf, RSA_PSS sig, boolean pub)](#member-86)
- [format(Map<Object, Object> buf, HMAC sig, boolean pub)](#member-87)
- [format(SignKey sig, boolean pub)](#member-88)
- [JWKFormatException(Map<?, ?> data, String msg)](#member-90)
- [parser(Class<T> kcl, String algo)](#member-91)
- [rsaparse(Map<?, ?> data)](#member-94)
- [parse(Map<?, ?> data, ECDSA.Hash hash)](#member-97)
- [parse(Map<?, ?> data, RSA_PKCS1.Hash hash)](#member-98)
- [parse(Map<?, ?> data, RSA_PSS.Hash hash)](#member-99)
- [hmacparse(Map<?, ?> data, Digest.Algorithm dig)](#member-100)
- [parse(Map<?, ?> data)](#member-101)
- [main(String[] args)](#member-102)

### Member Reference

#### Constants

<a id="member-69"></a>
##### `ES256`

- Description: TODO

<a id="member-70"></a>
##### `ES384`

- Description: TODO

<a id="member-71"></a>
##### `ES512`

- Description: TODO

<a id="member-72"></a>
##### `RS256`

- Description: TODO

<a id="member-73"></a>
##### `RS384`

- Description: TODO

<a id="member-74"></a>
##### `RS512`

- Description: TODO

<a id="member-75"></a>
##### `PS256`

- Description: TODO

<a id="member-76"></a>
##### `PS384`

- Description: TODO

<a id="member-77"></a>
##### `PS512`

- Description: TODO

<a id="member-78"></a>
##### `HS256`

- Description: TODO

<a id="member-79"></a>
##### `HS384`

- Description: TODO

<a id="member-80"></a>
##### `HS512`

- Description: TODO

#### Fields

<a id="member-19"></a>
##### `crv`

- Description: TODO

<a id="member-20"></a>
##### `hash`

- Description: TODO

<a id="member-21"></a>
##### `fmt`

- Description: TODO

<a id="member-22"></a>
##### `prv`

- Description: TODO

<a id="member-23"></a>
##### `pub`

- Description: TODO

<a id="member-24"></a>
##### `gen`

- Description: TODO

<a id="member-25"></a>
##### `params`

- Description: TODO

<a id="member-27"></a>
##### `len`

- Description: TODO

<a id="member-28"></a>
##### `defcurve`

- Description: TODO

<a id="member-40"></a>
##### `prv`

- Description: TODO

<a id="member-41"></a>
##### `pub`

- Description: TODO

<a id="member-43"></a>
##### `hash`

- Description: TODO

<a id="member-50"></a>
##### `hash`

- Description: TODO

<a id="member-51"></a>
##### `par`

- Description: TODO

<a id="member-52"></a>
##### `supported`

- Description: TODO

<a id="member-60"></a>
##### `dig`

- Description: TODO

<a id="member-61"></a>
##### `key`

- Description: TODO

<a id="member-89"></a>
##### `data`

- Description: TODO

<a id="member-92"></a>
##### `rsapub`

- Description: TODO

<a id="member-93"></a>
##### `rsaprv`

- Description: TODO

<a id="member-95"></a>
##### `ecpub`

- Description: TODO

<a id="member-96"></a>
##### `ecprv`

- Description: TODO

#### Methods

<a id="member-1"></a>
##### `public SignKey generate();`

- Description: TODO

<a id="member-2"></a>
##### `public Signer update(byte[] buf, int off, int len);`

- Description: TODO

<a id="member-3"></a>
##### `update(byte[] part)`

- Description: TODO

<a id="member-4"></a>
##### `public byte[] sign();`

- Description: TODO

<a id="member-5"></a>
##### `public Verifier update(byte[] buf, int off, int len);`

- Description: TODO

<a id="member-6"></a>
##### `update(byte[] part)`

- Description: TODO

<a id="member-7"></a>
##### `public boolean verify(byte[] sig);`

- Description: TODO

<a id="member-8"></a>
##### `public Signer sign();`

- Description: TODO

<a id="member-9"></a>
##### `public Verifier verify();`

- Description: TODO

<a id="member-10"></a>
##### `sign(byte[]... parts)`

- Description: TODO

<a id="member-11"></a>
##### `verify(byte[] sig, byte[]... parts)`

- Description: TODO

<a id="member-12"></a>
##### `protected abstract Signature signer();`

- Description: TODO

<a id="member-13"></a>
##### `protected abstract Signature verifier();`

- Description: TODO

<a id="member-14"></a>
##### `int2ext(byte[] sig)`

- Description: TODO

<a id="member-15"></a>
##### `ext2int(byte[] sig)`

- Description: TODO

<a id="member-16"></a>
##### `sign()`

- Description: TODO

<a id="member-17"></a>
##### `verify()`

- Description: TODO

<a id="member-18"></a>
##### `getgen(String nm, AlgorithmParameterSpec... pars)`

- Description: TODO

<a id="member-26"></a>
##### `Curve(AlgorithmParameterSpec par)`

- Description: TODO

<a id="member-29"></a>
##### `Hash(int len, Curve crv)`

- Description: TODO

<a id="member-30"></a>
##### `ECDSA(Curve crv, Hash hash, Format fmt, ECPublicKey pub, ECPrivateKey prv)`

- Description: TODO

<a id="member-31"></a>
##### `instance()`

- Description: TODO

<a id="member-32"></a>
##### `signer()`

- Description: TODO

<a id="member-33"></a>
##### `verifier()`

- Description: TODO

<a id="member-34"></a>
##### `unsign(byte[] n)`

- Description: TODO

<a id="member-35"></a>
##### `decberblock(Message data, int checktag)`

- Description: TODO

<a id="member-36"></a>
##### `encderblock(int tag, byte[] data)`

- Description: TODO

<a id="member-37"></a>
##### `int2ext(byte[] sig)`

- Description: TODO

<a id="member-38"></a>
##### `ext2int(byte[] sig)`

- Description: TODO

<a id="member-39"></a>
##### `generate(Curve crv, Hash hash, Format fmt)`

- Description: TODO

<a id="member-42"></a>
##### `RSA(RSAPublicKey pub, RSAPrivateKey prv)`

- Description: TODO

<a id="member-44"></a>
##### `RSA_PKCS1(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)`

- Description: TODO

<a id="member-45"></a>
##### `instance()`

- Description: TODO

<a id="member-46"></a>
##### `signer()`

- Description: TODO

<a id="member-47"></a>
##### `verifier()`

- Description: TODO

<a id="member-48"></a>
##### `generate(int size, Hash hash)`

- Description: TODO

<a id="member-49"></a>
##### `generate(Hash hash)`

- Description: TODO

<a id="member-53"></a>
##### `Hash(int len, String name)`

- Description: TODO

<a id="member-54"></a>
##### `RSA_PSS(Hash hash, RSAPublicKey pub, RSAPrivateKey prv)`

- Description: TODO

<a id="member-55"></a>
##### `instance()`

- Description: TODO

<a id="member-56"></a>
##### `signer()`

- Description: TODO

<a id="member-57"></a>
##### `verifier()`

- Description: TODO

<a id="member-58"></a>
##### `generate(int size, Hash hash)`

- Description: TODO

<a id="member-59"></a>
##### `generate(Hash hash)`

- Description: TODO

<a id="member-62"></a>
##### `HMAC(Digest.Algorithm dig, byte[] key)`

- Description: TODO

<a id="member-63"></a>
##### `hmac()`

- Description: TODO

<a id="member-64"></a>
##### `sign()`

- Description: TODO

<a id="member-65"></a>
##### `verify()`

- Description: TODO

<a id="member-66"></a>
##### `alg(Digest.Algorithm dig)`

- Description: TODO

<a id="member-67"></a>
##### `EncodingException(String msg)`

- Description: TODO

<a id="member-68"></a>
##### `FormatException(String msg)`

- Description: TODO

<a id="member-81"></a>
##### `b2i(byte[] b)`

- Description: TODO

<a id="member-82"></a>
##### `i2b(BigInteger i)`

- Description: TODO

<a id="member-83"></a>
##### `format(Map<Object, Object> buf, ECDSA sig, boolean pub)`

- Description: TODO

<a id="member-84"></a>
##### `format(Map<Object, Object> buf, RSA sig, boolean pub)`

- Description: TODO

<a id="member-85"></a>
##### `format(Map<Object, Object> buf, RSA_PKCS1 sig, boolean pub)`

- Description: TODO

<a id="member-86"></a>
##### `format(Map<Object, Object> buf, RSA_PSS sig, boolean pub)`

- Description: TODO

<a id="member-87"></a>
##### `format(Map<Object, Object> buf, HMAC sig, boolean pub)`

- Description: TODO

<a id="member-88"></a>
##### `format(SignKey sig, boolean pub)`

- Description: TODO

<a id="member-90"></a>
##### `JWKFormatException(Map<?, ?> data, String msg)`

- Description: TODO

<a id="member-91"></a>
##### `parser(Class<T> kcl, String algo)`

- Description: TODO

<a id="member-94"></a>
##### `rsaparse(Map<?, ?> data)`

- Description: TODO

<a id="member-97"></a>
##### `parse(Map<?, ?> data, ECDSA.Hash hash)`

- Description: TODO

<a id="member-98"></a>
##### `parse(Map<?, ?> data, RSA_PKCS1.Hash hash)`

- Description: TODO

<a id="member-99"></a>
##### `parse(Map<?, ?> data, RSA_PSS.Hash hash)`

- Description: TODO

<a id="member-100"></a>
##### `hmacparse(Map<?, ?> data, Digest.Algorithm dig)`

- Description: TODO

<a id="member-101"></a>
##### `parse(Map<?, ?> data)`

- Description: TODO

<a id="member-102"></a>
##### `main(String[] args)`

- Description: TODO
