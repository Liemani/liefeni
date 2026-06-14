# Pufferfish2

## Meta

- Source: [Pufferfish2.java](../../../src/haven/Pufferfish2.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides a bitset or packing helper.

## Code Members

### Member Index

#### Constants

- [ENCODING](#member-1)
- [IV](#member-2)
- [DIGEST](#member-3)
- [DIGEST_LENGTH](#member-4)
- [SBOX_N](#member-5)

#### Fields

- [cost_t](#member-9)
- [cost_m](#member-10)
- [log2_sbox_sz](#member-11)
- [sbox_sz](#member-12)
- [S](#member-13)
- [P](#member-14)
- [L](#member-15)
- [R](#member-16)
- [salt_u64](#member-17)

#### Methods

- [b2l(byte[] buf)](#member-6)
- [l2b(long[] buf)](#member-7)
- [HMAC(byte[] key, byte[] data)](#member-8)
- [HASH_SBOX(byte[] x)](#member-18)
- [F(long x)](#member-19)
- [ENCIPHER()](#member-20)
- [EXPANDSTATE(long[] buf, long a, long b, int c, int d)](#member-21)
- [EXPANDSTATE_NULL(long[] buf, int a, int b)](#member-22)
- [ENCRYPT_P()](#member-23)
- [ENCRYPT_S()](#member-24)
- [REKEY(byte[] key)](#member-25)
- [Instance(int cost_t, int cost_m)](#member-26)
- [hash(byte[] key_r, byte[] salt_r)](#member-27)
- [hash(byte[] key, byte[] salt, int t, int m)](#member-28)
- [main(String[] args)](#member-29)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `ENCODING`

- Description: TODO

<a id="member-2"></a>
##### `IV`

- Description: TODO

<a id="member-3"></a>
##### `DIGEST`

- Description: TODO

<a id="member-4"></a>
##### `DIGEST_LENGTH`

- Description: TODO

<a id="member-5"></a>
##### `SBOX_N`

- Description: TODO

#### Fields

<a id="member-9"></a>
##### `cost_t`

- Description: TODO

<a id="member-10"></a>
##### `cost_m`

- Description: TODO

<a id="member-11"></a>
##### `log2_sbox_sz`

- Description: TODO

<a id="member-12"></a>
##### `sbox_sz`

- Description: TODO

<a id="member-13"></a>
##### `S`

- Description: TODO

<a id="member-14"></a>
##### `P`

- Description: TODO

<a id="member-15"></a>
##### `L`

- Description: TODO

<a id="member-16"></a>
##### `R`

- Description: TODO

<a id="member-17"></a>
##### `salt_u64`

- Description: TODO

#### Methods

<a id="member-6"></a>
##### `b2l(byte[] buf)`

- Description: TODO

<a id="member-7"></a>
##### `l2b(long[] buf)`

- Description: TODO

<a id="member-8"></a>
##### `HMAC(byte[] key, byte[] data)`

- Description: TODO

<a id="member-18"></a>
##### `HASH_SBOX(byte[] x)`

- Description: TODO

<a id="member-19"></a>
##### `F(long x)`

- Description: TODO

<a id="member-20"></a>
##### `ENCIPHER()`

- Description: TODO

<a id="member-21"></a>
##### `EXPANDSTATE(long[] buf, long a, long b, int c, int d)`

- Description: TODO

<a id="member-22"></a>
##### `EXPANDSTATE_NULL(long[] buf, int a, int b)`

- Description: TODO

<a id="member-23"></a>
##### `ENCRYPT_P()`

- Description: TODO

<a id="member-24"></a>
##### `ENCRYPT_S()`

- Description: TODO

<a id="member-25"></a>
##### `REKEY(byte[] key)`

- Description: TODO

<a id="member-26"></a>
##### `Instance(int cost_t, int cost_m)`

- Description: TODO

<a id="member-27"></a>
##### `hash(byte[] key_r, byte[] salt_r)`

- Description: TODO

<a id="member-28"></a>
##### `hash(byte[] key, byte[] salt, int t, int m)`

- Description: TODO

<a id="member-29"></a>
##### `main(String[] args)`

- Description: TODO
