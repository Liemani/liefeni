# Steam

## Meta

- Source: [Steam.java](../../../src/haven/Steam.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Integrates with Steam APIs.

## Code Members

### Member Index

#### Fields

- [listening](#member-1)
- [api](#member-2)
- [res](#member-6)
- [id](#member-11)
- [got](#member-12)
- [instance](#member-20)
- [host](#member-22)
- [utils](#member-24)
- [friends](#member-25)
- [rs](#member-26)
- [ugc](#member-27)
- [user](#member-28)
- [loaded](#member-29)
- [inited](#member-30)
- [failed](#member-31)
- [data](#member-42)
- [handle](#member-43)
- [cancelled](#member-44)
- [xfbuf](#member-51)
- [id](#member-55)
- [iinf](#member-56)
- [dinf](#member-57)
- [state](#member-58)
- [dlresult](#member-63)
- [title](#member-71)
- [description](#member-72)
- [owner](#member-73)
- [details](#member-75)
- [id](#member-77)
- [done](#member-90)
- [agreed](#member-91)
- [state](#member-92)
- [prog](#member-93)
- [size](#member-94)
- [agreed](#member-96)

#### Methods

- [SvcError(String message)](#member-3)
- [SvcError(Throwable cause)](#member-4)
- [SvcError(String message, Throwable cause)](#member-5)
- [ResultError(String message, SteamResult res)](#member-7)
- [public void callback(String id, Object[] args);](#member-8)
- [add(Listener l)](#member-9)
- [remove(Listener l)](#member-10)
- [Waiter(String id)](#member-13)
- [callback(String id, Object[] args)](#member-14)
- [public Object[] get() throws InterruptedException](#member-15)
- [close()](#member-16)
- [post(String cbid, Object... args)](#member-17)
- [loadLibrary(String nm)](#member-18)
- [listen()](#member-19)
- [get()](#member-21)
- [API(Steam host)](#member-23)
- [init()](#member-32)
- [int fileRead(String name, ByteBuffer buf) throws IOException](#member-33)
- [void fileWrite(String name, ByteBuffer data) throws IOException](#member-34)
- [appid()](#member-35)
- [userid()](#member-36)
- [displayname()](#member-37)
- [browse(URI uri, boolean modal)](#member-38)
- [overlaypos(String pos)](#member-39)
- [setrp(String key, String val)](#member-40)
- [setparty(String pid, int sz)](#member-41)
- [WebTicket(SteamAuthTicket handle, byte[] data)](#member-45)
- [close()](#member-46)
- [public WebTicket webticket() throws InterruptedException](#member-47)
- [checkstorage()](#member-48)
- [enablestorage(boolean on)](#member-49)
- [private void checkcloud() throws IOException](#member-50)
- [xfbuf(int sz)](#member-52)
- [public synchronized byte[] readfile(String name) throws IOException](#member-53)
- [public synchronized void writefile(String name, byte[] data) throws IOException](#member-54)
- [UGItem(SteamPublishedFileID id)](#member-59)
- [fid()](#member-60)
- [update()](#member-61)
- [path()](#member-62)
- [download(boolean prioritized)](#member-64)
- [installed()](#member-65)
- [stale()](#member-66)
- [fetching()](#member-67)
- [pending()](#member-68)
- [got()](#member-69)
- [size()](#member-70)
- [Details(SteamUGCDetails info)](#member-74)
- [details()](#member-76)
- [Update()](#member-78)
- [title(String title)](#member-79)
- [description(String desc)](#member-80)
- [metadata(String data)](#member-81)
- [tags(String... tags)](#member-82)
- [contents(Path dir)](#member-83)
- [preview(Path file)](#member-84)
- [setprivate()](#member-85)
- [setfriendsonly()](#member-86)
- [setpublic()](#member-87)
- [submit(String message)](#member-88)
- [callback(String id, Object[] args)](#member-89)
- [getprogress()](#member-95)
- [legalurl()](#member-97)
- [ugitem(long id)](#member-98)
- [ugitems()](#member-99)
- [public UGItem mkugitem() throws InterruptedException](#member-100)
- [ugqueryitems(Collection<UGItem> items)](#member-101)
- [public static void main(String[] args) throws Exception](#member-102)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `listening`

- Description: TODO

<a id="member-2"></a>
##### `api`

- Description: TODO

<a id="member-6"></a>
##### `res`

- Description: TODO

<a id="member-11"></a>
##### `id`

- Description: TODO

<a id="member-12"></a>
##### `got`

- Description: TODO

<a id="member-20"></a>
##### `instance`

- Description: TODO

<a id="member-22"></a>
##### `host`

- Description: TODO

<a id="member-24"></a>
##### `utils`

- Description: TODO

<a id="member-25"></a>
##### `friends`

- Description: TODO

<a id="member-26"></a>
##### `rs`

- Description: TODO

<a id="member-27"></a>
##### `ugc`

- Description: TODO

<a id="member-28"></a>
##### `user`

- Description: TODO

<a id="member-29"></a>
##### `loaded`

- Description: TODO

<a id="member-30"></a>
##### `inited`

- Description: TODO

<a id="member-31"></a>
##### `failed`

- Description: TODO

<a id="member-42"></a>
##### `data`

- Description: TODO

<a id="member-43"></a>
##### `handle`

- Description: TODO

<a id="member-44"></a>
##### `cancelled`

- Description: TODO

<a id="member-51"></a>
##### `xfbuf`

- Description: TODO

<a id="member-55"></a>
##### `id`

- Description: TODO

<a id="member-56"></a>
##### `iinf`

- Description: TODO

<a id="member-57"></a>
##### `dinf`

- Description: TODO

<a id="member-58"></a>
##### `state`

- Description: TODO

<a id="member-63"></a>
##### `dlresult`

- Description: TODO

<a id="member-71"></a>
##### `title`

- Description: TODO

<a id="member-72"></a>
##### `description`

- Description: TODO

<a id="member-73"></a>
##### `owner`

- Description: TODO

<a id="member-75"></a>
##### `details`

- Description: TODO

<a id="member-77"></a>
##### `id`

- Description: TODO

<a id="member-90"></a>
##### `done`

- Description: TODO

<a id="member-91"></a>
##### `agreed`

- Description: TODO

<a id="member-92"></a>
##### `state`

- Description: TODO

<a id="member-93"></a>
##### `prog`

- Description: TODO

<a id="member-94"></a>
##### `size`

- Description: TODO

<a id="member-96"></a>
##### `agreed`

- Description: TODO

#### Methods

<a id="member-3"></a>
##### `SvcError(String message)`

- Description: TODO

<a id="member-4"></a>
##### `SvcError(Throwable cause)`

- Description: TODO

<a id="member-5"></a>
##### `SvcError(String message, Throwable cause)`

- Description: TODO

<a id="member-7"></a>
##### `ResultError(String message, SteamResult res)`

- Description: TODO

<a id="member-8"></a>
##### `public void callback(String id, Object[] args);`

- Description: TODO

<a id="member-9"></a>
##### `add(Listener l)`

- Description: TODO

<a id="member-10"></a>
##### `remove(Listener l)`

- Description: TODO

<a id="member-13"></a>
##### `Waiter(String id)`

- Description: TODO

<a id="member-14"></a>
##### `callback(String id, Object[] args)`

- Description: TODO

<a id="member-15"></a>
##### `public Object[] get() throws InterruptedException`

- Description: TODO

<a id="member-16"></a>
##### `close()`

- Description: TODO

<a id="member-17"></a>
##### `post(String cbid, Object... args)`

- Description: TODO

<a id="member-18"></a>
##### `loadLibrary(String nm)`

- Description: TODO

<a id="member-19"></a>
##### `listen()`

- Description: TODO

<a id="member-21"></a>
##### `get()`

- Description: TODO

<a id="member-23"></a>
##### `API(Steam host)`

- Description: TODO

<a id="member-32"></a>
##### `init()`

- Description: TODO

<a id="member-33"></a>
##### `int fileRead(String name, ByteBuffer buf) throws IOException`

- Description: TODO

<a id="member-34"></a>
##### `void fileWrite(String name, ByteBuffer data) throws IOException`

- Description: TODO

<a id="member-35"></a>
##### `appid()`

- Description: TODO

<a id="member-36"></a>
##### `userid()`

- Description: TODO

<a id="member-37"></a>
##### `displayname()`

- Description: TODO

<a id="member-38"></a>
##### `browse(URI uri, boolean modal)`

- Description: TODO

<a id="member-39"></a>
##### `overlaypos(String pos)`

- Description: TODO

<a id="member-40"></a>
##### `setrp(String key, String val)`

- Description: TODO

<a id="member-41"></a>
##### `setparty(String pid, int sz)`

- Description: TODO

<a id="member-45"></a>
##### `WebTicket(SteamAuthTicket handle, byte[] data)`

- Description: TODO

<a id="member-46"></a>
##### `close()`

- Description: TODO

<a id="member-47"></a>
##### `public WebTicket webticket() throws InterruptedException`

- Description: TODO

<a id="member-48"></a>
##### `checkstorage()`

- Description: TODO

<a id="member-49"></a>
##### `enablestorage(boolean on)`

- Description: TODO

<a id="member-50"></a>
##### `private void checkcloud() throws IOException`

- Description: TODO

<a id="member-52"></a>
##### `xfbuf(int sz)`

- Description: TODO

<a id="member-53"></a>
##### `public synchronized byte[] readfile(String name) throws IOException`

- Description: TODO

<a id="member-54"></a>
##### `public synchronized void writefile(String name, byte[] data) throws IOException`

- Description: TODO

<a id="member-59"></a>
##### `UGItem(SteamPublishedFileID id)`

- Description: TODO

<a id="member-60"></a>
##### `fid()`

- Description: TODO

<a id="member-61"></a>
##### `update()`

- Description: TODO

<a id="member-62"></a>
##### `path()`

- Description: TODO

<a id="member-64"></a>
##### `download(boolean prioritized)`

- Description: TODO

<a id="member-65"></a>
##### `installed()`

- Description: TODO

<a id="member-66"></a>
##### `stale()`

- Description: TODO

<a id="member-67"></a>
##### `fetching()`

- Description: TODO

<a id="member-68"></a>
##### `pending()`

- Description: TODO

<a id="member-69"></a>
##### `got()`

- Description: TODO

<a id="member-70"></a>
##### `size()`

- Description: TODO

<a id="member-74"></a>
##### `Details(SteamUGCDetails info)`

- Description: TODO

<a id="member-76"></a>
##### `details()`

- Description: TODO

<a id="member-78"></a>
##### `Update()`

- Description: TODO

<a id="member-79"></a>
##### `title(String title)`

- Description: TODO

<a id="member-80"></a>
##### `description(String desc)`

- Description: TODO

<a id="member-81"></a>
##### `metadata(String data)`

- Description: TODO

<a id="member-82"></a>
##### `tags(String... tags)`

- Description: TODO

<a id="member-83"></a>
##### `contents(Path dir)`

- Description: TODO

<a id="member-84"></a>
##### `preview(Path file)`

- Description: TODO

<a id="member-85"></a>
##### `setprivate()`

- Description: TODO

<a id="member-86"></a>
##### `setfriendsonly()`

- Description: TODO

<a id="member-87"></a>
##### `setpublic()`

- Description: TODO

<a id="member-88"></a>
##### `submit(String message)`

- Description: TODO

<a id="member-89"></a>
##### `callback(String id, Object[] args)`

- Description: TODO

<a id="member-95"></a>
##### `getprogress()`

- Description: TODO

<a id="member-97"></a>
##### `legalurl()`

- Description: TODO

<a id="member-98"></a>
##### `ugitem(long id)`

- Description: TODO

<a id="member-99"></a>
##### `ugitems()`

- Description: TODO

<a id="member-100"></a>
##### `public UGItem mkugitem() throws InterruptedException`

- Description: TODO

<a id="member-101"></a>
##### `ugqueryitems(Collection<UGItem> items)`

- Description: TODO

<a id="member-102"></a>
##### `public static void main(String[] args) throws Exception`

- Description: TODO
