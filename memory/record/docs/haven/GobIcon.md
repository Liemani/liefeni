---
source: [GobIcon.java](../../../../src/haven/GobIcon.java)
created: 2026-06-13
updated: 2026-06-14
---

# GobIcon

Represents the gob icon Haven component.

## Nested Types

### $icon

- Role: Registers the gob-icon resource factory.
- Description: Creates a `GobIcon` from a resource layer.

### Factory

- Role: Creates one gob icon from a resource and owner context.
- Description: Standard factory contract for gob icon implementations.

### ID

- Role: Identifies one gob icon entry.
- Description: Stores the icon id and related metadata.

### Icon

- Role: Represents one drawable gob icon.
- Description: Draws the icon and exposes its tooltip/name behavior.

### IconLine

- Role: Renders one icon row.
- Description: Item widget used by the icon list to display and select a single icon.

### IconList

- Role: Renders and manages the gob icon list.
- Description: Searchable list widget that groups icon entries and exposes selection state.

### IconSettings

- Role: Renders the icon settings panel.
- Description: Widget that lets the user configure gob icon behavior and notification options.

### Image

- Role: Wraps one cached icon image.
- Description: Image record used for caching a resource-backed gob icon texture.

### ImageIcon

- Role: Draws a resource-backed icon image.
- Description: Icon implementation that renders a cached image for a gob icon resource.

### ListIcon

- Role: Represents a selectable icon entry.
- Description: Metadata for a gob icon entry shown in the list UI.

### Loader

- Role: Loads icon data in the background.
- Description: Worker that resolves icon resources and populates the icon cache.

### Markable

- Role: Marks icons that can be notified or highlighted.
- Description: Interface for icon entries that participate in notification handling.

### NotifBox

- Role: Renders one notification icon entry.
- Description: Drop-down widget used to select notification behavior for a gob icon.

### NotificationSetting

- Role: Stores one notification rule.
- Description: Serializable record that binds a notification name to a file or builtin icon.

### ResID

- Role: Identifies one icon resource.
- Description: Serializable resource identifier used when persisting icon settings.

### Setting

- Role: Stores one icon setting entry.
- Description: Serializable record that binds a gob icon name to its configuration.

### Settings

- Role: Collects gob icon settings.
- Description: Serializable settings container and owner-context adapter for persisted icon configuration.

### SettingsWindow

- Role: Renders the icon settings window.
- Description: Window widget that exposes the icon list, settings editor, and related controls.

## Members

### Constants

#### `private static final int size = UI.scale(20)`
- Role: Implements the size operation.
- Description: Implements the scale operation.
- Value: `UI.scale(20)`

#### `public static final PUtils.Convolution filter = new PUtils.Hanning(1)`
- Role: Implements the filter operation.
- Description: Implements the hanning operation.
- Value: `new PUtils.Hanning(1)`

#### `public static final Object[] nilid = new Object[0]`
- Role: Caches the nilid value.
- Description: Caches the `nilid` value for reuse.
- Value: `new Object[0]`

#### `private static final Map<Resource, Image> cache = new WeakHashMap<>()`
- Role: Implements the cache operation.
- Description: Implements the private static final map<resource, image> cache = new weak hash map<>() operation.
- Value: `new WeakHashMap<>()`

#### `public static final Factory factory = new Factory()`
- Role: Implements the factory operation.
- Description: Implements the factory operation.
- Value: `new Factory()`

#### `private static final Map<Object, Double> lastnotifs = new HashMap<>()`
- Role: Implements the lastnotifs operation.
- Description: Implements the private static final map<object, double> lastnotifs = new hash map<>() operation.
- Value: `new HashMap<>()`

#### `public static final byte[] sig = "Icons".getBytes(Utils.ascii)`
- Role: Implements the sig operation.
- Description: Implements the get bytes operation.
- Value: `"Icons".getBytes(Utils.ascii)`

#### `public static final NotificationSetting nil = new NotificationSetting("None", null, null)`
- Role: Implements the nil operation.
- Description: Implements the notification setting operation.
- Value: `new NotificationSetting("None", null, null)`

#### `public static final NotificationSetting other = new NotificationSetting("Select file...", null, null)`
- Role: Implements the other operation.
- Description: Implements the notification setting operation.
- Value: `new NotificationSetting("Select file...", null, null)`

#### `public static final List<NotificationSetting> builtin`
#### `public static final List<NotificationSetting> builtin`
- Role: Caches the builtin value.
- Description: Caches the `builtin` value for reuse.

