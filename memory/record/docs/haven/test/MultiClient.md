---
source: [MultiClient.java](../../../../../src/haven/test/MultiClient.java)
created: 2026-06-13
updated: 2026-06-14
---

# MultiClient

Provides a Haven test helper for multi client.

## Members

### Constants

### Fields

#### `public Collection<TestClient> clients = new HashSet<TestClient>()`
- Role: Implements the clients operation.
- Description: Implements the public collection<test client> clients = new hash set<test client>() operation.

#### `public int num, delay`
- Role: Caches the delay value.
- Description: Caches the `delay` value for reuse.

#### `public int num, delay`
- Role: Caches the delay value.
- Description: Caches the `delay` value for reuse.

#### `public int started`
- Role: Caches the started value.
- Description: Caches the `started` value for reuse.

### Methods

#### `public MultiClient(int num, int delay)`
- Role: Creates a new MultiClient instance.
- Description: Constructs the MultiClient instance from the supplied inputs.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void stopall()`
- Role: Handles the stopall path.
- Description: Implements the stopall operation.

#### `public static void usage()`
- Role: Handles the usage path.
- Description: Implements the usage operation.

#### `public static void main(String[] args)`
- Role: Handles the main path.
- Description: Runs the client entry point.