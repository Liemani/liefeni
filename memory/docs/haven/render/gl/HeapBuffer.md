# HeapBuffer

This file documents the responsibilities and members of `HeapBuffer`.

## Meta

- Source: [HeapBuffer.java](../../../../../src/haven/render/gl/HeapBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for heap buffer.

## Members

### Constants

### Fields

#### `public SysBuffer mem`
- Role: Stores the mem value.
- Description: Backs the cached state for this file.

### Methods

#### `public <T extends DataBuffer> HeapBuffer(GLEnvironment env, T obj, DataBuffer.Filler<? super T> init)`
- Role: Creates a new HeapBuffer instance.
- Description: Constructs the instance and initializes its default state.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
