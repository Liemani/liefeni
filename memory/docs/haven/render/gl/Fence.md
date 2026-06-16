# Fence

This file documents the responsibilities and members of `Fence`.

## Meta

- Source: [Fence.java](../../../../../src/haven/render/gl/Fence.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for fence.

## Members

### Constants

### Fields

#### `private int state`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

### Methods

#### `public Fence()`
- Role: Creates a new Fence instance.
- Description: Constructs the instance and initializes its default state.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void abort()`
- Role: Performs abort.
- Description: Supports the abort operation used by the surrounding class.

#### `public boolean waitfor() throws InterruptedException`
- Role: Handles the waitfor workflow.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public static Fence make(BGL gl)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.
