---
source: [StopRecordJob.java](../../../../../src/agent/tool/waypoint/StopRecordJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# StopRecordJob

Implements a waypoint job for stop record job.

## Nested Types

### EndNodeHandler
### EndNodeHandler
- Role: Represents the end node handler helper used by StopRecordJob.

- Role: Coordinates the asynchronous completion callbacks for the stop-record flow.
- Description: Describes the nested end node handler type used by the enclosing class.

## Members

### Constants

### Fields

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private static void _ensureEndNodeAsync(EndNodeHandler handler)`
- Role: Performs  ensure end node async.
- Description: Supports the ensure end node async operation used by the surrounding class.

#### `private static void _createEndNodeAsync(EndNodeHandler handler)`
- Role: Performs  create end node async.
- Description: Supports the create end node async operation used by the surrounding class.

#### `private static String _inputEndNodeName()`
- Role: Performs  input end node name.
- Description: Supports the input end node name operation used by the surrounding class.

#### `private static void _saveEdgeAsync(RecordingSession session, WpNode endNode)`
- Role: Performs  save edge async.
- Description: Supports the save edge async operation used by the surrounding class.

#### `private static void _appendSavedEdge(SaveEdgeResult result)`
- Role: Performs  append saved edge.
- Description: Supports the append saved edge operation used by the surrounding class.

#### `void onResolved(WpNode endNode)`
- Role: Performs on resolved.
- Description: Supports the on resolved operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.
