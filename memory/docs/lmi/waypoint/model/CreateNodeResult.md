# CreateNodeResult

This file documents the responsibilities and members of `CreateNodeResult`.

## Meta

- Source: [CreateNodeResult.java](../../../../../src/lmi/waypoint/model/CreateNodeResult.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Carries a typed result payload for waypoint work.

## Members

### Constants

### Fields

#### `public final boolean created`

- Description: TODO

#### `public final Long graphId`

- Description: TODO

#### `public final Long nodeId`

- Description: TODO

#### `public final String errorMessage`

- Description: TODO

### Methods

#### `private CreateNodeResult(boolean created, Long graphId, Long nodeId, String errorMessage)`

- Description: TODO

#### `public static CreateNodeResult created(long graphId, long nodeId)`

- Description: TODO

#### `public static CreateNodeResult failed(String errorMessage)`

- Description: TODO
