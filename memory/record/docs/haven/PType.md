---
source: [PType.java](../../../../src/haven/PType.java)
created: 2026-06-13
updated: 2026-06-14
---

# PType

Represents the ptype Haven component.

## Nested Types

### Cast

- Role: Converts an object to a strongly typed value when it already has the correct runtime class.
- Description: Verifies the expected runtime type and returns the converted value.

### MapValue

- Role: Maps one parsed value into another typed value.
- Description: Applies a transform function after the source type has parsed successfully.

### OFunction

- Role: Wraps a parsing function as a `PType`.
- Description: Uses a lambda to convert argv input into a typed value.

### Or

- Role: Tries multiple parsing strategies for the same logical type.
- Description: Parses with a primary type and falls back to the alternative conversion if needed.

## Members

### Constants

#### `public static final PType<String> STR = new Cast<>(String.class)`
- Role: Implements the str operation.
- Description: Implements the public static final p type<string> str = new cast<>(string.class) operation.
- Value: `new Cast<>(String.class)`

#### `public static final PType<Number> NUM = new Cast<>(Number.class)`
- Role: Implements the num operation.
- Description: Implements the public static final p type<number> num = new cast<>(number.class) operation.
- Value: `new Cast<>(Number.class)`

#### `public static final PType<Integer> INT = new MapValue<>(NUM, Number::intValue)`
- Role: Implements the int operation.
- Description: Implements the public static final p type<integer> int = new map value<>(num, number::int value) operation.
- Value: `new MapValue<>(NUM, Number::intValue)`

#### `public static final PType<Long> UINT = new MapValue<>(INT, Utils::uint32)`
- Role: Implements the uint operation.
- Description: Implements the public static final p type<long> uint = new map value<>(int, utils::uint32) operation.
- Value: `new MapValue<>(INT, Utils::uint32)`

#### `public static final PType<Float> FLOAT = new MapValue<>(NUM, Number::floatValue)`
- Role: Implements the float operation.
- Description: Implements the public static final p type<float> float = new map value<>(num, number::float value) operation.
- Value: `new MapValue<>(NUM, Number::floatValue)`

#### `public static final PType<Double> DOUBLE = new MapValue<>(NUM, Number::doubleValue)`
- Role: Implements the double operation.
- Description: Implements the public static final p type<double> double = new map value<>(num, number::double value) operation.
- Value: `new MapValue<>(NUM, Number::doubleValue)`

#### `public static final PType<Boolean> BOOL = new Or<>("bool", new Cast<>(Boolean.class), new MapValue<>(INT, v -> v != 0))`
- Role: Implements the bool operation.
- Description: Implements the public static final p type<boolean> bool = new or<>("bool", new cast<>(boolean.class), new map value<>(int, v -> v != 0)) operation.
- Value: `new Or<>("bool", new Cast<>(Boolean.class), new MapValue<>(INT, v -> v != 0))`

#### `public static final PType<byte[]> BYTES = new Cast<>(byte[].class)`
- Role: Implements the bytes operation.
- Description: Implements the public static final p type<byte[]> bytes = new cast<>(byte[].class) operation.
- Value: `new Cast<>(byte[].class)`

