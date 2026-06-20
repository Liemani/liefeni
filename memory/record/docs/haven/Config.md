---
source: [Config.java](../../../src/haven/Config.java)
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
- Role: Defines the shared jarprops constant.
- Description: Shared constant used by the rest of the class.

#### `public static final String confid = jarprops.getProperty("config.client-id", "unknown")`
- Role: Defines the shared confid constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Variable<Boolean> par = Variable.def(() -> true)`
- Role: Defines the shared par constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Variable<URI> directory = Config.Variable.propu("haven.svcdir", "")`
- Role: Defines the shared directory constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Properties localprops = getlocalprops()`
- Role: Holds the localprops state.
- Description: Backs the cached state for this file.

#### `private static Config global = null`
- Role: Holds the global state.
- Description: Backs the cached state for this file.

#### `public final Function<Config, T> init`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

#### `private boolean inited = false`
- Role: Tracks the inited flag.
- Description: Supports the inited operation used by the surrounding class.

#### `private T val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `public final URI rel`
- Role: Holds the rel state.
- Description: Backs the cached state for this file.

#### `public final Properties props`
- Role: Holds the props state.
- Description: Backs the cached state for this file.

#### `private static Services global = null`
- Role: Holds the global state.
- Description: Backs the cached state for this file.

### Methods

#### `public static Config get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `private static Properties getjarprops()`
- Role: Performs getjarprops.
- Description: Supports the getjarprops operation used by the surrounding class.

#### `private static Properties getlocalprops()`
- Role: Performs getlocalprops.
- Description: Supports the getlocalprops operation used by the surrounding class.

#### `public String getprop(String name, String def)`
- Role: Performs getprop.
- Description: Supports the getprop operation used by the surrounding class.

#### `public static final Path parsepath(String p)`
- Role: Performs parsepath.
- Description: Supports the parsepath operation used by the surrounding class.

#### `public static final URI parseuri(String url)`
- Role: Performs parseuri.
- Description: Supports the parseuri operation used by the surrounding class.

#### `private Variable(Function<Config, T> init)`
- Role: Performs variable.
- Description: Supports the variable operation used by the surrounding class.

#### `public T get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void set(T val)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public static <V> Variable<V> def(Supplier<V> defval)`
- Role: Performs def.
- Description: Supports the def operation used by the surrounding class.

#### `public static <V> Variable<V> prop(String name, Function<String, V> parse, Supplier<V> defval)`
- Role: Performs prop.
- Description: Supports the prop operation used by the surrounding class.

#### `public static Variable<String> prop(String name, String defval)`
- Role: Performs prop.
- Description: Supports the prop operation used by the surrounding class.

#### `public static Variable<Integer> propi(String name, int defval)`
- Role: Performs propi.
- Description: Supports the propi operation used by the surrounding class.

#### `public static Variable<Boolean> propb(String name, boolean defval)`
- Role: Performs propb.
- Description: Supports the propb operation used by the surrounding class.

#### `public static Variable<Double> propf(String name, Double defval)`
- Role: Performs propf.
- Description: Supports the propf operation used by the surrounding class.

#### `public static Variable<byte[]> propb(String name, byte[] defval)`
- Role: Performs propb.
- Description: Supports the propb operation used by the surrounding class.

#### `public static Variable<NamedSocketAddress> proph(String name, int defport, NamedSocketAddress defval)`
- Role: Performs proph.
- Description: Supports the proph operation used by the surrounding class.

#### `public static Variable<URI> propu(String name, URI defval)`
- Role: Performs propu.
- Description: Supports the propu operation used by the surrounding class.

#### `public static Variable<URI> propu(String name, String defval)`
- Role: Performs propu.
- Description: Supports the propu operation used by the surrounding class.

#### `public static Variable<Path> propp(String name, Path defval)`
- Role: Performs propp.
- Description: Supports the propp operation used by the surrounding class.

#### `public static Variable<Path> propp(String name, String defval)`
- Role: Performs propp.
- Description: Supports the propp operation used by the surrounding class.

#### `public Services(URI rel, Properties props)`
- Role: Performs services.
- Description: Supports the services operation used by the surrounding class.

#### `private static Services fetch(URI uri)`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public static Services get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public URI geturi(String name)`
- Role: Performs geturi.
- Description: Supports the geturi operation used by the surrounding class.

#### `public static Variable<URI> var(String name, String defval)`
- Role: Performs var.
- Description: Supports the var operation used by the surrounding class.

#### `private static void usage(PrintStream out)`
- Role: Performs usage.
- Description: Supports the usage operation used by the surrounding class.

#### `public static void cmdline(String[] args)`
- Role: Performs cmdline.
- Description: Supports the cmdline operation used by the surrounding class.
