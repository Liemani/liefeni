# MapViewBridge

## Meta

- Target: `haven.MapView`
- Owner: `lmi.bridge`
- Concept: `MapViewBridge`
- Created: `2026-06-13`
- Updated: `2026-06-13`

## Role

- Serves as the main in-world map interaction surface.
- Provides a place to own the current Haven `MapView` reference and map-view specific helpers.

## Notes

- `MapView` is not just a read-only source of state; it also accepts messages and drive-by interaction.
- `MapView`-specific bridge logic fits better here than in `AppContext`.
- raw Haven access should stay narrow, and runtime/waypoint should consume only the bridge result.

## Rules

- `MapView` reference ownership should live in the bridge layer, not in `AppContext`.
- map-view reads and map-view message sending should stay in one interaction area.
- bridge helpers should keep raw Haven access narrow and hand structured results to runtime/waypoint code.
