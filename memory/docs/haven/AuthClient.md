# AuthClient

## Meta

- Source: [AuthClient.java](../../../src/haven/AuthClient.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Handles authentication client logic.

## Code Members

### Member Index

#### Constants

- [DEFPORT](#member-1)
- [N](#member-43)

#### Fields

- [strictcert](#member-2)
- [ssl](#member-3)
- [sk](#member-4)
- [ssk](#member-5)
- [skin](#member-6)
- [skout](#member-7)
- [bk](#member-8)
- [key](#member-9)
- [senthead](#member-10)
- [id](#member-24)
- [desc](#member-25)
- [digest](#member-42)
- [g](#member-44)
- [k](#member-45)
- [A](#member-46)
- [K](#member-47)
- [username](#member-53)
- [pw](#member-54)
- [clean](#member-55)
- [acctname](#member-63)
- [token](#member-64)
- [clean](#member-65)

#### Methods

- [Obfuscation(ByteChannel bk)](#member-11)
- [obf(ByteBuffer data, int a, int b)](#member-12)
- [public int read(ByteBuffer dst) throws IOException](#member-13)
- [public int write(ByteBuffer src) throws IOException](#member-14)
- [public void close() throws IOException](#member-15)
- [isOpen()](#member-16)
- [private void connect(NamedSocketAddress srv, boolean obf) throws IOException](#member-17)
- [private void checkname(String host, SSLSession sess) throws IOException](#member-18)
- [address()](#member-19)
- [public byte[] getcookie() throws IOException](#member-20)
- [public String getalias() throws IOException](#member-21)
- [public List<Map<?, ?>> gethosts() throws IOException](#member-22)
- [public List<NamedSocketAddress> gethosts(NamedSocketAddress defaults) throws IOException](#member-23)
- [id(byte[] id)](#member-26)
- [desc(String desc)](#member-27)
- [encode()](#member-28)
- [forhost()](#member-29)
- [public byte[] gettoken(TokenInfo info) throws IOException](#member-30)
- [public byte[] gettoken() throws IOException](#member-31)
- [public void close() throws IOException](#member-32)
- [private void sendmsg(MessageBuf msg) throws IOException](#member-33)
- [private void esendmsg(Object... args) throws IOException](#member-34)
- [private static void readall(InputStream in, byte[] buf) throws IOException](#member-35)
- [private Message recvmsg() throws IOException](#member-36)
- [public Message cmd(Object... args) throws IOException](#member-37)
- [public abstract String tryauth(AuthClient cl) throws IOException;](#member-38)
- [public abstract String name();](#member-39)
- [discard()](#member-40)
- [AuthException(String msg)](#member-41)
- [n(long v)](#member-48)
- [b2i(byte[] b)](#member-49)
- [i2b(BigInteger i)](#member-50)
- [SrpAssertion(byte[] phash, byte[] Bb)](#member-51)
- [sign(byte[] msg)](#member-52)
- [NativeCred(String username, byte[] pw)](#member-56)
- [NativeCred(String username, String pw)](#member-57)
- [name()](#member-58)
- [prehash(byte[] pw, Object[] spec)](#member-59)
- [private byte[] hashpw(AuthClient cl) throws IOException](#member-60)
- [public String tryauth(AuthClient cl) throws IOException](#member-61)
- [discard()](#member-62)
- [TokenCred(String acctname, byte[] token)](#member-66)
- [name()](#member-67)
- [public String tryauth(AuthClient cl) throws IOException](#member-68)
- [discard()](#member-69)
- [public static void main(final String[] args) throws Exception](#member-70)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `DEFPORT`

- Description: TODO

<a id="member-43"></a>
##### `N`

- Description: TODO

#### Fields

<a id="member-2"></a>
##### `strictcert`

- Description: TODO

<a id="member-3"></a>
##### `ssl`

- Description: TODO

<a id="member-4"></a>
##### `sk`

- Description: TODO

<a id="member-5"></a>
##### `ssk`

- Description: TODO

<a id="member-6"></a>
##### `skin`

- Description: TODO

<a id="member-7"></a>
##### `skout`

- Description: TODO

<a id="member-8"></a>
##### `bk`

- Description: TODO

<a id="member-9"></a>
##### `key`

- Description: TODO

<a id="member-10"></a>
##### `senthead`

- Description: TODO

<a id="member-24"></a>
##### `id`

- Description: TODO

<a id="member-25"></a>
##### `desc`

- Description: TODO

<a id="member-42"></a>
##### `digest`

- Description: TODO

<a id="member-44"></a>
##### `g`

- Description: TODO

<a id="member-45"></a>
##### `k`

- Description: TODO

<a id="member-46"></a>
##### `A`

- Description: TODO

<a id="member-47"></a>
##### `K`

- Description: TODO

<a id="member-53"></a>
##### `username`

- Description: TODO

<a id="member-54"></a>
##### `pw`

- Description: TODO

<a id="member-55"></a>
##### `clean`

- Description: TODO

<a id="member-63"></a>
##### `acctname`

- Description: TODO

<a id="member-64"></a>
##### `token`

- Description: TODO

<a id="member-65"></a>
##### `clean`

- Description: TODO

#### Methods

<a id="member-11"></a>
##### `Obfuscation(ByteChannel bk)`

- Description: TODO

<a id="member-12"></a>
##### `obf(ByteBuffer data, int a, int b)`

- Description: TODO

<a id="member-13"></a>
##### `public int read(ByteBuffer dst) throws IOException`

- Description: TODO

<a id="member-14"></a>
##### `public int write(ByteBuffer src) throws IOException`

- Description: TODO

<a id="member-15"></a>
##### `public void close() throws IOException`

- Description: TODO

<a id="member-16"></a>
##### `isOpen()`

- Description: TODO

<a id="member-17"></a>
##### `private void connect(NamedSocketAddress srv, boolean obf) throws IOException`

- Description: TODO

<a id="member-18"></a>
##### `private void checkname(String host, SSLSession sess) throws IOException`

- Description: TODO

<a id="member-19"></a>
##### `address()`

- Description: TODO

<a id="member-20"></a>
##### `public byte[] getcookie() throws IOException`

- Description: TODO

<a id="member-21"></a>
##### `public String getalias() throws IOException`

- Description: TODO

<a id="member-22"></a>
##### `public List<Map<?, ?>> gethosts() throws IOException`

- Description: TODO

<a id="member-23"></a>
##### `public List<NamedSocketAddress> gethosts(NamedSocketAddress defaults) throws IOException`

- Description: TODO

<a id="member-26"></a>
##### `id(byte[] id)`

- Description: TODO

<a id="member-27"></a>
##### `desc(String desc)`

- Description: TODO

<a id="member-28"></a>
##### `encode()`

- Description: TODO

<a id="member-29"></a>
##### `forhost()`

- Description: TODO

<a id="member-30"></a>
##### `public byte[] gettoken(TokenInfo info) throws IOException`

- Description: TODO

<a id="member-31"></a>
##### `public byte[] gettoken() throws IOException`

- Description: TODO

<a id="member-32"></a>
##### `public void close() throws IOException`

- Description: TODO

<a id="member-33"></a>
##### `private void sendmsg(MessageBuf msg) throws IOException`

- Description: TODO

<a id="member-34"></a>
##### `private void esendmsg(Object... args) throws IOException`

- Description: TODO

<a id="member-35"></a>
##### `private static void readall(InputStream in, byte[] buf) throws IOException`

- Description: TODO

<a id="member-36"></a>
##### `private Message recvmsg() throws IOException`

- Description: TODO

<a id="member-37"></a>
##### `public Message cmd(Object... args) throws IOException`

- Description: TODO

<a id="member-38"></a>
##### `public abstract String tryauth(AuthClient cl) throws IOException;`

- Description: TODO

<a id="member-39"></a>
##### `public abstract String name();`

- Description: TODO

<a id="member-40"></a>
##### `discard()`

- Description: TODO

<a id="member-41"></a>
##### `AuthException(String msg)`

- Description: TODO

<a id="member-48"></a>
##### `n(long v)`

- Description: TODO

<a id="member-49"></a>
##### `b2i(byte[] b)`

- Description: TODO

<a id="member-50"></a>
##### `i2b(BigInteger i)`

- Description: TODO

<a id="member-51"></a>
##### `SrpAssertion(byte[] phash, byte[] Bb)`

- Description: TODO

<a id="member-52"></a>
##### `sign(byte[] msg)`

- Description: TODO

<a id="member-56"></a>
##### `NativeCred(String username, byte[] pw)`

- Description: TODO

<a id="member-57"></a>
##### `NativeCred(String username, String pw)`

- Description: TODO

<a id="member-58"></a>
##### `name()`

- Description: TODO

<a id="member-59"></a>
##### `prehash(byte[] pw, Object[] spec)`

- Description: TODO

<a id="member-60"></a>
##### `private byte[] hashpw(AuthClient cl) throws IOException`

- Description: TODO

<a id="member-61"></a>
##### `public String tryauth(AuthClient cl) throws IOException`

- Description: TODO

<a id="member-62"></a>
##### `discard()`

- Description: TODO

<a id="member-66"></a>
##### `TokenCred(String acctname, byte[] token)`

- Description: TODO

<a id="member-67"></a>
##### `name()`

- Description: TODO

<a id="member-68"></a>
##### `public String tryauth(AuthClient cl) throws IOException`

- Description: TODO

<a id="member-69"></a>
##### `discard()`

- Description: TODO

<a id="member-70"></a>
##### `public static void main(final String[] args) throws Exception`

- Description: TODO
