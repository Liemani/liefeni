---
source: [Steam.java](../../../../src/haven/Steam.java)
created: 2026-06-13
updated: 2026-06-14
---

# Steam

Represents the steam Haven component.

## Nested Types

### API

- Role: Wraps the Steam API handle.
- Description: Thin adapter that exposes the native Steam interface through the Java wrapper.

### Details

- Role: Stores Steam application details.
- Description: Metadata record used to describe the current Steam-integrated client state.

### Listener

- Role: Receives Steam callbacks.
- Description: Callback interface for asynchronous Steam events.

### ResultError

- Role: Signals a Steam API failure.
- Description: Error wrapper for failed Steam result operations.

### SteamLibraryLoaderJogl

- Role: Loads Steam libraries for JOGL.
- Description: Native library loader specialization for the JOGL backend.

### StorageStatus

- Role: Tracks Steam storage availability.
- Description: Report object describing remote storage status and quota conditions.

### SvcError

- Role: Signals a Steam service failure.
- Description: Runtime exception used for Steam service-level errors.

### UGItem

- Role: Stores one workshop item record.
- Description: Metadata for a Steam workshop item.

### Update

- Role: Represents a Steam update event.
- Description: Event wrapper used when the client receives a Steam update notification.

### Waiter

- Role: Waits for Steam callbacks.
- Description: Helper that blocks until a Steam operation completes.

### WebTicket

- Role: Stores a Steam web ticket.
- Description: Ticket record used for browser-based Steam authentication flows.

## Members

### Constants

### Fields

#### `private final Collection<Listener> listening = new CopyOnWriteArrayList<>()`
- Role: Implements the listening operation.
- Description: Implements the private final collection<listener> listening = new copy on write array list<>() operation.

#### `private final API api = new API(this)`
- Role: Implements the api operation.
- Description: Implements the api operation.

#### `public final SteamResult res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `private final String id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private final Queue<Object[]> got = new LinkedList<>()`
- Role: Implements the got operation.
- Description: Implements the private final queue<object[]> got = new linked list<>() operation.

#### `private static Steam instance = null`
- Role: Caches the instance value.
- Description: Caches the `instance` value for reuse.

#### `final Steam host`
- Role: Caches the host value.
- Description: Caches the `host` value for reuse.

#### `final SteamUtils utils = new SteamUtils(new SteamUtilsCallback()`
- Role: Implements the utils operation.
- Description: Implements the steam utils callback operation.

#### `final SteamFriends friends = new SteamFriends(new SteamFriendsCallback()`
- Role: Implements the friends operation.
- Description: Implements the steam friends callback operation.

#### `final SteamRemoteStorage rs = new SteamRemoteStorage(new SteamRemoteStorageCallback()`
- Role: Implements the rs operation.
- Description: Implements the steam remote storage callback operation.

#### `final SteamUGC ugc = new SteamUGC(new SteamUGCCallback()`
- Role: Implements the ugc operation.
- Description: Implements the steam ugc callback operation.

#### `final SteamUser user = new SteamUser(new SteamUserCallback()`
- Role: Implements the user operation.
- Description: Implements the steam user callback operation.

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
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private final SteamAuthTicket handle`
- Role: Caches the handle value.
- Description: Caches the `handle` value for reuse.

#### `private boolean cancelled = false`
- Role: Tracks the cancelled flag.
- Description: Caches the `cancelled` value for reuse.

#### `private ByteBuffer xfbuf = null`
- Role: Caches the xfbuf value.
- Description: Caches the `xfbuf` value for reuse.

#### `public final SteamPublishedFileID id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private final SteamUGC.ItemInstallInfo iinf = new SteamUGC.ItemInstallInfo()`
- Role: Implements the iinf operation.
- Description: Implements the item install info operation.

#### `private final SteamUGC.ItemDownloadInfo dinf = new SteamUGC.ItemDownloadInfo()`
- Role: Implements the dinf operation.
- Description: Implements the item download info operation.

#### `private Collection<SteamUGC.ItemState> state`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `public SteamResult dlresult = SteamResult.OK`
- Role: Caches the dlresult value.
- Description: Caches the `dlresult` value for reuse.

#### `public final String title, description`
- Role: Caches the description value.
- Description: Caches the `description` value for reuse.

#### `public final String title, description`
- Role: Caches the description value.
- Description: Caches the `description` value for reuse.

#### `public final SteamID owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

