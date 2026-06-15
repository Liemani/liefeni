# Maybe

This file documents the responsibilities and members of `Maybe`.

## Meta

- Source: [Maybe.java](../../../src/haven/Maybe.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an optional value.

## Members

### Constants

#### `static final Maybe<?> empty = new Maybe<Object>()`

- Description: TODO

### Fields

### Methods

#### `public boolean has()`

- Description: TODO

#### `public MissingValue()`

- Description: TODO

#### `public MissingValue(Throwable cause)`

- Description: TODO

#### `public MissingValue(String msg)`

- Description: TODO

#### `public MissingValue(String msg, Throwable cause)`

- Description: TODO

#### `public static MissingValue wrap(Throwable cause)`

- Description: TODO

#### `public default T or(T val)`

- Description: TODO

#### `public default <R> Maybe<R> map(Function<? super T, ? extends R> fn)`

- Description: TODO

#### `public static <T> Maybe<T> of(T value)`

- Description: TODO

#### `public static <T> Maybe<T> from(Supplier<? extends T> value)`

- Description: TODO

#### `public static <T> Maybe<T> reason(String reason)`

- Description: TODO

#### `public static <T> Maybe<T> reason(Supplier<String> reason)`

- Description: TODO

#### `public static <T> Maybe<T> not()`

- Description: TODO

#### `public static <T> Maybe<T> not(Throwable cause)`

- Description: TODO

#### `public static <T> Maybe<T> not(Supplier<? extends Throwable> cause)`

- Description: TODO
