# Party

This file documents the responsibilities and members of `Party`.

## Meta

- Source: [Party.java](../../../src/haven/Party.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the party Haven component.

## Nested Types

### Member

- Role: Represents member within Party.
- Description: Describes the nested member type used by the enclosing class.

## Members

### Constants

### Fields

#### `public Map<Long, Member> memb = Collections.emptyMap()`
- Role: Caches memb entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Member leader = null`
- Role: Holds the leader state.
- Description: Backs the cached state for this file.

#### `public int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private final Glob glob`
- Role: Stores the glob value.
- Description: Backs the cached state for this file.

#### `private int mseq = 0`
- Role: Stores the mseq value.
- Description: Backs the cached state for this file.

#### `public final long gobid`
- Role: Stores the gobid value.
- Description: Backs the cached state for this file.

#### `public final int seq`
- Role: Stores the seq value.
- Description: Backs the cached state for this file.

#### `private Coord2d c = null`
- Role: Stores the c value.
- Description: Backs the cached state for this file.

#### `private double ma = Math.random() * Math.PI * 2`
- Role: Stores the ma value.
- Description: Backs the cached state for this file.

#### `private double oa = Double.NaN`
- Role: Stores the oa value.
- Description: Backs the cached state for this file.

#### `public Color col = Color.BLACK`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

### Methods

#### `public Party(Glob glob)`
- Role: Creates a new Party instance.
- Description: Constructs the instance and initializes its default state.

#### `public Member(long gobid)`
- Role: Performs member.
- Description: Supports the member operation used by the surrounding class.

#### `public Gob getgob()`
- Role: Performs getgob.
- Description: Supports the getgob operation used by the surrounding class.

#### `public Coord2d getc()`
- Role: Performs getc.
- Description: Supports the getc operation used by the surrounding class.

#### `void setc(Coord2d c)`
- Role: Performs setc.
- Description: Supports the setc operation used by the surrounding class.

#### `public double geta()`
- Role: Performs geta.
- Description: Supports the geta operation used by the surrounding class.
