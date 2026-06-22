---
source: [CreateNodeResult.java](../../../../../../src/lmi/waypoint/model/CreateNodeResult.java)
created: 2026-06-13
updated: 2026-06-14
---

# CreateNodeResult

Represents the result of create node result.

## Members

### Constants

### Fields

#### `public final boolean created`
- Role: Tracks the created flag.
- Description: Marks whether the node creation succeeded.

#### `public final Long graphId`
- Role: Caches the graph id value.
- Description: Caches the `graphId` value for reuse.

#### `public final Long nodeId`
- Role: Caches the node id value.
- Description: Caches the `nodeId` value for reuse.

#### `public final String errorMessage`
- Role: Caches the error message value.
- Description: Caches the `errorMessage` value for reuse.

### Methods

#### `private CreateNodeResult(boolean created, Long graphId, Long nodeId, String errorMessage)`
- Role: Creates a new CreateNodeResult instance.
- Description: Constructs the CreateNodeResult instance from the supplied inputs.

#### `public static CreateNodeResult created(long graphId, long nodeId)`
- Role: Builds a successful node-creation result.
- Description: Returns the graph and node ids for the new node.

#### `public static CreateNodeResult failed(String errorMessage)`
- Role: Builds a failed node-creation result.
- Description: Returns the failure reason without graph or node ids.