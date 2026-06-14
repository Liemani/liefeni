# LoginScreen

## Meta

- Source: [LoginScreen.java](../../../src/haven/LoginScreen.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Displays the login screen.

## Code Members

### Member Index

#### Fields

- [authmech](#member-1)
- [textf](#member-2)
- [textfs](#member-3)
- [bg](#member-4)
- [bgc](#member-5)
- [login](#member-6)
- [confname](#member-7)
- [error](#member-8)
- [progress](#member-9)
- [optbtn](#member-10)
- [opts](#member-11)
- [kb_savtoken](#member-13)
- [kb_deltoken](#member-14)
- [user](#member-15)
- [pass](#member-16)
- [savetoken](#member-17)
- [fbtn](#member-18)
- [exec](#member-19)
- [pwbox](#member-20)
- [tkbox](#member-21)
- [token](#member-22)
- [inited](#member-23)
- [history](#member-24)
- [hpos](#member-25)
- [hcurrent](#member-26)
- [steam_autologin](#member-40)
- [stat](#member-45)
- [ax](#member-46)
- [lines](#member-48)

#### Methods

- [getpref(String name, String def)](#member-12)
- [UserEntry(int w)](#member-27)
- [changed()](#member-28)
- [settext2(String text)](#member-29)
- [keydown(KeyDownEvent ev)](#member-30)
- [init(String name)](#member-31)
- [Credbox()](#member-32)
- [init()](#member-33)
- [checktoken()](#member-34)
- [forget()](#member-35)
- [enter()](#member-36)
- [creds()](#member-37)
- [keydown(KeyDownEvent ev)](#member-38)
- [show()](#member-39)
- [Steambox()](#member-41)
- [private AuthClient.Credentials creds() throws java.io.IOException](#member-42)
- [enter()](#member-43)
- [tick(double dt)](#member-44)
- [StatusLabel(URI svc, double ax)](#member-47)
- [draw(GOut g)](#member-49)
- [added()](#member-50)
- [dispose()](#member-51)
- [mklogin()](#member-52)
- [error(String error)](#member-53)
- [progress(String p)](#member-54)
- [clear()](#member-55)
- [wdgmsg(Widget sender, String msg, Object... args)](#member-56)
- [cdestroy(Widget ch)](#member-57)
- [uimsg(String msg, Object... args)](#member-58)
- [presize()](#member-59)
- [added()](#member-60)
- [draw(GOut g)](#member-61)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `authmech`

- Description: TODO

<a id="member-2"></a>
##### `textf`

- Description: TODO

<a id="member-3"></a>
##### `textfs`

- Description: TODO

<a id="member-4"></a>
##### `bg`

- Description: TODO

<a id="member-5"></a>
##### `bgc`

- Description: TODO

<a id="member-6"></a>
##### `login`

- Description: TODO

<a id="member-7"></a>
##### `confname`

- Description: TODO

<a id="member-8"></a>
##### `error`

- Description: TODO

<a id="member-9"></a>
##### `progress`

- Description: TODO

<a id="member-10"></a>
##### `optbtn`

- Description: TODO

<a id="member-11"></a>
##### `opts`

- Description: TODO

<a id="member-13"></a>
##### `kb_savtoken`

- Description: TODO

<a id="member-14"></a>
##### `kb_deltoken`

- Description: TODO

<a id="member-15"></a>
##### `user`

- Description: TODO

<a id="member-16"></a>
##### `pass`

- Description: TODO

<a id="member-17"></a>
##### `savetoken`

- Description: TODO

<a id="member-18"></a>
##### `fbtn`

- Description: TODO

<a id="member-19"></a>
##### `exec`

- Description: TODO

<a id="member-20"></a>
##### `pwbox`

- Description: TODO

<a id="member-21"></a>
##### `tkbox`

- Description: TODO

<a id="member-22"></a>
##### `token`

- Description: TODO

<a id="member-23"></a>
##### `inited`

- Description: TODO

<a id="member-24"></a>
##### `history`

- Description: TODO

<a id="member-25"></a>
##### `hpos`

- Description: TODO

<a id="member-26"></a>
##### `hcurrent`

- Description: TODO

<a id="member-40"></a>
##### `steam_autologin`

- Description: TODO

<a id="member-45"></a>
##### `stat`

- Description: TODO

<a id="member-46"></a>
##### `ax`

- Description: TODO

<a id="member-48"></a>
##### `lines`

- Description: TODO

#### Methods

<a id="member-12"></a>
##### `getpref(String name, String def)`

- Description: TODO

<a id="member-27"></a>
##### `UserEntry(int w)`

- Description: TODO

<a id="member-28"></a>
##### `changed()`

- Description: TODO

<a id="member-29"></a>
##### `settext2(String text)`

- Description: TODO

<a id="member-30"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-31"></a>
##### `init(String name)`

- Description: TODO

<a id="member-32"></a>
##### `Credbox()`

- Description: TODO

<a id="member-33"></a>
##### `init()`

- Description: TODO

<a id="member-34"></a>
##### `checktoken()`

- Description: TODO

<a id="member-35"></a>
##### `forget()`

- Description: TODO

<a id="member-36"></a>
##### `enter()`

- Description: TODO

<a id="member-37"></a>
##### `creds()`

- Description: TODO

<a id="member-38"></a>
##### `keydown(KeyDownEvent ev)`

- Description: TODO

<a id="member-39"></a>
##### `show()`

- Description: TODO

<a id="member-41"></a>
##### `Steambox()`

- Description: TODO

<a id="member-42"></a>
##### `private AuthClient.Credentials creds() throws java.io.IOException`

- Description: TODO

<a id="member-43"></a>
##### `enter()`

- Description: TODO

<a id="member-44"></a>
##### `tick(double dt)`

- Description: TODO

<a id="member-47"></a>
##### `StatusLabel(URI svc, double ax)`

- Description: TODO

<a id="member-49"></a>
##### `draw(GOut g)`

- Description: TODO

<a id="member-50"></a>
##### `added()`

- Description: TODO

<a id="member-51"></a>
##### `dispose()`

- Description: TODO

<a id="member-52"></a>
##### `mklogin()`

- Description: TODO

<a id="member-53"></a>
##### `error(String error)`

- Description: TODO

<a id="member-54"></a>
##### `progress(String p)`

- Description: TODO

<a id="member-55"></a>
##### `clear()`

- Description: TODO

<a id="member-56"></a>
##### `wdgmsg(Widget sender, String msg, Object... args)`

- Description: TODO

<a id="member-57"></a>
##### `cdestroy(Widget ch)`

- Description: TODO

<a id="member-58"></a>
##### `uimsg(String msg, Object... args)`

- Description: TODO

<a id="member-59"></a>
##### `presize()`

- Description: TODO

<a id="member-60"></a>
##### `added()`

- Description: TODO

<a id="member-61"></a>
##### `draw(GOut g)`

- Description: TODO
