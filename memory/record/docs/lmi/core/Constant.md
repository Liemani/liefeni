---
source: [Constant.java](../../../../../src/lmi/core/Constant.java)
created: 2026-06-13
updated: 2026-06-14
---

# Constant

Defines shared LMI constants and naming conventions.

## Nested Types

### Action
### Action
- Role: Groups action command constants.

- Role: Groups action command constants.
- Description: Action command labels used by menu and automation code.

### BoundingBox
### BoundingBox
- Role: Groups bounding-box constants.

- Role: Groups bounding-box constants.
- Description: Width and height constants used by sprite and icon layout.

### ExceptionReason
### ExceptionReason
- Role: Groups exception-reason constants.

- Role: Groups exception-reason constants.
- Description: Labels used when reporting runtime exception reasons.

### Gauge
### Gauge
- Role: Groups gauge constants.

- Role: Groups gauge constants.
- Description: HUD gauge labels used by status-display code.

### HitPointIndex
### HitPointIndex
- Role: Groups hit-point index constants.

- Role: Groups hit-point index constants.
- Description: Index labels used for health, stamina, and energy bars.

### Interaction
### Interaction
- Role: Groups interaction constants.

- Role: Groups interaction constants.
- Description: Interaction command labels used by menu-grid actions.

### MeshId
### MeshId
- Role: Groups mesh-id constants.

- Role: Groups mesh-id constants.
- Description: Mesh and resource identifiers used by render lookup code.

### Message
### Message
- Role: Groups message constants.

- Role: Groups message constants.
- Description: Message labels used by the client protocol and session flow.

### Plan
### Plan
- Role: Groups plan constants.

- Role: Groups plan constants.
- Description: Plan labels used by waypoint and automation flows.

### Timeout
### Timeout
- Role: Groups timeout constants.

- Role: Groups timeout constants.
- Description: Timeout budgets used by retry and waiting code.

### WaypointEdgeDirection
### WaypointEdgeDirection
- Role: Groups waypoint edge-direction constants.

- Role: Groups waypoint edge-direction constants.
- Description: Encoded direction labels used by waypoint edge handling.

### WindowTitle
### WindowTitle
- Role: Groups window-title constants.

- Role: Groups window-title constants.
- Description: Window title strings shown by client UI panels.

### arch
### arch
- Role: Groups arch resource constants.

- Role: Groups arch resource constants.
- Description: Resource names for arch assets.

### borka
### borka
- Role: Groups borka resource constants.

- Role: Groups borka resource constants.
- Description: Resource names for borka assets.

### bumlings
### bumlings
- Role: Groups bumlings resource constants.

- Role: Groups bumlings resource constants.
- Description: Resource names for bumlings assets.

### bushes
### bushes
- Role: Groups bushes resource constants.

- Role: Groups bushes resource constants.
- Description: Resource names for bushes assets.

### furn
### furn
- Role: Groups furniture resource constants.

- Role: Groups furniture resource constants.
- Description: Resource names for furniture assets.

### gfx
### gfx
- Role: Groups graphics resource constants.

- Role: Groups graphics resource constants.
- Description: Resource names for graphics assets.

### herbs
### herbs
- Role: Groups herb resource constants.

- Role: Groups herb resource constants.
- Description: Resource names for herb assets.

### hud
### hud
- Role: Groups HUD resource constants.

- Role: Groups HUD resource constants.
- Description: Resource names for HUD assets.

### invobjs
### invobjs
- Role: Groups inventory-object resource constants.

- Role: Groups inventory-object resource constants.
- Description: Resource names for inventory-object assets.

### items
### items
- Role: Groups item resource constants.

- Role: Groups item resource constants.
- Description: Resource names for item assets.

### meter
### meter
- Role: Groups meter resource constants.

- Role: Groups meter resource constants.
- Description: Resource names for meter assets.

### plants
### plants
- Role: Groups plant resource constants.

- Role: Groups plant resource constants.
- Description: Resource names for plant assets.

### stockpile
### stockpile
- Role: Groups stockpile resource constants.

- Role: Groups stockpile resource constants.
- Description: Resource names for stockpile assets.

### terobjs
### terobjs
- Role: Groups terrain-object resource constants.

- Role: Groups terrain-object resource constants.
- Description: Resource names for terrain-object assets.

