---
source: [DropTarget.java](../../../src/haven/DropTarget.java)
created: 2026-06-13
updated: 2026-06-14
---

# DropTarget

Represents the drop target Haven component.

## Members

### Constants

### Fields

#### `public final Object thing`
- Role: Holds the thing state.
- Description: Backs the cached state for this file.

#### `public final Hover root`
- Role: Holds the root state.
- Description: Backs the cached state for this file.

#### `public boolean hovering`
- Role: Tracks the hovering flag.
- Description: Supports the hovering operation used by the surrounding class.

#### `public DropTarget tgt`
- Role: Holds the tgt state.
- Description: Backs the cached state for this file.

### Methods

#### `public default boolean dropthing(Coord cc, Object thing)`
- Role: Performs dropthing.
- Description: Supports the dropthing operation used by the surrounding class.

#### `public default boolean drophover(Coord cc, boolean hovering, Object thing)`
- Role: Performs drophover.
- Description: Supports the drophover operation used by the surrounding class.

#### `public default boolean dropthing(Drop ev)`
- Role: Performs dropthing.
- Description: Supports the dropthing operation used by the surrounding class.

#### `public default boolean drophover(Hover ev)`
- Role: Performs drophover.
- Description: Supports the drophover operation used by the surrounding class.

#### `public DropEvent(Coord c, Object thing)`
- Role: Performs drop event.
- Description: Supports the drop event operation used by the surrounding class.

#### `public DropEvent(DropEvent from, Coord c)`
- Role: Performs drop event.
- Description: Supports the drop event operation used by the surrounding class.

#### `public Drop(Coord c, Object thing)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public Drop(Drop from, Coord c)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public Drop derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public Hover(Coord c, Object thing)`
- Role: Performs hover.
- Description: Supports the hover operation used by the surrounding class.

#### `public Hover(Hover from, Coord c)`
- Role: Performs hover.
- Description: Supports the hover operation used by the surrounding class.

#### `public Hover derive(Coord c)`
- Role: Performs derive.
- Description: Supports the derive operation used by the surrounding class.

#### `public Hover hovering(boolean h)`
- Role: Performs hovering.
- Description: Supports the hovering operation used by the surrounding class.

#### `public boolean accept(DropTarget tgt)`
- Role: Performs accept.
- Description: Supports the accept operation used by the surrounding class.

#### `protected boolean propagation(Widget from)`
- Role: Performs propagation.
- Description: Supports the propagation operation used by the surrounding class.

#### `protected boolean shandle(Widget w)`
- Role: Performs shandle.
- Description: Supports the shandle operation used by the surrounding class.

#### `public static boolean dropthing(Widget wdg, Coord c, Object thing)`
- Role: Performs dropthing.
- Description: Supports the dropthing operation used by the surrounding class.

#### `public static boolean drophover(Widget wdg, Coord c, Object thing)`
- Role: Performs drophover.
- Description: Supports the drophover operation used by the surrounding class.
