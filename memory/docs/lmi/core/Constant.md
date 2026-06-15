# Constant

This file documents the responsibilities and members of `Constant`.

## Meta

- Source: [Constant.java](../../../../src/lmi/core/Constant.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines shared constants.

## Nested Types

### Action

- Description: TODO

### BoundingBox

- Description: TODO

### ExceptionReason

- Description: TODO

### Gauge

- Description: TODO

### HitPointIndex

- Description: TODO

### Interaction

- Description: TODO

### MeshId

- Description: TODO

### Message

- Description: TODO

### Plan

- Description: TODO

### Timeout

- Description: TODO

### WaypointEdgeDirection

- Description: TODO

### WindowTitle

- Description: TODO

### arch

- Description: TODO

### borka

- Description: TODO

### bumlings

- Description: TODO

### bushes

- Description: TODO

### furn

- Description: TODO

### gfx

- Description: TODO

### herbs

- Description: TODO

### hud

- Description: TODO

### invobjs

- Description: TODO

### items

- Description: TODO

### meter

- Description: TODO

### plants

- Description: TODO

### stockpile

- Description: TODO

### terobjs

- Description: TODO

### trees

- Description: TODO

### vehicle

- Description: TODO

## Members

### Constants

#### `public static final String M_ACT = "act"; //`

- Description: TODO

#### `public static final String M_AFK = "afk"`

- Description: TODO

#### `public static final String M_ERROR = "error"`

- Description: TODO

#### `public static final String M_LOGIN = "login"`

- Description: TODO

#### `public static final String M_PLAY = "play"; //`

- Description: TODO

#### `public static final String A_AGGRO = "aggro"`

- Description: TODO

#### `public static final String A_BP = "bp"`

- Description: TODO

#### `public static final String A_CARRY = "carry"`

- Description: TODO

#### `public static final String A_CRAFT = "craft"`

- Description: TODO

#### `public static final String A_CRIME = "crime"`

- Description: TODO

#### `public static final String A_DESTROY = "destroy"`

- Description: TODO

#### `public static final String A_DIG = "dig"`

- Description: TODO

#### `public static final String A_FISH = "fish"`

- Description: TODO

#### `public static final String A_INSPECT = "inspect"`

- Description: TODO

#### `public static final String A_MINE = "mine"`

- Description: TODO

#### `public static final String A_POSE = "pose"`

- Description: TODO

#### `public static final String A_REPAIR = "repair"`

- Description: TODO

#### `public static final String A_SHOOT = "shoot"`

- Description: TODO

#### `public static final String A_SWIM = "swim"`

- Description: TODO

#### `public static final String A_TRACKING = "tracking"`

- Description: TODO

#### `public static final String P_DFRAME = "dframe"`

- Description: TODO

#### `public static final String WT_DRYING_FRAME = "Drying Frame"`

- Description: TODO

#### `public static final int GI_HARD = 0`

- Description: TODO

#### `public static final int GI_SOFT = 1`

- Description: TODO

#### `public static final String CHIP_STONE = "Chip stone"`

- Description: TODO

#### `public static final String CHOP_INTO_BLOCKS = "Chop into blocks"`

- Description: TODO

#### `public static final String MAKE_BOARDS = "Make boards"`

- Description: TODO

#### `public static final String PICK = "Pick"`

- Description: TODO

#### `public static final String PICK_ALMOND = "Pick almond"`

- Description: TODO

#### `public static final String PICK_BERRIES = "Pick berries"`

- Description: TODO

#### `public static final String PICK_CATKIN = "Pick catkin"`

- Description: TODO

#### `public static final String PICK_CHESTNUT = "Pick chestnut"`

- Description: TODO

#### `public static final String PICK_CONE = "Pick cone"`

- Description: TODO

#### `public static final String PICK_DRUPES = "Pick drupes"`

- Description: TODO

#### `public static final String PICK_FRUIT = "Pick fruit"`

- Description: TODO

#### `public static final String PICK_FRUITS = "Pick fruits"`

- Description: TODO

#### `public static final String PICK_LEAF = "Pick leaf"`

- Description: TODO

#### `public static final String PICK_SAMARA = "Pick samara"`

- Description: TODO

#### `public static final String PICK_SEEDS = "Pick seeds"`

- Description: TODO

#### `public static final String TAKE_BARK = "Take bark"`

- Description: TODO

#### `public static final String TAKE_BOUGH = "Take bough"`

- Description: TODO

#### `public static final String TAKE_BRANCH = "Take branch"`

- Description: TODO

#### `public static final double TILE_IN_COORD2D = 11.0`

- Description: TODO

#### `public static final int TILE_IN_COORD = 1024`

- Description: TODO

#### `public static final double COORD2D_PER_COORD = TILE_IN_COORD2D / TILE_IN_COORD`

- Description: TODO

#### `public static final double COORD_PER_COORD2D = TILE_IN_COORD / TILE_IN_COORD2D`

- Description: TODO

#### `public static final int CHUNK_SIDE = 9`

- Description: TODO

#### `public static final int VISIBLE_CHUNK_SIDE = 10`

- Description: TODO

#### `public static final int PURE_CHUNK_SIDE = VISIBLE_CHUNK_SIDE - 1`

- Description: TODO

#### `public static final int VISIBLE_TILE_SIDE = CHUNK_SIDE * VISIBLE_CHUNK_SIDE`

- Description: TODO

#### `public static final int PURE_TILE_SIDE = CHUNK_SIDE * PURE_CHUNK_SIDE`

- Description: TODO

#### `public static final int MAP_CHUNK_SIDE = 25`

- Description: TODO

#### `public static final int MAP_VISIBLE_CHUNK_SIDE = 5`

- Description: TODO

#### `public static final int RETRY_MAX = 5`

- Description: TODO

#### `public static final int D_EAST = 0`

- Description: TODO

#### `public static final int D_SOUTH = 16384`

- Description: TODO

#### `public static final int D_WEST = 32768`

- Description: TODO

#### `public static final int D_NORTH = -16384`

- Description: TODO

#### `public static final long TO_INFINITE = 0`

- Description: TODO

#### `public static final long TO_IMPERCEPTIBLE = 10`

- Description: TODO

#### `public static final long TO_POLL = 100`

- Description: TODO

#### `public static final long TO_TEMPORARY = 500`

- Description: TODO

#### `public static final long TO_RETRY = 1000`

- Description: TODO

#### `public static final long TO_WAIT = 300000`

- Description: TODO

#### `public static final long TO_MAX = Long.MAX_VALUE`

- Description: TODO

#### `public static final int MI_NONE = -1`

- Description: TODO

#### `public static final int MI_DEFAULT = 0`

- Description: TODO

#### `public static final int BLOCKED = 0`

- Description: TODO

#### `public static final int FORWARD = 1`

- Description: TODO

#### `public static final int BACKWARD = 2`

- Description: TODO

#### `public static final int BIDIRECTIONAL = 3`

- Description: TODO

#### `public static final int BW_LOG = 352`

- Description: TODO

#### `public static final int BH_LOG = 1656`

- Description: TODO

#### `public static final Coord BB_LOG = Coord.of(BW_LOG, BH_LOG)`

- Description: TODO

#### `public static final int BW_OLDTRUNK = 352`

- Description: TODO

#### `public static final int BH_OLDTRUNK = 1842`

- Description: TODO

#### `public static final Coord BB_OLDTRUNK = Coord.of(BW_OLDTRUNK, BH_OLDTRUNK)`

- Description: TODO

#### `public static final int BW_BODY = 512`

- Description: TODO

#### `public static final int BH_BODY = 512`

- Description: TODO

#### `public static final Coord BB_BODY = Coord.of(BW_BODY, BH_BODY)`

- Description: TODO

#### `public static final int BW_HORSE = 726`

- Description: TODO

#### `public static final int BH_HORSE = 1470`

- Description: TODO

#### `public static final Coord BB_HORSE = Coord.of(BW_HORSE, BH_HORSE)`

- Description: TODO

#### `public static final int BW_CRATE = 1284`

- Description: TODO

#### `public static final int BH_CRATE = 726`

- Description: TODO

#### `public static final Coord BB_CRATE = Coord.of(BW_CRATE, BH_CRATE)`

- Description: TODO

#### `public static final int BW_DRYING_FRAME = 2028`

- Description: TODO

#### `public static final int BH_DRYING_FRAME = 540`

- Description: TODO

#### `public static final Coord BB_DRYING_FRAME = Coord.of(BW_DRYING_FRAME, BH_DRYING_FRAME)`

- Description: TODO

#### `public static final String RN_HIT_POINT = "hp"`

- Description: TODO

#### `public static final String RN_STAMINA = "stam"`

- Description: TODO

#### `public static final String RN_ENERGY = "nrj"`

- Description: TODO

#### `public static final String RN_BODY = "body"`

- Description: TODO

#### `public static final String RN_IDLE = "idle"`

- Description: TODO

#### `public static final String RN_WALKING = "walking"`

- Description: TODO

#### `public static final String RN_BUCKETCARRY = "bucketcarry"`

- Description: TODO

#### `public static final String RN_TURN = "turn"`

- Description: TODO

#### `public static final String RN_CHOPPAN = "choppan"`

- Description: TODO

#### `public static final String RN_SAWING = "sawing"`

- Description: TODO

#### `public static final String RN_BUILDAN = "buildan"`

- Description: TODO

#### `public static final String RN_THINKAN = "thinkan"`

- Description: TODO

#### `public static final String RN_BANZAI = "banzai"`

- Description: TODO

#### `public static final String RN_TREEPICKAN = "treepickan"`

- Description: TODO

#### `public static final String RN_BARKCORDAGE = "barkcordage"`

- Description: TODO

#### `public static final String RN_HEMPFIBRE = "hempfibre"`

- Description: TODO

#### `public static final String RN_HIDESTRAP = "hidestrap"`

- Description: TODO

#### `public static final String RN_REEDTWINE = "reedtwine"`

- Description: TODO

#### `public static final String RN_STRAWSTRING = "strawstring"`

- Description: TODO

#### `public static final String RN_TOUGHROOT = "toughroot"`

- Description: TODO

#### `public static final String RN_CATTAILFIBRE = "cattailfibre"`

- Description: TODO

#### `public static final String RN_SPINDLYTAPROOT = "spindlytaproot"`

- Description: TODO

#### `public static final String RN_STINGINGNETTLE = "stingingnettle"`

- Description: TODO

#### `public static final String RN_PALISADEBIGGATE = "palisadebiggate"`

- Description: TODO

#### `public static final String RN_PALISADECP = "palisadecp"`

- Description: TODO

#### `public static final String RN_PALISADESEG = "palisadeseg"`

- Description: TODO

#### `public static final String RN_POLEBIGGATE = "polebiggate"`

- Description: TODO

#### `public static final String RN_POLECP = "polecp"`

- Description: TODO

#### `public static final String RN_POLESEG = "poleseg"`

- Description: TODO

#### `public static final String RN_BASALT = "basalt"`

- Description: TODO

#### `public static final String RN_DOLOMITE = "dolomite"`

- Description: TODO

#### `public static final String RN_FLINT = "flint"`

- Description: TODO

#### `public static final String RN_GRANITE = "granite"`

- Description: TODO

#### `public static final String RN_LIMESTONE = "limestone"`

- Description: TODO

#### `public static final String RN_QUARTZ = "quartz"`

- Description: TODO

#### `public static final String RN_SCHIST = "schist"`

- Description: TODO

#### `public static final String RN_ARROWWOOD = "arrowwood"`

- Description: TODO

#### `public static final String RN_BLACKCURRANT = "blackcurrant"`

- Description: TODO

#### `public static final String RN_ELDERBERRYBUSH = "elderberrybush"`

- Description: TODO

#### `public static final String RN_GORSE = "gorse"`

- Description: TODO

#### `public static final String RN_HOLLY = "holly"`

- Description: TODO

#### `public static final String RN_REDCURRANT = "redcurrant"`

- Description: TODO

#### `public static final String RN_SPINDLEBUSH = "spindlebush"`

- Description: TODO

#### `public static final String RN_BOUGHBED = "boughbed"`

- Description: TODO

#### `public static final String RN_BLACKCURRANTBERRY = "blackcurrantberry"`

- Description: TODO

#### `public static final String RN_BRANCH = "branch"`

- Description: TODO

#### `public static final String RN_CLOGS = "clogs"`

- Description: TODO

#### `public static final String RN_LIMESTONE = "limestone"`

- Description: TODO

#### `public static final String RN_QUARTZ = "quartz"`

- Description: TODO

#### `public static final String RN_SQUIRRELTAIL_BLOOD = "squirreltail-blood"`

- Description: TODO

#### `public static final String RN_BARLEY = "barley"`

- Description: TODO

#### `public static final String RN_BEET = "beet"`

- Description: TODO

#### `public static final String RN_CARROT = "carrot"`

- Description: TODO

#### `public static final String RN_FLAX = "flax"`

- Description: TODO

#### `public static final String RN_HEMP = "hemp"`

- Description: TODO

#### `public static final String RN_LEEK = "leek"`

- Description: TODO

#### `public static final String RN_LETTUCE = "lettuce"`

- Description: TODO

#### `public static final String RN_PIPEWEED = "pipeweed"`

- Description: TODO

#### `public static final String RN_POPPY = "poppy"`

- Description: TODO

#### `public static final String RN_PUMPKIN = "pumpkin"`

- Description: TODO

#### `public static final String RN_REDONION = "redonion"`

- Description: TODO

#### `public static final String RN_TURNIP = "turnip"`

- Description: TODO

#### `public static final String RN_WHEAT = "wheat"`

- Description: TODO

#### `public static final String RN_YELLOWONION = "yellowonion"`

- Description: TODO

#### `public static final String RN_ANYLEATHER = "anyleather"`

- Description: TODO

#### `public static final String RN_BOARD = "board"`

- Description: TODO

#### `public static final String RN_BRANCH = "branch"`

- Description: TODO

#### `public static final String RN_BRICK = "brick"`

- Description: TODO

#### `public static final String RN_METAL = "metal"`

- Description: TODO

#### `public static final String RN_NUGGET_METAL = "nugget-metal"`

- Description: TODO

#### `public static final String RN_ORE = "ore"`

- Description: TODO

#### `public static final String RN_SOIL = "soil"`

- Description: TODO

#### `public static final String RN_STONE = "stone"`

- Description: TODO

#### `public static final String RN_WBLOCK = "wblock"`

- Description: TODO

#### `public static final String RN_LOG = "log"`

- Description: TODO

#### `public static final String RN_STUMP = "stump"`

- Description: TODO

#### `public static final String RN_ALMONDTREE = "almondtree"`

- Description: TODO

#### `public static final String RN_APPLETREE = "appletree"`

- Description: TODO

#### `public static final String RN_BAYWILLOW = "baywillow"`

- Description: TODO

#### `public static final String RN_BEECH = "beech"`

- Description: TODO

#### `public static final String RN_BIRCH = "birch"`

- Description: TODO

#### `public static final String RN_BLACKPINE = "blackpine"`

- Description: TODO

#### `public static final String RN_CHECKERTREE = "checkertree"`

- Description: TODO

#### `public static final String RN_CHESTNUTTREE = "chestnuttree"`

- Description: TODO

#### `public static final String RN_CRABAPPLETREE = "crabappletree"`

- Description: TODO

#### `public static final String RN_DOGWOOD= "dogwood"`

- Description: TODO

#### `public static final String RN_GRAYALDER = "grayalder"`

- Description: TODO

#### `public static final String RN_HAZEL = "hazel"`

- Description: TODO

#### `public static final String RN_PLUMTREE = "plumtree"`

- Description: TODO

#### `public static final String RN_POPLAR = "poplar"`

- Description: TODO

#### `public static final String RN_ROWAN = "rowan"`

- Description: TODO

#### `public static final String RN_SALLOW = "sallow"`

- Description: TODO

#### `public static final String RN_TEREBINTH = "terebinth"`

- Description: TODO

#### `public static final String RN_WILLOW = "willow"`

- Description: TODO

#### `public static final String RN_OLDSTUMP = "oldstump"`

- Description: TODO

#### `public static final String RN_OLDTRUNK = "oldtrunk"`

- Description: TODO

#### `public static final String RN_CART = "cart"`

- Description: TODO

#### `public static final String RN_DUGOUT = "dugout"`

- Description: TODO

#### `public static final String RN_PLOW = "plow"`

- Description: TODO

#### `public static final String RN_ROWBOAT = "rowboat"`

- Description: TODO

#### `public static final String RN_BARREL = "barrel"`

- Description: TODO

#### `public static final String RN_BEEHIVE = "beehive"`

- Description: TODO

#### `public static final String RN_CASTINGMOLD_SMALL = "castingmold-small"`

- Description: TODO

#### `public static final String RN_CHEST = "chest"`

- Description: TODO

#### `public static final String RN_CRATE = "crate"`

- Description: TODO

#### `public static final String RN_CRUCIBLE = "crucible"`

- Description: TODO

#### `public static final String RN_HEARTH_FIRE = "pow"`

- Description: TODO

#### `public static final String RN_PRIMSMELTER = "primsmelter"`

- Description: TODO

#### `public static final String RN_SURVOBJ = "survobj"`

- Description: TODO

#### `public static final String RN_TROUGH = "trough"`

- Description: TODO

#### `public static final String RN_STOCKPILE_BOUGH = "stockpile-bough"`

- Description: TODO

#### `public static final String RN_STOCKPILE_BRANCH = "stockpile-branch"`

- Description: TODO

#### `public static final String RN_CUPBOARD = "cupboard"`

- Description: TODO

#### `public static final String[] nameSet_container =`

- Description: TODO

#### `public static final String[] nameSet_string =`

- Description: TODO

### Fields

### Methods
