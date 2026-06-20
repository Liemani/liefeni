---
source: [Server.java](../../../../src/haven/rs/Server.java)
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
- Role: Defines the shared commands constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final ServerSocket sk`
- Role: Holds the sk state.
- Description: Backs the cached state for this file.

#### `private final Random rng = new SecureRandom()`
- Role: Holds the rng state.
- Description: Backs the cached state for this file.

#### `private final byte[] key`
- Role: Stores the key value.
- Description: Backs the cached state for this file.

#### `private final InputStream in`
- Role: Holds the in state.
- Description: Backs the cached state for this file.

#### `private final OutputStream out`
- Role: Holds the out state.
- Description: Backs the cached state for this file.

#### `private byte[] nonce = null`
- Role: Stores the nonce value.
- Description: Backs the cached state for this file.

#### `private boolean auth = false`
- Role: Tracks the auth flag.
- Description: Supports the auth operation used by the surrounding class.

### Methods

#### `public Object[] run(Client cl, Object... args) throws InterruptedException`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private Client(InputStream in, OutputStream out, boolean auth)`
- Role: Performs client.
- Description: Supports the client operation used by the surrounding class.

#### `private Client(Socket sk) throws IOException`
- Role: Handles the client workflow.
- Description: Supports the client operation used by the surrounding class.

#### `byte[] read(InputStream in, int bytes) throws IOException`
- Role: Reads the target data.
- Description: Supports the read operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public Server(int port, byte[] key) throws IOException`
- Role: Creates a new Server instance.
- Description: Constructs the instance and initializes its default state.

#### `public Server()`
- Role: Creates a new Server instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void stdio()`
- Role: Performs stdio.
- Description: Supports the stdio operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
