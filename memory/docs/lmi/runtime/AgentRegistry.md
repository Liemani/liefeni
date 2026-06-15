# AgentRegistry

This file documents the responsibilities and members of `AgentRegistry`.

## Meta

- Source: [AgentRegistry.java](../../../../src/lmi/runtime/AgentRegistry.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Tracks available agent jobs and effect constructors.

## Nested Types

### Entry

- Description: TODO

### Kind

- Description: TODO

## Members

### Constants

#### `private static final String BASE_PACKAGE = "agent"`

- Description: TODO

#### `private static final String BASE_PATH = "agent/"`

- Description: TODO

#### `private static final Map<String, Class<? extends Job>> jobMap = new TreeMap<>()`

- Description: TODO

#### `private static final Map<String, Class<? extends Effect>> effectMap = new TreeMap<>()`

- Description: TODO

#### `private static final Map<String, Class<?>> folderMetadataMap = new HashMap<>()`

- Description: TODO

#### `private static final List<Entry> executableEntries = new ArrayList<>()`

- Description: TODO

### Fields

#### `private static boolean initialized = false`

- Description: TODO

#### `private final Kind kind`

- Description: TODO

#### `private final Class<?> cls`

- Description: TODO

#### `private final String commandName`

- Description: TODO

### Methods

#### `public static synchronized void init()`

- Description: TODO

#### `public static Map<String, Class<? extends Job>> jobMap()`

- Description: TODO

#### `public static Class<? extends Job> jobClass(String name)`

- Description: TODO

#### `public static Class<? extends Effect> effectClass(String name)`

- Description: TODO

#### `public static Class<?> folderMetadataClass(String packageName)`

- Description: TODO

#### `public static List<Entry> executableEntries()`

- Description: TODO

#### `private static void _scanAgentPackage()`

- Description: TODO

#### `private static void _registerClass(String path)`

- Description: TODO

#### `private static boolean _isFolderMetadataClass(Class<?> cls)`

- Description: TODO

#### `private static boolean _isConcreteJobClass(Class<?> cls)`

- Description: TODO

#### `private static boolean _isConcreteEffectClass(Class<?> cls)`

- Description: TODO

#### `private static String _jobCommandName(Class<? extends Job> cls)`

- Description: TODO

#### `private static String _effectCommandName(Class<? extends Effect> cls)`

- Description: TODO

#### `private Entry(Kind kind, Class<?> cls, String commandName)`

- Description: TODO

#### `static Entry job(Class<? extends Job> cls)`

- Description: TODO

#### `static Entry effect(Class<? extends Effect> cls)`

- Description: TODO

#### `public Kind kind()`

- Description: TODO

#### `public Class<?> cls()`

- Description: TODO

#### `public String className()`

- Description: TODO

#### `public String simpleName()`

- Description: TODO

#### `public String commandName()`

- Description: TODO

#### `public String packageName()`

- Description: TODO
