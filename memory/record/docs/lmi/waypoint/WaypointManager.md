---
source: [WaypointManager.java](../../../../../src/lmi/waypoint/WaypointManager.java)
created: 2026-06-13
updated: 2026-06-20
---

# WaypointManager

Coordinates waypoint runtime state, current player grid resolution, async preload, and scene refresh.

## Members

### Constants

#### `private static final WaypointRuntimeContext runtimeContext = new WaypointRuntimeContext()`
- Role: Owns the shared waypoint runtime state.
- Value: `new WaypointRuntimeContext()`

#### `private static final ManagedObjectContext managedNodeContext = runtimeContext.managedNodeContext()`
- Role: Holds the managed-node context used while rebuilding the scene.
- Value: `runtimeContext.managedNodeContext()`

### Fields

#### `private static boolean refreshRequested`
- Role: Remembers that the waypoint scene should be rebuilt on the next refresh pass.

#### `private static Long pendingGraphResolveGridId`
- Role: Tracks the grid id currently being used to resolve the active graph.

#### `private static Long lastResolvedGraphGridId`
- Role: Prevents repeated graph resolution work for the same grid.

### Methods

#### `public static void clear()`
- Role: Resets runtime state, cached graph resolution, and refresh flags.

#### `public static Long currentGraphId()`
- Role: Returns the graph id currently stored in runtime state.

#### `public static Long activeGraphId()`
- Role: Returns the graph id currently used by waypoint rendering and loading.

#### `public static void setCurrentGraphId(Long graphId)`
- Role: Updates the active graph id in runtime state.

#### `public static EnteringPortal enteringPortal()`
- Role: Returns the portal captured during world entry.

#### `public static void captureEnteringPortal(Coord world, String resname)`
- Role: Stores the entering portal after converting world coordinates to waypoint grid coordinates.

#### `public static GridPosition gridPositionOfWorld(Coord world)`
- Role: Converts a Haven world coordinate into waypoint grid id and local grid position.

#### `public static GridPosition currentGridPosition()`
- Role: Returns the current player position expressed as waypoint grid coordinates.

#### `public static Array<ResolvedNode> nearbyNodes()`
- Role: Returns the nearby resolved waypoint nodes currently cached in runtime.

#### `public static Array<ResolvedPoint> nearbyPoints()`
- Role: Returns the nearby resolved waypoint points currently cached in runtime.

#### `public static Array<ManagedWpNode> selectedManagedNodes()`
- Role: Returns the managed waypoint nodes selected for the current scene.

#### `public static WaypointScene scene()`
- Role: Returns the current waypoint scene snapshot.

#### `public static Array<WpNode> nodes(long graphId)`
- Role: Returns cached graph nodes for the requested graph id.

#### `public static WpNode findNode(long nodeId)`
- Role: Finds a cached waypoint node by node id.

#### `public static WpNode findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)`
- Role: Finds a cached waypoint node by graph id and local grid coordinates.

#### `public static void setNodes(long graphId, Array<WpNode> nodes)`
- Role: Replaces the cached node list for the given graph.

#### `public static void appendNode(WpNode node)`
- Role: Appends one node to the current graph state and makes it the active graph if needed.

#### `public static void appendEdge(long graphId, WpEdge edge)`
- Role: Appends one edge to the cached graph edge list.

#### `public static void appendSegment(WpSegment segment)`
- Role: Appends one segment to the runtime waypoint state.

#### `public static void appendPoint(WpSegment segment, WpPoint point)`
- Role: Appends one point to the supplied segment in runtime state.

#### `public static boolean nodesLoaded(long graphId)`
- Role: Checks whether nodes for the requested graph have already been loaded.

#### `public static void preloadNodes(long graphId)`
- Role: Loads graph nodes from the waypoint DB and requests a refresh when data arrives.

#### `public static Array<WpEdge> edgesByGraph(long graphId)`
- Role: Returns cached graph edges for the requested graph id.

#### `public static void setEdgesByGraph(long graphId, Array<WpEdge> edges)`
- Role: Replaces the cached edge list for the given graph.

#### `public static boolean edgesByGraphLoaded(long graphId)`
- Role: Checks whether graph edges have already been loaded.

#### `public static void preloadEdgesByGraph(long graphId)`
- Role: Loads graph edges from the waypoint DB and requests a refresh when data arrives.

#### `public static Array<WpSegment> segmentsByGrid(long graphId, long gridId)`
- Role: Returns cached segments for the requested graph and Haven grid.

#### `public static void setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)`
- Role: Replaces the cached segment list for the given graph and grid.

#### `public static boolean segmentsByGridLoaded(long graphId, long gridId)`
- Role: Checks whether segments for the requested graph and grid have already been loaded.

#### `public static void preloadSegmentsByGrid(long graphId, long gridId)`
- Role: Loads grid segments for the active graph and grid.

#### `public static Array<WpPoint> pointsByGrid(long graphId, long gridId)`
- Role: Returns cached points for the requested graph and grid.

#### `public static void setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)`
- Role: Replaces the cached point list for the given graph and grid.

#### `public static boolean pointsByGridLoaded(long graphId, long gridId)`
- Role: Checks whether points for the requested graph and grid have already been loaded.

#### `public static void preloadPointsByGrid(long graphId, long gridId)`
- Role: Loads grid points for the active graph and grid.

#### `public static Array<WpSegment> residentSegments(long edgeId)`
- Role: Returns resident segments for the given edge id.

#### `public static Array<WpPoint> residentPoints(long segmentId)`
- Role: Returns resident points for the given segment id.

#### `public static ResolvedNode nearestNode()`
- Role: Returns the nearest resolved waypoint node to the player.

#### `public static void refresh()`
- Role: Rebuilds the visible waypoint scene from the current player position and loaded resident data.

#### `public static void requestRefresh()`
- Role: Marks that the next refresh pass should rebuild the scene.

#### `public static void processRefreshRequests()`
- Role: Resolves the active graph from the current grid, then refreshes when the scene bounds changed or a refresh was requested.

#### `private static void _resolveActiveGraph(GridPosition position)`
- Role: Loads nodes for the current grid and chooses the active graph from the nearest waypoint node.

#### `private static void _syncResidentGrids(WaypointGridBounds bounds)`
- Role: Keeps resident waypoint grids aligned with the current visible bounds.

#### `private static Coord _selfPosition()`
- Role: Reads the current local player world position.