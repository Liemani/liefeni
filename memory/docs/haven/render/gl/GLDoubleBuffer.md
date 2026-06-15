# GLDoubleBuffer

This file documents the responsibilities and members of `GLDoubleBuffer`.

## Meta

- Source: [GLDoubleBuffer.java](../../../../../src/haven/render/gl/GLDoubleBuffer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a double-buffered GL resource.

## Nested Types

### Buffered

- Description: TODO

## Members

### Constants

### Fields

#### `private List<Buffered> changed = null`

- Description: TODO

#### `private int prevsz = 16`

- Description: TODO

#### `private BufferBGL cur, next`

- Description: TODO

#### `private BufferBGL cur, next`

- Description: TODO

### Methods

#### `public void run(GL gl)`

- Description: TODO

#### `public void abort()`

- Description: TODO

#### `public void update(BufferBGL gl)`

- Description: TODO

#### `public boolean get(long timeout) throws InterruptedException`

- Description: TODO

#### `public void put()`

- Description: TODO

#### `public void put(BGL gl)`

- Description: TODO
