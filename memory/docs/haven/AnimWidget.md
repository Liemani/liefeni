# AnimWidget

This file documents the responsibilities and members of `AnimWidget`.

## Meta

- Source: [AnimWidget.java](../../../src/haven/AnimWidget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a widget that animates over time.

## Members

### Constants

### Fields

#### `public final AnimWidget w`

- Description: TODO

#### `public final Collection<Anim> anims = new ArrayList<>()`

- Description: TODO

#### `public final Collection<Anim> nanims = new ArrayList<>()`

- Description: TODO

#### `public final AnimWidget w`

- Description: TODO

#### `private double a = 0.0`

- Description: TODO

#### `private final double s`

- Description: TODO

### Methods

#### `public <E extends Event> void listen(Class<E> t, EventHandler<? super E> h)`

- Description: TODO

#### `public boolean deafen(EventHandler<?> h)`

- Description: TODO

#### `public <H extends EventHandler<?>> H listening(Class<H> cl)`

- Description: TODO

#### `public Handler(AnimWidget w)`

- Description: TODO

#### `private void checkempty()`

- Description: TODO

#### `public boolean handle(TickEvent ev)`

- Description: TODO

#### `public void add(Anim anim)`

- Description: TODO

#### `public void remove(Anim anim)`

- Description: TODO

#### `public static Handler get(AnimWidget w, boolean creat)`

- Description: TODO

#### `public default <A extends Anim> A animated(Class<A> type)`

- Description: TODO

#### `public default void clearanims(Class<?> type)`

- Description: TODO

#### `public Anim(AnimWidget w)`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `public abstract boolean tick(double dt)`

- Description: TODO

#### `public NormAnim(AnimWidget w, double s)`

- Description: TODO

#### `public boolean tick(double dt)`

- Description: TODO

#### `public abstract void ntick(double a)`

- Description: TODO
