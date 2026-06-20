---
source: [AtomicAction.java](../../../../src/lmi/core/AtomicAction.java)
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
- Description: Constructs the instance and initializes its default state.

#### `public static void interact(long gobId, Coord gobPosition)`
- Role: Performs interact.
- Description: Supports the interact operation used by the surrounding class.

#### `public static void enter(long doorId, Coord doorPosition, int meshId)`
- Role: Performs enter.
- Description: Supports the enter operation used by the surrounding class.

#### `public static void go(Coord coord)`
- Role: Performs go.
- Description: Supports the go operation used by the surrounding class.

#### `public static void forceGo(Coord coord)`
- Role: Performs force go.
- Description: Supports the force go operation used by the surrounding class.

#### `public static void lift(long gobId, Coord gobPosition)`
- Role: Performs lift.
- Description: Supports the lift operation used by the surrounding class.

#### `public static void forceLift(long gobId, Coord gobPosition)`
- Role: Performs force lift.
- Description: Supports the force lift operation used by the surrounding class.

#### `public static void put(Coord coord)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public static void forcePut(Coord coord)`
- Role: Performs force put.
- Description: Supports the force put operation used by the surrounding class.

#### `public static boolean go(Coord coord, boolean force, AgentContext ctx)`
- Role: Performs go.
- Description: Supports the go operation used by the surrounding class.

#### `public static boolean lift(long gobId, Coord gobPosition, AgentContext ctx)`
- Role: Performs lift.
- Description: Supports the lift operation used by the surrounding class.

#### `public static boolean put(Coord coord, AgentContext ctx)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `private static Gob _gob(long gobId)`
- Role: Performs  gob.
- Description: Supports the gob operation used by the surrounding class.
