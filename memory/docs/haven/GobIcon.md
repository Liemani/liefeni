# GobIcon

This file documents the responsibilities and members of `GobIcon`.

## Meta

- Source: [GobIcon.java](../../../src/haven/GobIcon.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles gob icon metadata and display settings.

## Nested Types

### $icon

- Description: TODO

### Factory

- Description: TODO

### ID

- Description: TODO

### Icon

- Description: TODO

### IconLine

- Description: TODO

### IconList

- Description: TODO

### IconSettings

- Description: TODO

### Image

- Description: TODO

### ImageIcon

- Description: TODO

### ListIcon

- Description: TODO

### Loader

- Description: TODO

### Markable

- Description: TODO

### NotifBox

- Description: TODO

### NotificationSetting

- Description: TODO

### ResID

- Description: TODO

### Setting

- Description: TODO

### Settings

- Description: TODO

### SettingsWindow

- Description: TODO

## Members

### Constants

#### `private static final int size = UI.scale(20)`

- Description: TODO

#### `public static final PUtils.Convolution filter = new PUtils.Hanning(1)`

- Description: TODO

#### `public static final Object[] nilid = new Object[0]`

- Description: TODO

#### `private static final Map<Resource, Image> cache = new WeakHashMap<>()`

- Description: TODO

#### `public static final Factory factory = new Factory()`

- Description: TODO

#### `private static final Map<Object, Double> lastnotifs = new HashMap<>()`

- Description: TODO

#### `public static final byte[] sig = "Icons".getBytes(Utils.ascii)`

- Description: TODO

#### `public static final NotificationSetting nil = new NotificationSetting("None", null, null)`

- Description: TODO

#### `public static final NotificationSetting other = new NotificationSetting("Select file...", null, null)`

- Description: TODO

#### `public static final List<NotificationSetting> builtin`

- Description: TODO

#### `private static final Text.Foundry elf = CharWnd.attrf`

- Description: TODO

#### `private static final int elh = elf.height() + UI.scale(2)`

- Description: TODO

### Fields

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final byte[] sdt`

- Description: TODO

#### `private Icon icon`

- Description: TODO

#### `public final OwnerContext owner`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final BufferedImage img`

- Description: TODO

#### `public final Tex tex`

- Description: TODO

#### `public Coord cc`

- Description: TODO

#### `public boolean rot`

- Description: TODO

#### `public double ao`

- Description: TODO

#### `public int z`

- Description: TODO

#### `public final Image img`

- Description: TODO

#### `private final Gob gob = owner.fcontext(Gob.class, false)`

- Description: TODO

#### `public final ID id`

- Description: TODO

#### `public final Icon icon`

- Description: TODO

#### `public final Settings.ResID from`

- Description: TODO

#### `public Resource.Saved res`

- Description: TODO

#### `public boolean show, defshow, notify`

- Description: TODO

#### `public boolean show, defshow, notify`

- Description: TODO

#### `public boolean show, defshow, notify`

- Description: TODO

#### `public String resns`

- Description: TODO

#### `public Path filens`

- Description: TODO

#### `public boolean mark, markset`

- Description: TODO

#### `public boolean mark, markset`

- Description: TODO

#### `public final String res`

- Description: TODO

#### `public final Object[] sub`

- Description: TODO

#### `private Resource lres`

- Description: TODO

#### `public final UI ui`

- Description: TODO

#### `public final String filename`

- Description: TODO

#### `public Map<Setting.ID, Setting> settings = new HashMap<>()`

- Description: TODO

#### `public int tag = -1`

- Description: TODO

#### `public boolean notify = false`

- Description: TODO

#### `public final Resource.Saved res`

- Description: TODO

#### `public final byte[] data`

- Description: TODO

#### `private Loader loading = null`

- Description: TODO

#### `public final Queue<ResID> load = new ArrayDeque<>()`

- Description: TODO

#### `public final Map<ResID, Setting> defaults = new HashMap<>()`

- Description: TODO

#### `public final Map<ResID, Collection<Setting>> resolve = new HashMap<>()`

- Description: TODO

#### `public boolean save = false, adv = false`

- Description: TODO

#### `public boolean save = false, adv = false`

- Description: TODO

#### `public Integer tag = null`

- Description: TODO

#### `private final Collection<Icon> advbuf = new ArrayList<>()`

- Description: TODO

#### `private final boolean cached`

- Description: TODO

#### `private ResID r = null`

- Description: TODO

#### `private Loader next = null`

- Description: TODO

#### `private Map<Setting.ID, Setting> nset = null`

- Description: TODO

#### `private final ClassResolver<Settings> ctxr = new ClassResolver<Settings>()`

- Description: TODO

#### `private boolean saveagain = false, saving = false`

- Description: TODO

#### `private boolean saveagain = false, saving = false`

- Description: TODO

#### `public final String name, res`

- Description: TODO

#### `public final String name, res`

- Description: TODO

#### `public final Path wav`

- Description: TODO

#### `public final Settings conf`

- Description: TODO

#### `private final PackCont.LinPack cont`

- Description: TODO

#### `private final IconList list`

- Description: TODO

#### `private Widget setbox`

- Description: TODO

#### `public final Setting conf`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final Object[] id`

- Description: TODO

#### `private List<ListIcon> ordered = Collections.emptyList()`

- Description: TODO

#### `private Map<Setting.ID, Setting> cur = null`

- Description: TODO

#### `public final Setting conf`

- Description: TODO

#### `public final NotifBox nb`

- Description: TODO

#### `private final List<NotificationSetting> items = new ArrayList<>()`

- Description: TODO

### Methods

#### `public GobIcon(Gob g, Indir<Resource> res, byte[] sdt)`

- Description: TODO

#### `public Icon(OwnerContext owner, Resource res)`

- Description: TODO

#### `public abstract String name()`

- Description: TODO

#### `public abstract BufferedImage image()`

- Description: TODO

#### `public abstract void draw(GOut g, Coord cc)`

- Description: TODO

#### `public abstract boolean checkhit(Coord c)`

- Description: TODO

#### `public Object[] info(ItemInfo.Owner owner)`

- Description: TODO

#### `public Object[] id()`

- Description: TODO

#### `public int z()`

- Description: TODO

#### `public Markable markable()`

- Description: TODO

#### `public boolean hover(Coord c, boolean hovering)`

- Description: TODO

#### `public Icon create(OwnerContext owner, Resource res, Message sdt)`

- Description: TODO

#### `public Collection<? extends Icon> enumerate(OwnerContext owner, Resource res, Message sdt)`

- Description: TODO

#### `public Image(Resource res)`

- Description: TODO

#### `public static Image get(Resource res)`

- Description: TODO

#### `public ImageIcon(OwnerContext owner, Resource res, Image img)`

- Description: TODO

#### `public String name()`

- Description: TODO

#### `public BufferedImage image()`

- Description: TODO

#### `public void draw(GOut g, Coord cc)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `public int z()`

- Description: TODO

#### `public Markable markable()`

- Description: TODO

#### `public static Icon.Factory getfac(Resource res)`

- Description: TODO

#### `public Icon icon()`

- Description: TODO

#### `private static Consumer<UI> resnotif(String nm)`

- Description: TODO

#### `private static Consumer<UI> wavnotif(Path path)`

- Description: TODO

#### `private static Consumer<UI> notiflimit(Consumer<UI> bk, Object id)`

- Description: TODO

#### `public ID(String res, Object[] sub)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(ID that)`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public Setting(Resource.Saved res, Object[] id, Icon icon, Settings.ResID from)`

- Description: TODO

#### `public Setting(Resource.Saved res, Object[] id)`

- Description: TODO

#### `public Setting(Icon icon, Settings.ResID from)`

- Description: TODO

#### `public Consumer<UI> notification()`

- Description: TODO

#### `public Resource resource()`

- Description: TODO

#### `public boolean getmarkablep()`

- Description: TODO

#### `public boolean getmarkp()`

- Description: TODO

#### `public Settings(UI ui, String filename)`

- Description: TODO

#### `public Setting get(Icon icon)`

- Description: TODO

#### `public ResID(Resource.Saved res, byte[] data)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(ResID that)`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public Loader(boolean cached)`

- Description: TODO

#### `private void merge(Setting set, Setting conf)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public void submit()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public void receive(Object[] args)`

- Description: TODO

#### `private static void encodeset(Map<Object, Object> buf, Setting set)`

- Description: TODO

#### `public void save(Message dst)`

- Description: TODO

#### `private static void parseset(Setting set, Map<Object, Object> data)`

- Description: TODO

#### `public void load(Message blob)`

- Description: TODO

#### `public void save()`

- Description: TODO

#### `private void dsave0()`

- Description: TODO

#### `public void dsave()`

- Description: TODO

#### `public static Settings load(UI ui, String name) throws IOException`

- Description: TODO

#### `private NotificationSetting(String name, String res, Path wav)`

- Description: TODO

#### `public NotificationSetting(String name, String res)`

- Description: TODO

#### `public NotificationSetting(String name, Path wav)`

- Description: TODO

#### `public NotificationSetting(Path wav)`

- Description: TODO

#### `public boolean act(Setting conf)`

- Description: TODO

#### `public ListIcon(Setting conf)`

- Description: TODO

#### `private <T> Consumer<T> andsave(Consumer<T> main)`

- Description: TODO

#### `private IconList(Coord sz)`

- Description: TODO

#### `public IconLine(Coord sz, ListIcon icon)`

- Description: TODO

#### `protected boolean searchmatch(ListIcon icon, String text)`

- Description: TODO

#### `protected List<ListIcon> allitems()`

- Description: TODO

#### `protected IconLine makeitem(ListIcon icon, int idx, Coord sz)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public void change(ListIcon icon)`

- Description: TODO

#### `public IconSettings(int w, Setting conf)`

- Description: TODO

#### `public NotifBox(int w)`

- Description: TODO

#### `protected List<NotificationSetting> items()`

- Description: TODO

#### `protected Widget makeitem(NotificationSetting item, int idx, Coord sz)`

- Description: TODO

#### `private void selectwav()`

- Description: TODO

#### `public void change(NotificationSetting item)`

- Description: TODO

#### `private void play()`

- Description: TODO

#### `public SettingsWindow(Settings conf)`

- Description: TODO

#### `public void apply(Gob g, OCache.AttrDelta msg)`

- Description: TODO
