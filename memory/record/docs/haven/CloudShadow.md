---
source: [CloudShadow.java](../../../../src/haven/CloudShadow.java)
created: 2026-06-13
updated: 2026-06-14
---

# CloudShadow

Represents the cloud shadow Haven component.

## Members

### Constants

#### `public static final Slot<CloudShadow> slot = new Slot<CloudShadow>(Slot.Type.DRAW, CloudShadow.class)`
- Role: Implements the slot operation.
- Description: Implements the public static final slot<cloud shadow> slot = new slot<cloud shadow>(slot.type.draw, cloud shadow.class) operation.
- Value: `new Slot<CloudShadow>(Slot.Type.DRAW, CloudShadow.class)`

#### `public static final Uniform tsky = new Uniform(SAMPLER2D, p -> p.get(slot).tex.img, slot)`
- Role: Implements the tsky operation.
- Description: Returns the get value.
- Value: `new Uniform(SAMPLER2D, p -> p.get(slot).tex.img, slot)`

#### `public static final Uniform cdir = new Uniform(VEC2, p ->`
- Role: Implements the cdir operation.
- Description: Implements the uniform operation.
- Value: `new Uniform(VEC2, p ->`

#### `public static final Uniform cvel = new Uniform(VEC2, p -> p.get(slot).vel, slot)`
- Role: Implements the cvel operation.
- Description: Returns the get value.
- Value: `new Uniform(VEC2, p -> p.get(slot).vel, slot)`

#### `public static final Uniform cscl = new Uniform(FLOAT, p -> p.get(slot).scale, slot)`
- Role: Implements the cscl operation.
- Description: Returns the get value.
- Value: `new Uniform(FLOAT, p -> p.get(slot).scale, slot)`

#### `public static final Uniform cthr = new Uniform(VEC4, p ->`
- Role: Implements the cthr operation.
- Description: Implements the uniform operation.
- Value: `new Uniform(VEC4, p ->`

#### `private static final ShaderMacro shader = prog ->`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.
- Value: `prog ->`

### Fields

#### `public final TexRender tex`
- Role: Caches the tex value.
- Description: Caches the `tex` value for reuse.

#### `public Coord3f dir, vel`
- Role: Caches the vel value.
- Description: Caches the `vel` value for reuse.

#### `public Coord3f dir, vel`
- Role: Caches the vel value.
- Description: Caches the `vel` value for reuse.

#### `public float scale`
- Role: Caches the scale value.
- Description: Caches the `scale` value for reuse.

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`
- Role: Caches the cmin value.
- Description: Caches the `cmin` value for reuse.

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`
- Role: Caches the cmin value.
- Description: Caches the `cmin` value for reuse.

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`
- Role: Caches the cmin value.
- Description: Caches the `cmin` value for reuse.

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`
- Role: Caches the cmin value.
- Description: Caches the `cmin` value for reuse.

### Methods

#### `public CloudShadow(TexRender tex, DirLight light, Coord3f vel, float scale)`
- Role: Creates a new CloudShadow instance.
- Description: Constructs the CloudShadow instance from the supplied inputs.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public boolean equals(CloudShadow that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.