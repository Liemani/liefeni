---
source: [PType.java](../../../src/haven/PType.java)
created: 2026-06-13
updated: 2026-06-14
---

# PType

Represents the ptype Haven component.

## Nested Types

### Cast

- Role: Represents cast within PType.
- Description: Describes the nested cast type used by the enclosing class.

### MapValue

- Role: Represents map value within PType.
- Description: Describes the nested map value type used by the enclosing class.

### OFunction

- Role: Represents ofunction within PType.
- Description: Describes the nested ofunction type used by the enclosing class.

### Or

- Role: Represents or within PType.
- Description: Describes the nested or type used by the enclosing class.

## Members

### Constants

#### `public static final PType<String> STR = new Cast<>(String.class)`
- Role: Defines the shared str constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Number> NUM = new Cast<>(Number.class)`
- Role: Defines the shared num constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Integer> INT = new MapValue<>(NUM, Number::intValue)`
- Role: Defines the shared int constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Long> UINT = new MapValue<>(INT, Utils::uint32)`
- Role: Defines the shared uint constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Float> FLOAT = new MapValue<>(NUM, Number::floatValue)`
- Role: Defines the shared float constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Double> DOUBLE = new MapValue<>(NUM, Number::doubleValue)`
- Role: Defines the shared double constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Boolean> BOOL = new Or<>("bool", new Cast<>(Boolean.class), new MapValue<>(INT, v -> v != 0))`
- Role: Defines the shared bool constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<byte[]> BYTES = new Cast<>(byte[].class)`
- Role: Defines the shared bytes constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Indir<Resource>> IRES = new Or<>("ires",`
- Role: Defines the shared ires constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Resource> RES = new Or<>("res", new Cast<>(Resource.class),`
- Role: Defines the shared res constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Object[]> OBJS = new Or<>("object-array", new Cast<>(Object[].class),`
- Role: Defines the shared objs constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<List<?>> LIST = new Or<>("object-list", new MapValue<>(new Cast<List>(List.class), l -> (List<?>)l),`
- Role: Defines the shared list constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Map<?, ?>> MAP = new MapValue<>(new Cast<>(Map.class), m -> (Map<?, ?>)m)`
- Role: Defines the shared map constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Coord> COORD = new Cast<>(Coord.class)`
- Role: Defines the shared coord constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<Coord2d> FCOORD = new Cast<>(Coord2d.class)`
- Role: Defines the shared fcoord constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<java.awt.Color> COLOR = new Cast<>(java.awt.Color.class)`
- Role: Defines the shared color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<FColor> FCOLOR = new Or<>("fcolor", new Cast<>(FColor.class),`
- Role: Defines the shared fcolor constant.
- Description: Shared constant used by the rest of the class.

#### `public static final PType<UID> UNIQID = new Cast<>(UID.class)`
- Role: Defines the shared uniqid constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final String expected`
- Role: Stores the expected value.
- Description: Backs the cached state for this file.

#### `public final Object got`
- Role: Holds the got state.
- Description: Backs the cached state for this file.

#### `public final Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `public final int idx`
- Role: Stores the idx value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `private final Collection<PType<T>> variants`
- Role: Caches variants entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final Function<Object, Maybe<T>> fun`
- Role: Holds the fun state.
- Description: Backs the cached state for this file.

#### `public final Class<T> cl`
- Role: Holds the cl state.
- Description: Backs the cached state for this file.

#### `public final PType<P> bk`
- Role: Holds the bk state.
- Description: Backs the cached state for this file.

#### `public final Function<P, R> xf`
- Role: Holds the xf state.
- Description: Backs the cached state for this file.

### Methods

#### `public Maybe<T> opt(Object val)`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.

#### `public default T of(Object val)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public default boolean is(Object val)`
- Role: Performs is.
- Description: Supports the is operation used by the surrounding class.

#### `public ValueFormatException(String expected, Object got)`
- Role: Performs value format exception.
- Description: Supports the value format exception operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public MissingArgumentException(Object[] args, int idx)`
- Role: Performs missing argument exception.
- Description: Supports the missing argument exception operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public default Maybe<T> opt(Object[] arr, int idx)`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.

#### `public Or(String name, PType<T>... variants)`
- Role: Performs or.
- Description: Supports the or operation used by the surrounding class.

#### `public Maybe<T> opt(Object val)`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.

#### `public OFunction(String name, Function<Object, Maybe<T>> fun)`
- Role: Performs ofunction.
- Description: Supports the ofunction operation used by the surrounding class.

#### `public Maybe<T> opt(Object val)`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.

#### `public Cast(Class<T> cl)`
- Role: Performs cast.
- Description: Supports the cast operation used by the surrounding class.

#### `public Maybe<T> opt(Object val)`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.

#### `public MapValue(PType<P> bk, Function<P, R> xf)`
- Role: Performs map value.
- Description: Supports the map value operation used by the surrounding class.

#### `public Maybe<R> opt(Object val)`
- Role: Performs opt.
- Description: Supports the opt operation used by the surrounding class.
