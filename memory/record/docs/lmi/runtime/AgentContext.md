---
source: [AgentContext.java](../../../../../src/lmi/runtime/AgentContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# AgentContext

Carries runtime context for an agent.

## Members

### Constants

### Fields

#### `private final Stack<Coord> moveHistory = new Stack<>()`
- Role: Implements the move history operation.
- Description: Implements the private final stack<coord> move history = new stack<>() operation.

### Methods

#### `public void pushBreadcrumb(Coord pos)`
- Role: Records a new movement breadcrumb.
- Description: Pushes the current position so the agent can backtrack later.

#### `public Coord popBreadcrumb()`
- Role: Restores the most recent movement breadcrumb.
- Description: Pops the last recorded position from the breadcrumb stack.

#### `public boolean hasBreadcrumbs()`
- Role: Checks whether the breadcrumbs.
- Description: Returns true when the breadcrumb stack is non-empty.