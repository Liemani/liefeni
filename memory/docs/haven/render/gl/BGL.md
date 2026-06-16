# BGL

This file documents the responsibilities and members of `BGL`.

## Meta

- Source: [BGL.java](../../../../../src/haven/render/gl/BGL.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for bgl.

## Nested Types

### BGLException

- Role: Represents bglexception within BGL.
- Description: Describes the nested bglexception type used by the enclosing class.

### BufState

- Role: Represents buf state within BGL.
- Description: Describes the nested buf state type used by the enclosing class.

### Command

- Role: Represents command within BGL.
- Description: Describes the nested command type used by the enclosing class.

### DCmd

- Role: Represents dcmd within BGL.
- Description: Describes the nested dcmd type used by the enclosing class.

### DebugMessage

- Role: Represents debug message within BGL.
- Description: Describes the nested debug message type used by the enclosing class.

### Dummy

- Role: Represents dummy within BGL.
- Description: Describes the nested dummy type used by the enclosing class.

### Dump

- Role: Represents dump within BGL.
- Description: Describes the nested dump type used by the enclosing class.

### Formatter

- Role: Represents formatter within BGL.
- Description: Describes the nested formatter type used by the enclosing class.

### ID

- Role: Represents id within BGL.
- Description: Describes the nested id type used by the enclosing class.

### InfoDummy

- Role: Represents info dummy within BGL.
- Description: Describes the nested info dummy type used by the enclosing class.

### PopDummy

- Role: Represents pop dummy within BGL.
- Description: Describes the nested pop dummy type used by the enclosing class.

### Request

- Role: Represents request within BGL.
- Description: Describes the nested request type used by the enclosing class.

## Members

### Constants

#### `static final Map<Class<?>, Formatter<?>> cache = new HashMap<>()`
- Role: Defines the shared cache constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `final Class<T> cl`
- Role: Holds the cl state.
- Description: Backs the cached state for this file.

#### `final String nm`
- Role: Stores the nm value.
- Description: Backs the cached state for this file.

#### `final Field[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `final String[] argn`
- Role: Stores the argn value.
- Description: Backs the cached state for this file.

#### `ByteBuffer buf`
- Role: Stores the buf value.
- Description: Backs the cached state for this file.

#### `int position, limit`
- Role: Stores the limit value.
- Description: Backs the cached state for this file.

#### `int position, limit`
- Role: Stores the limit value.
- Description: Backs the cached state for this file.

#### `public final Dump dump`
- Role: Holds the dump state.
- Description: Backs the cached state for this file.

#### `public final int source, type, severity, id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final int source, type, severity, id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final int source, type, severity, id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final int source, type, severity, id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final String text`
- Role: Stores the text value.
- Description: Backs the cached state for this file.

#### `public final List<DCmd> list`
- Role: Caches list entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final DCmd mark`
- Role: Holds the mark state.
- Description: Backs the cached state for this file.

#### `private final transient Map<Object, Dummy> dummies = new IdentityHashMap<Object, Dummy>()`
- Role: Caches dummies entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final String clnm`
- Role: Stores the clnm value.
- Description: Backs the cached state for this file.

#### `public final String info`
- Role: Stores the info value.
- Description: Backs the cached state for this file.

#### `public final String[] varn`
- Role: Stores the varn value.
- Description: Backs the cached state for this file.

#### `public final Object[] vars`
- Role: Holds the vars state.
- Description: Backs the cached state for this file.

#### `public final String clnm, mnm`
- Role: Stores the mnm value.
- Description: Backs the cached state for this file.

#### `public final String clnm, mnm`
- Role: Stores the mnm value.
- Description: Backs the cached state for this file.

#### `public final String[] argn`
- Role: Stores the argn value.
- Description: Backs the cached state for this file.

#### `public final Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

### Methods

#### `Formatter(Class<T> cl)`
- Role: Handles the formatter workflow.
- Description: Supports the formatter operation used by the surrounding class.

#### `public static String format(float[] a)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `public static String format(int[] a)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `public String format(T ob)`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `static <T> Formatter<T> get(Class<T> cl)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static <T> String fmt(T ob)`
- Role: Performs fmt.
- Description: Supports the fmt operation used by the surrounding class.

#### `public abstract void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void abort()`
- Role: Performs abort.
- Description: Supports the abort operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `BufState(ByteBuffer buf, int position)`
- Role: Handles the buf state workflow.
- Description: Supports the buf state operation used by the surrounding class.

#### `BufState(ByteBuffer buf)`
- Role: Handles the buf state workflow.
- Description: Supports the buf state operation used by the surrounding class.

#### `void restore()`
- Role: Performs restore.
- Description: Supports the restore operation used by the surrounding class.

#### `public int glid()`
- Role: Performs glid.
- Description: Supports the glid operation used by the surrounding class.

#### `public void run(GL gl)`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public default void abort()`
- Role: Performs abort.
- Description: Supports the abort operation used by the surrounding class.

#### `protected abstract void add(Command cmd)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `protected abstract Iterable<Command> dump()`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public BGLException(BGL buf, Command mark, Throwable cause)`
- Role: Performs bglexception.
- Description: Supports the bglexception operation used by the surrounding class.

#### `public void bglCheckErr()`
- Role: Performs bgl check err.
- Description: Supports the bgl check err operation used by the surrounding class.

#### `public void bglCreate(final GLObject ob)`
- Role: Performs bgl create.
- Description: Supports the bgl create operation used by the surrounding class.

#### `public void bglDelete(final GLObject ob)`
- Role: Performs bgl delete.
- Description: Supports the bgl delete operation used by the surrounding class.

#### `public void bglSubmit(final Request req)`
- Role: Performs bgl submit.
- Description: Supports the bgl submit operation used by the surrounding class.

#### `public void bglCallList(final BufferBGL list)`
- Role: Performs bgl call list.
- Description: Supports the bgl call list operation used by the surrounding class.

#### `public void bglCopyBufferf(final FloatBuffer dst, final int doff, final FloatBuffer src, final int soff, final int len)`
- Role: Performs bgl copy bufferf.
- Description: Supports the bgl copy bufferf operation used by the surrounding class.

#### `public void bglCopyBufferf(final FloatBuffer dst, final int doff, final float[] src, final int soff, final int len)`
- Role: Performs bgl copy bufferf.
- Description: Supports the bgl copy bufferf operation used by the surrounding class.

#### `public void glActiveTexture(final int texture)`
- Role: Performs gl active texture.
- Description: Supports the gl active texture operation used by the surrounding class.

#### `public void glAttachShader(final ID program, final ID shader)`
- Role: Performs gl attach shader.
- Description: Supports the gl attach shader operation used by the surrounding class.

#### `public void glBindAttribLocation(final ID program, final ID index, final String name)`
- Role: Performs gl bind attrib location.
- Description: Supports the gl bind attrib location operation used by the surrounding class.

#### `public void glBindBuffer(final int target, final ID buffer)`
- Role: Performs gl bind buffer.
- Description: Supports the gl bind buffer operation used by the surrounding class.

#### `public void glBindFramebuffer(final int target, final ID buffer)`
- Role: Performs gl bind framebuffer.
- Description: Supports the gl bind framebuffer operation used by the surrounding class.

#### `public void glBindRenderbuffer(final int target, final ID buffer)`
- Role: Performs gl bind renderbuffer.
- Description: Supports the gl bind renderbuffer operation used by the surrounding class.

#### `public void glBindTexture(final int target, final ID texture)`
- Role: Performs gl bind texture.
- Description: Supports the gl bind texture operation used by the surrounding class.

#### `public void glBindVertexArray(final ID array)`
- Role: Performs gl bind vertex array.
- Description: Supports the gl bind vertex array operation used by the surrounding class.

#### `public void glBlendColor(final float red, final float green, final float blue, final float alpha)`
- Role: Performs gl blend color.
- Description: Supports the gl blend color operation used by the surrounding class.

#### `public void glBlendEquation(final int mode)`
- Role: Performs gl blend equation.
- Description: Supports the gl blend equation operation used by the surrounding class.

#### `public void glBlendEquationSeparate(final int cmode, final int amode)`
- Role: Performs gl blend equation separate.
- Description: Supports the gl blend equation separate operation used by the surrounding class.

#### `public void glBlendFunc(final int sfac, final int dfac)`
- Role: Performs gl blend func.
- Description: Supports the gl blend func operation used by the surrounding class.

#### `public void glBlendFuncSeparate(final int csfac, final int cdfac, final int asfac, final int adfac)`
- Role: Performs gl blend func separate.
- Description: Supports the gl blend func separate operation used by the surrounding class.

#### `public void glBufferData(final int target, final long size, ByteBuffer data, final int usage)`
- Role: Performs gl buffer data.
- Description: Supports the gl buffer data operation used by the surrounding class.

#### `public void glBufferSubData(final int target, final long offset, final long size, ByteBuffer data)`
- Role: Performs gl buffer sub data.
- Description: Supports the gl buffer sub data operation used by the surrounding class.

#### `public void glClear(final int mask)`
- Role: Performs gl clear.
- Description: Supports the gl clear operation used by the surrounding class.

#### `public void glClearBufferfv(final int buffer, final int drawbuffer, final float[] value)`
- Role: Performs gl clear bufferfv.
- Description: Supports the gl clear bufferfv operation used by the surrounding class.

#### `public void glClearBufferiv(final int buffer, final int drawbuffer, final int[] value)`
- Role: Performs gl clear bufferiv.
- Description: Supports the gl clear bufferiv operation used by the surrounding class.

#### `public void glClearBufferuiv(final int buffer, final int drawbuffer, final int[] value)`
- Role: Performs gl clear bufferuiv.
- Description: Supports the gl clear bufferuiv operation used by the surrounding class.

#### `public void glClearColor(final float r, final float g, final float b, final float a)`
- Role: Performs gl clear color.
- Description: Supports the gl clear color operation used by the surrounding class.

#### `public void glClearDepth(final double d)`
- Role: Performs gl clear depth.
- Description: Supports the gl clear depth operation used by the surrounding class.

#### `public void glColorMask(final boolean r, final boolean g, final boolean b, final boolean a)`
- Role: Performs gl color mask.
- Description: Supports the gl color mask operation used by the surrounding class.

#### `public void glColorMaski(final int buf, final boolean r, final boolean g, final boolean b, final boolean a)`
- Role: Performs gl color maski.
- Description: Supports the gl color maski operation used by the surrounding class.

#### `public void glDeleteBuffers(final int count, final ID[] buffers)`
- Role: Performs gl delete buffers.
- Description: Supports the gl delete buffers operation used by the surrounding class.

#### `public void glDeleteFramebuffers(final int count, final ID[] buffers)`
- Role: Performs gl delete framebuffers.
- Description: Supports the gl delete framebuffers operation used by the surrounding class.

#### `public void glDeleteShader(final ID id)`
- Role: Performs gl delete shader.
- Description: Supports the gl delete shader operation used by the surrounding class.

#### `public void glDeleteProgram(final ID id)`
- Role: Performs gl delete program.
- Description: Supports the gl delete program operation used by the surrounding class.

#### `public void glDeleteRenderbuffers(final int count, final ID[] buffers)`
- Role: Performs gl delete renderbuffers.
- Description: Supports the gl delete renderbuffers operation used by the surrounding class.

#### `public void glDeleteTextures(final int count, final ID[] buffers)`
- Role: Performs gl delete textures.
- Description: Supports the gl delete textures operation used by the surrounding class.

#### `public void glDeleteVertexArrays(final int count, final ID[] buffers)`
- Role: Performs gl delete vertex arrays.
- Description: Supports the gl delete vertex arrays operation used by the surrounding class.

#### `public void glCullFace(final int mode)`
- Role: Performs gl cull face.
- Description: Supports the gl cull face operation used by the surrounding class.

#### `public void glDepthFunc(final int func)`
- Role: Performs gl depth func.
- Description: Supports the gl depth func operation used by the surrounding class.

#### `public void glDepthMask(final boolean mask)`
- Role: Performs gl depth mask.
- Description: Supports the gl depth mask operation used by the surrounding class.

#### `public void glDisable(final int cap)`
- Role: Performs gl disable.
- Description: Supports the gl disable operation used by the surrounding class.

#### `public void glDisablei(final int cap, final int index)`
- Role: Performs gl disablei.
- Description: Supports the gl disablei operation used by the surrounding class.

#### `public void glDisableVertexAttribArray(final ID location)`
- Role: Performs gl disable vertex attrib array.
- Description: Supports the gl disable vertex attrib array operation used by the surrounding class.

#### `public void glDisableVertexAttribArray(final ID location, final int offset)`
- Role: Performs gl disable vertex attrib array.
- Description: Supports the gl disable vertex attrib array operation used by the surrounding class.

#### `public void glDrawBuffer(final int buf)`
- Role: Performs gl draw buffer.
- Description: Supports the gl draw buffer operation used by the surrounding class.

#### `public void glDrawBuffers(final int n, final int[] bufs)`
- Role: Performs gl draw buffers.
- Description: Supports the gl draw buffers operation used by the surrounding class.

#### `public void glDrawArraysInstanced(final int mode, final int first, final int count, final int primcount)`
- Role: Performs gl draw arrays instanced.
- Description: Supports the gl draw arrays instanced operation used by the surrounding class.

#### `public void glDrawArrays(final int mode, final int first, final int count)`
- Role: Performs gl draw arrays.
- Description: Supports the gl draw arrays operation used by the surrounding class.

#### `public void glDrawElementsInstanced(final int mode, final int count, final int type, final long indices, final int primcount)`
- Role: Performs gl draw elements instanced.
- Description: Supports the gl draw elements instanced operation used by the surrounding class.

#### `public void glDrawElements(final int mode, final int count, final int type, final long indices)`
- Role: Performs gl draw elements.
- Description: Supports the gl draw elements operation used by the surrounding class.

#### `public void glDrawRangeElements(final int mode, final int start, final int end, final int count, final int type, final long indices)`
- Role: Performs gl draw range elements.
- Description: Supports the gl draw range elements operation used by the surrounding class.

#### `public void glEnable(final int cap)`
- Role: Performs gl enable.
- Description: Supports the gl enable operation used by the surrounding class.

#### `public void glEnablei(final int cap, final int index)`
- Role: Performs gl enablei.
- Description: Supports the gl enablei operation used by the surrounding class.

#### `public void glEnableVertexAttribArray(final ID location)`
- Role: Performs gl enable vertex attrib array.
- Description: Supports the gl enable vertex attrib array operation used by the surrounding class.

#### `public void glEnableVertexAttribArray(final ID location, final int offset)`
- Role: Performs gl enable vertex attrib array.
- Description: Supports the gl enable vertex attrib array operation used by the surrounding class.

#### `public void glDeleteSync(final long id)`
- Role: Performs gl delete sync.
- Description: Supports the gl delete sync operation used by the surrounding class.

#### `public void glFramebufferTexture2D(final int target, final int attachment, final int textarget, final ID texture, final int level)`
- Role: Performs gl framebuffer texture2 d.
- Description: Supports the gl framebuffer texture2 d operation used by the surrounding class.

#### `public void glFramebufferRenderbuffer(final int target, final int attachment, final int rbtarget, final ID renderbuffer)`
- Role: Performs gl framebuffer renderbuffer.
- Description: Supports the gl framebuffer renderbuffer operation used by the surrounding class.

#### `public void glGetTexImage(final int target, final int level, final int format, final int type, ByteBuffer pixels)`
- Role: Performs gl get tex image.
- Description: Supports the gl get tex image operation used by the surrounding class.

#### `public void glGetTexImage(final int target, final int level, final int format, final int type, long offset)`
- Role: Performs gl get tex image.
- Description: Supports the gl get tex image operation used by the surrounding class.

#### `public void glLineWidth(final float w)`
- Role: Performs gl line width.
- Description: Supports the gl line width operation used by the surrounding class.

#### `public void glLinkProgram(final ID program)`
- Role: Performs gl link program.
- Description: Supports the gl link program operation used by the surrounding class.

#### `public void glObjectLabel(final int identifier, final ID name, final int length, final byte[] label)`
- Role: Performs gl object label.
- Description: Supports the gl object label operation used by the surrounding class.

#### `public void glObjectLabel(int identifier, ID name, String label)`
- Role: Performs gl object label.
- Description: Supports the gl object label operation used by the surrounding class.

#### `public void glPixelStorei(final int pname, final int param)`
- Role: Performs gl pixel storei.
- Description: Supports the gl pixel storei operation used by the surrounding class.

#### `public void glPointSize(final float size)`
- Role: Performs gl point size.
- Description: Supports the gl point size operation used by the surrounding class.

#### `public void glPolygonMode(final int face, final int mode)`
- Role: Performs gl polygon mode.
- Description: Supports the gl polygon mode operation used by the surrounding class.

#### `public void glPolygonOffset(final float factor, final float units)`
- Role: Performs gl polygon offset.
- Description: Supports the gl polygon offset operation used by the surrounding class.

#### `public void glReadBuffer(final int buf)`
- Role: Performs gl read buffer.
- Description: Supports the gl read buffer operation used by the surrounding class.

#### `public void glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, ByteBuffer data)`
- Role: Performs gl read pixels.
- Description: Supports the gl read pixels operation used by the surrounding class.

#### `public void glReadPixels(final int x, final int y, final int width, final int height, final int format, final int type, long offset)`
- Role: Performs gl read pixels.
- Description: Supports the gl read pixels operation used by the surrounding class.

#### `public void glRenderbufferStorage(final int target, final int format, final int width, final int height)`
- Role: Performs gl renderbuffer storage.
- Description: Supports the gl renderbuffer storage operation used by the surrounding class.

#### `public void glRenderbufferStorageMultisample(final int target, final int samples, final int format, final int width, final int height)`
- Role: Performs gl renderbuffer storage multisample.
- Description: Supports the gl renderbuffer storage multisample operation used by the surrounding class.

#### `public void glSampleCoverage(final float value, final boolean invert)`
- Role: Performs gl sample coverage.
- Description: Supports the gl sample coverage operation used by the surrounding class.

#### `public void glScissor(final int x, final int y, final int w, final int h)`
- Role: Performs gl scissor.
- Description: Supports the gl scissor operation used by the surrounding class.

#### `public void glTexImage2D(final int target, final int level, final int internalformat, final int width, final int height, final int border, final int format, final int type, ByteBuffer data)`
- Role: Performs gl tex image2 d.
- Description: Supports the gl tex image2 d operation used by the surrounding class.

#### `public void glTexSubImage2D(final int target, final int level, final int xoff, final int yoff, final int width, final int height, final int format, final int type, ByteBuffer data)`
- Role: Performs gl tex sub image2 d.
- Description: Supports the gl tex sub image2 d operation used by the surrounding class.

#### `public void glTexImage2DMultisample(final int target, final int samples, final int internalformat, final int width, final int height, final boolean fixedsamplelocations)`
- Role: Performs gl tex image2 dmultisample.
- Description: Supports the gl tex image2 dmultisample operation used by the surrounding class.

#### `public void glTexImage3D(final int target, final int level, final int internalformat, final int width, final int height, final int depth, final int border, final int format, final int type, ByteBuffer data)`
- Role: Performs gl tex image3 d.
- Description: Supports the gl tex image3 d operation used by the surrounding class.

#### `public void glTexSubImage3D(final int target, final int level, final int xoff, final int yoff, final int zoff, final int width, final int height, final int depth, final int format, final int type, ByteBuffer data)`
- Role: Performs gl tex sub image3 d.
- Description: Supports the gl tex sub image3 d operation used by the surrounding class.

#### `public void glTexParameterf(final int target, final int pname, final float param)`
- Role: Performs gl tex parameterf.
- Description: Supports the gl tex parameterf operation used by the surrounding class.

#### `public void glTexParameterfv(final int target, final int pname, final float[] param)`
- Role: Performs gl tex parameterfv.
- Description: Supports the gl tex parameterfv operation used by the surrounding class.

#### `public void glTexParameteri(final int target, final int pname, final int param)`
- Role: Performs gl tex parameteri.
- Description: Supports the gl tex parameteri operation used by the surrounding class.

#### `public void glUniform1f(final ID location, final float v0)`
- Role: Performs gl uniform1f.
- Description: Supports the gl uniform1f operation used by the surrounding class.

#### `public void glUniform2f(final ID location, final float v0, final float v1)`
- Role: Performs gl uniform2f.
- Description: Supports the gl uniform2f operation used by the surrounding class.

#### `public void glUniform3f(final ID location, final float v0, final float v1, final float v2)`
- Role: Performs gl uniform3f.
- Description: Supports the gl uniform3f operation used by the surrounding class.

#### `public void glUniform3fv(final ID location, final int count, final float[] val)`
- Role: Performs gl uniform3fv.
- Description: Supports the gl uniform3fv operation used by the surrounding class.

#### `public void glUniform4f(final ID location, final float v0, final float v1, final float v2, final float v3)`
- Role: Performs gl uniform4f.
- Description: Supports the gl uniform4f operation used by the surrounding class.

#### `public void glUniform4fv(final ID location, final int count, final float[] val)`
- Role: Performs gl uniform4fv.
- Description: Supports the gl uniform4fv operation used by the surrounding class.

#### `public void glUniform1i(final ID location, final int v0)`
- Role: Performs gl uniform1i.
- Description: Supports the gl uniform1i operation used by the surrounding class.

#### `public void glUniform2i(final ID location, final int v0, final int v1)`
- Role: Performs gl uniform2i.
- Description: Supports the gl uniform2i operation used by the surrounding class.

#### `public void glUniform3i(final ID location, final int v0, final int v1, final int v2)`
- Role: Performs gl uniform3i.
- Description: Supports the gl uniform3i operation used by the surrounding class.

#### `public void glUniform4i(final ID location, final int v0, final int v1, final int v2, final int v3)`
- Role: Performs gl uniform4i.
- Description: Supports the gl uniform4i operation used by the surrounding class.

#### `public void glUniformMatrix3fv(final ID location, final int count, final boolean transpose, final float[] value)`
- Role: Performs gl uniform matrix3fv.
- Description: Supports the gl uniform matrix3fv operation used by the surrounding class.

#### `public void glUniformMatrix4fv(final ID location, final int count, final boolean transpose, final float[] value)`
- Role: Performs gl uniform matrix4fv.
- Description: Supports the gl uniform matrix4fv operation used by the surrounding class.

#### `public void glUseProgram(final ID program)`
- Role: Performs gl use program.
- Description: Supports the gl use program operation used by the surrounding class.

#### `public void glVertexAttribDivisor(final ID location, final int divisor)`
- Role: Performs gl vertex attrib divisor.
- Description: Supports the gl vertex attrib divisor operation used by the surrounding class.

#### `public void glVertexAttribDivisor(final ID location, final int offset, final int divisor)`
- Role: Performs gl vertex attrib divisor.
- Description: Supports the gl vertex attrib divisor operation used by the surrounding class.

#### `public void glVertexAttribPointer(final ID location, final int size, final int type, final boolean normalized, final int stride, final long pointer)`
- Role: Performs gl vertex attrib pointer.
- Description: Supports the gl vertex attrib pointer operation used by the surrounding class.

#### `public void glVertexAttribPointer(final ID location, final int offset, final int size, final int type, final boolean normalized, final int stride, final long pointer)`
- Role: Performs gl vertex attrib pointer.
- Description: Supports the gl vertex attrib pointer operation used by the surrounding class.

#### `public void glVertexAttribIPointer(final ID location, final int size, final int type, final int stride, final long pointer)`
- Role: Performs gl vertex attrib ipointer.
- Description: Supports the gl vertex attrib ipointer operation used by the surrounding class.

#### `public void glVertexAttribIPointer(final ID location, final int offset, final int size, final int type, final int stride, final long pointer)`
- Role: Performs gl vertex attrib ipointer.
- Description: Supports the gl vertex attrib ipointer operation used by the surrounding class.

#### `public void glViewport(final int x, final int y, final int w, final int h)`
- Role: Performs gl viewport.
- Description: Supports the gl viewport operation used by the surrounding class.

#### `public DebugMessage(int source, int type, int severity, int id, String text)`
- Role: Performs debug message.
- Description: Supports the debug message operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public void glDebugMessageControl(final int source, final int type, final int severity, final int[] ids, final boolean enabled)`
- Role: Performs gl debug message control.
- Description: Supports the gl debug message control operation used by the surrounding class.

#### `public void bglGetDebugMessageLog(final Consumer<DebugMessage> cb)`
- Role: Performs bgl get debug message log.
- Description: Supports the bgl get debug message log operation used by the surrounding class.

#### `public Dummy(int id, Object o)`
- Role: Performs dummy.
- Description: Supports the dummy operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public InfoDummy(int id, Object o, String info)`
- Role: Performs info dummy.
- Description: Supports the info dummy operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public PopDummy(int id, Object o, Dump d)`
- Role: Performs pop dummy.
- Description: Supports the pop dummy operation used by the surrounding class.

#### `private Dummy intern(Object o)`
- Role: Performs intern.
- Description: Supports the intern operation used by the surrounding class.

#### `private Object mapval(Object o)`
- Role: Performs mapval.
- Description: Supports the mapval operation used by the surrounding class.

#### `public DCmd(Dump d, Object o)`
- Role: Performs dcmd.
- Description: Supports the dcmd operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Dump(BGL buf, Command mark)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public void dump(PrintStream out)`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.

#### `public void dump()`
- Role: Performs dump.
- Description: Supports the dump operation used by the surrounding class.
