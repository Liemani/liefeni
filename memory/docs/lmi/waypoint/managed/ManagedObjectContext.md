# ManagedObjectContext

## Meta

- Source: [ManagedObjectContext.java](../../../../../src/lmi/waypoint/managed/ManagedObjectContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Holds runtime state for its corresponding subsystem.

## Code Members

### Member Index

#### Fields

- [identityMap](#member-1)
- [selectedObjects](#member-2)
- [dirtyObjects](#member-3)
- [deletedObjects](#member-4)
- [type](#member-18)
- [id](#member-19)

#### Methods

- [registerLoaded(T object)](#member-5)
- [find(Class<T> type, long id)](#member-6)
- [takeSelectedObjects()](#member-7)
- [takeSelectedWpNodes()](#member-8)
- [save()](#member-9)
- [save(WaypointResultHandler<SaveBatchResult> handler)](#member-10)
- [markDirty(ManagedObject object)](#member-11)
- [markDeleted(ManagedObject object)](#member-12)
- [markClean(ManagedObject object)](#member-13)
- [onSaveSucceeded(SaveBatch batch, SaveBatchResult result)](#member-14)
- [onSaveFailed(SaveBatch batch)](#member-15)
- [clear()](#member-16)
- [buildSaveBatch()](#member-17)
- [Key(Class<? extends ManagedObject> type, long id)](#member-20)
- [equals(Object other)](#member-21)
- [hashCode()](#member-22)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `identityMap`

- Description: TODO

<a id="member-2"></a>
##### `selectedObjects`

- Description: TODO

<a id="member-3"></a>
##### `dirtyObjects`

- Description: TODO

<a id="member-4"></a>
##### `deletedObjects`

- Description: TODO

<a id="member-18"></a>
##### `type`

- Description: TODO

<a id="member-19"></a>
##### `id`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `registerLoaded(T object)`

- Description: TODO

<a id="member-6"></a>
##### `find(Class<T> type, long id)`

- Description: TODO

<a id="member-7"></a>
##### `takeSelectedObjects()`

- Description: TODO

<a id="member-8"></a>
##### `takeSelectedWpNodes()`

- Description: TODO

<a id="member-9"></a>
##### `save()`

- Description: TODO

<a id="member-10"></a>
##### `save(WaypointResultHandler<SaveBatchResult> handler)`

- Description: TODO

<a id="member-11"></a>
##### `markDirty(ManagedObject object)`

- Description: TODO

<a id="member-12"></a>
##### `markDeleted(ManagedObject object)`

- Description: TODO

<a id="member-13"></a>
##### `markClean(ManagedObject object)`

- Description: TODO

<a id="member-14"></a>
##### `onSaveSucceeded(SaveBatch batch, SaveBatchResult result)`

- Description: TODO

<a id="member-15"></a>
##### `onSaveFailed(SaveBatch batch)`

- Description: TODO

<a id="member-16"></a>
##### `clear()`

- Description: TODO

<a id="member-17"></a>
##### `buildSaveBatch()`

- Description: TODO

<a id="member-20"></a>
##### `Key(Class<? extends ManagedObject> type, long id)`

- Description: TODO

<a id="member-21"></a>
##### `equals(Object other)`

- Description: TODO

<a id="member-22"></a>
##### `hashCode()`

- Description: TODO
