---
source: [GSettings.java](../../../../src/haven/GSettings.java)
created: 2026-06-13
updated: 2026-06-14
---

# GSettings

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
- Role: Implements the slot operation.
- Description: Implements the public static final slot<g settings> slot = new slot<>(slot.type.sys, g settings.class) operation.
- Value: `new Slot<>(Slot.Type.SYS, GSettings.class)`

#### `private static final List<Field> settings`
#### `private static final List<Field> settings`
- Role: Caches the settings value.
- Description: Caches the `settings` value for reuse.

### Fields

#### `public final String nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `public T val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `public boolean set`
- Role: Tracks the set flag.
- Description: Caches the `set` value for reuse.

#### `private final Class<E> real`
- Role: Caches the real value.
- Description: Caches the `real` value for reuse.

#### `public BoolSetting lshadow = new BoolSetting("sdw")`
- Role: Tracks the lshadow flag.
- Description: Implements the bool setting operation.

#### `public IntSetting shadowres = new IntSetting("sres")`
- Role: Implements the shadowres operation.
- Description: Implements the int setting operation.

#### `public BoolSetting vsync = new BoolSetting("vsync")`
- Role: Tracks the vsync flag.
- Description: Implements the bool setting operation.

#### `public FloatSetting hz = new HertzSetting("hz")`
- Role: Implements the hz operation.
- Description: Implements the hertz setting operation.

#### `public FloatSetting bghz = new HertzSetting("bghz")`
- Role: Implements the bghz operation.
- Description: Implements the hertz setting operation.

#### `public FloatSetting rscale = new FloatSetting("rscale")`
- Role: Implements the rscale operation.
- Description: Implements the float setting operation.

#### `public EnumSetting<SyncMode> syncmode = new EnumSetting<SyncMode>("syncmode", SyncMode.class)`
- Role: Implements the syncmode operation.
- Description: Implements the public enum setting<sync mode> syncmode = new enum setting<sync mode>("syncmode", sync mode.class) operation.

#### `public EnumSetting<LightMode> lightmode = new EnumSetting<LightMode>("lighting", LightMode.class)`
- Role: Implements the lightmode operation.
- Description: Implements the public enum setting<light mode> lightmode = new enum setting<light mode>("lighting", light mode.class) operation.

#### `public IntSetting maxlights = new IntSetting("maxlights")`
- Role: Implements the maxlights operation.
- Description: Implements the int setting operation.

### Methods

#### `private GSettings()`
- Role: Creates a new GSettings instance.
- Description: Constructs the GSettings instance from the supplied inputs.

#### `public GSettings(GSettings from)`
- Role: Creates a new GSettings instance.
- Description: Constructs the GSettings instance from the supplied inputs.

#### `public SettingException(String msg)`
- Role: Handles the setting exception path.
- Description: Implements the setting exception operation.

#### `public Setting(String nm)`
- Role: Handles the setting path.
- Description: Implements the setting operation.

#### `public abstract T parse(String val)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public void validate(Environment env, T val)`
- Role: Handles the validate path.
- Description: Implements the validate operation.

#### `public abstract T defval()`
- Role: Handles the defval path.
- Description: Implements the defval operation.

#### `public String reduce(T val)`
- Role: Handles the reduce path.
- Description: Implements the reduce operation.

#### `public T restore(String prs)`
- Role: Handles the restore path.
- Description: Implements the restore operation.

#### `public Setting<T> clone()`
- Role: Handles the clone path.
- Description: Implements the clone operation.

#### `public BoolSetting(String nm)`
- Role: Handles the bool setting path.
- Description: Implements the bool setting operation.

#### `public Boolean parse(String val)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public EnumSetting(String nm, Class<E> real)`
- Role: Handles the enum setting path.
- Description: Implements the enum setting operation.

#### `public E parse(String val)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public E restore(String prs)`
- Role: Handles the restore path.
- Description: Implements the restore operation.

#### `public IntSetting(String nm)`
- Role: Handles the int setting path.
- Description: Implements the int setting operation.

#### `public Integer parse(String val)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public FloatSetting(String nm)`
- Role: Handles the float setting path.
- Description: Implements the float setting operation.

#### `public Float parse(String val)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public HertzSetting(String nm)`
- Role: Handles the hertz setting path.
- Description: Implements the hertz setting operation.

#### `public Float parse(String val)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public void validate(Environment env, Float val)`
- Role: Handles the validate path.
- Description: Implements the validate operation.

#### `public Setting<?> find(String name)`
- Role: Handles the find path.
- Description: Finds the requested data.

#### `private static <T> Setting<T> update(Setting<T> set, T val)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `private <T> GSettings supdate(Setting<T> set, T val)`
- Role: Handles the supdate path.
- Description: Implements the supdate operation.

#### `private static <T> void validate0(Environment env, Setting<T> set)`
- Role: Handles the validate0 path.
- Description: Implements the validate0 operation.

#### `public GSettings validate(Environment env)`
- Role: Handles the validate path.
- Description: Implements the validate operation.

#### `public <T> GSettings update(Environment env, Setting<T> set, T val)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `private static <T> void setdef(Setting<T> set)`
- Role: Handles the setdef path.
- Description: Updates the def.

#### `public static GSettings defaults()`
- Role: Handles the defaults path.
- Description: Implements the defaults operation.

#### `private static <T> String reduce0(Setting<T> s)`
- Role: Handles the reduce0 path.
- Description: Implements the reduce0 operation.

#### `public void save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `private static <T> Setting<T> restore0(Setting<T> s, String prs)`
- Role: Handles the restore0 path.
- Description: Implements the restore0 operation.

#### `public static GSettings load(boolean failsafe)`
- Role: Loads the target data.
- Description: Loads the target data into the in-memory state.

#### `public haven.render.sl.ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.