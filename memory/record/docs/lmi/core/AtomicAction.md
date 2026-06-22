---
source: [AtomicAction.java](../../../../../src/lmi/core/AtomicAction.java)
created: 2026-06-13
updated: 2026-06-14
---

# AtomicAction

Represents a single atomic LMI action.

## Members

### Constants

### Fields

### Methods

#### `private AtomicAction()`
- Role: Creates a new AtomicAction instance.
- Description: Constructs the AtomicAction instance from the supplied inputs.

#### `public static void interact(long gobId, Coord gobPosition)`
- Role: Sends a basic interaction to the target gob.
- Description: Resolves the gob and clicks it with the default interaction.

#### `public static void enter(long doorId, Coord doorPosition, int meshId)`
- Role: Enters a gob or portal target.
- Description: Uses the door id, position, and mesh id to drive entry.

#### `public static void go(Coord coord)`
- Role: Moves the character to the requested map coordinate.
- Description: Uses a normal movement click at the target position.

#### `public static void forceGo(Coord coord)`
- Role: Forces the character to move to the requested coordinate.
- Description: Uses the force-move path instead of the normal click flow.

#### `public static void lift(long gobId, Coord gobPosition)`
- Role: Starts lifting the target gob or item.
- Description: Resolves the source object and issues a lift action.

#### `public static void forceLift(long gobId, Coord gobPosition)`
- Role: Forces a lift action against the target gob or item.
- Description: Uses the direct force-interaction path for lifting.

#### `public static void put(Coord coord)`
- Role: Places the held item at the requested coordinate.
- Description: Sends a standard drop or placement click.

#### `public static void forcePut(Coord coord)`
- Role: Forces placement at the requested coordinate.
- Description: Uses the force-placement path instead of the normal flow.

#### `public static boolean go(Coord coord, boolean force, AgentContext ctx)`
- Role: Chooses between normal and forced movement.
- Description: Dispatches the movement request through the active agent context.

#### `public static boolean lift(long gobId, Coord gobPosition, AgentContext ctx)`
- Role: Chooses whether to lift a target through the agent context.
- Description: Dispatches a lift request through the active agent context.

#### `public static boolean put(Coord coord, AgentContext ctx)`
- Role: Chooses whether to place through the agent context.
- Description: Dispatches a placement request through the active agent context.

#### `private static Gob _gob(long gobId)`
- Role: Resolves the gob before action dispatch.
- Description: Looks up the gob object that owns the requested id.