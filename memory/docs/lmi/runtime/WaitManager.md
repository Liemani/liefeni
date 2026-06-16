# WaitManager

This file documents the responsibilities and members of `WaitManager`.

## Meta

- Source: [WaitManager.java](../../../../src/lmi/runtime/WaitManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates deferred waits across the runtime.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Defines the shared lock constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static volatile int _lastSentSeq = -1`
- Role: Stores the last sent seq value.
- Description: Backs the cached state for this file.

#### `private static volatile int _lastAckedSeq = -1`
- Role: Stores the last acked seq value.
- Description: Backs the cached state for this file.

### Methods

#### `public static void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `private static boolean isAcked(int seq)`
- Role: Checks whether the acked.
- Description: Returns a boolean result for the described condition.

#### `public static void updateSentSeq(int seq)`
- Role: Updates the sent seq.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void waitACK()`
- Role: Performs wait ack.
- Description: Supports the wait ack operation used by the surrounding class.

#### `public static void waitResponse()`
- Role: Performs wait response.
- Description: Supports the wait response operation used by the surrounding class.

#### `public static void updateAckedSeq(int seq)`
- Role: Updates the acked seq.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void sleepPolling()`
- Role: Performs sleep polling.
- Description: Supports the sleep polling operation used by the surrounding class.

#### `public static void sleep(long timeout)`
- Role: Performs sleep.
- Description: Supports the sleep operation used by the surrounding class.
