---
source: [ReadLine.java](../../../../src/haven/ReadLine.java)
created: 2026-06-13
updated: 2026-06-14
---

# ReadLine

Represents the read line Haven component.

## Nested Types

### UndoState

- Role: Captures one undo state.
- Description: Snapshot of the line buffer used for undo and redo transitions.

## Members

### Constants

#### `public static final Owner nil = new Owner()`
- Role: Implements the nil operation.
- Description: Implements the owner operation.
- Value: `new Owner()`

### Fields

#### `public final Owner owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

#### `public char[] buf = new char[16]`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

#### `public int length = 0`
- Role: Caches the length value.
- Description: Caches the `length` value for reuse.

#### `public int point = 0`
- Role: Caches the point value.
- Description: Caches the `point` value for reuse.

#### `public int seq = 0`
- Role: Caches the seq value.
- Description: Caches the `seq` value for reuse.

#### `public double mtime`
- Role: Caches the mtime value.
- Description: Caches the `mtime` value for reuse.

#### `private Text tcache = null`
- Role: Caches tcache for reuse.
- Description: Keeps tcache cached for reuse.

#### `public int mark = -1`
- Role: Caches the mark value.
- Description: Caches the `mark` value for reuse.

#### `private int mark, yankpos, undopos`
- Role: Caches the undopos value.
- Description: Caches the `undopos` value for reuse.

#### `private int mark, yankpos, undopos`
- Role: Caches the undopos value.
- Description: Caches the `undopos` value for reuse.

#### `private int mark, yankpos, undopos`
- Role: Caches the undopos value.
- Description: Caches the `undopos` value for reuse.

#### `private boolean tmm`
- Role: Tracks the tmm flag.
- Description: Caches the `tmm` value for reuse.

#### `private String last = ""`
- Role: Caches the last .
- Description: Caches the last  value.

#### `private List<String> yanklist = new ArrayList<String>()`
- Role: Implements the yanklist operation.
- Description: Implements the private list<string> yanklist = new array list<string>() operation.

#### `private List<UndoState> undolist = new ArrayList<UndoState>()`
- Role: Implements the undolist operation.
- Description: Implements the private list<undo state> undolist = new array list<undo state>() operation.

#### `private String line`
- Role: Caches the line value.
- Description: Caches the `line` value for reuse.

#### `private int point`
- Role: Caches the point value.
- Description: Caches the `point` value for reuse.

#### `private String lastsel = "", lastclip = ""`
- Role: Caches the last sel.
- Description: Caches the last sel value.

#### `private String lastsel = "", lastclip = ""`
- Role: Caches the last sel.
- Description: Caches the last sel value.

### Methods

#### `public char[] buffer()`
- Role: Handles the buffer path.
- Description: Implements the buffer operation.

#### `public int length()`
- Role: Handles the length path.
- Description: Implements the length operation.

#### `public int point()`
- Role: Handles the point path.
- Description: Implements the point operation.

#### `public void point(int p)`
- Role: Handles the point path.
- Description: Implements the point operation.

#### `public int mark()`
- Role: Handles the mark path.
- Description: Implements the mark operation.

#### `public void mark(int m)`
- Role: Handles the mark path.
- Description: Implements the mark operation.

#### `public void setline(String line)`
- Role: Handles the setline path.
- Description: Updates the line.

#### `public boolean key(char c, KeyEvent ev, int mod)`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `public double mtime()`
- Role: Handles the mtime path.
- Description: Implements the mtime operation.

#### `public default boolean empty()`
- Role: Handles the empty path.
- Description: Implements the empty operation.

#### `public default String line()`
- Role: Handles the line path.
- Description: Implements the line operation.

#### `public default Text render(Text.Foundry f)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public default void select(int from, int to)`
- Role: Handles the select path.
- Description: Implements the select operation.

#### `public default boolean lneq(String ln)`
- Role: Handles the lneq path.
- Description: Implements the lneq operation.

#### `public default boolean key(KeyEvent ev)`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `public default void changed(ReadLine buf)`
- Role: Handles the changed path.
- Description: Implements the changed operation.

