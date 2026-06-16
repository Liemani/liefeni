# Steam

This file documents the responsibilities and members of `Steam`.

## Meta

- Source: [Steam.java](../../../src/haven/Steam.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the steam Haven component.

## Nested Types

### API

- Role: Represents api within Steam.
- Description: Describes the nested api type used by the enclosing class.

### Details

- Role: Represents details within Steam.
- Description: Describes the nested details type used by the enclosing class.

### Listener

- Role: Represents listener within Steam.
- Description: Describes the nested listener type used by the enclosing class.

### ResultError

- Role: Represents result error within Steam.
- Description: Describes the nested result error type used by the enclosing class.

### SteamLibraryLoaderJogl

- Role: Represents steam library loader jogl within Steam.
- Description: Describes the nested steam library loader jogl type used by the enclosing class.

### StorageStatus

- Role: Represents storage status within Steam.
- Description: Describes the nested storage status type used by the enclosing class.

### SvcError

- Role: Represents svc error within Steam.
- Description: Describes the nested svc error type used by the enclosing class.

### UGItem

- Role: Represents ugitem within Steam.
- Description: Describes the nested ugitem type used by the enclosing class.

### Update

- Role: Represents update within Steam.
- Description: Describes the nested update type used by the enclosing class.

### Waiter

- Role: Represents waiter within Steam.
- Description: Describes the nested waiter type used by the enclosing class.

### WebTicket

- Role: Represents web ticket within Steam.
- Description: Describes the nested web ticket type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final Collection<Listener> listening = new CopyOnWriteArrayList<>()`
- Role: Caches listening entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final API api = new API(this)`
- Role: Holds the api state.
- Description: Backs the cached state for this file.

#### `public final SteamResult res`
- Role: Holds the res state.
- Description: Backs the cached state for this file.

#### `private final String id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private final Queue<Object[]> got = new LinkedList<>()`
- Role: Caches got entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private static Steam instance = null`
- Role: Holds the instance state.
- Description: Backs the cached state for this file.

#### `final Steam host`
- Role: Holds the host state.
- Description: Backs the cached state for this file.

#### `final SteamUtils utils = new SteamUtils(new SteamUtilsCallback()`
- Role: Holds the utils state.
- Description: Backs the cached state for this file.

#### `final SteamFriends friends = new SteamFriends(new SteamFriendsCallback()`
- Role: Holds the friends state.
- Description: Backs the cached state for this file.

#### `final SteamRemoteStorage rs = new SteamRemoteStorage(new SteamRemoteStorageCallback()`
- Role: Holds the rs state.
- Description: Backs the cached state for this file.

#### `final SteamUGC ugc = new SteamUGC(new SteamUGCCallback()`
- Role: Holds the ugc state.
- Description: Backs the cached state for this file.

#### `final SteamUser user = new SteamUser(new SteamUserCallback()`
- Role: Holds the user state.
- Description: Backs the cached state for this file.

#### `private static boolean loaded = false, inited = false, failed = false`
- Role: Tracks whether loaded is loaded.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static boolean loaded = false, inited = false, failed = false`
- Role: Tracks whether loaded is loaded.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static boolean loaded = false, inited = false, failed = false`
- Role: Tracks whether loaded is loaded.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `public final byte[] data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private final SteamAuthTicket handle`
- Role: Holds the handle state.
- Description: Backs the cached state for this file.

#### `private boolean cancelled = false`
- Role: Tracks the cancelled flag.
- Description: Supports the cancelled operation used by the surrounding class.

#### `private ByteBuffer xfbuf = null`
- Role: Stores the xfbuf value.
- Description: Backs the cached state for this file.

#### `public final SteamPublishedFileID id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private final SteamUGC.ItemInstallInfo iinf = new SteamUGC.ItemInstallInfo()`
- Role: Holds the iinf state.
- Description: Backs the cached state for this file.

#### `private final SteamUGC.ItemDownloadInfo dinf = new SteamUGC.ItemDownloadInfo()`
- Role: Holds the dinf state.
- Description: Backs the cached state for this file.

#### `private Collection<SteamUGC.ItemState> state`
- Role: Caches state entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public SteamResult dlresult = SteamResult.OK`
- Role: Holds the dlresult state.
- Description: Backs the cached state for this file.

#### `public final String title, description`
- Role: Stores the description value.
- Description: Backs the cached state for this file.

#### `public final String title, description`
- Role: Stores the description value.
- Description: Backs the cached state for this file.

#### `public final SteamID owner`
- Role: Holds the owner state.
- Description: Backs the cached state for this file.

#### `private Future<Details> details = null`
- Role: Holds the details state.
- Description: Backs the cached state for this file.

#### `public final SteamUGCUpdateHandle id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `public SteamResult done = null`
- Role: Holds the done state.
- Description: Backs the cached state for this file.

#### `public boolean agreed`
- Role: Tracks the agreed flag.
- Description: Supports the agreed operation used by the surrounding class.

#### `public SteamUGC.ItemUpdateStatus state = SteamUGC.ItemUpdateStatus.Invalid`
- Role: Holds the state state.
- Description: Backs the cached state for this file.

#### `public long prog, size`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

#### `public long prog, size`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

#### `public boolean agreed = true`
- Role: Tracks the agreed flag.
- Description: Supports the agreed operation used by the surrounding class.

### Methods

#### `public SvcError(String message)`
- Role: Performs svc error.
- Description: Supports the svc error operation used by the surrounding class.

#### `public SvcError(Throwable cause)`
- Role: Performs svc error.
- Description: Supports the svc error operation used by the surrounding class.

#### `public SvcError(String message, Throwable cause)`
- Role: Performs svc error.
- Description: Supports the svc error operation used by the surrounding class.

#### `public ResultError(String message, SteamResult res)`
- Role: Performs result error.
- Description: Supports the result error operation used by the surrounding class.

#### `public void callback(String id, Object[] args)`
- Role: Performs callback.
- Description: Supports the callback operation used by the surrounding class.

#### `public void add(Listener l)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Listener l)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public Waiter(String id)`
- Role: Performs waiter.
- Description: Supports the waiter operation used by the surrounding class.

#### `public void callback(String id, Object[] args)`
- Role: Performs callback.
- Description: Supports the callback operation used by the surrounding class.

#### `public Object[] get() throws InterruptedException`
- Role: Returns the  value.
- Description: Exposes the requested value without mutating state.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `private void post(String cbid, Object... args)`
- Role: Performs post.
- Description: Supports the post operation used by the surrounding class.

#### `public boolean loadLibrary(String nm)`
- Role: Returns the library.
- Description: Exposes the requested value without mutating state.

#### `private Steam()`
- Role: Creates a new Steam instance.
- Description: Constructs the instance and initializes its default state.

#### `private void listen()`
- Role: Performs listen.
- Description: Supports the listen operation used by the surrounding class.

#### `public static synchronized Steam get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private API(Steam host)`
- Role: Performs api.
- Description: Supports the api operation used by the surrounding class.

#### `private static synchronized boolean init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `int fileRead(String name, ByteBuffer buf) throws IOException`
- Role: Handles the file read workflow.
- Description: Supports the file read operation used by the surrounding class.

#### `void fileWrite(String name, ByteBuffer data) throws IOException`
- Role: Handles the file write workflow.
- Description: Supports the file write operation used by the surrounding class.

#### `public synchronized int appid()`
- Role: Performs appid.
- Description: Supports the appid operation used by the surrounding class.

#### `public synchronized int userid()`
- Role: Performs userid.
- Description: Supports the userid operation used by the surrounding class.

#### `public synchronized String displayname()`
- Role: Performs displayname.
- Description: Supports the displayname operation used by the surrounding class.

#### `public synchronized void browse(URI uri, boolean modal)`
- Role: Performs browse.
- Description: Supports the browse operation used by the surrounding class.

#### `public synchronized void overlaypos(String pos)`
- Role: Performs overlaypos.
- Description: Supports the overlaypos operation used by the surrounding class.

#### `public synchronized void setrp(String key, String val)`
- Role: Performs setrp.
- Description: Supports the setrp operation used by the surrounding class.

#### `public void setparty(String pid, int sz)`
- Role: Performs setparty.
- Description: Supports the setparty operation used by the surrounding class.

#### `private WebTicket(SteamAuthTicket handle, byte[] data)`
- Role: Performs web ticket.
- Description: Supports the web ticket operation used by the surrounding class.

#### `public void close()`
- Role: Closes the current resource.
- Description: Supports the close operation used by the surrounding class.

#### `public WebTicket webticket() throws InterruptedException`
- Role: Handles the webticket workflow.
- Description: Supports the webticket operation used by the surrounding class.

#### `public StorageStatus checkstorage()`
- Role: Performs checkstorage.
- Description: Supports the checkstorage operation used by the surrounding class.

#### `public void enablestorage(boolean on)`
- Role: Performs enablestorage.
- Description: Supports the enablestorage operation used by the surrounding class.

#### `private void checkcloud() throws IOException`
- Role: Handles the checkcloud workflow.
- Description: Supports the checkcloud operation used by the surrounding class.

#### `private ByteBuffer xfbuf(int sz)`
- Role: Performs xfbuf.
- Description: Supports the xfbuf operation used by the surrounding class.

#### `public synchronized byte[] readfile(String name) throws IOException`
- Role: Handles the readfile workflow.
- Description: Supports the readfile operation used by the surrounding class.

#### `public synchronized void writefile(String name, byte[] data) throws IOException`
- Role: Handles the writefile workflow.
- Description: Supports the writefile operation used by the surrounding class.

#### `public UGItem(SteamPublishedFileID id)`
- Role: Performs ugitem.
- Description: Supports the ugitem operation used by the surrounding class.

#### `public long fid()`
- Role: Performs fid.
- Description: Supports the fid operation used by the surrounding class.

#### `public void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public Path path()`
- Role: Performs path.
- Description: Supports the path operation used by the surrounding class.

#### `public void download(boolean prioritized)`
- Role: Performs download.
- Description: Supports the download operation used by the surrounding class.

#### `public boolean installed()`
- Role: Performs installed.
- Description: Supports the installed operation used by the surrounding class.

#### `public boolean stale()`
- Role: Performs stale.
- Description: Supports the stale operation used by the surrounding class.

#### `public boolean fetching()`
- Role: Performs fetching.
- Description: Supports the fetching operation used by the surrounding class.

#### `public boolean pending()`
- Role: Performs pending.
- Description: Supports the pending operation used by the surrounding class.

#### `public long got()`
- Role: Performs got.
- Description: Supports the got operation used by the surrounding class.

#### `public long size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Details(SteamUGCDetails info)`
- Role: Performs details.
- Description: Supports the details operation used by the surrounding class.

#### `public Future<Details> details()`
- Role: Performs details.
- Description: Supports the details operation used by the surrounding class.

#### `public Update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void title(String title)`
- Role: Performs title.
- Description: Supports the title operation used by the surrounding class.

#### `public void description(String desc)`
- Role: Performs description.
- Description: Supports the description operation used by the surrounding class.

#### `public void metadata(String data)`
- Role: Performs metadata.
- Description: Supports the metadata operation used by the surrounding class.

#### `public void tags(String... tags)`
- Role: Performs tags.
- Description: Supports the tags operation used by the surrounding class.

#### `public void contents(Path dir)`
- Role: Performs contents.
- Description: Supports the contents operation used by the surrounding class.

#### `public void preview(Path file)`
- Role: Performs preview.
- Description: Supports the preview operation used by the surrounding class.

#### `public void setprivate()`
- Role: Performs setprivate.
- Description: Supports the setprivate operation used by the surrounding class.

#### `public void setfriendsonly()`
- Role: Performs setfriendsonly.
- Description: Supports the setfriendsonly operation used by the surrounding class.

#### `public void setpublic()`
- Role: Performs setpublic.
- Description: Supports the setpublic operation used by the surrounding class.

#### `public void submit(String message)`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public void callback(String id, Object[] args)`
- Role: Performs callback.
- Description: Supports the callback operation used by the surrounding class.

#### `public void getprogress()`
- Role: Performs getprogress.
- Description: Supports the getprogress operation used by the surrounding class.

#### `public URI legalurl()`
- Role: Performs legalurl.
- Description: Supports the legalurl operation used by the surrounding class.

#### `public UGItem ugitem(long id)`
- Role: Performs ugitem.
- Description: Supports the ugitem operation used by the surrounding class.

#### `public Collection<UGItem> ugitems()`
- Role: Performs ugitems.
- Description: Supports the ugitems operation used by the surrounding class.

#### `public UGItem mkugitem() throws InterruptedException`
- Role: Handles the mkugitem workflow.
- Description: Supports the mkugitem operation used by the surrounding class.

#### `public void ugqueryitems(Collection<UGItem> items)`
- Role: Performs ugqueryitems.
- Description: Supports the ugqueryitems operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
