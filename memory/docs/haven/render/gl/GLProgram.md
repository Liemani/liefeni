# GLProgram

## Meta

- Source: [GLProgram.java](../../../../../src/haven/render/gl/GLProgram.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a GL program.

## Code Members

### Member Index

#### Fields

- [dumpall](#member-1)
- [env](#member-2)
- [vsrc](#member-3)
- [fsrc](#member-4)
- [uniforms](#member-5)
- [fragdata](#member-6)
- [umap](#member-7)
- [fmap](#member-8)
- [attribs](#member-9)
- [samplerids](#member-10)
- [samplers](#member-11)
- [locked](#member-12)
- [unifnms](#member-13)
- [amap](#member-14)
- [fragnms](#member-15)
- [glp](#member-16)
- [disposed](#member-17)
- [type](#member-20)
- [text](#member-21)
- [info](#member-22)
- [type](#member-25)
- [text](#member-26)
- [id](#member-27)
- [program](#member-32)
- [type](#member-34)
- [symbol](#member-35)
- [info](#member-37)
- [name](#member-40)
- [id](#member-41)
- [name](#member-45)
- [id](#member-46)
- [shaders](#member-49)
- [id](#member-50)
- [sub](#member-57)
- [sampler](#member-58)
- [umap](#member-63)
- [vsrc](#member-74)
- [fsrc](#member-75)
- [id](#member-76)
- [fragnms](#member-77)
- [attrnms](#member-78)
- [attrlocs](#member-79)

#### Methods

- [attrsize(Attribute attr)](#member-18)
- [build(GLEnvironment env, Collection<ShaderMacro> mods)](#member-19)
- [ShaderException(String msg, ShaderOb shader, String info)](#member-23)
- [toString()](#member-24)
- [ShaderOb(GLEnvironment env, int type, String text)](#member-28)
- [create(GL gl)](#member-29)
- [delete(GL gl)](#member-30)
- [glid()](#member-31)
- [ProgramException(String msg, GLProgram program)](#member-33)
- [UnknownExternException(String msg, GLProgram program, String type, String symbol)](#member-36)
- [LinkException(String msg, GLProgram program, String info)](#member-38)
- [toString()](#member-39)
- [AttrID(String name, int id)](#member-42)
- [glid()](#member-43)
- [toString()](#member-44)
- [VarID(String name)](#member-47)
- [public abstract int glid();](#member-48)
- [ProgOb(GLEnvironment env, ShaderOb... shaders)](#member-51)
- [uniresolve(Type type, String name)](#member-52)
- [create(GL gl)](#member-53)
- [delete(GL gl)](#member-54)
- [dispose()](#member-55)
- [glid()](#member-56)
- [UniformID(String name)](#member-59)
- [run(GL gl)](#member-60)
- [glid()](#member-61)
- [toString()](#member-62)
- [cuniform(Uniform var)](#member-64)
- [glid()](#member-65)
- [apply(BGL gl, GLProgram from, GLProgram to)](#member-66)
- [cattrib(Attribute var)](#member-67)
- [attrib(Attribute var)](#member-68)
- [cuniform(Uniform var)](#member-69)
- [uniform(Uniform var)](#member-70)
- [dispose()](#member-71)
- [lock()](#member-72)
- [unlock()](#member-73)
- [Dump(GLProgram prog)](#member-80)
- [dump()](#member-81)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `dumpall`

- Description: TODO

<a id="member-2"></a>
##### `env`

- Description: TODO

<a id="member-3"></a>
##### `vsrc`

- Description: TODO

<a id="member-4"></a>
##### `fsrc`

- Description: TODO

<a id="member-5"></a>
##### `uniforms`

- Description: TODO

<a id="member-6"></a>
##### `fragdata`

- Description: TODO

<a id="member-7"></a>
##### `umap`

- Description: TODO

<a id="member-8"></a>
##### `fmap`

- Description: TODO

<a id="member-9"></a>
##### `attribs`

- Description: TODO

<a id="member-10"></a>
##### `samplerids`

- Description: TODO

<a id="member-11"></a>
##### `samplers`

- Description: TODO

<a id="member-12"></a>
##### `locked`

- Description: TODO

<a id="member-13"></a>
##### `unifnms`

- Description: TODO

<a id="member-14"></a>
##### `amap`

- Description: TODO

<a id="member-15"></a>
##### `fragnms`

- Description: TODO

<a id="member-16"></a>
##### `glp`

- Description: TODO

<a id="member-17"></a>
##### `disposed`

- Description: TODO

<a id="member-20"></a>
##### `type`

- Description: TODO

<a id="member-21"></a>
##### `text`

- Description: TODO

<a id="member-22"></a>
##### `info`

- Description: TODO

<a id="member-25"></a>
##### `type`

- Description: TODO

<a id="member-26"></a>
##### `text`

- Description: TODO

<a id="member-27"></a>
##### `id`

- Description: TODO

<a id="member-32"></a>
##### `program`

- Description: TODO

<a id="member-34"></a>
##### `type`

- Description: TODO

<a id="member-35"></a>
##### `symbol`

- Description: TODO

<a id="member-37"></a>
##### `info`

- Description: TODO

<a id="member-40"></a>
##### `name`

- Description: TODO

<a id="member-41"></a>
##### `id`

- Description: TODO

<a id="member-45"></a>
##### `name`

- Description: TODO

<a id="member-46"></a>
##### `id`

- Description: TODO

<a id="member-49"></a>
##### `shaders`

- Description: TODO

<a id="member-50"></a>
##### `id`

- Description: TODO

<a id="member-57"></a>
##### `sub`

- Description: TODO

<a id="member-58"></a>
##### `sampler`

- Description: TODO

<a id="member-63"></a>
##### `umap`

- Description: TODO

<a id="member-74"></a>
##### `vsrc`

- Description: TODO

<a id="member-75"></a>
##### `fsrc`

- Description: TODO

<a id="member-76"></a>
##### `id`

- Description: TODO

<a id="member-77"></a>
##### `fragnms`

- Description: TODO

<a id="member-78"></a>
##### `attrnms`

- Description: TODO

<a id="member-79"></a>
##### `attrlocs`

- Description: TODO

#### Methods

<a id="member-18"></a>
##### `attrsize(Attribute attr)`

- Description: TODO

<a id="member-19"></a>
##### `build(GLEnvironment env, Collection<ShaderMacro> mods)`

- Description: TODO

<a id="member-23"></a>
##### `ShaderException(String msg, ShaderOb shader, String info)`

- Description: TODO

<a id="member-24"></a>
##### `toString()`

- Description: TODO

<a id="member-28"></a>
##### `ShaderOb(GLEnvironment env, int type, String text)`

- Description: TODO

<a id="member-29"></a>
##### `create(GL gl)`

- Description: TODO

<a id="member-30"></a>
##### `delete(GL gl)`

- Description: TODO

<a id="member-31"></a>
##### `glid()`

- Description: TODO

<a id="member-33"></a>
##### `ProgramException(String msg, GLProgram program)`

- Description: TODO

<a id="member-36"></a>
##### `UnknownExternException(String msg, GLProgram program, String type, String symbol)`

- Description: TODO

<a id="member-38"></a>
##### `LinkException(String msg, GLProgram program, String info)`

- Description: TODO

<a id="member-39"></a>
##### `toString()`

- Description: TODO

<a id="member-42"></a>
##### `AttrID(String name, int id)`

- Description: TODO

<a id="member-43"></a>
##### `glid()`

- Description: TODO

<a id="member-44"></a>
##### `toString()`

- Description: TODO

<a id="member-47"></a>
##### `VarID(String name)`

- Description: TODO

<a id="member-48"></a>
##### `public abstract int glid();`

- Description: TODO

<a id="member-51"></a>
##### `ProgOb(GLEnvironment env, ShaderOb... shaders)`

- Description: TODO

<a id="member-52"></a>
##### `uniresolve(Type type, String name)`

- Description: TODO

<a id="member-53"></a>
##### `create(GL gl)`

- Description: TODO

<a id="member-54"></a>
##### `delete(GL gl)`

- Description: TODO

<a id="member-55"></a>
##### `dispose()`

- Description: TODO

<a id="member-56"></a>
##### `glid()`

- Description: TODO

<a id="member-59"></a>
##### `UniformID(String name)`

- Description: TODO

<a id="member-60"></a>
##### `run(GL gl)`

- Description: TODO

<a id="member-61"></a>
##### `glid()`

- Description: TODO

<a id="member-62"></a>
##### `toString()`

- Description: TODO

<a id="member-64"></a>
##### `cuniform(Uniform var)`

- Description: TODO

<a id="member-65"></a>
##### `glid()`

- Description: TODO

<a id="member-66"></a>
##### `apply(BGL gl, GLProgram from, GLProgram to)`

- Description: TODO

<a id="member-67"></a>
##### `cattrib(Attribute var)`

- Description: TODO

<a id="member-68"></a>
##### `attrib(Attribute var)`

- Description: TODO

<a id="member-69"></a>
##### `cuniform(Uniform var)`

- Description: TODO

<a id="member-70"></a>
##### `uniform(Uniform var)`

- Description: TODO

<a id="member-71"></a>
##### `dispose()`

- Description: TODO

<a id="member-72"></a>
##### `lock()`

- Description: TODO

<a id="member-73"></a>
##### `unlock()`

- Description: TODO

<a id="member-80"></a>
##### `Dump(GLProgram prog)`

- Description: TODO

<a id="member-81"></a>
##### `dump()`

- Description: TODO
