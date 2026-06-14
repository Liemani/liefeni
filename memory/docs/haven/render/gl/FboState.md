# FboState

## Meta

- Source: [FboState.java](../../../../../src/haven/render/gl/FboState.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents FBO render state.

## Code Members

### Member Index

#### Constants

- [NIL_CONF](#member-1)
- [BLEND_ALL](#member-2)
- [BLEND_NONE](#member-3)
- [MASK_NONE](#member-4)

#### Fields

- [env](#member-5)
- [fbo](#member-6)
- [dbufs](#member-7)
- [blend](#member-8)
- [blendbufs](#member-9)
- [colormask](#member-10)
- [slot](#member-23)

#### Methods

- [applydbufs(BGL gl)](#member-11)
- [glblendfunc(BlendMode.Function fn)](#member-12)
- [glblendfac(BlendMode.Factor fac)](#member-13)
- [applyconf(BGL gl)](#member-14)
- [apply(BGL gl)](#member-15)
- [unapply(BGL gl)](#member-16)
- [applyto(BGL gl, GLState to)](#member-17)
- [compatiblep(GLFrameBuffer fbo, Attachment[] color, Attachment depth)](#member-18)
- [find(GLEnvironment env, Attachment[] color, Attachment depth)](#member-19)
- [forfvals(GLEnvironment env, Object depthp, Object[] fvalsp, FragTarget[] conf)](#member-20)
- [make(GLEnvironment env, Object depth, Object[] fvals, FragTarget[] conf)](#member-21)
- [set(BGL gl, Applier st, Object depth, Object[] fvals, FragTarget[] conf)](#member-22)
- [slotidx()](#member-24)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `NIL_CONF`

- Description: TODO

<a id="member-2"></a>
##### `BLEND_ALL`

- Description: TODO

<a id="member-3"></a>
##### `BLEND_NONE`

- Description: TODO

<a id="member-4"></a>
##### `MASK_NONE`

- Description: TODO

#### Fields

<a id="member-5"></a>
##### `env`

- Description: TODO

<a id="member-6"></a>
##### `fbo`

- Description: TODO

<a id="member-7"></a>
##### `dbufs`

- Description: TODO

<a id="member-8"></a>
##### `blend`

- Description: TODO

<a id="member-9"></a>
##### `blendbufs`

- Description: TODO

<a id="member-10"></a>
##### `colormask`

- Description: TODO

<a id="member-23"></a>
##### `slot`

- Description: TODO

#### Methods

<a id="member-11"></a>
##### `applydbufs(BGL gl)`

- Description: TODO

<a id="member-12"></a>
##### `glblendfunc(BlendMode.Function fn)`

- Description: TODO

<a id="member-13"></a>
##### `glblendfac(BlendMode.Factor fac)`

- Description: TODO

<a id="member-14"></a>
##### `applyconf(BGL gl)`

- Description: TODO

<a id="member-15"></a>
##### `apply(BGL gl)`

- Description: TODO

<a id="member-16"></a>
##### `unapply(BGL gl)`

- Description: TODO

<a id="member-17"></a>
##### `applyto(BGL gl, GLState to)`

- Description: TODO

<a id="member-18"></a>
##### `compatiblep(GLFrameBuffer fbo, Attachment[] color, Attachment depth)`

- Description: TODO

<a id="member-19"></a>
##### `find(GLEnvironment env, Attachment[] color, Attachment depth)`

- Description: TODO

<a id="member-20"></a>
##### `forfvals(GLEnvironment env, Object depthp, Object[] fvalsp, FragTarget[] conf)`

- Description: TODO

<a id="member-21"></a>
##### `make(GLEnvironment env, Object depth, Object[] fvals, FragTarget[] conf)`

- Description: TODO

<a id="member-22"></a>
##### `set(BGL gl, Applier st, Object depth, Object[] fvals, FragTarget[] conf)`

- Description: TODO

<a id="member-24"></a>
##### `slotidx()`

- Description: TODO
