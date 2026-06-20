---
source: [Patrol001Job.java](../../../../src/agent/test/Patrol001Job.java)
created: 2026-06-13
updated: 2026-06-14
---

# Patrol001Job

Implements a test job for patrol001 job.

## Members

### Constants

### Fields

#### `private Array<haven.Coord> _path = new Array<>()`
- Role: Caches path entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.
