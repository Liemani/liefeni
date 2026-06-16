# BuildDryingFrameJob

This file documents the responsibilities and members of `BuildDryingFrameJob`.

## Meta

- Source: [BuildDryingFrameJob.java](../../../../src/agent/dev/BuildDryingFrameJob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Implements a development-time agent helper for build drying frame job.

## Members

### Constants

### Fields

#### `final int SELF_WIDTH = BW_HORSE`
- Role: Stores the self width value.
- Description: Backs the cached state for this file.

#### `final int SELF_HEIGHT = BH_HORSE`
- Role: Stores the self height value.
- Description: Backs the cached state for this file.

#### `final Coord BB_SELF = BB_HORSE`
- Role: Stores the bb self value.
- Description: Backs the cached state for this file.

#### `final int PADDING = 2`
- Role: Stores the padding value.
- Description: Backs the cached state for this file.

#### `final int PASSAGE_WIDTH = SELF_WIDTH + PADDING`
- Role: Stores the passage width value.
- Description: Backs the cached state for this file.

#### `final int HEIGHT_SET = BW_DRYING_FRAME + PASSAGE_WIDTH + BW_DRYING_FRAME`
- Role: Stores the height set value.
- Description: Backs the cached state for this file.

#### `private Rect _inputArea, _workingArea, _outputArea`
- Role: Stores the output area value.
- Description: Backs the cached state for this file.

#### `private Rect _inputArea, _workingArea, _outputArea`
- Role: Stores the output area value.
- Description: Backs the cached state for this file.

#### `private Rect _inputArea, _workingArea, _outputArea`
- Role: Stores the output area value.
- Description: Backs the cached state for this file.

#### `private Coord _orderCoordMax, _orderCoord = Coord.zero()`
- Role: Stores the order coord value.
- Description: Backs the cached state for this file.

#### `private Coord _orderCoordMax, _orderCoord = Coord.zero()`
- Role: Stores the order coord value.
- Description: Backs the cached state for this file.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`
- Role: Stores the leaf value.
- Description: Backs the cached state for this file.

### Methods

#### `public void run(AgentContext ctx, String[] args)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void _willRun()`
- Role: Performs  will run.
- Description: Supports the will run operation used by the surrounding class.

#### `private Rect _getOutputArea(Rect wa)`
- Role: Performs  get output area.
- Description: Supports the get output area operation used by the surrounding class.

#### `private Coord _calculateOrderCoordMax(Rect oa)`
- Role: Performs  calculate order coord max.
- Description: Supports the calculate order coord max operation used by the surrounding class.

#### `private void _loop()`
- Role: Performs  loop.
- Description: Supports the loop operation used by the surrounding class.

#### `private void _bringMaterial()`
- Role: Performs  bring material.
- Description: Supports the bring material operation used by the surrounding class.

#### `private void _takeItemFromStockpile(String name, int count)`
- Role: Performs  take item from stockpile.
- Description: Supports the take item from stockpile operation used by the surrounding class.

#### `private void _takeItemFromContainer(String[] ns, int count)`
- Role: Performs  take item from container.
- Description: Supports the take item from container operation used by the surrounding class.

#### `private void _calculateNextLeaf()`
- Role: Performs  calculate next leaf.
- Description: Supports the calculate next leaf operation used by the surrounding class.

#### `private void _calculateLeaf()`
- Role: Performs  calculate leaf.
- Description: Supports the calculate leaf operation used by the surrounding class.

#### `public static String info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.
