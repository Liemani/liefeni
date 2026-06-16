# PatrolJob

This file documents the responsibilities and members of `PatrolJob`.

## Meta

- Source: [PatrolJob.java](../../../../src/agent/test/PatrolJob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Implements a test job for patrol job.

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
