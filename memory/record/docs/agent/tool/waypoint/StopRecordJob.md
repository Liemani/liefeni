---
source: [StopRecordJob.java](../../../../../../src/agent/tool/waypoint/StopRecordJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# StopRecordJob

Implements a waypoint job for stop record job.

## Nested Types

### EndNodeHandler
- Role: Receives the resolved end node for a finished waypoint record.
- Description: Lets the job continue only after the end node already exists or has been created.

## Members

### Constants

### Fields

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private static void _ensureEndNodeAsync(EndNodeHandler handler)`
- Role: Handles the ensure end node async path.
- Description: Implements the ensure end node async operation.

#### `private static void _createEndNodeAsync(EndNodeHandler handler)`
- Role: Handles the create end node async path.
- Description: Implements the create end node async operation.

#### `private static String _inputEndNodeName()`
- Role: Handles the input end node name path.
- Description: Implements the input end node name operation.

#### `private static void _saveEdgeAsync(RecordingSession session, WpNode endNode)`
- Role: Handles the save edge async path.
- Description: Implements the save edge async operation.

#### `private static void _appendSavedEdge(SaveEdgeResult result)`
- Role: Handles the append saved edge path.
- Description: Implements the append saved edge operation.

#### `void onResolved(WpNode endNode)`
- Role: Handles the on resolved path.
- Description: Implements the on resolved operation.

#### `public static String info()`
- Role: Handles the info path.
- Description: Implements the info operation.