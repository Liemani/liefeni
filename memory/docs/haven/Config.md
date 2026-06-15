# Config

This file documents the responsibilities and members of `Config`.

## Meta

- Source: [Config.java](../../../src/haven/Config.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds client configuration and option access.

## Nested Types

### Services

- Description: TODO

### Variable

- Description: TODO

## Members

### Constants

#### `public static final Properties jarprops = getjarprops()`

- Description: TODO

#### `public static final String confid = jarprops.getProperty("config.client-id", "unknown")`

- Description: TODO

#### `public static final Variable<Boolean> par = Variable.def(() -> true)`

- Description: TODO

#### `public static final Variable<URI> directory = Config.Variable.propu("haven.svcdir", "")`

- Description: TODO

### Fields

#### `public final Properties localprops = getlocalprops()`

- Description: TODO

#### `private static Config global = null`

- Description: TODO

#### `public final Function<Config, T> init`

- Description: TODO

#### `private boolean inited = false`

- Description: TODO

#### `private T val`

- Description: TODO

#### `public final URI rel`

- Description: TODO

#### `public final Properties props`

- Description: TODO

#### `private static Services global = null`

- Description: TODO

### Methods

#### `public static Config get()`

- Description: TODO

#### `private static Properties getjarprops()`

- Description: TODO

#### `private static Properties getlocalprops()`

- Description: TODO

#### `public String getprop(String name, String def)`

- Description: TODO

#### `public static final Path parsepath(String p)`

- Description: TODO

#### `public static final URI parseuri(String url)`

- Description: TODO

#### `private Variable(Function<Config, T> init)`

- Description: TODO

#### `public T get()`

- Description: TODO

#### `public void set(T val)`

- Description: TODO

#### `public static <V> Variable<V> def(Supplier<V> defval)`

- Description: TODO

#### `public static <V> Variable<V> prop(String name, Function<String, V> parse, Supplier<V> defval)`

- Description: TODO

#### `public static Variable<String> prop(String name, String defval)`

- Description: TODO

#### `public static Variable<Integer> propi(String name, int defval)`

- Description: TODO

#### `public static Variable<Boolean> propb(String name, boolean defval)`

- Description: TODO

#### `public static Variable<Double> propf(String name, Double defval)`

- Description: TODO

#### `public static Variable<byte[]> propb(String name, byte[] defval)`

- Description: TODO

#### `public static Variable<NamedSocketAddress> proph(String name, int defport, NamedSocketAddress defval)`

- Description: TODO

#### `public static Variable<URI> propu(String name, URI defval)`

- Description: TODO

#### `public static Variable<URI> propu(String name, String defval)`

- Description: TODO

#### `public static Variable<Path> propp(String name, Path defval)`

- Description: TODO

#### `public static Variable<Path> propp(String name, String defval)`

- Description: TODO

#### `public Services(URI rel, Properties props)`

- Description: TODO

#### `private static Services fetch(URI uri)`

- Description: TODO

#### `public static Services get()`

- Description: TODO

#### `public URI geturi(String name)`

- Description: TODO

#### `public static Variable<URI> var(String name, String defval)`

- Description: TODO

#### `private static void usage(PrintStream out)`

- Description: TODO

#### `public static void cmdline(String[] args)`

- Description: TODO
