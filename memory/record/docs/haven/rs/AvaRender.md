---
source: [AvaRender.java](../../../../../src/haven/rs/AvaRender.java)
created: 2026-06-13
updated: 2026-06-14
---

# AvaRender

Integrates Haven rendering-server support for ava render.

## Nested Types

### Owner

- Role: Represents owner within AvaRender.
- Description: Describes the nested owner type used by the enclosing class.

### ServerDescriptor

- Role: Represents server descriptor within AvaRender.
- Description: Describes the nested server descriptor type used by the enclosing class.

### ServerRes

- Role: Represents server res within AvaRender.
- Description: Describes the nested server res type used by the enclosing class.

## Members

### Constants

#### `private static final OwnerContext.ClassResolver<Owner> ctxr = new OwnerContext.ClassResolver<Owner>()`
- Role: Implements the ctxr operation.
- Description: Implements the private static final owner context.class resolver<owner> ctxr = new owner context.class resolver<owner>() operation.
- Value: `new OwnerContext.ClassResolver<Owner>()`

#### `public static final Server.Command call = new Server.Command()`
- Role: Implements the call operation.
- Description: Implements the command operation.
- Value: `new Server.Command()`

### Fields

#### `public final Resource.Pool pool`
- Role: Caches the pool value.
- Description: Caches the `pool` value for reuse.

#### `public final Resource.Resolver map`
- Role: Caches the map value.
- Description: Caches the `map` value for reuse.

### Methods

#### `public ServerRes(Resource.Pool pool)`
- Role: Handles the server resource path.
- Description: Implements the server res operation.

#### `public Indir<Resource> getres(int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public ServerDescriptor(ServerRes rr)`
- Role: Handles the server descriptor path.
- Description: Implements the server descriptor operation.

#### `public Maybe<Indir<Resource>> opt(Object desc)`
- Role: Handles the opt path.
- Description: Implements the opt operation.

#### `@Override public PType<Indir<Resource>> desc()`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public Indir<Resource> dynres(UID uid)`
- Role: Handles the dynres path.
- Description: Implements the dynres operation.

#### `public Owner(Resource.Resolver map)`
- Role: Handles the owner path.
- Description: Implements the owner operation.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public static Composited compose(Composited.Desc desc, Resource.Resolver map)`
- Role: Handles the compose path.
- Description: Implements the compose operation.

#### `public static BufferedImage render(Coord sz, Composited.Desc desc, Resource.Resolver map, String camnm)`
- Role: Renders the document or text into a RichText image.
- Description: Renders the document or text into a `RichText` image.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Runs the client entry point.