#### `private Future<Details> details = null`
- Role: Caches the details value.
- Description: Caches the `details` value for reuse.

#### `public final SteamUGCUpdateHandle id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public SteamResult done = null`
- Role: Caches the done value.
- Description: Caches the `done` value for reuse.

#### `public boolean agreed`
- Role: Tracks the agreed flag.
- Description: Caches the `agreed` value for reuse.

#### `public SteamUGC.ItemUpdateStatus state = SteamUGC.ItemUpdateStatus.Invalid`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `public long prog, size`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

#### `public long prog, size`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

#### `public boolean agreed = true`
- Role: Tracks the agreed flag.
- Description: Caches the `agreed` value for reuse.

### Methods

#### `public SvcError(String message)`
- Role: Handles the svc error path.
- Description: Implements the svc error operation.

#### `public SvcError(Throwable cause)`
- Role: Handles the svc error path.
- Description: Implements the svc error operation.

#### `public SvcError(String message, Throwable cause)`
- Role: Handles the svc error path.
- Description: Implements the svc error operation.

#### `public ResultError(String message, SteamResult res)`
- Role: Handles the result error path.
- Description: Implements the result error operation.

#### `public void callback(String id, Object[] args)`
- Role: Handles the callback path.
- Description: Implements the callback operation.

#### `public void add(Listener l)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Listener l)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public Waiter(String id)`
- Role: Handles the waiter path.
- Description: Implements the waiter operation.

#### `public void callback(String id, Object[] args)`
- Role: Handles the callback path.
- Description: Implements the callback operation.

#### `public Object[] get() throws InterruptedException`
- Role: Returns the cached get.
- Description: Returns the cached get.

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `private void post(String cbid, Object... args)`
- Role: Handles the post processors path.
- Description: Implements the post operation.

#### `public boolean loadLibrary(String nm)`
- Role: Returns the library.
- Description: Loads the library.

#### `private Steam()`
- Role: Creates a new Steam instance.
- Description: Constructs the Steam instance from the supplied inputs.

#### `private void listen()`
- Role: Handles the listen path.
- Description: Implements the listen operation.

#### `public static synchronized Steam get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `private API(Steam host)`
- Role: Handles the api path.
- Description: Implements the api operation.

#### `private static synchronized boolean init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `int fileRead(String name, ByteBuffer buf) throws IOException`
- Role: Handles the file read workflow.
- Description: Implements the file read operation.

#### `void fileWrite(String name, ByteBuffer data) throws IOException`
- Role: Handles the file write workflow.
- Description: Implements the file write operation.

#### `public synchronized int appid()`
- Role: Handles the appid path.
- Description: Implements the appid operation.

#### `public synchronized int userid()`
- Role: Handles the userid path.
- Description: Implements the userid operation.

#### `public synchronized String displayname()`
- Role: Handles the displayname path.
- Description: Implements the displayname operation.

#### `public synchronized void browse(URI uri, boolean modal)`
- Role: Handles the browse path.
- Description: Implements the browse operation.

#### `public synchronized void overlaypos(String pos)`
- Role: Handles the overlaypos path.
- Description: Implements the overlaypos operation.

#### `public synchronized void setrp(String key, String val)`
- Role: Handles the setrp path.
- Description: Updates the rp.

#### `public void setparty(String pid, int sz)`
- Role: Handles the setparty path.
- Description: Updates the party.

#### `private WebTicket(SteamAuthTicket handle, byte[] data)`
- Role: Handles the web ticket path.
- Description: Implements the web ticket operation.

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.

