# Surface

This file documents the responsibilities and members of `Surface`.

## Meta

- Source: [Surface.java](../../../src/haven/Surface.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the surface Haven component.

## Nested Types

### DataID

- Role: Represents data id within Surface.
- Description: Describes the nested data id type used by the enclosing class.

### Face

- Role: Represents face within Surface.
- Description: Describes the nested face type used by the enclosing class.

### MeshVertex

- Role: Represents mesh vertex within Surface.
- Description: Describes the nested mesh vertex type used by the enclosing class.

### Normals

- Role: Represents normals within Surface.
- Description: Describes the nested normals type used by the enclosing class.

### Vertex

- Role: Represents vertex within Surface.
- Description: Describes the nested vertex type used by the enclosing class.

## Members

### Constants

#### `public static final DataID<Normals> nrm = new DataID<Normals>()`
- Role: Defines the shared nrm constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private List<Vertex> v = new ArrayList<Vertex>()`
- Role: Caches v entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Collection<Face> f = new ArrayList<Face>()`
- Role: Caches f entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Map<DataID, Object> data = new HashMap<DataID, Object>()`
- Role: Caches data entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Vertex[] vl, fv, tv`
- Role: Stores the tv value.
- Description: Backs the cached state for this file.

#### `public Vertex[] vl, fv, tv`
- Role: Stores the tv value.
- Description: Backs the cached state for this file.

#### `public Vertex[] vl, fv, tv`
- Role: Stores the tv value.
- Description: Backs the cached state for this file.

#### `public final int vi`
- Role: Stores the vi value.
- Description: Backs the cached state for this file.

#### `public int ei, ne`
- Role: Stores the ne value.
- Description: Backs the cached state for this file.

#### `public int ei, ne`
- Role: Stores the ne value.
- Description: Backs the cached state for this file.

#### `public final Vertex v`
- Role: Stores the v value.
- Description: Backs the cached state for this file.

#### `public final Vertex v1, v2, v3`
- Role: Stores the v3 value.
- Description: Backs the cached state for this file.

#### `public final Vertex v1, v2, v3`
- Role: Stores the v3 value.
- Description: Backs the cached state for this file.

#### `public final Vertex v1, v2, v3`
- Role: Stores the v3 value.
- Description: Backs the cached state for this file.

#### `public final Coord3f[] buf = new Coord3f[vl.length]`
- Role: Stores the buf value.
- Description: Backs the cached state for this file.

### Methods

#### `public T make(Surface s)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public <T> T data(DataID<T> id)`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.

#### `public Vertex(float x, float y, float z)`
- Role: Performs vertex.
- Description: Supports the vertex operation used by the surrounding class.

#### `public Vertex(Coord3f c)`
- Role: Performs vertex.
- Description: Supports the vertex operation used by the surrounding class.

#### `public Surface s()`
- Role: Performs s.
- Description: Supports the s operation used by the surrounding class.

#### `public void modify(MeshBuf buf, MeshBuf.Vertex v)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public MeshVertex(MeshBuf buf, Vertex v)`
- Role: Performs mesh vertex.
- Description: Supports the mesh vertex operation used by the surrounding class.

#### `public Face(Vertex v1, Vertex v2, Vertex v3)`
- Role: Performs face.
- Description: Supports the face operation used by the surrounding class.

#### `public void fin()`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `private Normals()`
- Role: Performs normals.
- Description: Supports the normals operation used by the surrounding class.

#### `public Coord3f get(Vertex v)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void set(Vertex v, Coord3f n)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.
