# HttpStatus

This file documents the responsibilities and members of `HttpStatus`.

## Meta

- Source: [HttpStatus.java](../../../src/haven/HttpStatus.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an HTTP status value.

## Members

### Constants

#### `public static final Config.Variable<URI> mond = Config.Services.var("srvmon", "")`

- Description: TODO

#### `private static final int[] delays =`

- Description: TODO

### Fields

#### `public final URI src`

- Description: TODO

#### `public boolean syn = false`

- Description: TODO

#### `public String status`

- Description: TODO

#### `public int users`

- Description: TODO

#### `private boolean quit = false`

- Description: TODO

#### `private InputStream cur = null`

- Description: TODO

### Methods

#### `public HttpStatus(URI src)`

- Description: TODO

#### `public HttpStatus()`

- Description: TODO

#### `private void handle(String... words)`

- Description: TODO

#### `private void handle(byte[] buf, int off, int len)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public void quit()`

- Description: TODO
