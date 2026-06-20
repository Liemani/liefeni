---
source: [FoodInfo.java](../../../../src/haven/resutil/FoodInfo.java)
created: 2026-06-13
updated: 2026-06-14
---

# FoodInfo

Provides resource helper logic for food info.

## Nested Types

### Effect

- Role: Represents effect within FoodInfo.
- Description: Describes the nested effect type used by the enclosing class.

### Event

- Role: Represents event within FoodInfo.
- Description: Describes the nested event type used by the enclosing class.

## Members

### Constants

#### `public static final Coord imgsz = new Coord(Text.std.height(), Text.std.height())`
- Role: Defines the shared imgsz constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final double end, glut, sev, cons`
- Role: Stores the cons value.
- Description: Backs the cached state for this file.

#### `public final double end, glut, sev, cons`
- Role: Stores the cons value.
- Description: Backs the cached state for this file.

#### `public final double end, glut, sev, cons`
- Role: Stores the cons value.
- Description: Backs the cached state for this file.

#### `public final double end, glut, sev, cons`
- Role: Stores the cons value.
- Description: Backs the cached state for this file.

#### `public final Event[] evs`
- Role: Holds the evs state.
- Description: Backs the cached state for this file.

#### `public final Effect[] efs`
- Role: Holds the efs state.
- Description: Backs the cached state for this file.

#### `public final int[] types`
- Role: Stores the types value.
- Description: Backs the cached state for this file.

#### `public final BAttrWnd.FoodMeter.Event ev`
- Role: Stores the ev value.
- Description: Backs the cached state for this file.

#### `public final BufferedImage img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public final double a`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `public final List<ItemInfo> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final double p`
- Role: Stores the p value.
- Description: Backs the cached state for this file.

### Methods

#### `public FoodInfo(Owner owner, double end, double glut, double cons, double sev, Event[] evs, Effect[] efs, int[] types)`
- Role: Creates a new FoodInfo instance.
- Description: Constructs the instance and initializes its default state.

#### `public FoodInfo(Owner owner, double end, double glut, double cons, Event[] evs, Effect[] efs, int[] types)`
- Role: Creates a new FoodInfo instance.
- Description: Constructs the instance and initializes its default state.

#### `public Event(Resource res, double a)`
- Role: Performs event.
- Description: Supports the event operation used by the surrounding class.

#### `public Effect(List<ItemInfo> info, double p)`
- Role: Performs effect.
- Description: Supports the effect operation used by the surrounding class.

#### `public void layout(Layout l)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.
