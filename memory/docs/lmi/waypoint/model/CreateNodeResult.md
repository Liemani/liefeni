# CreateNodeResult

This file documents the responsibilities and members of `CreateNodeResult`.

## Meta

- Source: [CreateNodeResult.java](../../../../../src/lmi/waypoint/model/CreateNodeResult.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the result of create node result.

## Members

### Constants

### Fields

#### `public final boolean created`
- Role: Tracks the created flag.
- Description: Supports the created operation used by the surrounding class.

#### `public final Long graphId`
- Role: Stores the graph id value.
- Description: Backs the cached state for this file.

#### `public final Long nodeId`
- Role: Stores the node id value.
- Description: Backs the cached state for this file.

#### `public final String errorMessage`
- Role: Stores the error message value.
- Description: Backs the cached state for this file.

### Methods

#### `private CreateNodeResult(boolean created, Long graphId, Long nodeId, String errorMessage)`
- Role: Creates a new CreateNodeResult instance.
- Description: Constructs the instance and initializes its default state.

#### `public static CreateNodeResult created(long graphId, long nodeId)`
- Role: Performs created.
- Description: Supports the created operation used by the surrounding class.

#### `public static CreateNodeResult failed(String errorMessage)`
- Role: Performs failed.
- Description: Supports the failed operation used by the surrounding class.
