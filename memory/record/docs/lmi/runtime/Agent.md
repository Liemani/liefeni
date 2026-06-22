---
source: [Agent.java](../../../../../src/lmi/runtime/Agent.java)
created: 2026-06-13
updated: 2026-06-14
---

# Agent

Represents an executable agent definition.

## Nested Types

### JobRequest
Carries one queued agent job request.

#### Members

##### Fields

#### `private final Job job`
- Role: Stores the requested job.
- Description: Executed by the agent thread.

#### `private final String[] args`
- Role: Stores the job arguments.
- Description: Cloned at construction time.

#### `private final AgentContext context`
- Role: Stores the request context.
- Description: Captured from the agent when the request is queued.

##### Methods

#### `private JobRequest(Job job, String[] args, AgentContext context)`
- Role: Builds a queued job request.
- Description: Clones the arguments and stores the current context.

## Members

### Constants

### Fields

#### `private static Agent instance`
- Role: Caches the instance value.
- Description: Caches the `instance` value for reuse.

#### `private final Deque<JobRequest> jobRequests = new ArrayDeque<>()`
- Role: Implements the job requests operation.
- Description: Implements the private final deque<job request> job requests = new array deque<>() operation.

#### `private final AgentConfig config = new AgentConfig()`
- Role: Implements the config operation.
- Description: Implements the agent config operation.

#### `private AgentContext context = null; // Optional tracking`
- Role: Caches the context value.
- Description: Caches the `context` value for reuse.

#### `private boolean sleeping = false`
- Role: Tracks the sleeping flag.
- Description: Marks whether the agent thread is intentionally paused.

#### `private final Job job`
- Role: Caches the job value.
- Description: Caches the `job` value for reuse.

#### `private final String[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

#### `private final AgentContext context`
- Role: Caches the context value.
- Description: Caches the `context` value for reuse.

### Methods

#### `private Agent()`
- Role: Creates a new Agent instance.
- Description: Constructs the Agent instance from the supplied inputs.

#### `public static synchronized Agent getInstance()`
- Role: Returns the instance.
- Description: Returns the instance.

#### `public void pushJob(Job job, String[] args)`
- Role: Pushes a job onto the front of the queue.
- Description: Reorders the queue so the new job runs before pending work.

#### `public void enqueueJob(Job job, String[] args)`
- Role: Appends a job to the end of the queue.
- Description: Schedules the job behind any already pending work.

#### `public void stopAll()`
- Role: Stops all queued and running jobs.
- Description: Clears the queue and interrupts the current agent thread.

#### `public void setSleep(boolean sleep)`
- Role: Sets the sleep.
- Description: Pauses or resumes the agent loop.

#### `public boolean isSleeping()`
- Role: Checks whether the sleeping.
- Description: Returns true when the agent loop is paused.

#### `public AgentConfig getConfig()`
- Role: Returns the config.
- Description: Returns the config.

#### `public void run()`
- Role: Runs the job.
- Description: Runs queued jobs on the agent thread.

#### `private void checkDrivesAndInterrupt()`
- Role: Handles the check drives and interrupt path.
- Description: Interrupts the loop when a disabled drive is detected.

#### `private JobRequest(Job job, String[] args, AgentContext context)`
- Role: Handles the job request path.
- Description: Implements the job request operation.