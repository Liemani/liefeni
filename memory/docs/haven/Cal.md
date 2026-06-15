# Cal

This file documents the responsibilities and members of `Cal`.

## Meta

- Source: [Cal.java](../../../src/haven/Cal.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides calendar and time helpers.

## Members

### Constants

#### `public static final double hbr = UI.scale(20.0)`

- Description: TODO

#### `static final Tex bg = Resource.loadtex("gfx/hud/calendar/glass")`

- Description: TODO

#### `static final Tex[] dlnd = new Tex[4]`

- Description: TODO

#### `static final Tex[] nlnd = new Tex[4]`

- Description: TODO

#### `static final Resource.Image dsky = Resource.loadrimg("gfx/hud/calendar/daysky")`

- Description: TODO

#### `static final Resource.Image nsky = Resource.loadrimg("gfx/hud/calendar/nightsky")`

- Description: TODO

#### `static final Resource.Anim sun = Resource.local().loadwait("gfx/hud/calendar/sun").layer(Resource.animc)`

- Description: TODO

#### `static final Resource.Anim moon = Resource.local().loadwait("gfx/hud/calendar/moon").layer(Resource.animc)`

- Description: TODO

### Fields

### Methods

#### `public Cal()`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean checkhit(Coord c)`

- Description: TODO

#### `private static String ord(int i)`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO
