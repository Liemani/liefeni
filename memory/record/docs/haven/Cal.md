---
source: [Cal.java](../../../../src/haven/Cal.java)
created: 2026-06-13
updated: 2026-06-14
---

# Cal

Represents the cal Haven component.

## Members

### Constants

#### `public static final double hbr = UI.scale(20.0)`
- Role: Implements the hbr operation.
- Description: Implements the scale operation.
- Value: `UI.scale(20.0)`

#### `static final Tex bg = Resource.loadtex("gfx/hud/calendar/glass")`
- Role: Implements the bg operation.
- Description: Implements the loadtex operation.
- Value: `Resource.loadtex("gfx/hud/calendar/glass")`

#### `static final Tex[] dlnd = new Tex[4]`
- Role: Caches the dlnd value.
- Description: Caches the `dlnd` value for reuse.
- Value: `new Tex[4]`

#### `static final Tex[] nlnd = new Tex[4]`
- Role: Caches the nlnd value.
- Description: Caches the `nlnd` value for reuse.
- Value: `new Tex[4]`

#### `static final Resource.Image dsky = Resource.loadrimg("gfx/hud/calendar/daysky")`
- Role: Implements the dsky operation.
- Description: Implements the loadrimg operation.
- Value: `Resource.loadrimg("gfx/hud/calendar/daysky")`

#### `static final Resource.Image nsky = Resource.loadrimg("gfx/hud/calendar/nightsky")`
- Role: Implements the nsky operation.
- Description: Implements the loadrimg operation.
- Value: `Resource.loadrimg("gfx/hud/calendar/nightsky")`

#### `static final Resource.Anim sun = Resource.local().loadwait("gfx/hud/calendar/sun").layer(Resource.animc)`
- Role: Implements the sun operation.
- Description: Implements the layer operation.
- Value: `Resource.local().loadwait("gfx/hud/calendar/sun").layer(Resource.animc)`

#### `static final Resource.Anim moon = Resource.local().loadwait("gfx/hud/calendar/moon").layer(Resource.animc)`
- Role: Implements the moon operation.
- Description: Implements the layer operation.
- Value: `Resource.local().loadwait("gfx/hud/calendar/moon").layer(Resource.animc)`

### Fields

### Methods

#### `public Cal()`
- Role: Creates a new Cal instance.
- Description: Constructs the Cal instance from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Cal content.

#### `public boolean checkhit(Coord c)`
- Role: Handles the checkhit path.
- Description: Implements the checkhit operation.

#### `private static String ord(int i)`
- Role: Handles the ord path.
- Description: Implements the ord operation.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.