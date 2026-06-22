---
source: [Bootstrap.java](../../../../src/haven/Bootstrap.java)
created: 2026-06-13
updated: 2026-06-14
---

# Bootstrap

Represents the bootstrap Haven component.

## Nested Types

### Message

- Role: Represents message within Bootstrap.
- Description: Describes the nested message type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<String> authuser = Config.Variable.prop("haven.authuser", null)`
- Role: Implements the authuser operation.
- Description: Implements the prop operation.
- Value: `Config.Variable.prop("haven.authuser", null)`

#### `public static final Config.Variable<NamedSocketAddress> authserv = Config.Variable.proph("haven.server", AuthClient.DEFPORT, new NamedSocketAddress("localhost", AuthClient.DEFPORT))`
- Role: Implements the authserv operation.
- Description: Implements the named socket address operation.
- Value: `Config.Variable.proph("haven.server", AuthClient.DEFPORT, new NamedSocketAddress("localhost", AuthClient.DEFPORT))`

#### `public static final Config.Variable<NamedSocketAddress> gameserv = Config.Variable.proph("haven.gameserv", 1870, null)`
- Role: Implements the gameserv operation.
- Description: Implements the proph operation.
- Value: `Config.Variable.proph("haven.gameserv", 1870, null)`

#### `public static final Config.Variable<Integer> gameport = Config.Variable.propi("haven.gameport", 1870)`
- Role: Implements the gameport operation.
- Description: Implements the propi operation.
- Value: `Config.Variable.propi("haven.gameport", 1870)`

#### `public static final Config.Variable<byte[]> authck = Config.Variable.propb("haven.authck", null)`
- Role: Implements the authck operation.
- Description: Implements the propb operation.
- Value: `Config.Variable.propb("haven.authck", null)`

#### `public static final Config.Variable<byte[]> authtoken = Config.Variable.propb("haven.inittoken", null)`
- Role: Implements the authtoken operation.
- Description: Implements the propb operation.
- Value: `Config.Variable.propb("haven.inittoken", null)`

#### `public static final Config.Variable<String[]> servargs = Config.Variable.def(() -> null)`
- Role: Implements the servargs operation.
- Description: Implements the def operation.
- Value: `Config.Variable.def(() -> null)`

#### `public static final Config.Variable<java.nio.file.Path> replay = Config.Variable.def(() -> null)`
- Role: Implements the replay operation.
- Description: Implements the def operation.
- Value: `Config.Variable.def(() -> null)`

### Fields

#### `public static boolean useinitauth = true`
- Role: Tracks the useinitauth flag.
- Description: Caches the `useinitauth` value for reuse.

#### `public final NamedSocketAddress server`
- Role: Caches the server value.
- Description: Caches the `server` value for reuse.

#### `public final String confname`
- Role: Caches the confname value.
- Description: Caches the `confname` value for reuse.

#### `Queue<Message> msgs = new LinkedList<Message>()`
- Role: Implements the msgs operation.
- Description: Implements the queue<message> msgs = new linked list<message>() operation.

#### `String inituser = null`
- Role: Caches the inituser value.
- Description: Caches the `inituser` value for reuse.

#### `byte[] initcookie = null`
- Role: Caches the initcookie value.
- Description: Caches the `initcookie` value for reuse.

#### `byte[] inittoken = null`
- Role: Caches the inittoken value.
- Description: Caches the `inittoken` value for reuse.

#### `int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `Object[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

### Methods

#### `public Message(int id, String name, Object... args)`
- Role: Handles the message path.
- Description: Implements the message operation.

#### `public Bootstrap(NamedSocketAddress server)`
- Role: Creates a new Bootstrap instance.
- Description: Constructs the Bootstrap instance from the supplied inputs.

#### `public Bootstrap()`
- Role: Creates a new Bootstrap instance.
- Description: Constructs the Bootstrap instance from the supplied inputs.

#### `public void setinitcookie(String username, byte[] cookie)`
- Role: Handles the setinitcookie path.
- Description: Updates the initcookie.

#### `public void setinittoken(String username, byte[] token)`
- Role: Handles the setinittoken path.
- Description: Updates the inittoken.

#### `private String getpref(String name, String def)`
- Role: Handles the getpref path.
- Description: Returns the pref.

#### `private void setpref(String name, String val)`
- Role: Handles the setpref path.
- Description: Updates the pref.

#### `private static byte[] getprefb(String name, String confname, byte[] def, boolean zerovalid)`
- Role: Handles the getprefb path.
- Description: Returns the prefb.

#### `private static String mangleuser(String user)`
- Role: Handles the mangleuser path.
- Description: Implements the mangleuser operation.

#### `public static byte[] gettoken(String user, String confname)`
- Role: Handles the gettoken path.
- Description: Returns the token.

#### `public static void rottokens(String user, String confname, boolean creat, boolean rm)`
- Role: Handles the rottokens path.
- Description: Implements the rottokens operation.

#### `public static void settoken(String user, String confname, byte[] token)`
- Role: Handles the settoken path.
- Description: Updates the token.

#### `private Message getmsg() throws InterruptedException`
- Role: Returns the msg.
- Description: Returns the msg.

#### `private static void preferhost(List<InetSocketAddress> hosts, SocketAddress prev)`
- Role: Handles the preferhost path.
- Description: Implements the preferhost operation.

#### `public UI.Runner run(UI ui) throws InterruptedException`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void rcvmsg(int widget, String msg, Object... args)`
- Role: Handles the rcvmsg path.
- Description: Implements the rcvmsg operation.