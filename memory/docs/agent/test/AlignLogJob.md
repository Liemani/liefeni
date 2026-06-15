# AlignLogJob

This file documents the responsibilities and members of `AlignLogJob`.

## Meta

- Source: [AlignLogJob.java](../../../../src/agent/test/AlignLogJob.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a manual test or validation job entry point.

## Members

### Constants

### Fields

#### `private final AlignLogBehavior alignBehavior = new AlignLogBehavior()`

- Description: TODO

#### `private boolean initialized = false`

- Description: TODO

#### `private Rect inputArea, workingArea, outputArea`

- Description: TODO

#### `private Rect inputArea, workingArea, outputArea`

- Description: TODO

#### `private Rect inputArea, workingArea, outputArea`

- Description: TODO

#### `private Coord orderCoordMax, orderCoord = Coord.zero()`

- Description: TODO

#### `private Coord orderCoordMax, orderCoord = Coord.zero()`

- Description: TODO

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`

- Description: TODO

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`

- Description: TODO

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`

- Description: TODO

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`

- Description: TODO

#### `private Coord root, trunk, branch, firstLeaf, leaf = Coord.zero()`

- Description: TODO

#### `private final int SELF_WIDTH = BW_HORSE`

- Description: TODO

#### `private final int SELF_HEIGHT = BH_HORSE`

- Description: TODO

#### `private final Coord BB_SELF = BB_HORSE`

- Description: TODO

#### `private final double SELF_DIAGONAL = BB_SELF.diagonal()`

- Description: TODO

#### `private final int PADDING = 2`

- Description: TODO

#### `private final int ROUTE_WIDTH = SELF_WIDTH + PADDING`

- Description: TODO

#### `private final int HEIGHT_SET = BH_LOG + ROUTE_WIDTH + BH_LOG`

- Description: TODO

### Methods

#### `public void run(AgentContext ctx, String[] args)`

- Description: TODO

#### `private void _setup()`

- Description: TODO

#### `private void _loop(AgentContext ctx)`

- Description: TODO

#### `private Gob _findLog()`

- Description: TODO

#### `private void _calculateNextLeaf()`

- Description: TODO

#### `private void _updateLeafCoords()`

- Description: TODO

#### `private Rect _calculateOutputArea(Rect wa)`

- Description: TODO

#### `private Coord _calculateOrderCoordMax(Rect oa)`

- Description: TODO

#### `public static String info()`

- Description: TODO
