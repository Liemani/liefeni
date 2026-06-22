---
source: [Material.java](../../../../src/haven/Material.java)
created: 2026-06-13
updated: 2026-06-14
---

# Material

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
- Role: Implements the nofacecull operation.
- Description: Implements the put operation.
- Value: `(p -> p.put(States.facecull, null))`

#### `private static final Map<String, Spec> rnames = new HashMap<>()`
- Role: Implements the rnames operation.
- Description: Implements the private static final map<string, spec> rnames = new hash map<>() operation.
- Value: `new HashMap<>()`

### Fields

#### `public final Pipe.Op states, dynstates`
- Role: Caches the dynstates value.
- Description: Caches the `dynstates` value for reuse.

#### `public final Pipe.Op states, dynstates`
- Role: Caches the dynstates value.
- Description: Caches the `dynstates` value for reuse.

#### `final Pipe.Op mask = p -> p.put(FragColor.slot, null)`
- Role: Implements the mask operation.
- Description: Implements the put operation.

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final List<Pipe.Op> states, dynstates`
- Role: Caches the dynstates value.
- Description: Caches the `dynstates` value for reuse.

#### `public final List<Pipe.Op> states, dynstates`
- Role: Caches the dynstates value.
- Description: Caches the `dynstates` value for reuse.

#### `private final List<Object[]> left`
- Role: Caches the left value.
- Description: Caches the `left` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Res info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private transient Material m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

#### `private transient Buffer cons`
- Role: Caches the cons value.
- Description: Caches the `cons` value for reuse.

### Methods

#### `public void cons(Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public void cons(Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public void cons(Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public void cons(Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `private static BlendMode.Function fn(Resource res, char desc)`
- Role: Handles the fn path.
- Description: Implements the fn operation.

#### `private static BlendMode.Factor fac(Resource res, char desc)`
- Role: Handles the fac path.
- Description: Implements the fac operation.

#### `public void cons(Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public void cons(Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public Material(Pipe.Op[] states, Pipe.Op[] dynstates)`
- Role: Creates a new Material instance.
- Description: Constructs the Material instance from the supplied inputs.

#### `public Material(Pipe.Op... states)`
- Role: Creates a new Material instance.
- Description: Constructs the Material instance from the supplied inputs.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Material for debugging and logging.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public Wrapping apply(RenderTree.Node r)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void cons(Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public Material create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public static Material fromres(Owner owner, Resource res, Message sdt)`
- Role: Handles the fromres path.
- Description: Implements the fromres operation.

#### `public Buffer(Resource res, List<Object[]> specs)`
- Role: Handles the buffer path.
- Description: Implements the buffer operation.

#### `public void cons(Buffer buf, Object... args)`
- Role: Handles the cons path.
- Description: Implements the cons operation.

#### `public String value()`
- Role: Handles the value path.
- Description: Implements the value operation.

#### `public ResMaterial(Pipe.Op[] states, Pipe.Op[] dynstates, Res info)`
- Role: Handles the resource material path.
- Description: Implements the res material operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Material for debugging and logging.

#### `public Res(Resource res, Message buf)`
- Role: Handles the resource path.
- Description: Implements the res operation.

#### `public Spec findspec(String nm)`
- Role: Handles the findspec path.
- Description: Finds the spec.

#### `public Material get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public Integer layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.