# AvaRender

This file documents the responsibilities and members of `AvaRender`.

## Meta

- Source: [AvaRender.java](../../../../src/haven/rs/AvaRender.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides avatar rendering support.

## Nested Types

### Owner

- Description: TODO

### ServerDescriptor

- Description: TODO

### ServerRes

- Description: TODO

## Members

### Constants

#### `private static final OwnerContext.ClassResolver<Owner> ctxr = new OwnerContext.ClassResolver<Owner>()`

- Description: TODO

#### `public static final Server.Command call = new Server.Command()`

- Description: TODO

### Fields

#### `public final Resource.Pool pool`

- Description: TODO

#### `public final Resource.Resolver map`

- Description: TODO

### Methods

#### `public ServerRes(Resource.Pool pool)`

- Description: TODO

#### `public Indir<Resource> getres(int id)`

- Description: TODO

#### `public ServerDescriptor(ServerRes rr)`

- Description: TODO

#### `public Maybe<Indir<Resource>> opt(Object desc)`

- Description: TODO

#### `@Override public PType<Indir<Resource>> desc()`

- Description: TODO

#### `public Indir<Resource> dynres(UID uid)`

- Description: TODO

#### `public Owner(Resource.Resolver map)`

- Description: TODO

#### `public <T> T context(Class<T> cl)`

- Description: TODO

#### `public Random mkrandoom()`

- Description: TODO

#### `public static Composited compose(Composited.Desc desc, Resource.Resolver map)`

- Description: TODO

#### `public static BufferedImage render(Coord sz, Composited.Desc desc, Resource.Resolver map, String camnm)`

- Description: TODO

#### `public static void main(String[] args) throws Exception`

- Description: TODO
