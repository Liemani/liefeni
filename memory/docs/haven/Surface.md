# Surface

This file documents the responsibilities and members of `Surface`.

## Meta

- Source: [Surface.java](../../../src/haven/Surface.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a render surface.

## Nested Types

### DataID

- Description: TODO

### Face

- Description: TODO

### MeshVertex

- Description: TODO

### Normals

- Description: TODO

### Vertex

- Description: TODO

## Members

### Constants

#### `public static final DataID<Normals> nrm = new DataID<Normals>()`

- Description: TODO

### Fields

#### `private List<Vertex> v = new ArrayList<Vertex>()`

- Description: TODO

#### `private Collection<Face> f = new ArrayList<Face>()`

- Description: TODO

#### `private Map<DataID, Object> data = new HashMap<DataID, Object>()`

- Description: TODO

#### `public Vertex[] vl, fv, tv`

- Description: TODO

#### `public Vertex[] vl, fv, tv`

- Description: TODO

#### `public Vertex[] vl, fv, tv`

- Description: TODO

#### `public final int vi`

- Description: TODO

#### `public int ei, ne`

- Description: TODO

#### `public int ei, ne`

- Description: TODO

#### `public final Vertex v`

- Description: TODO

#### `public final Vertex v1, v2, v3`

- Description: TODO

#### `public final Vertex v1, v2, v3`

- Description: TODO

#### `public final Vertex v1, v2, v3`

- Description: TODO

#### `public final Coord3f[] buf = new Coord3f[vl.length]`

- Description: TODO

### Methods

#### `public T make(Surface s)`

- Description: TODO

#### `public <T> T data(DataID<T> id)`

- Description: TODO

#### `public Vertex(float x, float y, float z)`

- Description: TODO

#### `public Vertex(Coord3f c)`

- Description: TODO

#### `public Surface s()`

- Description: TODO

#### `public void modify(MeshBuf buf, MeshBuf.Vertex v)`

- Description: TODO

#### `public MeshVertex(MeshBuf buf, Vertex v)`

- Description: TODO

#### `public Face(Vertex v1, Vertex v2, Vertex v3)`

- Description: TODO

#### `public void fin()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `private Normals()`

- Description: TODO

#### `public Coord3f get(Vertex v)`

- Description: TODO

#### `public void set(Vertex v, Coord3f n)`

- Description: TODO
