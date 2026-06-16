# WaypointSceneBuilder

This file documents the responsibilities and members of `WaypointSceneBuilder`.

## Meta

- Source: [WaypointSceneBuilder.java](../../../../../src/lmi/waypoint/runtime/WaypointSceneBuilder.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Builds waypoint scene state from current runtime inputs.

## Nested Types

### BuildResult
### BuildResult
- Role: Represents the build result helper used by WaypointSceneBuilder.

- Role: Carries the result of building a waypoint scene.
- Description: Describes the nested build result type used by the enclosing class.

### NodeVisibility
### NodeVisibility
- Role: Represents the node visibility helper used by WaypointSceneBuilder.

- Role: Classifies how a waypoint node should appear in the scene.
- Description: Describes the nested node visibility type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final WaypointScene scene`
- Role: Stores the scene value.
- Description: Backs the cached state for this file.

#### `public final Array<ManagedWpNode> selectedManagedNodes`
- Role: Caches selected managed nodes entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `private WaypointSceneBuilder()`
- Role: Creates a new WaypointSceneBuilder instance.
- Description: Constructs the instance and initializes its default state.

#### `public static BuildResult build(`
- Role: Handles the build workflow.
- Description: Supports the build operation used by the surrounding class.

#### `private static void _appendResidentEdge(`
- Role: Handles the append resident edge workflow.
- Description: Supports the append resident edge operation used by the surrounding class.

#### `private static NodeVisibility _classifyNode(long gridId, WaypointGridBounds bounds)`
- Role: Performs  classify node.
- Description: Supports the classify node operation used by the surrounding class.

#### `private static ResolvedNode _resolvedNode(WaypointGridBounds bounds, ManagedWpNode node)`
- Role: Performs  resolved node.
- Description: Supports the resolved node operation used by the surrounding class.

#### `BuildResult(WaypointScene scene, Array<ManagedWpNode> selectedManagedNodes)`
- Role: Handles the build result workflow.
- Description: Supports the build result operation used by the surrounding class.
