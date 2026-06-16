# GobIcon

This file documents the responsibilities and members of `GobIcon`.

## Meta

- Source: [GobIcon.java](../../../src/haven/GobIcon.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the gob icon Haven component.

## Nested Types

### $icon

- Role: Represents $icon within GobIcon.
- Description: Describes the nested $icon type used by the enclosing class.

### Factory

- Role: Represents factory within GobIcon.
- Description: Describes the nested factory type used by the enclosing class.

### ID

- Role: Represents id within GobIcon.
- Description: Describes the nested id type used by the enclosing class.

### Icon

- Role: Represents icon within GobIcon.
- Description: Describes the nested icon type used by the enclosing class.

### IconLine

- Role: Represents icon line within GobIcon.
- Description: Describes the nested icon line type used by the enclosing class.

### IconList

- Role: Represents icon list within GobIcon.
- Description: Describes the nested icon list type used by the enclosing class.

### IconSettings

- Role: Represents icon settings within GobIcon.
- Description: Describes the nested icon settings type used by the enclosing class.

### Image

- Role: Represents image within GobIcon.
- Description: Describes the nested image type used by the enclosing class.

### ImageIcon

- Role: Represents image icon within GobIcon.
- Description: Describes the nested image icon type used by the enclosing class.

### ListIcon

- Role: Represents list icon within GobIcon.
- Description: Describes the nested list icon type used by the enclosing class.

### Loader

- Role: Represents loader within GobIcon.
- Description: Describes the nested loader type used by the enclosing class.

### Markable

- Role: Represents markable within GobIcon.
- Description: Describes the nested markable type used by the enclosing class.

### NotifBox

- Role: Represents notif box within GobIcon.
- Description: Describes the nested notif box type used by the enclosing class.

### NotificationSetting

- Role: Represents notification setting within GobIcon.
- Description: Describes the nested notification setting type used by the enclosing class.

### ResID

- Role: Represents res id within GobIcon.
- Description: Describes the nested res id type used by the enclosing class.

### Setting

- Role: Represents setting within GobIcon.
- Description: Describes the nested setting type used by the enclosing class.

### Settings

- Role: Represents settings within GobIcon.
- Description: Describes the nested settings type used by the enclosing class.

### SettingsWindow

- Role: Represents settings window within GobIcon.
- Description: Describes the nested settings window type used by the enclosing class.

## Members

### Constants

#### `private static final int size = UI.scale(20)`
- Role: Defines the shared size constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PUtils.Convolution filter = new PUtils.Hanning(1)`
- Role: Defines the shared filter constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Object[] nilid = new Object[0]`
- Role: Defines the shared nilid constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Resource, Image> cache = new WeakHashMap<>()`
- Role: Defines the shared cache constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Factory factory = new Factory()`
- Role: Defines the shared factory constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Object, Double> lastnotifs = new HashMap<>()`
- Role: Defines the shared lastnotifs constant.
- Description: Shared constant used by the rest of the class.

#### `public static final byte[] sig = "Icons".getBytes(Utils.ascii)`
- Role: Defines the shared sig constant.
- Description: Shared constant used by the rest of the class.

#### `public static final NotificationSetting nil = new NotificationSetting("None", null, null)`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

#### `public static final NotificationSetting other = new NotificationSetting("Select file...", null, null)`
- Role: Defines the shared other constant.
- Description: Shared constant used by the rest of the class.

#### `public static final List<NotificationSetting> builtin`
- Role: Defines the shared builtin constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Text.Foundry elf = CharWnd.attrf`
- Role: Defines the shared elf constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int elh = elf.height() + UI.scale(2)`
- Role: Defines the shared elh constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final byte[] sdt`
- Role: Stores the sdt value.
- Description: Backs the cached state for this file.

#### `private Icon icon`
- Role: Holds the icon state.
- Description: Backs the cached state for this file.

#### `public final OwnerContext owner`
- Role: Stores the owner value.
- Description: Backs the cached state for this file.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public final Tex tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `public Coord cc`
- Role: Stores the cc value.
- Description: Backs the cached state for this file.

#### `public boolean rot`
- Role: Tracks the rot flag.
- Description: Supports the rot operation used by the surrounding class.

#### `public double ao`
- Role: Stores the ao value.
- Description: Backs the cached state for this file.

#### `public int z`
- Role: Stores the z value.
- Description: Backs the cached state for this file.

#### `public final Image img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `private final Gob gob = owner.fcontext(Gob.class, false)`
- Role: Stores the gob value.
- Description: Backs the cached state for this file.

#### `public final ID id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `public final Icon icon`
- Role: Holds the icon state.
- Description: Backs the cached state for this file.

#### `public final Settings.ResID from`
- Role: Holds the from state.
- Description: Backs the cached state for this file.

#### `public Resource.Saved res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public boolean show, defshow, notify`
- Role: Tracks the notify flag.
- Description: Supports the notify operation used by the surrounding class.

#### `public boolean show, defshow, notify`
- Role: Tracks the notify flag.
- Description: Supports the notify operation used by the surrounding class.

#### `public boolean show, defshow, notify`
- Role: Tracks the notify flag.
- Description: Supports the notify operation used by the surrounding class.

#### `public String resns`
- Role: Stores the resns value.
- Description: Backs the cached state for this file.

#### `public Path filens`
- Role: Stores the filens value.
- Description: Backs the cached state for this file.

#### `public boolean mark, markset`
- Role: Tracks the markset flag.
- Description: Supports the markset operation used by the surrounding class.

#### `public boolean mark, markset`
- Role: Tracks the markset flag.
- Description: Supports the markset operation used by the surrounding class.

#### `public final String res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Object[] sub`
- Role: Holds the sub state.
- Description: Backs the cached state for this file.

#### `private Resource lres`
- Role: Stores the lres value.
- Description: Backs the cached state for this file.

#### `public final UI ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

#### `public final String filename`
- Role: Stores the filename value.
- Description: Backs the cached state for this file.

#### `public Map<Setting.ID, Setting> settings = new HashMap<>()`
- Role: Caches settings entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int tag = -1`
- Role: Stores the tag value.
- Description: Backs the cached state for this file.

#### `public boolean notify = false`
- Role: Tracks the notify flag.
- Description: Supports the notify operation used by the surrounding class.

#### `public final Resource.Saved res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final byte[] data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private Loader loading = null`
- Role: Holds the loading state.
- Description: Backs the cached state for this file.

#### `public final Queue<ResID> load = new ArrayDeque<>()`
- Role: Caches load entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Map<ResID, Setting> defaults = new HashMap<>()`
- Role: Caches defaults entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Map<ResID, Collection<Setting>> resolve = new HashMap<>()`
- Role: Caches resolve entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public boolean save = false, adv = false`
- Role: Tracks the save flag.
- Description: Supports the save operation used by the surrounding class.

#### `public boolean save = false, adv = false`
- Role: Tracks the save flag.
- Description: Supports the save operation used by the surrounding class.

#### `public Integer tag = null`
- Role: Stores the tag value.
- Description: Backs the cached state for this file.

#### `private final Collection<Icon> advbuf = new ArrayList<>()`
- Role: Caches advbuf entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final boolean cached`
- Role: Tracks whether cached is cached.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private ResID r = null`
- Role: Holds the r state.
- Description: Backs the cached state for this file.

#### `private Loader next = null`
- Role: Holds the next state.
- Description: Backs the cached state for this file.

#### `private Map<Setting.ID, Setting> nset = null`
- Role: Caches nset entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final ClassResolver<Settings> ctxr = new ClassResolver<Settings>()`
- Role: Holds the ctxr state.
- Description: Backs the cached state for this file.

#### `private boolean saveagain = false, saving = false`
- Role: Tracks the saveagain flag.
- Description: Supports the saveagain operation used by the surrounding class.

#### `private boolean saveagain = false, saving = false`
- Role: Tracks the saveagain flag.
- Description: Supports the saveagain operation used by the surrounding class.

#### `public final String name, res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final String name, res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Path wav`
- Role: Stores the wav value.
- Description: Backs the cached state for this file.

#### `public final Settings conf`
- Role: Holds the conf state.
- Description: Backs the cached state for this file.

#### `private final PackCont.LinPack cont`
- Role: Holds the cont state.
- Description: Backs the cached state for this file.

#### `private final IconList list`
- Role: Caches list entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Widget setbox`
- Role: Stores the setbox value.
- Description: Backs the cached state for this file.

#### `public final Setting conf`
- Role: Holds the conf state.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final Object[] id`
- Role: Holds the id state.
- Description: Backs the cached state for this file.

#### `private List<ListIcon> ordered = Collections.emptyList()`
- Role: Caches ordered entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Map<Setting.ID, Setting> cur = null`
- Role: Caches cur entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Setting conf`
- Role: Holds the conf state.
- Description: Backs the cached state for this file.

#### `public final NotifBox nb`
- Role: Holds the nb state.
- Description: Backs the cached state for this file.

#### `private final List<NotificationSetting> items = new ArrayList<>()`
- Role: Caches items entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public GobIcon(Gob g, Indir<Resource> res, byte[] sdt)`
- Role: Creates a new GobIcon instance.
- Description: Constructs the instance and initializes its default state.

#### `public Icon(OwnerContext owner, Resource res)`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `public abstract String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public abstract BufferedImage image()`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public abstract void draw(GOut g, Coord cc)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public abstract boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public Object[] info(ItemInfo.Owner owner)`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public Object[] id()`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public int z()`
- Role: Performs z.
- Description: Supports the z operation used by the surrounding class.

#### `public Markable markable()`
- Role: Performs markable.
- Description: Supports the markable operation used by the surrounding class.

#### `public boolean hover(Coord c, boolean hovering)`
- Role: Performs hover.
- Description: Supports the hover operation used by the surrounding class.

#### `public Icon create(OwnerContext owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Collection<? extends Icon> enumerate(OwnerContext owner, Resource res, Message sdt)`
- Role: Performs enumerate.
- Description: Supports the enumerate operation used by the surrounding class.

#### `public Image(Resource res)`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public static Image get(Resource res)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public ImageIcon(OwnerContext owner, Resource res, Image img)`
- Role: Performs image icon.
- Description: Supports the image icon operation used by the surrounding class.

#### `public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public BufferedImage image()`
- Role: Performs image.
- Description: Supports the image operation used by the surrounding class.

#### `public void draw(GOut g, Coord cc)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `public int z()`
- Role: Performs z.
- Description: Supports the z operation used by the surrounding class.

#### `public Markable markable()`
- Role: Performs markable.
- Description: Supports the markable operation used by the surrounding class.

#### `public static Icon.Factory getfac(Resource res)`
- Role: Performs getfac.
- Description: Supports the getfac operation used by the surrounding class.

#### `public Icon icon()`
- Role: Performs icon.
- Description: Supports the icon operation used by the surrounding class.

#### `private static Consumer<UI> resnotif(String nm)`
- Role: Performs resnotif.
- Description: Supports the resnotif operation used by the surrounding class.

#### `private static Consumer<UI> wavnotif(Path path)`
- Role: Performs wavnotif.
- Description: Supports the wavnotif operation used by the surrounding class.

#### `private static Consumer<UI> notiflimit(Consumer<UI> bk, Object id)`
- Role: Performs notiflimit.
- Description: Supports the notiflimit operation used by the surrounding class.

#### `public ID(String res, Object[] sub)`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(ID that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public Setting(Resource.Saved res, Object[] id, Icon icon, Settings.ResID from)`
- Role: Performs setting.
- Description: Supports the setting operation used by the surrounding class.

#### `public Setting(Resource.Saved res, Object[] id)`
- Role: Performs setting.
- Description: Supports the setting operation used by the surrounding class.

#### `public Setting(Icon icon, Settings.ResID from)`
- Role: Performs setting.
- Description: Supports the setting operation used by the surrounding class.

#### `public Consumer<UI> notification()`
- Role: Performs notification.
- Description: Supports the notification operation used by the surrounding class.

#### `public Resource resource()`
- Role: Performs resource.
- Description: Supports the resource operation used by the surrounding class.

#### `public boolean getmarkablep()`
- Role: Performs getmarkablep.
- Description: Supports the getmarkablep operation used by the surrounding class.

#### `public boolean getmarkp()`
- Role: Performs getmarkp.
- Description: Supports the getmarkp operation used by the surrounding class.

#### `public Settings(UI ui, String filename)`
- Role: Performs settings.
- Description: Supports the settings operation used by the surrounding class.

#### `public Setting get(Icon icon)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public ResID(Resource.Saved res, byte[] data)`
- Role: Performs res id.
- Description: Supports the res id operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(ResID that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public Loader(boolean cached)`
- Role: Performs loader.
- Description: Supports the loader operation used by the surrounding class.

#### `private void merge(Setting set, Setting conf)`
- Role: Performs merge.
- Description: Supports the merge operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void submit()`
- Role: Performs submit.
- Description: Supports the submit operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public void receive(Object[] args)`
- Role: Receives the current message.
- Description: Supports the receive operation used by the surrounding class.

#### `private static void encodeset(Map<Object, Object> buf, Setting set)`
- Role: Performs encodeset.
- Description: Supports the encodeset operation used by the surrounding class.

#### `public void save(Message dst)`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `private static void parseset(Setting set, Map<Object, Object> data)`
- Role: Performs parseset.
- Description: Supports the parseset operation used by the surrounding class.

#### `public void load(Message blob)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public void save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `private void dsave0()`
- Role: Performs dsave0.
- Description: Supports the dsave0 operation used by the surrounding class.

#### `public void dsave()`
- Role: Performs dsave.
- Description: Supports the dsave operation used by the surrounding class.

#### `public static Settings load(UI ui, String name) throws IOException`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `private NotificationSetting(String name, String res, Path wav)`
- Role: Performs notification setting.
- Description: Supports the notification setting operation used by the surrounding class.

#### `public NotificationSetting(String name, String res)`
- Role: Performs notification setting.
- Description: Supports the notification setting operation used by the surrounding class.

#### `public NotificationSetting(String name, Path wav)`
- Role: Performs notification setting.
- Description: Supports the notification setting operation used by the surrounding class.

#### `public NotificationSetting(Path wav)`
- Role: Performs notification setting.
- Description: Supports the notification setting operation used by the surrounding class.

#### `public boolean act(Setting conf)`
- Role: Performs act.
- Description: Supports the act operation used by the surrounding class.

#### `public ListIcon(Setting conf)`
- Role: Performs list icon.
- Description: Supports the list icon operation used by the surrounding class.

#### `private <T> Consumer<T> andsave(Consumer<T> main)`
- Role: Performs andsave.
- Description: Supports the andsave operation used by the surrounding class.

#### `private IconList(Coord sz)`
- Role: Performs icon list.
- Description: Supports the icon list operation used by the surrounding class.

#### `public IconLine(Coord sz, ListIcon icon)`
- Role: Performs icon line.
- Description: Supports the icon line operation used by the surrounding class.

#### `protected boolean searchmatch(ListIcon icon, String text)`
- Role: Performs searchmatch.
- Description: Supports the searchmatch operation used by the surrounding class.

#### `protected List<ListIcon> allitems()`
- Role: Performs allitems.
- Description: Supports the allitems operation used by the surrounding class.

#### `protected IconLine makeitem(ListIcon icon, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public void change(ListIcon icon)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public IconSettings(int w, Setting conf)`
- Role: Performs icon settings.
- Description: Supports the icon settings operation used by the surrounding class.

#### `public NotifBox(int w)`
- Role: Performs notif box.
- Description: Supports the notif box operation used by the surrounding class.

#### `protected List<NotificationSetting> items()`
- Role: Performs items.
- Description: Supports the items operation used by the surrounding class.

#### `protected Widget makeitem(NotificationSetting item, int idx, Coord sz)`
- Role: Performs makeitem.
- Description: Supports the makeitem operation used by the surrounding class.

#### `private void selectwav()`
- Role: Performs selectwav.
- Description: Supports the selectwav operation used by the surrounding class.

#### `public void change(NotificationSetting item)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `private void play()`
- Role: Performs play.
- Description: Supports the play operation used by the surrounding class.

#### `public SettingsWindow(Settings conf)`
- Role: Performs settings window.
- Description: Supports the settings window operation used by the surrounding class.

#### `public void apply(Gob g, OCache.AttrDelta msg)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
