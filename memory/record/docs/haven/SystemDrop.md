---
source: [SystemDrop.java](../../../../src/haven/SystemDrop.java)
created: 2026-06-13
updated: 2026-06-14
---

# SystemDrop

Represents the system drop Haven component.

## Members

### Constants

### Fields

### Methods

#### `public boolean supports(DataFlavor f)`
- Role: Handles the supports path.
- Description: Implements the supports operation.

#### `public Object receive(DataFlavor f) throws IOException`
- Role: Receives the current message.
- Description: Implements the receive operation.

#### `public static SystemDrop of(DropTargetDragEvent ev)`
- Role: Builds a SystemDrop value from the supplied components.
- Description: Builds a SystemDrop value from the supplied components.

#### `public static SystemDrop of(DropTargetDropEvent ev)`
- Role: Builds a SystemDrop value from the supplied components.
- Description: Builds a SystemDrop value from the supplied components.