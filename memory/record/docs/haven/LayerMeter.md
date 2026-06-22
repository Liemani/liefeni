---
source: [LayerMeter.java](../../../../src/haven/LayerMeter.java)
created: 2026-06-13
updated: 2026-06-14
---

# LayerMeter

Represents the layer meter Haven component.

## Nested Types

### Meter

- Role: Represents meter within LayerMeter.
- Description: Describes the nested meter type used by the enclosing class.

## Members

### Constants

#### `private static final OwnerContext.ClassResolver<LayerMeter> ctxr = new OwnerContext.ClassResolver<LayerMeter>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<layer meter> ctxr = new owner context.class resolver<layer meter>() operation.
- Value: `new OwnerContext.ClassResolver<LayerMeter>()`

### Fields

#### `protected ItemInfo.Raw rawinfo = null`
- Role: Caches the rawinfo value.
- Description: Caches the `rawinfo` value for reuse.

#### `protected List<ItemInfo> info = Collections.emptyList()`
- Role: Implements the info operation.
- Description: Implements the empty list operation.

#### `protected List<Meter> meters = Collections.emptyList()`
- Role: Implements the meters operation.
- Description: Implements the empty list operation.

#### `public final double a`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `public final Color c`
- Role: Caches the c value.
- Description: Caches the `c` value for reuse.

#### `private double hoverstart`
- Role: Caches the hoverstart value.
- Description: Caches the `hoverstart` value for reuse.

#### `private Tex shorttip, longtip`
- Role: Caches the longtip value.
- Description: Caches the `longtip` value for reuse.

#### `private Tex shorttip, longtip`
- Role: Caches the longtip value.
- Description: Caches the `longtip` value for reuse.

### Methods

#### `public LayerMeter(Coord sz)`
- Role: Creates a new LayerMeter instance.
- Description: Constructs the LayerMeter instance from the supplied inputs.

#### `public Meter(double a, Color c)`
- Role: Handles the meter path.
- Description: Implements the meter operation.

#### `public void set(List<Meter> meters)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void set(double a, Color c)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `private static double av(Object arg)`
- Role: Handles the av path.
- Description: Implements the av operation.

#### `public static List<Meter> decmeters(Object[] args, int s)`
- Role: Handles the decmeters path.
- Description: Implements the decmeters operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public List<ItemInfo> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.