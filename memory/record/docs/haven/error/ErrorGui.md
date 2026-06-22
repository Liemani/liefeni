---
source: [ErrorGui.java](../../../../../src/haven/error/ErrorGui.java)
created: 2026-06-13
updated: 2026-06-14
---

# ErrorGui

Handles Haven error reporting for error gui.

## Members

### Constants

### Fields

#### `private JLabel status`
- Role: Caches the status value.
- Description: Caches the `status` value for reuse.

#### `private JEditorPane info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `private JPanel details`
- Role: Caches the details value.
- Description: Caches the `details` value for reuse.

#### `private JButton closebtn, detbtn`
- Role: Caches the detbtn value.
- Description: Caches the `detbtn` value for reuse.

#### `private JButton closebtn, detbtn`
- Role: Caches the detbtn value.
- Description: Caches the `detbtn` value for reuse.

#### `private JTextArea exbox`
- Role: Caches the exbox value.
- Description: Caches the `exbox` value for reuse.

#### `private JScrollPane infoc, exboxc`
- Role: Caches the exboxc value.
- Description: Caches the `exboxc` value for reuse.

#### `private JScrollPane infoc, exboxc`
- Role: Caches the exboxc value.
- Description: Caches the `exboxc` value for reuse.

#### `private Thread reporter`
- Role: Caches the reporter value.
- Description: Caches the `reporter` value for reuse.

#### `private boolean done`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

### Methods

#### `public ErrorGui(java.awt.Frame parent)`
- Role: Creates a new ErrorGui instance.
- Description: Constructs the ErrorGui instance from the supplied inputs.

#### `public boolean goterror(Throwable t)`
- Role: Handles the goterror path.
- Description: Implements the goterror operation.

#### `public void connecting()`
- Role: Handles the connecting path.
- Description: Implements the connecting operation.

#### `public void sending()`
- Role: Handles the sending path.
- Description: Implements the sending operation.

#### `public void done(final String ctype, final String info)`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public void senderror(Exception e)`
- Role: Handles the senderror path.
- Description: Implements the senderror operation.

#### `public abstract void errorsent()`
- Role: Handles the errorsent path.
- Description: Implements the errorsent operation.