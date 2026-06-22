---
source: [Surface.java](../../../../src/haven/Surface.java)
created: 2026-06-13
updated: 2026-06-14
---

# Surface

Represents the surface Haven component.

## Nested Types

### DataID

- Role: Identifies lazily computed surface data.
- Description: Factory interface for cached data objects attached to a Surface.

### Face

- Role: Stores one triangular face.
- Description: Face record that stores three vertices and registers itself in the surface.

### MeshVertex

- Role: Bridges a surface vertex into a mesh buffer.
- Description: MeshBuf vertex adapter that exposes the surface vertex and its computed normal.

### Normals

- Role: Caches per-vertex normals.
- Description: Lazy normal table computed from the surface faces and indexed by vertex.

### Vertex

- Role: Stores one surface vertex.
- Description: Vertex record that tracks the vertex position, index, and adjacency metadata.

## Members

### Constants

#### `public static final DataID<Normals> nrm = new DataID<Normals>()`
- Role: Implements the nrm operation.
- Description: Implements the public static final data id<normals> nrm = new data id<normals>() operation.
- Value: `new DataID<Normals>()`

### Fields

#### `private List<Vertex> v = new ArrayList<Vertex>()`
- Role: Implements the v operation.
- Description: Implements the private list<vertex> v = new array list<vertex>() operation.

#### `private Collection<Face> f = new ArrayList<Face>()`
- Role: Implements the f operation.
- Description: Implements the private collection<face> f = new array list<face>() operation.

#### `private Map<DataID, Object> data = new HashMap<DataID, Object>()`
- Role: Implements the data operation.
- Description: Implements the private map<data id, object> data = new hash map<data id, object>() operation.

#### `public Vertex[] vl, fv, tv`
- Role: Caches the tv value.
- Description: Caches the `tv` value for reuse.

#### `public Vertex[] vl, fv, tv`
- Role: Caches the tv value.
- Description: Caches the `tv` value for reuse.

#### `public Vertex[] vl, fv, tv`
- Role: Caches the tv value.
- Description: Caches the `tv` value for reuse.

#### `public final int vi`
- Role: Caches the vi value.
- Description: Caches the `vi` value for reuse.

#### `public int ei, ne`
- Role: Caches the ne value.
- Description: Caches the `ne` value for reuse.

#### `public int ei, ne`
- Role: Caches the ne value.
- Description: Caches the `ne` value for reuse.

#### `public final Vertex v`
- Role: Caches the v value.
- Description: Caches the `v` value for reuse.

#### `public final Vertex v1, v2, v3`
- Role: Caches the v3 value.
- Description: Caches the `v3` value for reuse.

#### `public final Vertex v1, v2, v3`
- Role: Caches the v3 value.
- Description: Caches the `v3` value for reuse.

#### `public final Vertex v1, v2, v3`
- Role: Caches the v3 value.
- Description: Caches the `v3` value for reuse.

#### `public final Coord3f[] buf = new Coord3f[vl.length]`
- Role: Caches the buf value.
- Description: Caches the `buf` value for reuse.

### Methods

#### `public T make(Surface s)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public <T> T data(DataID<T> id)`
- Role: Handles the data path.
- Description: Implements the data operation.

#### `public Vertex(float x, float y, float z)`
- Role: Handles the vertex path.
- Description: Implements the vertex operation.

#### `public Vertex(Coord3f c)`
- Role: Handles the vertex path.
- Description: Implements the vertex operation.

#### `public Surface s()`
- Role: Handles the s path.
- Description: Implements the s operation.

#### `public void modify(MeshBuf buf, MeshBuf.Vertex v)`
- Role: Handles the modify path.
- Description: Implements the modify operation.

#### `public MeshVertex(MeshBuf buf, Vertex v)`
- Role: Handles the mesh vertex path.
- Description: Implements the mesh vertex operation.

#### `public Face(Vertex v1, Vertex v2, Vertex v3)`
- Role: Handles the face path.
- Description: Implements the face operation.

#### `public void fin()`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `private Normals()`
- Role: Handles the normals path.
- Description: Implements the normals operation.

#### `public Coord3f get(Vertex v)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void set(Vertex v, Coord3f n)`
- Role: Handles the set path.
- Description: Updates the cached set.