# ProxyPipe

This file documents the responsibilities and members of `ProxyPipe`.

## Meta

- Source: [ProxyPipe.java](../../../../src/haven/render/ProxyPipe.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the proxy pipe render pipeline component.

## Members

### Constants

### Fields

#### `private Pipe bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

### Methods

#### `public ProxyPipe(Pipe bk)`
- Role: Creates a new ProxyPipe instance.
- Description: Constructs the instance and initializes its default state.

#### `public ProxyPipe()`
- Role: Creates a new ProxyPipe instance.
- Description: Constructs the instance and initializes its default state.

#### `public <T extends State> T get(Slot<T> slot)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public State[] states()`
- Role: Performs states.
- Description: Supports the states operation used by the surrounding class.

#### `public Pipe copy()`
- Role: Performs copy.
- Description: Supports the copy operation used by the surrounding class.

#### `public Pipe update(Pipe np)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public int[] dupdate(Pipe np)`
- Role: Performs dupdate.
- Description: Supports the dupdate operation used by the surrounding class.
