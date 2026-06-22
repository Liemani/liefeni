---
source: [SkillWnd.java](../../../../src/haven/SkillWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# SkillWnd

Represents the skill wnd Haven component.

## Nested Types

### $credo

- Role: Registers the `credo` widget resource with the UI loader.
- Description: Factory that creates a `TabProxy` for the SkillWnd credo tab.

### $expls

- Role: Registers the `expls` widget resource with the UI loader.
- Description: Factory that creates a `TabProxy` for the SkillWnd experience list tab.

### $skill

- Role: Registers the `skill` widget resource with the UI loader.
- Description: Factory that creates a `TabProxy` for the SkillWnd skill tab.

### Credo

- Role: Models one credo entry in the credo tab.
- Description: Holds the credo name, resource, ownership flag, and tooltip rendering for a single credo.

### CredoGrid

- Role: Renders and manages the credo selection grid.
- Description: Scrollable UI that groups available and acquired credos, handles sorting, and tracks the active selection.

### CredoImg

- Role: Renders the selected credo preview image.
- Description: Image widget that displays the currently selected credo artwork and related controls.

### ExpGrid

- Role: Renders the experience list grid.
- Description: Scrollable list that sorts experience entries, refreshes loaded content, and renders icons.

### Experience

- Role: Models one experience entry in the experience tab.
- Description: Holds the resource, last modified time, score, and tooltip rendering for a single experience entry.

### Skill

- Role: Models one skill entry in the skill tab.
- Description: Holds the skill name, resource, cost, ownership flag, and tooltip/rendering helpers.

### SkillGrid

- Role: Renders and manages the skill selection grid.
- Description: Grid list that groups available and known skills, lazily sorts entries, and renders skill icons.

## Members

### Constants

### Fields

#### `public final SkillGrid skg`
- Role: Caches the skg value.
- Description: Caches the `skg` value for reuse.

#### `public final CredoGrid credos`
- Role: Caches the credos value.
- Description: Caches the `credos` value for reuse.

#### `public final ExpGrid exps`
- Role: Caches the exps value.
- Description: Caches the `exps` value for reuse.

#### `private CharWnd chr`
- Role: Caches the chr value.
- Description: Caches the `chr` value for reuse.

#### `private Widget skill, credo, expls`
- Role: Caches the expls value.
- Description: Caches the `expls` value for reuse.

#### `private Widget skill, credo, expls`
- Role: Caches the expls value.
- Description: Caches the `expls` value for reuse.

#### `private Widget skill, credo, expls`
- Role: Caches the expls value.
- Description: Caches the `expls` value for reuse.

#### `public final String nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final int cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `public boolean has = false`
- Role: Tracks the has flag.
- Description: Caches the `has` value for reuse.

#### `private String sortkey`
- Role: Caches the sortkey value.
- Description: Caches the `sortkey` value for reuse.

#### `private Tex small`
- Role: Caches the small value.
- Description: Caches the `small` value for reuse.

#### `private Text tooltip = null`
- Role: Caches the tooltip value.
- Description: Caches the `tooltip` value for reuse.

#### `public final String nm`
- Role: Caches the nm value.
- Description: Caches the `nm` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public boolean has = false`
- Role: Tracks the has flag.
- Description: Caches the `has` value for reuse.

#### `private String sortkey`
- Role: Caches the sortkey value.
- Description: Caches the `sortkey` value for reuse.

#### `private Tex small`
- Role: Caches the small value.
- Description: Caches the `small` value for reuse.

#### `private Text tooltip = null`
- Role: Caches the tooltip value.
- Description: Caches the `tooltip` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final int mtime, score`
- Role: Caches the score value.
- Description: Caches the `score` value for reuse.

#### `public final int mtime, score`
- Role: Caches the score value.
- Description: Caches the `score` value for reuse.

#### `private String sortkey = "\uffff"`
- Role: Caches the sortkey value.
- Description: Caches the `sortkey` value for reuse.

#### `private Tex small`
- Role: Caches the small value.
- Description: Caches the `small` value for reuse.

#### `private Text tooltip = null`
- Role: Caches the tooltip value.
- Description: Caches the `tooltip` value for reuse.

#### `public final Group nsk, csk`
- Role: Caches the csk value.
- Description: Caches the `csk` value for reuse.

#### `public final Group nsk, csk`
- Role: Caches the csk value.
- Description: Caches the `csk` value for reuse.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Tracks whether  is currently loading.

#### `public final Coord crsz = UI.scale(70, 88)`
- Role: Implements the crsz operation.
- Description: Implements the scale operation.

#### `public final int btnw = UI.scale(100)`
- Role: Implements the btnw operation.
- Description: Implements the scale operation.

#### `public final Tex credoufr = new TexI(convolvedown(Resource.loadimg("gfx/hud/chr/yrkirframe"), crsz, iconfilter))`
- Role: Implements the credoufr operation.
- Description: Implements the loadimg operation.

#### `public final Tex credosfr = new TexI(convolvedown(Resource.loadimg("gfx/hud/chr/yrkirsframe"), crsz, iconfilter))`
- Role: Implements the credosfr operation.
- Description: Implements the loadimg operation.

#### `public final Text.Foundry prsf = new Text.Foundry(Text.fraktur, 15).aa(true)`
- Role: Implements the prsf operation.
- Description: Implements the aa operation.

#### `public final int m = UI.scale(5)`
- Role: Implements the m operation.
- Description: Implements the scale operation.

#### `public List<Credo> ncr = Collections.emptyList(), ccr = Collections.emptyList()`
- Role: Implements the ncr operation.
- Description: Implements the empty list operation.

#### `public List<Credo> ncr = Collections.emptyList(), ccr = Collections.emptyList()`
- Role: Implements the ncr operation.
- Description: Implements the empty list operation.

#### `public Credo pcr = null`
- Role: Caches the pcr value.
- Description: Caches the `pcr` value for reuse.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Caches the cost value.
- Description: Caches the `cost` value for reuse.

#### `public Credo sel = null`
- Role: Caches the sel value.
- Description: Caches the `sel` value for reuse.

#### `private final Img pcrc, ncrc, ccrc`
- Role: Caches the ccrc value.
- Description: Caches the `ccrc` value for reuse.

#### `private final Img pcrc, ncrc, ccrc`
- Role: Caches the ccrc value.
- Description: Caches the `ccrc` value for reuse.

#### `private final Img pcrc, ncrc, ccrc`
- Role: Caches the ccrc value.
- Description: Caches the `ccrc` value for reuse.

#### `private final Button pbtn, qbtn`
- Role: Caches the qbtn value.
- Description: Caches the `qbtn` value for reuse.

#### `private final Button pbtn, qbtn`
- Role: Caches the qbtn value.
- Description: Caches the `qbtn` value for reuse.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Tracks whether  is currently loading.

#### `private final Credo cr`
- Role: Caches the cr value.
- Description: Caches the `cr` value for reuse.

#### `public final Group seen`
- Role: Caches the seen value.
- Description: Caches the `seen` value for reuse.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Tracks whether  is currently loading.

### Methods

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public Widget create(UI ui, Object[] args)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `private Skill(String nm, Indir<Resource> res, int cost, boolean has)`
- Role: Handles the skill path.
- Description: Implements the skill operation.

#### `public RichText.Document rendertext()`
- Role: Handles the rendertext path.
- Description: Renders the text.

#### `public Text tooltip()`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `private Credo(String nm, Indir<Resource> res, boolean has)`
- Role: Handles the credo path.
- Description: Implements the credo operation.

#### `public RichText.Document rendertext()`
- Role: Handles the rendertext path.
- Description: Renders the text.

#### `public Text tooltip()`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `private Experience(Indir<Resource> res, int mtime, int score)`
- Role: Handles the experience path.
- Description: Implements the experience operation.

#### `public RichText.Document rendertext()`
- Role: Handles the rendertext path.
- Description: Renders the text.

#### `public Text tooltip()`
- Role: Returns the tooltip for the given cursor position.
- Description: Builds the tooltip for the current cursor position.

#### `public SkillGrid(Coord sz)`
- Role: Handles the skill grid path.
- Description: Implements the skill grid operation.

#### `protected void drawitem(GOut g, Skill sk)`
- Role: Handles the drawitem path.
- Description: Draws the item.

#### `protected void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `private void sksort(List<Skill> skills)`
- Role: Handles the sksort path.
- Description: Implements the sksort operation.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public CredoGrid(Coord sz)`
- Role: Handles the credo grid path.
- Description: Implements the credo grid operation.

#### `private Tex crtex(Credo cr)`
- Role: Handles the crtex path.
- Description: Implements the crtex operation.

#### `CredoImg(Credo cr)`
- Role: Handles the credo img workflow.
- Description: Implements the credo img operation.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the SkillWnd content.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `private int crgrid(int y, Collection<Credo> crs)`
- Role: Handles the crgrid path.
- Description: Implements the crgrid operation.

#### `private void sort(List<Credo> buf)`
- Role: Handles the sort path.
- Description: Implements the sort operation.

#### `private void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void change(Credo cr)`
- Role: Handles the change path.
- Description: Implements the change operation.

#### `public void pcr(Credo cr, int crl, int crlt, int crql, int crqlt, int qid)`
- Role: Handles the pcr path.
- Description: Implements the pcr operation.

#### `public void ncr(List<Credo> cr)`
- Role: Handles the ncr path.
- Description: Implements the ncr operation.

#### `public void ccr(List<Credo> cr)`
- Role: Handles the ccr path.
- Description: Implements the ccr operation.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Starts a drag or click interaction on the minimap.

#### `public ExpGrid(Coord sz)`
- Role: Handles the exp grid path.
- Description: Implements the exp grid operation.

#### `protected void drawitem(GOut g, Experience exp)`
- Role: Handles the drawitem path.
- Description: Draws the item.

#### `protected void update()`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `protected void attached()`
- Role: Handles the attached path.
- Description: Implements the attached operation.

#### `public SkillWnd()`
- Role: Creates a new SkillWnd instance.
- Description: Constructs the SkillWnd instance from the supplied inputs.

#### `private List<Skill> decsklist(Object[] args, int a, boolean has)`
- Role: Handles the decsklist path.
- Description: Implements the decsklist operation.

#### `private List<Credo> deccrlist(Object[] args, int a, boolean has)`
- Role: Handles the deccrlist path.
- Description: Implements the deccrlist operation.

#### `private List<Experience> decexplist(Object[] args, int a)`
- Role: Handles the decexplist path.
- Description: Implements the decexplist operation.

#### `public void addchild(Widget child, Object... args)`
- Role: Handles the addchild path.
- Description: Adds the child.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.