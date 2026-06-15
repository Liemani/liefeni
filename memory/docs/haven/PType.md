# PType

This file documents the responsibilities and members of `PType`.

## Meta

- Source: [PType.java](../../../src/haven/PType.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines protocol or packet types.

## Nested Types

### Cast

- Description: TODO

### MapValue

- Description: TODO

### OFunction

- Description: TODO

### Or

- Description: TODO

## Members

### Constants

#### `public static final PType<String> STR = new Cast<>(String.class)`

- Description: TODO

#### `public static final PType<Number> NUM = new Cast<>(Number.class)`

- Description: TODO

#### `public static final PType<Integer> INT = new MapValue<>(NUM, Number::intValue)`

- Description: TODO

#### `public static final PType<Long> UINT = new MapValue<>(INT, Utils::uint32)`

- Description: TODO

#### `public static final PType<Float> FLOAT = new MapValue<>(NUM, Number::floatValue)`

- Description: TODO

#### `public static final PType<Double> DOUBLE = new MapValue<>(NUM, Number::doubleValue)`

- Description: TODO

#### `public static final PType<Boolean> BOOL = new Or<>("bool", new Cast<>(Boolean.class), new MapValue<>(INT, v -> v != 0))`

- Description: TODO

#### `public static final PType<byte[]> BYTES = new Cast<>(byte[].class)`

- Description: TODO

#### `public static final PType<Indir<Resource>> IRES = new Or<>("ires",`

- Description: TODO

#### `public static final PType<Resource> RES = new Or<>("res", new Cast<>(Resource.class),`

- Description: TODO

#### `public static final PType<Object[]> OBJS = new Or<>("object-array", new Cast<>(Object[].class),`

- Description: TODO

#### `public static final PType<List<?>> LIST = new Or<>("object-list", new MapValue<>(new Cast<List>(List.class), l -> (List<?>)l),`

- Description: TODO

#### `public static final PType<Map<?, ?>> MAP = new MapValue<>(new Cast<>(Map.class), m -> (Map<?, ?>)m)`

- Description: TODO

#### `public static final PType<Coord> COORD = new Cast<>(Coord.class)`

- Description: TODO

#### `public static final PType<Coord2d> FCOORD = new Cast<>(Coord2d.class)`

- Description: TODO

#### `public static final PType<java.awt.Color> COLOR = new Cast<>(java.awt.Color.class)`

- Description: TODO

#### `public static final PType<FColor> FCOLOR = new Or<>("fcolor", new Cast<>(FColor.class),`

- Description: TODO

#### `public static final PType<UID> UNIQID = new Cast<>(UID.class)`

- Description: TODO

### Fields

#### `public final String expected`

- Description: TODO

#### `public final Object got`

- Description: TODO

#### `public final Object[] args`

- Description: TODO

#### `public final int idx`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `private final Collection<PType<T>> variants`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final Function<Object, Maybe<T>> fun`

- Description: TODO

#### `public final Class<T> cl`

- Description: TODO

#### `public final PType<P> bk`

- Description: TODO

#### `public final Function<P, R> xf`

- Description: TODO

### Methods

#### `public Maybe<T> opt(Object val)`

- Description: TODO

#### `public default T of(Object val)`

- Description: TODO

#### `public default boolean is(Object val)`

- Description: TODO

#### `public ValueFormatException(String expected, Object got)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public MissingArgumentException(Object[] args, int idx)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public default Maybe<T> opt(Object[] arr, int idx)`

- Description: TODO

#### `public Or(String name, PType<T>... variants)`

- Description: TODO

#### `public Maybe<T> opt(Object val)`

- Description: TODO

#### `public OFunction(String name, Function<Object, Maybe<T>> fun)`

- Description: TODO

#### `public Maybe<T> opt(Object val)`

- Description: TODO

#### `public Cast(Class<T> cl)`

- Description: TODO

#### `public Maybe<T> opt(Object val)`

- Description: TODO

#### `public MapValue(PType<P> bk, Function<P, R> xf)`

- Description: TODO

#### `public Maybe<R> opt(Object val)`

- Description: TODO
