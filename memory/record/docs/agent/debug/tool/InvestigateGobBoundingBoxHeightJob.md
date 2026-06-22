---
source: [InvestigateGobBoundingBoxHeightJob.java](../../../../../../src/agent/debug/tool/InvestigateGobBoundingBoxHeightJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# InvestigateGobBoundingBoxHeightJob

Investigates gob bounding-box height for debugging.

## Members

### Constants

### Fields

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Prints the gob bounding-box height investigation result.

#### `private void _carryHeight(Gob gob, Coord putPoint)`
- Role: Handles the carry height path.
- Description: Measures the height offset used while carrying a gob.

#### `public static String info()`
- Role: Handles the info path.
- Description: Exposes the help text for the bounding-box height investigation job.