# Connection

This file documents the responsibilities and members of `Connection`.

## Meta

- Source: [Connection.java](../../../src/haven/Connection.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a network connection.

## Nested Types

### Close

- Description: TODO

### Connect

- Description: TODO

### Crypto

- Description: TODO

### DecryptException

- Description: TODO

### Main

- Description: TODO

### ObjAck

- Description: TODO

### SessionAuthError

- Description: TODO

### SessionBusyError

- Description: TODO

### SessionConnError

- Description: TODO

### SessionError

- Description: TODO

### SessionExprError

- Description: TODO

### SessionPVerError

- Description: TODO

### Stats

- Description: TODO

### Task

- Description: TODO

### Worker

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<Boolean> encrypt = Config.Variable.propb("haven.hcrypt", false)`

- Description: TODO

#### `private static final double ACK_HOLD = 0.030`

- Description: TODO

#### `private static final double OBJACK_HOLD = 0.08, OBJACK_HOLD_MAX = 0.5`

- Description: TODO

#### `private static final double OBJACK_HOLD = 0.08, OBJACK_HOLD_MAX = 0.5`

- Description: TODO

#### `private static final String[] apfx =`

- Description: TODO

### Fields

#### `public final SocketAddress server`

- Description: TODO

#### `public final Stats stats = new Stats()`

- Description: TODO

#### `private final Collection<Callback> cbs = new ArrayList<>()`

- Description: TODO

#### `private final DatagramChannel sk`

- Description: TODO

#### `private final Selector sel`

- Description: TODO

#### `private final SelectionKey key`

- Description: TODO

#### `private Worker worker`

- Description: TODO

#### `private int tseq`

- Description: TODO

#### `private boolean alive = true`

- Description: TODO

#### `private Crypto crypt`

- Description: TODO

#### `private final Cipher cipher`

- Description: TODO

#### `private final Key tkey, rkey`

- Description: TODO

#### `private final Key tkey, rkey`

- Description: TODO

#### `private final NavigableSet<Long> rseqs = new TreeSet<>()`

- Description: TODO

#### `private long tseq`

- Description: TODO

#### `private final double[] rpltimes = new double[32]`

- Description: TODO

#### `private long ptx, prx, pretx`

- Description: TODO

#### `private long ptx, prx, pretx`

- Description: TODO

#### `private long ptx, prx, pretx`

- Description: TODO

#### `private long btx, brx, prerx, prorx`

- Description: TODO

#### `private long btx, brx, prerx, prorx`

- Description: TODO

#### `private long btx, brx, prerx, prorx`

- Description: TODO

#### `private long btx, brx, prerx, prorx`

- Description: TODO

#### `private int rplhead = 0, nrpls = 0`

- Description: TODO

#### `private int rplhead = 0, nrpls = 0`

- Description: TODO

#### `private double srtt, rttv`

- Description: TODO

#### `private double srtt, rttv`

- Description: TODO

#### `private Task init`

- Description: TODO

#### `private final ByteBuffer recvbuf = ByteBuffer.allocate(65536)`

- Description: TODO

#### `private final List<RMessage> pending = new LinkedList<>()`

- Description: TODO

#### `private final PMessage msg`

- Description: TODO

#### `private int result = -1`

- Description: TODO

#### `private Throwable cause`

- Description: TODO

#### `private String message`

- Description: TODO

#### `private Crypto crypt`

- Description: TODO

#### `long id`

- Description: TODO

#### `int frame`

- Description: TODO

#### `double frecv, lrecv`

- Description: TODO

#### `double frecv, lrecv`

- Description: TODO

#### `private final Map<Short, RMessage> waiting = new HashMap<>()`

- Description: TODO

#### `private final Map<Long, ObjAck> objacks = new HashMap<>()`

- Description: TODO

#### `private double now, lasttx`

- Description: TODO

#### `private double now, lasttx`

- Description: TODO

#### `private short rseq, ackseq`

- Description: TODO

#### `private short rseq, ackseq`

- Description: TODO

#### `private double acktime = -1`

- Description: TODO

#### `private byte[] fragbuf = null`

- Description: TODO

#### `private int fragtype`

- Description: TODO

#### `private boolean sawclose`

- Description: TODO

#### `public final int code`

- Description: TODO

### Methods

#### `public Connection(SocketAddress server)`

- Description: TODO

#### `public Connection add(Callback cb)`

- Description: TODO

#### `public DecryptException(String msg, Throwable cause)`

- Description: TODO

#### `public DecryptException(String msg)`

- Description: TODO

#### `private static boolean supported()`

- Description: TODO

#### `private Crypto(byte[] cookie, byte[] salt)`

- Description: TODO

#### `public synchronized byte[] encrypt(byte[] msg)`

- Description: TODO

#### `public synchronized byte[] decrypt(byte[] msg) throws DecryptException`

- Description: TODO

#### `public PMessage encrypt(PMessage msg)`

- Description: TODO

#### `public PMessage decrypt(MessageBuf msg) throws DecryptException`

- Description: TODO

#### `private void addreply(double time)`

- Description: TODO

#### `private String abbr(String fmt, double n)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private Worker(Task init)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public Task run()`

- Description: TODO

#### `private void start(Task init)`

- Description: TODO

#### `public boolean alive()`

- Description: TODO

#### `private PMessage recv() throws IOException`

- Description: TODO

#### `public void send(ByteBuffer msg)`

- Description: TODO

#### `public void send(PMessage msg)`

- Description: TODO

#### `public void close()`

- Description: TODO

#### `private boolean select(double timeout) throws IOException`

- Description: TODO

#### `private void wake()`

- Description: TODO

#### `private Connect(String username, boolean encrypt, byte[] cookie, Object... args)`

- Description: TODO

#### `public Task run()`

- Description: TODO

#### `ObjAck(long id, int frame, double recv)`

- Description: TODO

#### `private void handlerel(PMessage msg)`

- Description: TODO

#### `private void gotrel(RMessage msg)`

- Description: TODO

#### `private void sendack(short seq)`

- Description: TODO

#### `private void gotack(short seq)`

- Description: TODO

#### `private void gotmapdata(MessageBuf msg)`

- Description: TODO

#### `private void gotobjdata(Message msg)`

- Description: TODO

#### `private void handlemsg(PMessage msg)`

- Description: TODO

#### `private double min2(double a, double b)`

- Description: TODO

#### `private double sendpending()`

- Description: TODO

#### `private double sendobjacks()`

- Description: TODO

#### `public Task run()`

- Description: TODO

#### `private Close(boolean sawclose)`

- Description: TODO

#### `public Task run()`

- Description: TODO

#### `public void queuemsg(PMessage pmsg)`

- Description: TODO

#### `public boolean encrypted()`

- Description: TODO

#### `public SessionError(int code, String reason)`

- Description: TODO

#### `public SessionError(String reason)`

- Description: TODO

#### `public SessionAuthError()`

- Description: TODO

#### `public SessionBusyError()`

- Description: TODO

#### `public SessionConnError()`

- Description: TODO

#### `public SessionPVerError()`

- Description: TODO

#### `public SessionExprError()`

- Description: TODO

#### `public void connect(String username, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException`

- Description: TODO
