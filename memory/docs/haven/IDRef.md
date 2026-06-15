# IDRef

This file documents the responsibilities and members of `IDRef`.

## Meta

- Source: [IDRef.java](../../../src/haven/IDRef.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an identifier reference.

## Nested Types

### WRef

- Description: TODO

## Members

### Constants

### Fields

#### `private static Map<Object, WRef> map = new HashMap<Object, WRef>()`

- Description: TODO

#### `private static ReferenceQueue<IDRef> queue = new ReferenceQueue<IDRef>()`

- Description: TODO

#### `private static int nextseq = 0`

- Description: TODO

#### `private final Object val`

- Description: TODO

#### `private final int seq`

- Description: TODO

#### `private final Object val`

- Description: TODO

### Methods

#### `private IDRef(Object val)`

- Description: TODO

#### `private WRef(IDRef ref, Object val)`

- Description: TODO

#### `public static IDRef intern(Object x)`

- Description: TODO

#### `public String toString()`

- Description: TODO
