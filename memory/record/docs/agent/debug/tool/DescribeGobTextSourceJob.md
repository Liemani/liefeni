---
source: [DescribeGobTextSourceJob.java](../../../../../src/agent/debug/tool/DescribeGobTextSourceJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# DescribeGobTextSourceJob

Inspects the text source attached to a gob.

## Members

### Constants

### Fields

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `private static void _describeSpeaking(Gob gob)`
- Role: Performs  describe speaking.
- Description: Supports the describe speaking operation used by the surrounding class.

#### `private static void _describeAttributes(Gob gob)`
- Role: Performs  describe attributes.
- Description: Supports the describe attributes operation used by the surrounding class.

#### `private static void _describeOverlays(Gob gob)`
- Role: Performs  describe overlays.
- Description: Supports the describe overlays operation used by the surrounding class.

#### `private static void _describeDrawable(Gob gob)`
- Role: Performs  describe drawable.
- Description: Supports the describe drawable operation used by the surrounding class.

#### `private static String _readTextField(Speaking speaking)`
- Role: Performs  read text field.
- Description: Supports the read text field operation used by the surrounding class.

#### `private static void _describeTextCandidates(String label, Object object)`
- Role: Performs  describe text candidates.
- Description: Supports the describe text candidates operation used by the surrounding class.

#### `private static void _collectTextCandidates(String path, Object object, int depth, int maxDepth, Set<Object> visited, Array<String> lines)`
- Role: Performs  collect text candidates.
- Description: Supports the collect text candidates operation used by the surrounding class.

#### `private static String _stringifyTextLike(Object object)`
- Role: Performs  stringify text like.
- Description: Supports the stringify text like operation used by the surrounding class.
