# AuthClient

This file documents the responsibilities and members of `AuthClient`.

## Meta

- Source: [AuthClient.java](../../../src/haven/AuthClient.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the auth client Haven component.

## Nested Types

### AuthException

- Role: Represents auth exception within AuthClient.
- Description: Describes the nested auth exception type used by the enclosing class.

### Credentials

- Role: Represents credentials within AuthClient.
- Description: Describes the nested credentials type used by the enclosing class.

### NativeCred

- Role: Represents native cred within AuthClient.
- Description: Describes the nested native cred type used by the enclosing class.

### Obfuscation

- Role: Represents obfuscation within AuthClient.
- Description: Describes the nested obfuscation type used by the enclosing class.

### SrpAssertion

- Role: Represents srp assertion within AuthClient.
- Description: Describes the nested srp assertion type used by the enclosing class.

### TokenCred

- Role: Represents token cred within AuthClient.
- Description: Describes the nested token cred type used by the enclosing class.

### TokenInfo

- Role: Represents token info within AuthClient.
- Description: Describes the nested token info type used by the enclosing class.

## Members

### Constants

#### `public static final int DEFPORT = 1871`
- Role: Defines the shared defport constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Boolean> strictcert = Config.Variable.propb("haven.auth-cert-strict", true)`
- Role: Defines the shared strictcert constant.
- Description: Shared constant used by the rest of the class.

#### `private static final SslHelper ssl`
- Role: Defines the shared ssl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Digest.Algorithm digest = Digest.SHA256`
- Role: Defines the shared digest constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BigInteger N = b2i(new byte[]`
- Role: Defines the shared n constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BigInteger g = n(2)`
- Role: Defines the shared g constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BigInteger k = b2i(Digest.hash(digest, i2b(N), i2b(g)))`
- Role: Defines the shared k constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private SocketChannel sk`
- Role: Holds the sk state.
- Description: Backs the cached state for this file.

#### `private SslChannel ssk`
- Role: Holds the ssk state.
- Description: Backs the cached state for this file.

#### `private final InputStream skin`
- Role: Holds the skin state.
- Description: Backs the cached state for this file.

#### `private final OutputStream skout`
- Role: Holds the skout state.
- Description: Backs the cached state for this file.

#### `public final ByteChannel bk`
- Role: Stores the bk value.
- Description: Backs the cached state for this file.

#### `public byte key = (byte)0xa5`
- Role: Stores the key value.
- Description: Backs the cached state for this file.

#### `private boolean senthead = false`
- Role: Tracks the senthead flag.
- Description: Supports the senthead operation used by the surrounding class.

#### `public byte[] id = new byte[]`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public String desc = ""`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `public final byte[] A`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public final byte[] K`
- Role: Stores the k value.
- Description: Backs the cached state for this file.

#### `public final String username`
- Role: Stores the username value.
- Description: Backs the cached state for this file.

#### `private final byte[] pw`
- Role: Stores the pw value.
- Description: Backs the cached state for this file.

#### `private final Runnable clean`
- Role: Holds the clean state.
- Description: Backs the cached state for this file.

#### `public final String acctname`
- Role: Stores the acctname value.
- Description: Backs the cached state for this file.

#### `public final byte[] token`
- Role: Stores the token value.
- Description: Backs the cached state for this file.

#### `private final Runnable clean`
- Role: Holds the clean state.
- Description: Backs the cached state for this file.

### Methods

#### `public Obfuscation(ByteChannel bk)`
- Role: Performs obfuscation.
- Description: Supports the obfuscation operation used by the surrounding class.

#### `private void obf(ByteBuffer data, int a, int b)`
- Role: Performs obf.
- Description: Supports the obf operation used by the surrounding class.

#### `public int read(ByteBuffer dst) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public int write(ByteBuffer src) throws IOException`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public boolean isOpen()`
- Role: Checks whether the open.
- Description: Returns a boolean result for the described condition.

#### `private void connect(NamedSocketAddress srv, boolean obf) throws IOException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `public AuthClient(NamedSocketAddress srv) throws IOException`
- Role: Creates a new AuthClient instance.
- Description: Constructs the instance and initializes its default state.

#### `private void checkname(String host, SSLSession sess) throws IOException`
- Role: Handles the checkname workflow.
- Description: Supports the checkname operation used by the surrounding class.

#### `public SocketAddress address()`
- Role: Performs address.
- Description: Supports the address operation used by the surrounding class.

#### `public byte[] getcookie() throws IOException`
- Role: Returns the cookie value.
- Description: Exposes the requested value without mutating state.

#### `public String getalias() throws IOException`
- Role: Returns the alias value.
- Description: Exposes the requested value without mutating state.

#### `public List<Map<?, ?>> gethosts() throws IOException`
- Role: Returns the hosts value.
- Description: Exposes the requested value without mutating state.

#### `public List<NamedSocketAddress> gethosts(NamedSocketAddress defaults) throws IOException`
- Role: Returns the hosts value.
- Description: Exposes the requested value without mutating state.

#### `public TokenInfo id(byte[] id)`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public TokenInfo desc(String desc)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public Object[] encode()`
- Role: Performs encode.
- Description: Supports the encode operation used by the surrounding class.

#### `public static TokenInfo forhost()`
- Role: Performs forhost.
- Description: Supports the forhost operation used by the surrounding class.

#### `public byte[] gettoken(TokenInfo info) throws IOException`
- Role: Returns the token value.
- Description: Exposes the requested value without mutating state.

#### `public byte[] gettoken() throws IOException`
- Role: Returns the token value.
- Description: Exposes the requested value without mutating state.

#### `public void close() throws IOException`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `private void sendmsg(MessageBuf msg) throws IOException`
- Role: Handles the sendmsg workflow.
- Description: Supports the sendmsg operation used by the surrounding class.

#### `private void esendmsg(Object... args) throws IOException`
- Role: Handles the esendmsg workflow.
- Description: Supports the esendmsg operation used by the surrounding class.

#### `private static void readall(InputStream in, byte[] buf) throws IOException`
- Role: Handles the readall workflow.
- Description: Supports the readall operation used by the surrounding class.

#### `private Message recvmsg() throws IOException`
- Role: Handles the recvmsg workflow.
- Description: Supports the recvmsg operation used by the surrounding class.

#### `public Message cmd(Object... args) throws IOException`
- Role: Handles the cmd workflow.
- Description: Supports the cmd operation used by the surrounding class.

#### `public abstract String tryauth(AuthClient cl) throws IOException`
- Role: Handles the tryauth workflow.
- Description: Supports the tryauth operation used by the surrounding class.

#### `public abstract String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public void discard()`
- Role: Performs discard.
- Description: Supports the discard operation used by the surrounding class.

#### `public AuthException(String msg)`
- Role: Performs auth exception.
- Description: Supports the auth exception operation used by the surrounding class.

#### `public static BigInteger n(long v)`
- Role: Performs n.
- Description: Supports the n operation used by the surrounding class.

#### `public static BigInteger b2i(byte[] b)`
- Role: Performs b2i.
- Description: Supports the b2i operation used by the surrounding class.

#### `public static byte[] i2b(BigInteger i)`
- Role: Performs i2b.
- Description: Supports the i2b operation used by the surrounding class.

#### `public SrpAssertion(byte[] phash, byte[] Bb)`
- Role: Performs srp assertion.
- Description: Supports the srp assertion operation used by the surrounding class.

#### `public byte[] sign(byte[] msg)`
- Role: Performs sign.
- Description: Supports the sign operation used by the surrounding class.

#### `public NativeCred(String username, byte[] pw)`
- Role: Performs native cred.
- Description: Supports the native cred operation used by the surrounding class.

#### `public NativeCred(String username, String pw)`
- Role: Performs native cred.
- Description: Supports the native cred operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public static byte[] prehash(byte[] pw, Object[] spec)`
- Role: Performs prehash.
- Description: Supports the prehash operation used by the surrounding class.

#### `private byte[] hashpw(AuthClient cl) throws IOException`
- Role: Handles the hashpw workflow.
- Description: Supports the hashpw operation used by the surrounding class.

#### `public String tryauth(AuthClient cl) throws IOException`
- Role: Handles the tryauth workflow.
- Description: Supports the tryauth operation used by the surrounding class.

#### `public void discard()`
- Role: Performs discard.
- Description: Supports the discard operation used by the surrounding class.

#### `public TokenCred(String acctname, byte[] token)`
- Role: Performs token cred.
- Description: Supports the token cred operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public String tryauth(AuthClient cl) throws IOException`
- Role: Handles the tryauth workflow.
- Description: Supports the tryauth operation used by the surrounding class.

#### `public void discard()`
- Role: Performs discard.
- Description: Supports the discard operation used by the surrounding class.

#### `public static void main(final String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
