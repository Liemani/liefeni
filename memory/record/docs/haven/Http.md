---
source: [Http.java](../../../../src/haven/Http.java)
created: 2026-06-13
updated: 2026-06-14
---

# Http

Represents the http Haven component.

## Members

### Constants

#### `public static final String USER_AGENT = useragent()`
- Role: Implements the user agent operation.
- Description: Implements the useragent operation.
- Value: `useragent()`

#### `public static final SslHelper ssl = sslconf()`
- Role: Implements the ssl operation.
- Description: Implements the sslconf operation.
- Value: `sslconf()`

### Fields

### Methods

#### `private static String useragent()`
- Role: Handles the useragent path.
- Description: Builds the HTTP user-agent string used by the client.

#### `private static SslHelper sslconf()`
- Role: Handles the sslconf path.
- Description: Builds the SSL configuration used by the client.

#### `public static URLConnection open(URL url) throws IOException`
- Role: Opens the current resource.
- Description: Opens a URL connection with the client defaults.

#### `public static InputStream fetch(URL url, Consumer<URLConnection> init) throws IOException`
- Role: Fetches the target value.
- Description: Fetches a URL stream after applying custom connection setup.

#### `public static InputStream fetch(URL url) throws IOException`
- Role: Fetches the target value.
- Description: Fetches a URL stream with the default connection setup.