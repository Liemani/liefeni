# Server

This file documents the responsibilities and members of `Server`.

## Meta

- Source: [Server.java](../../../../src/haven/rs/Server.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a resource script server.

## Nested Types

### Client

- Description: TODO

### Command

- Description: TODO

## Members

### Constants

#### `public static final Map<String, Command> commands = new HashMap<String, Command>()`

- Description: TODO

### Fields

#### `private final ServerSocket sk`

- Description: TODO

#### `private final Random rng = new SecureRandom()`

- Description: TODO

#### `private final byte[] key`

- Description: TODO

#### `private final InputStream in`

- Description: TODO

#### `private final OutputStream out`

- Description: TODO

#### `private byte[] nonce = null`

- Description: TODO

#### `private boolean auth = false`

- Description: TODO

### Methods

#### `public Object[] run(Client cl, Object... args) throws InterruptedException`

- Description: TODO

#### `private Client(InputStream in, OutputStream out, boolean auth)`

- Description: TODO

#### `private Client(Socket sk) throws IOException`

- Description: TODO

#### `byte[] read(InputStream in, int bytes) throws IOException`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public Server(int port, byte[] key) throws IOException`

- Description: TODO

#### `public Server()`

- Description: TODO

#### `public static void stdio()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
