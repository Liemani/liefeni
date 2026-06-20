---
source: [SkillWnd.java](../../../src/haven/SkillWnd.java)
created: 2026-06-13
updated: 2026-06-14
---

# SkillWnd

Represents the skill wnd Haven component.

## Nested Types

### $credo

- Role: Represents $credo within SkillWnd.
- Description: Describes the nested $credo type used by the enclosing class.

### $expls

- Role: Represents $expls within SkillWnd.
- Description: Describes the nested $expls type used by the enclosing class.

### $skill

- Role: Represents $skill within SkillWnd.
- Description: Describes the nested $skill type used by the enclosing class.

### Credo

- Role: Represents credo within SkillWnd.
- Description: Describes the nested credo type used by the enclosing class.

### CredoGrid

- Role: Represents credo grid within SkillWnd.
- Description: Describes the nested credo grid type used by the enclosing class.

### CredoImg

- Role: Represents credo img within SkillWnd.
- Description: Describes the nested credo img type used by the enclosing class.

### ExpGrid

- Role: Represents exp grid within SkillWnd.
- Description: Describes the nested exp grid type used by the enclosing class.

### Experience

- Role: Represents experience within SkillWnd.
- Description: Describes the nested experience type used by the enclosing class.

### Skill

- Role: Represents skill within SkillWnd.
- Description: Describes the nested skill type used by the enclosing class.

### SkillGrid

- Role: Represents skill grid within SkillWnd.
- Description: Describes the nested skill grid type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final SkillGrid skg`
- Role: Stores the skg value.
- Description: Backs the cached state for this file.

#### `public final CredoGrid credos`
- Role: Stores the credos value.
- Description: Backs the cached state for this file.

#### `public final ExpGrid exps`
- Role: Stores the exps value.
- Description: Backs the cached state for this file.

#### `private CharWnd chr`
- Role: Stores the chr value.
- Description: Backs the cached state for this file.

#### `private Widget skill, credo, expls`
- Role: Stores the expls value.
- Description: Backs the cached state for this file.

#### `private Widget skill, credo, expls`
- Role: Stores the expls value.
- Description: Backs the cached state for this file.

#### `private Widget skill, credo, expls`
- Role: Stores the expls value.
- Description: Backs the cached state for this file.

#### `public final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final int cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `public boolean has = false`
- Role: Tracks the has flag.
- Description: Supports the has operation used by the surrounding class.

#### `private String sortkey`
- Role: Stores the sortkey value.
- Description: Backs the cached state for this file.

#### `private Tex small`
- Role: Stores the small value.
- Description: Backs the cached state for this file.

#### `private Text tooltip = null`
- Role: Stores the tooltip value.
- Description: Backs the cached state for this file.

#### `public final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public boolean has = false`
- Role: Tracks the has flag.
- Description: Supports the has operation used by the surrounding class.

#### `private String sortkey`
- Role: Stores the sortkey value.
- Description: Backs the cached state for this file.

#### `private Tex small`
- Role: Stores the small value.
- Description: Backs the cached state for this file.

#### `private Text tooltip = null`
- Role: Stores the tooltip value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final int mtime, score`
- Role: Stores the score value.
- Description: Backs the cached state for this file.

#### `public final int mtime, score`
- Role: Stores the score value.
- Description: Backs the cached state for this file.

#### `private String sortkey = "\uffff"`
- Role: Stores the sortkey value.
- Description: Backs the cached state for this file.

#### `private Tex small`
- Role: Stores the small value.
- Description: Backs the cached state for this file.

#### `private Text tooltip = null`
- Role: Stores the tooltip value.
- Description: Backs the cached state for this file.

#### `public final Group nsk, csk`
- Role: Holds the csk state.
- Description: Backs the cached state for this file.

#### `public final Group nsk, csk`
- Role: Holds the csk state.
- Description: Backs the cached state for this file.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Supports the loading operation used by the surrounding class.

#### `public final Coord crsz = UI.scale(70, 88)`
- Role: Stores the crsz value.
- Description: Backs the cached state for this file.

#### `public final int btnw = UI.scale(100)`
- Role: Stores the btnw value.
- Description: Backs the cached state for this file.

#### `public final Tex credoufr = new TexI(convolvedown(Resource.loadimg("gfx/hud/chr/yrkirframe"), crsz, iconfilter))`
- Role: Stores the credoufr value.
- Description: Backs the cached state for this file.

#### `public final Tex credosfr = new TexI(convolvedown(Resource.loadimg("gfx/hud/chr/yrkirsframe"), crsz, iconfilter))`
- Role: Stores the credosfr value.
- Description: Backs the cached state for this file.

#### `public final Text.Foundry prsf = new Text.Foundry(Text.fraktur, 15).aa(true)`
- Role: Stores the prsf value.
- Description: Backs the cached state for this file.

#### `public final int m = UI.scale(5)`
- Role: Stores the m value.
- Description: Backs the cached state for this file.

#### `public List<Credo> ncr = Collections.emptyList(), ccr = Collections.emptyList()`
- Role: Caches ncr entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<Credo> ncr = Collections.emptyList(), ccr = Collections.emptyList()`
- Role: Caches ncr entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Credo pcr = null`
- Role: Holds the pcr state.
- Description: Backs the cached state for this file.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`
- Role: Stores the cost value.
- Description: Backs the cached state for this file.

