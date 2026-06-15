# CloudShadow

This file documents the responsibilities and members of `CloudShadow`.

## Meta

- Source: [CloudShadow.java](../../../src/haven/CloudShadow.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents cloud shadow rendering support.

## Members

### Constants

#### `public static final Slot<CloudShadow> slot = new Slot<CloudShadow>(Slot.Type.DRAW, CloudShadow.class)`

- Description: TODO

#### `public static final Uniform tsky = new Uniform(SAMPLER2D, p -> p.get(slot).tex.img, slot)`

- Description: TODO

#### `public static final Uniform cdir = new Uniform(VEC2, p ->`

- Description: TODO

#### `public static final Uniform cvel = new Uniform(VEC2, p -> p.get(slot).vel, slot)`

- Description: TODO

#### `public static final Uniform cscl = new Uniform(FLOAT, p -> p.get(slot).scale, slot)`

- Description: TODO

#### `public static final Uniform cthr = new Uniform(VEC4, p ->`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

#### `public final TexRender tex`

- Description: TODO

#### `public Coord3f dir, vel`

- Description: TODO

#### `public Coord3f dir, vel`

- Description: TODO

#### `public float scale`

- Description: TODO

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`

- Description: TODO

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`

- Description: TODO

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`

- Description: TODO

#### `public float cmin = 0.5f, cmax = 1.0f, rmin = 0.4f, rmax = 1.0f`

- Description: TODO

### Methods

#### `public CloudShadow(TexRender tex, DirLight light, Coord3f vel, float scale)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public boolean equals(CloudShadow that)`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO
