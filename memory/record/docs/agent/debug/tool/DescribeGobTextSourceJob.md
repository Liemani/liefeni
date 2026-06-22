---
source: [DescribeGobTextSourceJob.java](../../../../../../src/agent/debug/tool/DescribeGobTextSourceJob.java)
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
- Description: Traces the text source attached to the selected gob.

#### `public static String info()`
- Role: Returns the job description.
- Description: Exposes the short help text shown in the menu and console.

#### `private static void _describeSpeaking(Gob gob)`
- Role: Prints the speech-related text source fields.
- Description: Reads the speaking component attached to the gob.

#### `private static void _describeAttributes(Gob gob)`
- Role: Prints the gob attribute sources.
- Description: Traverses the attached attributes for text-like data.

#### `private static void _describeOverlays(Gob gob)`
- Role: Prints the gob overlay sources.
- Description: Traverses overlays for text-like data.

#### `private static void _describeDrawable(Gob gob)`
- Role: Prints the drawable source fields.
- Description: Inspects the gob drawable for text-like data.

#### `private static String _readTextField(Speaking speaking)`
- Role: Reads one text field from the speaking component.
- Description: Extracts the string value if the field is present.

#### `private static void _describeTextCandidates(String label, Object object)`
- Role: Prints text-like candidates under one label.
- Description: Dumps the readable text values found under the object.

#### `private static void _collectTextCandidates(String path, Object object, int depth, int maxDepth, Set<Object> visited, Array<String> lines)`
- Role: Collects nested text-like values.
- Description: Walks the object graph and records candidate text fields.

#### `private static String _stringifyTextLike(Object object)`
- Role: Converts a text-like object into a printable string.
- Description: Normalizes strings, arrays, and nested values for display.