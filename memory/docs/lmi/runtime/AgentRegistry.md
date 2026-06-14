# AgentRegistry

## Meta

- Source: [AgentRegistry.java](../../../../src/lmi/runtime/AgentRegistry.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Tracks available agent jobs and effect constructors.

## Code Members

### Member Index

#### Constants

- [BASE_PACKAGE](#member-1)
- [BASE_PATH](#member-2)

#### Fields

- [jobMap](#member-3)
- [effectMap](#member-4)
- [folderMetadataMap](#member-5)
- [executableEntries](#member-6)
- [initialized](#member-7)
- [kind](#member-21)
- [cls](#member-22)
- [commandName](#member-23)

#### Methods

- [init()](#member-8)
- [jobMap()](#member-9)
- [jobClass(String name)](#member-10)
- [effectClass(String name)](#member-11)
- [folderMetadataClass(String packageName)](#member-12)
- [executableEntries()](#member-13)
- [_scanAgentPackage()](#member-14)
- [_registerClass(String path)](#member-15)
- [_isFolderMetadataClass(Class<?> cls)](#member-16)
- [_isConcreteJobClass(Class<?> cls)](#member-17)
- [_isConcreteEffectClass(Class<?> cls)](#member-18)
- [_jobCommandName(Class<? extends Job> cls)](#member-19)
- [_effectCommandName(Class<? extends Effect> cls)](#member-20)
- [Entry(Kind kind, Class<?> cls, String commandName)](#member-24)
- [job(Class<? extends Job> cls)](#member-25)
- [effect(Class<? extends Effect> cls)](#member-26)
- [kind()](#member-27)
- [cls()](#member-28)
- [className()](#member-29)
- [simpleName()](#member-30)
- [commandName()](#member-31)
- [packageName()](#member-32)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `BASE_PACKAGE`

- Description: TODO

<a id="member-2"></a>
##### `BASE_PATH`

- Description: TODO

#### Fields

<a id="member-3"></a>
##### `jobMap`

- Description: TODO

<a id="member-4"></a>
##### `effectMap`

- Description: TODO

<a id="member-5"></a>
##### `folderMetadataMap`

- Description: TODO

<a id="member-6"></a>
##### `executableEntries`

- Description: TODO

<a id="member-7"></a>
##### `initialized`

- Description: TODO

<a id="member-21"></a>
##### `kind`

- Description: TODO

<a id="member-22"></a>
##### `cls`

- Description: TODO

<a id="member-23"></a>
##### `commandName`

- Description: TODO

#### Methods

<a id="member-8"></a>
##### `init()`

- Description: TODO

<a id="member-9"></a>
##### `jobMap()`

- Description: TODO

<a id="member-10"></a>
##### `jobClass(String name)`

- Description: TODO

<a id="member-11"></a>
##### `effectClass(String name)`

- Description: TODO

<a id="member-12"></a>
##### `folderMetadataClass(String packageName)`

- Description: TODO

<a id="member-13"></a>
##### `executableEntries()`

- Description: TODO

<a id="member-14"></a>
##### `_scanAgentPackage()`

- Description: TODO

<a id="member-15"></a>
##### `_registerClass(String path)`

- Description: TODO

<a id="member-16"></a>
##### `_isFolderMetadataClass(Class<?> cls)`

- Description: TODO

<a id="member-17"></a>
##### `_isConcreteJobClass(Class<?> cls)`

- Description: TODO

<a id="member-18"></a>
##### `_isConcreteEffectClass(Class<?> cls)`

- Description: TODO

<a id="member-19"></a>
##### `_jobCommandName(Class<? extends Job> cls)`

- Description: TODO

<a id="member-20"></a>
##### `_effectCommandName(Class<? extends Effect> cls)`

- Description: TODO

<a id="member-24"></a>
##### `Entry(Kind kind, Class<?> cls, String commandName)`

- Description: TODO

<a id="member-25"></a>
##### `job(Class<? extends Job> cls)`

- Description: TODO

<a id="member-26"></a>
##### `effect(Class<? extends Effect> cls)`

- Description: TODO

<a id="member-27"></a>
##### `kind()`

- Description: TODO

<a id="member-28"></a>
##### `cls()`

- Description: TODO

<a id="member-29"></a>
##### `className()`

- Description: TODO

<a id="member-30"></a>
##### `simpleName()`

- Description: TODO

<a id="member-31"></a>
##### `commandName()`

- Description: TODO

<a id="member-32"></a>
##### `packageName()`

- Description: TODO
