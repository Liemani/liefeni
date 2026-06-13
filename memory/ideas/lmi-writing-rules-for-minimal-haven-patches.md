# LMI Writing Rules for Minimal Haven Patches

## Meta

- Date: 2026-06-13
- Status: Idea
- Indexes:
  - [lmi.md](../indexes/lmi.md)

## Idea

LMI should keep Haven patches minimal by using small bridge helpers that read only the information needed from Haven, then hand structured results to runtime/waypoint code.

Proposed rules:
- Put raw Haven reads in bridge helpers, not scattered across runtime or waypoint code.
- Keep bridge helpers narrow and functional: read, probe, wait, request.
- Avoid mirror-style classes that copy Haven class names one-to-one.
- Let runtime and waypoint code work from bridge results instead of touching Haven objects directly.
- Prefer explicit verbs like save, register, request, and wait over vague verbs like ensure.

Open questions:
- Which bridge helpers should exist as first-class types.
- How far bridge helpers should go before they become runtime logic.
- Whether some Haven object specific helpers should stay near the object or move into bridge.
