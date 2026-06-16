# MenuGridProxy

This file documents the responsibilities and members of `MenuGridProxy`.

## Meta

- Source: [MenuGridProxy.java](../../../../src/lmi/bridge/MenuGridProxy.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Proxies Haven menu-grid actions into LMI hookable callbacks.

## Nested Types

### Button
### Button
- Role: Represents the button helper used by MenuGridProxy.

- Role: Wraps a custom menu-grid button entry.
- Description: Describes the nested button type used by the enclosing class.

### Pagina
### Pagina
- Role: Represents the pagina helper used by MenuGridProxy.

- Role: Wraps a custom menu-grid pagina entry.
- Description: Describes the nested pagina type used by the enclosing class.

## Members

### Constants

#### `public static final String LMI_PREFIX = "lmi_"`
- Role: Defines the shared lmi prefix constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String JOB_PREFIX = "lmi_job_"`
- Role: Defines the shared job prefix constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String EFFECT_PREFIX = "lmi_effect_"`
- Role: Defines the shared effect prefix constant.
- Description: Shared constant used by the rest of the class.

#### `private static final String DEFAULT_ICON = "paginae/act/landscape"`
- Role: Defines the shared default icon constant.
- Description: Shared constant used by the rest of the class.

#### `private static final String FOLDER_ICON = "paginae/act/bld"`
- Role: Defines the shared folder icon constant.
- Description: Shared constant used by the rest of the class.

#### `private static final List<Pagina> _customPaginae = new ArrayList<>()`
- Role: Defines the shared custom paginae constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<String, Pagina> _folderMap = new HashMap<>()`
- Role: Defines the shared folder map constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static Resource _sharedRes`
- Role: Stores the shared res value.
- Description: Backs the cached state for this file.

#### `private static Resource _folderRes`
- Role: Stores the folder res value.
- Description: Backs the cached state for this file.

#### `public String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public String description`
- Role: Stores the description value.
- Description: Backs the cached state for this file.

#### `public String sortKey`
- Role: Stores the sort key value.
- Description: Backs the cached state for this file.

#### `public Class<?> sourceCls`
- Role: Holds the source cls state.
- Description: Backs the cached state for this file.

#### `private final MenuGrid.Pagina customParent`
- Role: Stores the custom parent value.
- Description: Backs the cached state for this file.

#### `private Button customBtn`
- Role: Holds the custom btn state.
- Description: Backs the cached state for this file.

#### `private Resource iconRes`
- Role: Stores the icon res value.
- Description: Backs the cached state for this file.

#### `private Tex customTex`
- Role: Stores the custom tex value.
- Description: Backs the cached state for this file.

#### `private GSprite myspr`
- Role: Holds the myspr state.
- Description: Backs the cached state for this file.

### Methods

#### `public static boolean isLmi(MenuGrid.Pagina pag)`
- Role: Checks whether the lmi.
- Description: Returns a boolean result for the described condition.

#### `public static boolean isJob(MenuGrid.Pagina pag)`
- Role: Checks whether the job.
- Description: Returns a boolean result for the described condition.

#### `public static boolean isEffect(MenuGrid.Pagina pag)`
- Role: Checks whether the effect.
- Description: Returns a boolean result for the described condition.

#### `public static void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `private static void _buildFromRegistry(Pagina root)`
- Role: Performs  build from registry.
- Description: Supports the build from registry operation used by the surrounding class.

#### `private static Pagina _ensureFolderPath(String packageName, Pagina root)`
- Role: Performs  ensure folder path.
- Description: Supports the ensure folder path operation used by the surrounding class.

#### `private static Pagina _getOrCreateFolder(String packageName, Pagina parent)`
- Role: Performs  get or create folder.
- Description: Supports the get or create folder operation used by the surrounding class.

#### `private static String _callStatic(Class<?> cls, String methodName, String def)`
- Role: Performs  call static.
- Description: Supports the call static operation used by the surrounding class.

#### `public static void apply()`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public static void updateLayout(MenuGrid mg)`
- Role: Updates the layout.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void dumpAllIcons()`
- Role: Dumps all menu-grid icons.
- Description: Supports the dump all icons operation used by the surrounding class.

#### `public Pagina(String id, MenuGrid.Pagina parent, Resource defRes)`
- Role: Performs pagina.
- Description: Supports the pagina operation used by the surrounding class.

#### `public void setup(Class<?> cls, String defName)`
- Role: Performs setup.
- Description: Supports the setup operation used by the surrounding class.

#### `private void _loadCustomIcon(String path)`
- Role: Performs  load custom icon.
- Description: Supports the load custom icon operation used by the surrounding class.

#### `@Override public MenuGrid.Pagina parent()`
- Role: Performs parent.
- Description: Supports the parent operation used by the surrounding class.

#### `@Override public MenuGrid.PagButton button()`
- Role: Performs button.
- Description: Supports the button operation used by the surrounding class.

#### `public Button(Pagina pag)`
- Role: Performs button.
- Description: Supports the button operation used by the surrounding class.

#### `@Override public String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `@Override public MenuGrid.Pagina parent()`
- Role: Performs parent.
- Description: Supports the parent operation used by the surrounding class.

#### `@Override public KeyMatch hotkey()`
- Role: Performs hotkey.
- Description: Supports the hotkey operation used by the surrounding class.

#### `@Override public KeyBinding binding()`
- Role: Performs binding.
- Description: Supports the binding operation used by the surrounding class.

#### `@Override public String sortkey()`
- Role: Performs sortkey.
- Description: Supports the sortkey operation used by the surrounding class.

#### `@Override public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `@Override public GSprite spr()`
- Role: Performs spr.
- Description: Supports the spr operation used by the surrounding class.

#### `@Override public void drawmain(GOut g, GSprite spr)`
- Role: Renders the drawmain.
- Description: Supports the drawmain operation used by the surrounding class.