#### `private static final Text.Foundry elf = CharWnd.attrf`
- Role: Caches the elf value.
- Description: Caches the `elf` value for reuse.
- Value: `CharWnd.attrf`

#### `private static final int elh = elf.height() + UI.scale(2)`
- Role: Implements the elh operation.
- Description: Implements the scale operation.
- Value: `elf.height() + UI.scale(2)`

### Fields

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final byte[] sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `private Icon icon`
- Role: Caches the icon value.
- Description: Caches the `icon` value for reuse.

#### `public final OwnerContext owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final BufferedImage img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `public final Tex tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public Coord cc`
- Role: Caches the cc value.
- Description: Caches the `cc` value for reuse.

#### `public boolean rot`
- Role: Tracks the rot flag.
- Description: Caches the `rot` value for reuse.

#### `public double ao`
- Role: Caches the ao value.
- Description: Caches the `ao` value for reuse.

#### `public int z`
- Role: Caches the z value.
- Description: Caches the `z` value for reuse.

#### `public final Image img`
- Role: Caches the img value.
- Description: Caches the `img` value for reuse.

#### `private final Gob gob = owner.fcontext(Gob.class, false)`
- Role: Implements the gob operation.
- Description: Implements the fcontext operation.

#### `public final ID id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Icon icon`
- Role: Caches the icon value.
- Description: Caches the `icon` value for reuse.

#### `public final Settings.ResID from`
- Role: Caches the from value.
- Description: Caches the `from` value for reuse.

#### `public Resource.Saved res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public boolean show, defshow, notify`
- Role: Tracks the notify flag.
- Description: Caches the `notify` value for reuse.

#### `public boolean show, defshow, notify`
- Role: Tracks the notify flag.
- Description: Caches the `notify` value for reuse.

#### `public boolean show, defshow, notify`
- Role: Tracks the notify flag.
- Description: Caches the `notify` value for reuse.

#### `public String resns`
- Role: Caches the resns value.
- Description: Caches the `resns` value for reuse.

#### `public Path filens`
- Role: Caches the filens value.
- Description: Caches the `filens` value for reuse.

#### `public boolean mark, markset`
- Role: Tracks the markset flag.
- Description: Caches the `markset` value for reuse.

#### `public boolean mark, markset`
- Role: Tracks the markset flag.
- Description: Caches the `markset` value for reuse.

#### `public final String res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Object[] sub`
- Role: Caches the sub value.
- Description: Caches the `sub` value for reuse.

#### `private Resource lres`
- Role: Caches the lres value.
- Description: Caches the `lres` value for reuse.

#### `public final UI ui`
- Role: Caches the active Haven UI instance.
- Description: Caches the active Haven UI instance.

#### `public final String filename`
- Role: Caches the filename value.
- Description: Caches the `filename` value for reuse.

#### `public Map<Setting.ID, Setting> settings = new HashMap<>()`
- Role: Updates the tings.
- Description: Updates the tings.

#### `public int tag = -1`
- Role: Caches the tag value.
- Description: Caches the `tag` value for reuse.

#### `public boolean notify = false`
- Role: Tracks the notify flag.
- Description: Caches the `notify` value for reuse.

#### `public final Resource.Saved res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final byte[] data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private Loader loading = null`
- Role: Tracks whether  is currently loading.
- Description: Tracks whether  is currently loading.

#### `public final Queue<ResID> load = new ArrayDeque<>()`
- Role: Implements the load operation.
- Description: Implements the public final queue<res id> load = new array deque<>() operation.

#### `public final Map<ResID, Setting> defaults = new HashMap<>()`
- Role: Implements the defaults operation.
- Description: Implements the public final map<res id, setting> defaults = new hash map<>() operation.

#### `public final Map<ResID, Collection<Setting>> resolve = new HashMap<>()`
- Role: Resolves the requested value from the current runtime state.
- Description: Resolves the requested value from the current runtime state.

#### `public boolean save = false, adv = false`
- Role: Tracks the save flag.
- Description: Caches the `save` value for reuse.

#### `public boolean save = false, adv = false`
- Role: Tracks the save flag.
- Description: Caches the `save` value for reuse.

#### `public Integer tag = null`
- Role: Caches the tag value.
- Description: Caches the `tag` value for reuse.

#### `private final Collection<Icon> advbuf = new ArrayList<>()`
- Role: Implements the advbuf operation.
- Description: Implements the private final collection<icon> advbuf = new array list<>() operation.

