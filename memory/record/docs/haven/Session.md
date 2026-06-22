---
source: [Session.java](../../../../src/haven/Session.java)
created: 2026-06-13
updated: 2026-06-14
---

# Session

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
- Role: Implements the record operation.
- Description: Implements the propp operation.
- Value: `Config.Variable.propp("haven.record", "")`

#### `public static final int PVER = 30`
- Role: Caches the pver value.
- Description: Caches the `PVER` value for reuse.
- Value: `30`

#### `public static final int MSG_SESS = 0`
- Role: Caches the msg sess value.
- Description: Caches the `MSG_SESS` value for reuse.
- Value: `0`

#### `public static final int MSG_REL = 1`
- Role: Caches the msg rel value.
- Description: Caches the `MSG_REL` value for reuse.
- Value: `1`

#### `public static final int MSG_ACK = 2`
- Role: Caches the msg ack value.
- Description: Caches the `MSG_ACK` value for reuse.
- Value: `2`

#### `public static final int MSG_BEAT = 3`
- Role: Caches the msg beat value.
- Description: Caches the `MSG_BEAT` value for reuse.
- Value: `3`

#### `public static final int MSG_MAPREQ = 4`
- Role: Caches the msg mapreq value.
- Description: Caches the `MSG_MAPREQ` value for reuse.
- Value: `4`

#### `public static final int MSG_MAPDATA = 5`
- Role: Caches the msg mapdata value.
- Description: Caches the `MSG_MAPDATA` value for reuse.
- Value: `5`

#### `public static final int MSG_OBJDATA = 6`
- Role: Caches the msg objdata value.
- Description: Caches the `MSG_OBJDATA` value for reuse.
- Value: `6`

#### `public static final int MSG_OBJACK = 7`
- Role: Caches the msg objack value.
- Description: Caches the `MSG_OBJACK` value for reuse.
- Value: `7`

#### `public static final int MSG_CLOSE = 8`
- Role: Caches the msg close value.
- Description: Caches the `MSG_CLOSE` value for reuse.
- Value: `8`

#### `public static final int MSG_CRYPT = 9`
- Role: Caches the msg crypt value.
- Description: Caches the `MSG_CRYPT` value for reuse.
- Value: `9`

#### `public static final int SESSERR_AUTH = 1`
- Role: Caches the sesserr auth value.
- Description: Caches the `SESSERR_AUTH` value for reuse.
- Value: `1`

#### `public static final int SESSERR_BUSY = 2`
- Role: Caches the sesserr busy value.
- Description: Caches the `SESSERR_BUSY` value for reuse.
- Value: `2`

#### `public static final int SESSERR_CONN = 3`
- Role: Caches the sesserr conn value.
- Description: Caches the `SESSERR_CONN` value for reuse.
- Value: `3`

#### `public static final int SESSERR_PVER = 4`
- Role: Caches the sesserr pver value.
- Description: Caches the `SESSERR_PVER` value for reuse.
- Value: `4`

#### `public static final int SESSERR_EXPR = 5`
- Role: Caches the sesserr expr value.
- Description: Caches the `SESSERR_EXPR` value for reuse.
- Value: `5`

#### `public static final int SESSERR_MESG = 6`
- Role: Caches the sesserr mesg value.
- Description: Caches the `SESSERR_MESG` value for reuse.
- Value: `6`

#### `static final int ackthresh = 30`
- Role: Caches the ackthresh value.
- Description: Caches the `ackthresh` value for reuse.
- Value: `30`

### Fields

#### `public final Transport conn`
- Role: Caches the conn value.
- Description: Caches the `conn` value for reuse.

#### `public int connfailed = 0`
- Role: Caches the connfailed value.
- Description: Caches the `connfailed` value for reuse.

#### `public String connerror = null`
- Role: Caches the connerror value.
- Description: Caches the `connerror` value for reuse.

#### `LinkedList<PMessage> uimsgs = new LinkedList<PMessage>()`
- Role: Implements the uimsgs operation.
- Description: Implements the linked list<p message> uimsgs = new linked list<p message>() operation.

#### `public final User user`
- Role: Caches the user value.
- Description: Caches the `user` value for reuse.

#### `final Map<Integer, CachedRes> rescache = new TreeMap<Integer, CachedRes>()`
- Role: Implements the rescache operation.
- Description: Implements the final map<integer, cached res> rescache = new tree map<integer, cached res>() operation.

#### `public final Glob glob`
- Role: Caches the glob value.
- Description: Caches the `glob` value for reuse.

#### `public SignKey sesskey`
- Role: Caches the sesskey value.
- Description: Caches the `sesskey` value for reuse.

