---
source: [OrderList.java](../../../../../../src/haven/render/sl/OrderList.java)
created: 2026-06-13
updated: 2026-06-20
---

# OrderList

Stores values together with a numeric order and iterates them in sorted order.

## Nested Types

### Element
One ordered entry in the list.

#### Members

##### Fields

#### `final E e`
- Role: Stores the payload element.
- Description: Returned when iterating the ordered list.

#### `final int o`
- Role: Stores the sort order.
- Description: Lower values are emitted first.

##### Methods

#### `Element(E e, int o)`
- Role: Builds one ordered entry.
- Description: Implements the element operation.

#### `public int compareTo(Element b)`
- Role: Compares two ordered entries.
- Description: Sorts by the numeric order field.

## Members

### Fields

#### `private final List<Element> bk = new ArrayList<Element>()`
- Role: Stores the unsorted backing entries.
- Description: Re-sorted lazily when iterated.

#### `private boolean sorted`
- Role: Tracks whether the backing list is sorted.
- Description: Set to false whenever a new element is added.

### Methods

#### `public boolean add(E e, int o)`
- Role: Adds an ordered entry.
- Description: Marks the list unsorted.

#### `public int size()`
- Role: Returns the number of stored entries.
- Description: Delegates to the backing list.

#### `public Iterator<E> iterator()`
- Role: Returns an iterator over sorted entries.
- Description: Sorts on demand before iterating.