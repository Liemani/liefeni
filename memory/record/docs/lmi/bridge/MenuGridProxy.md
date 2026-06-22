---
source: [MenuGridProxy.java](../../../../../src/lmi/bridge/MenuGridProxy.java)
created: 2026-06-13
updated: 2026-06-14
---

# MenuGridProxy

Proxies Haven menu-grid actions into LMI hookable callbacks.

## Nested Types

### Button
- Role: Wraps one custom menu-grid button entry.
- Description: Overrides name, sort, icon, and drawing behavior for LMI-backed pages.

### Pagina
- Role: Wraps one custom menu-grid pagina entry.
- Description: Stores the id, parent, metadata, and icon resource for an LMI page.

## Members

### Constants

#### `public static final String LMI_PREFIX = "lmi_"`
- Role: Caches the lmi prefix value.
- Description: Caches the `LMI_PREFIX` value for reuse.

#### `public static final String JOB_PREFIX = "lmi_job_"`
- Role: Caches the job prefix value.
- Description: Caches the `JOB_PREFIX` value for reuse.

#### `public static final String EFFECT_PREFIX = "lmi_effect_"`
- Role: Caches the effect prefix value.
- Description: Caches the `EFFECT_PREFIX` value for reuse.

#### `private static final String DEFAULT_ICON = "paginae/act/landscape"`
- Role: Caches the default icon value.
- Description: Caches the `DEFAULT_ICON` value for reuse.

#### `private static final String FOLDER_ICON = "paginae/act/bld"`
- Role: Caches the folder icon value.
- Description: Caches the `FOLDER_ICON` value for reuse.

#### `private static final List<Pagina> _customPaginae = new ArrayList<>()`
- Role: Implements the custom paginae operation.
- Description: Implements the private static final list<pagina>  custom paginae = new array list<>() operation.

#### `private static final Map<String, Pagina> _folderMap = new HashMap<>()`
- Role: Implements the folder map operation.
- Description: Implements the private static final map<string, pagina>  folder map = new hash map<>() operation.

### Fields

#### `private static Resource _sharedRes`
- Role: Caches the shared res value.
- Description: Caches the `_sharedRes` value for reuse.

#### `private static Resource _folderRes`
- Role: Caches the folder res value.
- Description: Caches the `_folderRes` value for reuse.

#### `public String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public String description`
- Role: Caches the description value.
- Description: Caches the `description` value for reuse.

#### `public String sortKey`
- Role: Caches the sort key value.
- Description: Caches the `sortKey` value for reuse.

#### `public Class<?> sourceCls`
- Role: Caches the source cls value.
- Description: Caches the `sourceCls` value for reuse.

#### `private final MenuGrid.Pagina customParent`
- Role: Caches the custom parent value.
- Description: Caches the `customParent` value for reuse.

#### `private Button customBtn`
- Role: Caches the custom btn value.
- Description: Caches the `customBtn` value for reuse.

#### `private Resource iconRes`
- Role: Caches the icon res value.
- Description: Caches the `iconRes` value for reuse.

#### `private Tex customTex`
- Role: Caches the custom tex value.
- Description: Caches the `customTex` value for reuse.

#### `private GSprite myspr`
- Role: Caches the myspr value.
- Description: Caches the `myspr` value for reuse.

### Methods

#### `public static boolean isLmi(MenuGrid.Pagina pag)`
- Role: Checks whether the lmi.
- Description: Returns true when the pagina belongs to the LMI namespace.

#### `public static boolean isJob(MenuGrid.Pagina pag)`
- Role: Checks whether the job.
- Description: Returns true when the pagina represents a job entry.

#### `public static boolean isEffect(MenuGrid.Pagina pag)`
- Role: Checks whether the effect.
- Description: Returns true when the pagina represents an instant effect entry.

#### `public static void init()`
- Role: Handles the init path.
- Description: Installs the proxy menus and shared pagina registry entries.

#### `private static void _buildFromRegistry(Pagina root)`
- Role: Handles the build from registry path.
- Description: Rebuilds custom menu pages from the registered agent classes.

#### `private static Pagina _ensureFolderPath(String packageName, Pagina root)`
- Role: Handles the ensure folder path path.
- Description: Creates any missing folder paginas for the given package path.

#### `private static Pagina _getOrCreateFolder(String packageName, Pagina parent)`
- Role: Handles the get or create folder path.
- Description: Returns an existing folder pagina or creates a new one.

#### `private static String _callStatic(Class<?> cls, String methodName, String def)`
- Role: Handles the call static path.
- Description: Calls a static helper on the registered agent class when present.

#### `public static void apply()`
- Role: Applies the menu-grid proxy changes.
- Description: Replaces the Haven menu grid with the LMI-backed proxy entries.

#### `public static void updateLayout(MenuGrid mg)`
- Role: Updates the layout.
- Description: Updates the layout.

#### `public static void dumpAllIcons()`
- Role: Dumps all menu-grid icons.
- Description: Exports icon resources for the registered custom pages.

#### `public Pagina(String id, MenuGrid.Pagina parent, Resource defRes)`
- Role: Handles the pagina path.
- Description: Builds one proxy pagina entry with its parent and default resource.

#### `public void setup(Class<?> cls, String defName)`
- Role: Handles the setup path.
- Description: Resolves display metadata from the backing agent class.

#### `private void _loadCustomIcon(String path)`
- Role: Handles the load custom icon path.
- Description: Loads a custom icon resource from the local assets path.

#### `@Override public MenuGrid.Pagina parent()`
- Role: Handles the parent path.
- Description: Returns the parent pagina for this proxy entry.

#### `@Override public MenuGrid.PagButton button()`
- Role: Handles the button path.
- Description: Returns the menu button bound to this proxy pagina.

#### `public Button(Pagina pag)`
- Role: Handles the button path.
- Description: Builds a custom button for the wrapped pagina.

#### `@Override public String name()`
- Role: Handles the name path.
- Description: Returns the display name used in the menu grid.

#### `@Override public MenuGrid.Pagina parent()`
- Role: Handles the parent path.
- Description: Implements the parent operation.

#### `@Override public KeyMatch hotkey()`
- Role: Handles the hotkey path.
- Description: Returns the hotkey associated with the proxy pagina.

#### `@Override public KeyBinding binding()`
- Role: Handles the binding path.
- Description: Returns the key binding associated with the proxy pagina.

#### `@Override public String sortkey()`
- Role: Handles the sortkey path.
- Description: Returns the sort key used for menu ordering.

#### `@Override public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Returns the item-info list exposed by the proxy pagina.

#### `@Override public GSprite spr()`
- Role: Handles the spr path.
- Description: Returns the sprite used when drawing the custom pagina.

#### `@Override public void drawmain(GOut g, GSprite spr)`
- Role: Renders the drawmain.
- Description: Renders the main icon area for the proxy pagina.