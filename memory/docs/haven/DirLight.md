# DirLight

This file documents the responsibilities and members of `DirLight`.

## Meta

- Source: [DirLight.java](../../../src/haven/DirLight.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the dir light Haven component.

## Members

### Constants

### Fields

#### `public float[] dir`
- Role: Stores the dir value.
- Description: Backs the cached state for this file.

### Methods

#### `public DirLight(FColor col, Coord3f dir)`
- Role: Creates a new DirLight instance.
- Description: Constructs the instance and initializes its default state.

#### `public DirLight(Color col, Coord3f dir)`
- Role: Creates a new DirLight instance.
- Description: Constructs the instance and initializes its default state.

#### `public DirLight(FColor amb, FColor dif, FColor spc, Coord3f dir)`
- Role: Creates a new DirLight instance.
- Description: Constructs the instance and initializes its default state.

#### `public DirLight(Color amb, Color dif, Color spc, Coord3f dir)`
- Role: Creates a new DirLight instance.
- Description: Constructs the instance and initializes its default state.

#### `public Object[] params(GroupPipe state)`
- Role: Performs params.
- Description: Supports the params operation used by the surrounding class.
