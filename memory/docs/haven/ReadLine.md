# ReadLine

This file documents the responsibilities and members of `ReadLine`.

## Meta

- Source: [ReadLine.java](../../../src/haven/ReadLine.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Supports line-by-line reading.

## Nested Types

### UndoState

- Description: TODO

## Members

### Constants

#### `public static final Owner nil = new Owner()`

- Description: TODO

### Fields

#### `public final Owner owner`

- Description: TODO

#### `public char[] buf = new char[16]`

- Description: TODO

#### `public int length = 0`

- Description: TODO

#### `public int point = 0`

- Description: TODO

#### `public int seq = 0`

- Description: TODO

#### `public double mtime`

- Description: TODO

#### `private Text tcache = null`

- Description: TODO

#### `public int mark = -1`

- Description: TODO

#### `private int mark, yankpos, undopos`

- Description: TODO

#### `private int mark, yankpos, undopos`

- Description: TODO

#### `private int mark, yankpos, undopos`

- Description: TODO

#### `private boolean tmm`

- Description: TODO

#### `private String last = ""`

- Description: TODO

#### `private List<String> yanklist = new ArrayList<String>()`

- Description: TODO

#### `private List<UndoState> undolist = new ArrayList<UndoState>()`

- Description: TODO

#### `private String line`

- Description: TODO

#### `private int point`

- Description: TODO

#### `private String lastsel = "", lastclip = ""`

- Description: TODO

#### `private String lastsel = "", lastclip = ""`

- Description: TODO

### Methods

#### `public char[] buffer()`

- Description: TODO

#### `public int length()`

- Description: TODO

#### `public int point()`

- Description: TODO

#### `public void point(int p)`

- Description: TODO

#### `public int mark()`

- Description: TODO

#### `public void mark(int m)`

- Description: TODO

#### `public void setline(String line)`

- Description: TODO

#### `public boolean key(char c, KeyEvent ev, int mod)`

- Description: TODO

#### `public double mtime()`

- Description: TODO

#### `public default boolean empty()`

- Description: TODO

#### `public default String line()`

- Description: TODO

#### `public default Text render(Text.Foundry f)`

- Description: TODO

#### `public default void select(int from, int to)`

- Description: TODO

#### `public default boolean lneq(String ln)`

- Description: TODO

#### `public default boolean key(KeyEvent ev)`

- Description: TODO

#### `public default void changed(ReadLine buf)`

- Description: TODO

#### `public default void done(ReadLine buf)`

- Description: TODO

#### `public Base(Owner owner, String init)`

- Description: TODO

#### `public String line(int off, int len)`

- Description: TODO

#### `public void line(String ln)`

- Description: TODO

#### `public char[] remove(int off, int len)`

- Description: TODO

#### `public char[] ensure(int off, int len)`

- Description: TODO

#### `public static boolean wordchar(char c)`

- Description: TODO

#### `public int wordstart(int from)`

- Description: TODO

#### `public int wordend(int from)`

- Description: TODO

#### `protected abstract boolean key2(char c, KeyEvent ev, int mod)`

- Description: TODO

#### `public boolean key(char c, KeyEvent ev, int mod)`

- Description: TODO

#### `public char[] buffer()`

- Description: TODO

#### `public int length()`

- Description: TODO

#### `public int point()`

- Description: TODO

#### `public void point(int p)`

- Description: TODO

#### `public double mtime()`

- Description: TODO

#### `public void setline(String line)`

- Description: TODO

#### `public Text render(Text.Foundry f)`

- Description: TODO

#### `public PCLine(Owner owner, String init)`

- Description: TODO

#### `public void clipset(Clipboard c)`

- Description: TODO

#### `public String cliptext()`

- Description: TODO

#### `public int mark()`

- Description: TODO

#### `public void mark(int mark)`

- Description: TODO

#### `public void setline(String line)`

- Description: TODO

#### `public void rmsel()`

- Description: TODO

#### `private void cksel()`

- Description: TODO

#### `public boolean key2(char c, KeyEvent ev, int mod)`

- Description: TODO

#### `public EmacsLine(Owner owner, String init)`

- Description: TODO

#### `private UndoState()`

- Description: TODO

#### `private void save()`

- Description: TODO

#### `private void mode(String mode)`

- Description: TODO

#### `private void killclipboard()`

- Description: TODO

#### `private void kill(String text)`

- Description: TODO

#### `private String cliptext(Clipboard c)`

- Description: TODO

#### `public int mark()`

- Description: TODO

#### `public void mark(int m)`

- Description: TODO

#### `public void rmsel()`

- Description: TODO

#### `public boolean key2(char c, KeyEvent ev, int mod)`

- Description: TODO

#### `public static ReadLine make(Owner owner, String init)`

- Description: TODO
