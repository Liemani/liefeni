# WaypointManager

This file documents the responsibilities and members of `WaypointManager`.

## Meta

- Source: [WaypointManager.java](../../../../src/lmi/waypoint/WaypointManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint runtime state, grid resolution, refresh, and async preload requests.

## Members

### Constants

#### `private static final WaypointRuntimeContext runtimeContext = new WaypointRuntimeContext()`

- Description: TODO

#### `private static final ManagedObjectContext managedNodeContext = runtimeContext.managedNodeContext()`

- Description: TODO

### Fields

#### `private static boolean refreshRequested`

- Description: TODO

#### `private static Long pendingGraphResolveGridId`

- Description: TODO

#### `private static Long lastResolvedGraphGridId`

- Description: TODO

### Methods

#### `private WaypointManager()`

- Description: TODO

#### `public static void clear()`

- Description: TODO

#### `public static Long currentGraphId()`

- Description: TODO

#### `public static Long activeGraphId()`

- Description: TODO

#### `public static void setCurrentGraphId(Long graphId)`

- Description: TODO

#### `public static EnteringPortal enteringPortal()`

- Description: TODO

#### `public static void captureEnteringPortal(Coord world, String resname)`

- Description: TODO

#### `public static Array<ResolvedNode> nearbyNodes()`

- Description: TODO

#### `public static Array<ResolvedPoint> nearbyPoints()`

- Description: TODO

#### `public static Array<ManagedWpNode> selectedManagedNodes()`

- Description: TODO

#### `public static WaypointScene scene()`

- Description: TODO

#### `public static Array<WpNode> nodes(long graphId)`

- Description: TODO

#### `public static WpNode findNode(long nodeId)`

- Description: TODO

#### `public static WpNode findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)`

- Description: TODO

#### `public static GridPosition gridPositionOfWorld(Coord world)`

- Description: TODO

#### `public static GridPosition currentGridPosition()`

- Description: TODO

#### `public static void setNodes(long graphId, Array<WpNode> nodes)`

- Description: TODO

#### `public static void appendNode(WpNode node)`

- Description: TODO

#### `public static void appendEdge(long graphId, WpEdge edge)`

- Description: TODO

#### `public static void appendSegment(WpSegment segment)`

- Description: TODO

#### `public static void appendPoint(WpSegment segment, WpPoint point)`

- Description: TODO

#### `public static boolean nodesLoaded(long graphId)`

- Description: TODO

#### `public static void preloadNodes(long graphId)`

- Description: TODO

#### `public static Array<WpEdge> edgesByGraph(long graphId)`

- Description: TODO

#### `public static void setEdgesByGraph(long graphId, Array<WpEdge> edges)`

- Description: TODO

#### `public static boolean edgesByGraphLoaded(long graphId)`

- Description: TODO

#### `public static void preloadEdgesByGraph(long graphId)`

- Description: TODO

#### `public static Array<WpSegment> segmentsByGrid(long graphId, long gridId)`

- Description: TODO

#### `public static void setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)`

- Description: TODO

#### `public static boolean segmentsByGridLoaded(long graphId, long gridId)`

- Description: TODO

#### `public static void preloadSegmentsByGrid(long graphId, long gridId)`

- Description: TODO

#### `public static Array<WpPoint> pointsByGrid(long graphId, long gridId)`

- Description: TODO

#### `public static void setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)`

- Description: TODO

#### `public static boolean pointsByGridLoaded(long graphId, long gridId)`

- Description: TODO

#### `public static void preloadPointsByGrid(long graphId, long gridId)`

- Description: TODO

#### `public static Array<WpSegment> residentSegments(long edgeId)`

- Description: TODO

#### `public static Array<WpPoint> residentPoints(long segmentId)`

- Description: TODO

#### `public static ResolvedNode nearestNode()`

- Description: TODO

#### `public static void refresh()`

- Description: TODO

#### `public static void requestRefresh()`

- Description: TODO

#### `public static void processRefreshRequests()`

- Description: TODO

#### `private static void _resolveActiveGraph(GridPosition position)`

- Description: TODO

#### `private static WpNode _nearestNode(Array<WpNode> nodes, int localX, int localY)`

- Description: TODO

#### `private static Coord _selfPosition()`

- Description: TODO

#### `private static boolean _sameBounds(WaypointGridBounds a, WaypointGridBounds b)`

- Description: TODO

#### `private static void _syncResidentGrids(WaypointGridBounds bounds)`

- Description: TODO