#### `public default void done(ReadLine buf)`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public Base(Owner owner, String init)`
- Role: Handles the base path.
- Description: Implements the base operation.

#### `public String line(int off, int len)`
- Role: Handles the line path.
- Description: Implements the line operation.

#### `public void line(String ln)`
- Role: Handles the line path.
- Description: Implements the line operation.

#### `public char[] remove(int off, int len)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public char[] ensure(int off, int len)`
- Role: Ensures the target value exists.
- Description: Implements the ensure operation.

#### `public static boolean wordchar(char c)`
- Role: Handles the wordchar path.
- Description: Implements the wordchar operation.

#### `public int wordstart(int from)`
- Role: Handles the wordstart path.
- Description: Implements the wordstart operation.

#### `public int wordend(int from)`
- Role: Handles the wordend path.
- Description: Implements the wordend operation.

#### `protected abstract boolean key2(char c, KeyEvent ev, int mod)`
- Role: Handles the key2 path.
- Description: Implements the key2 operation.

#### `public boolean key(char c, KeyEvent ev, int mod)`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `public char[] buffer()`
- Role: Handles the buffer path.
- Description: Implements the buffer operation.

#### `public int length()`
- Role: Handles the length path.
- Description: Implements the length operation.

#### `public int point()`
- Role: Handles the point path.
- Description: Implements the point operation.

#### `public void point(int p)`
- Role: Handles the point path.
- Description: Implements the point operation.

#### `public double mtime()`
- Role: Handles the mtime path.
- Description: Implements the mtime operation.

#### `public void setline(String line)`
- Role: Handles the setline path.
- Description: Updates the line.

#### `public Text render(Text.Foundry f)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public PCLine(Owner owner, String init)`
- Role: Handles the pcline path.
- Description: Implements the pc line operation.

#### `public void clipset(Clipboard c)`
- Role: Handles the clipset path.
- Description: Implements the clipset operation.

#### `public String cliptext()`
- Role: Handles the cliptext path.
- Description: Implements the cliptext operation.

#### `public int mark()`
- Role: Handles the mark path.
- Description: Implements the mark operation.

#### `public void mark(int mark)`
- Role: Handles the mark path.
- Description: Implements the mark operation.

#### `public void setline(String line)`
- Role: Handles the setline path.
- Description: Updates the line.

#### `public void rmsel()`
- Role: Handles the rmsel path.
- Description: Implements the rmsel operation.

#### `private void cksel()`
- Role: Handles the cksel path.
- Description: Implements the cksel operation.

#### `public boolean key2(char c, KeyEvent ev, int mod)`
- Role: Handles the key2 path.
- Description: Implements the key2 operation.

#### `public EmacsLine(Owner owner, String init)`
- Role: Handles the emacs line path.
- Description: Implements the emacs line operation.

#### `private UndoState()`
- Role: Handles the undo state path.
- Description: Implements the undo state operation.

#### `private void save()`
- Role: Saves the current data.
- Description: Saves the current data through the persistence pipeline.

#### `private void mode(String mode)`
- Role: Handles the mode path.
- Description: Implements the mode operation.

#### `private void killclipboard()`
- Role: Handles the killclipboard path.
- Description: Implements the killclipboard operation.

#### `private void kill(String text)`
- Role: Handles the kill path.
- Description: Implements the kill operation.

#### `private String cliptext(Clipboard c)`
- Role: Handles the cliptext path.
- Description: Implements the cliptext operation.

#### `public int mark()`
- Role: Handles the mark path.
- Description: Implements the mark operation.

#### `public void mark(int m)`
- Role: Handles the mark path.
- Description: Implements the mark operation.

#### `public void rmsel()`
- Role: Handles the rmsel path.
- Description: Implements the rmsel operation.

#### `public boolean key2(char c, KeyEvent ev, int mod)`
- Role: Handles the key2 path.
- Description: Implements the key2 operation.

#### `public static ReadLine make(Owner owner, String init)`
- Role: Handles the make path.
- Description: Implements the make operation.