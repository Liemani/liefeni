# Material

This file documents the responsibilities and members of `Material`.

## Meta

- Source: [Material.java](../../../src/haven/Material.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the material Haven component.

## Nested Types

### $blend

- Role: Represents $blend within Material.
- Description: Describes the nested $blend type used by the enclosing class.

### $maskcol

- Role: Represents $maskcol within Material.
- Description: Describes the nested $maskcol type used by the enclosing class.

### $maskdepth

- Role: Represents $maskdepth within Material.
- Description: Describes the nested $maskdepth type used by the enclosing class.

### $mlink

- Role: Represents $mlink within Material.
- Description: Describes the nested $mlink type used by the enclosing class.

### $nofacecull

- Role: Represents $nofacecull within Material.
- Description: Describes the nested $nofacecull type used by the enclosing class.

### $order

- Role: Represents $order within Material.
- Description: Describes the nested $order type used by the enclosing class.

### $vcol

- Role: Represents $vcol within Material.
- Description: Describes the nested $vcol type used by the enclosing class.

### Buffer

- Role: Represents buffer within Material.
- Description: Describes the nested buffer type used by the enclosing class.

### Factory

- Role: Represents factory within Material.
- Description: Describes the nested factory type used by the enclosing class.

### Owner

- Role: Represents owner within Material.
- Description: Describes the nested owner type used by the enclosing class.

### Res

- Role: Represents res within Material.
- Description: Describes the nested res type used by the enclosing class.

### ResMaterial

- Role: Represents res material within Material.
- Description: Describes the nested res material type used by the enclosing class.

### Spec

- Role: Represents spec within Material.
- Description: Describes the nested spec type used by the enclosing class.

### SpecName

- Role: Represents spec name within Material.
- Description: Describes the nested spec name type used by the enclosing class.

## Members

### Constants

#### `public static final Pipe.Op nofacecull = (p -> p.put(States.facecull, null))`
- Role: Defines the shared nofacecull constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<String, Spec> rnames = new HashMap<>()`
- Role: Defines the shared rnames constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Pipe.Op states, dynstates`
- Role: Holds the dynstates state.
- Description: Backs the cached state for this file.

#### `public final Pipe.Op states, dynstates`
- Role: Holds the dynstates state.
- Description: Backs the cached state for this file.

#### `final Pipe.Op mask = p -> p.put(FragColor.slot, null)`
- Role: Holds the mask state.
- Description: Backs the cached state for this file.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final List<Pipe.Op> states, dynstates`
- Role: Caches dynstates entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final List<Pipe.Op> states, dynstates`
- Role: Caches dynstates entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final List<Object[]> left`
- Role: Caches left entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Res info`
- Role: Holds the info state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private transient Material m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `private transient Buffer cons`
- Role: Stores the cons value.
- Description: Backs the cached state for this file.

### Methods

#### `public void cons(Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void cons(Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void cons(Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void cons(Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `private static BlendMode.Function fn(Resource res, char desc)`
- Role: Performs fn.
- Description: Supports the fn operation used by the surrounding class.

#### `private static BlendMode.Factor fac(Resource res, char desc)`
- Role: Performs fac.
- Description: Supports the fac operation used by the surrounding class.

#### `public void cons(Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public void cons(Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public Material(Pipe.Op[] states, Pipe.Op[] dynstates)`
- Role: Creates a new Material instance.
- Description: Constructs the instance and initializes its default state.

#### `public Material(Pipe.Op... states)`
- Role: Creates a new Material instance.
- Description: Constructs the instance and initializes its default state.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public Wrapping apply(RenderTree.Node r)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void cons(Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public Material create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static Material fromres(Owner owner, Resource res, Message sdt)`
- Role: Performs fromres.
- Description: Supports the fromres operation used by the surrounding class.

#### `public Buffer(Resource res, List<Object[]> specs)`
- Role: Performs buffer.
- Description: Supports the buffer operation used by the surrounding class.

#### `public void cons(Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.

#### `public String value()`
- Role: Performs value.
- Description: Supports the value operation used by the surrounding class.

#### `public ResMaterial(Pipe.Op[] states, Pipe.Op[] dynstates, Res info)`
- Role: Performs res material.
- Description: Supports the res material operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Res(Resource res, Message buf)`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public Spec findspec(String nm)`
- Role: Performs findspec.
- Description: Supports the findspec operation used by the surrounding class.

#### `public Material get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.
