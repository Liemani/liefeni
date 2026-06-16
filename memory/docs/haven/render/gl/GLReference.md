# GLReference

This file documents the responsibilities and members of `GLReference`.

## Meta

- Source: [GLReference.java](../../../../../src/haven/render/gl/GLReference.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for glreference.

## Members

### Constants

### Fields

### Methods

#### `public GLReference(T ob)`
- Role: Creates a new GLReference instance.
- Description: Constructs the instance and initializes its default state.

#### `public static <T extends Disposable> T get(Object ro, Class<T> type)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.
