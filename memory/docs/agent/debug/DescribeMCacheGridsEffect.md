# DescribeMCacheGridsEffect

This file documents the responsibilities and members of `DescribeMCacheGridsEffect`.

## Meta

- Source: [DescribeMCacheGridsEffect.java](../../../../src/agent/debug/DescribeMCacheGridsEffect.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Prints map cache grid state for debugging.

## Members

### Constants

### Fields

### Methods

#### `public void execute()`
- Role: Executes the operation.
- Description: Supports the execute operation used by the surrounding class.

#### `public static String name()`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `private static Map<Coord, ?> _mapField(MCache map, String fieldName)`
- Role: Reads a reflected map field from the target object.
- Description: Supports the map field operation used by the surrounding class.
