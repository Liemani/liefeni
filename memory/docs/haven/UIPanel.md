# UIPanel

This file documents the responsibilities and members of `UIPanel`.

## Meta

- Source: [UIPanel.java](../../../src/haven/UIPanel.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Hosts the UI panel and dispatcher.

## Members

### Constants

#### `public static final Config.Variable<Boolean> dbtext = Config.Variable.propb("haven.dbtext", false)`

- Description: TODO

#### `public static final Config.Variable<Boolean> profile = Config.Variable.propb("haven.profile", false)`

- Description: TODO

#### `public static final Cursor emptycurs = Toolkit.getDefaultToolkit().createCustomCursor(TexI.mkbuf(new Coord(1, 1)), new java.awt.Point(), "")`

- Description: TODO

### Fields

#### `public final Queue<InputEvent> events = new LinkedList<>()`

- Description: TODO

#### `public MouseEvent mousemv = null`

- Description: TODO

#### `private KeyEvent lastpress = null`

- Description: TODO

#### `private UI ui`

- Description: TODO

### Methods

#### `public UI newui(UI.Runner fun)`

- Description: TODO

#### `public void background(boolean bg)`

- Description: TODO

#### `public void setSize(int w, int h)`

- Description: TODO

#### `public Dimension getSize()`

- Description: TODO

#### `public void setCursor(Cursor c)`

- Description: TODO

#### `public Component getParent()`

- Description: TODO

#### `public void dispatch(UI ui)`

- Description: TODO

#### `public void register(Component wdg)`

- Description: TODO

#### `public void keyTyped(KeyEvent e)`

- Description: TODO

#### `public void keyPressed(KeyEvent e)`

- Description: TODO

#### `public void keyReleased(KeyEvent e)`

- Description: TODO

#### `public void mouseEntered(MouseEvent e)`

- Description: TODO

#### `public void mouseExited(MouseEvent e)`

- Description: TODO

#### `public void mouseClicked(MouseEvent e)`

- Description: TODO

#### `public void mousePressed(MouseEvent e)`

- Description: TODO

#### `public void mouseReleased(MouseEvent e)`

- Description: TODO

#### `public void mouseWheelMoved(MouseWheelEvent e)`

- Description: TODO

#### `public void mouseDragged(MouseEvent e)`

- Description: TODO

#### `public void mouseMoved(MouseEvent e)`

- Description: TODO

#### `private void drophover(DropTargetDragEvent ev)`

- Description: TODO

#### `private void dropthing(DropTargetDropEvent ev)`

- Description: TODO

#### `public void dragEnter(DropTargetDragEvent ev)`

- Description: TODO

#### `public void dragOver(DropTargetDragEvent ev)`

- Description: TODO

#### `public void dropActionChanged(DropTargetDragEvent ev)`

- Description: TODO

#### `public void dragExit(DropTargetEvent ev)`

- Description: TODO

#### `public void drop(DropTargetDropEvent ev)`

- Description: TODO

#### `public static Cursor getsyscurs(UI.Cursor id)`

- Description: TODO

#### `public static Cursor makeawtcurs(BufferedImage img, Coord hs)`

- Description: TODO
