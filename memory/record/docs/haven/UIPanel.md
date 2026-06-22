---
source: [UIPanel.java](../../../../src/haven/UIPanel.java)
created: 2026-06-13
updated: 2026-06-14
---

# UIPanel

Bridges AWT input events into the Haven UI tree.

## Members

### Constants

#### `public static final Config.Variable<Boolean> dbtext = Config.Variable.propb("haven.dbtext", false)`
- Role: Enables debug text rendering.
- Description: Reads the `haven.dbtext` preference flag.
- Value: `Config.Variable.propb("haven.dbtext", false)`

#### `public static final Config.Variable<Boolean> profile = Config.Variable.propb("haven.profile", false)`
- Role: Enables profiling output.
- Description: Reads the `haven.profile` preference flag.
- Value: `Config.Variable.propb("haven.profile", false)`

#### `public static final Cursor emptycurs = Toolkit.getDefaultToolkit().createCustomCursor(TexI.mkbuf(new Coord(1, 1)), new java.awt.Point(), "")`
- Role: Defines the invisible cursor.
- Description: Builds a one-pixel transparent AWT cursor used when the client hides the pointer.
- Value: `Toolkit.getDefaultToolkit().createCustomCursor(TexI.mkbuf(new Coord(1, 1)), new java.awt.Point(), "")`

### Fields

#### `public final Queue<InputEvent> events = new LinkedList<>()`
- Role: Buffers pending input events.
- Description: Stores key, mouse, and wheel events until the UI thread dispatches them.

#### `public MouseEvent mousemv = null`
- Role: Caches the latest pointer motion event.
- Description: Keeps only the newest mouse move or drag event so motion can be coalesced.

#### `private KeyEvent lastpress = null`
- Role: Tracks the last key press.
- Description: Used to suppress duplicate typed events that follow the same physical key press.

#### `private UI ui`
- Role: Stores the active UI instance.
- Description: Receives dispatched events and drag-and-drop callbacks.

### Methods

#### `public UI newui(UI.Runner fun)`
- Role: Creates a new UI.
- Description: Builds the UI root for this panel through the supplied runner.

#### `public void background(boolean bg)`
- Role: Toggles background mode.
- Description: Forwards the state to the UI runner so the panel can run without focus.

#### `public void setSize(int w, int h)`
- Role: Updates the panel size.
- Description: Forwards the new canvas dimensions into the UI tree.

#### `public Dimension getSize()`
- Role: Returns the panel size.
- Description: Reports the current canvas dimensions to AWT callers.

#### `public void setCursor(Cursor c)`
- Role: Updates the active cursor.
- Description: Applies the current UI cursor to the backing AWT component.

#### `public Component getParent()`
- Role: Returns the parent component.
- Description: Exposes the AWT parent that owns this panel.

#### `public void dispatch(UI ui)`
- Role: Dispatches queued input into the UI.
- Description: Drains buffered input events and forwards them to the current UI root.

#### `public void register(Component wdg)`
- Role: Registers AWT listeners on a widget.
- Description: Hooks keyboard, mouse, wheel, motion, and drop listeners into the supplied component.

#### `public void keyTyped(KeyEvent e)`
- Role: Queues typed key input.
- Description: Buffers the event for the next UI dispatch cycle.

#### `public void keyPressed(KeyEvent e)`
- Role: Queues key-down input.
- Description: Buffers the press event so the UI thread can process it in order.

#### `public void keyReleased(KeyEvent e)`
- Role: Queues key-up input.
- Description: Buffers the release event so the UI thread can process it in order.

#### `public void mouseEntered(MouseEvent e)`
- Role: Ignores mouse-enter events.
- Description: The panel does not need explicit enter handling here.

#### `public void mouseExited(MouseEvent e)`
- Role: Ignores mouse-exit events.
- Description: The panel does not need explicit exit handling here.

#### `public void mouseClicked(MouseEvent e)`
- Role: Ignores click-through events.
- Description: Click handling is driven by press and release dispatch instead.

#### `public void mousePressed(MouseEvent e)`
- Role: Queues mouse-down input.
- Description: Buffers the press event for the UI thread.

#### `public void mouseReleased(MouseEvent e)`
- Role: Queues mouse-up input.
- Description: Buffers the release event for the UI thread.

#### `public void mouseWheelMoved(MouseWheelEvent e)`
- Role: Queues wheel input.
- Description: Buffers the wheel event for the UI thread.

#### `public void mouseDragged(MouseEvent e)`
- Role: Updates the pending motion event.
- Description: Coalesces drag movement so only the latest position is dispatched.

#### `public void mouseMoved(MouseEvent e)`
- Role: Updates the pending motion event.
- Description: Coalesces motion events the same way as drag events.

#### `private void drophover(DropTargetDragEvent ev)`
- Role: Processes drag-hover feedback.
- Description: Resolves whether the current widget tree accepts the dragged payload.

#### `private void dropthing(DropTargetDropEvent ev)`
- Role: Processes a drop action.
- Description: Delivers the dropped payload to the UI root and reports success or failure.

#### `public void dragEnter(DropTargetDragEvent ev)`
- Role: Forwards drag-enter to hover handling.
- Description: Reuses the same hit-test logic as drag-over.

#### `public void dragOver(DropTargetDragEvent ev)`
- Role: Forwards drag-over to hover handling.
- Description: Reuses the same hit-test logic as drag-enter.

#### `public void dropActionChanged(DropTargetDragEvent ev)`
- Role: Refreshes drag-hover state after action changes.
- Description: Re-evaluates whether the current drop target accepts the payload.

#### `public void dragExit(DropTargetEvent ev)`
- Role: Ignores drag-exit notifications.
- Description: No state is needed once the drag leaves the panel.

#### `public void drop(DropTargetDropEvent ev)`
- Role: Forwards drop handling.
- Description: Delivers the drop event to the widget tree.

#### `public static Cursor getsyscurs(UI.Cursor id)`
- Role: Maps UI cursors to AWT cursors.
- Description: Converts Haven cursor ids into their platform cursor equivalents.

#### `public static Cursor makeawtcurs(BufferedImage img, Coord hs)`
- Role: Builds a custom AWT cursor.
- Description: Renders the supplied image into a cursor-sized buffer and applies the hotspot.
