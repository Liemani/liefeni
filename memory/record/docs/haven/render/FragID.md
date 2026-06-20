---
source: [FragID.java](../../../../src/haven/render/FragID.java)
created: 2026-06-13
updated: 2026-06-14
---

# FragID

Defines the frag id render pipeline component.

## Nested Types

### ID

- Role: Represents id within FragID.
- Description: Describes the nested id type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<FragID> tex = new Slot<>(Slot.Type.SYS, FragID.class)`
- Role: Defines the shared tex constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<ID> id = new Slot<>(Slot.Type.DRAW, ID.class)`
- Role: Defines the shared id constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FragData fragid = new FragData(Type.INT, "fragid", p -> p.get(tex).image, tex)`
- Role: Defines the shared fragid constant.
- Description: Shared constant used by the rest of the class.

#### `private static final InstancedUniform uid = new InstancedUniform.Int("id", p ->`
- Role: Defines the shared uid constant.
- Description: Shared constant used by the rest of the class.

#### `static final Instancer<ID> instancer = new Instancer<ID>()`
- Role: Defines the shared instancer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying transfer = new AutoVarying(Type.INT)`
- Role: Defines the shared transfer constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog -> fragid(prog.fctx).force()`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final T image`
- Role: Holds the image state.
- Description: Backs the cached state for this file.

#### `public final int val`
- Role: Stores the val value.
- Description: Backs the cached state for this file.

### Methods

#### `public FragID(T image)`
- Role: Creates a new FragID instance.
- Description: Constructs the instance and initializes its default state.

#### `public ID(int val)`
- Role: Performs id.
- Description: Supports the id operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public InstancedAttribute[] attribs()`
- Role: Performs attribs.
- Description: Supports the attribs operation used by the surrounding class.

#### `public static Value fragid(FragmentContext fctx)`
- Role: Performs fragid.
- Description: Supports the fragid operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.
