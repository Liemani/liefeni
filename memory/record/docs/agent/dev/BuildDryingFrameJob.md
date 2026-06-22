---
source: [BuildDryingFrameJob.java](../../../../../src/agent/dev/BuildDryingFrameJob.java)
created: 2026-06-13
updated: 2026-06-14
---

# BuildDryingFrameJob

Implements a development-time agent helper for build drying frame job.

## Members

### Constants

### Fields

#### `final int SELF_WIDTH = BW_HORSE`
- Role: Caches the self width value.
- Description: Caches the `SELF_WIDTH` value for reuse.

#### `final int SELF_HEIGHT = BH_HORSE`
- Role: Caches the self height value.
- Description: Caches the `SELF_HEIGHT` value for reuse.

#### `final Coord BB_SELF = BB_HORSE`
- Role: Caches the bb self value.
- Description: Caches the `BB_SELF` value for reuse.

#### `final int PADDING = 2`
- Role: Caches the padding value.
- Description: Caches the `PADDING` value for reuse.

#### `final int PASSAGE_WIDTH = SELF_WIDTH + PADDING`
- Role: Caches the passage width value.
- Description: Caches the `PASSAGE_WIDTH` value for reuse.

#### `final int HEIGHT_SET = BW_DRYING_FRAME + PASSAGE_WIDTH + BW_DRYING_FRAME`
- Role: Caches the height set value.
- Description: Caches the `HEIGHT_SET` value for reuse.

#### `private Rect _inputArea, _workingArea, _outputArea`
- Role: Caches the output area value.
- Description: Caches the `_outputArea` value for reuse.

#### `private Rect _inputArea, _workingArea, _outputArea`
- Role: Caches the output area value.
- Description: Caches the `_outputArea` value for reuse.

#### `private Rect _inputArea, _workingArea, _outputArea`
- Role: Caches the output area value.
- Description: Caches the `_outputArea` value for reuse.

#### `private Coord _orderCoordMax, _orderCoord = Coord.zero()`
- Role: Implements the order coord operation.
- Description: Implements the zero operation.

#### `private Coord _orderCoordMax, _orderCoord = Coord.zero()`
- Role: Implements the order coord operation.
- Description: Implements the zero operation.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Implements the leaf operation.
- Description: Implements the zero operation.

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private void _willRun()`
- Role: Handles the will run path.
- Description: Implements the will run operation.

#### `private Rect _getOutputArea(Rect wa)`
- Role: Handles the get output area path.
- Description: Implements the get output area operation.

#### `private Coord _calculateOrderCoordMax(Rect oa)`
- Role: Handles the calculate order coord max path.
- Description: Implements the calculate order coord max operation.

#### `private void _loop()`
- Role: Handles the loop path.
- Description: Implements the loop operation.

#### `private void _bringMaterial()`
- Role: Handles the bring material path.
- Description: Implements the bring material operation.

#### `private void _takeItemFromStockpile(String name, int count)`
- Role: Handles the take item from stockpile path.
- Description: Implements the take item from stockpile operation.

#### `private void _takeItemFromContainer(String[] ns, int count)`
- Role: Handles the take item from container path.
- Description: Implements the take item from container operation.

#### `private void _calculateNextLeaf()`
- Role: Handles the calculate next leaf path.
- Description: Implements the calculate next leaf operation.

#### `private void _calculateLeaf()`
- Role: Handles the calculate leaf path.
- Description: Implements the calculate leaf operation.

#### `public static String info()`
- Role: Handles the info path.
- Description: Implements the info operation.