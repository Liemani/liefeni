# Session

## Meta

- Source: [Session.java](../../../src/haven/Session.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents the active game session.

## Code Members

### Member Index

#### Constants

- [PVER](#member-2)
- [MSG_SESS](#member-3)
- [MSG_REL](#member-4)
- [MSG_ACK](#member-5)
- [MSG_BEAT](#member-6)
- [MSG_MAPREQ](#member-7)
- [MSG_MAPDATA](#member-8)
- [MSG_OBJDATA](#member-9)
- [MSG_OBJACK](#member-10)
- [MSG_CLOSE](#member-11)
- [MSG_CRYPT](#member-12)
- [SESSERR_AUTH](#member-13)
- [SESSERR_BUSY](#member-14)
- [SESSERR_CONN](#member-15)
- [SESSERR_PVER](#member-16)
- [SESSERR_EXPR](#member-17)
- [SESSERR_MESG](#member-18)

#### Fields

- [record](#member-1)
- [ackthresh](#member-19)
- [conn](#member-20)
- [connfailed](#member-21)
- [connerror](#member-22)
- [uimsgs](#member-23)
- [user](#member-24)
- [rescache](#member-25)
- [glob](#member-26)
- [sesskey](#member-27)
- [closed](#member-28)
- [name](#member-29)
- [alias](#member-30)
- [readname](#member-31)
- [prsname](#member-32)
- [msg](#member-41)
- [resid](#member-43)
- [res](#member-44)
- [wq](#member-49)
- [resid](#member-50)
- [resnm](#member-51)
- [resver](#member-52)
- [ind](#member-53)
- [prio](#member-54)
- [res](#member-56)
- [resmapper](#member-67)
- [conncb](#member-69)

#### Methods

- [User(String name)](#member-33)
- [alias(String val)](#member-34)
- [readname(String val)](#member-35)
- [prsname(String val)](#member-36)
- [readname()](#member-37)
- [prsname()](#member-38)
- [reauth()](#member-39)
- [copy()](#member-40)
- [MessageException(String text, Message msg)](#member-42)
- [LoadingIndir(CachedRes res)](#member-45)
- [waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)](#member-46)
- [boostprio(int prio)](#member-47)
- [pool()](#member-48)
- [CachedRes(int id)](#member-55)
- [get()](#member-57)
- [toString()](#member-58)
- [reset()](#member-59)
- [get()](#member-60)
- [boostprio(int prio)](#member-61)
- [set(String nm, int ver)](#member-62)
- [cachedres(int id)](#member-63)
- [getres(int id, int prio)](#member-64)
- [getres(int id)](#member-65)
- [dynres(UID uid)](#member-66)
- [handlerel(PMessage msg)](#member-68)
- [public static Session connect(SocketAddress server, User user, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException](#member-70)
- [close()](#member-71)
- [queuemsg(PMessage pmsg)](#member-72)
- [postuimsg(PMessage msg)](#member-73)
- [public PMessage getuimsg() throws InterruptedException](#member-74)
- [sendmsg(PMessage msg)](#member-75)

### Member Reference

#### Constants

<a id="member-2"></a>
##### `PVER`

- Description: TODO

<a id="member-3"></a>
##### `MSG_SESS`

- Description: TODO

<a id="member-4"></a>
##### `MSG_REL`

- Description: TODO

<a id="member-5"></a>
##### `MSG_ACK`

- Description: TODO

<a id="member-6"></a>
##### `MSG_BEAT`

- Description: TODO

<a id="member-7"></a>
##### `MSG_MAPREQ`

- Description: TODO

<a id="member-8"></a>
##### `MSG_MAPDATA`

- Description: TODO

<a id="member-9"></a>
##### `MSG_OBJDATA`

- Description: TODO

<a id="member-10"></a>
##### `MSG_OBJACK`

- Description: TODO

<a id="member-11"></a>
##### `MSG_CLOSE`

- Description: TODO

<a id="member-12"></a>
##### `MSG_CRYPT`

- Description: TODO

<a id="member-13"></a>
##### `SESSERR_AUTH`

- Description: TODO

<a id="member-14"></a>
##### `SESSERR_BUSY`

- Description: TODO

<a id="member-15"></a>
##### `SESSERR_CONN`

- Description: TODO

<a id="member-16"></a>
##### `SESSERR_PVER`

- Description: TODO

<a id="member-17"></a>
##### `SESSERR_EXPR`

- Description: TODO

<a id="member-18"></a>
##### `SESSERR_MESG`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `record`

- Description: TODO

<a id="member-19"></a>
##### `ackthresh`

- Description: TODO

<a id="member-20"></a>
##### `conn`

- Description: TODO

<a id="member-21"></a>
##### `connfailed`

- Description: TODO

<a id="member-22"></a>
##### `connerror`

- Description: TODO

<a id="member-23"></a>
##### `uimsgs`

- Description: TODO

<a id="member-24"></a>
##### `user`

- Description: TODO

<a id="member-25"></a>
##### `rescache`

- Description: TODO

<a id="member-26"></a>
##### `glob`

- Description: TODO

<a id="member-27"></a>
##### `sesskey`

- Description: TODO

<a id="member-28"></a>
##### `closed`

- Description: TODO

<a id="member-29"></a>
##### `name`

- Description: TODO

<a id="member-30"></a>
##### `alias`

- Description: TODO

<a id="member-31"></a>
##### `readname`

- Description: TODO

<a id="member-32"></a>
##### `prsname`

- Description: TODO

<a id="member-41"></a>
##### `msg`

- Description: TODO

<a id="member-43"></a>
##### `resid`

- Description: TODO

<a id="member-44"></a>
##### `res`

- Description: TODO

<a id="member-49"></a>
##### `wq`

- Description: TODO

<a id="member-50"></a>
##### `resid`

- Description: TODO

<a id="member-51"></a>
##### `resnm`

- Description: TODO

<a id="member-52"></a>
##### `resver`

- Description: TODO

<a id="member-53"></a>
##### `ind`

- Description: TODO

<a id="member-54"></a>
##### `prio`

- Description: TODO

<a id="member-56"></a>
##### `res`

- Description: TODO

<a id="member-67"></a>
##### `resmapper`

- Description: TODO

<a id="member-69"></a>
##### `conncb`

- Description: TODO

#### Methods

<a id="member-33"></a>
##### `User(String name)`

- Description: TODO

<a id="member-34"></a>
##### `alias(String val)`

- Description: TODO

<a id="member-35"></a>
##### `readname(String val)`

- Description: TODO

<a id="member-36"></a>
##### `prsname(String val)`

- Description: TODO

<a id="member-37"></a>
##### `readname()`

- Description: TODO

<a id="member-38"></a>
##### `prsname()`

- Description: TODO

<a id="member-39"></a>
##### `reauth()`

- Description: TODO

<a id="member-40"></a>
##### `copy()`

- Description: TODO

<a id="member-42"></a>
##### `MessageException(String text, Message msg)`

- Description: TODO

<a id="member-45"></a>
##### `LoadingIndir(CachedRes res)`

- Description: TODO

<a id="member-46"></a>
##### `waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

<a id="member-47"></a>
##### `boostprio(int prio)`

- Description: TODO

<a id="member-48"></a>
##### `pool()`

- Description: TODO

<a id="member-55"></a>
##### `CachedRes(int id)`

- Description: TODO

<a id="member-57"></a>
##### `get()`

- Description: TODO

<a id="member-58"></a>
##### `toString()`

- Description: TODO

<a id="member-59"></a>
##### `reset()`

- Description: TODO

<a id="member-60"></a>
##### `get()`

- Description: TODO

<a id="member-61"></a>
##### `boostprio(int prio)`

- Description: TODO

<a id="member-62"></a>
##### `set(String nm, int ver)`

- Description: TODO

<a id="member-63"></a>
##### `cachedres(int id)`

- Description: TODO

<a id="member-64"></a>
##### `getres(int id, int prio)`

- Description: TODO

<a id="member-65"></a>
##### `getres(int id)`

- Description: TODO

<a id="member-66"></a>
##### `dynres(UID uid)`

- Description: TODO

<a id="member-68"></a>
##### `handlerel(PMessage msg)`

- Description: TODO

<a id="member-70"></a>
##### `public static Session connect(SocketAddress server, User user, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException`

- Description: TODO

<a id="member-71"></a>
##### `close()`

- Description: TODO

<a id="member-72"></a>
##### `queuemsg(PMessage pmsg)`

- Description: TODO

<a id="member-73"></a>
##### `postuimsg(PMessage msg)`

- Description: TODO

<a id="member-74"></a>
##### `public PMessage getuimsg() throws InterruptedException`

- Description: TODO

<a id="member-75"></a>
##### `sendmsg(PMessage msg)`

- Description: TODO
