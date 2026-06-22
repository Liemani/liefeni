---
source: [FlowerMenu.java](../../../../src/haven/FlowerMenu.java)
created: 2026-06-13
updated: 2026-06-14
---

# FlowerMenu

Represents the in-game flower menu.

## Nested Types

### $_

- Role: Registers the `sm` flower-menu widget factory.
- Description: Builds a `FlowerMenu` from the option strings sent by the server.

### Cancel

- Role: Animates the menu while closing without a selection.
- Description: Moves the petals back in and destroys the widget when the animation ends.

### Chosen

- Role: Animates the menu after a petal is chosen.
- Description: Fades the chosen petal out, retracts the rest, and destroys the widget at the end.

### Opening

- Role: Animates the petals as the menu opens.
- Description: Staggers the radial reveal so each petal appears in sequence.

### Petal

- Role: Represents one selectable flower-menu option.
- Description: Stores the label, index, animation angle, and draw/input behavior for a single petal.

## Members

### Constants

#### `public static final Color pink = new Color(255, 0, 128)`
- Role: Defines the highlight pink used by the menu.
- Description: Used for the petal text and menu accent color.
- Value: `new Color(255, 0, 128)`

#### `public static final Color ptc = Color.YELLOW`
- Role: Defines the petal text color.
- Description: Used for menu option labels.
- Value: `Color.YELLOW`

#### `public static final Text.Foundry ptf = new Text.Foundry(Text.dfont, 12)`
- Role: Defines the petal text foundry.
- Description: Used to render the menu option labels.
- Value: `new Text.Foundry(Text.dfont, 12)`

#### `public static final IBox pbox = Window.wbox`
- Role: Reuses the standard window box.
- Description: Draws the menu frame using the shared window chrome.
- Value: `Window.wbox`

#### `public static final Tex pbg = Window.bg`
- Role: Reuses the standard window background texture.
- Description: Draws the menu panel background.
- Value: `Window.bg`

#### `public static final int ph = UI.scale(30), ppl = 8`
- Role: Defines the petal height and padding.
- Description: Controls the vertical size of the petals and their layout spacing.
- Value: `UI.scale(30), ppl = 8`

#### `public static final int ph = UI.scale(30), ppl = 8`
- Role: Defines the petal height and padding.
- Description: Controls the vertical size of the petals and their layout spacing.
- Value: `UI.scale(30), ppl = 8`

### Fields

#### `public Petal[] opts`
- Role: Stores the menu petals.
- Description: Holds one `Petal` per option sent by the server.

#### `private UI.Grab mg, kg`
- Role: Tracks the mouse and keyboard grabs.
- Description: Keeps input locked to the flower menu while it is open.

#### `private UI.Grab mg, kg`
- Role: Tracks the mouse and keyboard grabs.
- Description: Keeps input locked to the flower menu while it is open.

#### `public String name`
- Role: Stores the menu name.
- Description: Used for logging and server feedback.

#### `public double ta, tr`
- Role: Stores animation timing.
- Description: Controls the open and retract progress of the menu.

#### `public double ta, tr`
- Role: Stores animation timing.
- Description: Controls the open and retract progress of the menu.

#### `public int num`
- Role: Stores the option index.
- Description: Identifies which menu entry this petal represents.

#### `private Text text`
- Role: Stores the rendered option label.
- Description: Rebuilt when the petal text changes.

#### `private double a = 1`
- Role: Tracks the current animation amount.
- Description: Used to fade and scale petals during open and close animations.

#### `Petal chosen`
- Role: Stores the selected petal.
- Description: Set after the player chooses one option.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the flower menu widget.
- Description: Builds the menu from the server-supplied option strings.

#### `public Petal(String name)`
- Role: Creates one selectable menu petal.
- Description: Stores the label and interaction state for a single option.

#### `public void move(Coord c)`
- Role: Repositions the petal by screen coordinate.
- Description: Updates the petal's radial layout from a target point.

#### `public void move(double a, double r)`
- Role: Repositions the petal by polar coordinate.
- Description: Updates the petal angle and radius directly.

#### `public void draw(GOut g)`
- Role: Draws the petal.
- Description: Renders the petal shape and its label.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles petal clicks.
- Description: Selects the petal when the mouse hits its area.

#### `public Area ta(Coord tc)`
- Role: Returns the hit area for a coordinate.
- Description: Converts a screen-space coordinate into the active petal area.

#### `public Area ta(double a, double r)`
- Role: Returns the hit area for a polar coordinate.
- Description: Converts angle and radius into the active petal area.

#### `private static double nxf(double a)`
- Role: Normalizes radial interpolation.
- Description: Maps animation progress through the radial easing curve.

#### `Opening()`
- Role: Starts the opening animation.
- Description: Initializes the radial reveal state for menu petals.

#### `public void ntick(double s)`
- Role: Advances the opening animation.
- Description: Progresses the menu reveal timing.

#### `Chosen(Petal c)`
- Role: Starts the chosen animation.
- Description: Initializes the close-out animation after selection.

#### `public void ntick(double s)`
- Role: Advances the chosen animation.
- Description: Fades the chosen petal while retracting the rest.

#### `Cancel()`
- Role: Starts the cancel animation.
- Description: Initializes the close-out animation without a selection.

#### `public void ntick(double s)`
- Role: Advances the cancel animation.
- Description: Retracts the menu and removes it when done.

#### `private void organize(Petal[] opts)`
- Role: Lays out petals around the menu circle.
- Description: Computes each option's angle and radius around the flower menu.

#### `public FlowerMenu(String... options)`
- Role: Creates a flower menu from option strings.
- Description: Builds one petal for each option and lays them out radially.

#### `protected void added()`
- Role: Starts the opening animation when the widget is shown.
- Description: Captures mouse and keyboard focus, then lays out the petals.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Selects the flower menu or a petal click target.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Receives server-driven flower-menu updates.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Renders the flower menu and its petals.

#### `public boolean keydown(KeyDownEvent ev)`
- Role: Processes keyboard input before the widget handles it.
- Description: Handles keyboard shortcuts for menu selection.

#### `public void choose(Petal option)`
- Role: Finalizes the selected petal.
- Description: Starts the chosen animation and sends the selection result.
