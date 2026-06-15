# DescribeGobTextSourceJob

This file documents the responsibilities and members of `DescribeGobTextSourceJob`.

## Meta

- Source: [DescribeGobTextSourceJob.java](../../../../../src/agent/debug/tool/DescribeGobTextSourceJob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a debug job for inspecting or measuring runtime state.

## Members

### Constants

### Fields

### Methods

#### `public void run(AgentContext ctx, String[] args)`

- Description: TODO

#### `public static String info()`

- Description: TODO

#### `private static void _describeSpeaking(Gob gob)`

- Description: TODO

#### `private static void _describeAttributes(Gob gob)`

- Description: TODO

#### `private static void _describeOverlays(Gob gob)`

- Description: TODO

#### `private static void _describeDrawable(Gob gob)`

- Description: TODO

#### `private static String _readTextField(Speaking speaking)`

- Description: TODO

#### `private static void _describeTextCandidates(String label, Object object)`

- Description: TODO

#### `private static void _collectTextCandidates(String path, Object object, int depth, int maxDepth, Set<Object> visited, Array<String> lines)`

- Description: TODO

#### `private static String _stringifyTextLike(Object object)`

- Description: TODO
