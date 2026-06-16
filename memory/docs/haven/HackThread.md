# HackThread

This file documents the responsibilities and members of `HackThread`.

## Meta

- Source: [HackThread.java](../../../src/haven/HackThread.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the hack thread Haven component.

## Members

### Constants

### Fields

#### `private Set<Runnable> ils = new HashSet<Runnable>()`
- Role: Caches ils entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public HackThread(ThreadGroup tg, Runnable target, String name)`
- Role: Creates a new HackThread instance.
- Description: Constructs the instance and initializes its default state.

#### `public HackThread(Runnable target, String name)`
- Role: Creates a new HackThread instance.
- Description: Constructs the instance and initializes its default state.

#### `public HackThread(String name)`
- Role: Creates a new HackThread instance.
- Description: Constructs the instance and initializes its default state.

#### `public static ThreadGroup tg()`
- Role: Performs tg.
- Description: Supports the tg operation used by the surrounding class.

#### `public void addil(Runnable r)`
- Role: Performs addil.
- Description: Supports the addil operation used by the surrounding class.

#### `public void remil(Runnable r)`
- Role: Performs remil.
- Description: Supports the remil operation used by the surrounding class.

#### `public void interrupt()`
- Role: Performs interrupt.
- Description: Supports the interrupt operation used by the surrounding class.
