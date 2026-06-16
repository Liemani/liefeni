# UIPanel

This file documents the responsibilities and members of `UIPanel`.

## Meta

- Source: [UIPanel.java](../../../src/haven/UIPanel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the uipanel Haven component.

## Members

### Constants

#### `public static final Config.Variable<Boolean> dbtext = Config.Variable.propb("haven.dbtext", false)`
- Role: Defines the shared dbtext constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Config.Variable<Boolean> profile = Config.Variable.propb("haven.profile", false)`
- Role: Defines the shared profile constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Cursor emptycurs = Toolkit.getDefaultToolkit().createCustomCursor(TexI.mkbuf(new Coord(1, 1)), new java.awt.Point(), "")`
- Role: Defines the shared emptycurs constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Queue<InputEvent> events = new LinkedList<>()`
- Role: Caches events entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public MouseEvent mousemv = null`
- Role: Holds the mousemv state.
- Description: Backs the cached state for this file.

#### `private KeyEvent lastpress = null`
- Role: Holds the lastpress state.
- Description: Backs the cached state for this file.

#### `private UI ui`
- Role: Stores the UI value.
- Description: Backs the cached state for this file.

### Methods

#### `public UI newui(UI.Runner fun)`
- Role: Performs newui.
- Description: Supports the newui operation used by the surrounding class.

#### `public void background(boolean bg)`
- Role: Performs background.
- Description: Supports the background operation used by the surrounding class.

#### `public void setSize(int w, int h)`
- Role: Sets the size.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public Dimension getSize()`
- Role: Returns the size.
- Description: Exposes the requested value without mutating state.

#### `public void setCursor(Cursor c)`
- Role: Sets the cursor.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public Component getParent()`
- Role: Returns the parent.
- Description: Exposes the requested value without mutating state.

#### `public void dispatch(UI ui)`
- Role: Performs dispatch.
- Description: Supports the dispatch operation used by the surrounding class.

#### `public void register(Component wdg)`
- Role: Performs register.
- Description: Supports the register operation used by the surrounding class.

#### `public void keyTyped(KeyEvent e)`
- Role: Performs key typed.
- Description: Supports the key typed operation used by the surrounding class.

#### `public void keyPressed(KeyEvent e)`
- Role: Performs key pressed.
- Description: Supports the key pressed operation used by the surrounding class.

#### `public void keyReleased(KeyEvent e)`
- Role: Performs key released.
- Description: Supports the key released operation used by the surrounding class.

#### `public void mouseEntered(MouseEvent e)`
- Role: Performs mouse entered.
- Description: Supports the mouse entered operation used by the surrounding class.

#### `public void mouseExited(MouseEvent e)`
- Role: Performs mouse exited.
- Description: Supports the mouse exited operation used by the surrounding class.

#### `public void mouseClicked(MouseEvent e)`
- Role: Performs mouse clicked.
- Description: Supports the mouse clicked operation used by the surrounding class.

#### `public void mousePressed(MouseEvent e)`
- Role: Performs mouse pressed.
- Description: Supports the mouse pressed operation used by the surrounding class.

#### `public void mouseReleased(MouseEvent e)`
- Role: Performs mouse released.
- Description: Supports the mouse released operation used by the surrounding class.

#### `public void mouseWheelMoved(MouseWheelEvent e)`
- Role: Performs mouse wheel moved.
- Description: Supports the mouse wheel moved operation used by the surrounding class.

#### `public void mouseDragged(MouseEvent e)`
- Role: Performs mouse dragged.
- Description: Supports the mouse dragged operation used by the surrounding class.

#### `public void mouseMoved(MouseEvent e)`
- Role: Performs mouse moved.
- Description: Supports the mouse moved operation used by the surrounding class.

#### `private void drophover(DropTargetDragEvent ev)`
- Role: Performs drophover.
- Description: Supports the drophover operation used by the surrounding class.

#### `private void dropthing(DropTargetDropEvent ev)`
- Role: Performs dropthing.
- Description: Supports the dropthing operation used by the surrounding class.

#### `public void dragEnter(DropTargetDragEvent ev)`
- Role: Performs drag enter.
- Description: Supports the drag enter operation used by the surrounding class.

#### `public void dragOver(DropTargetDragEvent ev)`
- Role: Performs drag over.
- Description: Supports the drag over operation used by the surrounding class.

#### `public void dropActionChanged(DropTargetDragEvent ev)`
- Role: Performs drop action changed.
- Description: Supports the drop action changed operation used by the surrounding class.

#### `public void dragExit(DropTargetEvent ev)`
- Role: Performs drag exit.
- Description: Supports the drag exit operation used by the surrounding class.

#### `public void drop(DropTargetDropEvent ev)`
- Role: Performs drop.
- Description: Supports the drop operation used by the surrounding class.

#### `public static Cursor getsyscurs(UI.Cursor id)`
- Role: Performs getsyscurs.
- Description: Supports the getsyscurs operation used by the surrounding class.

#### `public static Cursor makeawtcurs(BufferedImage img, Coord hs)`
- Role: Performs makeawtcurs.
- Description: Supports the makeawtcurs operation used by the surrounding class.
