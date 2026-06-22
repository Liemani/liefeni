---
source: [FoodInfo.java](../../../../../src/haven/resutil/FoodInfo.java)
created: 2026-06-13
updated: 2026-06-20
---

# FoodInfo

Renders food tooltip text, including total stats, events, and effect breakdowns.

## Nested Types

### Event
Represents a single food event entry.

#### Members

##### Constants

#### `public static final Coord imgsz = new Coord(Text.std.height(), Text.std.height())`
- Role: Defines the icon size for event rows.
- Description: Keeps event icons aligned with the tooltip text.

##### Fields

#### `public final BAttrWnd.FoodMeter.Event ev`
- Role: Stores the food-meter event definition.
- Description: Provides the event name and display color.

#### `public final BufferedImage img`
- Role: Stores the event icon image.
- Description: Generated from the resource icon using a small convolution filter.

#### `public final double a`
- Role: Stores the event amount.
- Description: Rendered as the numeric value next to the icon.

##### Methods

#### `public Event(Resource res, double a)`
- Role: Builds one food event row.
- Description: Resolves the meter event and icon from the resource.

### Effect
Represents one food effect entry.

#### Members

##### Fields

#### `public final List<ItemInfo> info`
- Role: Stores the nested item-info list.
- Description: Rendered as the effect tooltip body.

#### `public final double p`
- Role: Stores the effect probability.
- Description: Used when the effect is not guaranteed.

##### Methods

#### `public Effect(List<ItemInfo> info, double p)`
- Role: Builds one food effect row.
- Description: Stores the effect payload and chance.

## Members

### Constants

#### `public static final Coord imgsz = new Coord(Text.std.height(), Text.std.height())`
- Role: Defines the icon size used in the tooltip.
- Description: Matches the standard text height for compact rows.

### Fields

#### `public final double end, glut, sev, cons`
- Role: Stores the food stat totals.
- Description: These values drive the main summary line.

#### `public final Event[] evs`
- Role: Stores the food event list.
- Description: Each event is rendered as part of the summary.

#### `public final Effect[] efs`
- Role: Stores the food effect list.
- Description: Each effect contributes to the detailed section.

#### `public final int[] types`
- Role: Stores the food type flags.
- Description: Used when classifying the item.

#### `public final BAttrWnd.FoodMeter.Event ev`
- Role: Stores the live food-meter event.
- Description: Used by the nested event render path.

#### `public final BufferedImage img`
- Role: Stores the rendered tooltip image.
- Description: Built from the formatted food description.

#### `public final double a`
- Role: Stores the numeric event amount.
- Description: Used by the event renderer.

#### `public final List<ItemInfo> info`
- Role: Stores nested item-info entries.
- Description: Used when rendering effect tooltips.

#### `public final double p`
- Role: Stores the effect probability.
- Description: Used by the effect renderer.

### Methods

#### `public FoodInfo(Owner owner, double end, double glut, double cons, double sev, Event[] evs, Effect[] efs, int[] types)`
- Role: Builds a food info entry with severity.
- Description: Stores all top-level stats and nested rows.

#### `public FoodInfo(Owner owner, double end, double glut, double cons, Event[] evs, Effect[] efs, int[] types)`
- Role: Builds a food info entry without severity.
- Description: Uses the same payload with zero severity.

#### `public void layout(Layout l)`
- Role: Lays out the tooltip content.
- Description: Renders the summary line, event rows, and effect rows.