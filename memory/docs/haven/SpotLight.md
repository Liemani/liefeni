# SpotLight

This file documents the responsibilities and members of `SpotLight`.

## Meta

- Source: [SpotLight.java](../../../src/haven/SpotLight.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the spot light Haven component.

## Members

### Constants

#### `private static final float[] defdir =`
- Role: Defines the shared spot light constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public float[] dir`
- Role: Stores the dir value.
- Description: Backs the cached state for this file.

#### `public float exp, cut`
- Role: Stores the cut value.
- Description: Backs the cached state for this file.

#### `public float exp, cut`
- Role: Stores the cut value.
- Description: Backs the cached state for this file.

### Methods

#### `public SpotLight(FColor col, Coord3f pos, Coord3f dir, float exp)`
- Role: Creates a new SpotLight instance.
- Description: Constructs the instance and initializes its default state.

#### `public SpotLight(Color col, Coord3f pos, Coord3f dir, float exp)`
- Role: Creates a new SpotLight instance.
- Description: Constructs the instance and initializes its default state.

#### `public SpotLight(FColor amb, FColor dif, FColor spc, Coord3f pos, Coord3f dir, float exp)`
- Role: Creates a new SpotLight instance.
- Description: Constructs the instance and initializes its default state.

#### `public SpotLight(Color amb, Color dif, Color spc, Coord3f pos, Coord3f dir, float exp)`
- Role: Creates a new SpotLight instance.
- Description: Constructs the instance and initializes its default state.
