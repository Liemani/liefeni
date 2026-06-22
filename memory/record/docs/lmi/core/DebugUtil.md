---
source: [DebugUtil.java](../../../../../src/lmi/core/DebugUtil.java)
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
- Description: Constructs the DebugUtil instance from the supplied inputs.

#### `public static void debugPrintObjectFields(Object object)`
- Role: Logs the print object fields.
- Description: Logs the print object fields for diagnostics and debugging.

#### `private static void _debugPrintObjectFields(Object object, Class<?> classObject, int depth, Set<Object> visited)`
- Role: Recursively prints the fields of a reflected object.
- Description: Traverses nested fields while avoiding cycles.

#### `private static String _formatValue(Field field, Object value)`
- Role: Formats a reflected field value for debug output.
- Description: Normalizes arrays, primitives, and nested objects for printing.