#### `public WebTicket webticket() throws InterruptedException`
- Role: Handles the webticket workflow.
- Description: Implements the webticket operation.

#### `public StorageStatus checkstorage()`
- Role: Handles the checkstorage path.
- Description: Implements the checkstorage operation.

#### `public void enablestorage(boolean on)`
- Role: Handles the enablestorage path.
- Description: Implements the enablestorage operation.

#### `private void checkcloud() throws IOException`
- Role: Handles the checkcloud workflow.
- Description: Implements the checkcloud operation.

#### `private ByteBuffer xfbuf(int sz)`
- Role: Handles the xfbuf path.
- Description: Implements the xfbuf operation.

#### `public synchronized byte[] readfile(String name) throws IOException`
- Role: Handles the readfile workflow.
- Description: Implements the readfile operation.

#### `public synchronized void writefile(String name, byte[] data) throws IOException`
- Role: Handles the writefile workflow.
- Description: Implements the writefile operation.

#### `public UGItem(SteamPublishedFileID id)`
- Role: Handles the ugitem path.
- Description: Implements the ug item operation.

#### `public long fid()`
- Role: Handles the fid path.
- Description: Implements the fid operation.

#### `public void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public Path path()`
- Role: Handles the path path.
- Description: Implements the path operation.

#### `public void download(boolean prioritized)`
- Role: Handles the download path.
- Description: Implements the download operation.

#### `public boolean installed()`
- Role: Handles the installed path.
- Description: Implements the installed operation.

#### `public boolean stale()`
- Role: Handles the stale path.
- Description: Implements the stale operation.

#### `public boolean fetching()`
- Role: Handles the fetching path.
- Description: Implements the fetching operation.

#### `public boolean pending()`
- Role: Handles the pending path.
- Description: Implements the pending operation.

#### `public long got()`
- Role: Handles the got path.
- Description: Implements the got operation.

#### `public long size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public Details(SteamUGCDetails info)`
- Role: Handles the details path.
- Description: Implements the details operation.

#### `public Future<Details> details()`
- Role: Handles the details path.
- Description: Implements the details operation.

#### `public Update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void title(String title)`
- Role: Handles the title path.
- Description: Implements the title operation.

#### `public void description(String desc)`
- Role: Handles the description path.
- Description: Implements the description operation.

#### `public void metadata(String data)`
- Role: Handles the metadata path.
- Description: Implements the metadata operation.

#### `public void tags(String... tags)`
- Role: Handles the tags path.
- Description: Implements the tags operation.

#### `public void contents(Path dir)`
- Role: Handles the contents path.
- Description: Implements the contents operation.

#### `public void preview(Path file)`
- Role: Handles the preview path.
- Description: Implements the preview operation.

#### `public void setprivate()`
- Role: Handles the setprivate path.
- Description: Updates the private.

#### `public void setfriendsonly()`
- Role: Handles the setfriendsonly path.
- Description: Updates the friendsonly.

#### `public void setpublic()`
- Role: Handles the setpublic path.
- Description: Updates the public.

#### `public void submit(String message)`
- Role: Handles the submit path.
- Description: Implements the submit operation.

#### `public void callback(String id, Object[] args)`
- Role: Handles the callback path.
- Description: Implements the callback operation.

#### `public void getprogress()`
- Role: Handles the getprogress path.
- Description: Returns the progress.

#### `public URI legalurl()`
- Role: Handles the legalurl path.
- Description: Implements the legalurl operation.

#### `public UGItem ugitem(long id)`
- Role: Handles the ugitem path.
- Description: Implements the ugitem operation.

#### `public Collection<UGItem> ugitems()`
- Role: Handles the ugitems path.
- Description: Implements the ugitems operation.

#### `public UGItem mkugitem() throws InterruptedException`
- Role: Handles the mkugitem workflow.
- Description: Implements the mkugitem operation.

#### `public void ugqueryitems(Collection<UGItem> items)`
- Role: Handles the ugqueryitems path.
- Description: Implements the ugqueryitems operation.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.