#### `private final boolean cached`
- Role: Tracks whether cached is cached.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private ResID r = null`
- Role: Caches the r value.
- Description: Caches the `r` value for reuse.

#### `private Loader next = null`
- Role: Caches the next value.
- Description: Caches the `next` value for reuse.

#### `private Map<Setting.ID, Setting> nset = null`
- Role: Caches the nset value.
- Description: Caches the `nset` value for reuse.

#### `private final ClassResolver<Settings> ctxr = new ClassResolver<Settings>()`
- Role: Implements the ctxr operation.
- Description: Implements the private final class resolver<settings> ctxr = new class resolver<settings>() operation.

#### `private boolean saveagain = false, saving = false`
- Role: Tracks the saveagain flag.
- Description: Caches the `saveagain` value for reuse.

#### `private boolean saveagain = false, saving = false`
- Role: Tracks the saveagain flag.
- Description: Caches the `saveagain` value for reuse.

#### `public final String name, res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final String name, res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Path wav`
- Role: Caches the wav value.
- Description: Caches the `wav` value for reuse.

#### `public final Settings conf`
- Role: Caches the conf value.
- Description: Caches the `conf` value for reuse.

#### `private final PackCont.LinPack cont`
- Role: Caches the cont value.
- Description: Caches the `cont` value for reuse.

#### `private final IconList list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `private Widget setbox`
- Role: Caches the setbox value.
- Description: Caches the `setbox` value for reuse.

#### `public final Setting conf`
- Role: Caches the conf value.
- Description: Caches the `conf` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final Object[] id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private List<ListIcon> ordered = Collections.emptyList()`
- Role: Implements the ordered operation.
- Description: Implements the empty list operation.

#### `private Map<Setting.ID, Setting> cur = null`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `public final Setting conf`
- Role: Caches the conf value.
- Description: Caches the `conf` value for reuse.

#### `public final NotifBox nb`
- Role: Caches the nb value.
- Description: Caches the `nb` value for reuse.

#### `private final List<NotificationSetting> items = new ArrayList<>()`
- Role: Implements the items operation.
- Description: Implements the private final list<notification setting> items = new array list<>() operation.

### Methods

#### `public GobIcon(Gob g, Indir<Resource> res, byte[] sdt)`
- Role: Creates a new GobIcon instance.
- Description: Constructs the GobIcon instance from the supplied inputs.

#### `public Icon(OwnerContext owner, Resource res)`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `public abstract String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public abstract BufferedImage image()`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public abstract void draw(GOut g, Coord cc)`
- Role: Draws the current content.
- Description: Draws the GobIcon content.

#### `public abstract boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `public Object[] info(ItemInfo.Owner owner)`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public Object[] id()`
- Role: Handles the id path.
- Description: Implements the id operation.

#### `public int z()`
- Role: Handles the z path.
- Description: Implements the z operation.

#### `public Markable markable()`
- Role: Handles the markable path.
- Description: Implements the markable operation.

#### `public boolean hover(Coord c, boolean hovering)`
- Role: Handles the hover path.
- Description: Implements the hover operation.

#### `public Icon create(OwnerContext owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Collection<? extends Icon> enumerate(OwnerContext owner, Resource res, Message sdt)`
- Role: Handles the enumerate path.
- Description: Implements the enumerate operation.

#### `public Image(Resource res)`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public static Image get(Resource res)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public ImageIcon(OwnerContext owner, Resource res, Image img)`
- Role: Handles the image icon path.
- Description: Implements the image icon operation.

#### `public String name()`
- Role: Handles the name path.
- Description: Implements the name operation.

#### `public BufferedImage image()`
- Role: Handles the image path.
- Description: Implements the image operation.

#### `public void draw(GOut g, Coord cc)`
- Role: Draws the current content.
- Description: Draws the GobIcon content.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `public int z()`
- Role: Handles the z path.
- Description: Implements the z operation.

#### `public Markable markable()`
- Role: Handles the markable path.
- Description: Implements the markable operation.

#### `public static Icon.Factory getfac(Resource res)`
- Role: Handles the getfac path.
- Description: Returns the fac.

#### `public Icon icon()`
- Role: Handles the icon path.
- Description: Implements the icon operation.

#### `private static Consumer<UI> resnotif(String nm)`
- Role: Handles the resnotif path.
- Description: Implements the resnotif operation.

#### `private static Consumer<UI> wavnotif(Path path)`
- Role: Handles the wavnotif path.
- Description: Implements the wavnotif operation.

#### `private static Consumer<UI> notiflimit(Consumer<UI> bk, Object id)`
- Role: Handles the notiflimit path.
- Description: Implements the notiflimit operation.

