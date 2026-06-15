# Bootstrap

This file documents the responsibilities and members of `Bootstrap`.

## Meta

- Source: [Bootstrap.java](../../../src/haven/Bootstrap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Bootstraps Haven startup state.

## Nested Types

### Message

- Description: TODO

## Members

### Constants

#### `public static final Config.Variable<String> authuser = Config.Variable.prop("haven.authuser", null)`

- Description: TODO

#### `public static final Config.Variable<NamedSocketAddress> authserv = Config.Variable.proph("haven.server", AuthClient.DEFPORT, new NamedSocketAddress("localhost", AuthClient.DEFPORT))`

- Description: TODO

#### `public static final Config.Variable<NamedSocketAddress> gameserv = Config.Variable.proph("haven.gameserv", 1870, null)`

- Description: TODO

#### `public static final Config.Variable<Integer> gameport = Config.Variable.propi("haven.gameport", 1870)`

- Description: TODO

#### `public static final Config.Variable<byte[]> authck = Config.Variable.propb("haven.authck", null)`

- Description: TODO

#### `public static final Config.Variable<byte[]> authtoken = Config.Variable.propb("haven.inittoken", null)`

- Description: TODO

#### `public static final Config.Variable<String[]> servargs = Config.Variable.def(() -> null)`

- Description: TODO

#### `public static final Config.Variable<java.nio.file.Path> replay = Config.Variable.def(() -> null)`

- Description: TODO

### Fields

#### `public static boolean useinitauth = true`

- Description: TODO

#### `public final NamedSocketAddress server`

- Description: TODO

#### `public final String confname`

- Description: TODO

#### `Queue<Message> msgs = new LinkedList<Message>()`

- Description: TODO

#### `String inituser = null`

- Description: TODO

#### `byte[] initcookie = null`

- Description: TODO

#### `byte[] inittoken = null`

- Description: TODO

#### `int id`

- Description: TODO

#### `String name`

- Description: TODO

#### `Object[] args`

- Description: TODO

### Methods

#### `public Message(int id, String name, Object... args)`

- Description: TODO

#### `public Bootstrap(NamedSocketAddress server)`

- Description: TODO

#### `public Bootstrap()`

- Description: TODO

#### `public void setinitcookie(String username, byte[] cookie)`

- Description: TODO

#### `public void setinittoken(String username, byte[] token)`

- Description: TODO

#### `private String getpref(String name, String def)`

- Description: TODO

#### `private void setpref(String name, String val)`

- Description: TODO

#### `private static byte[] getprefb(String name, String confname, byte[] def, boolean zerovalid)`

- Description: TODO

#### `private static String mangleuser(String user)`

- Description: TODO

#### `public static byte[] gettoken(String user, String confname)`

- Description: TODO

#### `public static void rottokens(String user, String confname, boolean creat, boolean rm)`

- Description: TODO

#### `public static void settoken(String user, String confname, byte[] token)`

- Description: TODO

#### `private Message getmsg() throws InterruptedException`

- Description: TODO

#### `private static void preferhost(List<InetSocketAddress> hosts, SocketAddress prev)`

- Description: TODO

#### `public UI.Runner run(UI ui) throws InterruptedException`

- Description: TODO

#### `public void rcvmsg(int widget, String msg, Object... args)`

- Description: TODO
