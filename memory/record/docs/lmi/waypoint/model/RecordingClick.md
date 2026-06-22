---
source: [RecordingClick.java](../../../../../../src/lmi/waypoint/model/RecordingClick.java)
created: 2026-06-13
updated: 2026-06-14
---

# RecordingClick

Represents waypoint model data for recording click.

## Members

### Constants

### Fields

#### `public final int index`
- Role: Caches the index value.
- Description: Caches the `index` value for reuse.

#### `public final int x`
- Role: Caches the x value.
- Description: Caches the `x` value for reuse.

#### `public final int y`
- Role: Caches the y value.
- Description: Caches the `y` value for reuse.

#### `public final int mouseButton`
- Role: Caches the mouse button value.
- Description: Caches the `mouseButton` value for reuse.

#### `public final Long gobId`
- Role: Caches the gob id value.
- Description: Caches the `gobId` value for reuse.

#### `public final Integer meshId`
- Role: Caches the mesh id value.
- Description: Caches the `meshId` value for reuse.

#### `public final String gobResname`
- Role: Caches the gob resname value.
- Description: Caches the `gobResname` value for reuse.

#### `public boolean isPortal`
- Role: Tracks the is portal flag.
- Description: Marks clicks that start a portal transition.

### Methods

#### `public RecordingClick(int index, int x, int y, int mouseButton, Long gobId, Integer meshId, String gobResname)`
- Role: Creates a new RecordingClick instance.
- Description: Constructs the RecordingClick instance from the supplied inputs.