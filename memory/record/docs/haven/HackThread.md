---
source: [HackThread.java](../../../../src/haven/HackThread.java)
created: 2026-06-13
updated: 2026-06-14
---

# HackThread

Thread wrapper that preserves Haven thread-group behavior and interruption hooks.

## Members

### Constants

### Fields

#### `private Set<Runnable> ils = new HashSet<Runnable>()`
- Role: Stores interrupt listeners.
- Description: Holds callbacks that should run when the thread is interrupted.

### Methods

#### `public HackThread(ThreadGroup tg, Runnable target, String name)`
- Role: Creates a wrapped thread.
- Description: Forces the thread into the current Haven thread group when needed.

#### `public HackThread(Runnable target, String name)`
- Role: Creates a wrapped thread.
- Description: Convenience constructor using the current Haven thread group.

#### `public HackThread(String name)`
- Role: Creates a named wrapped thread.
- Description: Convenience constructor without an explicit runnable target.

#### `public static ThreadGroup tg()`
- Role: Returns the active thread group.
- Description: Uses the current thread's group as the Haven group anchor.

#### `public void addil(Runnable r)`
- Role: Registers an interrupt listener.
- Description: Adds a callback that runs when this thread is interrupted.

#### `public void remil(Runnable r)`
- Role: Removes an interrupt listener.
- Description: Unregisters a previously added interruption callback.

#### `public void interrupt()`
- Role: Interrupts the thread.
- Description: Runs the base interrupt logic and then invokes every registered listener.