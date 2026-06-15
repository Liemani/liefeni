# GSettings

This file documents the responsibilities and members of `GSettings`.

## Meta

- Source: [GSettings.java](../../../src/haven/GSettings.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds graphics settings.

## Nested Types

### BoolSetting

- Description: TODO

### EnumSetting

- Description: TODO

### FloatSetting

- Description: TODO

### HertzSetting

- Description: TODO

### IntSetting

- Description: TODO

### LightMode

- Description: TODO

### Setting

- Description: TODO

### SettingException

- Description: TODO

### SyncMode

- Description: TODO

## Members

### Constants

#### `public static final Slot<GSettings> slot = new Slot<>(Slot.Type.SYS, GSettings.class)`

- Description: TODO

#### `private static final List<Field> settings`

- Description: TODO

### Fields

#### `public final String nm`

- Description: TODO

#### `public T val`

- Description: TODO

#### `public boolean set`

- Description: TODO

#### `private final Class<E> real`

- Description: TODO

#### `public BoolSetting lshadow = new BoolSetting("sdw")`

- Description: TODO

#### `public IntSetting shadowres = new IntSetting("sres")`

- Description: TODO

#### `public BoolSetting vsync = new BoolSetting("vsync")`

- Description: TODO

#### `public FloatSetting hz = new HertzSetting("hz")`

- Description: TODO

#### `public FloatSetting bghz = new HertzSetting("bghz")`

- Description: TODO

#### `public FloatSetting rscale = new FloatSetting("rscale")`

- Description: TODO

#### `public EnumSetting<SyncMode> syncmode = new EnumSetting<SyncMode>("syncmode", SyncMode.class)`

- Description: TODO

#### `public EnumSetting<LightMode> lightmode = new EnumSetting<LightMode>("lighting", LightMode.class)`

- Description: TODO

#### `public IntSetting maxlights = new IntSetting("maxlights")`

- Description: TODO

### Methods

#### `private GSettings()`

- Description: TODO

#### `public GSettings(GSettings from)`

- Description: TODO

#### `public SettingException(String msg)`

- Description: TODO

#### `public Setting(String nm)`

- Description: TODO

#### `public abstract T parse(String val)`

- Description: TODO

#### `public void validate(Environment env, T val)`

- Description: TODO

#### `public abstract T defval()`

- Description: TODO

#### `public String reduce(T val)`

- Description: TODO

#### `public T restore(String prs)`

- Description: TODO

#### `public Setting<T> clone()`

- Description: TODO

#### `public BoolSetting(String nm)`

- Description: TODO

#### `public Boolean parse(String val)`

- Description: TODO

#### `public EnumSetting(String nm, Class<E> real)`

- Description: TODO

#### `public E parse(String val)`

- Description: TODO

#### `public E restore(String prs)`

- Description: TODO

#### `public IntSetting(String nm)`

- Description: TODO

#### `public Integer parse(String val)`

- Description: TODO

#### `public FloatSetting(String nm)`

- Description: TODO

#### `public Float parse(String val)`

- Description: TODO

#### `public HertzSetting(String nm)`

- Description: TODO

#### `public Float parse(String val)`

- Description: TODO

#### `public void validate(Environment env, Float val)`

- Description: TODO

#### `public Setting<?> find(String name)`

- Description: TODO

#### `private static <T> Setting<T> update(Setting<T> set, T val)`

- Description: TODO

#### `private <T> GSettings supdate(Setting<T> set, T val)`

- Description: TODO

#### `private static <T> void validate0(Environment env, Setting<T> set)`

- Description: TODO

#### `public GSettings validate(Environment env)`

- Description: TODO

#### `public <T> GSettings update(Environment env, Setting<T> set, T val)`

- Description: TODO

#### `private static <T> void setdef(Setting<T> set)`

- Description: TODO

#### `public static GSettings defaults()`

- Description: TODO

#### `private static <T> String reduce0(Setting<T> s)`

- Description: TODO

#### `public void save()`

- Description: TODO

#### `private static <T> Setting<T> restore0(Setting<T> s, String prs)`

- Description: TODO

#### `public static GSettings load(boolean failsafe)`

- Description: TODO

#### `public haven.render.sl.ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO
