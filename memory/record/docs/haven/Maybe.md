---
source: [Maybe.java](../../../src/haven/Maybe.java)
created: 2026-06-13
updated: 2026-06-14
---

# Maybe

Represents the maybe Haven component.

## Members

### Constants

#### `static final Maybe<?> empty = new Maybe<Object>()`
- Role: Defines the shared empty constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public boolean has()`
- Role: Performs has.
- Description: Supports the has operation used by the surrounding class.

#### `public MissingValue()`
- Role: Performs missing value.
- Description: Supports the missing value operation used by the surrounding class.

#### `public MissingValue(Throwable cause)`
- Role: Performs missing value.
- Description: Supports the missing value operation used by the surrounding class.

#### `public MissingValue(String msg)`
- Role: Performs missing value.
- Description: Supports the missing value operation used by the surrounding class.

#### `public MissingValue(String msg, Throwable cause)`
- Role: Performs missing value.
- Description: Supports the missing value operation used by the surrounding class.

#### `public static MissingValue wrap(Throwable cause)`
- Role: Performs wrap.
- Description: Supports the wrap operation used by the surrounding class.

#### `public default T or(T val)`
- Role: Performs or.
- Description: Supports the or operation used by the surrounding class.

#### `public default <R> Maybe<R> map(Function<? super T, ? extends R> fn)`
- Role: Performs map.
- Description: Supports the map operation used by the surrounding class.

#### `public static <T> Maybe<T> of(T value)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static <T> Maybe<T> from(Supplier<? extends T> value)`
- Role: Performs from.
- Description: Supports the from operation used by the surrounding class.

#### `public static <T> Maybe<T> reason(String reason)`
- Role: Performs reason.
- Description: Supports the reason operation used by the surrounding class.

#### `public static <T> Maybe<T> reason(Supplier<String> reason)`
- Role: Performs reason.
- Description: Supports the reason operation used by the surrounding class.

#### `public static <T> Maybe<T> not()`
- Role: Performs not.
- Description: Supports the not operation used by the surrounding class.

#### `public static <T> Maybe<T> not(Throwable cause)`
- Role: Performs not.
- Description: Supports the not operation used by the surrounding class.

#### `public static <T> Maybe<T> not(Supplier<? extends Throwable> cause)`
- Role: Performs not.
- Description: Supports the not operation used by the surrounding class.
