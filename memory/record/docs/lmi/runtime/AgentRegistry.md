---
source: [AgentRegistry.java](../../../../src/lmi/runtime/AgentRegistry.java)
created: 2026-06-13
updated: 2026-06-14
---

# AgentRegistry

Tracks available agents and their metadata.

## Nested Types

### Entry
### Entry
- Role: Represents the entry helper used by AgentRegistry.

- Role: Represents one executable agent registry entry.
- Description: Acts as one executable agent registry entry.

### Kind
### Kind
- Role: Represents the kind helper used by AgentRegistry.

- Role: Classifies agent registry entries as jobs or effects.
- Description: Describes the nested kind type used by the enclosing class.

## Members

### Constants

#### `private static final String BASE_PACKAGE = "agent"`
- Role: Defines the shared base package constant.
- Description: Shared constant used by the rest of the class.

#### `private static final String BASE_PATH = "agent/"`
- Role: Defines the shared base path constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<String, Class<? extends Job>> jobMap = new TreeMap<>()`
- Role: Defines the shared job map constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<String, Class<? extends Effect>> effectMap = new TreeMap<>()`
- Role: Defines the shared effect map constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<String, Class<?>> folderMetadataMap = new HashMap<>()`
- Role: Defines the shared folder metadata map constant.
- Description: Shared constant used by the rest of the class.

#### `private static final List<Entry> executableEntries = new ArrayList<>()`
- Role: Defines the shared executable entries constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static boolean initialized = false`
- Role: Tracks whether initialized is initialized.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private final Kind kind`
- Role: Holds the kind state.
- Description: Backs the cached state for this file.

#### `private final Class<?> cls`
- Role: Holds the cls state.
- Description: Backs the cached state for this file.

#### `private final String commandName`
- Role: Stores the command name value.
- Description: Backs the cached state for this file.

### Methods

#### `public static synchronized void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public static Map<String, Class<? extends Job>> jobMap()`
- Role: Performs job map.
- Description: Supports the job map operation used by the surrounding class.

#### `public static Class<? extends Job> jobClass(String name)`
- Role: Performs job class.
- Description: Supports the job class operation used by the surrounding class.

#### `public static Class<? extends Effect> effectClass(String name)`
- Role: Performs effect class.
- Description: Supports the effect class operation used by the surrounding class.

#### `public static Class<?> folderMetadataClass(String packageName)`
- Role: Performs folder metadata class.
- Description: Supports the folder metadata class operation used by the surrounding class.

#### `public static List<Entry> executableEntries()`
- Role: Performs executable entries.
- Description: Supports the executable entries operation used by the surrounding class.

#### `private static void _scanAgentPackage()`
- Role: Performs  scan agent package.
- Description: Supports the scan agent package operation used by the surrounding class.

#### `private static void _registerClass(String path)`
- Role: Performs  register class.
- Description: Supports the register class operation used by the surrounding class.

#### `private static boolean _isFolderMetadataClass(Class<?> cls)`
- Role: Performs  is folder metadata class.
- Description: Supports the is folder metadata class operation used by the surrounding class.

#### `private static boolean _isConcreteJobClass(Class<?> cls)`
- Role: Performs  is concrete job class.
- Description: Supports the is concrete job class operation used by the surrounding class.

#### `private static boolean _isConcreteEffectClass(Class<?> cls)`
- Role: Performs  is concrete effect class.
- Description: Supports the is concrete effect class operation used by the surrounding class.

#### `private static String _jobCommandName(Class<? extends Job> cls)`
- Role: Performs  job command name.
- Description: Supports the job command name operation used by the surrounding class.

#### `private static String _effectCommandName(Class<? extends Effect> cls)`
- Role: Performs  effect command name.
- Description: Supports the effect command name operation used by the surrounding class.

#### `private Entry(Kind kind, Class<?> cls, String commandName)`
- Role: Performs entry.
- Description: Supports the entry operation used by the surrounding class.

#### `static Entry job(Class<? extends Job> cls)`
- Role: Performs job.
- Description: Supports the job operation used by the surrounding class.

#### `static Entry effect(Class<? extends Effect> cls)`
- Role: Performs effect.
- Description: Supports the effect operation used by the surrounding class.

#### `public Kind kind()`
- Role: Performs kind.
- Description: Supports the kind operation used by the surrounding class.

#### `public Class<?> cls()`
- Role: Performs cls.
- Description: Supports the cls operation used by the surrounding class.

#### `public String className()`
- Role: Performs class name.
- Description: Supports the class name operation used by the surrounding class.

#### `public String simpleName()`
- Role: Performs simple name.
- Description: Supports the simple name operation used by the surrounding class.

#### `public String commandName()`
- Role: Performs command name.
- Description: Supports the command name operation used by the surrounding class.

#### `public String packageName()`
- Role: Performs package name.
- Description: Supports the package name operation used by the surrounding class.
