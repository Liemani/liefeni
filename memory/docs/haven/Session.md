# Session

This file documents the responsibilities and members of `Session`.

## Meta

- Source: [Session.java](../../../src/haven/Session.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the active game session.

## Nested Types

### CachedRes

- Description: TODO

### LoadingIndir

- Description: TODO

### MessageException

- Description: TODO

### Ref

- Description: TODO

### User

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<java.nio.file.Path> record = Config.Variable.propp("haven.record", "")`

- Description: TODO

#### `public static final int PVER = 30`

- Description: TODO

#### `public static final int MSG_SESS = 0`

- Description: TODO

#### `public static final int MSG_REL = 1`

- Description: TODO

#### `public static final int MSG_ACK = 2`

- Description: TODO

#### `public static final int MSG_BEAT = 3`

- Description: TODO

#### `public static final int MSG_MAPREQ = 4`

- Description: TODO

#### `public static final int MSG_MAPDATA = 5`

- Description: TODO

#### `public static final int MSG_OBJDATA = 6`

- Description: TODO

#### `public static final int MSG_OBJACK = 7`

- Description: TODO

#### `public static final int MSG_CLOSE = 8`

- Description: TODO

#### `public static final int MSG_CRYPT = 9`

- Description: TODO

#### `public static final int SESSERR_AUTH = 1`

- Description: TODO

#### `public static final int SESSERR_BUSY = 2`

- Description: TODO

#### `public static final int SESSERR_CONN = 3`

- Description: TODO

#### `public static final int SESSERR_PVER = 4`

- Description: TODO

#### `public static final int SESSERR_EXPR = 5`

- Description: TODO

#### `public static final int SESSERR_MESG = 6`

- Description: TODO

#### `static final int ackthresh = 30`

- Description: TODO

### Fields

#### `public final Transport conn`

- Description: TODO

#### `public int connfailed = 0`

- Description: TODO

#### `public String connerror = null`

- Description: TODO

#### `LinkedList<PMessage> uimsgs = new LinkedList<PMessage>()`

- Description: TODO

#### `public final User user`

- Description: TODO

#### `final Map<Integer, CachedRes> rescache = new TreeMap<Integer, CachedRes>()`

- Description: TODO

#### `public final Glob glob`

- Description: TODO

#### `public SignKey sesskey`

- Description: TODO

#### `private boolean closed = false`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public String alias = null, readname = null, prsname = null`

- Description: TODO

#### `public String alias = null, readname = null, prsname = null`

- Description: TODO

#### `public String alias = null, readname = null, prsname = null`

- Description: TODO

#### `public Message msg`

- Description: TODO

#### `public final int resid`

- Description: TODO

#### `private transient final CachedRes res`

- Description: TODO

#### `private final Waitable.Queue wq = new Waitable.Queue()`

- Description: TODO

#### `private final int resid`

- Description: TODO

#### `private String resnm = null`

- Description: TODO

#### `private int resver`

- Description: TODO

#### `private Reference<Ref> ind`

- Description: TODO

#### `private int prio = -6`

- Description: TODO

#### `private Resource res`

- Description: TODO

#### `public final Function<Object, Object> resmapper = new ResID.ResolveMapper(this)`

- Description: TODO

#### `private final Transport.Callback conncb = new Transport.Callback()`

- Description: TODO

### Methods

#### `public User(String name)`

- Description: TODO

#### `public User alias(String val)`

- Description: TODO

#### `public User readname(String val)`

- Description: TODO

#### `public User prsname(String val)`

- Description: TODO

#### `public String readname()`

- Description: TODO

#### `public String prsname()`

- Description: TODO

#### `public String reauth()`

- Description: TODO

#### `public User copy()`

- Description: TODO

#### `public MessageException(String text, Message msg)`

- Description: TODO

#### `private LoadingIndir(CachedRes res)`

- Description: TODO

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

#### `public boolean boostprio(int prio)`

- Description: TODO

#### `public Resource.Pool pool()`

- Description: TODO

#### `private CachedRes(int id)`

- Description: TODO

#### `public Resource get()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private void reset()`

- Description: TODO

#### `private Ref get()`

- Description: TODO

#### `public void boostprio(int prio)`

- Description: TODO

#### `public void set(String nm, int ver)`

- Description: TODO

#### `private CachedRes cachedres(int id)`

- Description: TODO

#### `public Indir<Resource> getres(int id, int prio)`

- Description: TODO

#### `public Indir<Resource> getres(int id)`

- Description: TODO

#### `public Indir<Resource> dynres(UID uid)`

- Description: TODO

#### `private void handlerel(PMessage msg)`

- Description: TODO

#### `public Session(Transport conn, User user)`

- Description: TODO

#### `public static Session connect(SocketAddress server, User user, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException`

- Description: TODO

#### `public void close()`

- Description: TODO

#### `public void queuemsg(PMessage pmsg)`

- Description: TODO

#### `public void postuimsg(PMessage msg)`

- Description: TODO

#### `public PMessage getuimsg() throws InterruptedException`

- Description: TODO

#### `public void sendmsg(PMessage msg)`

- Description: TODO
