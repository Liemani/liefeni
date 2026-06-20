---
source: [LayerMeter.java](../../../src/haven/LayerMeter.java)
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
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `protected ItemInfo.Raw rawinfo = null`
- Role: Holds the rawinfo state.
- Description: Backs the cached state for this file.

#### `protected List<ItemInfo> info = Collections.emptyList()`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `protected List<Meter> meters = Collections.emptyList()`
- Role: Caches meters entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final double a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public final Color c`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

#### `private double hoverstart`
- Role: Stores the hoverstart value.
- Description: Backs the cached state for this file.

#### `private Tex shorttip, longtip`
- Role: Stores the longtip value.
- Description: Backs the cached state for this file.

#### `private Tex shorttip, longtip`
- Role: Stores the longtip value.
- Description: Backs the cached state for this file.

### Methods

#### `public LayerMeter(Coord sz)`
- Role: Creates a new LayerMeter instance.
- Description: Constructs the instance and initializes its default state.

#### `public Meter(double a, Color c)`
- Role: Performs meter.
- Description: Supports the meter operation used by the surrounding class.

#### `public void set(List<Meter> meters)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void set(double a, Color c)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `private static double av(Object arg)`
- Role: Performs av.
- Description: Supports the av operation used by the surrounding class.

#### `public static List<Meter> decmeters(Object[] args, int s)`
- Role: Performs decmeters.
- Description: Supports the decmeters operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public List<ItemInfo> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public Object tooltip(Coord c, Widget prev)`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
