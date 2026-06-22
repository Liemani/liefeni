---
source: [CompImage.java](../../../../src/haven/CompImage.java)
created: 2026-06-13
updated: 2026-06-14
---

# CompImage

Represents the comp image Haven component.

## Nested Types

### Image

- Role: Describes one drawable image fragment.
- Description: Interface for fragments that can be composed into a larger image.

### Placed

- Role: Stores one placed fragment.
- Description: Internal record that binds a fragment to its position in the composed image.

## Members

### Constants

#### `public static final Image nil = new Image()`
- Role: Implements the nil operation.
- Description: Implements the image operation.
- Value: `new Image()`

### Fields

#### `public Coord sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `private final Collection<Placed> cont = new LinkedList<Placed>()`
- Role: Implements the cont operation.
- Description: Implements the private final collection<placed> cont = new linked list<placed>() operation.

#### `Image img; Coord c`
- Role: Caches the c value.
- Description: Caches the `c` value for reuse.

#### `Image img; Coord c`
- Role: Caches the c value.
- Description: Caches the `c` value for reuse.

### Methods

#### `public void draw(Graphics g, Coord c)`
- Role: Draws the current content.
- Description: Draws the CompImage content.

#### `public Coord sz()`
- Role: Handles the size path.
- Description: Implements the sz operation.

#### `Placed(Image img, Coord c)`
- Role: Handles the placed workflow.
- Description: Implements the placed operation.

#### `public CompImage()`
- Role: Creates a new CompImage instance.
- Description: Constructs the CompImage instance from the supplied inputs.

#### `public CompImage add(Image img, Coord c)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public static Image mk(final BufferedImage img)`
- Role: Handles the mk path.
- Description: Implements the mk operation.

#### `public CompImage add(final BufferedImage img, Coord c)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public static Image mk(final CompImage img)`
- Role: Handles the mk path.
- Description: Implements the mk operation.

#### `public CompImage add(final CompImage img, Coord c)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `private void compose(Graphics on, Coord off)`
- Role: Handles the compose path.
- Description: Implements the compose operation.

#### `public BufferedImage compose()`
- Role: Handles the compose path.
- Description: Implements the compose operation.

#### `public CompImage table(Coord base, Image[][] cells, Object cs, int rs, int[] cj)`
- Role: Handles the table path.
- Description: Implements the table operation.

#### `public static Image[][] transpose(Image[][] cells)`
- Role: Handles the transpose path.
- Description: Implements the transpose operation.

#### `public static Image[][] transpose(Collection<Image[]> rows)`
- Role: Handles the transpose path.
- Description: Implements the transpose operation.