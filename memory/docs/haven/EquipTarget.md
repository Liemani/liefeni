# EquipTarget

This file documents the responsibilities and members of `EquipTarget`.

## Meta

- Source: [EquipTarget.java](../../../src/haven/EquipTarget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the equip target Haven component.

## Members

### Constants

### Fields

#### `public final Supplier<Pipe.Op> nil = () -> Pipe.Op.nil`
- Role: Holds the nil state.
- Description: Backs the cached state for this file.

#### `public final String tgt, nm, ctx`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

#### `public final String tgt, nm, ctx`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

#### `public final String tgt, nm, ctx`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

### Methods

#### `public Supplier<? extends Pipe.Op> eqpoint(String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public NoSuchTarget(EquipTarget tgt, String nm, Object ctx)`
- Role: Performs no such target.
- Description: Supports the no such target operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public static Supplier<? extends Pipe.Op> eqpoint(EquipTarget tgt, String nm, Message dat, Object ctx)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.

#### `public static Supplier<? extends Pipe.Op> eqpoint(EquipTarget tgt, String nm, Message dat)`
- Role: Performs eqpoint.
- Description: Supports the eqpoint operation used by the surrounding class.
