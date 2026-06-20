---
source: [WaypointRuntimeContext.java](../../../../../src/lmi/waypoint/runtime/WaypointRuntimeContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointRuntimeContext

Carries waypoint runtime state across coordinated operations.

## Members

### Constants

### Fields

#### `private final ManagedObjectContext managedNodeContext = new ManagedObjectContext()`
- Role: Stores the managed node context value.
- Description: Backs the cached state for this file.

#### `private Long currentGraphId`
- Role: Stores the current graph id value.
- Description: Backs the cached state for this file.

#### `private EnteringPortal enteringPortal`
- Role: Stores the entering portal value.
- Description: Backs the cached state for this file.

#### `private WaypointScene scene = new WaypointScene(WaypointGridBounds.empty())`
- Role: Stores the scene value.
- Description: Backs the cached state for this file.

#### `private Array<ResolvedNode> nearbyNodes = new Array<>()`
- Role: Caches nearby nodes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Array<ResolvedPoint> nearbyPoints = new Array<>()`
- Role: Caches nearby points entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Array<ManagedWpNode> selectedManagedNodes = new Array<>()`
- Role: Caches selected managed nodes entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Long, Array<WpNode>> nodesByGraph = new HashMap<>()`
- Role: Caches nodes by graph entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<Long> loadedNodeGraphs = new HashSet<>()`
- Role: Caches loaded node graphs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<Long> loadingNodeGraphs = new HashSet<>()`
- Role: Caches loading node graphs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Long, Array<WpEdge>> edgesByGraph = new HashMap<>()`
- Role: Caches edges by graph entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<Long> loadedEdgeGraphs = new HashSet<>()`
- Role: Caches loaded edge graphs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<Long> loadingEdgeGraphs = new HashSet<>()`
- Role: Caches loading edge graphs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<String, Array<WpSegment>> segmentsByGraphGrid = new HashMap<>()`
- Role: Caches segments by graph grid entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<String> loadedSegmentGrids = new HashSet<>()`
- Role: Caches loaded segment grids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<String> loadingSegmentGrids = new HashSet<>()`
- Role: Caches loading segment grids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<String, Array<WpPoint>> pointsByGraphGrid = new HashMap<>()`
- Role: Caches points by graph grid entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<String> loadedPointGrids = new HashSet<>()`
- Role: Caches loaded point grids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<String> loadingPointGrids = new HashSet<>()`
- Role: Caches loading point grids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Set<Long> residentGridIds = new HashSet<>()`
- Role: Caches resident grid ids entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Long, Array<WpSegment>> residentSegmentsByEdge = new HashMap<>()`
- Role: Caches resident segments by edge entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Long, Array<WpPoint>> residentPointsBySegment = new HashMap<>()`
- Role: Caches resident points by segment entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public synchronized void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public synchronized ManagedObjectContext managedNodeContext()`
- Role: Performs managed node context.
- Description: Supports the managed node context operation used by the surrounding class.

#### `public synchronized Long currentGraphId()`
- Role: Returns the current graph ID.
- Description: Exposes the requested value without mutating state.

#### `public synchronized void setCurrentGraphId(Long currentGraphId)`
- Role: Sets the current graph ID.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public synchronized WaypointScene scene()`
- Role: Returns the current waypoint scene.
- Description: Exposes the requested value without mutating state.

#### `public synchronized void setScene(WaypointScene scene)`
- Role: Sets the scene.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public synchronized Array<ResolvedNode> nearbyNodes()`
- Role: Returns nearby waypoint nodes.
- Description: Exposes the requested value without mutating state.

#### `public synchronized Array<ResolvedPoint> nearbyPoints()`
- Role: Returns nearby waypoint points.
- Description: Exposes the requested value without mutating state.

#### `public synchronized Array<ManagedWpNode> selectedManagedNodes()`
- Role: Returns the selected managed waypoint nodes.
- Description: Exposes the requested value without mutating state.

#### `public synchronized void setSceneSnapshot(`
- Role: Updates the set scene snapshot state.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public synchronized EnteringPortal enteringPortal()`
- Role: Returns the currently captured entering portal.
- Description: Exposes the requested value without mutating state.

#### `public synchronized void setEnteringPortal(EnteringPortal enteringPortal)`
- Role: Sets the entering portal.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public synchronized void clearEnteringPortal()`
- Role: Clears the entering portal.
- Description: Removes the associated value from the current runtime state.

#### `public synchronized Array<WpNode> nodes(long graphId)`
- Role: Returns the nodes for the supplied graph.
- Description: Exposes the requested value without mutating state.

#### `public synchronized WpNode findNode(long nodeId)`
- Role: Finds a waypoint node by node ID.
- Description: Supports the find node operation used by the surrounding class.

#### `public synchronized WpNode findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)`
- Role: Finds a waypoint node by graph and local grid coordinates.
- Description: Supports the find node by graph and grid local operation used by the surrounding class.

#### `public synchronized void setNodes(long graphId, Array<WpNode> nodes)`
- Role: Updates the node cache for the supplied graph.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public synchronized void appendNode(WpNode node)`
- Role: Appends a node to the waypoint graph.
- Description: Appends a node to the waypoint graph to the current collection or state.

#### `public synchronized void appendEdge(long graphId, WpEdge edge)`
- Role: Appends an edge to the waypoint graph.
- Description: Appends an edge to the waypoint graph to the current collection or state.

#### `public synchronized void appendSegment(WpSegment segment)`
- Role: Appends a segment to the waypoint graph.
- Description: Appends a segment to the waypoint graph to the current collection or state.

#### `public synchronized void appendPoint(WpSegment segment, WpPoint point)`
- Role: Appends a point to the waypoint graph.
- Description: Appends a point to the waypoint graph to the current collection or state.

#### `public synchronized boolean nodesLoaded(long graphId)`
- Role: Checks whether the graph nodes are loaded.
- Description: Returns a boolean result for the described condition.

#### `public synchronized boolean beginNodesLoad(long graphId)`
- Role: Performs begin nodes load.
- Description: Supports the begin nodes load operation used by the surrounding class.

#### `public synchronized void endNodesLoad(long graphId)`
- Role: Performs end nodes load.
- Description: Supports the end nodes load operation used by the surrounding class.

#### `public synchronized Array<WpEdge> edgesByGraph(long graphId)`
- Role: Returns the edges for the supplied graph.
- Description: Exposes the requested value without mutating state.

#### `public synchronized void setEdgesByGraph(long graphId, Array<WpEdge> edges)`
- Role: Updates the edge cache for the supplied graph.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public synchronized boolean edgesByGraphLoaded(long graphId)`
- Role: Checks whether the graph edges are loaded.
- Description: Returns a boolean result for the described condition.

#### `public synchronized boolean beginEdgesByGraphLoad(long graphId)`
- Role: Performs begin edges by graph load.
- Description: Supports the begin edges by graph load operation used by the surrounding class.

#### `public synchronized void endEdgesByGraphLoad(long graphId)`
- Role: Performs end edges by graph load.
- Description: Supports the end edges by graph load operation used by the surrounding class.

#### `public synchronized Array<WpSegment> segmentsByGrid(long graphId, long gridId)`
- Role: Returns the segments for the supplied graph grid.
- Description: Exposes the requested value without mutating state.

#### `public synchronized void setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)`
- Role: Updates the segment cache for the supplied graph grid.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public synchronized boolean segmentsByGridLoaded(long graphId, long gridId)`
- Role: Checks whether the graph grid segments are loaded.
- Description: Returns a boolean result for the described condition.

#### `public synchronized boolean beginSegmentsByGridLoad(long graphId, long gridId)`
- Role: Performs begin segments by grid load.
- Description: Supports the begin segments by grid load operation used by the surrounding class.

#### `public synchronized void endSegmentsByGridLoad(long graphId, long gridId)`
- Role: Performs end segments by grid load.
- Description: Supports the end segments by grid load operation used by the surrounding class.

#### `public synchronized Array<WpPoint> pointsByGrid(long graphId, long gridId)`
- Role: Returns the points for the supplied graph grid.
- Description: Exposes the requested value without mutating state.

#### `public synchronized void setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)`
- Role: Updates the point cache for the supplied graph grid.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public synchronized boolean pointsByGridLoaded(long graphId, long gridId)`
- Role: Checks whether the graph grid points are loaded.
- Description: Returns a boolean result for the described condition.

