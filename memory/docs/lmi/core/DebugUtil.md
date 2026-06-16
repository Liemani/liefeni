# DebugUtil

This file documents the responsibilities and members of `DebugUtil`.

## Meta

- Source: [DebugUtil.java](../../../../src/lmi/core/DebugUtil.java)
- Created: `2026-06-14`
- Updated: `2026-06-14`

## Role

Provides debug-print helpers for inspecting runtime state.

## Members

### Constants

### Fields

### Methods

#### `private DebugUtil()`
- Role: Creates a new DebugUtil instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void debugPrintObjectFields(Object object)`
- Role: Logs the print object fields.
- Description: Logs the print object fields for diagnostics and debugging.

#### `private static void _debugPrintObjectFields(Object object, Class<?> classObject, int depth, Set<Object> visited)`
- Role: Performs  debug print object fields.
- Description: Supports the debug print object fields operation used by the surrounding class.

#### `private static String _formatValue(Field field, Object value)`
- Role: Performs  format value.
- Description: Supports the format value operation used by the surrounding class.
