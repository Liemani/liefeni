---
source: [AuthClient.java](../../../../src/haven/AuthClient.java)
created: 2026-06-13
updated: 2026-06-14
---

# AuthClient

Represents the auth client Haven component.

## Nested Types

### AuthException

- Role: Signals an authentication failure.
- Description: Runtime exception raised when authentication cannot complete.

### Credentials

- Role: Stores one credential set.
- Description: Username/password or token-based credential container used for authentication.

### NativeCred

- Role: Stores native authentication credentials.
- Description: Credentials sourced from the native platform or client environment.

### Obfuscation

- Role: Describes password obfuscation.
- Description: Helper used to mask or transform credential input before transport.

### SrpAssertion

- Role: Carries an SRP assertion.
- Description: SRP-derived proof used during secure authentication.

### TokenCred

- Role: Stores token-based credentials.
- Description: Credential subtype that authenticates with a token instead of a password.

### TokenInfo

- Role: Stores token metadata.
- Description: Information associated with token lifetime and validation state.

## Members

### Constants

#### `public static final int DEFPORT = 1871`
- Role: Caches the defport value.
- Description: Caches the `DEFPORT` value for reuse.
- Value: `1871`

#### `public static final Config.Variable<Boolean> strictcert = Config.Variable.propb("haven.auth-cert-strict", true)`
- Role: Implements the strictcert operation.
- Description: Implements the propb operation.
- Value: `Config.Variable.propb("haven.auth-cert-strict", true)`

#### `private static final SslHelper ssl`
#### `private static final SslHelper ssl`
- Role: Caches the ssl value.
- Description: Caches the `ssl` value for reuse.

#### `public static final Digest.Algorithm digest = Digest.SHA256`
- Role: Caches the digest value.
- Description: Caches the `digest` value for reuse.
- Value: `Digest.SHA256`

#### `public static final BigInteger N = b2i(new byte[]`
- Role: Implements the n operation.
- Description: Implements the b2i operation.
- Value: `b2i(new byte[]`

#### `public static final BigInteger g = n(2)`
- Role: Implements the g operation.
- Description: Implements the n operation.
- Value: `n(2)`

#### `public static final BigInteger k = b2i(Digest.hash(digest, i2b(N), i2b(g)))`
- Role: Implements the k operation.
- Description: Implements the i2b operation.
- Value: `b2i(Digest.hash(digest, i2b(N), i2b(g)))`

### Fields

#### `private SocketChannel sk`
- Role: Caches the sk value.
- Description: Caches the `sk` value for reuse.

#### `private SslChannel ssk`
- Role: Caches the ssk value.
- Description: Caches the `ssk` value for reuse.

#### `private final InputStream skin`
- Role: Caches the skin value.
- Description: Caches the `skin` value for reuse.

#### `private final OutputStream skout`
- Role: Caches the skout value.
- Description: Caches the `skout` value for reuse.

#### `public final ByteChannel bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public byte key = (byte)0xa5`
- Role: Implements the key operation.
- Description: Implements the public byte key = (byte)0xa5 operation.

#### `private boolean senthead = false`
- Role: Tracks the senthead flag.
- Description: Caches the `senthead` value for reuse.

#### `public byte[] id = new byte[]`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public String desc = ""`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `public final byte[] A`
- Role: Caches the a value.
- Description: Caches the `A` value for reuse.

#### `public final byte[] K`
- Role: Caches the k value.
- Description: Caches the `K` value for reuse.

#### `public final String username`
- Role: Caches the username value.
- Description: Caches the `username` value for reuse.

#### `private final byte[] pw`
- Role: Caches the pw value.
- Description: Caches the `pw` value for reuse.

#### `private final Runnable clean`
- Role: Caches the clean value.
- Description: Caches the `clean` value for reuse.

#### `public final String acctname`
- Role: Caches the acctname value.
- Description: Caches the `acctname` value for reuse.

#### `public final byte[] token`
- Role: Caches the token value.
- Description: Caches the `token` value for reuse.

#### `private final Runnable clean`
- Role: Caches the clean value.
- Description: Caches the `clean` value for reuse.

### Methods

#### `public Obfuscation(ByteChannel bk)`
- Role: Handles the obfuscation path.
- Description: Implements the obfuscation operation.

#### `private void obf(ByteBuffer data, int a, int b)`
- Role: Handles the obf path.
- Description: Implements the obf operation.

