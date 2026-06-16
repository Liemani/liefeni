# WaypointManager

This file documents the responsibilities and members of `WaypointManager`.

## Meta

- Source: [WaypointManager.java](../../../../src/lmi/waypoint/WaypointManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Owns waypoint runtime coordination and high-level entry points.

## Members

### Constants

#### `private static final WaypointRuntimeContext runtimeContext = new WaypointRuntimeContext()`
- Role: Defines the shared runtime context constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ManagedObjectContext managedNodeContext = runtimeContext.managedNodeContext()`
- Role: Defines the shared managed node context constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static boolean refreshRequested`
- Role: Tracks whether refresh has been requested.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private static Long pendingGraphResolveGridId`
- Role: Stores the pending graph resolve grid id value.
- Description: Backs the cached state for this file.

#### `private static Long lastResolvedGraphGridId`
- Role: Stores the last resolved graph grid id value.
- Description: Backs the cached state for this file.

### Methods

#### `private WaypointManager()`
- Role: Creates a new WaypointManager instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public static Long currentGraphId()`
- Role: Returns the current graph ID.
- Description: Exposes the requested value without mutating state.

#### `public static Long activeGraphId()`
- Role: Returns the active graph ID.
- Description: Exposes the requested value without mutating state.

#### `public static void setCurrentGraphId(Long graphId)`
- Role: Sets the current graph ID.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static EnteringPortal enteringPortal()`
- Role: Returns the currently captured entering portal.
- Description: Exposes the requested value without mutating state.

#### `public static void captureEnteringPortal(Coord world, String resname)`
- Role: Captures the entering portal.
- Description: Supports the capture entering portal operation used by the surrounding class.

#### `public static Array<ResolvedNode> nearbyNodes()`
- Role: Returns nearby waypoint nodes.
- Description: Exposes the requested value without mutating state.

#### `public static Array<ResolvedPoint> nearbyPoints()`
- Role: Returns nearby waypoint points.
- Description: Exposes the requested value without mutating state.

#### `public static Array<ManagedWpNode> selectedManagedNodes()`
- Role: Returns the selected managed waypoint nodes.
- Description: Exposes the requested value without mutating state.

#### `public static WaypointScene scene()`
- Role: Returns the current waypoint scene.
- Description: Exposes the requested value without mutating state.

#### `public static Array<WpNode> nodes(long graphId)`
- Role: Returns the nodes for the supplied graph.
- Description: Exposes the requested value without mutating state.

#### `public static WpNode findNode(long nodeId)`
- Role: Finds a waypoint node by node ID.
- Description: Supports the find node operation used by the surrounding class.

#### `public static WpNode findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)`
- Role: Finds a waypoint node by graph and local grid coordinates.
- Description: Supports the find node by graph and grid local operation used by the surrounding class.

#### `public static GridPosition gridPositionOfWorld(Coord world)`
- Role: Returns the grid position for the given world coordinate.
- Description: Exposes the requested value without mutating state.

#### `public static GridPosition currentGridPosition()`
- Role: Returns the current grid position.
- Description: Exposes the requested value without mutating state.

#### `public static void setNodes(long graphId, Array<WpNode> nodes)`
- Role: Updates the node cache for the supplied graph.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void appendNode(WpNode node)`
- Role: Appends a node to the waypoint graph.
- Description: Appends a node to the waypoint graph to the current collection or state.

#### `public static void appendEdge(long graphId, WpEdge edge)`
- Role: Appends an edge to the waypoint graph.
- Description: Appends an edge to the waypoint graph to the current collection or state.

#### `public static void appendSegment(WpSegment segment)`
- Role: Appends a segment to the waypoint graph.
- Description: Appends a segment to the waypoint graph to the current collection or state.

#### `public static void appendPoint(WpSegment segment, WpPoint point)`
- Role: Appends a point to the waypoint graph.
- Description: Appends a point to the waypoint graph to the current collection or state.

