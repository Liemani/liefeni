# AgentContext

This file documents the responsibilities and members of `AgentContext`.

## Meta

- Source: [AgentContext.java](../../../../src/lmi/runtime/AgentContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Carries runtime context for an agent.

## Members

### Constants

### Fields

#### `private final Stack<Coord> moveHistory = new Stack<>()`
- Role: Stores the move history value.
- Description: Backs the cached state for this file.

### Methods

#### `public void pushBreadcrumb(Coord pos)`
- Role: Performs push breadcrumb.
- Description: Supports the push breadcrumb operation used by the surrounding class.

#### `public Coord popBreadcrumb()`
- Role: Performs pop breadcrumb.
- Description: Supports the pop breadcrumb operation used by the surrounding class.

#### `public boolean hasBreadcrumbs()`
- Role: Checks whether the breadcrumbs.
- Description: Returns a boolean result for the described condition.
