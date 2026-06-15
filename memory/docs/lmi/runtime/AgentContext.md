# AgentContext

This file documents the responsibilities and members of `AgentContext`.

## Meta

- Source: [AgentContext.java](../../../../src/lmi/runtime/AgentContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds runtime state for its corresponding subsystem.

## Members

### Constants

### Fields

#### `private final Stack<Coord> moveHistory = new Stack<>()`

- Description: TODO

### Methods

#### `public void pushBreadcrumb(Coord pos)`

- Description: TODO

#### `public Coord popBreadcrumb()`

- Description: TODO

#### `public boolean hasBreadcrumbs()`

- Description: TODO
