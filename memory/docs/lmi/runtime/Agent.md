# Agent

This file documents the responsibilities and members of `Agent`.

## Meta

- Source: [Agent.java](../../../../src/lmi/runtime/Agent.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an executable agent definition.

## Nested Types

### JobRequest
### JobRequest
- Role: Represents the job request helper used by Agent.

- Role: Carries one queued agent job request.
- Description: Describes the nested job request type used by the enclosing class.

## Members

### Constants

### Fields

#### `private static Agent instance`
- Role: Holds the instance state.
- Description: Backs the cached state for this file.

#### `private final Deque<JobRequest> jobRequests = new ArrayDeque<>()`
- Role: Caches job requests entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final AgentConfig config = new AgentConfig()`
- Role: Holds the config state.
- Description: Backs the cached state for this file.

#### `private AgentContext context = null; // Optional tracking`
- Role: Stores the context value.
- Description: Backs the cached state for this file.

#### `private boolean sleeping = false`
- Role: Tracks the sleeping flag.
- Description: Supports the sleeping operation used by the surrounding class.

#### `private final Job job`
- Role: Holds the job state.
- Description: Backs the cached state for this file.

#### `private final String[] args`
- Role: Stores the args value.
- Description: Backs the cached state for this file.

#### `private final AgentContext context`
- Role: Stores the context value.
- Description: Backs the cached state for this file.

### Methods

#### `private Agent()`
- Role: Creates a new Agent instance.
- Description: Constructs the instance and initializes its default state.

#### `public static synchronized Agent getInstance()`
- Role: Returns the instance.
- Description: Exposes the requested value without mutating state.

#### `public void pushJob(Job job, String[] args)`
- Role: Performs push job.
- Description: Supports the push job operation used by the surrounding class.

#### `public void enqueueJob(Job job, String[] args)`
- Role: Performs enqueue job.
- Description: Supports the enqueue job operation used by the surrounding class.

#### `public void stopAll()`
- Role: Performs stop all.
- Description: Supports the stop all operation used by the surrounding class.

#### `public void setSleep(boolean sleep)`
- Role: Sets the sleep.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public boolean isSleeping()`
- Role: Checks whether the sleeping.
- Description: Returns a boolean result for the described condition.

#### `public AgentConfig getConfig()`
- Role: Returns the config.
- Description: Exposes the requested value without mutating state.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void checkDrivesAndInterrupt()`
- Role: Performs check drives and interrupt.
- Description: Supports the check drives and interrupt operation used by the surrounding class.

#### `private JobRequest(Job job, String[] args, AgentContext context)`
- Role: Performs job request.
- Description: Supports the job request operation used by the surrounding class.
