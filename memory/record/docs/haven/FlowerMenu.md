---
source: [FlowerMenu.java](../../../src/haven/FlowerMenu.java)
created: 2026-06-13
updated: 2026-06-14
---

# FlowerMenu

Represents the in-game flower menu.

## Nested Types

### $_

- Role: Represents $ within FlowerMenu.
- Description: Describes the nested $  type used by the enclosing class.

### Cancel

- Role: Represents cancel within FlowerMenu.
- Description: Describes the nested cancel type used by the enclosing class.

### Chosen

- Role: Represents chosen within FlowerMenu.
- Description: Describes the nested chosen type used by the enclosing class.

### Opening

- Role: Represents opening within FlowerMenu.
- Description: Describes the nested opening type used by the enclosing class.

### Petal

- Role: Represents petal within FlowerMenu.
- Description: Describes the nested petal type used by the enclosing class.

## Members

### Constants

#### `public static final Color pink = new Color(255, 0, 128)`
- Role: Defines the shared pink constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color ptc = Color.YELLOW`
- Role: Defines the shared ptc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Text.Foundry ptf = new Text.Foundry(Text.dfont, 12)`
- Role: Defines the shared ptf constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IBox pbox = Window.wbox`
- Role: Defines the shared pbox constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Tex pbg = Window.bg`
- Role: Defines the shared pbg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ph = UI.scale(30), ppl = 8`
- Role: Defines the shared ph constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int ph = UI.scale(30), ppl = 8`
- Role: Defines the shared ph constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Petal[] opts`
- Role: Holds the opts state.
- Description: Backs the cached state for this file.

#### `private UI.Grab mg, kg`
- Role: Stores the kg value.
- Description: Backs the cached state for this file.

#### `private UI.Grab mg, kg`
- Role: Stores the kg value.
- Description: Backs the cached state for this file.

#### `public String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public double ta, tr`
- Role: Stores the tr value.
- Description: Backs the cached state for this file.

#### `public double ta, tr`
- Role: Stores the tr value.
- Description: Backs the cached state for this file.

#### `public int num`
- Role: Stores the num value.
- Description: Backs the cached state for this file.

#### `private Text text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `private double a = 1`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `Petal chosen`
- Role: Holds the chosen state.
- Description: Backs the cached state for this file.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Petal(String name)`
- Role: Performs petal.
- Description: Supports the petal operation used by the surrounding class.

#### `public void move(Coord c)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void move(double a, double r)`
- Role: Moves the current state.
- Description: Supports the move operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public Area ta(Coord tc)`
- Role: Performs ta.
- Description: Supports the ta operation used by the surrounding class.

#### `public Area ta(double a, double r)`
- Role: Performs ta.
- Description: Supports the ta operation used by the surrounding class.

#### `private static double nxf(double a)`
- Role: Performs nxf.
- Description: Supports the nxf operation used by the surrounding class.

#### `Opening()`
- Role: Handles the opening workflow.
- Description: Supports the opening operation used by the surrounding class.

#### `public void ntick(double s)`
- Role: Performs ntick.
- Description: Supports the ntick operation used by the surrounding class.

#### `Chosen(Petal c)`
- Role: Handles the chosen workflow.
- Description: Supports the chosen operation used by the surrounding class.

#### `public void ntick(double s)`
- Role: Performs ntick.
- Description: Supports the ntick operation used by the surrounding class.

#### `Cancel()`
- Role: Handles the cancel workflow.
- Description: Supports the cancel operation used by the surrounding class.

#### `public void ntick(double s)`
- Role: Performs ntick.
- Description: Supports the ntick operation used by the surrounding class.

#### `private void organize(Petal[] opts)`
- Role: Performs organize.
- Description: Supports the organize operation used by the surrounding class.

#### `public FlowerMenu(String... options)`
- Role: Creates a new FlowerMenu instance.
- Description: Constructs the instance and initializes its default state.

#### `protected void added()`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Performs keydown.
- Description: Supports the keydown operation used by the surrounding class.

#### `public void choose(Petal option)`
- Role: Performs choose.
- Description: Supports the choose operation used by the surrounding class.
