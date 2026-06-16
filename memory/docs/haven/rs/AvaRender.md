# AvaRender

This file documents the responsibilities and members of `AvaRender`.

## Meta

- Source: [AvaRender.java](../../../../src/haven/rs/AvaRender.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

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
- Role: Defines the shared ctxr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Server.Command call = new Server.Command()`
- Role: Defines the shared call constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Resource.Pool pool`
- Role: Stores the pool value.
- Description: Backs the cached state for this file.

#### `public final Resource.Resolver map`
- Role: Stores the map value.
- Description: Backs the cached state for this file.

### Methods

#### `public ServerRes(Resource.Pool pool)`
- Role: Performs server res.
- Description: Supports the server res operation used by the surrounding class.

#### `public Indir<Resource> getres(int id)`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public ServerDescriptor(ServerRes rr)`
- Role: Performs server descriptor.
- Description: Supports the server descriptor operation used by the surrounding class.

#### `public Maybe<Indir<Resource>> opt(Object desc)`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.

#### `@Override public PType<Indir<Resource>> desc()`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public Indir<Resource> dynres(UID uid)`
- Role: Performs dynres.
- Description: Supports the dynres operation used by the surrounding class.

#### `public Owner(Resource.Resolver map)`
- Role: Performs owner.
- Description: Supports the owner operation used by the surrounding class.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public static Composited compose(Composited.Desc desc, Resource.Resolver map)`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.

#### `public static BufferedImage render(Coord sz, Composited.Desc desc, Resource.Resolver map, String camnm)`
- Role: Performs render.
- Description: Supports the render operation used by the surrounding class.

#### `public static void main(String[] args) throws Exception`
- Role: Handles the main workflow.
- Description: Supports the main operation used by the surrounding class.
