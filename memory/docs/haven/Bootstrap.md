# Bootstrap

## Meta

- Source: [Bootstrap.java](../../../src/haven/Bootstrap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Bootstraps Haven startup state.

## Code Members

### Member Index

#### Fields

- [authuser](#member-1)
- [authserv](#member-2)
- [gameserv](#member-3)
- [gameport](#member-4)
- [authck](#member-5)
- [authtoken](#member-6)
- [servargs](#member-7)
- [replay](#member-8)
- [useinitauth](#member-9)
- [server](#member-10)
- [confname](#member-11)
- [msgs](#member-12)
- [inituser](#member-13)
- [initcookie](#member-14)
- [inittoken](#member-15)
- [id](#member-16)
- [name](#member-17)
- [args](#member-18)

#### Methods

- [Message(int id, String name, Object... args)](#member-19)
- [setinitcookie(String username, byte[] cookie)](#member-20)
- [setinittoken(String username, byte[] token)](#member-21)
- [getpref(String name, String def)](#member-22)
- [setpref(String name, String val)](#member-23)
- [getprefb(String name, String confname, byte[] def, boolean zerovalid)](#member-24)
- [mangleuser(String user)](#member-25)
- [gettoken(String user, String confname)](#member-26)
- [rottokens(String user, String confname, boolean creat, boolean rm)](#member-27)
- [settoken(String user, String confname, byte[] token)](#member-28)
- [private Message getmsg() throws InterruptedException](#member-29)
- [preferhost(List<InetSocketAddress> hosts, SocketAddress prev)](#member-30)
- [public UI.Runner run(UI ui) throws InterruptedException](#member-31)
- [rcvmsg(int widget, String msg, Object... args)](#member-32)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `authuser`

- Description: TODO

<a id="member-2"></a>
##### `authserv`

- Description: TODO

<a id="member-3"></a>
##### `gameserv`

- Description: TODO

<a id="member-4"></a>
##### `gameport`

- Description: TODO

<a id="member-5"></a>
##### `authck`

- Description: TODO

<a id="member-6"></a>
##### `authtoken`

- Description: TODO

<a id="member-7"></a>
##### `servargs`

- Description: TODO

<a id="member-8"></a>
##### `replay`

- Description: TODO

<a id="member-9"></a>
##### `useinitauth`

- Description: TODO

<a id="member-10"></a>
##### `server`

- Description: TODO

<a id="member-11"></a>
##### `confname`

- Description: TODO

<a id="member-12"></a>
##### `msgs`

- Description: TODO

<a id="member-13"></a>
##### `inituser`

- Description: TODO

<a id="member-14"></a>
##### `initcookie`

- Description: TODO

<a id="member-15"></a>
##### `inittoken`

- Description: TODO

<a id="member-16"></a>
##### `id`

- Description: TODO

<a id="member-17"></a>
##### `name`

- Description: TODO

<a id="member-18"></a>
##### `args`

- Description: TODO

#### Methods

<a id="member-19"></a>
##### `Message(int id, String name, Object... args)`

- Description: TODO

<a id="member-20"></a>
##### `setinitcookie(String username, byte[] cookie)`

- Description: TODO

<a id="member-21"></a>
##### `setinittoken(String username, byte[] token)`

- Description: TODO

<a id="member-22"></a>
##### `getpref(String name, String def)`

- Description: TODO

<a id="member-23"></a>
##### `setpref(String name, String val)`

- Description: TODO

<a id="member-24"></a>
##### `getprefb(String name, String confname, byte[] def, boolean zerovalid)`

- Description: TODO

<a id="member-25"></a>
##### `mangleuser(String user)`

- Description: TODO

<a id="member-26"></a>
##### `gettoken(String user, String confname)`

- Description: TODO

<a id="member-27"></a>
##### `rottokens(String user, String confname, boolean creat, boolean rm)`

- Description: TODO

<a id="member-28"></a>
##### `settoken(String user, String confname, byte[] token)`

- Description: TODO

<a id="member-29"></a>
##### `private Message getmsg() throws InterruptedException`

- Description: TODO

<a id="member-30"></a>
##### `preferhost(List<InetSocketAddress> hosts, SocketAddress prev)`

- Description: TODO

<a id="member-31"></a>
##### `public UI.Runner run(UI ui) throws InterruptedException`

- Description: TODO

<a id="member-32"></a>
##### `rcvmsg(int widget, String msg, Object... args)`

- Description: TODO
