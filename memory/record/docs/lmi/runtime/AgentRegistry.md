---
source: [AgentRegistry.java](../../../../../src/lmi/runtime/AgentRegistry.java)
created: 2026-06-13
updated: 2026-06-14
---

# AgentRegistry

Tracks available agents and their metadata.

## Nested Types

### Entry
Represents one executable agent registry entry.

#### Members

##### Fields

#### `private final Kind kind`
- Role: Stores whether the entry is a job or effect.
- Description: Used when presenting registry metadata.

#### `private final Class<?> cls`
- Role: Stores the backing class.
- Description: Used for command naming and display.

#### `private final String commandName`
- Role: Stores the CLI command name.
- Description: Derived from the class name by stripping `Job` or `Effect`.

##### Methods

#### `static Entry job(Class<? extends Job> cls)`
- Role: Builds a job entry.
- Description: Creates an entry for a concrete job class.

#### `static Entry effect(Class<? extends Effect> cls)`
- Role: Builds an effect entry.
- Description: Creates an entry for a concrete effect class.

#### `public Kind kind()`
- Role: Returns the entry kind.
- Description: Distinguishes job entries from effect entries.

#### `public Class<?> cls()`
- Role: Returns the backing class.
- Description: Exposes the registered class object.

#### `public String className()`
- Role: Returns the fully qualified class name.
- Description: Used when sorting or displaying registry entries.

#### `public String simpleName()`
- Role: Returns the simple class name.
- Description: Used for display and command naming.

#### `public String commandName()`
- Role: Returns the command name.
- Description: This is the user-facing command key.

#### `public String packageName()`
- Role: Returns the package name.
- Description: Used when grouping registry entries.

### Kind
Classifies registry entries as jobs or effects.

## Members

### Constants

#### `private static final String BASE_PACKAGE = "agent"`
- Role: Caches the base package value.
- Description: Caches the `BASE_PACKAGE` value for reuse.

#### `private static final String BASE_PATH = "agent/"`
- Role: Caches the base path value.
- Description: Caches the `BASE_PATH` value for reuse.

#### `private static final Map<String, Class<? extends Job>> jobMap = new TreeMap<>()`
- Role: Implements the job map operation.
- Description: Implements the private static final map<string, class<? extends job>> job map = new tree map<>() operation.

#### `private static final Map<String, Class<? extends Effect>> effectMap = new TreeMap<>()`
- Role: Implements the effect map operation.
- Description: Implements the private static final map<string, class<? extends effect>> effect map = new tree map<>() operation.

#### `private static final Map<String, Class<?>> folderMetadataMap = new HashMap<>()`
- Role: Implements the folder metadata map operation.
- Description: Implements the private static final map<string, class<?>> folder metadata map = new hash map<>() operation.

#### `private static final List<Entry> executableEntries = new ArrayList<>()`
- Role: Implements the executable entries operation.
- Description: Implements the private static final list<entry> executable entries = new array list<>() operation.

### Fields

#### `private static boolean initialized = false`
- Role: Tracks whether initialized is initialized.
- Description: Marks whether the registry scan has already run.

#### `private final Kind kind`
- Role: Caches the kind value.
- Description: Caches the `kind` value for reuse.

#### `private final Class<?> cls`
- Role: Caches the cls value.
- Description: Caches the `cls` value for reuse.

#### `private final String commandName`
- Role: Caches the command name value.
- Description: Caches the `commandName` value for reuse.

### Methods

#### `public static synchronized void init()`
- Role: Scans the agent packages and builds the registry tables.
- Description: Discovers jobs, effects, and folder metadata once per process.

#### `public static Map<String, Class<? extends Job>> jobMap()`
- Role: Returns the registered job map.
- Description: Exposes the lookup table used to resolve job commands.

#### `public static Class<? extends Job> jobClass(String name)`
- Role: Returns the job class for the given command name.
- Description: Resolves a user command to its concrete job class.

#### `public static Class<? extends Effect> effectClass(String name)`
- Role: Returns the effect class for the given command name.
- Description: Resolves a user command to its concrete effect class.

#### `public static Class<?> folderMetadataClass(String packageName)`
- Role: Returns the metadata class for a package folder.
- Description: Resolves folder-level metadata when a package has no executable entry.

#### `public static List<Entry> executableEntries()`
- Role: Returns all executable agent entries.
- Description: Produces the merged list of jobs and effects for menus.

#### `private static void _scanAgentPackage()`
- Role: Scans the `agent` package tree.
- Description: Finds concrete agents and metadata classes under `src/agent`.

#### `private static void _registerClass(String path)`
- Role: Registers one discovered agent class.
- Description: Classifies the class as a job, effect, or folder metadata entry.

#### `private static boolean _isFolderMetadataClass(Class<?> cls)`
- Role: Checks whether the class is package metadata.
- Description: Identifies `*` directory marker classes used for menus.

#### `private static boolean _isConcreteJobClass(Class<?> cls)`
- Role: Checks whether the class is a runnable job.
- Description: Filters out abstract or non-public job definitions.

#### `private static boolean _isConcreteEffectClass(Class<?> cls)`
- Role: Checks whether the class is a runnable effect.
- Description: Filters out abstract or non-public effect definitions.

#### `private static String _jobCommandName(Class<? extends Job> cls)`
- Role: Derives the job command name.
- Description: Strips the `Job` suffix from the registered class name.

#### `private static String _effectCommandName(Class<? extends Effect> cls)`
- Role: Derives the effect command name.
- Description: Strips the `Effect` suffix from the registered class name.

#### `private Entry(Kind kind, Class<?> cls, String commandName)`
- Role: Handles the entry path.
- Description: Builds one registry entry from a discovered class.

#### `static Entry job(Class<? extends Job> cls)`
- Role: Handles the job path.
- Description: Builds a registry entry for a job class.

#### `static Entry effect(Class<? extends Effect> cls)`
- Role: Handles the effect path.
- Description: Builds a registry entry for an effect class.

#### `public Kind kind()`
- Role: Handles the kind path.
- Description: Returns whether the entry is a job or effect.

#### `public Class<?> cls()`
- Role: Handles the cls path.
- Description: Returns the registered class object.

#### `public String className()`
- Role: Handles the class name path.
- Description: Returns the fully qualified class name.

#### `public String simpleName()`
- Role: Handles the simple name path.
- Description: Returns the simple class name.

#### `public String commandName()`
- Role: Handles the command name path.
- Description: Returns the command key used by menus and console dispatch.

#### `public String packageName()`
- Role: Handles the package name path.
- Description: Returns the package name used for grouping.