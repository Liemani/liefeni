---
source: [Cal.java](../../../src/haven/Cal.java)
created: 2026-06-13
updated: 2026-06-14
---

# Cal

Represents the cal Haven component.

## Members

### Constants

#### `public static final double hbr = UI.scale(20.0)`
- Role: Defines the shared hbr constant.
- Description: Shared constant used by the rest of the class.

#### `static final Tex bg = Resource.loadtex("gfx/hud/calendar/glass")`
- Role: Defines the shared bg constant.
- Description: Shared constant used by the rest of the class.

#### `static final Tex[] dlnd = new Tex[4]`
- Role: Defines the shared dlnd constant.
- Description: Shared constant used by the rest of the class.

#### `static final Tex[] nlnd = new Tex[4]`
- Role: Defines the shared nlnd constant.
- Description: Shared constant used by the rest of the class.

#### `static final Resource.Image dsky = Resource.loadrimg("gfx/hud/calendar/daysky")`
- Role: Defines the shared dsky constant.
- Description: Shared constant used by the rest of the class.

#### `static final Resource.Image nsky = Resource.loadrimg("gfx/hud/calendar/nightsky")`
- Role: Defines the shared nsky constant.
- Description: Shared constant used by the rest of the class.

#### `static final Resource.Anim sun = Resource.local().loadwait("gfx/hud/calendar/sun").layer(Resource.animc)`
- Role: Defines the shared sun constant.
- Description: Shared constant used by the rest of the class.

#### `static final Resource.Anim moon = Resource.local().loadwait("gfx/hud/calendar/moon").layer(Resource.animc)`
- Role: Defines the shared moon constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public Cal()`
- Role: Creates a new Cal instance.
- Description: Constructs the instance and initializes its default state.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean checkhit(Coord c)`
- Role: Performs checkhit.
- Description: Supports the checkhit operation used by the surrounding class.

#### `private static String ord(int i)`
- Role: Performs ord.
- Description: Supports the ord operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.
