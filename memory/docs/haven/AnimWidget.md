# AnimWidget

This file documents the responsibilities and members of `AnimWidget`.

## Meta

- Source: [AnimWidget.java](../../../src/haven/AnimWidget.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the anim widget Haven component.

## Members

### Constants

### Fields

#### `public final AnimWidget w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `public final Collection<Anim> anims = new ArrayList<>()`
- Role: Caches anims entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Collection<Anim> nanims = new ArrayList<>()`
- Role: Caches nanims entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final AnimWidget w`
- Role: Stores the w value.
- Description: Backs the cached state for this file.

#### `private double a = 0.0`
- Role: Stores the a value.
- Description: Backs the cached state for this file.

#### `private final double s`
- Role: Stores the s value.
- Description: Backs the cached state for this file.

### Methods

#### `public <E extends Event> void listen(Class<E> t, EventHandler<? super E> h)`
- Role: Performs listen.
- Description: Supports the listen operation used by the surrounding class.

#### `public boolean deafen(EventHandler<?> h)`
- Role: Performs deafen.
- Description: Supports the deafen operation used by the surrounding class.

#### `public <H extends EventHandler<?>> H listening(Class<H> cl)`
- Role: Performs listening.
- Description: Supports the listening operation used by the surrounding class.

#### `public Handler(AnimWidget w)`
- Role: Performs handler.
- Description: Supports the handler operation used by the surrounding class.

#### `private void checkempty()`
- Role: Performs checkempty.
- Description: Supports the checkempty operation used by the surrounding class.

#### `public boolean handle(TickEvent ev)`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.

#### `public void add(Anim anim)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void remove(Anim anim)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public static Handler get(AnimWidget w, boolean creat)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public default <A extends Anim> A animated(Class<A> type)`
- Role: Performs animated.
- Description: Supports the animated operation used by the surrounding class.

#### `public default void clearanims(Class<?> type)`
- Role: Performs clearanims.
- Description: Supports the clearanims operation used by the surrounding class.

#### `public Anim(AnimWidget w)`
- Role: Performs anim.
- Description: Supports the anim operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public abstract boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public NormAnim(AnimWidget w, double s)`
- Role: Performs norm anim.
- Description: Supports the norm anim operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public abstract void ntick(double a)`
- Role: Performs ntick.
- Description: Supports the ntick operation used by the surrounding class.
