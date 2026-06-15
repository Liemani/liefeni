# ChatInputMonitor

This file documents the responsibilities and members of `ChatInputMonitor`.

## Meta

- Source: [ChatInputMonitor.java](../../../../src/lmi/runtime/ChatInputMonitor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Observes a narrow slice of runtime state for automation.

## Members

### Constants

#### `private static final Object lock = new Object()`

- Description: TODO

### Fields

#### `private static boolean waitingAreaChat = false`

- Description: TODO

#### `private static String capturedAreaChat = null`

- Description: TODO

### Methods

#### `private ChatInputMonitor()`

- Description: TODO

#### `public static void clear()`

- Description: TODO

#### `public static String waitAreaChat()`

- Description: TODO

#### `public static void capture(Widget sender, String msg, Object... args)`

- Description: TODO
