---
source: [Connection.java](../../../../src/haven/Connection.java)
created: 2026-06-13
updated: 2026-06-14
---

# Connection

Represents the connection Haven component.

## Nested Types

### Close

- Role: Signals a connection close request.
- Description: Wraps the close operation so it can be queued on the connection thread.

### Connect

- Role: Opens a session connection.
- Description: Carries the parameters needed to establish a network session.

### Crypto

- Role: Wraps the connection crypto layer.
- Description: Handles encryption and decryption for the session transport.

### DecryptException

- Role: Represents a decryption failure.
- Description: Checked exception raised when a packet cannot be decrypted.

### Main

- Role: Runs the connection worker entry point.
- Description: Main worker thread that performs socket polling and packet processing.

### ObjAck

- Role: Tracks object-ack pacing.
- Description: Internal state used to regulate object acknowledgment timing.

### SessionAuthError

- Role: Represents session authentication failure.
- Description: Error raised when the server rejects session authentication.

### SessionBusyError

- Role: Represents a busy-session rejection.
- Description: Error raised when the server reports that the session is already occupied.

### SessionConnError

- Role: Represents a connection failure during session setup.
- Description: Error raised when the client cannot connect to the server.

### SessionError

- Role: Base type for session connection failures.
- Description: Marks errors that can occur while opening or maintaining a session.

### SessionExprError

- Role: Represents an expired-session rejection.
- Description: Error raised when the server reports that the session has expired.

### SessionPVerError

- Role: Represents a protocol-version mismatch.
- Description: Error raised when the server rejects the client for version incompatibility.

### Stats

- Role: Collects connection transport statistics.
- Description: Mutable RTT and packet counters for the live connection.

### Task

- Role: Represents a queued connection task.
- Description: Base type for commands executed by the connection worker thread.

### Worker

- Role: Runs the connection event loop.
- Description: Daemon thread that executes queued tasks and processes socket I/O.

## Members

### Constants

#### `public static final Config.Variable<Boolean> encrypt = Config.Variable.propb("haven.hcrypt", false)`
- Role: Implements the encrypt operation.
- Description: Implements the propb operation.
- Value: `Config.Variable.propb("haven.hcrypt", false)`

#### `private static final double ACK_HOLD = 0.030`
- Role: Caches the ack hold value.
- Description: Caches the `ACK_HOLD` value for reuse.
- Value: `0.030`

#### `private static final double OBJACK_HOLD = 0.08, OBJACK_HOLD_MAX = 0.5`
- Role: Caches the objack hold value.
- Description: Caches the `OBJACK_HOLD` value for reuse.
- Value: `0.08, OBJACK_HOLD_MAX = 0.5`

#### `private static final double OBJACK_HOLD = 0.08, OBJACK_HOLD_MAX = 0.5`
- Role: Caches the objack hold value.
- Description: Caches the `OBJACK_HOLD` value for reuse.
- Value: `0.08, OBJACK_HOLD_MAX = 0.5`

#### `private static final String[] apfx =`
- Role: Caches the apfx value.
- Description: Caches the `apfx` value for reuse.
- Value: ``

### Fields

#### `public final SocketAddress server`
- Role: Caches the server value.
- Description: Caches the `server` value for reuse.

#### `public final Stats stats = new Stats()`
- Role: Implements the stats operation.
- Description: Implements the stats operation.

#### `private final Collection<Callback> cbs = new ArrayList<>()`
- Role: Implements the cbs operation.
- Description: Implements the private final collection<callback> cbs = new array list<>() operation.

#### `private final DatagramChannel sk`
- Role: Caches the sk value.
- Description: Caches the `sk` value for reuse.

#### `private final Selector sel`
- Role: Caches the sel value.
- Description: Caches the `sel` value for reuse.

#### `private final SelectionKey key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `private Worker worker`
- Role: Caches the worker value.
- Description: Caches the `worker` value for reuse.

#### `private int tseq`
- Role: Caches the tseq value.
- Description: Caches the `tseq` value for reuse.

#### `private boolean alive = true`
- Role: Tracks the alive flag.
- Description: Caches the `alive` value for reuse.

#### `private Crypto crypt`
- Role: Caches the crypt value.
- Description: Caches the `crypt` value for reuse.

#### `private final Cipher cipher`
- Role: Caches the cipher value.
- Description: Caches the `cipher` value for reuse.

#### `private final Key tkey, rkey`
- Role: Caches the rkey value.
- Description: Caches the `rkey` value for reuse.

#### `private final Key tkey, rkey`
- Role: Caches the rkey value.
- Description: Caches the `rkey` value for reuse.

#### `private final NavigableSet<Long> rseqs = new TreeSet<>()`
- Role: Implements the rseqs operation.
- Description: Implements the private final navigable set<long> rseqs = new tree set<>() operation.

