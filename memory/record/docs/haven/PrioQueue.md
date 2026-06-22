---
source: [PrioQueue.java](../../../../src/haven/PrioQueue.java)
created: 2026-06-13
updated: 2026-06-14
---

# PrioQueue

Priority queue backed by a linked list that always exposes the highest-priority element first.

## Members

### Constants

### Fields

### Methods

#### `public E peek()`
- Role: Peeks at the top element.
- Description: Returns the highest-priority element without removing it.

#### `public E element()`
- Role: Reads the top element.
- Description: Returns the highest-priority element or throws when the queue is empty.

#### `public E poll()`
- Role: Removes the top element.
- Description: Returns and removes the highest-priority element if one exists.

#### `public E remove()`
- Role: Removes the top element.
- Description: Returns and removes the highest-priority element or throws when empty.

#### `public boolean removeid(E el)`
- Role: Removes a specific element instance.
- Description: Deletes the first element that is identical to the supplied object.