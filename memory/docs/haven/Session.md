# Session

This file documents the responsibilities and members of `Session`.

## Meta

- Source: [Session.java](../../../src/haven/Session.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the active game session and network connection.

## Nested Types

### CachedRes

- Role: Represents cached res within Session.
- Description: Describes the nested cached res type used by the enclosing class.

### LoadingIndir

- Role: Represents loading indir within Session.
- Description: Describes the nested loading indir type used by the enclosing class.

### MessageException

- Role: Represents message exception within Session.
- Description: Describes the nested message exception type used by the enclosing class.

### Ref

- Role: Represents ref within Session.
- Description: Describes the nested ref type used by the enclosing class.

### User

- Role: Represents user within Session.
- Description: Describes the nested user type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<java.nio.file.Path> record = Config.Variable.propp("haven.record", "")`
- Role: Defines the shared record constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int PVER = 30`
- Role: Defines the shared pver constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_SESS = 0`
- Role: Defines the shared msg sess constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_REL = 1`
- Role: Defines the shared msg rel constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_ACK = 2`
- Role: Defines the shared msg ack constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_BEAT = 3`
- Role: Defines the shared msg beat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_MAPREQ = 4`
- Role: Defines the shared msg mapreq constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_MAPDATA = 5`
- Role: Defines the shared msg mapdata constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_OBJDATA = 6`
- Role: Defines the shared msg objdata constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_OBJACK = 7`
- Role: Defines the shared msg objack constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_CLOSE = 8`
- Role: Defines the shared msg close constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int MSG_CRYPT = 9`
- Role: Defines the shared msg crypt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int SESSERR_AUTH = 1`
- Role: Defines the shared sesserr auth constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int SESSERR_BUSY = 2`
- Role: Defines the shared sesserr busy constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int SESSERR_CONN = 3`
- Role: Defines the shared sesserr conn constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int SESSERR_PVER = 4`
- Role: Defines the shared sesserr pver constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int SESSERR_EXPR = 5`
- Role: Defines the shared sesserr expr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int SESSERR_MESG = 6`
- Role: Defines the shared sesserr mesg constant.
- Description: Shared constant used by the rest of the class.

#### `static final int ackthresh = 30`
- Role: Defines the shared ackthresh constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Transport conn`
- Role: Holds the conn state.
- Description: Backs the cached state for this file.

#### `public int connfailed = 0`
- Role: Stores the connfailed value.
- Description: Backs the cached state for this file.

#### `public String connerror = null`
- Role: Stores the connerror value.
- Description: Backs the cached state for this file.

#### `LinkedList<PMessage> uimsgs = new LinkedList<PMessage>()`
- Role: Caches uimsgs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final User user`
- Role: Holds the user state.
- Description: Backs the cached state for this file.

#### `final Map<Integer, CachedRes> rescache = new TreeMap<Integer, CachedRes>()`
- Role: Caches rescache entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Glob glob`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `public SignKey sesskey`
- Role: Holds the sesskey state.
- Description: Backs the cached state for this file.

#### `private boolean closed = false`
- Role: Tracks whether closed is closed.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public String alias = null, readname = null, prsname = null`
- Role: Stores the alias value.
- Description: Backs the cached state for this file.

#### `public String alias = null, readname = null, prsname = null`
- Role: Stores the alias value.
- Description: Backs the cached state for this file.

#### `public String alias = null, readname = null, prsname = null`
- Role: Stores the alias value.
- Description: Backs the cached state for this file.

#### `public Message msg`
- Role: Holds the msg state.
- Description: Backs the cached state for this file.

#### `public final int resid`
- Role: Stores the resid value.
- Description: Backs the cached state for this file.

#### `private transient final CachedRes res`
- Role: Holds the res state.
- Description: Backs the cached state for this file.

#### `private final Waitable.Queue wq = new Waitable.Queue()`
- Role: Caches wq entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final int resid`
- Role: Stores the resid value.
- Description: Backs the cached state for this file.

#### `private String resnm = null`
- Role: Stores the resnm value.
- Description: Backs the cached state for this file.

#### `private int resver`
- Role: Stores the resver value.
- Description: Backs the cached state for this file.

#### `private Reference<Ref> ind`
- Role: Holds the ind state.
- Description: Backs the cached state for this file.

#### `private int prio = -6`
- Role: Stores the prio value.
- Description: Backs the cached state for this file.

#### `private Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Function<Object, Object> resmapper = new ResID.ResolveMapper(this)`
- Role: Holds the resmapper state.
- Description: Backs the cached state for this file.

#### `private final Transport.Callback conncb = new Transport.Callback()`
- Role: Holds the conncb state.
- Description: Backs the cached state for this file.

### Methods

#### `public User(String name)`
- Role: Performs user.
- Description: Supports the user operation used by the surrounding class.

#### `public User alias(String val)`
- Role: Performs alias.
- Description: Supports the alias operation used by the surrounding class.

#### `public User readname(String val)`
- Role: Performs readname.
- Description: Supports the readname operation used by the surrounding class.

#### `public User prsname(String val)`
- Role: Performs prsname.
- Description: Supports the prsname operation used by the surrounding class.

#### `public String readname()`
- Role: Performs readname.
- Description: Supports the readname operation used by the surrounding class.

#### `public String prsname()`
- Role: Performs prsname.
- Description: Supports the prsname operation used by the surrounding class.

#### `public String reauth()`
- Role: Performs reauth.
- Description: Supports the reauth operation used by the surrounding class.

#### `public User copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public MessageException(String text, Message msg)`
- Role: Performs message exception.
- Description: Supports the message exception operation used by the surrounding class.

#### `private LoadingIndir(CachedRes res)`
- Role: Performs loading indir.
- Description: Supports the loading indir operation used by the surrounding class.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public boolean boostprio(int prio)`
- Role: Performs boostprio.
- Description: Supports the boostprio operation used by the surrounding class.

#### `public Resource.Pool pool()`
- Role: Performs pool.
- Description: Supports the pool operation used by the surrounding class.

#### `private CachedRes(int id)`
- Role: Performs cached res.
- Description: Supports the cached res operation used by the surrounding class.

#### `public Resource get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private void reset()`
- Role: Performs reset.
- Description: Supports the reset operation used by the surrounding class.

#### `private Ref get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void boostprio(int prio)`
- Role: Performs boostprio.
- Description: Supports the boostprio operation used by the surrounding class.

#### `public void set(String nm, int ver)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `private CachedRes cachedres(int id)`
- Role: Performs cachedres.
- Description: Supports the cachedres operation used by the surrounding class.

#### `public Indir<Resource> getres(int id, int prio)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Indir<Resource> getres(int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Indir<Resource> dynres(UID uid)`
- Role: Performs dynres.
- Description: Supports the dynres operation used by the surrounding class.

#### `private void handlerel(PMessage msg)`
- Role: Performs handlerel.
- Description: Supports the handlerel operation used by the surrounding class.

#### `public Session(Transport conn, User user)`
- Role: Creates a new Session instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Session connect(SocketAddress server, User user, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException`
- Role: Handles the connect workflow.
- Description: Supports the connect operation used by the surrounding class.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public void queuemsg(PMessage pmsg)`
- Role: Performs queuemsg.
- Description: Supports the queuemsg operation used by the surrounding class.

#### `public void postuimsg(PMessage msg)`
- Role: Performs postuimsg.
- Description: Supports the postuimsg operation used by the surrounding class.

#### `public PMessage getuimsg() throws InterruptedException`
- Role: Returns the uimsg value.
- Description: Exposes the requested value without mutating state.

#### `public void sendmsg(PMessage msg)`
- Role: Performs sendmsg.
- Description: Supports the sendmsg operation used by the surrounding class.
