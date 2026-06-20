# Repository Guidelines

## Project Structure & Module Organization

- `src/haven/`: upstream Haven & Hearth client and engine code.
- `src/lmi/`: LMI runtime, lifecycle, hooks, UI injection, sync, and waypoint infrastructure.
- `src/agent/`: user-facing automation features. Main areas are `tool/` for `Job`s, `effect/` for instant actions, and `debug/` / `test/` for diagnostics.
- `assets/`, `data/`, `etc/`: local resources and configuration inputs.
- `memory/record/wiki/`: architecture and waypoint documentation. Start with `memory/record/wiki/runtime.md` and `memory/record/wiki/waypoint.md`.

## Build, Test, and Development Commands

- `ant -q hafen-client`: compile the client. Use this as the default verification step.
- `ant jar`: build the distributable JAR.
- `./run.sh`: launch the client locally if the environment is already prepared.

There is no single repository-wide automated test suite in regular use. `src/agent/test/` and `src/haven/test/` contain manual or ad hoc test code, not a required CI target.

## Coding Style & Naming Conventions

- Use Java with 2-space indentation and keep existing brace/style patterns unchanged.
- Preserve package boundaries: `haven` for engine code, `lmi` for runtime infrastructure, `agent` for user features.
- Name long-running user actions as `*Job` and instant menu actions as `*Effect`.
- Keep Haven-side patches narrowly scoped and, where already used, inside `// lmi start` / `// lmi end` markers.
- Prefer passing stable values such as IDs and coordinates instead of whole mutable game objects when extending low-level actions.

## Testing Guidelines

- Always run `ant -q hafen-client` before finishing a change.
- For waypoint, lifecycle, or hook changes, also sanity-check the affected runtime path manually in game.
- Keep debug-only helpers under `agent.debug` or clearly named overlay/effect classes.

## Commit & Pull Request Guidelines

- Follow the recent commit style: short imperative subjects with prefixes like `feat:`, `fix:`, or `warn:`.
- Keep commits focused on one behavioral change.
- PRs should include:
  - what changed,
  - why it changed,
  - how it was verified (`ant -q hafen-client`, manual flow, etc.),
  - screenshots or logs when UI / overlay / lifecycle behavior changed.

## Architecture Notes

- Lifecycle ownership should flow from Haven events into `LmiLifecycle`, not from `AppContext`.
- Waypoint persistence should go through `WaypointStore` / `WaypointDbExecutor`; do not add direct ad hoc JDBC paths.
- Broader working context lives in [memory/record/wiki/index.md](memory/record/wiki/index.md).
