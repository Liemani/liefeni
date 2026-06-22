---
source: [Server.java](../../../../../src/haven/rs/Server.java)
created: 2026-06-13
updated: 2026-06-14
---

# Server

Integrates Haven rendering-server support for server.

## Nested Types

### Client

- Role: Represents client within Server.
- Description: Describes the nested client type used by the enclosing class.

### Command

- Role: Represents command within Server.
- Description: Describes the nested command type used by the enclosing class.

## Members

### Constants

#### `public static final Map<String, Command> commands = new HashMap<String, Command>()`
- Role: Implements the commands operation.
- Description: Implements the public static final map<string, command> commands = new hash map<string, command>() operation.
- Value: `new HashMap<String, Command>()`

### Fields

#### `private final ServerSocket sk`
- Role: Caches the sk value.
- Description: Caches the `sk` value for reuse.

#### `private final Random rng = new SecureRandom()`
- Role: Implements the rng operation.
- Description: Implements the secure random operation.

#### `private final byte[] key`
- Role: Caches the key value.
- Description: Caches the `key` value for reuse.

#### `private final InputStream in`
- Role: Caches the in value.
- Description: Caches the `in` value for reuse.

#### `private final OutputStream out`
- Role: Caches the out value.
- Description: Caches the `out` value for reuse.

#### `private byte[] nonce = null`
- Role: Caches the nonce value.
- Description: Caches the `nonce` value for reuse.

#### `private boolean auth = false`
- Role: Tracks the auth flag.
- Description: Caches the `auth` value for reuse.

### Methods

#### `public Object[] run(Client cl, Object... args) throws InterruptedException`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private Client(InputStream in, OutputStream out, boolean auth)`
- Role: Handles the client path.
- Description: Implements the client operation.

#### `private Client(Socket sk) throws IOException`
- Role: Handles the client workflow.
- Description: Implements the client operation.

#### `byte[] read(InputStream in, int bytes) throws IOException`
- Role: Reads the target data.
- Description: Implements the read operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public Server(int port, byte[] key) throws IOException`
- Role: Creates a new Server instance.
- Description: Constructs the Server instance from the supplied inputs.

#### `public Server()`
- Role: Creates a new Server instance.
- Description: Constructs the Server instance from the supplied inputs.

#### `public static void stdio()`
- Role: Handles the stdio path.
- Description: Implements the stdio operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.