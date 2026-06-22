---
source: [AlignLogJob.java](../../../../../src/agent/test/AlignLogJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# AlignLogJob

Implements a test job for align log job.

## Members

### Constants

### Fields

#### `private final AlignLogBehavior alignBehavior = new AlignLogBehavior()`
- Role: Implements the align behavior operation.
- Description: Implements the align log behavior operation.

#### `private boolean initialized = false`
- Role: Tracks whether initialized is initialized.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private Rect inputArea, workingArea, outputArea`
- Role: Caches the output area value.
- Description: Caches the `outputArea` value for reuse.

#### `private Rect inputArea, workingArea, outputArea`
- Role: Caches the output area value.
- Description: Caches the `outputArea` value for reuse.

#### `private Rect inputArea, workingArea, outputArea`
- Role: Caches the output area value.
- Description: Caches the `outputArea` value for reuse.

#### `private Coord orderCoordMax, orderCoord = Coord.zero()`
- Role: Implements the order coord operation.
- Description: Implements the zero operation.

#### `private Coord orderCoordMax, orderCoord = Coord.zero()`
- Role: Implements the order coord operation.
- Description: Implements the zero operation.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private final int SELF_WIDTH = BW_HORSE`
- Role: Caches the self width value.
- Description: Caches the `SELF_WIDTH` value for reuse.

#### `private final int SELF_HEIGHT = BH_HORSE`
- Role: Caches the self height value.
- Description: Caches the `SELF_HEIGHT` value for reuse.

#### `private final Coord BB_SELF = BB_HORSE`
- Role: Caches the bb self value.
- Description: Caches the `BB_SELF` value for reuse.

#### `private final double SELF_DIAGONAL = BB_SELF.diagonal()`
- Role: Implements the self diagonal operation.
- Description: Implements the diagonal operation.

#### `private final int PADDING = 2`
- Role: Caches the padding value.
- Description: Caches the `PADDING` value for reuse.

#### `private final int ROUTE_WIDTH = SELF_WIDTH + PADDING`
- Role: Caches the route width value.
- Description: Caches the `ROUTE_WIDTH` value for reuse.

#### `private final int HEIGHT_SET = BH_LOG + ROUTE_WIDTH + BH_LOG`
- Role: Caches the height set value.
- Description: Caches the `HEIGHT_SET` value for reuse.

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private void _setup()`
- Role: Handles the setup path.
- Description: Implements the setup operation.

#### `private void _loop(AgentContext ctx)`
- Role: Handles the loop path.
- Description: Implements the loop operation.

#### `private Gob _findLog()`
- Role: Handles the find log path.
- Description: Implements the find log operation.

#### `private void _calculateNextLeaf()`
- Role: Handles the calculate next leaf path.
- Description: Implements the calculate next leaf operation.

#### `private void _updateLeafCoords()`
- Role: Handles the update leaf coords path.
- Description: Implements the update leaf coords operation.

#### `private Rect _calculateOutputArea(Rect wa)`
- Role: Handles the calculate output area path.
- Description: Implements the calculate output area operation.

#### `private Coord _calculateOrderCoordMax(Rect oa)`
- Role: Handles the calculate order coord max path.
- Description: Implements the calculate order coord max operation.

#### `public static String info()`
- Role: Handles the info path.
- Description: Implements the info operation.