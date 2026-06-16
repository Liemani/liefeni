# Connection

This file documents the responsibilities and members of `Connection`.

## Meta

- Source: [Connection.java](../../../src/haven/Connection.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the connection Haven component.

## Nested Types

### Close

- Role: Represents close within Connection.
- Description: Describes the nested close type used by the enclosing class.

### Connect

- Role: Represents connect within Connection.
- Description: Describes the nested connect type used by the enclosing class.

### Crypto

- Role: Represents crypto within Connection.
- Description: Describes the nested crypto type used by the enclosing class.

### DecryptException

- Role: Represents decrypt exception within Connection.
- Description: Describes the nested decrypt exception type used by the enclosing class.

### Main

- Role: Represents main within Connection.
- Description: Describes the nested main type used by the enclosing class.

### ObjAck

- Role: Represents obj ack within Connection.
- Description: Describes the nested obj ack type used by the enclosing class.

### SessionAuthError

- Role: Represents session auth error within Connection.
- Description: Describes the nested session auth error type used by the enclosing class.

### SessionBusyError

- Role: Represents session busy error within Connection.
- Description: Describes the nested session busy error type used by the enclosing class.

### SessionConnError

- Role: Represents session conn error within Connection.
- Description: Describes the nested session conn error type used by the enclosing class.

### SessionError

- Role: Represents session error within Connection.
- Description: Describes the nested session error type used by the enclosing class.

### SessionExprError

- Role: Represents session expr error within Connection.
- Description: Describes the nested session expr error type used by the enclosing class.

### SessionPVerError

- Role: Represents session pver error within Connection.
- Description: Describes the nested session pver error type used by the enclosing class.

### Stats

- Role: Represents stats within Connection.
- Description: Describes the nested stats type used by the enclosing class.

### Task

- Role: Represents task within Connection.
- Description: Describes the nested task type used by the enclosing class.

### Worker

- Role: Represents worker within Connection.
- Description: Describes the nested worker type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<Boolean> encrypt = Config.Variable.propb("haven.hcrypt", false)`
- Role: Defines the shared encrypt constant.
- Description: Shared constant used by the rest of the class.

#### `private static final double ACK_HOLD = 0.030`
- Role: Defines the shared ack hold constant.
- Description: Shared constant used by the rest of the class.

#### `private static final double OBJACK_HOLD = 0.08, OBJACK_HOLD_MAX = 0.5`
- Role: Defines the shared objack hold constant.
- Description: Shared constant used by the rest of the class.

#### `private static final double OBJACK_HOLD = 0.08, OBJACK_HOLD_MAX = 0.5`
- Role: Defines the shared objack hold constant.
- Description: Shared constant used by the rest of the class.

#### `private static final String[] apfx =`
- Role: Defines the shared connection constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final SocketAddress server`
- Role: Holds the server state.
- Description: Backs the cached state for this file.

#### `public final Stats stats = new Stats()`
- Role: Holds the stats state.
- Description: Backs the cached state for this file.

#### `private final Collection<Callback> cbs = new ArrayList<>()`
- Role: Caches cbs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final DatagramChannel sk`
- Role: Holds the sk state.
- Description: Backs the cached state for this file.

#### `private final Selector sel`
- Role: Holds the sel state.
- Description: Backs the cached state for this file.

#### `private final SelectionKey key`
- Role: Holds the key state.
- Description: Backs the cached state for this file.

#### `private Worker worker`
- Role: Holds the worker state.
- Description: Backs the cached state for this file.

#### `private int tseq`
- Role: Stores the tseq value.
- Description: Backs the cached state for this file.

#### `private boolean alive = true`
- Role: Tracks the alive flag.
- Description: Supports the alive operation used by the surrounding class.

#### `private Crypto crypt`
- Role: Holds the crypt state.
- Description: Backs the cached state for this file.

#### `private final Cipher cipher`
- Role: Holds the cipher state.
- Description: Backs the cached state for this file.

#### `private final Key tkey, rkey`
- Role: Holds the rkey state.
- Description: Backs the cached state for this file.

#### `private final Key tkey, rkey`
- Role: Holds the rkey state.
- Description: Backs the cached state for this file.

#### `private final NavigableSet<Long> rseqs = new TreeSet<>()`
- Role: Caches rseqs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private long tseq`
- Role: Stores the tseq value.
- Description: Backs the cached state for this file.

#### `private final double[] rpltimes = new double[32]`
- Role: Stores the rpltimes value.
- Description: Backs the cached state for this file.

#### `private long ptx, prx, pretx`
- Role: Stores the pretx value.
- Description: Backs the cached state for this file.

#### `private long ptx, prx, pretx`
- Role: Stores the pretx value.
- Description: Backs the cached state for this file.

#### `private long ptx, prx, pretx`
- Role: Stores the pretx value.
- Description: Backs the cached state for this file.

#### `private long btx, brx, prerx, prorx`
- Role: Stores the prorx value.
- Description: Backs the cached state for this file.

#### `private long btx, brx, prerx, prorx`
- Role: Stores the prorx value.
- Description: Backs the cached state for this file.

#### `private long btx, brx, prerx, prorx`
- Role: Stores the prorx value.
- Description: Backs the cached state for this file.

#### `private long btx, brx, prerx, prorx`
- Role: Stores the prorx value.
- Description: Backs the cached state for this file.

#### `private int rplhead = 0, nrpls = 0`
- Role: Stores the rplhead value.
- Description: Backs the cached state for this file.

#### `private int rplhead = 0, nrpls = 0`
- Role: Stores the rplhead value.
- Description: Backs the cached state for this file.

#### `private double srtt, rttv`
- Role: Stores the rttv value.
- Description: Backs the cached state for this file.

#### `private double srtt, rttv`
- Role: Stores the rttv value.
- Description: Backs the cached state for this file.

#### `private Task init`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

#### `private final ByteBuffer recvbuf = ByteBuffer.allocate(65536)`
- Role: Stores the recvbuf value.
- Description: Backs the cached state for this file.

#### `private final List<RMessage> pending = new LinkedList<>()`
- Role: Caches pending entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final PMessage msg`
- Role: Holds the msg state.
- Description: Backs the cached state for this file.

#### `private int result = -1`
- Role: Stores the result value.
- Description: Backs the cached state for this file.

#### `private Throwable cause`
- Role: Holds the cause state.
- Description: Backs the cached state for this file.

#### `private String message`
- Role: Stores the message value.
- Description: Backs the cached state for this file.

#### `private Crypto crypt`
- Role: Holds the crypt state.
- Description: Backs the cached state for this file.

#### `long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `int frame`
- Role: Stores the frame value.
- Description: Backs the cached state for this file.

#### `double frecv, lrecv`
- Role: Stores the lrecv value.
- Description: Backs the cached state for this file.

#### `double frecv, lrecv`
- Role: Stores the lrecv value.
- Description: Backs the cached state for this file.

#### `private final Map<Short, RMessage> waiting = new HashMap<>()`
- Role: Caches waiting entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Long, ObjAck> objacks = new HashMap<>()`
- Role: Caches objacks entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private double now, lasttx`
- Role: Stores the lasttx value.
- Description: Backs the cached state for this file.

#### `private double now, lasttx`
- Role: Stores the lasttx value.
- Description: Backs the cached state for this file.

#### `private short rseq, ackseq`
- Role: Stores the ackseq value.
- Description: Backs the cached state for this file.

#### `private short rseq, ackseq`
- Role: Stores the ackseq value.
- Description: Backs the cached state for this file.

#### `private double acktime = -1`
- Role: Stores the acktime value.
- Description: Backs the cached state for this file.

#### `private byte[] fragbuf = null`
- Role: Stores the fragbuf value.
- Description: Backs the cached state for this file.

#### `private int fragtype`
- Role: Stores the fragtype value.
- Description: Backs the cached state for this file.

#### `private boolean sawclose`
- Role: Tracks the sawclose flag.
- Description: Supports the sawclose operation used by the surrounding class.

#### `public final int code`
- Role: Stores the code value.
- Description: Backs the cached state for this file.

### Methods

#### `public Connection(SocketAddress server)`
- Role: Creates a new Connection instance.
- Description: Constructs the instance and initializes its default state.

#### `public Connection add(Callback cb)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public DecryptException(String msg, Throwable cause)`
- Role: Performs decrypt exception.
- Description: Supports the decrypt exception operation used by the surrounding class.

#### `public DecryptException(String msg)`
- Role: Performs decrypt exception.
- Description: Supports the decrypt exception operation used by the surrounding class.

#### `private static boolean supported()`
- Role: Performs supported.
- Description: Supports the supported operation used by the surrounding class.

#### `private Crypto(byte[] cookie, byte[] salt)`
- Role: Performs crypto.
- Description: Supports the crypto operation used by the surrounding class.

#### `public synchronized byte[] encrypt(byte[] msg)`
- Role: Performs encrypt.
- Description: Supports the encrypt operation used by the surrounding class.

#### `public synchronized byte[] decrypt(byte[] msg) throws DecryptException`
- Role: Handles the decrypt workflow.
- Description: Supports the decrypt operation used by the surrounding class.

#### `public PMessage encrypt(PMessage msg)`
- Role: Performs encrypt.
- Description: Supports the encrypt operation used by the surrounding class.

#### `public PMessage decrypt(MessageBuf msg) throws DecryptException`
- Role: Handles the decrypt workflow.
- Description: Supports the decrypt operation used by the surrounding class.

#### `private void addreply(double time)`
- Role: Performs addreply.
- Description: Supports the addreply operation used by the surrounding class.

#### `private String abbr(String fmt, double n)`
- Role: Performs abbr.
- Description: Supports the abbr operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private Worker(Task init)`
- Role: Performs worker.
- Description: Supports the worker operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public Task run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void start(Task init)`
- Role: Starts the current workflow.
- Description: Supports the start operation used by the surrounding class.

#### `public boolean alive()`
- Role: Performs alive.
- Description: Supports the alive operation used by the surrounding class.

#### `private PMessage recv() throws IOException`
- Role: Handles the recv workflow.
- Description: Supports the recv operation used by the surrounding class.

#### `public void send(ByteBuffer msg)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `public void send(PMessage msg)`
- Role: Sends the current message.
- Description: Sends the current message into the target Haven callback or UI message path.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `private boolean select(double timeout) throws IOException`
- Role: Handles the select workflow.
- Description: Supports the select operation used by the surrounding class.

#### `private void wake()`
- Role: Performs wake.
- Description: Supports the wake operation used by the surrounding class.

#### `private Connect(String username, boolean encrypt, byte[] cookie, Object... args)`
- Role: Performs connect.
- Description: Supports the connect operation used by the surrounding class.

#### `public Task run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `ObjAck(long id, int frame, double recv)`
- Role: Handles the obj ack workflow.
- Description: Supports the obj ack operation used by the surrounding class.

#### `private void handlerel(PMessage msg)`
- Role: Performs handlerel.
- Description: Supports the handlerel operation used by the surrounding class.

#### `private void gotrel(RMessage msg)`
- Role: Performs gotrel.
- Description: Supports the gotrel operation used by the surrounding class.

#### `private void sendack(short seq)`
- Role: Performs sendack.
- Description: Supports the sendack operation used by the surrounding class.

#### `private void gotack(short seq)`
- Role: Performs gotack.
- Description: Supports the gotack operation used by the surrounding class.

#### `private void gotmapdata(MessageBuf msg)`
- Role: Performs gotmapdata.
- Description: Supports the gotmapdata operation used by the surrounding class.

#### `private void gotobjdata(Message msg)`
- Role: Performs gotobjdata.
- Description: Supports the gotobjdata operation used by the surrounding class.

#### `private void handlemsg(PMessage msg)`
- Role: Performs handlemsg.
- Description: Supports the handlemsg operation used by the surrounding class.

#### `private double min2(double a, double b)`
- Role: Performs min2.
- Description: Supports the min2 operation used by the surrounding class.

#### `private double sendpending()`
- Role: Performs sendpending.
- Description: Supports the sendpending operation used by the surrounding class.

#### `private double sendobjacks()`
- Role: Performs sendobjacks.
- Description: Supports the sendobjacks operation used by the surrounding class.

#### `public Task run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private Close(boolean sawclose)`
- Role: Performs close.
- Description: Supports the close operation used by the surrounding class.

#### `public Task run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void queuemsg(PMessage pmsg)`
- Role: Performs queuemsg.
- Description: Supports the queuemsg operation used by the surrounding class.

#### `public boolean encrypted()`
- Role: Performs encrypted.
- Description: Supports the encrypted operation used by the surrounding class.

#### `public SessionError(int code, String reason)`
- Role: Performs session error.
- Description: Supports the session error operation used by the surrounding class.

#### `public SessionError(String reason)`
- Role: Performs session error.
- Description: Supports the session error operation used by the surrounding class.

#### `public SessionAuthError()`
- Role: Performs session auth error.
- Description: Supports the session auth error operation used by the surrounding class.

#### `public SessionBusyError()`
- Role: Performs session busy error.
- Description: Supports the session busy error operation used by the surrounding class.

#### `public SessionConnError()`
- Role: Performs session conn error.
- Description: Supports the session conn error operation used by the surrounding class.

#### `public SessionPVerError()`
- Role: Performs session pver error.
- Description: Supports the session pver error operation used by the surrounding class.

#### `public SessionExprError()`
- Role: Performs session expr error.
- Description: Supports the session expr error operation used by the surrounding class.

#### `public void connect(String username, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.
