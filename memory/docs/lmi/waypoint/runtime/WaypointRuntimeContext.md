# WaypointRuntimeContext

## Meta

- Source: [WaypointRuntimeContext.java](../../../../../src/lmi/waypoint/runtime/WaypointRuntimeContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Holds runtime state for its corresponding subsystem.

## Code Members

### Member Index

#### Fields

- [managedNodeContext](#member-1)
- [currentGraphId](#member-2)
- [enteringPortal](#member-3)
- [scene](#member-4)
- [nearbyNodes](#member-5)
- [nearbyPoints](#member-6)
- [selectedManagedNodes](#member-7)
- [nodesByGraph](#member-8)
- [loadedNodeGraphs](#member-9)
- [loadingNodeGraphs](#member-10)
- [edgesByGraph](#member-11)
- [loadedEdgeGraphs](#member-12)
- [loadingEdgeGraphs](#member-13)
- [segmentsByGraphGrid](#member-14)
- [loadedSegmentGrids](#member-15)
- [loadingSegmentGrids](#member-16)
- [pointsByGraphGrid](#member-17)
- [loadedPointGrids](#member-18)
- [loadingPointGrids](#member-19)
- [residentGridIds](#member-20)
- [residentSegmentsByEdge](#member-21)
- [residentPointsBySegment](#member-22)

#### Methods

- [clear()](#member-23)
- [managedNodeContext()](#member-24)
- [currentGraphId()](#member-25)
- [setCurrentGraphId(Long currentGraphId)](#member-26)
- [scene()](#member-27)
- [setScene(WaypointScene scene)](#member-28)
- [nearbyNodes()](#member-29)
- [nearbyPoints()](#member-30)
- [selectedManagedNodes()](#member-31)
- [public synchronized void setSceneSnapshot(](#member-32)
- [enteringPortal()](#member-33)
- [setEnteringPortal(EnteringPortal enteringPortal)](#member-34)
- [clearEnteringPortal()](#member-35)
- [nodes(long graphId)](#member-36)
- [findNode(long nodeId)](#member-37)
- [findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)](#member-38)
- [setNodes(long graphId, Array<WpNode> nodes)](#member-39)
- [appendNode(WpNode node)](#member-40)
- [appendEdge(long graphId, WpEdge edge)](#member-41)
- [appendSegment(WpSegment segment)](#member-42)
- [appendPoint(WpSegment segment, WpPoint point)](#member-43)
- [nodesLoaded(long graphId)](#member-44)
- [beginNodesLoad(long graphId)](#member-45)
- [endNodesLoad(long graphId)](#member-46)
- [edgesByGraph(long graphId)](#member-47)
- [setEdgesByGraph(long graphId, Array<WpEdge> edges)](#member-48)
- [edgesByGraphLoaded(long graphId)](#member-49)
- [beginEdgesByGraphLoad(long graphId)](#member-50)
- [endEdgesByGraphLoad(long graphId)](#member-51)
- [segmentsByGrid(long graphId, long gridId)](#member-52)
- [setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)](#member-53)
- [segmentsByGridLoaded(long graphId, long gridId)](#member-54)
- [beginSegmentsByGridLoad(long graphId, long gridId)](#member-55)
- [endSegmentsByGridLoad(long graphId, long gridId)](#member-56)
- [pointsByGrid(long graphId, long gridId)](#member-57)
- [setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)](#member-58)
- [pointsByGridLoaded(long graphId, long gridId)](#member-59)
- [beginPointsByGridLoad(long graphId, long gridId)](#member-60)
- [endPointsByGridLoad(long graphId, long gridId)](#member-61)
- [clearResident()](#member-62)
- [residentGridIds()](#member-63)
- [addResidentGrid(long graphId, long gridId)](#member-64)
- [removeResidentGrid(long graphId, long gridId)](#member-65)
- [residentSegments(long edgeId)](#member-66)
- [residentPoints(long segmentId)](#member-67)
- [gridKey(long graphId, long gridId)](#member-68)
- [findEdgeGraphId(long edgeId)](#member-69)
- [arrayFor(Map<K, Array<V>> map, K key)](#member-70)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `managedNodeContext`

- Description: TODO

<a id="member-2"></a>
##### `currentGraphId`

- Description: TODO

<a id="member-3"></a>
##### `enteringPortal`

- Description: TODO

<a id="member-4"></a>
##### `scene`

- Description: TODO

<a id="member-5"></a>
##### `nearbyNodes`

- Description: TODO

<a id="member-6"></a>
##### `nearbyPoints`

- Description: TODO

<a id="member-7"></a>
##### `selectedManagedNodes`

- Description: TODO

<a id="member-8"></a>
##### `nodesByGraph`

- Description: TODO

<a id="member-9"></a>
##### `loadedNodeGraphs`

- Description: TODO

<a id="member-10"></a>
##### `loadingNodeGraphs`

- Description: TODO

<a id="member-11"></a>
##### `edgesByGraph`

- Description: TODO

<a id="member-12"></a>
##### `loadedEdgeGraphs`

- Description: TODO

<a id="member-13"></a>
##### `loadingEdgeGraphs`

- Description: TODO

<a id="member-14"></a>
##### `segmentsByGraphGrid`

- Description: TODO

<a id="member-15"></a>
##### `loadedSegmentGrids`

- Description: TODO

<a id="member-16"></a>
##### `loadingSegmentGrids`

- Description: TODO

<a id="member-17"></a>
##### `pointsByGraphGrid`

- Description: TODO

<a id="member-18"></a>
##### `loadedPointGrids`

- Description: TODO

<a id="member-19"></a>
##### `loadingPointGrids`

- Description: TODO

<a id="member-20"></a>
##### `residentGridIds`

- Description: TODO

<a id="member-21"></a>
##### `residentSegmentsByEdge`

- Description: TODO

<a id="member-22"></a>
##### `residentPointsBySegment`

- Description: TODO

#### Methods

<a id="member-23"></a>
##### `clear()`

- Description: TODO

<a id="member-24"></a>
##### `managedNodeContext()`

- Description: TODO

<a id="member-25"></a>
##### `currentGraphId()`

- Description: TODO

<a id="member-26"></a>
##### `setCurrentGraphId(Long currentGraphId)`

- Description: TODO

<a id="member-27"></a>
##### `scene()`

- Description: TODO

<a id="member-28"></a>
##### `setScene(WaypointScene scene)`

- Description: TODO

<a id="member-29"></a>
##### `nearbyNodes()`

- Description: TODO

<a id="member-30"></a>
##### `nearbyPoints()`

- Description: TODO

<a id="member-31"></a>
##### `selectedManagedNodes()`

- Description: TODO

<a id="member-32"></a>
##### `public synchronized void setSceneSnapshot(`

- Description: TODO

<a id="member-33"></a>
##### `enteringPortal()`

- Description: TODO

<a id="member-34"></a>
##### `setEnteringPortal(EnteringPortal enteringPortal)`

- Description: TODO

<a id="member-35"></a>
##### `clearEnteringPortal()`

- Description: TODO

<a id="member-36"></a>
##### `nodes(long graphId)`

- Description: TODO

<a id="member-37"></a>
##### `findNode(long nodeId)`

- Description: TODO

<a id="member-38"></a>
##### `findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY)`

- Description: TODO

<a id="member-39"></a>
##### `setNodes(long graphId, Array<WpNode> nodes)`

- Description: TODO

<a id="member-40"></a>
##### `appendNode(WpNode node)`

- Description: TODO

<a id="member-41"></a>
##### `appendEdge(long graphId, WpEdge edge)`

- Description: TODO

<a id="member-42"></a>
##### `appendSegment(WpSegment segment)`

- Description: TODO

<a id="member-43"></a>
##### `appendPoint(WpSegment segment, WpPoint point)`

- Description: TODO

<a id="member-44"></a>
##### `nodesLoaded(long graphId)`

- Description: TODO

<a id="member-45"></a>
##### `beginNodesLoad(long graphId)`

- Description: TODO

<a id="member-46"></a>
##### `endNodesLoad(long graphId)`

- Description: TODO

<a id="member-47"></a>
##### `edgesByGraph(long graphId)`

- Description: TODO

<a id="member-48"></a>
##### `setEdgesByGraph(long graphId, Array<WpEdge> edges)`

- Description: TODO

<a id="member-49"></a>
##### `edgesByGraphLoaded(long graphId)`

- Description: TODO

<a id="member-50"></a>
##### `beginEdgesByGraphLoad(long graphId)`

- Description: TODO

<a id="member-51"></a>
##### `endEdgesByGraphLoad(long graphId)`

- Description: TODO

<a id="member-52"></a>
##### `segmentsByGrid(long graphId, long gridId)`

- Description: TODO

<a id="member-53"></a>
##### `setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments)`

- Description: TODO

<a id="member-54"></a>
##### `segmentsByGridLoaded(long graphId, long gridId)`

- Description: TODO

<a id="member-55"></a>
##### `beginSegmentsByGridLoad(long graphId, long gridId)`

- Description: TODO

<a id="member-56"></a>
##### `endSegmentsByGridLoad(long graphId, long gridId)`

- Description: TODO

<a id="member-57"></a>
##### `pointsByGrid(long graphId, long gridId)`

- Description: TODO

<a id="member-58"></a>
##### `setPointsByGrid(long graphId, long gridId, Array<WpPoint> points)`

- Description: TODO

<a id="member-59"></a>
##### `pointsByGridLoaded(long graphId, long gridId)`

- Description: TODO

<a id="member-60"></a>
##### `beginPointsByGridLoad(long graphId, long gridId)`

- Description: TODO

<a id="member-61"></a>
##### `endPointsByGridLoad(long graphId, long gridId)`

- Description: TODO

<a id="member-62"></a>
##### `clearResident()`

- Description: TODO

<a id="member-63"></a>
##### `residentGridIds()`

- Description: TODO

<a id="member-64"></a>
##### `addResidentGrid(long graphId, long gridId)`

- Description: TODO

<a id="member-65"></a>
##### `removeResidentGrid(long graphId, long gridId)`

- Description: TODO

<a id="member-66"></a>
##### `residentSegments(long edgeId)`

- Description: TODO

<a id="member-67"></a>
##### `residentPoints(long segmentId)`

- Description: TODO

<a id="member-68"></a>
##### `gridKey(long graphId, long gridId)`

- Description: TODO

<a id="member-69"></a>
##### `findEdgeGraphId(long edgeId)`

- Description: TODO

<a id="member-70"></a>
##### `arrayFor(Map<K, Array<V>> map, K key)`

- Description: TODO