### trees
### trees
- Role: Groups tree resource constants.

- Role: Groups tree resource constants.
- Description: Resource names for tree assets.

### vehicle
### vehicle
- Role: Groups vehicle resource constants.

- Role: Groups vehicle resource constants.
- Description: Resource names for vehicle assets.

## Members

### Constants

#### `public static final String M_ACT = "act"; //`
- Role: Defines the m  a c t constant.
- Description: Action-mode label used when the client sends activity commands.

#### `public static final String M_AFK = "afk"`
- Role: Defines the m  a f k constant.
- Description: Session-state label used when the client is idle.

#### `public static final String M_ERROR = "error"`
- Role: Defines the m  e r r o r constant.
- Description: Session-state label used when the client enters an error state.

#### `public static final String M_LOGIN = "login"`
- Role: Defines the m  l o g i n constant.
- Description: Session-state label used during login.

#### `public static final String M_PLAY = "play"; //`
- Role: Defines the m  p l a y constant.
- Description: Session-state label used during normal play.

#### `public static final String A_AGGRO = "aggro"`
- Role: Defines the a  a g g r o constant.
- Description: Action identifier used by menu and automation commands (a g g r o).

#### `public static final String A_BP = "bp"`
- Role: Defines the a  b p constant.
- Description: Action identifier used by menu and automation commands (b p).

#### `public static final String A_CARRY = "carry"`
- Role: Defines the a  c a r r y constant.
- Description: Action identifier used by menu and automation commands (c a r r y).

#### `public static final String A_CRAFT = "craft"`
- Role: Defines the a  c r a f t constant.
- Description: Action identifier used by menu and automation commands (c r a f t).

#### `public static final String A_CRIME = "crime"`
- Role: Defines the a  c r i m e constant.
- Description: Action identifier used by menu and automation commands (c r i m e).

#### `public static final String A_DESTROY = "destroy"`
- Role: Defines the a  d e s t r o y constant.
- Description: Action identifier used by menu and automation commands (d e s t r o y).

#### `public static final String A_DIG = "dig"`
- Role: Defines the a  d i g constant.
- Description: Action identifier used by menu and automation commands (d i g).

#### `public static final String A_FISH = "fish"`
- Role: Defines the a  f i s h constant.
- Description: Action identifier used by menu and automation commands (f i s h).

#### `public static final String A_INSPECT = "inspect"`
- Role: Defines the a  i n s p e c t constant.
- Description: Action identifier used by menu and automation commands (i n s p e c t).

#### `public static final String A_MINE = "mine"`
- Role: Defines the a  m i n e constant.
- Description: Action identifier used by menu and automation commands (m i n e).

#### `public static final String A_POSE = "pose"`
- Role: Defines the a  p o s e constant.
- Description: Action identifier used by menu and automation commands (p o s e).

#### `public static final String A_REPAIR = "repair"`
- Role: Defines the a  r e p a i r constant.
- Description: Action identifier used by menu and automation commands (r e p a i r).

#### `public static final String A_SHOOT = "shoot"`
- Role: Defines the a  s h o o t constant.
- Description: Action identifier used by menu and automation commands (s h o o t).

#### `public static final String A_SWIM = "swim"`
- Role: Defines the a  s w i m constant.
- Description: Action identifier used by menu and automation commands (s w i m).

#### `public static final String A_TRACKING = "tracking"`
- Role: Defines the a  t r a c k i n g constant.
- Description: Action identifier used by menu and automation commands (t r a c k i n g).

#### `public static final String P_DFRAME = "dframe"`
- Role: Defines the p  d f r a m e constant.
- Description: Menu action text used for d f r a m e.

#### `public static final String WT_DRYING_FRAME = "Drying Frame"`
- Role: Defines the w t  d r y i n g  f r a m e constant.
- Description: Window title string for d r y i n g  f r a m e.

#### `public static final int GI_HARD = 0`
- Role: Defines the g i  h a r d constant.
- Description: Integer category marker used for h a r d.

#### `public static final int GI_SOFT = 1`
- Role: Defines the g i  s o f t constant.
- Description: Integer category marker used for s o f t.

