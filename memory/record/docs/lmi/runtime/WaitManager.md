---
source: [WaitManager.java](../../../../../src/lmi/runtime/WaitManager.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaitManager

Coordinates deferred waits across the runtime.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Implements the lock operation.
- Description: Implements the object operation.

### Fields

#### `private static volatile int _lastSentSeq = -1`
- Role: Caches the last sent seq value.
- Description: Caches the `_lastSentSeq` value for reuse.

#### `private static volatile int _lastAckedSeq = -1`
- Role: Caches the last acked seq value.
- Description: Caches the `_lastAckedSeq` value for reuse.

### Methods

#### `public static void init()`
- Role: Prepares the wait-state tracking variables.
- Description: Resets sequence tracking before runtime messaging begins.

#### `private static boolean isAcked(int seq)`
- Role: Checks whether the acked.
- Description: Compares the requested sequence against the latest ACK.

#### `public static void updateSentSeq(int seq)`
- Role: Updates the sent seq.
- Description: Updates the sent seq.

#### `public static void waitACK()`
- Role: Blocks until the latest message is ACKed.
- Description: Polls the ACK sequence until Haven confirms the message.

#### `public static void waitResponse()`
- Role: Blocks until Haven responds to the latest request.
- Description: Waits for the ACK or a follow-up runtime event.

#### `public static void updateAckedSeq(int seq)`
- Role: Updates the acked seq.
- Description: Updates the acked seq.

#### `public static void sleepPolling()`
- Role: Sleeps briefly while polling runtime state.
- Description: Keeps the wait loop responsive without busy spinning.

#### `public static void sleep(long timeout)`
- Role: Sleeps for the requested timeout.
- Description: Wraps the runtime wait helper with timeout handling.