# ErrorGui

This file documents the responsibilities and members of `ErrorGui`.

## Meta

- Source: [ErrorGui.java](../../../../src/haven/error/ErrorGui.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Displays the error GUI.

## Members

### Constants

### Fields

#### `private JLabel status`

- Description: TODO

#### `private JEditorPane info`

- Description: TODO

#### `private JPanel details`

- Description: TODO

#### `private JButton closebtn, detbtn`

- Description: TODO

#### `private JButton closebtn, detbtn`

- Description: TODO

#### `private JTextArea exbox`

- Description: TODO

#### `private JScrollPane infoc, exboxc`

- Description: TODO

#### `private JScrollPane infoc, exboxc`

- Description: TODO

#### `private Thread reporter`

- Description: TODO

#### `private boolean done`

- Description: TODO

### Methods

#### `public ErrorGui(java.awt.Frame parent)`

- Description: TODO

#### `public boolean goterror(Throwable t)`

- Description: TODO

#### `public void connecting()`

- Description: TODO

#### `public void sending()`

- Description: TODO

#### `public void done(final String ctype, final String info)`

- Description: TODO

#### `public void senderror(Exception e)`

- Description: TODO

#### `public abstract void errorsent()`

- Description: TODO
