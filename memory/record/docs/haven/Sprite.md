---
source: [Sprite.java](../../../src/haven/Sprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# Sprite

Represents a drawable Haven sprite.

## Nested Types

### CDel

- Role: Represents cdel within Sprite.
- Description: Describes the nested cdel type used by the enclosing class.

### CUpd

- Role: Represents cupd within Sprite.
- Description: Describes the nested cupd type used by the enclosing class.

### FactMaker

- Role: Represents fact maker within Sprite.
- Description: Describes the nested fact maker type used by the enclosing class.

### Factory

- Role: Represents factory within Sprite.
- Description: Describes the nested factory type used by the enclosing class.

### Mill

- Role: Represents mill within Sprite.
- Description: Describes the nested mill type used by the enclosing class.

### Owner

- Role: Represents owner within Sprite.
- Description: Describes the nested owner type used by the enclosing class.

### RecOwner

- Role: Represents rec owner within Sprite.
- Description: Describes the nested rec owner type used by the enclosing class.

### ResourceException

- Role: Represents resource exception within Sprite.
- Description: Describes the nested resource exception type used by the enclosing class.

### UIOwner

- Role: Represents uiowner within Sprite.
- Description: Describes the nested uiowner type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Owner owner`
- Role: Holds the owner state.
- Description: Backs the cached state for this file.

#### `public static List<Factory> factories = new LinkedList<Factory>()`
- Role: Caches factories entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Widget wdg`
- Role: Stores the wdg value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final byte[] sdt`
- Role: Stores the sdt value.
- Description: Backs the cached state for this file.

#### `public Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

### Methods

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public UIOwner(Widget wdg)`
- Role: Performs uiowner.
- Description: Supports the uiowner operation used by the surrounding class.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `public void delete()`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `public void update(Message sdt)`
- Role: Performs update.
- Description: Supports the update operation used by the surrounding class.

#### `public FactMaker()`
- Role: Performs fact maker.
- Description: Supports the fact maker operation used by the surrounding class.

#### `public Sprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public S create(Owner owner)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public FromRes(Indir<Resource> res, byte[] sdt)`
- Role: Performs from res.
- Description: Supports the from res operation used by the surrounding class.

#### `public Sprite create(Owner owner)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public static Mill<Sprite> of(Indir<Resource> res, byte[] sdt)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Mill<Sprite> of(Indir<Resource> res, Message sdt)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Mill<Sprite> of(Resource res, Message sdt)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public static Mill<Sprite> of(ResData dat)`
- Role: Performs of.
- Description: Supports the of operation used by the surrounding class.

#### `public ResourceException(String msg, Resource res)`
- Role: Performs resource exception.
- Description: Supports the resource exception operation used by the surrounding class.

#### `public ResourceException(String msg, Throwable cause, Resource res)`
- Role: Performs resource exception.
- Description: Supports the resource exception operation used by the surrounding class.

#### `protected Sprite(Owner owner, Resource res)`
- Role: Creates a new Sprite instance.
- Description: Constructs the instance and initializes its default state.

#### `public static int decnum(Message sdt)`
- Role: Performs decnum.
- Description: Supports the decnum operation used by the surrounding class.

#### `public static Sprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Supports the tick operation used by the surrounding class.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void age()`
- Role: Performs age.
- Description: Supports the age operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
