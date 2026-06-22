---
source: [HttpStatus.java](../../../../src/haven/HttpStatus.java)
created: 2026-06-13
updated: 2026-06-14
---

# HttpStatus

Represents the http status Haven component.

## Members

### Constants

#### `public static final Config.Variable<URI> mond = Config.Services.var("srvmon", "")`
- Role: Implements the mond operation.
- Description: Implements the var operation.
- Value: `Config.Services.var("srvmon", "")`

#### `private static final int[] delays =`
- Role: Caches the delays value.
- Description: Caches the `delays` value for reuse.
- Value: ``

### Fields

#### `public final URI src`
- Role: Caches the src value.
- Description: Carries the source drag widget.

#### `public boolean syn = false`
- Role: Tracks the syn flag.
- Description: Caches the `syn` value for reuse.

#### `public String status`
- Role: Caches the status value.
- Description: Caches the `status` value for reuse.

#### `public int users`
- Role: Caches the users value.
- Description: Caches the `users` value for reuse.

#### `private boolean quit = false`
- Role: Tracks the quit flag.
- Description: Caches the `quit` value for reuse.

#### `private InputStream cur = null`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

### Methods

#### `public HttpStatus(URI src)`
- Role: Creates a new HttpStatus instance.
- Description: Constructs the HttpStatus instance from the supplied inputs.

#### `public HttpStatus()`
- Role: Creates a new HttpStatus instance.
- Description: Constructs the HttpStatus instance from the supplied inputs.

#### `private void handle(String... words)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `private void handle(byte[] buf, int off, int len)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void quit()`
- Role: Handles the quit path.
- Description: Implements the quit operation.