#### `public static boolean nodesLoaded(long graphId)`
- Role: Checks whether the graph nodes are loaded.
- Description: Returns a boolean result for the described condition.

#### `public static void preloadNodes(long graphId)`
- Role: Preloads the graph nodes.
- Description: Preloads the graph nodes so callers can reuse the cached data.

#### `public static Array<WpEdge> edgesByGraph(long graphId)`
- Role: Returns the edges for the supplied graph.
- Description: Exposes the requested value without mutating state.

#### `public static void setEdgesByGraph(long graphId, Array<WpEdge> edges)`
- Role: Updates the edge cache for the supplied graph.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static boolean edgesByGraphLoaded(long graphId)`
- Role: Checks whether the graph edges are loaded.
- Description: Returns a boolean result for the described condition.

#### `public static void preloadEdgesByGraph(long graphId)`
- Role: Preloads the graph edges.
- Description: Preloads the graph edges so callers can reuse the cached data.

#### `public static Array<WpSegment> segmentsByGrid(long graphId, long gridId)`
- Role: Returns the segments for the supplied graph grid.
- Description: Exposes the requested value without mutating state.

#### `public static void setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)`
- Role: Updates the segment cache for the supplied graph grid.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static boolean segmentsByGridLoaded(long graphId, long gridId)`
- Role: Checks whether the graph grid segments are loaded.
- Description: Returns a boolean result for the described condition.

#### `public static void preloadSegmentsByGrid(long graphId, long gridId)`
- Role: Preloads the graph grid segments.
- Description: Preloads the graph grid segments so callers can reuse the cached data.

#### `public static Array<WpPoint> pointsByGrid(long graphId, long gridId)`
- Role: Returns the points for the supplied graph grid.
- Description: Exposes the requested value without mutating state.

#### `public static void setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)`
- Role: Updates the point cache for the supplied graph grid.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static boolean pointsByGridLoaded(long graphId, long gridId)`
- Role: Checks whether the graph grid points are loaded.
- Description: Returns a boolean result for the described condition.

#### `public static void preloadPointsByGrid(long graphId, long gridId)`
- Role: Preloads the graph grid points.
- Description: Preloads the graph grid points so callers can reuse the cached data.

#### `public static Array<WpSegment> residentSegments(long edgeId)`
- Role: Returns the resident segments for the supplied edge.
- Description: Exposes the requested value without mutating state.

#### `public static Array<WpPoint> residentPoints(long segmentId)`
- Role: Returns the resident points for the supplied segment.
- Description: Exposes the requested value without mutating state.

#### `public static ResolvedNode nearestNode()`
- Role: Returns the nearest waypoint node.
- Description: Exposes the requested value without mutating state.

#### `public static void refresh()`
- Role: Refreshes waypoint manager state.
- Description: Supports the refresh operation used by the surrounding class.

#### `public static void requestRefresh()`
- Role: Requests a waypoint refresh.
- Description: Requests a waypoint refresh from the underlying runtime.

#### `public static void processRefreshRequests()`
- Role: Processes pending waypoint refresh requests.
- Description: Processes pending waypoint refresh requests on the owning worker or lifecycle path.

#### `private static void _resolveActiveGraph(GridPosition position)`
- Role: Resolves the active waypoint graph for the supplied position.
- Description: Supports the resolve active graph operation used by the surrounding class.

#### `private static WpNode _nearestNode(Array<WpNode> nodes, int localX, int localY)`
- Role: Finds the nearest waypoint node from the supplied list.
- Description: Supports the nearest node operation used by the surrounding class.

#### `private static Coord _selfPosition()`
- Role: Returns the current self position.
- Description: Exposes the requested value without mutating state.

#### `private static boolean _sameBounds(WaypointGridBounds a, WaypointGridBounds b)`
- Role: Checks whether two waypoint grid bounds are equal.
- Description: Returns a boolean result for the described condition.

#### `private static void _syncResidentGrids(WaypointGridBounds bounds)`
- Role: Performs  sync resident grids.
- Description: Supports the sync resident grids operation used by the surrounding class.
