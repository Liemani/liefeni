---
source: [WaypointRuntimeContext.java](../../../../../../src/lmi/waypoint/runtime/WaypointRuntimeContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointRuntimeContext

Carries waypoint runtime state across coordinated operations.

## Members

### Constants

### Fields

#### `private final ManagedObjectContext managedNodeContext = new ManagedObjectContext()`
- Role: Implements the managed node context operation.
- Description: Implements the managed object context operation.

#### `private Long currentGraphId`
- Role: Tracks the waypoint graph currently being viewed or recorded.
- Description: Tracks the waypoint graph currently being viewed or recorded.

#### `private EnteringPortal enteringPortal`
- Role: Stores the portal transition currently being processed.
- Description: Stores the portal transition currently being processed.

#### `private WaypointScene scene = new WaypointScene(WaypointGridBounds.empty())`
- Role: Implements the scene operation.
- Description: Implements the empty operation.

#### `private Array<ResolvedNode> nearbyNodes = new Array<>()`
- Role: Implements the nearby nodes operation.
- Description: Implements the private array<resolved node> nearby nodes = new array<>() operation.

#### `private Array<ResolvedPoint> nearbyPoints = new Array<>()`
- Role: Implements the nearby points operation.
- Description: Implements the private array<resolved point> nearby points = new array<>() operation.

#### `private Array<ManagedWpNode> selectedManagedNodes = new Array<>()`
- Role: Implements the selected managed nodes operation.
- Description: Implements the private array<managed wp node> selected managed nodes = new array<>() operation.

#### `private final Map<Long, Array<WpNode>> nodesByGraph = new HashMap<>()`
- Role: Implements the nodes by graph operation.
- Description: Implements the private final map<long, array<wp node>> nodes by graph = new hash map<>() operation.

#### `private final Set<Long> loadedNodeGraphs = new HashSet<>()`
- Role: Loads the ed node graphs.
- Description: Loads the ed node graphs.

#### `private final Set<Long> loadingNodeGraphs = new HashSet<>()`
- Role: Loads the ing node graphs.
- Description: Loads the ing node graphs.

#### `private final Map<Long, Array<WpEdge>> edgesByGraph = new HashMap<>()`
- Role: Implements the edges by graph operation.
- Description: Implements the private final map<long, array<wp edge>> edges by graph = new hash map<>() operation.

#### `private final Set<Long> loadedEdgeGraphs = new HashSet<>()`
- Role: Loads the ed edge graphs.
- Description: Loads the ed edge graphs.

#### `private final Set<Long> loadingEdgeGraphs = new HashSet<>()`
- Role: Loads the ing edge graphs.
- Description: Loads the ing edge graphs.

#### `private final Map<String, Array<WpSegment>> segmentsByGraphGrid = new HashMap<>()`
- Role: Implements the segments by graph grid operation.
- Description: Implements the private final map<string, array<wp segment>> segments by graph grid = new hash map<>() operation.

#### `private final Set<String> loadedSegmentGrids = new HashSet<>()`
- Role: Loads the ed segment grids.
- Description: Loads the ed segment grids.

#### `private final Set<String> loadingSegmentGrids = new HashSet<>()`
- Role: Loads the ing segment grids.
- Description: Loads the ing segment grids.

#### `private final Map<String, Array<WpPoint>> pointsByGraphGrid = new HashMap<>()`
- Role: Implements the points by graph grid operation.
- Description: Implements the private final map<string, array<wp point>> points by graph grid = new hash map<>() operation.

#### `private final Set<String> loadedPointGrids = new HashSet<>()`
- Role: Loads the ed point grids.
- Description: Loads the ed point grids.

#### `private final Set<String> loadingPointGrids = new HashSet<>()`
- Role: Loads the ing point grids.
- Description: Loads the ing point grids.

#### `private final Set<Long> residentGridIds = new HashSet<>()`
- Role: Implements the resident grid ids operation.
- Description: Implements the private final set<long> resident grid ids = new hash set<>() operation.

#### `private final Map<Long, Array<WpSegment>> residentSegmentsByEdge = new HashMap<>()`
- Role: Implements the resident segments by edge operation.
- Description: Implements the private final map<long, array<wp segment>> resident segments by edge = new hash map<>() operation.

#### `private final Map<Long, Array<WpPoint>> residentPointsBySegment = new HashMap<>()`
- Role: Implements the resident points by segment operation.
- Description: Implements the private final map<long, array<wp point>> resident points by segment = new hash map<>() operation.

### Methods

#### `public synchronized void clear()`
- Role: Clears waypoint runtime context state.
- Description: Resets all cached scene, portal, graph, and resident state.

#### `public synchronized ManagedObjectContext managedNodeContext()`
- Role: Returns the managed node context.
- Description: Returns the managed node context used for waypoint nodes.

#### `public synchronized Long currentGraphId()`
- Role: Returns the current graph id.
- Description: Returns the active graph id, if one is set.

#### `public synchronized void setCurrentGraphId(Long currentGraphId)`
- Role: Sets the current graph id.
- Description: Stores the active graph id.

#### `public synchronized WaypointScene scene()`
- Role: Returns the current scene.
- Description: Returns the current waypoint scene snapshot.

#### `public synchronized void setScene(WaypointScene scene)`
- Role: Sets the scene.
- Description: Stores the current waypoint scene snapshot.

#### `public synchronized Array<ResolvedNode> nearbyNodes()`
- Role: Returns nearby nodes.
- Description: Returns the current nearby-node snapshot.

#### `public synchronized Array<ResolvedPoint> nearbyPoints()`
- Role: Returns nearby points.
- Description: Returns the current nearby-point snapshot.

#### `public synchronized Array<ManagedWpNode> selectedManagedNodes()`
- Role: Returns selected managed nodes.
- Description: Returns the current selected managed waypoint nodes.

#### `public synchronized void setSceneSnapshot(Array<ResolvedNode> nearbyNodes, Array<ResolvedPoint> nearbyPoints, Array<ManagedWpNode> selectedManagedNodes, WaypointScene scene)`
- Role: Updates the scene snapshot.
- Description: Updates the scene snapshot.

#### `public synchronized EnteringPortal enteringPortal()`
- Role: Returns the entering portal.
- Description: Returns the currently captured entering portal, if any.

#### `public synchronized void setEnteringPortal(EnteringPortal enteringPortal)`
- Role: Sets the entering portal.
- Description: Stores the entering portal currently being tracked.

#### `public synchronized void clearEnteringPortal()`
- Role: Clears the entering portal.
- Description: Clears the entering portal.

#### `public synchronized Array<WpNode> nodes(long graphId)`
- Role: Returns nodes for a graph.
- Description: Returns cached nodes for the given graph id.

#### `public synchronized WpNode findNode(long nodeId)`
- Role: Finds a node by id.
- Description: Scans cached graph nodes for a node id.

#### `public synchronized WpNode findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)`
- Role: Finds a node by graph and local grid coordinates.
- Description: Scans one graph for a node at the given grid-local coordinates.

#### `public synchronized void setNodes(long graphId, Array<WpNode> nodes)`
- Role: Replaces the node cache for a graph.
- Description: Rebuilds the cached node list for one graph and preserves older cached entries that are not replaced.

#### `public synchronized void appendNode(WpNode node)`
- Role: Appends a node.
- Description: Inserts or replaces one cached node for its graph.

#### `public synchronized void appendEdge(long graphId, WpEdge edge)`
- Role: Appends an edge.
- Description: Inserts or replaces one cached edge for its graph.

#### `public synchronized void appendSegment(WpSegment segment)`
- Role: Appends a segment.
- Description: Inserts or replaces one cached segment for its graph grid.

#### `public synchronized void appendPoint(WpSegment segment, WpPoint point)`
- Role: Appends a point.
- Description: Inserts or replaces one cached point for its graph grid.

#### `public synchronized boolean nodesLoaded(long graphId)`
- Role: Checks whether nodes are loaded.
- Description: Returns whether nodes for the graph are already cached.

#### `public synchronized boolean beginNodesLoad(long graphId)`
- Role: Begins loading nodes.
- Description: Marks the graph as loading unless its node list is already cached or in progress.

#### `public synchronized void endNodesLoad(long graphId)`
- Role: Ends loading nodes.
- Description: Clears the loading marker for the graph.

#### `public synchronized Array<WpEdge> edgesByGraph(long graphId)`
- Role: Returns edges for a graph.
- Description: Returns cached edges for the given graph id.

#### `public synchronized void setEdgesByGraph(long graphId, Array<WpEdge> edges)`
- Role: Replaces the edge cache for a graph.
- Description: Stores the edge list for one graph and marks it loaded.

#### `public synchronized boolean edgesByGraphLoaded(long graphId)`
- Role: Checks whether edges are loaded.
- Description: Returns whether edges for the graph are already cached.

#### `public synchronized boolean beginEdgesByGraphLoad(long graphId)`
- Role: Begins loading edges.
- Description: Marks the graph edge list as loading unless it is already cached or in progress.

#### `public synchronized void endEdgesByGraphLoad(long graphId)`
- Role: Ends loading edges.
- Description: Clears the graph edge loading marker.

#### `public synchronized Array<WpSegment> segmentsByGrid(long graphId, long gridId)`
- Role: Returns segments for a graph grid.
- Description: Returns cached segments for the graph and grid id.

#### `public synchronized void setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)`
- Role: Replaces the segment cache for a graph grid.
- Description: Stores the segment list for one graph-grid pair and marks it loaded.

#### `public synchronized boolean segmentsByGridLoaded(long graphId, long gridId)`
- Role: Checks whether segments are loaded.
- Description: Returns whether segments for the graph-grid pair are cached.

#### `public synchronized boolean beginSegmentsByGridLoad(long graphId, long gridId)`
- Role: Begins loading segments.
- Description: Marks the graph-grid pair as loading unless its segments are already cached or in progress.

#### `public synchronized void endSegmentsByGridLoad(long graphId, long gridId)`
- Role: Ends loading segments.
- Description: Clears the graph-grid segment loading marker.

#### `public synchronized Array<WpPoint> pointsByGrid(long graphId, long gridId)`
- Role: Returns points for a graph grid.
- Description: Returns cached points for the graph and grid id.

#### `public synchronized void setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)`
- Role: Replaces the point cache for a graph grid.
- Description: Stores the point list for one graph-grid pair and marks it loaded.

#### `public synchronized boolean pointsByGridLoaded(long graphId, long gridId)`
- Role: Checks whether points are loaded.
- Description: Returns whether points for the graph-grid pair are cached.

#### `public synchronized boolean beginPointsByGridLoad(long graphId, long gridId)`
- Role: Begins loading points.
- Description: Marks the graph-grid pair as loading unless its points are already cached or in progress.

#### `public synchronized void endPointsByGridLoad(long graphId, long gridId)`
- Role: Ends loading points.
- Description: Clears the graph-grid point loading marker.

#### `public synchronized void clearResident()`
- Role: Clears resident data.
- Description: Clears resident grid and derived resident caches.

#### `public synchronized Set<Long> residentGridIds()`
- Role: Returns resident grid ids.
- Description: Returns a copy of the resident grid id set.

#### `public synchronized void addResidentGrid(long graphId, long gridId)`
- Role: Adds a resident grid.
- Description: Marks a grid resident and copies its segment and point caches into resident storage.

#### `public synchronized void removeResidentGrid(long graphId, long gridId)`
- Role: Removes a resident grid.
- Description: Unmarks a resident grid and removes its resident segments and points.

#### `public synchronized Array<WpSegment> residentSegments(long edgeId)`
- Role: Returns resident segments for an edge.
- Description: Returns cached resident segments for the given edge id.

#### `public synchronized Array<WpPoint> residentPoints(long segmentId)`
- Role: Returns resident points for a segment.
- Description: Returns cached resident points for the given segment id.

#### `private static String gridKey(long graphId, long gridId)`
- Role: Builds a graph-grid key.
- Description: Builds the composite key used for graph and grid lookup maps.

#### `private long findEdgeGraphId(long edgeId)`
- Role: Finds the edge graph id.
- Description: Finds the edge graph id.

#### `private static <K, V> Array<V> arrayFor(Map<K, Array<V>> map, K key)`
- Role: Returns an array for a map key.
- Description: Returns the cached array for a key, creating it on demand.