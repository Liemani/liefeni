---
source: [RecordJob.java](../../../../../src/agent/tool/waypoint/RecordJob.java)
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
- Description: Supports the run operation used by the surrounding class.

#### `private static boolean _ensureGraphSelected()`
- Role: Performs  ensure graph selected.
- Description: Supports the ensure graph selected operation used by the surrounding class.

#### `private static ResolvedNode _selectStartNode()`
- Role: Performs  select start node.
- Description: Supports the select start node operation used by the surrounding class.

#### `private static void _moveToStartNode(ResolvedNode startNode)`
- Role: Performs  move to start node.
- Description: Supports the move to start node operation used by the surrounding class.

#### `private static RecordingSession _startRecording(ResolvedNode startNode)`
- Role: Performs  start recording.
- Description: Supports the start recording operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.
