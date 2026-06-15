# BuildDryingFrameJob

This file documents the responsibilities and members of `BuildDryingFrameJob`.

## Meta

- Source: [BuildDryingFrameJob.java](../../../../src/agent/dev/BuildDryingFrameJob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a development-only job entry point.

## Members

### Constants

### Fields

#### `final int SELF_WIDTH = BW_HORSE`

- Description: TODO

#### `final int SELF_HEIGHT = BH_HORSE`

- Description: TODO

#### `final Coord BB_SELF = BB_HORSE`

- Description: TODO

#### `final int PADDING = 2`

- Description: TODO

#### `final int PASSAGE_WIDTH = SELF_WIDTH + PADDING`

- Description: TODO

#### `final int HEIGHT_SET = BW_DRYING_FRAME + PASSAGE_WIDTH + BW_DRYING_FRAME`

- Description: TODO

#### `private Rect _inputArea, _workingArea, _outputArea`

- Description: TODO

#### `private Rect _inputArea, _workingArea, _outputArea`

- Description: TODO

#### `private Rect _inputArea, _workingArea, _outputArea`

- Description: TODO

#### `private Coord _orderCoordMax, _orderCoord = Coord.zero()`

- Description: TODO

#### `private Coord _orderCoordMax, _orderCoord = Coord.zero()`

- Description: TODO

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`

- Description: TODO

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`

- Description: TODO

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`

- Description: TODO

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`

- Description: TODO

#### `private Coord _root, _trunk, _branch, _firstLeaf, _leaf = Coord.zero()`

- Description: TODO

### Methods

#### `public void run(AgentContext ctx, String[] args)`

- Description: TODO

#### `private void _willRun()`

- Description: TODO

#### `private Rect _getOutputArea(Rect wa)`

- Description: TODO

#### `private Coord _calculateOrderCoordMax(Rect oa)`

- Description: TODO

#### `private void _loop()`

- Description: TODO

#### `private void _bringMaterial()`

- Description: TODO

#### `private void _takeItemFromStockpile(String name, int count)`

- Description: TODO

#### `private void _takeItemFromContainer(String[] ns, int count)`

- Description: TODO

#### `private void _calculateNextLeaf()`

- Description: TODO

#### `private void _calculateLeaf()`

- Description: TODO

#### `public static String info()`

- Description: TODO
