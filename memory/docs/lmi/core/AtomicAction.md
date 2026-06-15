# AtomicAction

This file documents the responsibilities and members of `AtomicAction`.

## Meta

- Source: [AtomicAction.java](../../../../src/lmi/core/AtomicAction.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Encapsulates a short, indivisible action.

## Members

### Constants

### Fields

### Methods

#### `private AtomicAction()`

- Description: TODO

#### `public static void interact(long gobId, Coord gobPosition)`

- Description: TODO

#### `public static void enter(long doorId, Coord doorPosition, int meshId)`

- Description: TODO

#### `public static void go(Coord coord)`

- Description: TODO

#### `public static void forceGo(Coord coord)`

- Description: TODO

#### `public static void lift(long gobId, Coord gobPosition)`

- Description: TODO

#### `public static void forceLift(long gobId, Coord gobPosition)`

- Description: TODO

#### `public static void put(Coord coord)`

- Description: TODO

#### `public static void forcePut(Coord coord)`

- Description: TODO

#### `public static boolean go(Coord coord, boolean force, AgentContext ctx)`

- Description: TODO

#### `public static boolean lift(long gobId, Coord gobPosition, AgentContext ctx)`

- Description: TODO

#### `public static boolean put(Coord coord, AgentContext ctx)`

- Description: TODO

#### `private static Gob _gob(long gobId)`

- Description: TODO