#### `private long tseq`
- Role: Caches the tseq value.
- Description: Caches the `tseq` value for reuse.

#### `private final double[] rpltimes = new double[32]`
- Role: Caches the rpltimes value.
- Description: Caches the `rpltimes` value for reuse.

#### `private long ptx, prx, pretx`
- Role: Caches the pretx value.
- Description: Caches the `pretx` value for reuse.

#### `private long ptx, prx, pretx`
- Role: Caches the pretx value.
- Description: Caches the `pretx` value for reuse.

#### `private long ptx, prx, pretx`
- Role: Caches the pretx value.
- Description: Caches the `pretx` value for reuse.

#### `private long btx, brx, prerx, prorx`
- Role: Caches the prorx value.
- Description: Caches the `prorx` value for reuse.

#### `private long btx, brx, prerx, prorx`
- Role: Caches the prorx value.
- Description: Caches the `prorx` value for reuse.

#### `private long btx, brx, prerx, prorx`
- Role: Caches the prorx value.
- Description: Caches the `prorx` value for reuse.

#### `private long btx, brx, prerx, prorx`
- Role: Caches the prorx value.
- Description: Caches the `prorx` value for reuse.

#### `private int rplhead = 0, nrpls = 0`
- Role: Caches the rplhead value.
- Description: Caches the `rplhead` value for reuse.

#### `private int rplhead = 0, nrpls = 0`
- Role: Caches the rplhead value.
- Description: Caches the `rplhead` value for reuse.

#### `private double srtt, rttv`
- Role: Caches the rttv value.
- Description: Caches the `rttv` value for reuse.

#### `private double srtt, rttv`
- Role: Caches the rttv value.
- Description: Caches the `rttv` value for reuse.

#### `private Task init`
- Role: Caches the init value.
- Description: Caches the `init` value for reuse.

#### `private final ByteBuffer recvbuf = ByteBuffer.allocate(65536)`
- Role: Implements the recvbuf operation.
- Description: Implements the allocate operation.

#### `private final List<RMessage> pending = new LinkedList<>()`
- Role: Implements the pending operation.
- Description: Implements the private final list<r message> pending = new linked list<>() operation.

#### `private final PMessage msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

#### `private int result = -1`
- Role: Caches the result value.
- Description: Caches the `result` value for reuse.

#### `private Throwable cause`
- Role: Caches the cause value.
- Description: Caches the `cause` value for reuse.

#### `private String message`
- Role: Caches the message value.
- Description: Caches the `message` value for reuse.

#### `private Crypto crypt`
- Role: Caches the crypt value.
- Description: Caches the `crypt` value for reuse.

#### `long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `int frame`
- Role: Caches the frame value.
- Description: Caches the `frame` value for reuse.

#### `double frecv, lrecv`
- Role: Caches the lrecv value.
- Description: Caches the `lrecv` value for reuse.

#### `double frecv, lrecv`
- Role: Caches the lrecv value.
- Description: Caches the `lrecv` value for reuse.

#### `private final Map<Short, RMessage> waiting = new HashMap<>()`
- Role: Implements the waiting operation.
- Description: Implements the private final map<short, r message> waiting = new hash map<>() operation.

#### `private final Map<Long, ObjAck> objacks = new HashMap<>()`
- Role: Implements the objacks operation.
- Description: Implements the private final map<long, obj ack> objacks = new hash map<>() operation.

#### `private double now, lasttx`
- Role: Caches the last tx.
- Description: Caches the last tx value.

#### `private double now, lasttx`
- Role: Caches the last tx.
- Description: Caches the last tx value.

#### `private short rseq, ackseq`
- Role: Caches the ackseq value.
- Description: Caches the `ackseq` value for reuse.

#### `private short rseq, ackseq`
- Role: Caches the ackseq value.
- Description: Caches the `ackseq` value for reuse.

#### `private double acktime = -1`
- Role: Caches the acktime value.
- Description: Caches the `acktime` value for reuse.

#### `private byte[] fragbuf = null`
- Role: Caches the fragbuf value.
- Description: Caches the `fragbuf` value for reuse.

#### `private int fragtype`
- Role: Caches the fragtype value.
- Description: Caches the `fragtype` value for reuse.

#### `private boolean sawclose`
- Role: Tracks the sawclose flag.
- Description: Caches the `sawclose` value for reuse.

#### `public final int code`
- Role: Caches the code value.
- Description: Caches the `code` value for reuse.

### Methods

#### `public Connection(SocketAddress server)`
- Role: Creates a new Connection instance.
- Description: Constructs the Connection instance from the supplied inputs.

#### `public Connection add(Callback cb)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public DecryptException(String msg, Throwable cause)`
- Role: Handles the decrypt exception path.
- Description: Implements the decrypt exception operation.

