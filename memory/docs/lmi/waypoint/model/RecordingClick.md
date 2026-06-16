# RecordingClick

This file documents the responsibilities and members of `RecordingClick`.

## Meta

- Source: [RecordingClick.java](../../../../../src/lmi/waypoint/model/RecordingClick.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents waypoint model data for recording click.

## Members

### Constants

### Fields

#### `public final int index`
- Role: Stores the index value.
- Description: Backs the cached state for this file.

#### `public final int x`
- Role: Stores the x value.
- Description: Backs the cached state for this file.

#### `public final int y`
- Role: Stores the y value.
- Description: Backs the cached state for this file.

#### `public final int mouseButton`
- Role: Stores the mouse button value.
- Description: Backs the cached state for this file.

#### `public final Long gobId`
- Role: Stores the gob id value.
- Description: Backs the cached state for this file.

#### `public final Integer meshId`
- Role: Stores the mesh id value.
- Description: Backs the cached state for this file.

#### `public final String gobResname`
- Role: Stores the gob resname value.
- Description: Backs the cached state for this file.

#### `public boolean isPortal`
- Role: Tracks the is portal flag.
- Description: Supports the is portal operation used by the surrounding class.

### Methods

#### `public RecordingClick(int index, int x, int y, int mouseButton, Long gobId, Integer meshId, String gobResname)`
- Role: Creates a new RecordingClick instance.
- Description: Constructs the instance and initializes its default state.
