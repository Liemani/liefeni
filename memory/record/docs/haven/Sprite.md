---
source: [Sprite.java](../../../../src/haven/Sprite.java)
created: 2026-06-13
updated: 2026-06-14
---

# Sprite

Represents a drawable Haven sprite.

## Nested Types

### CDel

- Role: Signals sprite disposal callbacks.
- Description: Lets sprite implementations clean up when their owner is removed.

### CUpd

- Role: Signals sprite update callbacks.
- Description: Lets sprite implementations react to tick/update events.

### FactMaker

- Role: Resolves published sprite factories.
- Description: Chains published-code instancers into a sprite factory lookup.

### Factory

- Role: Creates a sprite from a resource and owner context.
- Description: Standard sprite construction hook used by the resource system.

### Mill

- Role: Creates sprite instances from raw resource data.
- Description: Acts as the factory helper that instantiates sprites during loading.

### Owner

- Role: Provides the runtime context for sprite creation.
- Description: Supplies access to gob, session, and resource lookups.

### RecOwner

- Role: Wraps the owner context for recursive sprite creation.
- Description: Reuses an existing owner while overriding resource lookup behavior.

### ResourceException

- Role: Reports sprite resource-loading failures.
- Description: Wraps problems encountered while resolving a sprite resource.

### UIOwner

- Role: Exposes a widget as sprite owner context.
- Description: Lets UI-backed sprites resolve their widget and session dependencies.

## Members

### Constants

### Fields

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Owner owner`
- Role: Caches the owner value.
- Description: Caches the `owner` value for reuse.

#### `public static List<Factory> factories = new LinkedList<Factory>()`
- Role: Implements the factories operation.
- Description: Implements the public static list<factory> factories = new linked list<factory>() operation.

#### `public final Widget wdg`
- Role: Caches the wdg value.
- Description: Caches the `wdg` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final byte[] sdt`
- Role: Caches the sdt value.
- Description: Caches the `sdt` value for reuse.

#### `public Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

### Methods

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public Resource getres()`
- Role: Returns the resource.
- Description: Exposes the resource that backs this wrapper.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Sprite for debugging and logging.

#### `public UIOwner(Widget wdg)`
- Role: Handles the uiowner path.
- Description: Implements the ui owner operation.

#### `public Random mkrandoom()`
- Role: Creates a random appearance context.
- Description: Constructs a random appearance context from the supplied inputs.

#### `public <T> T context(Class<T> cl)`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `public void delete()`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `public void update(Message sdt)`
- Role: Applies the serialized update payload.
- Description: Applies the serialized update payload.

#### `public FactMaker()`
- Role: Handles the fact maker path.
- Description: Implements the fact maker operation.

#### `public Sprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public S create(Owner owner)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public FromRes(Indir<Resource> res, byte[] sdt)`
- Role: Handles the from resource path.
- Description: Implements the from res operation.

#### `public Sprite create(Owner owner)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Sprite for debugging and logging.

#### `public static Mill<Sprite> of(Indir<Resource> res, byte[] sdt)`
- Role: Builds a Sprite value from the supplied components.
- Description: Builds a Sprite value from the supplied components.

#### `public static Mill<Sprite> of(Indir<Resource> res, Message sdt)`
- Role: Builds a Sprite value from the supplied components.
- Description: Builds a Sprite value from the supplied components.

#### `public static Mill<Sprite> of(Resource res, Message sdt)`
- Role: Builds a Sprite value from the supplied components.
- Description: Builds a Sprite value from the supplied components.

#### `public static Mill<Sprite> of(ResData dat)`
- Role: Builds a Sprite value from the supplied components.
- Description: Builds a Sprite value from the supplied components.

#### `public ResourceException(String msg, Resource res)`
- Role: Handles the resource exception path.
- Description: Implements the resource exception operation.

#### `public ResourceException(String msg, Throwable cause, Resource res)`
- Role: Handles the resource exception path.
- Description: Implements the resource exception operation.

#### `protected Sprite(Owner owner, Resource res)`
- Role: Creates a new Sprite instance.
- Description: Constructs the Sprite instance from the supplied inputs.

#### `public static int decnum(Message sdt)`
- Role: Handles the decnum path.
- Description: Implements the decnum operation.

#### `public static Sprite create(Owner owner, Resource res, Message sdt)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void draw(GOut g)`
- Role: Draws the current content.
- Description: Draws the Sprite content.

#### `public boolean tick(double dt)`
- Role: Advances the current state over time.
- Description: Advances the time-based state.

#### `public void gtick(Render g)`
- Role: Advances the drawable state for the current render tick.
- Description: Updates per-frame drawable state during the render loop.

#### `public void age()`
- Role: Advances the sprite to its mature state.
- Description: Advances the sprite to its mature state.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Sprite for debugging and logging.