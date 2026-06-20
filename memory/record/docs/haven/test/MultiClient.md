---
source: [MultiClient.java](../../../../src/haven/test/MultiClient.java)
created: 2026-06-13
updated: 2026-06-14
---

# MultiClient

Provides a Haven test helper for multi client.

## Members

### Constants

### Fields

#### `public Collection<TestClient> clients = new HashSet<TestClient>()`
- Role: Caches clients entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int num, delay`
- Role: Stores the delay value.
- Description: Backs the cached state for this file.

#### `public int num, delay`
- Role: Stores the delay value.
- Description: Backs the cached state for this file.

#### `public int started`
- Role: Stores the started value.
- Description: Backs the cached state for this file.

### Methods

#### `public MultiClient(int num, int delay)`
- Role: Creates a new MultiClient instance.
- Description: Constructs the instance and initializes its default state.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void stopall()`
- Role: Performs stopall.
- Description: Supports the stopall operation used by the surrounding class.

#### `public static void usage()`
- Role: Performs usage.
- Description: Supports the usage operation used by the surrounding class.

#### `public static void main(String[] args)`
- Role: Performs main.
- Description: Supports the main operation used by the surrounding class.
