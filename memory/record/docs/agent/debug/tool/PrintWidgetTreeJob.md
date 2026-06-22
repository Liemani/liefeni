---
source: [PrintWidgetTreeJob.java](../../../../../../src/agent/debug/tool/PrintWidgetTreeJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# PrintWidgetTreeJob

Prints the current widget tree.

## Members

### Constants

### Fields

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Prints the current widget tree from the root widget downward.

#### `private void iterateWidget(haven.Widget widget, int indentCount)`
- Role: Handles the iterate widget path.
- Description: Recursively prints the widget hierarchy with indentation.

#### `public static String info()`
- Role: Returns the job description.
- Description: Exposes the short help text shown in the menu and console.