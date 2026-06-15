# SkillWnd

This file documents the responsibilities and members of `SkillWnd`.

## Meta

- Source: [SkillWnd.java](../../../src/haven/SkillWnd.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the skills window.

## Nested Types

### $credo

- Description: TODO

### $expls

- Description: TODO

### $skill

- Description: TODO

### Credo

- Description: TODO

### CredoGrid

- Description: TODO

### CredoImg

- Description: TODO

### ExpGrid

- Description: TODO

### Experience

- Description: TODO

### Skill

- Description: TODO

### SkillGrid

- Description: TODO

## Members

### Constants

### Fields

#### `public final SkillGrid skg`

- Description: TODO

#### `public final CredoGrid credos`

- Description: TODO

#### `public final ExpGrid exps`

- Description: TODO

#### `private CharWnd chr`

- Description: TODO

#### `private Widget skill, credo, expls`

- Description: TODO

#### `private Widget skill, credo, expls`

- Description: TODO

#### `private Widget skill, credo, expls`

- Description: TODO

#### `public final String nm`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final int cost`

- Description: TODO

#### `public boolean has = false`

- Description: TODO

#### `private String sortkey`

- Description: TODO

#### `private Tex small`

- Description: TODO

#### `private Text tooltip = null`

- Description: TODO

#### `public final String nm`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public boolean has = false`

- Description: TODO

#### `private String sortkey`

- Description: TODO

#### `private Tex small`

- Description: TODO

#### `private Text tooltip = null`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final int mtime, score`

- Description: TODO

#### `public final int mtime, score`

- Description: TODO

#### `private String sortkey = "\uffff"`

- Description: TODO

#### `private Tex small`

- Description: TODO

#### `private Text tooltip = null`

- Description: TODO

#### `public final Group nsk, csk`

- Description: TODO

#### `public final Group nsk, csk`

- Description: TODO

#### `private boolean loading = false`

- Description: TODO

#### `public final Coord crsz = UI.scale(70, 88)`

- Description: TODO

#### `public final int btnw = UI.scale(100)`

- Description: TODO

#### `public final Tex credoufr = new TexI(convolvedown(Resource.loadimg("gfx/hud/chr/yrkirframe"), crsz, iconfilter))`

- Description: TODO

#### `public final Tex credosfr = new TexI(convolvedown(Resource.loadimg("gfx/hud/chr/yrkirsframe"), crsz, iconfilter))`

- Description: TODO

#### `public final Text.Foundry prsf = new Text.Foundry(Text.fraktur, 15).aa(true)`

- Description: TODO

#### `public final int m = UI.scale(5)`

- Description: TODO

#### `public List<Credo> ncr = Collections.emptyList(), ccr = Collections.emptyList()`

- Description: TODO

#### `public List<Credo> ncr = Collections.emptyList(), ccr = Collections.emptyList()`

- Description: TODO

#### `public Credo pcr = null`

- Description: TODO

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`

- Description: TODO

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`

- Description: TODO

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`

- Description: TODO

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`

- Description: TODO

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`

- Description: TODO

#### `public int pcl, pclt, pcql, pcqlt, pqid, cost`

- Description: TODO

#### `public Credo sel = null`

- Description: TODO

#### `private final Img pcrc, ncrc, ccrc`

- Description: TODO

#### `private final Img pcrc, ncrc, ccrc`

- Description: TODO

#### `private final Img pcrc, ncrc, ccrc`

- Description: TODO

#### `private final Button pbtn, qbtn`

- Description: TODO

#### `private final Button pbtn, qbtn`

- Description: TODO

#### `private boolean loading = false`

- Description: TODO

#### `private final Credo cr`

- Description: TODO

#### `public final Group seen`

- Description: TODO

#### `private boolean loading = false`

- Description: TODO

### Methods

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `public Widget create(UI ui, Object[] args)`

- Description: TODO

#### `private Skill(String nm, Indir<Resource> res, int cost, boolean has)`

- Description: TODO

#### `public RichText.Document rendertext()`

- Description: TODO

#### `public Text tooltip()`

- Description: TODO

#### `private Credo(String nm, Indir<Resource> res, boolean has)`

- Description: TODO

#### `public RichText.Document rendertext()`

- Description: TODO

#### `public Text tooltip()`

- Description: TODO

#### `private Experience(Indir<Resource> res, int mtime, int score)`

- Description: TODO

#### `public RichText.Document rendertext()`

- Description: TODO

#### `public Text tooltip()`

- Description: TODO

#### `public SkillGrid(Coord sz)`

- Description: TODO

#### `protected void drawitem(GOut g, Skill sk)`

- Description: TODO

#### `protected void update()`

- Description: TODO

#### `private void sksort(List<Skill> skills)`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public CredoGrid(Coord sz)`

- Description: TODO

#### `private Tex crtex(Credo cr)`

- Description: TODO

#### `CredoImg(Credo cr)`

- Description: TODO

#### `public void draw(GOut g)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `private int crgrid(int y, Collection<Credo> crs)`

- Description: TODO

#### `private void sort(List<Credo> buf)`

- Description: TODO

#### `private void update()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `public void change(Credo cr)`

- Description: TODO

#### `public void pcr(Credo cr, int crl, int crlt, int crql, int crqlt, int qid)`

- Description: TODO

#### `public void ncr(List<Credo> cr)`

- Description: TODO

#### `public void ccr(List<Credo> cr)`

- Description: TODO

#### `public boolean mousedown(MouseDownEvent ev)`

- Description: TODO

#### `public ExpGrid(Coord sz)`

- Description: TODO

#### `protected void drawitem(GOut g, Experience exp)`

- Description: TODO

#### `protected void update()`

- Description: TODO

#### `public void tick(double dt)`

- Description: TODO

#### `protected void attached()`

- Description: TODO

#### `public SkillWnd()`

- Description: TODO

#### `private List<Skill> decsklist(Object[] args, int a, boolean has)`

- Description: TODO

#### `private List<Credo> deccrlist(Object[] args, int a, boolean has)`

- Description: TODO

#### `private List<Experience> decexplist(Object[] args, int a)`

- Description: TODO

#### `public void addchild(Widget child, Object... args)`

- Description: TODO

#### `public void uimsg(String nm, Object... args)`

- Description: TODO