#### `public synchronized boolean beginPointsByGridLoad(long graphId, long gridId)`
- Role: Performs begin points by grid load.
- Description: Supports the begin points by grid load operation used by the surrounding class.

#### `public synchronized void endPointsByGridLoad(long graphId, long gridId)`
- Role: Performs end points by grid load.
- Description: Supports the end points by grid load operation used by the surrounding class.

#### `public synchronized void clearResident()`
- Role: Clears the resident.
- Description: Removes the associated value from the current runtime state.

#### `public synchronized Set<Long> residentGridIds()`
- Role: Performs resident grid ids.
- Description: Supports the resident grid ids operation used by the surrounding class.

#### `public synchronized void addResidentGrid(long graphId, long gridId)`
- Role: Adds the resident grid.
- Description: Adds the resident grid to the current collection or state.

#### `public synchronized void removeResidentGrid(long graphId, long gridId)`
- Role: Removes the resident grid.
- Description: Removes the associated value from the current runtime state.

#### `public synchronized Array<WpSegment> residentSegments(long edgeId)`
- Role: Returns the resident segments for the supplied edge.
- Description: Exposes the requested value without mutating state.

#### `public synchronized Array<WpPoint> residentPoints(long segmentId)`
- Role: Returns the resident points for the supplied segment.
- Description: Exposes the requested value without mutating state.

#### `private static String gridKey(long graphId, long gridId)`
- Role: Performs grid key.
- Description: Supports the grid key operation used by the surrounding class.

#### `private long findEdgeGraphId(long edgeId)`
- Role: Returns the edge graph id.
- Description: Exposes the requested value without mutating state.

#### `private static <K, V> Array<V> arrayFor(Map<K, Array<V>> map, K key)`
- Role: Performs array for.
- Description: Supports the array for operation used by the surrounding class.
