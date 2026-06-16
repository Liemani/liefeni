# OrderList

This file documents the responsibilities and members of `OrderList`.

## Meta

- Source: [OrderList.java](../../../../../src/haven/render/sl/OrderList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the order list shader-language AST node.

## Nested Types

### Element

- Role: Represents element within OrderList.
- Description: Describes the nested element type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final List<Element> bk = new ArrayList<Element>()`
- Role: Caches bk entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private boolean sorted`
- Role: Tracks the sorted flag.
- Description: Supports the sorted operation used by the surrounding class.

#### `final E e`
- Role: Holds the e state.
- Description: Backs the cached state for this file.

#### `final int o`
- Role: Stores the o value.
- Description: Backs the cached state for this file.

### Methods

#### `Element(E e, int o)`
- Role: Handles the element workflow.
- Description: Supports the element operation used by the surrounding class.

#### `public int compareTo(Element b)`
- Role: Performs compare to.
- Description: Supports the compare to operation used by the surrounding class.

#### `public boolean add(E e, int o)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Iterator<E> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.
