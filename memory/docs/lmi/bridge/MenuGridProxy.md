# MenuGridProxy

## Meta

- Source: [MenuGridProxy.java](../../../../src/lmi/MenuGridProxy.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides a menu-grid injection point for LMI actions.

## Code Members

### Member Index

#### Constants

- [LMI_PREFIX](#member-1)
- [JOB_PREFIX](#member-2)
- [EFFECT_PREFIX](#member-3)
- [DEFAULT_ICON](#member-4)
- [FOLDER_ICON](#member-5)

#### Fields

- [_customPaginae](#member-6)
- [_folderMap](#member-7)
- [_sharedRes](#member-8)
- [_folderRes](#member-9)
- [name](#member-21)
- [description](#member-22)
- [sortKey](#member-23)
- [sourceCls](#member-24)
- [customParent](#member-25)
- [customBtn](#member-26)
- [iconRes](#member-27)
- [customTex](#member-28)
- [myspr](#member-34)

#### Methods

- [isLmi(MenuGrid.Pagina pag)](#member-10)
- [isJob(MenuGrid.Pagina pag)](#member-11)
- [isEffect(MenuGrid.Pagina pag)](#member-12)
- [init()](#member-13)
- [_buildFromRegistry(Pagina root)](#member-14)
- [_ensureFolderPath(String packageName, Pagina root)](#member-15)
- [_getOrCreateFolder(String packageName, Pagina parent)](#member-16)
- [_callStatic(Class<?> cls, String methodName, String def)](#member-17)
- [apply()](#member-18)
- [updateLayout(MenuGrid mg)](#member-19)
- [dumpAllIcons()](#member-20)
- [Pagina(String id, MenuGrid.Pagina parent, Resource defRes)](#member-29)
- [setup(Class<?> cls, String defName)](#member-30)
- [_loadCustomIcon(String path)](#member-31)
- [parent()](#member-32)
- [button()](#member-33)
- [Button(Pagina pag)](#member-35)
- [name()](#member-36)
- [parent()](#member-37)
- [hotkey()](#member-38)
- [binding()](#member-39)
- [sortkey()](#member-40)
- [info()](#member-41)
- [spr()](#member-42)
- [drawmain(GOut g, GSprite spr)](#member-43)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `LMI_PREFIX`

- Description: TODO

<a id="member-2"></a>
##### `JOB_PREFIX`

- Description: TODO

<a id="member-3"></a>
##### `EFFECT_PREFIX`

- Description: TODO

<a id="member-4"></a>
##### `DEFAULT_ICON`

- Description: TODO

<a id="member-5"></a>
##### `FOLDER_ICON`

- Description: TODO

#### Fields

<a id="member-6"></a>
##### `_customPaginae`

- Description: TODO

<a id="member-7"></a>
##### `_folderMap`

- Description: TODO

<a id="member-8"></a>
##### `_sharedRes`

- Description: TODO

<a id="member-9"></a>
##### `_folderRes`

- Description: TODO

<a id="member-21"></a>
##### `name`

- Description: TODO

<a id="member-22"></a>
##### `description`

- Description: TODO

<a id="member-23"></a>
##### `sortKey`

- Description: TODO

<a id="member-24"></a>
##### `sourceCls`

- Description: TODO

<a id="member-25"></a>
##### `customParent`

- Description: TODO

<a id="member-26"></a>
##### `customBtn`

- Description: TODO

<a id="member-27"></a>
##### `iconRes`

- Description: TODO

<a id="member-28"></a>
##### `customTex`

- Description: TODO

<a id="member-34"></a>
##### `myspr`

- Description: TODO

#### Methods

<a id="member-10"></a>
##### `isLmi(MenuGrid.Pagina pag)`

- Description: TODO

<a id="member-11"></a>
##### `isJob(MenuGrid.Pagina pag)`

- Description: TODO

<a id="member-12"></a>
##### `isEffect(MenuGrid.Pagina pag)`

- Description: TODO

<a id="member-13"></a>
##### `init()`

- Description: TODO

<a id="member-14"></a>
##### `_buildFromRegistry(Pagina root)`

- Description: TODO

<a id="member-15"></a>
##### `_ensureFolderPath(String packageName, Pagina root)`

- Description: TODO

<a id="member-16"></a>
##### `_getOrCreateFolder(String packageName, Pagina parent)`

- Description: TODO

<a id="member-17"></a>
##### `_callStatic(Class<?> cls, String methodName, String def)`

- Description: TODO

<a id="member-18"></a>
##### `apply()`

- Description: TODO

<a id="member-19"></a>
##### `updateLayout(MenuGrid mg)`

- Description: TODO

<a id="member-20"></a>
##### `dumpAllIcons()`

- Description: TODO

<a id="member-29"></a>
##### `Pagina(String id, MenuGrid.Pagina parent, Resource defRes)`

- Description: TODO

<a id="member-30"></a>
##### `setup(Class<?> cls, String defName)`

- Description: TODO

<a id="member-31"></a>
##### `_loadCustomIcon(String path)`

- Description: TODO

<a id="member-32"></a>
##### `parent()`

- Description: TODO

<a id="member-33"></a>
##### `button()`

- Description: TODO

<a id="member-35"></a>
##### `Button(Pagina pag)`

- Description: TODO

<a id="member-36"></a>
##### `name()`

- Description: TODO

<a id="member-37"></a>
##### `parent()`

- Description: TODO

<a id="member-38"></a>
##### `hotkey()`

- Description: TODO

<a id="member-39"></a>
##### `binding()`

- Description: TODO

<a id="member-40"></a>
##### `sortkey()`

- Description: TODO

<a id="member-41"></a>
##### `info()`

- Description: TODO

<a id="member-42"></a>
##### `spr()`

- Description: TODO

<a id="member-43"></a>
##### `drawmain(GOut g, GSprite spr)`

- Description: TODO
