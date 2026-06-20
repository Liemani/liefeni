---
source: [Loading.java](../../../src/haven/Loading.java)
created: 2026-06-13
updated: 2026-06-14
---

# Loading

Represents the loading Haven component.

## Nested Types

### UnwaitableEvent

- Role: Represents unwaitable event within Loading.
- Description: Describes the nested unwaitable event type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Loading rec`
- Role: Holds the rec state.
- Description: Backs the cached state for this file.

#### `public final Loading event`
- Role: Holds the event state.
- Description: Backs the cached state for this file.

### Methods

#### `public Loading()`
- Role: Creates a new Loading instance.
- Description: Constructs the instance and initializes its default state.

#### `public Loading(String msg)`
- Role: Creates a new Loading instance.
- Description: Constructs the instance and initializes its default state.

#### `public Loading(Throwable cause)`
- Role: Creates a new Loading instance.
- Description: Constructs the instance and initializes its default state.

#### `public Loading(String msg, Throwable cause)`
- Role: Creates a new Loading instance.
- Description: Constructs the instance and initializes its default state.

#### `public Loading(Loading rec)`
- Role: Creates a new Loading instance.
- Description: Constructs the instance and initializes its default state.

#### `public Loading(String msg, Loading rec)`
- Role: Creates a new Loading instance.
- Description: Constructs the instance and initializes its default state.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public UnwaitableEvent(String message, Loading event)`
- Role: Performs unwaitable event.
- Description: Supports the unwaitable event operation used by the surrounding class.

#### `public UnwaitableEvent(Loading event)`
- Role: Performs unwaitable event.
- Description: Supports the unwaitable event operation used by the surrounding class.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public boolean boostprio(int prio)`
- Role: Performs boostprio.
- Description: Supports the boostprio operation used by the surrounding class.

#### `private void queuewait() throws InterruptedException`
- Role: Handles the queuewait workflow.
- Description: Supports the queuewait operation used by the surrounding class.

#### `public void waitfor() throws InterruptedException`
- Role: Handles the waitfor workflow.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public static <T> T waitforint(Indir<T> x) throws InterruptedException`
- Role: Handles the waitforint workflow.
- Description: Supports the waitforint operation used by the surrounding class.

#### `public static <T> T waitfor(Indir<T> x)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public static <T> T or(Supplier<T> x, T def)`
- Role: Performs or.
- Description: Supports the or operation used by the surrounding class.

#### `public static <T> T or(Supplier<T> x, Supplier<T> def)`
- Role: Performs or.
- Description: Supports the or operation used by the surrounding class.
