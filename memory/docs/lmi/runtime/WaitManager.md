# WaitManager

## Meta

- Source: [WaitManager.java](../../../../src/lmi/runtime/WaitManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Coordinates subsystem state and routes work through the appropriate boundary.

## Code Members

### Member Index

#### Fields

- [_lastSentSeq](#member-1)
- [_lastAckedSeq](#member-2)
- [lock](#member-3)

#### Methods

- [init()](#member-4)
- [isAcked(int seq)](#member-5)
- [updateSentSeq(int seq)](#member-6)
- [waitACK()](#member-7)
- [waitResponse()](#member-8)
- [updateAckedSeq(int seq)](#member-9)
- [sleepPolling()](#member-10)
- [sleep(long timeout)](#member-11)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `_lastSentSeq`

- Description: TODO

<a id="member-2"></a>
##### `_lastAckedSeq`

- Description: TODO

<a id="member-3"></a>
##### `lock`

- Description: TODO

#### Methods

<a id="member-4"></a>
##### `init()`

- Description: TODO

<a id="member-5"></a>
##### `isAcked(int seq)`

- Description: TODO

<a id="member-6"></a>
##### `updateSentSeq(int seq)`

- Description: TODO

<a id="member-7"></a>
##### `waitACK()`

- Description: TODO

<a id="member-8"></a>
##### `waitResponse()`

- Description: TODO

<a id="member-9"></a>
##### `updateAckedSeq(int seq)`

- Description: TODO

<a id="member-10"></a>
##### `sleepPolling()`

- Description: TODO

<a id="member-11"></a>
##### `sleep(long timeout)`

- Description: TODO
