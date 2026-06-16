# HelpWnd

This file documents the responsibilities and members of `HelpWnd`.

## Meta

- Source: [HelpWnd.java](../../../src/haven/HelpWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the help wnd Haven component.

## Members

### Constants

#### `public static final RichText.Foundry fnd = new RichText.Foundry().aa(true)`
- Role: Defines the shared fnd constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final RichTextBox text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

### Methods

#### `public HelpWnd(Indir<Resource> res)`
- Role: Creates a new HelpWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `public void set(Indir<Resource> res)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.
