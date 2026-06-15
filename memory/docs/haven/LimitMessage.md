# LimitMessage

This file documents the responsibilities and members of `LimitMessage`.

## Meta

- Source: [LimitMessage.java](../../../src/haven/LimitMessage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a rate-limited or bounded message.

## Members

### Constants

### Fields

#### `private final Message bk`

- Description: TODO

#### `private int left`

- Description: TODO

#### `private final boolean eoferror`

- Description: TODO

### Methods

#### `public LimitMessage(Message bk, int left, boolean eoferror)`

- Description: TODO

#### `public LimitMessage(Message bk, int left)`

- Description: TODO

#### `public boolean underflow(int hint)`

- Description: TODO

#### `public void overflow(int min)`

- Description: TODO

#### `public String toString()`

- Description: TODO