#### `public Credo sel = null`
- Role: Holds the sel state.
- Description: Backs the cached state for this file.

#### `private final Img pcrc, ncrc, ccrc`
- Role: Holds the ccrc state.
- Description: Backs the cached state for this file.

#### `private final Img pcrc, ncrc, ccrc`
- Role: Holds the ccrc state.
- Description: Backs the cached state for this file.

#### `private final Img pcrc, ncrc, ccrc`
- Role: Holds the ccrc state.
- Description: Backs the cached state for this file.

#### `private final Button pbtn, qbtn`
- Role: Holds the qbtn state.
- Description: Backs the cached state for this file.

#### `private final Button pbtn, qbtn`
- Role: Holds the qbtn state.
- Description: Backs the cached state for this file.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Supports the loading operation used by the surrounding class.

#### `private final Credo cr`
- Role: Holds the cr state.
- Description: Backs the cached state for this file.

#### `public final Group seen`
- Role: Holds the seen state.
- Description: Backs the cached state for this file.

#### `private boolean loading = false`
- Role: Tracks the loading flag.
- Description: Supports the loading operation used by the surrounding class.

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
- Role: Performs skill.
- Description: Supports the skill operation used by the surrounding class.

#### `public RichText.Document rendertext()`
- Role: Performs rendertext.
- Description: Supports the rendertext operation used by the surrounding class.

#### `public Text tooltip()`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `private Credo(String nm, Indir<Resource> res, boolean has)`
- Role: Performs credo.
- Description: Supports the credo operation used by the surrounding class.

#### `public RichText.Document rendertext()`
- Role: Performs rendertext.
- Description: Supports the rendertext operation used by the surrounding class.

#### `public Text tooltip()`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `private Experience(Indir<Resource> res, int mtime, int score)`
- Role: Performs experience.
- Description: Supports the experience operation used by the surrounding class.

#### `public RichText.Document rendertext()`
- Role: Performs rendertext.
- Description: Supports the rendertext operation used by the surrounding class.

#### `public Text tooltip()`
- Role: Returns the tooltip for the given cursor position.
- Description: Exposes the requested value without mutating state.

#### `public SkillGrid(Coord sz)`
- Role: Performs skill grid.
- Description: Supports the skill grid operation used by the surrounding class.

#### `protected void drawitem(GOut g, Skill sk)`
- Role: Performs drawitem.
- Description: Supports the drawitem operation used by the surrounding class.

#### `protected void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `private void sksort(List<Skill> skills)`
- Role: Performs sksort.
- Description: Supports the sksort operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public CredoGrid(Coord sz)`
- Role: Performs credo grid.
- Description: Supports the credo grid operation used by the surrounding class.

#### `private Tex crtex(Credo cr)`
- Role: Performs crtex.
- Description: Supports the crtex operation used by the surrounding class.

#### `CredoImg(Credo cr)`
- Role: Handles the credo img workflow.
- Description: Supports the credo img operation used by the surrounding class.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `private int crgrid(int y, Collection<Credo> crs)`
- Role: Performs crgrid.
- Description: Supports the crgrid operation used by the surrounding class.

#### `private void sort(List<Credo> buf)`
- Role: Performs sort.
- Description: Supports the sort operation used by the surrounding class.

#### `private void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void change(Credo cr)`
- Role: Performs change.
- Description: Supports the change operation used by the surrounding class.

#### `public void pcr(Credo cr, int crl, int crlt, int crql, int crqlt, int qid)`
- Role: Performs pcr.
- Description: Supports the pcr operation used by the surrounding class.

#### `public void ncr(List<Credo> cr)`
- Role: Performs ncr.
- Description: Supports the ncr operation used by the surrounding class.

#### `public void ccr(List<Credo> cr)`
- Role: Performs ccr.
- Description: Supports the ccr operation used by the surrounding class.

#### `public boolean mousedown(MouseDownEvent ev)`
- Role: Handles mouse-down input.
- Description: Supports the mousedown operation used by the surrounding class.

#### `public ExpGrid(Coord sz)`
- Role: Performs exp grid.
- Description: Supports the exp grid operation used by the surrounding class.

#### `protected void drawitem(GOut g, Experience exp)`
- Role: Performs drawitem.
- Description: Supports the drawitem operation used by the surrounding class.

#### `protected void update()`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public void tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `protected void attached()`
- Role: Performs attached.
- Description: Supports the attached operation used by the surrounding class.

#### `public SkillWnd()`
- Role: Creates a new SkillWnd instance.
- Description: Constructs the instance and initializes its default state.

#### `private List<Skill> decsklist(Object[] args, int a, boolean has)`
- Role: Performs decsklist.
- Description: Supports the decsklist operation used by the surrounding class.

#### `private List<Credo> deccrlist(Object[] args, int a, boolean has)`
- Role: Performs deccrlist.
- Description: Supports the deccrlist operation used by the surrounding class.

#### `private List<Experience> decexplist(Object[] args, int a)`
- Role: Performs decexplist.
- Description: Supports the decexplist operation used by the surrounding class.

#### `public void addchild(Widget child, Object... args)`
- Role: Performs addchild.
- Description: Supports the addchild operation used by the surrounding class.

#### `public void uimsg(String nm, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.
