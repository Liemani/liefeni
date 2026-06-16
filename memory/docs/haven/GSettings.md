# GSettings

This file documents the responsibilities and members of `GSettings`.

## Meta

- Source: [GSettings.java](../../../src/haven/GSettings.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the gsettings Haven component.

## Nested Types

### BoolSetting

- Role: Represents bool setting within GSettings.
- Description: Describes the nested bool setting type used by the enclosing class.

### EnumSetting

- Role: Represents enum setting within GSettings.
- Description: Describes the nested enum setting type used by the enclosing class.

### FloatSetting

- Role: Represents float setting within GSettings.
- Description: Describes the nested float setting type used by the enclosing class.

### HertzSetting

- Role: Represents hertz setting within GSettings.
- Description: Describes the nested hertz setting type used by the enclosing class.

### IntSetting

- Role: Represents int setting within GSettings.
- Description: Describes the nested int setting type used by the enclosing class.

### LightMode

- Role: Represents light mode within GSettings.
- Description: Describes the nested light mode type used by the enclosing class.

### Setting

- Role: Represents setting within GSettings.
- Description: Describes the nested setting type used by the enclosing class.

### SettingException

- Role: Represents setting exception within GSettings.
- Description: Describes the nested setting exception type used by the enclosing class.

### SyncMode

- Role: Represents sync mode within GSettings.
- Description: Describes the nested sync mode type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<GSettings> slot = new Slot<>(Slot.Type.SYS, GSettings.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final List<Field> settings`
- Role: Defines the shared settings constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public T val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `public boolean set`
- Role: Tracks the set flag.
- Description: Supports the set operation used by the surrounding class.

#### `private final Class<E> real`
- Role: Holds the real state.
- Description: Backs the cached state for this file.

#### `public BoolSetting lshadow = new BoolSetting("sdw")`
- Role: Tracks the lshadow flag.
- Description: Supports the bool setting operation used by the surrounding class.

#### `public IntSetting shadowres = new IntSetting("sres")`
- Role: Stores the shadowres value.
- Description: Backs the cached state for this file.

#### `public BoolSetting vsync = new BoolSetting("vsync")`
- Role: Tracks the vsync flag.
- Description: Supports the bool setting operation used by the surrounding class.

#### `public FloatSetting hz = new HertzSetting("hz")`
- Role: Stores the hz value.
- Description: Backs the cached state for this file.

#### `public FloatSetting bghz = new HertzSetting("bghz")`
- Role: Stores the bghz value.
- Description: Backs the cached state for this file.

#### `public FloatSetting rscale = new FloatSetting("rscale")`
- Role: Stores the rscale value.
- Description: Backs the cached state for this file.

#### `public EnumSetting<SyncMode> syncmode = new EnumSetting<SyncMode>("syncmode", SyncMode.class)`
- Role: Holds the syncmode state.
- Description: Backs the cached state for this file.

#### `public EnumSetting<LightMode> lightmode = new EnumSetting<LightMode>("lighting", LightMode.class)`
- Role: Holds the lightmode state.
- Description: Backs the cached state for this file.

#### `public IntSetting maxlights = new IntSetting("maxlights")`
- Role: Stores the maxlights value.
- Description: Backs the cached state for this file.

### Methods

#### `private GSettings()`
- Role: Creates a new GSettings instance.
- Description: Constructs the instance and initializes its default state.

#### `public GSettings(GSettings from)`
- Role: Creates a new GSettings instance.
- Description: Constructs the instance and initializes its default state.

#### `public SettingException(String msg)`
- Role: Performs setting exception.
- Description: Supports the setting exception operation used by the surrounding class.

#### `public Setting(String nm)`
- Role: Performs setting.
- Description: Supports the setting operation used by the surrounding class.

#### `public abstract T parse(String val)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public void validate(Environment env, T val)`
- Role: Performs validate.
- Description: Supports the validate operation used by the surrounding class.

#### `public abstract T defval()`
- Role: Performs defval.
- Description: Supports the defval operation used by the surrounding class.

#### `public String reduce(T val)`
- Role: Performs reduce.
- Description: Supports the reduce operation used by the surrounding class.

#### `public T restore(String prs)`
- Role: Performs restore.
- Description: Supports the restore operation used by the surrounding class.

#### `public Setting<T> clone()`
- Role: Performs clone.
- Description: Supports the clone operation used by the surrounding class.

#### `public BoolSetting(String nm)`
- Role: Performs bool setting.
- Description: Supports the bool setting operation used by the surrounding class.

#### `public Boolean parse(String val)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public EnumSetting(String nm, Class<E> real)`
- Role: Performs enum setting.
- Description: Supports the enum setting operation used by the surrounding class.

#### `public E parse(String val)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public E restore(String prs)`
- Role: Performs restore.
- Description: Supports the restore operation used by the surrounding class.

#### `public IntSetting(String nm)`
- Role: Performs int setting.
- Description: Supports the int setting operation used by the surrounding class.

#### `public Integer parse(String val)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public FloatSetting(String nm)`
- Role: Performs float setting.
- Description: Supports the float setting operation used by the surrounding class.

#### `public Float parse(String val)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public HertzSetting(String nm)`
- Role: Performs hertz setting.
- Description: Supports the hertz setting operation used by the surrounding class.

#### `public Float parse(String val)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public void validate(Environment env, Float val)`
- Role: Performs validate.
- Description: Supports the validate operation used by the surrounding class.

#### `public Setting<?> find(String name)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `private static <T> Setting<T> update(Setting<T> set, T val)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `private <T> GSettings supdate(Setting<T> set, T val)`
- Role: Performs supdate.
- Description: Supports the supdate operation used by the surrounding class.

#### `private static <T> void validate0(Environment env, Setting<T> set)`
- Role: Performs validate0.
- Description: Supports the validate0 operation used by the surrounding class.

#### `public GSettings validate(Environment env)`
- Role: Performs validate.
- Description: Supports the validate operation used by the surrounding class.

#### `public <T> GSettings update(Environment env, Setting<T> set, T val)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `private static <T> void setdef(Setting<T> set)`
- Role: Performs setdef.
- Description: Supports the setdef operation used by the surrounding class.

#### `public static GSettings defaults()`
- Role: Performs defaults.
- Description: Supports the defaults operation used by the surrounding class.

#### `private static <T> String reduce0(Setting<T> s)`
- Role: Performs reduce0.
- Description: Supports the reduce0 operation used by the surrounding class.

#### `public void save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `private static <T> Setting<T> restore0(Setting<T> s, String prs)`
- Role: Performs restore0.
- Description: Supports the restore0 operation used by the surrounding class.

#### `public static GSettings load(boolean failsafe)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public haven.render.sl.ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