#### `public static final String CHIP_STONE = "Chip stone"`
- Role: Defines the c h i p  s t o n e constant.
- Description: Command text shown for the c h i p  s t o n e action.

#### `public static final String CHOP_INTO_BLOCKS = "Chop into blocks"`
- Role: Defines the c h o p  i n t o  b l o c k s constant.
- Description: Command text shown for the c h o p  i n t o  b l o c k s action.

#### `public static final String MAKE_BOARDS = "Make boards"`
- Role: Defines the m a k e  b o a r d s constant.
- Description: Command text shown for the m a k e  b o a r d s action.

#### `public static final String PICK = "Pick"`
- Role: Defines the pick constant.
- Description: Constant used by this client-side component.

#### `public static final String PICK_ALMOND = "Pick almond"`
- Role: Defines the p i c k  a l m o n d constant.
- Description: Command text shown for the p i c k  a l m o n d action.

#### `public static final String PICK_BERRIES = "Pick berries"`
- Role: Defines the p i c k  b e r r i e s constant.
- Description: Command text shown for the p i c k  b e r r i e s action.

#### `public static final String PICK_CATKIN = "Pick catkin"`
- Role: Defines the p i c k  c a t k i n constant.
- Description: Command text shown for the p i c k  c a t k i n action.

#### `public static final String PICK_CHESTNUT = "Pick chestnut"`
- Role: Defines the p i c k  c h e s t n u t constant.
- Description: Command text shown for the p i c k  c h e s t n u t action.

#### `public static final String PICK_CONE = "Pick cone"`
- Role: Defines the p i c k  c o n e constant.
- Description: Command text shown for the p i c k  c o n e action.

#### `public static final String PICK_DRUPES = "Pick drupes"`
- Role: Defines the p i c k  d r u p e s constant.
- Description: Command text shown for the p i c k  d r u p e s action.

#### `public static final String PICK_FRUIT = "Pick fruit"`
- Role: Defines the p i c k  f r u i t constant.
- Description: Command text shown for the p i c k  f r u i t action.

#### `public static final String PICK_FRUITS = "Pick fruits"`
- Role: Defines the p i c k  f r u i t s constant.
- Description: Command text shown for the p i c k  f r u i t s action.

#### `public static final String PICK_LEAF = "Pick leaf"`
- Role: Defines the p i c k  l e a f constant.
- Description: Command text shown for the p i c k  l e a f action.

#### `public static final String PICK_SAMARA = "Pick samara"`
- Role: Defines the p i c k  s a m a r a constant.
- Description: Command text shown for the p i c k  s a m a r a action.

#### `public static final String PICK_SEEDS = "Pick seeds"`
- Role: Defines the p i c k  s e e d s constant.
- Description: Command text shown for the p i c k  s e e d s action.

#### `public static final String TAKE_BARK = "Take bark"`
- Role: Defines the t a k e  b a r k constant.
- Description: Command text shown for the t a k e  b a r k action.

#### `public static final String TAKE_BOUGH = "Take bough"`
- Role: Defines the t a k e  b o u g h constant.
- Description: Command text shown for the t a k e  b o u g h action.

#### `public static final String TAKE_BRANCH = "Take branch"`
- Role: Defines the t a k e  b r a n c h constant.
- Description: Command text shown for the t a k e  b r a n c h action.

#### `public static final double TILE_IN_COORD2D = 11.0`
- Role: Defines the t i l e  i n  c o o r d2 d constant.
- Description: Number of world-coordinate units represented by one tile.

#### `public static final int TILE_IN_COORD = 1024`
- Role: Defines the t i l e  i n  c o o r d constant.
- Description: Number of local coordinate units represented by one tile.

#### `public static final double COORD2D_PER_COORD = TILE_IN_COORD2D / TILE_IN_COORD`
- Role: Defines the c o o r d2 d  p e r  c o o r d constant.
- Description: Conversion factor from local coordinates to world coordinates.

#### `public static final double COORD_PER_COORD2D = TILE_IN_COORD / TILE_IN_COORD2D`
- Role: Defines the c o o r d  p e r  c o o r d2 d constant.
- Description: Conversion factor from world coordinates to local coordinates.

#### `public static final int CHUNK_SIDE = 9`
- Role: Defines the c h u n k  s i d e constant.
- Description: Dimension constant used when laying out c h u n k grids or chunks.

