# StopRecordJob

This file documents the responsibilities and members of `StopRecordJob`.

## Meta

- Source: [StopRecordJob.java](../../../../../src/agent/tool/waypoint/StopRecordJob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a waypoint tool job entry point.

## Nested Types

### EndNodeHandler

- Description: TODO

## Members

### Constants

### Fields

### Methods

#### `public void run(AgentContext ctx, String[] args)`

- Description: TODO

#### `private static void _ensureEndNodeAsync(EndNodeHandler handler)`

- Description: TODO

#### `private static void _createEndNodeAsync(EndNodeHandler handler)`

- Description: TODO

#### `private static String _inputEndNodeName()`

- Description: TODO

#### `private static void _saveEdgeAsync(RecordingSession session, WpNode endNode)`

- Description: TODO

#### `private static void _appendSavedEdge(SaveEdgeResult result)`

- Description: TODO

#### `void onResolved(WpNode endNode)`

- Description: TODO

#### `public static String info()`

- Description: TODO
