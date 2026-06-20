---
source: [GAttrib.java](../../../src/haven/GAttrib.java)
created: 2026-06-13
updated: 2026-06-14
---

# GAttrib

Represents the gattrib Haven component.

## Nested Types

### Parser

- Role: Represents parser within GAttrib.
- Description: Describes the nested parser type used by the enclosing class.

### ParserMaker

- Role: Represents parser maker within GAttrib.
- Description: Describes the nested parser maker type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Gob gob`
- Role: Stores the gob value.
- Description: Backs the cached state for this file.

#### `Collection<RenderTree.Slot> slots`
- Role: Caches slots entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public GAttrib(Gob gob)`
- Role: Creates a new GAttrib instance.
- Description: Constructs the instance and initializes its default state.

#### `public void ctick(double dt)`
- Role: Performs ctick.
- Description: Supports the ctick operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.

#### `public Parser make(Class<?> cl, Resource ires, Object... argv)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public void apply(Gob gob, Message sdt)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
