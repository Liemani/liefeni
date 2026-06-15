# Agent

This file documents the responsibilities and members of `Agent`.

## Meta

- Source: [Agent.java](../../../../src/lmi/runtime/Agent.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the automation worker and its job execution loop.

## Nested Types

### JobRequest

- Description: TODO

## Members

### Constants

### Fields

#### `private static Agent instance`

- Description: TODO

#### `private final Deque<JobRequest> jobRequests = new ArrayDeque<>()`

- Description: TODO

#### `private final AgentConfig config = new AgentConfig()`

- Description: TODO

#### `private AgentContext context = null; // Optional tracking`

- Description: TODO

#### `private boolean sleeping = false`

- Description: TODO

#### `private final Job job`

- Description: TODO

#### `private final String[] args`

- Description: TODO

#### `private final AgentContext context`

- Description: TODO

### Methods

#### `private Agent()`

- Description: TODO

#### `public static synchronized Agent getInstance()`

- Description: TODO

#### `public void pushJob(Job job, String[] args)`

- Description: TODO

#### `public void enqueueJob(Job job, String[] args)`

- Description: TODO

#### `public void stopAll()`

- Description: TODO

#### `public void setSleep(boolean sleep)`

- Description: TODO

#### `public boolean isSleeping()`

- Description: TODO

#### `public AgentConfig getConfig()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `private void checkDrivesAndInterrupt()`

- Description: TODO

#### `private JobRequest(Job job, String[] args, AgentContext context)`

- Description: TODO
