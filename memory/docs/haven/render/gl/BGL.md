# BGL

This file documents the responsibilities and members of `BGL`.

## Meta

- Source: [BGL.java](../../../../../src/haven/render/gl/BGL.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Wraps low-level OpenGL access.

## Nested Types

### BGLException

- Description: TODO

### BufState

- Description: TODO

### Command

- Description: TODO

### DCmd

- Description: TODO

### DebugMessage

- Description: TODO

### Dummy

- Description: TODO

### Dump

- Description: TODO

### Formatter

- Description: TODO

### ID

- Description: TODO

### InfoDummy

- Description: TODO

### PopDummy

- Description: TODO

### Request

- Description: TODO

## Members

### Constants

#### `static final Map<Class<?>, Formatter<?>> cache = new HashMap<>()`

- Description: TODO

### Fields

#### `final Class<T> cl`

- Description: TODO

#### `final String nm`

- Description: TODO

#### `final Field[] args`

- Description: TODO

#### `final String[] argn`

- Description: TODO

#### `ByteBuffer buf`

- Description: TODO

#### `int position, limit`

- Description: TODO

#### `int position, limit`

- Description: TODO

#### `public final Dump dump`

- Description: TODO

#### `public final int source, type, severity, id`

- Description: TODO

#### `public final int source, type, severity, id`

- Description: TODO

#### `public final int source, type, severity, id`

- Description: TODO

#### `public final int source, type, severity, id`

- Description: TODO

#### `public final String text`

- Description: TODO

#### `public final List<DCmd> list`

- Description: TODO

#### `public final DCmd mark`

- Description: TODO

#### `private final transient Map<Object, Dummy> dummies = new IdentityHashMap<Object, Dummy>()`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final String clnm`

- Description: TODO

#### `public final String info`

- Description: TODO

#### `public final String[] varn`

- Description: TODO

#### `public final Object[] vars`

- Description: TODO

#### `public final String clnm, mnm`

- Description: TODO

#### `public final String clnm, mnm`

- Description: TODO

#### `public final String[] argn`

- Description: TODO

#### `public final Object[] args`

- Description: TODO

### Methods

#### `Formatter(Class<T> cl)`

- Description: TODO

#### `public static String format(float[] a)`

- Description: TODO

#### `public static String format(int[] a)`

- Description: TODO

#### `public String format(T ob)`

- Description: TODO

#### `static <T> Formatter<T> get(Class<T> cl)`

- Description: TODO

#### `public static <T> String fmt(T ob)`

- Description: TODO

#### `public abstract void run(GL gl)`

- Description: TODO

#### `public void abort()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `BufState(ByteBuffer buf, int position)`

- Description: TODO

#### `BufState(ByteBuffer buf)`

- Description: TODO

#### `void restore()`

- Description: TODO

#### `public int glid()`

- Description: TODO

#### `public void run(GL gl)`

- Description: TODO

#### `public default void abort()`

- Description: TODO

#### `protected abstract void add(Command cmd)`

- Description: TODO

#### `protected abstract Iterable<Command> dump()`

- Description: TODO

#### `public BGLException(BGL buf, Command mark, Throwable cause)`

- Description: TODO

#### `public void bglCheckErr()`

- Description: TODO

#### `public void bglCreate(final GLObject ob)`

- Description: TODO

#### `public void bglDelete(final GLObject ob)`

- Description: TODO

#### `public void bglSubmit(final Request req)`

- Description: TODO

#### `public void bglCallList(final BufferBGL list)`

- Description: TODO

#### `public void bglCopyBufferf(final FloatBuffer dst, final int doff, final FloatBuffer src, final int soff, final int len)`

- Description: TODO

#### `public void bglCopyBufferf(final FloatBuffer dst, final int doff, final float[] src, final int soff, final int len)`

- Description: TODO

#### `public void glActiveTexture(final int texture)`

- Description: TODO

#### `public void glAttachShader(final ID program, final ID shader)`

- Description: TODO

#### `public void glBindAttribLocation(final ID program, final ID index, final String name)`

- Description: TODO

#### `public void glBindBuffer(final int target, final ID buffer)`

- Description: TODO

#### `public void glBindFramebuffer(final int target, final ID buffer)`

- Description: TODO

#### `public void glBindRenderbuffer(final int target, final ID buffer)`

- Description: TODO

#### `public void glBindTexture(final int target, final ID texture)`

- Description: TODO

#### `public void glBindVertexArray(final ID array)`

- Description: TODO

#### `public void glBlendColor(final float red, final float green, final float blue, final float alpha)`

- Description: TODO

#### `public void glBlendEquation(final int mode)`

- Description: TODO

#### `public void glBlendEquationSeparate(final int cmode, final int amode)`

- Description: TODO

#### `public void glBlendFunc(final int sfac, final int dfac)`

- Description: TODO

#### `public void glBlendFuncSeparate(final int csfac, final int cdfac, final int asfac, final int adfac)`

- Description: TODO

#### `public void glBufferData(final int target, final long size, ByteBuffer data, final int usage)`

- Description: TODO

#### `public void glBufferSubData(final int target, final long offset, final long size, ByteBuffer data)`

- Description: TODO

#### `public void glClear(final int mask)`

- Description: TODO

#### `public void glClearBufferfv(final int buffer, final int drawbuffer, final float[] value)`

- Description: TODO

#### `public void glClearBufferiv(final int buffer, final int drawbuffer, final int[] value)`

- Description: TODO

#### `public void glClearBufferuiv(final int buffer, final int drawbuffer, final int[] value)`

- Description: TODO

#### `public void glClearColor(final float r, final float g, final float b, final float a)`

- Description: TODO

#### `public void glClearDepth(final double d)`

- Description: TODO

#### `public void glColorMask(final boolean r, final boolean g, final boolean b, final boolean a)`

- Description: TODO

#### `public void glColorMaski(final int buf, final boolean r, final boolean g, final boolean b, final boolean a)`

- Description: TODO

#### `public void glDeleteBuffers(final int count, final ID[] buffers)`

- Description: TODO

#### `public void glDeleteFramebuffers(final int count, final ID[] buffers)`

- Description: TODO

#### `public void glDeleteShader(final ID id)`

- Description: TODO

#### `public void glDeleteProgram(final ID id)`

- Description: TODO

#### `public void glDeleteRenderbuffers(final int count, final ID[] buffers)`

- Description: TODO

#### `public void glDeleteTextures(final int count, final ID[] buffers)`

- Description: TODO

#### `public void glDeleteVertexArrays(final int count, final ID[] buffers)`

- Description: TODO

#### `public void glCullFace(final int mode)`

- Description: TODO

#### `public void glDepthFunc(final int func)`

- Description: TODO

#### `public void glDepthMask(final boolean mask)`

- Description: TODO

#### `public void glDisable(final int cap)`

- Description: TODO

#### `public void glDisablei(final int cap, final int index)`

- Description: TODO

#### `public void glDisableVertexAttribArray(final ID location)`

- Description: TODO

#### `public void glDisableVertexAttribArray(final ID location, final int offset)`

- Description: TODO

#### `public void glDrawBuffer(final int buf)`

- Description: TODO

#### `public void glDrawBuffers(final int n, final int[] bufs)`

- Description: TODO

#### `public void glDrawArraysInstanced(final int mode, final int first, final int count, final int primcount)`

- Description: TODO

#### `public void glDrawArrays(final int mode, final int first, final int count)`

- Description: TODO

#### `public void glDrawElementsInstanced(final int mode, final int count, final int type, final long indices, final int primcount)`

- Description: TODO

#### `public void glDrawElements(final int mode, final int count, final int type, final long indices)`

- Description: TODO

#### `public void glDrawRangeElements(final int mode, final int start, final int end, final int count, final int type, final long indices)`

- Description: TODO

#### `public void glEnable(final int cap)`

- Description: TODO

#### `public void glEnablei(final int cap, final int index)`

- Description: TODO

#### `public void glEnableVertexAttribArray(final ID location)`

- Description: TODO

#### `public void glEnableVertexAttribArray(final ID location, final int offset)`

- Description: TODO

#### `public void glDeleteSync(final long id)`

- Description: TODO

#### `public void glFramebufferTexture2D(final int target, final int attachment, final int textarget, final ID texture, final int level)`

- Description: TODO

#### `public void glFramebufferRenderbuffer(final int target, final int attachment, final int rbtarget, final ID renderbuffer)`

- Description: TODO

#### `public void glGetTexImage(final int target, final int level, final int format, final int type, ByteBuffer pixels)`

- Description: TODO

#### `public void glGetTexImage(final int target, final int level, final int format, final int type, long offset)`

- Description: TODO

#### `public void glLineWidth(final float w)`

- Description: TODO

#### `public void glLinkProgram(final ID program)`

- Description: TODO

#### `public void glObjectLabel(final int identifier, final ID name, final int length, final byte[] label)`

- Description: TODO

#### `public void glObjectLabel(int identifier, ID name, String label)`

- Description: TODO

#### `public void glPixelStorei(final int pname, final int param)`

- Description: TODO

#### `public void glPointSize(final float size)`

- Description: TODO

#### `public void glPolygonMode(final int face, final int mode)`

- Description: TODO

#### `public void glPolygonOffset(final float factor, final float units)`

- Description: TODO

#### `public void glReadBuffer(final int buf)`

- Description: TODO

#### `public void glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, ByteBuffer data)`

- Description: TODO

#### `public void glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, long offset)`

- Description: TODO

#### `public void glRenderbufferStorage(final int target, final int format, final int width, final int height)`

- Description: TODO

#### `public void glRenderbufferStorageMultisample(final int target, final int samples, final int format, final int width, final int height)`

- Description: TODO

#### `public void glSampleCoverage(final float value, final boolean invert)`

- Description: TODO

#### `public void glScissor(final int x, final int y, final int w, final int h)`

- Description: TODO

#### `public void glTexImage2D(final int target, final int level, final int internalformat, final int width, final int height, final int border, final int format, final int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexSubImage2D(final int target, final int level, final int xoff, final int yoff, final int width, final int height, final int format, final int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexImage2DMultisample(final int target, final int samples, final int internalformat, final int width, final int height, final boolean fixedsamplelocations)`

- Description: TODO

#### `public void glTexImage3D(final int target, final int level, final int internalformat, final int width, final int height, final int depth, final int border, final int format, final int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexSubImage3D(final int target, final int level, final int xoff, final int yoff, final int zoff, final int width, final int height, final int depth, final int format, final int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexParameterf(final int target, final int pname, final float param)`

- Description: TODO

#### `public void glTexParameterfv(final int target, final int pname, final float[] param)`

- Description: TODO

#### `public void glTexParameteri(final int target, final int pname, final int param)`

- Description: TODO

#### `public void glUniform1f(final ID location, final float v0)`

- Description: TODO

#### `public void glUniform2f(final ID location, final float v0, final float v1)`

- Description: TODO

#### `public void glUniform3f(final ID location, final float v0, final float v1, final float v2)`

- Description: TODO

#### `public void glUniform3fv(final ID location, final int count, final float[] val)`

- Description: TODO

#### `public void glUniform4f(final ID location, final float v0, final float v1, final float v2, final float v3)`

- Description: TODO

#### `public void glUniform4fv(final ID location, final int count, final float[] val)`

- Description: TODO

#### `public void glUniform1i(final ID location, final int v0)`

- Description: TODO

#### `public void glUniform2i(final ID location, final int v0, final int v1)`

- Description: TODO

#### `public void glUniform3i(final ID location, final int v0, final int v1, final int v2)`

- Description: TODO

#### `public void glUniform4i(final ID location, final int v0, final int v1, final int v2, final int v3)`

- Description: TODO

#### `public void glUniformMatrix3fv(final ID location, final int count, final boolean transpose, final float[] value)`

- Description: TODO

#### `public void glUniformMatrix4fv(final ID location, final int count, final boolean transpose, final float[] value)`

- Description: TODO

#### `public void glUseProgram(final ID program)`

- Description: TODO

#### `public void glVertexAttribDivisor(final ID location, final int divisor)`

- Description: TODO

#### `public void glVertexAttribDivisor(final ID location, final int offset, final int divisor)`

- Description: TODO

#### `public void glVertexAttribPointer(final ID location, final int size, final int type, final boolean normalized, final int stride, final long pointer)`

- Description: TODO

#### `public void glVertexAttribPointer(final ID location, final int offset, final int size, final int type, final boolean normalized, final int stride, final long pointer)`

- Description: TODO

#### `public void glVertexAttribIPointer(final ID location, final int size, final int type, final int stride, final long pointer)`

- Description: TODO

#### `public void glVertexAttribIPointer(final ID location, final int offset, final int size, final int type, final int stride, final long pointer)`

- Description: TODO

#### `public void glViewport(final int x, final int y, final int w, final int h)`

- Description: TODO

#### `public DebugMessage(int source, int type, int severity, int id, String text)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void glDebugMessageControl(final int source, final int type, final int severity, final int[] ids, final boolean enabled)`

- Description: TODO

#### `public void bglGetDebugMessageLog(final Consumer<DebugMessage> cb)`

- Description: TODO

#### `public Dummy(int id, Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public InfoDummy(int id, Object o, String info)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public PopDummy(int id, Object o, Dump d)`

- Description: TODO

#### `private Dummy intern(Object o)`

- Description: TODO

#### `private Object mapval(Object o)`

- Description: TODO

#### `public DCmd(Dump d, Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Dump(BGL buf, Command mark)`

- Description: TODO

#### `public void dump(PrintStream out)`

- Description: TODO

#### `public void dump()`

- Description: TODO
