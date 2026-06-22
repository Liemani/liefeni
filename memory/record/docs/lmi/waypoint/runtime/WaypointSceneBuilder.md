---
source: [WaypointSceneBuilder.java](../../../../../../src/lmi/waypoint/runtime/WaypointSceneBuilder.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointSceneBuilder

Builds waypoint scene state from current runtime inputs.

## Nested Types

### BuildResult
- Role: Carries the result of building a waypoint scene.
- Description: Returns both the assembled scene and the selected managed nodes.

### NodeVisibility
- Role: Classifies how a waypoint node should appear in the scene.
- Description: Separates drawable, hidden, and skipped nodes during scene assembly.

## Members

### Constants

### Fields

#### `public final WaypointScene scene`
- Role: Stores the current waypoint scene snapshot.
- Description: Stores the current waypoint scene snapshot.

#### `public final Array<ManagedWpNode> selectedManagedNodes`
- Role: Tracks the managed waypoint nodes selected for inspection or editing.
- Description: Tracks the managed waypoint nodes selected for inspection or editing.

### Methods

#### `private WaypointSceneBuilder()`
- Role: Creates a new WaypointSceneBuilder instance.
- Description: Constructs the WaypointSceneBuilder instance from the supplied inputs.

#### `public static BuildResult build(`
- Role: Handles the build workflow.
- Description: Assembles a scene snapshot from the current runtime context.

#### `private static void _appendResidentEdge(`
- Role: Handles the append resident edge workflow.
- Description: Adds resident edges to the scene result.

#### `private static NodeVisibility _classifyNode(long gridId, WaypointGridBounds bounds)`
- Role: Classifies whether a node should be drawn or skipped.
- Description: Compares node grid ids against the current bounds.

#### `private static ResolvedNode _resolvedNode(WaypointGridBounds bounds, ManagedWpNode node)`
- Role: Builds a resolved node for the current scene.
- Description: Wraps the managed node with draw-time visibility data.

#### `BuildResult(WaypointScene scene, Array<ManagedWpNode> selectedManagedNodes)`
- Role: Handles the build result workflow.
- Description: Stores the built scene and the selected node set.