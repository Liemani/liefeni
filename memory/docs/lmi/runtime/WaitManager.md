# WaitManager

This file documents the responsibilities and members of `WaitManager`.

## Meta

- Source: [WaitManager.java](../../../../src/lmi/runtime/WaitManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates subsystem state and routes work through the appropriate boundary.

## Members

### Constants

#### `private static final Object lock = new Object()`

- Description: TODO

### Fields

#### `private static volatile int _lastSentSeq = -1`

- Description: TODO

#### `private static volatile int _lastAckedSeq = -1`

- Description: TODO

### Methods

#### `public static void init()`

- Description: TODO

#### `private static boolean isAcked(int seq)`

- Description: TODO

#### `public static void updateSentSeq(int seq)`

- Description: TODO

#### `public static void waitACK()`

- Description: TODO

#### `public static void waitResponse()`

- Description: TODO

#### `public static void updateAckedSeq(int seq)`

- Description: TODO

#### `public static void sleepPolling()`

- Description: TODO

#### `public static void sleep(long timeout)`

- Description: TODO
