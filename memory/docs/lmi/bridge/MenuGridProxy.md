# MenuGridProxy

This file documents the responsibilities and members of `MenuGridProxy`.

## Meta

- Source: [MenuGridProxy.java](../../../../src/lmi/bridge/MenuGridProxy.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a menu-grid injection point for LMI actions.

## Nested Types

### Button

- Description: TODO

### Pagina

- Description: TODO

## Members

### Constants

#### `public static final String LMI_PREFIX = "lmi_"`

- Description: TODO

#### `public static final String JOB_PREFIX = "lmi_job_"`

- Description: TODO

#### `public static final String EFFECT_PREFIX = "lmi_effect_"`

- Description: TODO

#### `private static final String DEFAULT_ICON = "paginae/act/landscape"`

- Description: TODO

#### `private static final String FOLDER_ICON = "paginae/act/bld"`

- Description: TODO

#### `private static final List<Pagina> _customPaginae = new ArrayList<>()`

- Description: TODO

#### `private static final Map<String, Pagina> _folderMap = new HashMap<>()`

- Description: TODO

### Fields

#### `private static Resource _sharedRes`

- Description: TODO

#### `private static Resource _folderRes`

- Description: TODO

#### `public String name`

- Description: TODO

#### `public String description`

- Description: TODO

#### `public String sortKey`

- Description: TODO

#### `public Class<?> sourceCls`

- Description: TODO

#### `private final MenuGrid.Pagina customParent`

- Description: TODO

#### `private Button customBtn`

- Description: TODO

#### `private Resource iconRes`

- Description: TODO

#### `private Tex customTex`

- Description: TODO

#### `private GSprite myspr`

- Description: TODO

### Methods

#### `public static boolean isLmi(MenuGrid.Pagina pag)`

- Description: TODO

#### `public static boolean isJob(MenuGrid.Pagina pag)`

- Description: TODO

#### `public static boolean isEffect(MenuGrid.Pagina pag)`

- Description: TODO

#### `public static void init()`

- Description: TODO

#### `private static void _buildFromRegistry(Pagina root)`

- Description: TODO

#### `private static Pagina _ensureFolderPath(String packageName, Pagina root)`

- Description: TODO

#### `private static Pagina _getOrCreateFolder(String packageName, Pagina parent)`

- Description: TODO

#### `private static String _callStatic(Class<?> cls, String methodName, String def)`

- Description: TODO

#### `public static void apply()`

- Description: TODO

#### `public static void updateLayout(MenuGrid mg)`

- Description: TODO

#### `public static void dumpAllIcons()`

- Description: TODO

#### `public Pagina(String id, MenuGrid.Pagina parent, Resource defRes)`

- Description: TODO

#### `public void setup(Class<?> cls, String defName)`

- Description: TODO

#### `private void _loadCustomIcon(String path)`

- Description: TODO

#### `@Override public MenuGrid.Pagina parent()`

- Description: TODO

#### `@Override public MenuGrid.PagButton button()`

- Description: TODO

#### `public Button(Pagina pag)`

- Description: TODO

#### `@Override public String name()`

- Description: TODO

#### `@Override public MenuGrid.Pagina parent()`

- Description: TODO

#### `@Override public KeyMatch hotkey()`

- Description: TODO

#### `@Override public KeyBinding binding()`

- Description: TODO

#### `@Override public String sortkey()`

- Description: TODO

#### `@Override public List<ItemInfo> info()`

- Description: TODO

#### `@Override public GSprite spr()`

- Description: TODO

#### `@Override public void drawmain(GOut g, GSprite spr)`

- Description: TODO
