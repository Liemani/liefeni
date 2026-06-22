---
source: [RecordJob.java](../../../../../../src/agent/tool/waypoint/RecordJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# RecordJob

Implements a waypoint job for record job.

## Members

### Constants

### Fields

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private static boolean _ensureGraphSelected()`
- Role: Handles the ensure graph selected path.
- Description: Implements the ensure graph selected operation.

#### `private static ResolvedNode _selectStartNode()`
- Role: Handles the select start node path.
- Description: Implements the select start node operation.

#### `private static void _moveToStartNode(ResolvedNode startNode)`
- Role: Handles the move to start node path.
- Description: Implements the move to start node operation.

#### `private static RecordingSession _startRecording(ResolvedNode startNode)`
- Role: Handles the start recording path.
- Description: Implements the start recording operation.

#### `public static String info()`
- Role: Handles the info path.
- Description: Implements the info operation.