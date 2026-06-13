# Agent

## Meta

- Target: `lmi.runtime.Agent`
- Owner: `lmi.runtime`
- Concept: `Agent`
- Created: `2026-06-13`
- Updated: `2026-06-13`
- Extends: `Thread`

## Role

- Represents the automation worker and its job execution loop.

## Code Signals

- Public entry points:
  - `getInstance`
  - `pushJob`
  - `enqueueJob`
  - `stopAll`
  - `setSleep`
  - `isSleeping`
  - `getConfig`
  - `run`
