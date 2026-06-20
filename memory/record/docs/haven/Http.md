---
source: [Http.java](../../../src/haven/Http.java)
created: 2026-06-13
updated: 2026-06-14
---

# Http

Represents the http Haven component.

## Members

### Constants

#### `public static final String USER_AGENT = useragent()`
- Role: Defines the shared user agent constant.
- Description: Shared constant used by the rest of the class.

#### `public static final SslHelper ssl = sslconf()`
- Role: Defines the shared ssl constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private static String useragent()`
- Role: Performs useragent.
- Description: Supports the useragent operation used by the surrounding class.

#### `private static SslHelper sslconf()`
- Role: Performs sslconf.
- Description: Supports the sslconf operation used by the surrounding class.

#### `public static URLConnection open(URL url) throws IOException`
- Role: Opens the current resource.
- Description: Supports the open operation used by the surrounding class.

#### `public static InputStream fetch(URL url, Consumer<URLConnection> init) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.

#### `public static InputStream fetch(URL url) throws IOException`
- Role: Fetches the target value.
- Description: Supports the fetch operation used by the surrounding class.
