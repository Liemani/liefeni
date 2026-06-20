---
source: [DebugUtil.java](../../../../src/lmi/core/DebugUtil.java)
created: 2026-06-14
updated: 2026-06-14
---

# DebugUtil

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
