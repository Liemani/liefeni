# Http

This file documents the responsibilities and members of `Http`.

## Meta

- Source: [Http.java](../../../src/haven/Http.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides HTTP client helpers.

## Members

### Constants

#### `public static final String USER_AGENT = useragent()`

- Description: TODO

#### `public static final SslHelper ssl = sslconf()`

- Description: TODO

### Fields

### Methods

#### `private static String useragent()`

- Description: TODO

#### `private static SslHelper sslconf()`

- Description: TODO

#### `public static URLConnection open(URL url) throws IOException`

- Description: TODO

#### `public static InputStream fetch(URL url, Consumer<URLConnection> init) throws IOException`

- Description: TODO

#### `public static InputStream fetch(URL url) throws IOException`

- Description: TODO