#### `private boolean closed = false`
- Role: Tracks whether closed is closed.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public String alias = null, readname = null, prsname = null`
- Role: Caches the alias value.
- Description: Caches the `alias` value for reuse.

#### `public String alias = null, readname = null, prsname = null`
- Role: Caches the alias value.
- Description: Caches the `alias` value for reuse.

#### `public String alias = null, readname = null, prsname = null`
- Role: Caches the alias value.
- Description: Caches the `alias` value for reuse.

#### `public Message msg`
- Role: Caches the msg value.
- Description: Caches the `msg` value for reuse.

#### `public final int resid`
- Role: Caches the resid value.
- Description: Caches the `resid` value for reuse.

#### `private transient final CachedRes res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `private final Waitable.Queue wq = new Waitable.Queue()`
- Role: Implements the wq operation.
- Description: Implements the queue operation.

#### `private final int resid`
- Role: Caches the resid value.
- Description: Caches the `resid` value for reuse.

#### `private String resnm = null`
- Role: Caches the resnm value.
- Description: Caches the `resnm` value for reuse.

#### `private int resver`
- Role: Caches the resver value.
- Description: Caches the `resver` value for reuse.

#### `private Reference<Ref> ind`
- Role: Caches the ind value.
- Description: Caches the `ind` value for reuse.

#### `private int prio = -6`
- Role: Caches the prio value.
- Description: Caches the `prio` value for reuse.

#### `private Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Function<Object, Object> resmapper = new ResID.ResolveMapper(this)`
- Role: Implements the resmapper operation.
- Description: Implements the resolve mapper operation.

#### `private final Transport.Callback conncb = new Transport.Callback()`
- Role: Implements the conncb operation.
- Description: Implements the callback operation.

### Methods

#### `public User(String name)`
- Role: Handles the user path.
- Description: Implements the user operation.

#### `public User alias(String val)`
- Role: Handles the alias path.
- Description: Implements the alias operation.

#### `public User readname(String val)`
- Role: Handles the readname path.
- Description: Implements the readname operation.

#### `public User prsname(String val)`
- Role: Handles the prsname path.
- Description: Implements the prsname operation.

#### `public String readname()`
- Role: Handles the readname path.
- Description: Implements the readname operation.

#### `public String prsname()`
- Role: Handles the prsname path.
- Description: Implements the prsname operation.

#### `public String reauth()`
- Role: Handles the reauth path.
- Description: Implements the reauth operation.

#### `public User copy()`
- Role: Handles the copy path.
- Description: Implements the copy operation.

#### `public MessageException(String text, Message msg)`
- Role: Handles the message exception path.
- Description: Implements the message exception operation.

#### `private LoadingIndir(CachedRes res)`
- Role: Handles the loading indir path.
- Description: Implements the loading indir operation.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Registers a callback to run when the waitable becomes ready.
- Description: Registers a callback to run when the waitable becomes ready.

#### `public boolean boostprio(int prio)`
- Role: Handles the boostprio path.
- Description: Requests a higher priority for the loading wait.

#### `public Resource.Pool pool()`
- Role: Handles the pool path.
- Description: Implements the pool operation.

#### `private CachedRes(int id)`
- Role: Handles the cached resource path.
- Description: Implements the cached res operation.

#### `public Resource get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Session for debugging and logging.

#### `private void reset()`
- Role: Resets the stream if mark/reset is supported.
- Description: Resets the stream if mark/reset is supported.

#### `private Ref get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void boostprio(int prio)`
- Role: Handles the boostprio path.
- Description: Requests a higher priority for the loading wait.

#### `public void set(String nm, int ver)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `private CachedRes cachedres(int id)`
- Role: Handles the cachedres path.
- Description: Implements the cachedres operation.

#### `public Indir<Resource> getres(int id, int prio)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Indir<Resource> getres(int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public Indir<Resource> dynres(UID uid)`
- Role: Handles the dynres path.
- Description: Implements the dynres operation.

#### `private void handlerel(PMessage msg)`
- Role: Handles the handlerel path.
- Description: Implements the handlerel operation.

#### `public Session(Transport conn, User user)`
- Role: Creates a new Session instance.
- Description: Constructs the Session instance from the supplied inputs.

#### `public static Session connect(SocketAddress server, User user, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException`
- Role: Handles the connect workflow.
- Description: Implements the connect operation.

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public void queuemsg(PMessage pmsg)`
- Role: Handles the queuemsg path.
- Description: Implements the queuemsg operation.

#### `public void postuimsg(PMessage msg)`
- Role: Handles the postuimsg path.
- Description: Implements the postuimsg operation.

#### `public PMessage getuimsg() throws InterruptedException`
- Role: Returns the uimsg.
- Description: Returns the uimsg.

#### `public void sendmsg(PMessage msg)`
- Role: Handles the sendmsg path.
- Description: Implements the sendmsg operation.