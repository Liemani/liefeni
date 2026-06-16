# ErrorGui

This file documents the responsibilities and members of `ErrorGui`.

## Meta

- Source: [ErrorGui.java](../../../../src/haven/error/ErrorGui.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles Haven error reporting for error gui.

## Members

### Constants

### Fields

#### `private JLabel status`
- Role: Stores the status value.
- Description: Backs the cached state for this file.

#### `private JEditorPane info`
- Role: Holds the info state.
- Description: Backs the cached state for this file.

#### `private JPanel details`
- Role: Holds the details state.
- Description: Backs the cached state for this file.

#### `private JButton closebtn, detbtn`
- Role: Holds the detbtn state.
- Description: Backs the cached state for this file.

#### `private JButton closebtn, detbtn`
- Role: Holds the detbtn state.
- Description: Backs the cached state for this file.

#### `private JTextArea exbox`
- Role: Stores the exbox value.
- Description: Backs the cached state for this file.

#### `private JScrollPane infoc, exboxc`
- Role: Holds the exboxc state.
- Description: Backs the cached state for this file.

#### `private JScrollPane infoc, exboxc`
- Role: Holds the exboxc state.
- Description: Backs the cached state for this file.

#### `private Thread reporter`
- Role: Holds the reporter state.
- Description: Backs the cached state for this file.

#### `private boolean done`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

### Methods

#### `public ErrorGui(java.awt.Frame parent)`
- Role: Creates a new ErrorGui instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean goterror(Throwable t)`
- Role: Performs goterror.
- Description: Supports the goterror operation used by the surrounding class.

#### `public void connecting()`
- Role: Performs connecting.
- Description: Supports the connecting operation used by the surrounding class.

#### `public void sending()`
- Role: Performs sending.
- Description: Supports the sending operation used by the surrounding class.

#### `public void done(final String ctype, final String info)`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public void senderror(Exception e)`
- Role: Performs senderror.
- Description: Supports the senderror operation used by the surrounding class.

#### `public abstract void errorsent()`
- Role: Performs errorsent.
- Description: Supports the errorsent operation used by the surrounding class.
