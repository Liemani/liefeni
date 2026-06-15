# LayerMeter

This file documents the responsibilities and members of `LayerMeter`.

## Meta

- Source: [LayerMeter.java](../../../src/haven/LayerMeter.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays layered meter UI.

## Nested Types

### Meter

- Description: TODO

## Members

### Constants

#### `private static final OwnerContext.ClassResolver<LayerMeter> ctxr = new OwnerContext.ClassResolver<LayerMeter>()`

- Description: TODO

### Fields

#### `protected ItemInfo.Raw rawinfo = null`

- Description: TODO

#### `protected List<ItemInfo> info = Collections.emptyList()`

- Description: TODO

#### `protected List<Meter> meters = Collections.emptyList()`

- Description: TODO

#### `public final double a`

- Description: TODO

#### `public final Color c`

- Description: TODO

#### `private double hoverstart`

- Description: TODO

#### `private Tex shorttip, longtip`

- Description: TODO

#### `private Tex shorttip, longtip`

- Description: TODO

### Methods

#### `public LayerMeter(Coord sz)`

- Description: TODO

#### `public Meter(double a, Color c)`

- Description: TODO

#### `public void set(List<Meter> meters)`

- Description: TODO

#### `public void set(double a, Color c)`

- Description: TODO

#### `private static double av(Object arg)`

- Description: TODO

#### `public static List<Meter> decmeters(Object[] args, int s)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public List<ItemInfo> info()`

- Description: TODO

#### `public Object tooltip(Coord c, Widget prev)`

- Description: TODO

#### `public void uimsg(String msg, Object... args)`

- Description: TODO
