# Sprite

This file documents the responsibilities and members of `Sprite`.

## Meta

- Source: [Sprite.java](../../../src/haven/Sprite.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a sprite.

## Nested Types

### CDel

- Description: TODO

### CUpd

- Description: TODO

### FactMaker

- Description: TODO

### Factory

- Description: TODO

### Mill

- Description: TODO

### Owner

- Description: TODO

### RecOwner

- Description: TODO

### ResourceException

- Description: TODO

### UIOwner

- Description: TODO

## Members

### Constants

### Fields

#### `public final Resource res`

- Description: TODO

#### `public final Owner owner`

- Description: TODO

#### `public static List<Factory> factories = new LinkedList<Factory>()`

- Description: TODO

#### `public final Widget wdg`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final byte[] sdt`

- Description: TODO

#### `public Resource res`

- Description: TODO

### Methods

#### `public Random mkrandoom()`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Resource getres()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public UIOwner(Widget wdg)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public void delete()`

- Description: TODO

#### `public void update(Message sdt)`

- Description: TODO

#### `public FactMaker()`

- Description: TODO

#### `public Sprite create(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `public S create(Owner owner)`

- Description: TODO

#### `public FromRes(Indir<Resource> res, byte[] sdt)`

- Description: TODO

#### `public Sprite create(Owner owner)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public static Mill<Sprite> of(Indir<Resource> res, byte[] sdt)`

- Description: TODO

#### `public static Mill<Sprite> of(Indir<Resource> res, Message sdt)`

- Description: TODO

#### `public static Mill<Sprite> of(Resource res, Message sdt)`

- Description: TODO

#### `public static Mill<Sprite> of(ResData dat)`

- Description: TODO

#### `public ResourceException(String msg, Resource res)`

- Description: TODO

#### `public ResourceException(String msg, Throwable cause, Resource res)`

- Description: TODO

#### `protected Sprite(Owner owner, Resource res)`

- Description: TODO

#### `public static int decnum(Message sdt)`

- Description: TODO

#### `public static Sprite create(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public void gtick(Render g)`

- Description: TODO

#### `public void age()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String toString()`

- Description: TODO
