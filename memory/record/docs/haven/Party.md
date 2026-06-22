---
source: [Party.java](../../../../src/haven/Party.java)
created: 2026-06-13
updated: 2026-06-14
---

# Party

Tracks the current party roster, leader, and each member's last known gob position.

## Nested Types

### Member

- Role: Stores one party member entry.
- Description: Keeps the gob id, cached position, direction memory, and display color for one party member.

## Members

### Constants

### Fields

#### `public Map<Long, Member> memb = Collections.emptyMap()`
- Role: Stores the current party members by gob id.
- Description: Starts as an empty roster until server state populates the party.

#### `public Member leader = null`
- Role: Stores the current party leader.
- Description: Points at the member entry selected as the leader, or `null` when unset.

#### `public int id`
- Role: Stores the party id.
- Description: Identifies the current party instance reported by the server.

#### `private final Glob glob`
- Role: Provides access to gob lookups for party members.
- Description: Used to resolve a member's live gob from its gob id.

#### `private int mseq = 0`
- Role: Tracks the latest membership sequence.
- Description: Keeps the most recent party update sequence applied to the roster.

#### `public final long gobid`
- Role: Stores the member gob id.
- Description: This is the world gob id the party entry points at.

#### `public final int seq`
- Role: Stores the member sequence number.
- Description: Used to keep party entries in server update order.

#### `private Coord2d c = null`
- Role: Remembers the last known member position.
- Description: Preserves the previous coordinate when the live gob is not available.

#### `private double ma = Math.random() * Math.PI * 2`
- Role: Holds the remembered movement angle.
- Description: Initialized to a random heading and updated as the member moves.

#### `private double oa = Double.NaN`
- Role: Holds the observed angle when available.
- Description: Falls back to the remembered movement angle if no fresh angle is known.

#### `public Color col = Color.BLACK`
- Role: Stores the member's display color.
- Description: Used by UI rendering for party member labeling.

### Methods

#### `public Party(Glob glob)`
- Role: Creates a party tracker for the supplied world.
- Description: Binds the roster to the `Glob` used for gob lookup.

#### `public Member(long gobid)`
- Role: Creates one member entry for the given gob id.
- Description: Starts the cache state for a party member reference.

#### `public Gob getgob()`
- Role: Resolves the member's live gob.
- Description: Looks up the current gob from `glob.oc` using `gobid`.

#### `public Coord2d getc()`
- Role: Returns the best available member position.
- Description: Uses the live gob coordinate when possible, otherwise returns the cached fallback position.

#### `void setc(Coord2d c)`
- Role: Updates the cached member position.
- Description: Also refreshes the remembered movement angle when the coordinate changes.

#### `public double geta()`
- Role: Returns the best available member direction.
- Description: Prefers the observed angle and falls back to the remembered heading.
