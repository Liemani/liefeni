---
source: [GAttrib.java](../../../../src/haven/GAttrib.java)
created: 2026-06-13
updated: 2026-06-14
---

# GAttrib

Represents the gattrib Haven component.

## Nested Types

### Parser

- Role: Parses one published gob-attribute delta class.
- Description: Converts a resource-published parser into a `Gob` attribute applier.

### ParserMaker

- Role: Builds a `GAttrib.Parser` from published code.
- Description: Resolves either a parser class or a static `parse(Gob, Message)` method.

## Members

### Constants

### Fields

#### `public final Gob gob`
- Role: Caches the gob value.
- Description: Caches the `gob` value for reuse.

#### `Collection<RenderTree.Slot> slots`
- Role: Caches the slots value.
- Description: Caches the `slots` value for reuse.

### Methods

#### `public GAttrib(Gob gob)`
- Role: Creates a new GAttrib instance.
- Description: Constructs the GAttrib instance from the supplied inputs.

#### `public void ctick(double dt)`
- Role: Advances the client-thread state.
- Description: Advances the client-thread state.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.

#### `public Parser make(Class<?> cl, Resource ires, Object... argv)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public void apply(Gob gob, Message sdt)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.