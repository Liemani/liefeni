---
source: [Curiosity.java](../../../../../src/haven/resutil/Curiosity.java)
created: 2026-06-13
updated: 2026-06-20
---

# Curiosity

Renders curiosity tooltip text and compares learning efficiency against the item currently being inspected.

## Members

### Fields

#### `public final Color better = new Color(0, 255, 0, 64), worse = new Color(255, 0, 0, 64)`
- Role: Stores the comparison overlay colors.
- Description: Green means better than the last curiosity; red means worse.

#### `public final int exp, mw, enc, time`
- Role: Stores the curiosity's learning stats.
- Description: Used to render tooltip text and compute learning-per-hour.

#### `public final UI ui`
- Role: Stores the UI reference used for hover comparison.
- Description: Captured only when the curiosity is shown inside an attribute window.

#### `static String[] units =`
- Role: Defines the time suffixes used by the formatter.
- Description: Converts raw seconds into `s`, `m`, `h`, and `d` segments.

#### `static int[] div =`
- Role: Defines the divisors used by the formatter.
- Description: Breaks a duration into larger time units.

### Methods

#### `public Curiosity(Owner owner, int exp, int mw, int enc, int time)`
- Role: Builds a curiosity info entry.
- Description: Captures the stats and, when possible, the current UI context.

#### `static String timefmt(int time)`
- Role: Formats a duration into a short human-readable string.
- Description: Produces day/hour/minute/second output as needed.

#### `public BufferedImage tipimg()`
- Role: Builds the tooltip image.
- Description: Renders learning points, study time, mental weight, and experience cost.

#### `public Color olcol()`
- Role: Chooses the overlay tint for comparison UI.
- Description: Compares the current curiosity's learning rate against the hovered one.