#### `public static final int VISIBLE_CHUNK_SIDE = 10`
- Role: Defines the v i s i b l e  c h u n k  s i d e constant.
- Description: Dimension constant used when laying out v i s i b l e  c h u n k grids or chunks.

#### `public static final int PURE_CHUNK_SIDE = VISIBLE_CHUNK_SIDE - 1`
- Role: Defines the p u r e  c h u n k  s i d e constant.
- Description: Dimension constant used when laying out p u r e  c h u n k grids or chunks.

#### `public static final int VISIBLE_TILE_SIDE = CHUNK_SIDE * VISIBLE_CHUNK_SIDE`
- Role: Defines the v i s i b l e  t i l e  s i d e constant.
- Description: Dimension constant used when laying out v i s i b l e  t i l e grids or chunks.

#### `public static final int PURE_TILE_SIDE = CHUNK_SIDE * PURE_CHUNK_SIDE`
- Role: Defines the p u r e  t i l e  s i d e constant.
- Description: Dimension constant used when laying out p u r e  t i l e grids or chunks.

#### `public static final int MAP_CHUNK_SIDE = 25`
- Role: Defines the m a p  c h u n k  s i d e constant.
- Description: Dimension constant used when laying out m a p  c h u n k grids or chunks.

#### `public static final int MAP_VISIBLE_CHUNK_SIDE = 5`
- Role: Defines the m a p  v i s i b l e  c h u n k  s i d e constant.
- Description: Dimension constant used when laying out m a p  v i s i b l e  c h u n k grids or chunks.

#### `public static final int RETRY_MAX = 5`
- Role: Defines the r e t r y  m a x constant.
- Description: Maximum number of retry attempts before the caller gives up.

#### `public static final int D_EAST = 0`
- Role: Defines the d  e a s t constant.
- Description: Encoded direction value for e a s t.

#### `public static final int D_SOUTH = 16384`
- Role: Defines the d  s o u t h constant.
- Description: Encoded direction value for s o u t h.

#### `public static final int D_WEST = 32768`
- Role: Defines the d  w e s t constant.
- Description: Encoded direction value for w e s t.

#### `public static final int D_NORTH = -16384`
- Role: Defines the d  n o r t h constant.
- Description: Encoded direction value for n o r t h.

#### `public static final long TO_INFINITE = 0`
- Role: Defines the t o  i n f i n i t e constant.
- Description: Timeout value in milliseconds for the i n f i n i t e wait budget.

#### `public static final long TO_IMPERCEPTIBLE = 10`
- Role: Defines the t o  i m p e r c e p t i b l e constant.
- Description: Timeout value in milliseconds for the i m p e r c e p t i b l e wait budget.

#### `public static final long TO_POLL = 100`
- Role: Defines the t o  p o l l constant.
- Description: Timeout value in milliseconds for the p o l l wait budget.

#### `public static final long TO_TEMPORARY = 500`
- Role: Defines the t o  t e m p o r a r y constant.
- Description: Timeout value in milliseconds for the t e m p o r a r y wait budget.

#### `public static final long TO_RETRY = 1000`
- Role: Defines the t o  r e t r y constant.
- Description: Timeout value in milliseconds for the r e t r y wait budget.

#### `public static final long TO_WAIT = 300000`
- Role: Defines the t o  w a i t constant.
- Description: Timeout value in milliseconds for the w a i t wait budget.

#### `public static final long TO_MAX = Long.MAX_VALUE`
- Role: Defines the t o  m a x constant.
- Description: Timeout value in milliseconds for the m a x wait budget.

#### `public static final int MI_NONE = -1`
- Role: Defines the m i  n o n e constant.
- Description: Map index value used for n o n e lookups.

#### `public static final int MI_DEFAULT = 0`
- Role: Defines the m i  d e f a u l t constant.
- Description: Map index value used for d e f a u l t lookups.

#### `public static final int BLOCKED = 0`
- Role: Defines the b l o c k e d constant.
- Description: Path direction mode used by waypoint routing.

#### `public static final int FORWARD = 1`
- Role: Defines the f o r w a r d constant.
- Description: Path direction mode used by waypoint routing.

#### `public static final int BACKWARD = 2`
- Role: Defines the b a c k w a r d constant.
- Description: Path direction mode used by waypoint routing.

