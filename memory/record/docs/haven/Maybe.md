---
source: [Maybe.java](../../../../src/haven/Maybe.java)
created: 2026-06-13
updated: 2026-06-14
---

# Maybe

Represents the maybe Haven component.

## Members

### Constants

#### `static final Maybe<?> empty = new Maybe<Object>()`
- Role: Implements the empty operation.
- Description: Implements the static final maybe<?> empty = new maybe<object>() operation.
- Value: `new Maybe<Object>()`

### Fields

### Methods

#### `public boolean has()`
- Role: Handles the has path.
- Description: Checks the current has state.

#### `public MissingValue()`
- Role: Handles the missing value path.
- Description: Implements the missing value operation.

#### `public MissingValue(Throwable cause)`
- Role: Handles the missing value path.
- Description: Implements the missing value operation.

#### `public MissingValue(String msg)`
- Role: Handles the missing value path.
- Description: Implements the missing value operation.

#### `public MissingValue(String msg, Throwable cause)`
- Role: Handles the missing value path.
- Description: Implements the missing value operation.

#### `public static MissingValue wrap(Throwable cause)`
- Role: Handles the wrap path.
- Description: Implements the wrap operation.

#### `public default T or(T val)`
- Role: Registers a callback that fires when any supplied waitable becomes ready.
- Description: Registers a callback that fires when any supplied waitable becomes ready.

#### `public default <R> Maybe<R> map(Function<? super T, ? extends R> fn)`
- Role: Handles the map path.
- Description: Implements the map operation.

#### `public static <T> Maybe<T> of(T value)`
- Role: Builds a Maybe value from the supplied components.
- Description: Builds a Maybe value from the supplied components.

#### `public static <T> Maybe<T> from(Supplier<? extends T> value)`
- Role: Handles the from path.
- Description: Implements the from operation.

#### `public static <T> Maybe<T> reason(String reason)`
- Role: Handles the reason path.
- Description: Implements the reason operation.

#### `public static <T> Maybe<T> reason(Supplier<String> reason)`
- Role: Handles the reason path.
- Description: Implements the reason operation.

#### `public static <T> Maybe<T> not()`
- Role: Handles the not path.
- Description: Implements the not operation.

#### `public static <T> Maybe<T> not(Throwable cause)`
- Role: Handles the not path.
- Description: Implements the not operation.

#### `public static <T> Maybe<T> not(Supplier<? extends Throwable> cause)`
- Role: Handles the not path.
- Description: Implements the not operation.