#### `public ID(String res, Object[] sub)`
- Role: Handles the id path.
- Description: Implements the id operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(ID that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public Setting(Resource.Saved res, Object[] id, Icon icon, Settings.ResID from)`
- Role: Handles the setting path.
- Description: Implements the setting operation.

#### `public Setting(Resource.Saved res, Object[] id)`
- Role: Handles the setting path.
- Description: Implements the setting operation.

#### `public Setting(Icon icon, Settings.ResID from)`
- Role: Handles the setting path.
- Description: Implements the setting operation.

#### `public Consumer<UI> notification()`
- Role: Handles the notification path.
- Description: Implements the notification operation.

#### `public Resource resource()`
- Role: Handles the resource path.
- Description: Implements the resource operation.

#### `public boolean getmarkablep()`
- Role: Handles the getmarkablep path.
- Description: Returns the markablep.

#### `public boolean getmarkp()`
- Role: Handles the getmarkp path.
- Description: Returns the markp.

#### `public Settings(UI ui, String filename)`
- Role: Handles the settings path.
- Description: Implements the settings operation.

#### `public Setting get(Icon icon)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public ResID(Resource.Saved res, byte[] data)`
- Role: Handles the resource id path.
- Description: Implements the res id operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(ResID that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public Loader(boolean cached)`
- Role: Handles the loader path.
- Description: Implements the loader operation.

#### `private void merge(Setting set, Setting conf)`
- Role: Handles the merge path.
- Description: Implements the merge operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void submit()`
- Role: Handles the submit path.
- Description: Implements the submit operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public void receive(Object[] args)`
- Role: Receives the current message.
- Description: Implements the receive operation.

#### `private static void encodeset(Map<Object, Object> buf, Setting set)`
- Role: Handles the encodeset path.
- Description: Implements the encodeset operation.

#### `public void save(Message dst)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `private static void parseset(Setting set, Map<Object, Object> data)`
- Role: Handles the parseset path.
- Description: Implements the parseset operation.

#### `public void load(Message blob)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public void save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `private void dsave0()`
- Role: Handles the dsave0 path.
- Description: Implements the dsave0 operation.

#### `public void dsave()`
- Role: Handles the dsave path.
- Description: Implements the dsave operation.

#### `public static Settings load(UI ui, String name) throws IOException`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `private NotificationSetting(String name, String res, Path wav)`
- Role: Handles the notification setting path.
- Description: Implements the notification setting operation.

#### `public NotificationSetting(String name, String res)`
- Role: Handles the notification setting path.
- Description: Implements the notification setting operation.

#### `public NotificationSetting(String name, Path wav)`
- Role: Handles the notification setting path.
- Description: Implements the notification setting operation.

#### `public NotificationSetting(Path wav)`
- Role: Handles the notification setting path.
- Description: Implements the notification setting operation.

#### `public boolean act(Setting conf)`
- Role: Handles the act path.
- Description: Implements the act operation.

#### `public ListIcon(Setting conf)`
- Role: Handles the list icon path.
- Description: Implements the list icon operation.

#### `private <T> Consumer<T> andsave(Consumer<T> main)`
- Role: Handles the andsave path.
- Description: Implements the andsave operation.

#### `private IconList(Coord sz)`
- Role: Handles the icon list path.
- Description: Implements the icon list operation.

#### `public IconLine(Coord sz, ListIcon icon)`
- Role: Handles the icon line path.
- Description: Implements the icon line operation.

#### `protected boolean searchmatch(ListIcon icon, String text)`
- Role: Handles the searchmatch path.
- Description: Implements the searchmatch operation.

#### `protected List<ListIcon> allitems()`
- Role: Handles the allitems path.
- Description: Implements the allitems operation.

#### `protected IconLine makeitem(ListIcon icon, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Processes keyboard input before the widget handles it.

#### `public void change(ListIcon icon)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public IconSettings(int w, Setting conf)`
- Role: Handles the icon settings path.
- Description: Implements the icon settings operation.

#### `public NotifBox(int w)`
- Role: Handles the notif box path.
- Description: Implements the notif box operation.

#### `protected List<NotificationSetting> items()`
- Role: Handles the items path.
- Description: Implements the items operation.

#### `protected Widget makeitem(NotificationSetting item, int idx, Coord sz)`
- Role: Handles the makeitem path.
- Description: Implements the makeitem operation.

#### `private void selectwav()`
- Role: Handles the selectwav path.
- Description: Implements the selectwav operation.

#### `public void change(NotificationSetting item)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `private void play()`
- Role: Handles the play path.
- Description: Implements the play operation.

#### `public SettingsWindow(Settings conf)`
- Role: Handles the settings window path.
- Description: Implements the settings window operation.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.