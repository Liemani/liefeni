---
source: [AnimWidget.java](../../../../src/haven/AnimWidget.java)
created: 2026-06-13
updated: 2026-06-14
---

# AnimWidget

Represents the anim widget Haven component.

## Members

### Constants

### Fields

#### `public final AnimWidget w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `public final Collection<Anim> anims = new ArrayList<>()`
- Role: Implements the anims operation.
- Description: Implements the public final collection<anim> anims = new array list<>() operation.

#### `public final Collection<Anim> nanims = new ArrayList<>()`
- Role: Implements the nanims operation.
- Description: Implements the public final collection<anim> nanims = new array list<>() operation.

#### `public final AnimWidget w`
- Role: Caches the w value.
- Description: Caches the `w` value for reuse.

#### `private double a = 0.0`
- Role: Caches the a value.
- Description: Caches the `a` value for reuse.

#### `private final double s`
- Role: Caches the s value.
- Description: Caches the `s` value for reuse.

### Methods

#### `public <E extends Event> void listen(Class<E> t, EventHandler<? super E> h)`
- Role: Handles the listen path.
- Description: Implements the listen operation.

#### `public boolean deafen(EventHandler<?> h)`
- Role: Handles the deafen path.
- Description: Implements the deafen operation.

#### `public <H extends EventHandler<?>> H listening(Class<H> cl)`
- Role: Handles the listening path.
- Description: Implements the listening operation.

#### `public Handler(AnimWidget w)`
- Role: Handles the handler path.
- Description: Implements the handler operation.

#### `private void checkempty()`
- Role: Handles the checkempty path.
- Description: Implements the checkempty operation.

#### `public boolean handle(TickEvent ev)`
- Role: Handles the handle path.
- Description: Implements the handle operation.

#### `public void add(Anim anim)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public void remove(Anim anim)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public static Handler get(AnimWidget w, boolean creat)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public default <A extends Anim> A animated(Class<A> type)`
- Role: Handles the animated path.
- Description: Implements the animated operation.

#### `public default void clearanims(Class<?> type)`
- Role: Handles the clearanims path.
- Description: Clears the anims.

#### `public Anim(AnimWidget w)`
- Role: Handles the anim path.
- Description: Implements the anim operation.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public abstract boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public NormAnim(AnimWidget w, double s)`
- Role: Handles the norm anim path.
- Description: Implements the norm anim operation.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public abstract void ntick(double a)`
- Role: Handles the ntick path.
- Description: Implements the ntick operation.