# CloudShadow

This file documents the responsibilities and members of `CloudShadow`.

## Meta

- Source: [CloudShadow.java](../../../src/haven/CloudShadow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the cloud shadow Haven component.

## Members

### Constants

#### `public static final Slot<CloudShadow> slot = new Slot<CloudShadow>(Slot.Type.DRAW, CloudShadow.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform tsky = new Uniform(SAMPLER2D, p -> p.get(slot).tex.img, slot)`
- Role: Defines the shared tsky constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform cdir = new Uniform(VEC2, p ->`
- Role: Defines the shared cdir constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform cvel = new Uniform(VEC2, p -> p.get(slot).vel, slot)`
- Role: Defines the shared cvel constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform cscl = new Uniform(FLOAT, p -> p.get(slot).scale, slot)`
- Role: Defines the shared cscl constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform cthr = new Uniform(VEC4, p ->`
- Role: Defines the shared cthr constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final TexRender tex`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `public Coord3f dir, vel`
- Role: Stores the vel value.
- Description: Backs the cached state for this file.

#### `public Coord3f dir, vel`
- Role: Stores the vel value.
- Description: Backs the cached state for this file.

#### `public float scale`
- Role: Stores the scale value.
- Description: Backs the cached state for this file.

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`
- Role: Stores the cmin value.
- Description: Backs the cached state for this file.

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`
- Role: Stores the cmin value.
- Description: Backs the cached state for this file.

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`
- Role: Stores the cmin value.
- Description: Backs the cached state for this file.

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`
- Role: Stores the cmin value.
- Description: Backs the cached state for this file.

### Methods

#### `public CloudShadow(TexRender tex, DirLight light, Coord3f vel, float scale)`
- Role: Creates a new CloudShadow instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public boolean equals(CloudShadow that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.
