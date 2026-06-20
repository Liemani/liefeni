---
source: [AlignLogJob.java](../../../../src/agent/test/AlignLogJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# AlignLogJob

Implements a test job for align log job.

## Members

### Constants

### Fields

#### `private final AlignLogBehavior alignBehavior = new AlignLogBehavior()`
- Role: Holds the align behavior state.
- Description: Backs the cached state for this file.

#### `private boolean initialized = false`
- Role: Tracks whether initialized is initialized.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private Rect inputArea, workingArea, outputArea`
- Role: Stores the output area value.
- Description: Backs the cached state for this file.

#### `private Rect inputArea, workingArea, outputArea`
- Role: Stores the output area value.
- Description: Backs the cached state for this file.

#### `private Rect inputArea, workingArea, outputArea`
- Role: Stores the output area value.
- Description: Backs the cached state for this file.

#### `private Coord orderCoordMax, orderCoord = Coord.zero()`
- Role: Stores the order coord value.
- Description: Backs the cached state for this file.

#### `private Coord orderCoordMax, orderCoord = Coord.zero()`
- Role: Stores the order coord value.
- Description: Backs the cached state for this file.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private final int SELF_WIDTH = BW_HORSE`
- Role: Stores the self width value.
- Description: Backs the cached state for this file.

#### `private final int SELF_HEIGHT = BH_HORSE`
- Role: Stores the self height value.
- Description: Backs the cached state for this file.

#### `private final Coord BB_SELF = BB_HORSE`
- Role: Stores the bb self value.
- Description: Backs the cached state for this file.

#### `private final double SELF_DIAGONAL = BB_SELF.diagonal()`
- Role: Stores the self diagonal value.
- Description: Backs the cached state for this file.

#### `private final int PADDING = 2`
- Role: Stores the padding value.
- Description: Backs the cached state for this file.

#### `private final int ROUTE_WIDTH = SELF_WIDTH + PADDING`
- Role: Stores the route width value.
- Description: Backs the cached state for this file.

#### `private final int HEIGHT_SET = BH_LOG + ROUTE_WIDTH + BH_LOG`
- Role: Stores the height set value.
- Description: Backs the cached state for this file.

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void _setup()`
- Role: Performs  setup.
- Description: Supports the setup operation used by the surrounding class.

#### `private void _loop(AgentContext ctx)`
- Role: Performs  loop.
- Description: Supports the loop operation used by the surrounding class.

#### `private Gob _findLog()`
- Role: Performs  find log.
- Description: Supports the find log operation used by the surrounding class.

#### `private void _calculateNextLeaf()`
- Role: Performs  calculate next leaf.
- Description: Supports the calculate next leaf operation used by the surrounding class.

#### `private void _updateLeafCoords()`
- Role: Performs  update leaf coords.
- Description: Supports the update leaf coords operation used by the surrounding class.

#### `private Rect _calculateOutputArea(Rect wa)`
- Role: Performs  calculate output area.
- Description: Supports the calculate output area operation used by the surrounding class.

#### `private Coord _calculateOrderCoordMax(Rect oa)`
- Role: Performs  calculate order coord max.
- Description: Supports the calculate order coord max operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.
