# Steam

This file documents the responsibilities and members of `Steam`.

## Meta

- Source: [Steam.java](../../../src/haven/Steam.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Integrates with Steam APIs.

## Nested Types

### API

- Description: TODO

### Details

- Description: TODO

### Listener

- Description: TODO

### ResultError

- Description: TODO

### SteamLibraryLoaderJogl

- Description: TODO

### StorageStatus

- Description: TODO

### SvcError

- Description: TODO

### UGItem

- Description: TODO

### Update

- Description: TODO

### Waiter

- Description: TODO

### WebTicket

- Description: TODO

## Members

### Constants

### Fields

#### `private final Collection<Listener> listening = new CopyOnWriteArrayList<>()`

- Description: TODO

#### `private final API api = new API(this)`

- Description: TODO

#### `public final SteamResult res`

- Description: TODO

#### `private final String id`

- Description: TODO

#### `private final Queue<Object[]> got = new LinkedList<>()`

- Description: TODO

#### `private static Steam instance = null`

- Description: TODO

#### `final Steam host`

- Description: TODO

#### `final SteamUtils utils = new SteamUtils(new SteamUtilsCallback()`

- Description: TODO

#### `final SteamFriends friends = new SteamFriends(new SteamFriendsCallback()`

- Description: TODO

#### `final SteamRemoteStorage rs = new SteamRemoteStorage(new SteamRemoteStorageCallback()`

- Description: TODO

#### `final SteamUGC ugc = new SteamUGC(new SteamUGCCallback()`

- Description: TODO

#### `final SteamUser user = new SteamUser(new SteamUserCallback()`

- Description: TODO

#### `private static boolean loaded = false, inited = false, failed = false`

- Description: TODO

#### `private static boolean loaded = false, inited = false, failed = false`

- Description: TODO

#### `private static boolean loaded = false, inited = false, failed = false`

- Description: TODO

#### `public final byte[] data`

- Description: TODO

#### `private final SteamAuthTicket handle`

- Description: TODO

#### `private boolean cancelled = false`

- Description: TODO

#### `private ByteBuffer xfbuf = null`

- Description: TODO

#### `public final SteamPublishedFileID id`

- Description: TODO

#### `private final SteamUGC.ItemInstallInfo iinf = new SteamUGC.ItemInstallInfo()`

- Description: TODO

#### `private final SteamUGC.ItemDownloadInfo dinf = new SteamUGC.ItemDownloadInfo()`

- Description: TODO

#### `private Collection<SteamUGC.ItemState> state`

- Description: TODO

#### `public SteamResult dlresult = SteamResult.OK`

- Description: TODO

#### `public final String title, description`

- Description: TODO

#### `public final String title, description`

- Description: TODO

#### `public final SteamID owner`

- Description: TODO

#### `private Future<Details> details = null`

- Description: TODO

#### `public final SteamUGCUpdateHandle id`

- Description: TODO

#### `public SteamResult done = null`

- Description: TODO

#### `public boolean agreed`

- Description: TODO

#### `public SteamUGC.ItemUpdateStatus state = SteamUGC.ItemUpdateStatus.Invalid`

- Description: TODO

#### `public long prog, size`

- Description: TODO

#### `public long prog, size`

- Description: TODO

#### `public boolean agreed = true`

- Description: TODO

### Methods

#### `public SvcError(String message)`

- Description: TODO

#### `public SvcError(Throwable cause)`

- Description: TODO

#### `public SvcError(String message, Throwable cause)`

- Description: TODO

#### `public ResultError(String message, SteamResult res)`

- Description: TODO

#### `public void callback(String id, Object[] args)`

- Description: TODO

#### `public void add(Listener l)`

- Description: TODO

#### `public void remove(Listener l)`

- Description: TODO

#### `public Waiter(String id)`

- Description: TODO

#### `public void callback(String id, Object[] args)`

- Description: TODO

#### `public Object[] get() throws InterruptedException`

- Description: TODO

#### `public void close()`

- Description: TODO

#### `private void post(String cbid, Object... args)`

- Description: TODO

#### `public boolean loadLibrary(String nm)`

- Description: TODO

#### `private Steam()`

- Description: TODO

#### `private void listen()`

- Description: TODO

#### `public static synchronized Steam get()`

- Description: TODO

#### `private API(Steam host)`

- Description: TODO

#### `private static synchronized boolean init()`

- Description: TODO

#### `int fileRead(String name, ByteBuffer buf) throws IOException`

- Description: TODO

#### `void fileWrite(String name, ByteBuffer data) throws IOException`

- Description: TODO

#### `public synchronized int appid()`

- Description: TODO

#### `public synchronized int userid()`

- Description: TODO

#### `public synchronized String displayname()`

- Description: TODO

#### `public synchronized void browse(URI uri, boolean modal)`

- Description: TODO

#### `public synchronized void overlaypos(String pos)`

- Description: TODO

#### `public synchronized void setrp(String key, String val)`

- Description: TODO

#### `public void setparty(String pid, int sz)`

- Description: TODO

#### `private WebTicket(SteamAuthTicket handle, byte[] data)`

- Description: TODO

#### `public void close()`

- Description: TODO

#### `public WebTicket webticket() throws InterruptedException`

- Description: TODO

#### `public StorageStatus checkstorage()`

- Description: TODO

#### `public void enablestorage(boolean on)`

- Description: TODO

#### `private void checkcloud() throws IOException`

- Description: TODO

#### `private ByteBuffer xfbuf(int sz)`

- Description: TODO

#### `public synchronized byte[] readfile(String name) throws IOException`

- Description: TODO

#### `public synchronized void writefile(String name, byte[] data) throws IOException`

- Description: TODO

#### `public UGItem(SteamPublishedFileID id)`

- Description: TODO

#### `public long fid()`

- Description: TODO

#### `public void update()`

- Description: TODO

#### `public Path path()`

- Description: TODO

#### `public void download(boolean prioritized)`

- Description: TODO

#### `public boolean installed()`

- Description: TODO

#### `public boolean stale()`

- Description: TODO

#### `public boolean fetching()`

- Description: TODO

#### `public boolean pending()`

- Description: TODO

#### `public long got()`

- Description: TODO

#### `public long size()`

- Description: TODO

#### `public Details(SteamUGCDetails info)`

- Description: TODO

#### `public Future<Details> details()`

- Description: TODO

#### `public Update()`

- Description: TODO

#### `public void title(String title)`

- Description: TODO

#### `public void description(String desc)`

- Description: TODO

#### `public void metadata(String data)`

- Description: TODO

#### `public void tags(String... tags)`

- Description: TODO

#### `public void contents(Path dir)`

- Description: TODO

#### `public void preview(Path file)`

- Description: TODO

#### `public void setprivate()`

- Description: TODO

#### `public void setfriendsonly()`

- Description: TODO

#### `public void setpublic()`

- Description: TODO

#### `public void submit(String message)`

- Description: TODO

#### `public void callback(String id, Object[] args)`

- Description: TODO

#### `public void getprogress()`

- Description: TODO

#### `public URI legalurl()`

- Description: TODO

#### `public UGItem ugitem(long id)`

- Description: TODO

#### `public Collection<UGItem> ugitems()`

- Description: TODO

#### `public UGItem mkugitem() throws InterruptedException`

- Description: TODO

#### `public void ugqueryitems(Collection<UGItem> items)`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
