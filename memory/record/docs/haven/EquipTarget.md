---
source: [EquipTarget.java](../../../../src/haven/EquipTarget.java)
created: 2026-06-13
updated: 2026-06-14
---

# EquipTarget

Represents the equip target Haven component.

## Members

### Constants

### Fields

#### `public final Supplier<Pipe.Op> nil = () -> Pipe.Op.nil`
- Role: Implements the nil operation.
- Description: Implements the public final supplier<pipe.op> nil = () -> pipe.op.nil operation.

#### `public final String tgt, nm, ctx`
- Role: Caches the ctx value.
- Description: Caches the `ctx` value for reuse.

#### `public final String tgt, nm, ctx`
- Role: Caches the ctx value.
- Description: Caches the `ctx` value for reuse.

#### `public final String tgt, nm, ctx`
- Role: Caches the ctx value.
- Description: Caches the `ctx` value for reuse.

### Methods

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.

#### `public NoSuchTarget(EquipTarget tgt, String nm, Object ctx)`
- Role: Handles the no such target path.
- Description: Implements the no such target operation.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Returns the message.

#### `public static Supplier<? extends Pipe.Op> eqpoint(EquipTarget tgt, String nm, Message dat, Object ctx)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.

#### `public static Supplier<? extends Pipe.Op> eqpoint(EquipTarget tgt, String nm, Message dat)`
- Role: Handles the eqpoint path.
- Description: Implements the eqpoint operation.