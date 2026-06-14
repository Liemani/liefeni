# Connection

## Meta

- Source: [Connection.java](../../../src/haven/Connection.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a network connection.

## Code Members

### Member Index

#### Constants

- [ACK_HOLD](#member-2)
- [OBJACK_HOLD](#member-3)
- [OBJACK_HOLD_MAX](#member-4)

#### Fields

- [encrypt](#member-1)
- [server](#member-5)
- [stats](#member-6)
- [cbs](#member-7)
- [sk](#member-8)
- [sel](#member-9)
- [key](#member-10)
- [worker](#member-11)
- [tseq](#member-12)
- [alive](#member-13)
- [crypt](#member-14)
- [cipher](#member-19)
- [tkey](#member-20)
- [rkey](#member-21)
- [rseqs](#member-22)
- [tseq](#member-23)
- [rpltimes](#member-29)
- [ptx](#member-30)
- [prx](#member-31)
- [pretx](#member-32)
- [btx](#member-33)
- [brx](#member-34)
- [prerx](#member-35)
- [prorx](#member-36)
- [rplhead](#member-37)
- [nrpls](#member-38)
- [srtt](#member-39)
- [rttv](#member-40)
- [apfx](#member-42)
- [init](#member-45)
- [recvbuf](#member-51)
- [pending](#member-58)
- [msg](#member-59)
- [result](#member-60)
- [cause](#member-61)
- [message](#member-62)
- [crypt](#member-63)
- [id](#member-66)
- [frame](#member-67)
- [frecv](#member-68)
- [lrecv](#member-69)
- [waiting](#member-71)
- [objacks](#member-72)
- [now](#member-73)
- [lasttx](#member-74)
- [rseq](#member-75)
- [ackseq](#member-76)
- [acktime](#member-77)
- [fragbuf](#member-78)
- [fragtype](#member-79)
- [sawclose](#member-91)
- [code](#member-96)

#### Methods

- [add(Callback cb)](#member-15)
- [DecryptException(String msg, Throwable cause)](#member-16)
- [DecryptException(String msg)](#member-17)
- [supported()](#member-18)
- [Crypto(byte[] cookie, byte[] salt)](#member-24)
- [encrypt(byte[] msg)](#member-25)
- [public synchronized byte[] decrypt(byte[] msg) throws DecryptException](#member-26)
- [encrypt(PMessage msg)](#member-27)
- [public PMessage decrypt(MessageBuf msg) throws DecryptException](#member-28)
- [addreply(double time)](#member-41)
- [abbr(String fmt, double n)](#member-43)
- [toString()](#member-44)
- [Worker(Task init)](#member-46)
- [run()](#member-47)
- [public Task run();](#member-48)
- [start(Task init)](#member-49)
- [alive()](#member-50)
- [private PMessage recv() throws IOException](#member-52)
- [send(ByteBuffer msg)](#member-53)
- [send(PMessage msg)](#member-54)
- [close()](#member-55)
- [private boolean select(double timeout) throws IOException](#member-56)
- [wake()](#member-57)
- [Connect(String username, boolean encrypt, byte[] cookie, Object... args)](#member-64)
- [run()](#member-65)
- [ObjAck(long id, int frame, double recv)](#member-70)
- [handlerel(PMessage msg)](#member-80)
- [gotrel(RMessage msg)](#member-81)
- [sendack(short seq)](#member-82)
- [gotack(short seq)](#member-83)
- [gotmapdata(MessageBuf msg)](#member-84)
- [gotobjdata(Message msg)](#member-85)
- [handlemsg(PMessage msg)](#member-86)
- [min2(double a, double b)](#member-87)
- [sendpending()](#member-88)
- [sendobjacks()](#member-89)
- [run()](#member-90)
- [Close(boolean sawclose)](#member-92)
- [run()](#member-93)
- [queuemsg(PMessage pmsg)](#member-94)
- [encrypted()](#member-95)
- [SessionError(int code, String reason)](#member-97)
- [SessionError(String reason)](#member-98)
- [SessionAuthError()](#member-99)
- [SessionBusyError()](#member-100)
- [SessionConnError()](#member-101)
- [SessionPVerError()](#member-102)
- [SessionExprError()](#member-103)
- [public void connect(String username, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException](#member-104)

### Member Reference

#### Constants

<a id="member-2"></a>
##### `ACK_HOLD`

- Description: TODO

<a id="member-3"></a>
##### `OBJACK_HOLD`

- Description: TODO

<a id="member-4"></a>
##### `OBJACK_HOLD_MAX`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `encrypt`

- Description: TODO

<a id="member-5"></a>
##### `server`

- Description: TODO

<a id="member-6"></a>
##### `stats`

- Description: TODO

<a id="member-7"></a>
##### `cbs`

- Description: TODO

<a id="member-8"></a>
##### `sk`

- Description: TODO

<a id="member-9"></a>
##### `sel`

- Description: TODO

<a id="member-10"></a>
##### `key`

- Description: TODO

<a id="member-11"></a>
##### `worker`

- Description: TODO

<a id="member-12"></a>
##### `tseq`

- Description: TODO

<a id="member-13"></a>
##### `alive`

- Description: TODO

<a id="member-14"></a>
##### `crypt`

- Description: TODO

<a id="member-19"></a>
##### `cipher`

- Description: TODO

<a id="member-20"></a>
##### `tkey`

- Description: TODO

<a id="member-21"></a>
##### `rkey`

- Description: TODO

<a id="member-22"></a>
##### `rseqs`

- Description: TODO

<a id="member-23"></a>
##### `tseq`

- Description: TODO

<a id="member-29"></a>
##### `rpltimes`

- Description: TODO

<a id="member-30"></a>
##### `ptx`

- Description: TODO

<a id="member-31"></a>
##### `prx`

- Description: TODO

<a id="member-32"></a>
##### `pretx`

- Description: TODO

<a id="member-33"></a>
##### `btx`

- Description: TODO

<a id="member-34"></a>
##### `brx`

- Description: TODO

<a id="member-35"></a>
##### `prerx`

- Description: TODO

<a id="member-36"></a>
##### `prorx`

- Description: TODO

<a id="member-37"></a>
##### `rplhead`

- Description: TODO

<a id="member-38"></a>
##### `nrpls`

- Description: TODO

<a id="member-39"></a>
##### `srtt`

- Description: TODO

<a id="member-40"></a>
##### `rttv`

- Description: TODO

<a id="member-42"></a>
##### `apfx`

- Description: TODO

<a id="member-45"></a>
##### `init`

- Description: TODO

<a id="member-51"></a>
##### `recvbuf`

- Description: TODO

<a id="member-58"></a>
##### `pending`

- Description: TODO

<a id="member-59"></a>
##### `msg`

- Description: TODO

<a id="member-60"></a>
##### `result`

- Description: TODO

<a id="member-61"></a>
##### `cause`

- Description: TODO

<a id="member-62"></a>
##### `message`

- Description: TODO

<a id="member-63"></a>
##### `crypt`

- Description: TODO

<a id="member-66"></a>
##### `id`

- Description: TODO

<a id="member-67"></a>
##### `frame`

- Description: TODO

<a id="member-68"></a>
##### `frecv`

- Description: TODO

<a id="member-69"></a>
##### `lrecv`

- Description: TODO

<a id="member-71"></a>
##### `waiting`

- Description: TODO

<a id="member-72"></a>
##### `objacks`

- Description: TODO

<a id="member-73"></a>
##### `now`

- Description: TODO

<a id="member-74"></a>
##### `lasttx`

- Description: TODO

<a id="member-75"></a>
##### `rseq`

- Description: TODO

<a id="member-76"></a>
##### `ackseq`

- Description: TODO

<a id="member-77"></a>
##### `acktime`

- Description: TODO

<a id="member-78"></a>
##### `fragbuf`

- Description: TODO

<a id="member-79"></a>
##### `fragtype`

- Description: TODO

<a id="member-91"></a>
##### `sawclose`

- Description: TODO

<a id="member-96"></a>
##### `code`

- Description: TODO

#### Methods

<a id="member-15"></a>
##### `add(Callback cb)`

- Description: TODO

<a id="member-16"></a>
##### `DecryptException(String msg, Throwable cause)`

- Description: TODO

<a id="member-17"></a>
##### `DecryptException(String msg)`

- Description: TODO

<a id="member-18"></a>
##### `supported()`

- Description: TODO

<a id="member-24"></a>
##### `Crypto(byte[] cookie, byte[] salt)`

- Description: TODO

<a id="member-25"></a>
##### `encrypt(byte[] msg)`

- Description: TODO

<a id="member-26"></a>
##### `public synchronized byte[] decrypt(byte[] msg) throws DecryptException`

- Description: TODO

<a id="member-27"></a>
##### `encrypt(PMessage msg)`

- Description: TODO

<a id="member-28"></a>
##### `public PMessage decrypt(MessageBuf msg) throws DecryptException`

- Description: TODO

<a id="member-41"></a>
##### `addreply(double time)`

- Description: TODO

<a id="member-43"></a>
##### `abbr(String fmt, double n)`

- Description: TODO

<a id="member-44"></a>
##### `toString()`

- Description: TODO

<a id="member-46"></a>
##### `Worker(Task init)`

- Description: TODO

<a id="member-47"></a>
##### `run()`

- Description: TODO

<a id="member-48"></a>
##### `public Task run();`

- Description: TODO

<a id="member-49"></a>
##### `start(Task init)`

- Description: TODO

<a id="member-50"></a>
##### `alive()`

- Description: TODO

<a id="member-52"></a>
##### `private PMessage recv() throws IOException`

- Description: TODO

<a id="member-53"></a>
##### `send(ByteBuffer msg)`

- Description: TODO

<a id="member-54"></a>
##### `send(PMessage msg)`

- Description: TODO

<a id="member-55"></a>
##### `close()`

- Description: TODO

<a id="member-56"></a>
##### `private boolean select(double timeout) throws IOException`

- Description: TODO

<a id="member-57"></a>
##### `wake()`

- Description: TODO

<a id="member-64"></a>
##### `Connect(String username, boolean encrypt, byte[] cookie, Object... args)`

- Description: TODO

<a id="member-65"></a>
##### `run()`

- Description: TODO

<a id="member-70"></a>
##### `ObjAck(long id, int frame, double recv)`

- Description: TODO

<a id="member-80"></a>
##### `handlerel(PMessage msg)`

- Description: TODO

<a id="member-81"></a>
##### `gotrel(RMessage msg)`

- Description: TODO

<a id="member-82"></a>
##### `sendack(short seq)`

- Description: TODO

<a id="member-83"></a>
##### `gotack(short seq)`

- Description: TODO

<a id="member-84"></a>
##### `gotmapdata(MessageBuf msg)`

- Description: TODO

<a id="member-85"></a>
##### `gotobjdata(Message msg)`

- Description: TODO

<a id="member-86"></a>
##### `handlemsg(PMessage msg)`

- Description: TODO

<a id="member-87"></a>
##### `min2(double a, double b)`

- Description: TODO

<a id="member-88"></a>
##### `sendpending()`

- Description: TODO

<a id="member-89"></a>
##### `sendobjacks()`

- Description: TODO

<a id="member-90"></a>
##### `run()`

- Description: TODO

<a id="member-92"></a>
##### `Close(boolean sawclose)`

- Description: TODO

<a id="member-93"></a>
##### `run()`

- Description: TODO

<a id="member-94"></a>
##### `queuemsg(PMessage pmsg)`

- Description: TODO

<a id="member-95"></a>
##### `encrypted()`

- Description: TODO

<a id="member-97"></a>
##### `SessionError(int code, String reason)`

- Description: TODO

<a id="member-98"></a>
##### `SessionError(String reason)`

- Description: TODO

<a id="member-99"></a>
##### `SessionAuthError()`

- Description: TODO

<a id="member-100"></a>
##### `SessionBusyError()`

- Description: TODO

<a id="member-101"></a>
##### `SessionConnError()`

- Description: TODO

<a id="member-102"></a>
##### `SessionPVerError()`

- Description: TODO

<a id="member-103"></a>
##### `SessionExprError()`

- Description: TODO

<a id="member-104"></a>
##### `public void connect(String username, boolean encrypt, byte[] cookie, Object... args) throws InterruptedException`

- Description: TODO
