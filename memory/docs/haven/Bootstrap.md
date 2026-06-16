# Bootstrap

This file documents the responsibilities and members of `Bootstrap`.

## Meta

- Source: [Bootstrap.java](../../../src/haven/Bootstrap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the bootstrap Haven component.

## Nested Types

### Message

- Role: Represents message within Bootstrap.
- Description: Describes the nested message type used by the enclosing class.

## Members

### Constants

#### `public static final Config.Variable<String> authuser = Config.Variable.prop("haven.authuser", null)`
- Role: Defines the shared authuser constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<NamedSocketAddress> authserv = Config.Variable.proph("haven.server", AuthClient.DEFPORT, new NamedSocketAddress("localhost", AuthClient.DEFPORT))`
- Role: Defines the shared authserv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<NamedSocketAddress> gameserv = Config.Variable.proph("haven.gameserv", 1870, null)`
- Role: Defines the shared gameserv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Integer> gameport = Config.Variable.propi("haven.gameport", 1870)`
- Role: Defines the shared gameport constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<byte[]> authck = Config.Variable.propb("haven.authck", null)`
- Role: Defines the shared authck constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<byte[]> authtoken = Config.Variable.propb("haven.inittoken", null)`
- Role: Defines the shared authtoken constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<String[]> servargs = Config.Variable.def(() -> null)`
- Role: Defines the shared servargs constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<java.nio.file.Path> replay = Config.Variable.def(() -> null)`
- Role: Defines the shared replay constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public static boolean useinitauth = true`
- Role: Tracks the useinitauth flag.
- Description: Supports the useinitauth operation used by the surrounding class.

#### `public final NamedSocketAddress server`
- Role: Holds the server state.
- Description: Backs the cached state for this file.

#### `public final String confname`
- Role: Stores the confname value.
- Description: Backs the cached state for this file.

#### `Queue<Message> msgs = new LinkedList<Message>()`
- Role: Caches msgs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `String inituser = null`
- Role: Stores the inituser value.
- Description: Backs the cached state for this file.

#### `byte[] initcookie = null`
- Role: Stores the initcookie value.
- Description: Backs the cached state for this file.

#### `byte[] inittoken = null`
- Role: Stores the inittoken value.
- Description: Backs the cached state for this file.

#### `int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

### Methods

#### `public Message(int id, String name, Object... args)`
- Role: Performs message.
- Description: Supports the message operation used by the surrounding class.

#### `public Bootstrap(NamedSocketAddress server)`
- Role: Creates a new Bootstrap instance.
- Description: Constructs the instance and initializes its default state.

#### `public Bootstrap()`
- Role: Creates a new Bootstrap instance.
- Description: Constructs the instance and initializes its default state.

#### `public void setinitcookie(String username, byte[] cookie)`
- Role: Performs setinitcookie.
- Description: Supports the setinitcookie operation used by the surrounding class.

#### `public void setinittoken(String username, byte[] token)`
- Role: Performs setinittoken.
- Description: Supports the setinittoken operation used by the surrounding class.

#### `private String getpref(String name, String def)`
- Role: Performs getpref.
- Description: Supports the getpref operation used by the surrounding class.

#### `private void setpref(String name, String val)`
- Role: Performs setpref.
- Description: Supports the setpref operation used by the surrounding class.

#### `private static byte[] getprefb(String name, String confname, byte[] def, boolean zerovalid)`
- Role: Performs getprefb.
- Description: Supports the getprefb operation used by the surrounding class.

#### `private static String mangleuser(String user)`
- Role: Performs mangleuser.
- Description: Supports the mangleuser operation used by the surrounding class.

#### `public static byte[] gettoken(String user, String confname)`
- Role: Performs gettoken.
- Description: Supports the gettoken operation used by the surrounding class.

#### `public static void rottokens(String user, String confname, boolean creat, boolean rm)`
- Role: Performs rottokens.
- Description: Supports the rottokens operation used by the surrounding class.

#### `public static void settoken(String user, String confname, byte[] token)`
- Role: Performs settoken.
- Description: Supports the settoken operation used by the surrounding class.

#### `private Message getmsg() throws InterruptedException`
- Role: Returns the msg value.
- Description: Exposes the requested value without mutating state.

#### `private static void preferhost(List<InetSocketAddress> hosts, SocketAddress prev)`
- Role: Performs preferhost.
- Description: Supports the preferhost operation used by the surrounding class.

#### `public UI.Runner run(UI ui) throws InterruptedException`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void rcvmsg(int widget, String msg, Object... args)`
- Role: Performs rcvmsg.
- Description: Supports the rcvmsg operation used by the surrounding class.
