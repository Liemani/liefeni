# Digest

## Meta

- Source: [Digest.java](../../../src/haven/Digest.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides message digest support.

## Code Members

### Member Index

#### Constants

- [MD5](#member-1)
- [SHA1](#member-2)
- [SHA256](#member-3)
- [SHA384](#member-4)
- [SHA512](#member-5)
- [SHA3_256](#member-6)
- [SHA3_384](#member-7)
- [SHA3_512](#member-8)
- [BLAKE2B](#member-9)

#### Fields

- [md](#member-18)
- [dig](#member-24)
- [inner](#member-25)
- [outer](#member-26)

#### Methods

- [public int diglen();](#member-10)
- [public int blocklen();](#member-11)
- [public Digest update(byte[] buf, int off, int len);](#member-12)
- [update(byte[] part)](#member-13)
- [public byte[] digest();](#member-14)
- [public Digest copy();](#member-15)
- [hexdigest()](#member-16)
- [hash(Algorithm alg, byte[]... parts)](#member-17)
- [Builtin(MessageDigest md)](#member-19)
- [update(byte[] buf, int off, int len)](#member-20)
- [digest()](#member-21)
- [copy()](#member-22)
- [alg(String name, int dsz, int bsz)](#member-23)
- [addkey(Digest dig, byte[] key, byte mod)](#member-27)
- [HMAC(HMAC that)](#member-28)
- [HMAC(Algorithm dig, byte[] key)](#member-29)
- [update(byte[] part, int off, int len)](#member-30)
- [digest()](#member-31)
- [copy()](#member-32)
- [of(Algorithm dig, byte[] key)](#member-33)
- [hkdf(Algorithm dig, byte[] salt, byte[] ikm, byte[] info, int len)](#member-34)
- [pbkdf2(Algorithm prf, byte[] salt, int rounds, int len)](#member-35)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `MD5`

- Description: TODO

<a id="member-2"></a>
##### `SHA1`

- Description: TODO

<a id="member-3"></a>
##### `SHA256`

- Description: TODO

<a id="member-4"></a>
##### `SHA384`

- Description: TODO

<a id="member-5"></a>
##### `SHA512`

- Description: TODO

<a id="member-6"></a>
##### `SHA3_256`

- Description: TODO

<a id="member-7"></a>
##### `SHA3_384`

- Description: TODO

<a id="member-8"></a>
##### `SHA3_512`

- Description: TODO

<a id="member-9"></a>
##### `BLAKE2B`

- Description: TODO

#### Fields

<a id="member-18"></a>
##### `md`

- Description: TODO

<a id="member-24"></a>
##### `dig`

- Description: TODO

<a id="member-25"></a>
##### `inner`

- Description: TODO

<a id="member-26"></a>
##### `outer`

- Description: TODO

#### Methods

<a id="member-10"></a>
##### `public int diglen();`

- Description: TODO

<a id="member-11"></a>
##### `public int blocklen();`

- Description: TODO

<a id="member-12"></a>
##### `public Digest update(byte[] buf, int off, int len);`

- Description: TODO

<a id="member-13"></a>
##### `update(byte[] part)`

- Description: TODO

<a id="member-14"></a>
##### `public byte[] digest();`

- Description: TODO

<a id="member-15"></a>
##### `public Digest copy();`

- Description: TODO

<a id="member-16"></a>
##### `hexdigest()`

- Description: TODO

<a id="member-17"></a>
##### `hash(Algorithm alg, byte[]... parts)`

- Description: TODO

<a id="member-19"></a>
##### `Builtin(MessageDigest md)`

- Description: TODO

<a id="member-20"></a>
##### `update(byte[] buf, int off, int len)`

- Description: TODO

<a id="member-21"></a>
##### `digest()`

- Description: TODO

<a id="member-22"></a>
##### `copy()`

- Description: TODO

<a id="member-23"></a>
##### `alg(String name, int dsz, int bsz)`

- Description: TODO

<a id="member-27"></a>
##### `addkey(Digest dig, byte[] key, byte mod)`

- Description: TODO

<a id="member-28"></a>
##### `HMAC(HMAC that)`

- Description: TODO

<a id="member-29"></a>
##### `HMAC(Algorithm dig, byte[] key)`

- Description: TODO

<a id="member-30"></a>
##### `update(byte[] part, int off, int len)`

- Description: TODO

<a id="member-31"></a>
##### `digest()`

- Description: TODO

<a id="member-32"></a>
##### `copy()`

- Description: TODO

<a id="member-33"></a>
##### `of(Algorithm dig, byte[] key)`

- Description: TODO

<a id="member-34"></a>
##### `hkdf(Algorithm dig, byte[] salt, byte[] ikm, byte[] info, int len)`

- Description: TODO

<a id="member-35"></a>
##### `pbkdf2(Algorithm prf, byte[] salt, int rounds, int len)`

- Description: TODO
