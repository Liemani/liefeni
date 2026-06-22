---
source: [Config.java](../../../../src/haven/Config.java)
created: 2026-06-13
updated: 2026-06-14
---

# Config

Represents the config Haven component.

## Nested Types

### Services

- Role: Represents services within Config.
- Description: Describes the nested services type used by the enclosing class.

### Variable

- Role: Represents variable within Config.
- Description: Describes the nested variable type used by the enclosing class.

## Members

### Constants

#### `public static final Properties jarprops = getjarprops()`
- Role: Implements the jarprops operation.
- Description: Implements the getjarprops operation.
- Value: `getjarprops()`

#### `public static final String confid = jarprops.getProperty("config.client-id", "unknown")`
- Role: Implements the confid operation.
- Description: Implements the get property operation.
- Value: `jarprops.getProperty("config.client-id", "unknown")`

#### `public static final Variable<Boolean> par = Variable.def(() -> true)`
- Role: Implements the par operation.
- Description: Implements the def operation.
- Value: `Variable.def(() -> true)`

#### `public static final Variable<URI> directory = Config.Variable.propu("haven.svcdir", "")`
- Role: Implements the directory operation.
- Description: Implements the propu operation.
- Value: `Config.Variable.propu("haven.svcdir", "")`

### Fields

#### `public final Properties localprops = getlocalprops()`
- Role: Implements the localprops operation.
- Description: Implements the getlocalprops operation.

#### `private static Config global = null`
- Role: Caches the global value.
- Description: Caches the `global` value for reuse.

#### `public final Function<Config, T> init`
- Role: Caches the init value.
- Description: Caches the `init` value for reuse.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Caches the `inited` value for reuse.

#### `private T val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `public final URI rel`
- Role: Caches the rel value.
- Description: Caches the `rel` value for reuse.

#### `public final Properties props`
- Role: Caches the props value.
- Description: Caches the `props` value for reuse.

#### `private static Services global = null`
- Role: Caches the global value.
- Description: Caches the `global` value for reuse.

### Methods

#### `public static Config get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `private static Properties getjarprops()`
- Role: Handles the getjarprops path.
- Description: Returns the jarprops.

#### `private static Properties getlocalprops()`
- Role: Handles the getlocalprops path.
- Description: Returns the localprops.

#### `public String getprop(String name, String def)`
- Role: Handles the getprop path.
- Description: Returns the prop.

#### `public static final Path parsepath(String p)`
- Role: Handles the parsepath path.
- Description: Implements the parsepath operation.

#### `public static final URI parseuri(String url)`
- Role: Handles the parseuri path.
- Description: Implements the parseuri operation.

#### `private Variable(Function<Config, T> init)`
- Role: Handles the variable path.
- Description: Implements the variable operation.

#### `public T get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void set(T val)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public static <V> Variable<V> def(Supplier<V> defval)`
- Role: Handles the def path.
- Description: Implements the def operation.

#### `public static <V> Variable<V> prop(String name, Function<String, V> parse, Supplier<V> defval)`
- Role: Handles the prop path.
- Description: Implements the prop operation.

#### `public static Variable<String> prop(String name, String defval)`
- Role: Handles the prop path.
- Description: Implements the prop operation.

#### `public static Variable<Integer> propi(String name, int defval)`
- Role: Handles the propi path.
- Description: Implements the propi operation.

#### `public static Variable<Boolean> propb(String name, boolean defval)`
- Role: Handles the propb path.
- Description: Implements the propb operation.

#### `public static Variable<Double> propf(String name, Double defval)`
- Role: Handles the propf path.
- Description: Implements the propf operation.

#### `public static Variable<byte[]> propb(String name, byte[] defval)`
- Role: Handles the propb path.
- Description: Implements the propb operation.

#### `public static Variable<NamedSocketAddress> proph(String name, int defport, NamedSocketAddress defval)`
- Role: Handles the proph path.
- Description: Implements the proph operation.

#### `public static Variable<URI> propu(String name, URI defval)`
- Role: Handles the propu path.
- Description: Implements the propu operation.

#### `public static Variable<URI> propu(String name, String defval)`
- Role: Handles the propu path.
- Description: Implements the propu operation.

#### `public static Variable<Path> propp(String name, Path defval)`
- Role: Handles the propp path.
- Description: Implements the propp operation.

#### `public static Variable<Path> propp(String name, String defval)`
- Role: Handles the propp path.
- Description: Implements the propp operation.

#### `public Services(URI rel, Properties props)`
- Role: Handles the services path.
- Description: Implements the services operation.

#### `private static Services fetch(URI uri)`
- Role: Fetches the target value.
- Description: Opens the requested cached resource for reading.

#### `public static Services get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public URI geturi(String name)`
- Role: Handles the geturi path.
- Description: Returns the uri.

#### `public static Variable<URI> var(String name, String defval)`
- Role: Handles the var path.
- Description: Implements the var operation.

#### `private static void usage(PrintStream out)`
- Role: Handles the usage path.
- Description: Implements the usage operation.

#### `public static void cmdline(String[] args)`
- Role: Handles the cmdline path.
- Description: Implements the cmdline operation.