# Party

This file documents the responsibilities and members of `Party`.

## Meta

- Source: [Party.java](../../../src/haven/Party.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents party state.

## Nested Types

### Member

- Description: TODO

## Members

### Constants

### Fields

#### `public Map<Long, Member> memb = Collections.emptyMap()`

- Description: TODO

#### `public Member leader = null`

- Description: TODO

#### `public int id`

- Description: TODO

#### `private final Glob glob`

- Description: TODO

#### `private int mseq = 0`

- Description: TODO

#### `public final long gobid`

- Description: TODO

#### `public final int seq`

- Description: TODO

#### `private Coord2d c = null`

- Description: TODO

#### `private double ma = Math.random() * Math.PI * 2`

- Description: TODO

#### `private double oa = Double.NaN`

- Description: TODO

#### `public Color col = Color.BLACK`

- Description: TODO

### Methods

#### `public Party(Glob glob)`

- Description: TODO

#### `public Member(long gobid)`

- Description: TODO

#### `public Gob getgob()`

- Description: TODO

#### `public Coord2d getc()`

- Description: TODO

#### `void setc(Coord2d c)`

- Description: TODO

#### `public double geta()`

- Description: TODO
