# Blake2b

## Meta

- Source: [Blake2b.java](../../../src/haven/Blake2b.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides BLAKE2b hashing support.

## Code Members

### Member Index

#### Constants

- [BLOCKBYTES](#member-1)
- [OUTBYTES](#member-2)
- [KEYBYTES](#member-3)
- [SALTBYTES](#member-4)
- [PERSONALBYTES](#member-5)
- [IV](#member-6)

#### Fields

- [�](#member-7)
- [digest_length](#member-8)
- [key_length](#member-9)
- [fanout](#member-10)
- [depth](#member-11)
- [leaf_length](#member-12)
- [node_offset](#member-13)
- [xof_length](#member-14)
- [node_depth](#member-15)
- [inner_length](#member-16)
- [salt](#member-17)
- [personal](#member-18)
- [zygote](#member-19)
- [first](#member-20)
- [h](#member-25)
- [t](#member-26)
- [f](#member-27)
- [buf](#member-28)
- [outlen](#member-29)
- [buflen](#member-30)
- [last_node](#member-31)

#### Methods

- [diglen()](#member-21)
- [blocklen()](#member-22)
- [get()](#member-23)
- [packed()](#member-24)
- [State()](#member-32)
- [State(State from)](#member-33)
- [increment_counter(long inc)](#member-34)
- [set_lastnode()](#member-35)
- [is_lastblock()](#member-36)
- [set_lastblock()](#member-37)
- [G(long[] m, long[] v, int r, int i, int a, int b, int c, int d)](#member-38)
- [ROUND(long[] m, long[] v, int r)](#member-39)
- [compress(byte[] buf, int off)](#member-40)
- [update(byte[] src, int off, int len)](#member-41)
- [digest()](#member-42)
- [copy()](#member-43)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `BLOCKBYTES`

- Description: TODO

<a id="member-2"></a>
##### `OUTBYTES`

- Description: TODO

<a id="member-3"></a>
##### `KEYBYTES`

- Description: TODO

<a id="member-4"></a>
##### `SALTBYTES`

- Description: TODO

<a id="member-5"></a>
##### `PERSONALBYTES`

- Description: TODO

<a id="member-6"></a>
##### `IV`

- Description: TODO

#### Fields

<a id="member-7"></a>
##### `�`

- Description: TODO

<a id="member-8"></a>
##### `digest_length`

- Description: TODO

<a id="member-9"></a>
##### `key_length`

- Description: TODO

<a id="member-10"></a>
##### `fanout`

- Description: TODO

<a id="member-11"></a>
##### `depth`

- Description: TODO

<a id="member-12"></a>
##### `leaf_length`

- Description: TODO

<a id="member-13"></a>
##### `node_offset`

- Description: TODO

<a id="member-14"></a>
##### `xof_length`

- Description: TODO

<a id="member-15"></a>
##### `node_depth`

- Description: TODO

<a id="member-16"></a>
##### `inner_length`

- Description: TODO

<a id="member-17"></a>
##### `salt`

- Description: TODO

<a id="member-18"></a>
##### `personal`

- Description: TODO

<a id="member-19"></a>
##### `zygote`

- Description: TODO

<a id="member-20"></a>
##### `first`

- Description: TODO

<a id="member-25"></a>
##### `h`

- Description: TODO

<a id="member-26"></a>
##### `t`

- Description: TODO

<a id="member-27"></a>
##### `f`

- Description: TODO

<a id="member-28"></a>
##### `buf`

- Description: TODO

<a id="member-29"></a>
##### `outlen`

- Description: TODO

<a id="member-30"></a>
##### `buflen`

- Description: TODO

<a id="member-31"></a>
##### `last_node`

- Description: TODO

#### Methods

<a id="member-21"></a>
##### `diglen()`

- Description: TODO

<a id="member-22"></a>
##### `blocklen()`

- Description: TODO

<a id="member-23"></a>
##### `get()`

- Description: TODO

<a id="member-24"></a>
##### `packed()`

- Description: TODO

<a id="member-32"></a>
##### `State()`

- Description: TODO

<a id="member-33"></a>
##### `State(State from)`

- Description: TODO

<a id="member-34"></a>
##### `increment_counter(long inc)`

- Description: TODO

<a id="member-35"></a>
##### `set_lastnode()`

- Description: TODO

<a id="member-36"></a>
##### `is_lastblock()`

- Description: TODO

<a id="member-37"></a>
##### `set_lastblock()`

- Description: TODO

<a id="member-38"></a>
##### `G(long[] m, long[] v, int r, int i, int a, int b, int c, int d)`

- Description: TODO

<a id="member-39"></a>
##### `ROUND(long[] m, long[] v, int r)`

- Description: TODO

<a id="member-40"></a>
##### `compress(byte[] buf, int off)`

- Description: TODO

<a id="member-41"></a>
##### `update(byte[] src, int off, int len)`

- Description: TODO

<a id="member-42"></a>
##### `digest()`

- Description: TODO

<a id="member-43"></a>
##### `copy()`

- Description: TODO
