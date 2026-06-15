# WaypointRuntimeContext

This file documents the responsibilities and members of `WaypointRuntimeContext`.

## Meta

- Source: [WaypointRuntimeContext.java](../../../../../src/lmi/waypoint/runtime/WaypointRuntimeContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds runtime state for its corresponding subsystem.

## Members

### Constants

### Fields

#### `private final ManagedObjectContext managedNodeContext = new ManagedObjectContext()`

- Description: TODO

#### `private Long currentGraphId`

- Description: TODO

#### `private EnteringPortal enteringPortal`

- Description: TODO

#### `private WaypointScene scene = new WaypointScene(WaypointGridBounds.empty())`

- Description: TODO

#### `private Array<ResolvedNode> nearbyNodes = new Array<>()`

- Description: TODO

#### `private Array<ResolvedPoint> nearbyPoints = new Array<>()`

- Description: TODO

#### `private Array<ManagedWpNode> selectedManagedNodes = new Array<>()`

- Description: TODO

#### `private final Map<Long, Array<WpNode>> nodesByGraph = new HashMap<>()`

- Description: TODO

#### `private final Set<Long> loadedNodeGraphs = new HashSet<>()`

- Description: TODO

#### `private final Set<Long> loadingNodeGraphs = new HashSet<>()`

- Description: TODO

#### `private final Map<Long, Array<WpEdge>> edgesByGraph = new HashMap<>()`

- Description: TODO

#### `private final Set<Long> loadedEdgeGraphs = new HashSet<>()`

- Description: TODO

#### `private final Set<Long> loadingEdgeGraphs = new HashSet<>()`

- Description: TODO

#### `private final Map<String, Array<WpSegment>> segmentsByGraphGrid = new HashMap<>()`

- Description: TODO

#### `private final Set<String> loadedSegmentGrids = new HashSet<>()`

- Description: TODO

#### `private final Set<String> loadingSegmentGrids = new HashSet<>()`

- Description: TODO

#### `private final Map<String, Array<WpPoint>> pointsByGraphGrid = new HashMap<>()`

- Description: TODO

#### `private final Set<String> loadedPointGrids = new HashSet<>()`

- Description: TODO

#### `private final Set<String> loadingPointGrids = new HashSet<>()`

- Description: TODO

#### `private final Set<Long> residentGridIds = new HashSet<>()`

- Description: TODO

#### `private final Map<Long, Array<WpSegment>> residentSegmentsByEdge = new HashMap<>()`

- Description: TODO

#### `private final Map<Long, Array<WpPoint>> residentPointsBySegment = new HashMap<>()`

- Description: TODO

### Methods

#### `public synchronized void clear()`

- Description: TODO

#### `public synchronized ManagedObjectContext managedNodeContext()`

- Description: TODO

#### `public synchronized Long currentGraphId()`

- Description: TODO

#### `public synchronized void setCurrentGraphId(Long currentGraphId)`

- Description: TODO

#### `public synchronized WaypointScene scene()`

- Description: TODO

#### `public synchronized void setScene(WaypointScene scene)`

- Description: TODO

#### `public synchronized Array<ResolvedNode> nearbyNodes()`

- Description: TODO

#### `public synchronized Array<ResolvedPoint> nearbyPoints()`

- Description: TODO

#### `public synchronized Array<ManagedWpNode> selectedManagedNodes()`

- Description: TODO

#### `public synchronized void setSceneSnapshot(`

- Description: TODO

#### `public synchronized EnteringPortal enteringPortal()`

- Description: TODO

#### `public synchronized void setEnteringPortal(EnteringPortal enteringPortal)`

- Description: TODO

#### `public synchronized void clearEnteringPortal()`

- Description: TODO

#### `public synchronized Array<WpNode> nodes(long graphId)`

- Description: TODO

#### `public synchronized WpNode findNode(long nodeId)`

- Description: TODO

#### `public synchronized WpNode findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)`

- Description: TODO

#### `public synchronized void setNodes(long graphId, Array<WpNode> nodes)`

- Description: TODO

#### `public synchronized void appendNode(WpNode node)`

- Description: TODO

#### `public synchronized void appendEdge(long graphId, WpEdge edge)`

- Description: TODO

#### `public synchronized void appendSegment(WpSegment segment)`

- Description: TODO

#### `public synchronized void appendPoint(WpSegment segment, WpPoint point)`

- Description: TODO

#### `public synchronized boolean nodesLoaded(long graphId)`

- Description: TODO

#### `public synchronized boolean beginNodesLoad(long graphId)`

- Description: TODO

#### `public synchronized void endNodesLoad(long graphId)`

- Description: TODO

#### `public synchronized Array<WpEdge> edgesByGraph(long graphId)`

- Description: TODO

#### `public synchronized void setEdgesByGraph(long graphId, Array<WpEdge> edges)`

- Description: TODO

#### `public synchronized boolean edgesByGraphLoaded(long graphId)`

- Description: TODO

#### `public synchronized boolean beginEdgesByGraphLoad(long graphId)`

- Description: TODO

#### `public synchronized void endEdgesByGraphLoad(long graphId)`

- Description: TODO

#### `public synchronized Array<WpSegment> segmentsByGrid(long graphId, long gridId)`

- Description: TODO

#### `public synchronized void setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)`

- Description: TODO

#### `public synchronized boolean segmentsByGridLoaded(long graphId, long gridId)`

- Description: TODO

#### `public synchronized boolean beginSegmentsByGridLoad(long graphId, long gridId)`

- Description: TODO

#### `public synchronized void endSegmentsByGridLoad(long graphId, long gridId)`

- Description: TODO

#### `public synchronized Array<WpPoint> pointsByGrid(long graphId, long gridId)`

- Description: TODO

#### `public synchronized void setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)`

- Description: TODO

#### `public synchronized boolean pointsByGridLoaded(long graphId, long gridId)`

- Description: TODO

#### `public synchronized boolean beginPointsByGridLoad(long graphId, long gridId)`

- Description: TODO

#### `public synchronized void endPointsByGridLoad(long graphId, long gridId)`

- Description: TODO

#### `public synchronized void clearResident()`

- Description: TODO

#### `public synchronized Set<Long> residentGridIds()`

- Description: TODO

#### `public synchronized void addResidentGrid(long graphId, long gridId)`

- Description: TODO

#### `public synchronized void removeResidentGrid(long graphId, long gridId)`

- Description: TODO

#### `public synchronized Array<WpSegment> residentSegments(long edgeId)`

- Description: TODO

#### `public synchronized Array<WpPoint> residentPoints(long segmentId)`

- Description: TODO

#### `private static String gridKey(long graphId, long gridId)`

- Description: TODO

#### `private long findEdgeGraphId(long edgeId)`

- Description: TODO

#### `private static <K, V> Array<V> arrayFor(Map<K, Array<V>> map, K key)`

- Description: TODO
