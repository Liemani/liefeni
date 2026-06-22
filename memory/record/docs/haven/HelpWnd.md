---
source: [HelpWnd.java](../../../../src/haven/HelpWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# HelpWnd

Represents the help wnd Haven component.

## Members

### Constants

#### `public static final RichText.Foundry fnd = new RichText.Foundry().aa(true)`
- Role: Implements the fnd operation.
- Description: Implements the aa operation.
- Value: `new RichText.Foundry().aa(true)`

### Fields

#### `private final RichTextBox text`
- Role: Caches the text value.
- Description: Caches the `text` value for reuse.

### Methods

#### `public HelpWnd(Indir<Resource> res)`
- Role: Creates a new HelpWnd instance.
- Description: Constructs the HelpWnd instance from the supplied inputs.

#### `public void set(Indir<Resource> res)`
- Role: Handles the set path.
- Description: Updates the cached set.