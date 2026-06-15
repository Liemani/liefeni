# Material

This file documents the responsibilities and members of `Material`.

## Meta

- Source: [Material.java](../../../src/haven/Material.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents render material data.

## Nested Types

### $blend

- Description: TODO

### $maskcol

- Description: TODO

### $maskdepth

- Description: TODO

### $mlink

- Description: TODO

### $nofacecull

- Description: TODO

### $order

- Description: TODO

### $vcol

- Description: TODO

### Buffer

- Description: TODO

### Factory

- Description: TODO

### Owner

- Description: TODO

### Res

- Description: TODO

### ResMaterial

- Description: TODO

### Spec

- Description: TODO

### SpecName

- Description: TODO

## Members

### Constants

#### `public static final Pipe.Op nofacecull = (p -> p.put(States.facecull, null))`

- Description: TODO

#### `private static final Map<String, Spec> rnames = new HashMap<>()`

- Description: TODO

### Fields

#### `public final Pipe.Op states, dynstates`

- Description: TODO

#### `public final Pipe.Op states, dynstates`

- Description: TODO

#### `final Pipe.Op mask = p -> p.put(FragColor.slot, null)`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final List<Pipe.Op> states, dynstates`

- Description: TODO

#### `public final List<Pipe.Op> states, dynstates`

- Description: TODO

#### `private final List<Object[]> left`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final Res info`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `private transient Material m`

- Description: TODO

#### `private transient Buffer cons`

- Description: TODO

### Methods

#### `public void cons(Buffer buf, Object... args)`

- Description: TODO

#### `public void cons(Buffer buf, Object... args)`

- Description: TODO

#### `public void cons(Buffer buf, Object... args)`

- Description: TODO

#### `public void cons(Buffer buf, Object... args)`

- Description: TODO

#### `private static BlendMode.Function fn(Resource res, char desc)`

- Description: TODO

#### `private static BlendMode.Factor fac(Resource res, char desc)`

- Description: TODO

#### `public void cons(Buffer buf, Object... args)`

- Description: TODO

#### `public void cons(Buffer buf, Object... args)`

- Description: TODO

#### `public Material(Pipe.Op[] states, Pipe.Op[] dynstates)`

- Description: TODO

#### `public Material(Pipe.Op... states)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public Wrapping apply(RenderTree.Node r)`

- Description: TODO

#### `public void cons(Buffer buf, Object... args)`

- Description: TODO

#### `public Material create(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `public static Material fromres(Owner owner, Resource res, Message sdt)`

- Description: TODO

#### `public Buffer(Resource res, List<Object[]> specs)`

- Description: TODO

#### `public void cons(Buffer buf, Object... args)`

- Description: TODO

#### `public String value()`

- Description: TODO

#### `public ResMaterial(Pipe.Op[] states, Pipe.Op[] dynstates, Res info)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Res(Resource res, Message buf)`

- Description: TODO

#### `public Spec findspec(String nm)`

- Description: TODO

#### `public Material get()`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Integer layerid()`

- Description: TODO
