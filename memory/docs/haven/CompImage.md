# CompImage

This file documents the responsibilities and members of `CompImage`.

## Meta

- Source: [CompImage.java](../../../src/haven/CompImage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the comp image Haven component.

## Nested Types

### Image

- Role: Represents image within CompImage.
- Description: Describes the nested image type used by the enclosing class.

### Placed

- Role: Represents placed within CompImage.
- Description: Describes the nested placed type used by the enclosing class.

## Members

### Constants

#### `public static final Image nil = new Image()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public Coord sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `private final Collection<Placed> cont = new LinkedList<Placed>()`
- Role: Caches cont entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `Image img; Coord c`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

#### `Image img; Coord c`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

### Methods

#### `public void draw(Graphics g, Coord c)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public Coord sz()`
- Role: Performs sz.
- Description: Supports the sz operation used by the surrounding class.

#### `Placed(Image img, Coord c)`
- Role: Handles the placed workflow.
- Description: Supports the placed operation used by the surrounding class.

#### `public CompImage()`
- Role: Creates a new CompImage instance.
- Description: Constructs the instance and initializes its default state.

#### `public CompImage add(Image img, Coord c)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public static Image mk(final BufferedImage img)`
- Role: Performs mk.
- Description: Supports the mk operation used by the surrounding class.

#### `public CompImage add(final BufferedImage img, Coord c)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public static Image mk(final CompImage img)`
- Role: Performs mk.
- Description: Supports the mk operation used by the surrounding class.

#### `public CompImage add(final CompImage img, Coord c)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `private void compose(Graphics on, Coord off)`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.

#### `public BufferedImage compose()`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.

#### `public CompImage table(Coord base, Image[][] cells, Object cs, int rs, int[] cj)`
- Role: Performs table.
- Description: Supports the table operation used by the surrounding class.

#### `public static Image[][] transpose(Image[][] cells)`
- Role: Performs transpose.
- Description: Supports the transpose operation used by the surrounding class.

#### `public static Image[][] transpose(Collection<Image[]> rows)`
- Role: Performs transpose.
- Description: Supports the transpose operation used by the surrounding class.