#### `public int read(ByteBuffer dst) throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public int write(ByteBuffer src) throws IOException`
- Role: Writes the target data.
- Description: Implements the write operation.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public boolean isOpen()`
- Role: Checks whether the open.
- Description: Returns whether the condition is satisfied.

#### `private void connect(NamedSocketAddress srv, boolean obf) throws IOException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `public AuthClient(NamedSocketAddress srv) throws IOException`
- Role: Creates a new AuthClient instance.
- Description: Constructs the AuthClient instance from the supplied inputs.

#### `private void checkname(String host, SSLSession sess) throws IOException`
- Role: Handles the checkname workflow.
- Description: Implements the checkname operation.

#### `public SocketAddress address()`
- Role: Handles the address path.
- Description: Adds the ress.

#### `public byte[] getcookie() throws IOException`
- Role: Returns the cookie.
- Description: Returns the cookie.

#### `public String getalias() throws IOException`
- Role: Returns the alias.
- Description: Returns the alias.

#### `public List<Map<?, ?>> gethosts() throws IOException`
- Role: Returns the hosts.
- Description: Returns the hosts.

#### `public List<NamedSocketAddress> gethosts(NamedSocketAddress defaults) throws IOException`
- Role: Returns the hosts.
- Description: Returns the hosts.

#### `public TokenInfo id(byte[] id)`
- Role: Handles the id path.
- Description: Implements the id operation.

#### `public TokenInfo desc(String desc)`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public Object[] encode()`
- Role: Handles the encode path.
- Description: Implements the encode operation.

#### `public static TokenInfo forhost()`
- Role: Handles the forhost path.
- Description: Implements the forhost operation.

#### `public byte[] gettoken(TokenInfo info) throws IOException`
- Role: Returns the token.
- Description: Returns the token.

#### `public byte[] gettoken() throws IOException`
- Role: Returns the token.
- Description: Returns the token.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `private void sendmsg(MessageBuf msg) throws IOException`
- Role: Handles the sendmsg workflow.
- Description: Implements the sendmsg operation.

#### `private void esendmsg(Object... args) throws IOException`
- Role: Handles the esendmsg workflow.
- Description: Implements the esendmsg operation.

#### `private static void readall(InputStream in, byte[] buf) throws IOException`
- Role: Handles the readall workflow.
- Description: Implements the readall operation.

#### `private Message recvmsg() throws IOException`
- Role: Handles the recvmsg workflow.
- Description: Implements the recvmsg operation.

#### `public Message cmd(Object... args) throws IOException`
- Role: Handles the cmd workflow.
- Description: Implements the cmd operation.

#### `public abstract String tryauth(AuthClient cl) throws IOException`
- Role: Handles the tryauth workflow.
- Description: Implements the tryauth operation.

#### `public abstract String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public void discard()`
- Role: Handles the discard path.
- Description: Implements the discard operation.

#### `public AuthException(String msg)`
- Role: Handles the auth exception path.
- Description: Implements the auth exception operation.

#### `public static BigInteger n(long v)`
- Role: Handles the n path.
- Description: Implements the n operation.

#### `public static BigInteger b2i(byte[] b)`
- Role: Handles the b2i path.
- Description: Implements the b2i operation.

#### `public static byte[] i2b(BigInteger i)`
- Role: Handles the i2b path.
- Description: Implements the i2b operation.

#### `public SrpAssertion(byte[] phash, byte[] Bb)`
- Role: Handles the srp assertion path.
- Description: Implements the srp assertion operation.

#### `public byte[] sign(byte[] msg)`
- Role: Handles the sign path.
- Description: Implements the sign operation.

#### `public NativeCred(String username, byte[] pw)`
- Role: Handles the native cred path.
- Description: Implements the native cred operation.

#### `public NativeCred(String username, String pw)`
- Role: Handles the native cred path.
- Description: Implements the native cred operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public static byte[] prehash(byte[] pw, Object[] spec)`
- Role: Handles the prehash path.
- Description: Implements the prehash operation.

#### `private byte[] hashpw(AuthClient cl) throws IOException`
- Role: Handles the hashpw workflow.
- Description: Returns whether the hpw is present.

#### `public String tryauth(AuthClient cl) throws IOException`
- Role: Handles the tryauth workflow.
- Description: Implements the tryauth operation.

#### `public void discard()`
- Role: Handles the discard path.
- Description: Implements the discard operation.

#### `public TokenCred(String acctname, byte[] token)`
- Role: Handles the token cred path.
- Description: Implements the token cred operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public String tryauth(AuthClient cl) throws IOException`
- Role: Handles the tryauth workflow.
- Description: Implements the tryauth operation.

#### `public void discard()`
- Role: Handles the discard path.
- Description: Implements the discard operation.

#### `public static void main(final String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.