#### `public static final int BIDIRECTIONAL = 3`
- Role: Defines the b i d i r e c t i o n a l constant.
- Description: Path direction mode used by waypoint routing.

#### `public static final int BW_LOG = 352`
- Role: Defines the b w  l o g constant.
- Description: Bounding-box dimension used for l o g assets.

#### `public static final int BH_LOG = 1656`
- Role: Defines the b h  l o g constant.
- Description: Bounding-box dimension used for l o g assets.

#### `public static final Coord BB_LOG = Coord.of(BW_LOG, BH_LOG)`
- Role: Defines the bb log constant.
- Description: Constant used by this client-side component.

#### `public static final int BW_OLDTRUNK = 352`
- Role: Defines the b w  o l d t r u n k constant.
- Description: Bounding-box dimension used for o l d t r u n k assets.

#### `public static final int BH_OLDTRUNK = 1842`
- Role: Defines the b h  o l d t r u n k constant.
- Description: Bounding-box dimension used for o l d t r u n k assets.

#### `public static final Coord BB_OLDTRUNK = Coord.of(BW_OLDTRUNK, BH_OLDTRUNK)`
- Role: Defines the bb oldtrunk constant.
- Description: Constant used by this client-side component.

#### `public static final int BW_BODY = 512`
- Role: Defines the b w  b o d y constant.
- Description: Bounding-box dimension used for b o d y assets.

#### `public static final int BH_BODY = 512`
- Role: Defines the b h  b o d y constant.
- Description: Bounding-box dimension used for b o d y assets.

#### `public static final Coord BB_BODY = Coord.of(BW_BODY, BH_BODY)`
- Role: Defines the bb body constant.
- Description: Constant used by this client-side component.

#### `public static final int BW_HORSE = 726`
- Role: Defines the b w  h o r s e constant.
- Description: Bounding-box dimension used for h o r s e assets.

#### `public static final int BH_HORSE = 1470`
- Role: Defines the b h  h o r s e constant.
- Description: Bounding-box dimension used for h o r s e assets.

#### `public static final Coord BB_HORSE = Coord.of(BW_HORSE, BH_HORSE)`
- Role: Defines the bb horse constant.
- Description: Constant used by this client-side component.

#### `public static final int BW_CRATE = 1284`
- Role: Defines the b w  c r a t e constant.
- Description: Bounding-box dimension used for c r a t e assets.

#### `public static final int BH_CRATE = 726`
- Role: Defines the b h  c r a t e constant.
- Description: Bounding-box dimension used for c r a t e assets.

#### `public static final Coord BB_CRATE = Coord.of(BW_CRATE, BH_CRATE)`
- Role: Defines the bb crate constant.
- Description: Constant used by this client-side component.

#### `public static final int BW_DRYING_FRAME = 2028`
- Role: Defines the b w  d r y i n g  f r a m e constant.
- Description: Bounding-box dimension used for d r y i n g  f r a m e assets.

#### `public static final int BH_DRYING_FRAME = 540`
- Role: Defines the b h  d r y i n g  f r a m e constant.
- Description: Bounding-box dimension used for d r y i n g  f r a m e assets.

