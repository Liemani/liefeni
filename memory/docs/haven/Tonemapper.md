# Tonemapper

This file documents the responsibilities and members of `Tonemapper`.

## Meta

- Source: [Tonemapper.java](../../../src/haven/Tonemapper.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the tonemapper Haven component.

## Members

### Constants

#### `public static final State justgamma = new RUtils.AdHoc(prog ->`
- Role: Defines the shared justgamma constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final State draw`
- Role: Holds the draw state.
- Description: Backs the cached state for this file.

### Methods

#### `public Tonemapper(State draw)`
- Role: Creates a new Tonemapper instance.
- Description: Constructs the instance and initializes its default state.

#### `public void run(GOut g, Texture2D.Sampler2D in)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public int order()`
- Role: Performs order.
- Description: Supports the order operation used by the surrounding class.

#### `public FrameFormat outformat(FrameFormat in)`
- Role: Performs outformat.
- Description: Supports the outformat operation used by the surrounding class.