#### `public static final PType<Indir<Resource>> IRES = new Or<>("ires",`
- Role: Implements the ires operation.
- Description: Implements the public static final p type<indir<resource>> ires = new or<>("ires", operation.
- Value: `new Or<>("ires",`

#### `public static final PType<Resource> RES = new Or<>("res", new Cast<>(Resource.class),`
- Role: Implements the res operation.
- Description: Implements the public static final p type<resource> res = new or<>("res", new cast<>(resource.class), operation.
- Value: `new Or<>("res", new Cast<>(Resource.class),`

#### `public static final PType<Object[]> OBJS = new Or<>("object-array", new Cast<>(Object[].class),`
- Role: Implements the objs operation.
- Description: Implements the public static final p type<object[]> objs = new or<>("object-array", new cast<>(object[].class), operation.
- Value: `new Or<>("object-array", new Cast<>(Object[].class),`

#### `public static final PType<List<?>> LIST = new Or<>("object-list", new MapValue<>(new Cast<List>(List.class), l -> (List<?>)l),`
- Role: Implements the list operation.
- Description: Implements the public static final p type<list<?>> list = new or<>("object-list", new map value<>(new cast<list>(list.class), l -> (list<?>)l), operation.
- Value: `new Or<>("object-list", new MapValue<>(new Cast<List>(List.class), l -> (List<?>)l),`

#### `public static final PType<Map<?, ?>> MAP = new MapValue<>(new Cast<>(Map.class), m -> (Map<?, ?>)m)`
- Role: Implements the map operation.
- Description: Implements the public static final p type<map<?, ?>> map = new map value<>(new cast<>(map.class), m -> (map<?, ?>)m) operation.
- Value: `new MapValue<>(new Cast<>(Map.class), m -> (Map<?, ?>)m)`

#### `public static final PType<Coord> COORD = new Cast<>(Coord.class)`
- Role: Implements the coord operation.
- Description: Implements the public static final p type<coord> coord = new cast<>(coord.class) operation.
- Value: `new Cast<>(Coord.class)`

#### `public static final PType<Coord2d> FCOORD = new Cast<>(Coord2d.class)`
- Role: Implements the fcoord operation.
- Description: Implements the public static final p type<coord2d> fcoord = new cast<>(coord2d.class) operation.
- Value: `new Cast<>(Coord2d.class)`

#### `public static final PType<java.awt.Color> COLOR = new Cast<>(java.awt.Color.class)`
- Role: Implements the color operation.
- Description: Implements the public static final p type<java.awt.color> color = new cast<>(java.awt.color.class) operation.
- Value: `new Cast<>(java.awt.Color.class)`

#### `public static final PType<FColor> FCOLOR = new Or<>("fcolor", new Cast<>(FColor.class),`
- Role: Implements the fcolor operation.
- Description: Implements the public static final p type<f color> fcolor = new or<>("fcolor", new cast<>(f color.class), operation.
- Value: `new Or<>("fcolor", new Cast<>(FColor.class),`

#### `public static final PType<UID> UNIQID = new Cast<>(UID.class)`
- Role: Implements the uniqid operation.
- Description: Implements the public static final p type<uid> uniqid = new cast<>(uid.class) operation.
- Value: `new Cast<>(UID.class)`

### Fields

#### `public final String expected`
- Role: Caches the expected value.
- Description: Caches the `expected` value for reuse.

#### `public final Object got`
- Role: Caches the got value.
- Description: Caches the `got` value for reuse.

#### `public final Object[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

#### `public final int idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `private final Collection<PType<T>> variants`
- Role: Caches the variants value.
- Description: Caches the `variants` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final Function<Object, Maybe<T>> fun`
- Role: Caches the fun value.
- Description: Caches the `fun` value for reuse.

#### `public final Class<T> cl`
- Role: Caches the cl value.
- Description: Caches the `cl` value for reuse.

#### `public final PType<P> bk`
- Role: Caches the bk value.
- Description: Caches the `bk` value for reuse.

#### `public final Function<P, R> xf`
- Role: Caches the xf value.
- Description: Caches the `xf` value for reuse.

### Methods

#### `public Maybe<T> opt(Object val)`
- Role: Handles the opt path.
- Description: Implements the opt operation.

#### `public default T of(Object val)`
- Role: Builds a PType value from the supplied components.
- Description: Builds a PType value from the supplied components.

#### `public default boolean is(Object val)`
- Role: Handles the is path.
- Description: Checks the current is state.

#### `public ValueFormatException(String expected, Object got)`
- Role: Handles the value format exception path.
- Description: Implements the value format exception operation.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Returns the message.

#### `public MissingArgumentException(Object[] args, int idx)`
- Role: Handles the missing argument exception path.
- Description: Implements the missing argument exception operation.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Returns the message.

#### `public default Maybe<T> opt(Object[] arr, int idx)`
- Role: Handles the opt path.
- Description: Implements the opt operation.

#### `public Or(String name, PType<T>... variants)`
- Role: Registers a callback that fires when any supplied waitable becomes ready.
- Description: Registers a callback that fires when any supplied waitable becomes ready.

#### `public Maybe<T> opt(Object val)`
- Role: Handles the opt path.
- Description: Implements the opt operation.

#### `public OFunction(String name, Function<Object, Maybe<T>> fun)`
- Role: Handles the ofunction path.
- Description: Implements the o function operation.

#### `public Maybe<T> opt(Object val)`
- Role: Handles the opt path.
- Description: Implements the opt operation.

#### `public Cast(Class<T> cl)`
- Role: Handles the cast path.
- Description: Implements the cast operation.

#### `public Maybe<T> opt(Object val)`
- Role: Handles the opt path.
- Description: Implements the opt operation.

#### `public MapValue(PType<P> bk, Function<P, R> xf)`
- Role: Handles the map value path.
- Description: Implements the map value operation.

#### `public Maybe<R> opt(Object val)`
- Role: Handles the opt path.
- Description: Implements the opt operation.