#### `public static final Coord BB_DRYING_FRAME = Coord.of(BW_DRYING_FRAME, BH_DRYING_FRAME)`
- Role: Defines the bb drying frame constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_HIT_POINT = "hp"`
- Role: Defines the rn hit point constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_STAMINA = "stam"`
- Role: Defines the rn stamina constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_ENERGY = "nrj"`
- Role: Defines the rn energy constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BODY = "body"`
- Role: Defines the rn body constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_IDLE = "idle"`
- Role: Defines the rn idle constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_WALKING = "walking"`
- Role: Defines the rn walking constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BUCKETCARRY = "bucketcarry"`
- Role: Defines the rn bucketcarry constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_TURN = "turn"`
- Role: Defines the rn turn constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CHOPPAN = "choppan"`
- Role: Defines the rn choppan constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_SAWING = "sawing"`
- Role: Defines the rn sawing constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BUILDAN = "buildan"`
- Role: Defines the rn buildan constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_THINKAN = "thinkan"`
- Role: Defines the rn thinkan constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BANZAI = "banzai"`
- Role: Defines the rn banzai constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_TREEPICKAN = "treepickan"`
- Role: Defines the rn treepickan constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BARKCORDAGE = "barkcordage"`
- Role: Defines the rn barkcordage constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_HEMPFIBRE = "hempfibre"`
- Role: Defines the rn hempfibre constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_HIDESTRAP = "hidestrap"`
- Role: Defines the rn hidestrap constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_REEDTWINE = "reedtwine"`
- Role: Defines the rn reedtwine constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_STRAWSTRING = "strawstring"`
- Role: Defines the rn strawstring constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_TOUGHROOT = "toughroot"`
- Role: Defines the rn toughroot constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CATTAILFIBRE = "cattailfibre"`
- Role: Defines the rn cattailfibre constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_SPINDLYTAPROOT = "spindlytaproot"`
- Role: Defines the rn spindlytaproot constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_STINGINGNETTLE = "stingingnettle"`
- Role: Defines the rn stingingnettle constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_PALISADEBIGGATE = "palisadebiggate"`
- Role: Defines the rn palisadebiggate constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_PALISADECP = "palisadecp"`
- Role: Defines the rn palisadecp constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_PALISADESEG = "palisadeseg"`
- Role: Defines the rn palisadeseg constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_POLEBIGGATE = "polebiggate"`
- Role: Defines the rn polebiggate constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_POLECP = "polecp"`
- Role: Defines the rn polecp constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_POLESEG = "poleseg"`
- Role: Defines the rn poleseg constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BASALT = "basalt"`
- Role: Defines the rn basalt constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_DOLOMITE = "dolomite"`
- Role: Defines the rn dolomite constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_FLINT = "flint"`
- Role: Defines the rn flint constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_GRANITE = "granite"`
- Role: Defines the rn granite constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_LIMESTONE = "limestone"`
- Role: Defines the rn limestone constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_QUARTZ = "quartz"`
- Role: Defines the rn quartz constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_SCHIST = "schist"`
- Role: Defines the rn schist constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_ARROWWOOD = "arrowwood"`
- Role: Defines the rn arrowwood constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BLACKCURRANT = "blackcurrant"`
- Role: Defines the rn blackcurrant constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_ELDERBERRYBUSH = "elderberrybush"`
- Role: Defines the rn elderberrybush constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_GORSE = "gorse"`
- Role: Defines the rn gorse constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_HOLLY = "holly"`
- Role: Defines the rn holly constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_REDCURRANT = "redcurrant"`
- Role: Defines the rn redcurrant constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_SPINDLEBUSH = "spindlebush"`
- Role: Defines the rn spindlebush constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BOUGHBED = "boughbed"`
- Role: Defines the rn boughbed constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BLACKCURRANTBERRY = "blackcurrantberry"`
- Role: Defines the rn blackcurrantberry constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BRANCH = "branch"`
- Role: Defines the rn branch constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CLOGS = "clogs"`
- Role: Defines the rn clogs constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_LIMESTONE = "limestone"`
- Role: Defines the rn limestone constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_QUARTZ = "quartz"`
- Role: Defines the rn quartz constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_SQUIRRELTAIL_BLOOD = "squirreltail-blood"`
- Role: Defines the rn squirreltail blood constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BARLEY = "barley"`
- Role: Defines the rn barley constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BEET = "beet"`
- Role: Defines the rn beet constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CARROT = "carrot"`
- Role: Defines the rn carrot constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_FLAX = "flax"`
- Role: Defines the rn flax constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_HEMP = "hemp"`
- Role: Defines the rn hemp constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_LEEK = "leek"`
- Role: Defines the rn leek constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_LETTUCE = "lettuce"`
- Role: Defines the rn lettuce constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_PIPEWEED = "pipeweed"`
- Role: Defines the rn pipeweed constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_POPPY = "poppy"`
- Role: Defines the rn poppy constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_PUMPKIN = "pumpkin"`
- Role: Defines the rn pumpkin constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_REDONION = "redonion"`
- Role: Defines the rn redonion constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_TURNIP = "turnip"`
- Role: Defines the rn turnip constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_WHEAT = "wheat"`
- Role: Defines the rn wheat constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_YELLOWONION = "yellowonion"`
- Role: Defines the rn yellowonion constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_ANYLEATHER = "anyleather"`
- Role: Defines the rn anyleather constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BOARD = "board"`
- Role: Defines the rn board constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BRANCH = "branch"`
- Role: Defines the rn branch constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BRICK = "brick"`
- Role: Defines the rn brick constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_METAL = "metal"`
- Role: Defines the rn metal constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_NUGGET_METAL = "nugget-metal"`
- Role: Defines the rn nugget metal constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_ORE = "ore"`
- Role: Defines the rn ore constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_SOIL = "soil"`
- Role: Defines the rn soil constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_STONE = "stone"`
- Role: Defines the rn stone constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_WBLOCK = "wblock"`
- Role: Defines the rn wblock constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_LOG = "log"`
- Role: Defines the rn log constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_STUMP = "stump"`
- Role: Defines the rn stump constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_ALMONDTREE = "almondtree"`
- Role: Defines the rn almondtree constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_APPLETREE = "appletree"`
- Role: Defines the rn appletree constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BAYWILLOW = "baywillow"`
- Role: Defines the rn baywillow constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BEECH = "beech"`
- Role: Defines the rn beech constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BIRCH = "birch"`
- Role: Defines the rn birch constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BLACKPINE = "blackpine"`
- Role: Defines the rn blackpine constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CHECKERTREE = "checkertree"`
- Role: Defines the rn checkertree constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CHESTNUTTREE = "chestnuttree"`
- Role: Defines the rn chestnuttree constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CRABAPPLETREE = "crabappletree"`
- Role: Defines the rn crabappletree constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_DOGWOOD= "dogwood"`
- Role: Defines the rn dogwood constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_GRAYALDER = "grayalder"`
- Role: Defines the rn grayalder constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_HAZEL = "hazel"`
- Role: Defines the rn hazel constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_PLUMTREE = "plumtree"`
- Role: Defines the rn plumtree constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_POPLAR = "poplar"`
- Role: Defines the rn poplar constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_ROWAN = "rowan"`
- Role: Defines the rn rowan constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_SALLOW = "sallow"`
- Role: Defines the rn sallow constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_TEREBINTH = "terebinth"`
- Role: Defines the rn terebinth constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_WILLOW = "willow"`
- Role: Defines the rn willow constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_OLDSTUMP = "oldstump"`
- Role: Defines the rn oldstump constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_OLDTRUNK = "oldtrunk"`
- Role: Defines the rn oldtrunk constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CART = "cart"`
- Role: Defines the rn cart constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_DUGOUT = "dugout"`
- Role: Defines the rn dugout constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_PLOW = "plow"`
- Role: Defines the rn plow constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_ROWBOAT = "rowboat"`
- Role: Defines the rn rowboat constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BARREL = "barrel"`
- Role: Defines the rn barrel constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_BEEHIVE = "beehive"`
- Role: Defines the rn beehive constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CASTINGMOLD_SMALL = "castingmold-small"`
- Role: Defines the rn castingmold small constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CHEST = "chest"`
- Role: Defines the rn chest constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CRATE = "crate"`
- Role: Defines the rn crate constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CRUCIBLE = "crucible"`
- Role: Defines the rn crucible constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_HEARTH_FIRE = "pow"`
- Role: Defines the rn hearth fire constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_PRIMSMELTER = "primsmelter"`
- Role: Defines the rn primsmelter constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_SURVOBJ = "survobj"`
- Role: Defines the rn survobj constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_TROUGH = "trough"`
- Role: Defines the rn trough constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_STOCKPILE_BOUGH = "stockpile-bough"`
- Role: Defines the rn stockpile bough constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_STOCKPILE_BRANCH = "stockpile-branch"`
- Role: Defines the rn stockpile branch constant.
- Description: Constant used by this client-side component.

#### `public static final String RN_CUPBOARD = "cupboard"`
- Role: Defines the rn cupboard constant.
- Description: Constant used by this client-side component.

#### `public static final String[] nameSet_container =`
- Role: Caches constant data for the surrounding Constant.
- Description: Caches the computed value for repeated access.

#### `public static final String[] nameSet_string =`
- Role: Caches constant data for the surrounding Constant.
- Description: Caches the computed value for repeated access.

### Fields

### Methods