# Profdisp

This file documents the responsibilities and members of `Profdisp`.

## Meta

- Source: [Profdisp.java](../../../src/haven/Profdisp.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays profile data.

## Nested Types

### Buffer

- Description: TODO

## Members

### Constants

#### `public static final Resource.Image markimg = Resource.loadrimg("gfx/hud/arwmark")`

- Description: TODO

#### `public static final Color[] cols = Utils.vgapal`

- Description: TODO

#### `private static final int h = UI.scale(80)`

- Description: TODO

#### `private static final String[] units =`

- Description: TODO

### Fields

#### `public final Profile prof`

- Description: TODO

#### `public double mt = 0.05`

- Description: TODO

#### `private double dscale = 0`

- Description: TODO

#### `private Tex sscl = null`

- Description: TODO

#### `private int[] mark = new int[0]`

- Description: TODO

#### `public final Tex tex`

- Description: TODO

#### `private final Texture2D btex`

- Description: TODO

#### `private Buffer display`

- Description: TODO

### Methods

#### `public Profdisp(Profile prof)`

- Description: TODO

#### `public Buffer()`

- Description: TODO

#### `private void draw(ByteBuffer buf, double scale)`

- Description: TODO

#### `public void update(Render r, double scale)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public boolean keydown(KeyDownEvent ev)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public String tooltip(Coord c, Widget prev)`

- Description: TODO
