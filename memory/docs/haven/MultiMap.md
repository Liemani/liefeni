# MultiMap

This file documents the responsibilities and members of `MultiMap`.

## Meta

- Source: [MultiMap.java](../../../src/haven/MultiMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the multi map Haven component.

## Members

### Constants

### Fields

### Methods

#### `public void put(K key, V value)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public V remove(K key, V value)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public Collection<V> removeall(K key)`
- Role: Performs removeall.
- Description: Supports the removeall operation used by the surrounding class.

#### `public V pop(K key)`
- Role: Applies avatar description updates.
- Description: Supports the pop operation used by the surrounding class.

#### `public V get(K key)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public Collection<V> getall(K key)`
- Role: Performs getall.
- Description: Supports the getall operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Collection<V> values()`
- Role: Performs values.
- Description: Supports the values operation used by the surrounding class.
