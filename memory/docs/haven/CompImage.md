# CompImage

This file documents the responsibilities and members of `CompImage`.

## Meta

- Source: [CompImage.java](../../../src/haven/CompImage.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a composed image.

## Nested Types

### Image

- Description: TODO

### Placed

- Description: TODO

## Members

### Constants

#### `public static final Image nil = new Image()`

- Description: TODO

### Fields

#### `public Coord sz`

- Description: TODO

#### `private final Collection<Placed> cont = new LinkedList<Placed>()`

- Description: TODO

#### `Image img; Coord c`

- Description: TODO

#### `Image img; Coord c`

- Description: TODO

### Methods

#### `public void draw(Graphics g, Coord c)`

- Description: TODO

#### `public Coord sz()`

- Description: TODO

#### `Placed(Image img, Coord c)`

- Description: TODO

#### `public CompImage()`

- Description: TODO

#### `public CompImage add(Image img, Coord c)`

- Description: TODO

#### `public static Image mk(final BufferedImage img)`

- Description: TODO

#### `public CompImage add(final BufferedImage img, Coord c)`

- Description: TODO

#### `public static Image mk(final CompImage img)`

- Description: TODO

#### `public CompImage add(final CompImage img, Coord c)`

- Description: TODO

#### `private void compose(Graphics on, Coord off)`

- Description: TODO

#### `public BufferedImage compose()`

- Description: TODO

#### `public CompImage table(Coord base, Image[][] cells, Object cs, int rs, int[] cj)`

- Description: TODO

#### `public static Image[][] transpose(Image[][] cells)`

- Description: TODO

#### `public static Image[][] transpose(Collection<Image[]> rows)`

- Description: TODO