#### `public DecryptException(String msg)`
- Role: Handles the decrypt exception path.
- Description: Implements the decrypt exception operation.

#### `private static boolean supported()`
- Role: Handles the supported path.
- Description: Implements the supported operation.

#### `private Crypto(byte[] cookie, byte[] salt)`
- Role: Handles the crypto path.
- Description: Implements the crypto operation.

#### `public synchronized byte[] encrypt(byte[] msg)`
- Role: Handles the encrypt path.
- Description: Implements the encrypt operation.

#### `public synchronized byte[] decrypt(byte[] msg) throws DecryptException`
- Role: Handles the decrypt workflow.
- Description: Implements the decrypt operation.

#### `public PMessage encrypt(PMessage msg)`
- Role: Handles the encrypt path.
- Description: Implements the encrypt operation.

#### `public PMessage decrypt(MessageBuf msg) throws DecryptException`
- Role: Handles the decrypt workflow.
- Description: Implements the decrypt operation.

#### `private void addreply(double time)`
- Role: Handles the addreply path.
- Description: Adds the reply.

#### `private String abbr(String fmt, double n)`
- Role: Handles the abbr path.
- Description: Implements the abbr operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Connection for debugging and logging.

#### `private Worker(Task init)`
- Role: Handles the worker path.
- Description: Implements the worker operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public Task run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private void start(Task init)`
- Role: Starts the current workflow.
- Description: Implements the start operation.

#### `public boolean alive()`
- Role: Handles the alive path.
- Description: Implements the alive operation.

#### `private PMessage recv() throws IOException`
- Role: Handles the recv workflow.
- Description: Implements the recv operation.

#### `public void send(ByteBuffer msg)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `public void send(PMessage msg)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `private boolean select(double timeout) throws IOException`
- Role: Handles the select workflow.
- Description: Implements the select operation.

#### `private void wake()`
- Role: Handles the wake path.
- Description: Implements the wake operation.

#### `private Connect(String username, boolean encrypt, byte[] cookie, Object... args)`
- Role: Handles the connect path.
- Description: Implements the connect operation.

#### `public Task run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `ObjAck(long id, int frame, double recv)`
- Role: Handles the obj ack workflow.
- Description: Implements the obj ack operation.

#### `private void handlerel(PMessage msg)`
- Role: Handles the handlerel path.
- Description: Implements the handlerel operation.

#### `private void gotrel(RMessage msg)`
- Role: Handles the gotrel path.
- Description: Implements the gotrel operation.

#### `private void sendack(short seq)`
- Role: Handles the sendack path.
- Description: Implements the sendack operation.

#### `private void gotack(short seq)`
- Role: Handles the gotack path.
- Description: Implements the gotack operation.

#### `private void gotmapdata(MessageBuf msg)`
- Role: Handles the gotmapdata path.
- Description: Implements the gotmapdata operation.

#### `private void gotobjdata(Message msg)`
- Role: Handles the gotobjdata path.
- Description: Implements the gotobjdata operation.

#### `private void handlemsg(PMessage msg)`
- Role: Handles the handlemsg path.
- Description: Implements the handlemsg operation.

#### `private double min2(double a, double b)`
- Role: Handles the min2 path.
- Description: Implements the min2 operation.

#### `private double sendpending()`
- Role: Handles the sendpending path.
- Description: Implements the sendpending operation.

#### `private double sendobjacks()`
- Role: Handles the sendobjacks path.
- Description: Implements the sendobjacks operation.

#### `public Task run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private Close(boolean sawclose)`
- Role: Closes the current stream or resource.
- Description: Closes the current stream or resource.

#### `public Task run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void queuemsg(PMessage pmsg)`
- Role: Handles the queuemsg path.
- Description: Implements the queuemsg operation.

#### `public boolean encrypted()`
- Role: Handles the encrypted path.
- Description: Implements the encrypted operation.

#### `public SessionError(int code, String reason)`
- Role: Handles the session error path.
- Description: Implements the session error operation.

#### `public SessionError(String reason)`
- Role: Handles the session error path.
- Description: Implements the session error operation.

#### `public SessionAuthError()`
- Role: Handles the session auth error path.
- Description: Implements the session auth error operation.

#### `public SessionBusyError()`
- Role: Handles the session busy error path.
- Description: Implements the session busy error operation.

#### `public SessionConnError()`
- Role: Handles the session conn error path.
- Description: Implements the session conn error operation.

#### `public SessionPVerError()`
- Role: Handles the session pver error path.
- Description: Implements the session p ver error operation.

#### `public SessionExprError()`
- Role: Handles the session expr error path.
- Description: Implements the session expr error operation.

#### `public void connect(String username, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.