# WaypointManager

## Meta

- Source: [WaypointManager.java](../../../../src/lmi/waypoint/WaypointManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Coordinates waypoint runtime state, grid resolution, refresh, and async preload requests.

## Code Members

### Member Index

#### Fields

- [runtimeContext](#member-1)
- [managedNodeContext](#member-2)
- [refreshRequested](#member-3)
- [pendingGraphResolveGridId](#member-4)
- [lastResolvedGraphGridId](#member-5)

#### Methods

- [clear()](#member-6)
- [currentGraphId()](#member-7)
- [activeGraphId()](#member-8)
- [setCurrentGraphId(Long graphId)](#member-9)
- [enteringPortal()](#member-10)
- [captureEnteringPortal(Coord world, String resname)](#member-11)
- [nearbyNodes()](#member-12)
- [nearbyPoints()](#member-13)
- [selectedManagedNodes()](#member-14)
- [scene()](#member-15)
- [nodes(long graphId)](#member-16)
- [findNode(long nodeId)](#member-17)
- [findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)](#member-18)
- [gridPositionOfWorld(Coord world)](#member-19)
- [currentGridPosition()](#member-20)
- [setNodes(long graphId, Array<WpNode> nodes)](#member-21)
- [appendNode(WpNode node)](#member-22)
- [appendEdge(long graphId, WpEdge edge)](#member-23)
- [appendSegment(WpSegment segment)](#member-24)
- [appendPoint(WpSegment segment, WpPoint point)](#member-25)
- [nodesLoaded(long graphId)](#member-26)
- [preloadNodes(long graphId)](#member-27)
- [edgesByGraph(long graphId)](#member-28)
- [setEdgesByGraph(long graphId, Array<WpEdge> edges)](#member-29)
- [edgesByGraphLoaded(long graphId)](#member-30)
- [preloadEdgesByGraph(long graphId)](#member-31)
- [segmentsByGrid(long graphId, long gridId)](#member-32)
- [setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)](#member-33)
- [segmentsByGridLoaded(long graphId, long gridId)](#member-34)
- [preloadSegmentsByGrid(long graphId, long gridId)](#member-35)
- [pointsByGrid(long graphId, long gridId)](#member-36)
- [setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)](#member-37)
- [pointsByGridLoaded(long graphId, long gridId)](#member-38)
- [preloadPointsByGrid(long graphId, long gridId)](#member-39)
- [residentSegments(long edgeId)](#member-40)
- [residentPoints(long segmentId)](#member-41)
- [nearestNode()](#member-42)
- [refresh()](#member-43)
- [requestRefresh()](#member-44)
- [processRefreshRequests()](#member-45)
- [_resolveActiveGraph(GridPosition position)](#member-46)
- [_nearestNode(Array<WpNode> nodes, int localX, int localY)](#member-47)
- [_selfPosition()](#member-48)
- [_sameBounds(WaypointGridBounds a, WaypointGridBounds b)](#member-49)
- [_syncResidentGrids(WaypointGridBounds bounds)](#member-50)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `runtimeContext`

- Description: TODO

<a id="member-2"></a>
##### `managedNodeContext`

- Description: TODO

<a id="member-3"></a>
##### `refreshRequested`

- Description: TODO

<a id="member-4"></a>
##### `pendingGraphResolveGridId`

- Description: TODO

<a id="member-5"></a>
##### `lastResolvedGraphGridId`

- Description: TODO

#### Methods

<a id="member-6"></a>
##### `clear()`

- Description: TODO

<a id="member-7"></a>
##### `currentGraphId()`

- Description: TODO

<a id="member-8"></a>
##### `activeGraphId()`

- Description: TODO

<a id="member-9"></a>
##### `setCurrentGraphId(Long graphId)`

- Description: TODO

<a id="member-10"></a>
##### `enteringPortal()`

- Description: TODO

<a id="member-11"></a>
##### `captureEnteringPortal(Coord world, String resname)`

- Description: TODO

<a id="member-12"></a>
##### `nearbyNodes()`

- Description: TODO

<a id="member-13"></a>
##### `nearbyPoints()`

- Description: TODO

<a id="member-14"></a>
##### `selectedManagedNodes()`

- Description: TODO

<a id="member-15"></a>
##### `scene()`

- Description: TODO

<a id="member-16"></a>
##### `nodes(long graphId)`

- Description: TODO

<a id="member-17"></a>
##### `findNode(long nodeId)`

- Description: TODO

<a id="member-18"></a>
##### `findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)`

- Description: TODO

<a id="member-19"></a>
##### `gridPositionOfWorld(Coord world)`

- Description: TODO

<a id="member-20"></a>
##### `currentGridPosition()`

- Description: TODO

<a id="member-21"></a>
##### `setNodes(long graphId, Array<WpNode> nodes)`

- Description: TODO

<a id="member-22"></a>
##### `appendNode(WpNode node)`

- Description: TODO

<a id="member-23"></a>
##### `appendEdge(long graphId, WpEdge edge)`

- Description: TODO

<a id="member-24"></a>
##### `appendSegment(WpSegment segment)`

- Description: TODO

<a id="member-25"></a>
##### `appendPoint(WpSegment segment, WpPoint point)`

- Description: TODO

<a id="member-26"></a>
##### `nodesLoaded(long graphId)`

- Description: TODO

<a id="member-27"></a>
##### `preloadNodes(long graphId)`

- Description: TODO

<a id="member-28"></a>
##### `edgesByGraph(long graphId)`

- Description: TODO

<a id="member-29"></a>
##### `setEdgesByGraph(long graphId, Array<WpEdge> edges)`

- Description: TODO

<a id="member-30"></a>
##### `edgesByGraphLoaded(long graphId)`

- Description: TODO

<a id="member-31"></a>
##### `preloadEdgesByGraph(long graphId)`

- Description: TODO

<a id="member-32"></a>
##### `segmentsByGrid(long graphId, long gridId)`

- Description: TODO

<a id="member-33"></a>
##### `setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)`

- Description: TODO

<a id="member-34"></a>
##### `segmentsByGridLoaded(long graphId, long gridId)`

- Description: TODO

<a id="member-35"></a>
##### `preloadSegmentsByGrid(long graphId, long gridId)`

- Description: TODO

<a id="member-36"></a>
##### `pointsByGrid(long graphId, long gridId)`

- Description: TODO

<a id="member-37"></a>
##### `setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)`

- Description: TODO

<a id="member-38"></a>
##### `pointsByGridLoaded(long graphId, long gridId)`

- Description: TODO

<a id="member-39"></a>
##### `preloadPointsByGrid(long graphId, long gridId)`

- Description: TODO

<a id="member-40"></a>
##### `residentSegments(long edgeId)`

- Description: TODO

<a id="member-41"></a>
##### `residentPoints(long segmentId)`

- Description: TODO

<a id="member-42"></a>
##### `nearestNode()`

- Description: TODO

<a id="member-43"></a>
##### `refresh()`

- Description: TODO

<a id="member-44"></a>
##### `requestRefresh()`

- Description: TODO

<a id="member-45"></a>
##### `processRefreshRequests()`

- Description: TODO

<a id="member-46"></a>
##### `_resolveActiveGraph(GridPosition position)`

- Description: TODO

<a id="member-47"></a>
##### `_nearestNode(Array<WpNode> nodes, int localX, int localY)`

- Description: TODO

<a id="member-48"></a>
##### `_selfPosition()`

- Description: TODO

<a id="member-49"></a>
##### `_sameBounds(WaypointGridBounds a, WaypointGridBounds b)`

- Description: TODO

<a id="member-50"></a>
##### `_syncResidentGrids(WaypointGridBounds bounds)`

- Description: TODO
