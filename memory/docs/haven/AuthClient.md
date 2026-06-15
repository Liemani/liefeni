# AuthClient

This file documents the responsibilities and members of `AuthClient`.

## Meta

- Source: [AuthClient.java](../../../src/haven/AuthClient.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles authentication client logic.

## Nested Types

### AuthException

- Description: TODO

### Credentials

- Description: TODO

### NativeCred

- Description: TODO

### Obfuscation

- Description: TODO

### SrpAssertion

- Description: TODO

### TokenCred

- Description: TODO

### TokenInfo

- Description: TODO

## Members

### Constants

#### `public static final int DEFPORT = 1871`

- Description: TODO

#### `public static final Config.Variable<Boolean> strictcert = Config.Variable.propb("haven.auth-cert-strict", true)`

- Description: TODO

#### `private static final SslHelper ssl`

- Description: TODO

#### `public static final Digest.Algorithm digest = Digest.SHA256`

- Description: TODO

#### `public static final BigInteger N = b2i(new byte[]`

- Description: TODO

#### `public static final BigInteger g = n(2)`

- Description: TODO

#### `public static final BigInteger k = b2i(Digest.hash(digest, i2b(N), i2b(g)))`

- Description: TODO

### Fields

#### `private SocketChannel sk`

- Description: TODO

#### `private SslChannel ssk`

- Description: TODO

#### `private final InputStream skin`

- Description: TODO

#### `private final OutputStream skout`

- Description: TODO

#### `public final ByteChannel bk`

- Description: TODO

#### `public byte key = (byte)0xa5`

- Description: TODO

#### `private boolean senthead = false`

- Description: TODO

#### `public byte[] id = new byte[]`

- Description: TODO

#### `public String desc = ""`

- Description: TODO

#### `public final byte[] A`

- Description: TODO

#### `public final byte[] K`

- Description: TODO

#### `public final String username`

- Description: TODO

#### `private final byte[] pw`

- Description: TODO

#### `private final Runnable clean`

- Description: TODO

#### `public final String acctname`

- Description: TODO

#### `public final byte[] token`

- Description: TODO

#### `private final Runnable clean`

- Description: TODO

### Methods

#### `public Obfuscation(ByteChannel bk)`

- Description: TODO

#### `private void obf(ByteBuffer data, int a, int b)`

- Description: TODO

#### `public int read(ByteBuffer dst) throws IOException`

- Description: TODO

#### `public int write(ByteBuffer src) throws IOException`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `public boolean isOpen()`

- Description: TODO

#### `private void connect(NamedSocketAddress srv, boolean obf) throws IOException`

- Description: TODO

#### `public AuthClient(NamedSocketAddress srv) throws IOException`

- Description: TODO

#### `private void checkname(String host, SSLSession sess) throws IOException`

- Description: TODO

#### `public SocketAddress address()`

- Description: TODO

#### `public byte[] getcookie() throws IOException`

- Description: TODO

#### `public String getalias() throws IOException`

- Description: TODO

#### `public List<Map<?, ?>> gethosts() throws IOException`

- Description: TODO

#### `public List<NamedSocketAddress> gethosts(NamedSocketAddress defaults) throws IOException`

- Description: TODO

#### `public TokenInfo id(byte[] id)`

- Description: TODO

#### `public TokenInfo desc(String desc)`

- Description: TODO

#### `public Object[] encode()`

- Description: TODO

#### `public static TokenInfo forhost()`

- Description: TODO

#### `public byte[] gettoken(TokenInfo info) throws IOException`

- Description: TODO

#### `public byte[] gettoken() throws IOException`

- Description: TODO

#### `public void close() throws IOException`

- Description: TODO

#### `private void sendmsg(MessageBuf msg) throws IOException`

- Description: TODO

#### `private void esendmsg(Object... args) throws IOException`

- Description: TODO

#### `private static void readall(InputStream in, byte[] buf) throws IOException`

- Description: TODO

#### `private Message recvmsg() throws IOException`

- Description: TODO

#### `public Message cmd(Object... args) throws IOException`

- Description: TODO

#### `public abstract String tryauth(AuthClient cl) throws IOException`

- Description: TODO

#### `public abstract String name()`

- Description: TODO

#### `public void discard()`

- Description: TODO

#### `public AuthException(String msg)`

- Description: TODO

#### `public static BigInteger n(long v)`

- Description: TODO

#### `public static BigInteger b2i(byte[] b)`

- Description: TODO

#### `public static byte[] i2b(BigInteger i)`

- Description: TODO

#### `public SrpAssertion(byte[] phash, byte[] Bb)`

- Description: TODO

#### `public byte[] sign(byte[] msg)`

- Description: TODO

#### `public NativeCred(String username, byte[] pw)`

- Description: TODO

#### `public NativeCred(String username, String pw)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public static byte[] prehash(byte[] pw, Object[] spec)`

- Description: TODO

#### `private byte[] hashpw(AuthClient cl) throws IOException`

- Description: TODO

#### `public String tryauth(AuthClient cl) throws IOException`

- Description: TODO

#### `public void discard()`

- Description: TODO

#### `public TokenCred(String acctname, byte[] token)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public String tryauth(AuthClient cl) throws IOException`

- Description: TODO

#### `public void discard()`

- Description: TODO

#### `public static void main(final String[] args) throws Exception`

- Description: TODO
