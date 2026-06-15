# GL

This file documents the responsibilities and members of `GL`.

## Meta

- Source: [GL.java](../../../../../src/haven/render/gl/GL.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents GL capability access.

## Members

### Constants

#### `public static final int GL_ALIASED_LINE_WIDTH_RANGE = com.jogamp.opengl.GL3.GL_ALIASED_LINE_WIDTH_RANGE`

- Description: TODO

#### `public static final int GL_ARRAY_BUFFER = com.jogamp.opengl.GL3.GL_ARRAY_BUFFER`

- Description: TODO

#### `public static final int GL_BACK = com.jogamp.opengl.GL.GL_BACK`

- Description: TODO

#### `public static final int GL_BLEND = com.jogamp.opengl.GL.GL_BLEND`

- Description: TODO

#### `public static final int GL_BUFFER = com.jogamp.opengl.GL3.GL_BUFFER`

- Description: TODO

#### `public static final int GL_COLOR_ATTACHMENT0 = com.jogamp.opengl.GL.GL_COLOR_ATTACHMENT0`

- Description: TODO

#### `public static final int GL_COLOR_BUFFER_BIT = com.jogamp.opengl.GL3.GL_COLOR_BUFFER_BIT`

- Description: TODO

#### `public static final int GL_COMPILE_STATUS = com.jogamp.opengl.GL3.GL_COMPILE_STATUS`

- Description: TODO

#### `public static final int GL_CONSTANT_ALPHA = com.jogamp.opengl.GL3.GL_CONSTANT_ALPHA`

- Description: TODO

#### `public static final int GL_CONSTANT_COLOR = com.jogamp.opengl.GL3.GL_CONSTANT_COLOR`

- Description: TODO

#### `public static final int GL_CONTEXT_FLAGS = com.jogamp.opengl.GL3.GL_CONTEXT_FLAGS`

- Description: TODO

#### `public static final int GL_CONTEXT_PROFILE_MASK = com.jogamp.opengl.GL3.GL_CONTEXT_PROFILE_MASK`

- Description: TODO

#### `public static final int GL_CONTEXT_CORE_PROFILE_BIT = com.jogamp.opengl.GL3.GL_CONTEXT_CORE_PROFILE_BIT`

- Description: TODO

#### `public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = com.jogamp.opengl.GL3.GL_CONTEXT_COMPATIBILITY_PROFILE_BIT`

- Description: TODO

#### `public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = com.jogamp.opengl.GL3.GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH`

- Description: TODO

#### `public static final int GL_DEBUG_OUTPUT = com.jogamp.opengl.GL3.GL_DEBUG_OUTPUT`

- Description: TODO

#### `public static final int GL_DEPTH_ATTACHMENT = com.jogamp.opengl.GL.GL_DEPTH_ATTACHMENT`

- Description: TODO

#### `public static final int GL_DEPTH_BUFFER_BIT = com.jogamp.opengl.GL3.GL_DEPTH_BUFFER_BIT`

- Description: TODO

#### `public static final int GL_DONT_CARE = com.jogamp.opengl.GL3.GL_DONT_CARE`

- Description: TODO

#### `public static final int GL_DST_ALPHA = com.jogamp.opengl.GL.GL_DST_ALPHA`

- Description: TODO

#### `public static final int GL_DST_COLOR = com.jogamp.opengl.GL.GL_DST_COLOR`

- Description: TODO

#### `public static final int GL_DYNAMIC_DRAW = com.jogamp.opengl.GL3.GL_DYNAMIC_DRAW`

- Description: TODO

#### `public static final int GL_ELEMENT_ARRAY_BUFFER = com.jogamp.opengl.GL3.GL_ELEMENT_ARRAY_BUFFER`

- Description: TODO

#### `public static final int GL_EXTENSIONS = com.jogamp.opengl.GL3.GL_EXTENSIONS`

- Description: TODO

#### `public static final int GL_FRAGMENT_SHADER = com.jogamp.opengl.GL3.GL_FRAGMENT_SHADER`

- Description: TODO

#### `public static final int GL_FRAMEBUFFER = com.jogamp.opengl.GL.GL_FRAMEBUFFER`

- Description: TODO

#### `public static final int GL_FRAMEBUFFER_COMPLETE = com.jogamp.opengl.GL.GL_FRAMEBUFFER_COMPLETE`

- Description: TODO

#### `public static final int GL_FUNC_ADD = com.jogamp.opengl.GL.GL_FUNC_ADD`

- Description: TODO

#### `public static final int GL_FUNC_REVERSE_SUBTRACT = com.jogamp.opengl.GL.GL_FUNC_REVERSE_SUBTRACT`

- Description: TODO

#### `public static final int GL_FUNC_SUBTRACT = com.jogamp.opengl.GL.GL_FUNC_SUBTRACT`

- Description: TODO

#### `public static final int GL_INFO_LOG_LENGTH = com.jogamp.opengl.GL3.GL_INFO_LOG_LENGTH`

- Description: TODO

#### `public static final int GL_INVALID_ENUM = com.jogamp.opengl.GL.GL_INVALID_ENUM`

- Description: TODO

#### `public static final int GL_INVALID_VALUE = com.jogamp.opengl.GL.GL_INVALID_VALUE`

- Description: TODO

#### `public static final int GL_INVALID_OPERATION = com.jogamp.opengl.GL.GL_INVALID_OPERATION`

- Description: TODO

#### `public static final int GL_LINK_STATUS = com.jogamp.opengl.GL3.GL_LINK_STATUS`

- Description: TODO

#### `public static final int GL_MAJOR_VERSION = com.jogamp.opengl.GL3.GL_MAJOR_VERSION`

- Description: TODO

#### `public static final int GL_MAX = com.jogamp.opengl.GL3.GL_MAX`

- Description: TODO

#### `public static final int GL_MAX_COLOR_ATTACHMENTS = com.jogamp.opengl.GL3.GL_MAX_COLOR_ATTACHMENTS`

- Description: TODO

#### `public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = com.jogamp.opengl.GL3.GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT`

- Description: TODO

#### `public static final int GL_MIN = com.jogamp.opengl.GL3.GL_MIN`

- Description: TODO

#### `public static final int GL_MINOR_VERSION = com.jogamp.opengl.GL3.GL_MINOR_VERSION`

- Description: TODO

#### `public static final int GL_NONE = com.jogamp.opengl.GL.GL_NONE`

- Description: TODO

#### `public static final int GL_NUM_EXTENSIONS = com.jogamp.opengl.GL3.GL_NUM_EXTENSIONS`

- Description: TODO

#### `public static final int GL_ONE = com.jogamp.opengl.GL.GL_ONE`

- Description: TODO

#### `public static final int GL_ONE_MINUS_CONSTANT_ALPHA = com.jogamp.opengl.GL3.GL_ONE_MINUS_CONSTANT_ALPHA`

- Description: TODO

#### `public static final int GL_ONE_MINUS_CONSTANT_COLOR = com.jogamp.opengl.GL3.GL_ONE_MINUS_CONSTANT_COLOR`

- Description: TODO

#### `public static final int GL_ONE_MINUS_DST_ALPHA = com.jogamp.opengl.GL.GL_ONE_MINUS_DST_ALPHA`

- Description: TODO

#### `public static final int GL_ONE_MINUS_DST_COLOR = com.jogamp.opengl.GL.GL_ONE_MINUS_DST_COLOR`

- Description: TODO

#### `public static final int GL_ONE_MINUS_SRC_ALPHA = com.jogamp.opengl.GL.GL_ONE_MINUS_SRC_ALPHA`

- Description: TODO

#### `public static final int GL_ONE_MINUS_SRC_COLOR = com.jogamp.opengl.GL.GL_ONE_MINUS_SRC_COLOR`

- Description: TODO

#### `public static final int GL_OUT_OF_MEMORY = com.jogamp.opengl.GL.GL_OUT_OF_MEMORY`

- Description: TODO

#### `public static final int GL_PACK_ALIGNMENT = com.jogamp.opengl.GL3.GL_PACK_ALIGNMENT`

- Description: TODO

#### `public static final int GL_PIXEL_PACK_BUFFER = com.jogamp.opengl.GL3.GL_PIXEL_PACK_BUFFER`

- Description: TODO

#### `public static final int GL_PROGRAM_POINT_SIZE = com.jogamp.opengl.GL3.GL_PROGRAM_POINT_SIZE`

- Description: TODO

#### `public static final int GL_QUERY_RESULT = com.jogamp.opengl.GL3.GL_QUERY_RESULT`

- Description: TODO

#### `public static final int GL_QUERY_RESULT_AVAILABLE = com.jogamp.opengl.GL3.GL_QUERY_RESULT_AVAILABLE`

- Description: TODO

#### `public static final int GL_RENDERER = com.jogamp.opengl.GL3.GL_RENDERER`

- Description: TODO

#### `public static final int GL_SHADING_LANGUAGE_VERSION = com.jogamp.opengl.GL3.GL_SHADING_LANGUAGE_VERSION`

- Description: TODO

#### `public static final int GL_SIGNALED = com.jogamp.opengl.GL3.GL_SIGNALED`

- Description: TODO

#### `public static final int GL_SRC_ALPHA = com.jogamp.opengl.GL.GL_SRC_ALPHA`

- Description: TODO

#### `public static final int GL_SRC_COLOR = com.jogamp.opengl.GL.GL_SRC_COLOR`

- Description: TODO

#### `public static final int GL_STATIC_DRAW = com.jogamp.opengl.GL3.GL_STATIC_DRAW`

- Description: TODO

#### `public static final int GL_STREAM_DRAW = com.jogamp.opengl.GL3.GL_STREAM_DRAW`

- Description: TODO

#### `public static final int GL_STREAM_READ = com.jogamp.opengl.GL3.GL_STREAM_READ`

- Description: TODO

#### `public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = com.jogamp.opengl.GL3.GL_SYNC_GPU_COMMANDS_COMPLETE`

- Description: TODO

#### `public static final int GL_SYNC_STATUS = com.jogamp.opengl.GL3.GL_SYNC_STATUS`

- Description: TODO

#### `public static final int GL_TEXTURE = com.jogamp.opengl.GL3.GL_TEXTURE`

- Description: TODO

#### `public static final int GL_TEXTURE0 = com.jogamp.opengl.GL.GL_TEXTURE0`

- Description: TODO

#### `public static final int GL_TEXTURE_1D = com.jogamp.opengl.GL3.GL_TEXTURE_1D`

- Description: TODO

#### `public static final int GL_TEXTURE_1D_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_1D_ARRAY`

- Description: TODO

#### `public static final int GL_TEXTURE_2D = com.jogamp.opengl.GL.GL_TEXTURE_2D`

- Description: TODO

#### `public static final int GL_TEXTURE_2D_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_2D_ARRAY`

- Description: TODO

#### `public static final int GL_TEXTURE_2D_MULTISAMPLE = com.jogamp.opengl.GL3.GL_TEXTURE_2D_MULTISAMPLE`

- Description: TODO

#### `public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_2D_MULTISAMPLE_ARRAY`

- Description: TODO

#### `public static final int GL_TEXTURE_3D = com.jogamp.opengl.GL3.GL_TEXTURE_3D`

- Description: TODO

#### `public static final int GL_TEXTURE_BORDER_COLOR = com.jogamp.opengl.GL3.GL_TEXTURE_BORDER_COLOR`

- Description: TODO

#### `public static final int GL_TEXTURE_CUBE_MAP = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP`

- Description: TODO

#### `public static final int GL_TEXTURE_CUBE_MAP_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_ARRAY`

- Description: TODO

#### `public static final int GL_TEXTURE_MIN_FILTER = com.jogamp.opengl.GL3.GL_TEXTURE_MIN_FILTER`

- Description: TODO

#### `public static final int GL_TEXTURE_MAG_FILTER = com.jogamp.opengl.GL3.GL_TEXTURE_MAG_FILTER`

- Description: TODO

#### `public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = com.jogamp.opengl.GL3.GL_TEXTURE_MAX_ANISOTROPY_EXT`

- Description: TODO

#### `public static final int GL_TEXTURE_WRAP_S = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_S`

- Description: TODO

#### `public static final int GL_TEXTURE_WRAP_T = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_T`

- Description: TODO

#### `public static final int GL_TEXTURE_WRAP_R = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_R`

- Description: TODO

#### `public static final int GL_TIMESTAMP = com.jogamp.opengl.GL3.GL_TIMESTAMP`

- Description: TODO

#### `public static final int GL_VENDOR = com.jogamp.opengl.GL3.GL_VENDOR`

- Description: TODO

#### `public static final int GL_VERSION = com.jogamp.opengl.GL3.GL_VERSION`

- Description: TODO

#### `public static final int GL_VERTEX_ARRAY = com.jogamp.opengl.GL2.GL_VERTEX_ARRAY`

- Description: TODO

#### `public static final int GL_VERTEX_SHADER = com.jogamp.opengl.GL3.GL_VERTEX_SHADER`

- Description: TODO

#### `public static final int GL_ZERO = com.jogamp.opengl.GL.GL_ZERO`

- Description: TODO

#### `public static final int GL_NEAREST = com.jogamp.opengl.GL.GL_NEAREST`

- Description: TODO

#### `public static final int GL_LINEAR = com.jogamp.opengl.GL.GL_LINEAR`

- Description: TODO

#### `public static final int GL_NEAREST_MIPMAP_NEAREST = com.jogamp.opengl.GL.GL_NEAREST_MIPMAP_NEAREST`

- Description: TODO

#### `public static final int GL_NEAREST_MIPMAP_LINEAR = com.jogamp.opengl.GL.GL_NEAREST_MIPMAP_LINEAR`

- Description: TODO

#### `public static final int GL_LINEAR_MIPMAP_NEAREST = com.jogamp.opengl.GL.GL_LINEAR_MIPMAP_NEAREST`

- Description: TODO

#### `public static final int GL_LINEAR_MIPMAP_LINEAR = com.jogamp.opengl.GL.GL_LINEAR_MIPMAP_LINEAR`

- Description: TODO

#### `public static final int GL_REPEAT = com.jogamp.opengl.GL.GL_REPEAT`

- Description: TODO

#### `public static final int GL_MIRRORED_REPEAT = com.jogamp.opengl.GL.GL_MIRRORED_REPEAT`

- Description: TODO

#### `public static final int GL_CLAMP_TO_EDGE = com.jogamp.opengl.GL.GL_CLAMP_TO_EDGE`

- Description: TODO

#### `public static final int GL_CLAMP_TO_BORDER = com.jogamp.opengl.GL3.GL_CLAMP_TO_BORDER`

- Description: TODO

#### `public static final int GL_R8 = com.jogamp.opengl.GL3.GL_R8`

- Description: TODO

#### `public static final int GL_R8_SNORM = com.jogamp.opengl.GL3.GL_R8_SNORM`

- Description: TODO

#### `public static final int GL_R16 = com.jogamp.opengl.GL3.GL_R16`

- Description: TODO

#### `public static final int GL_R16_SNORM = com.jogamp.opengl.GL3.GL_R16_SNORM`

- Description: TODO

#### `public static final int GL_R16F = com.jogamp.opengl.GL3.GL_R16F`

- Description: TODO

#### `public static final int GL_R32F = com.jogamp.opengl.GL3.GL_R32F`

- Description: TODO

#### `public static final int GL_R8I = com.jogamp.opengl.GL3.GL_R8I`

- Description: TODO

#### `public static final int GL_R8UI = com.jogamp.opengl.GL3.GL_R8UI`

- Description: TODO

#### `public static final int GL_R16I = com.jogamp.opengl.GL3.GL_R16I`

- Description: TODO

#### `public static final int GL_R16UI = com.jogamp.opengl.GL3.GL_R16UI`

- Description: TODO

#### `public static final int GL_R32I = com.jogamp.opengl.GL3.GL_R32I`

- Description: TODO

#### `public static final int GL_R32UI = com.jogamp.opengl.GL3.GL_R32UI`

- Description: TODO

#### `public static final int GL_DEPTH_COMPONENT = com.jogamp.opengl.GL3.GL_DEPTH_COMPONENT`

- Description: TODO

#### `public static final int GL_RG8 = com.jogamp.opengl.GL3.GL_RG8`

- Description: TODO

#### `public static final int GL_RG8_SNORM = com.jogamp.opengl.GL3.GL_RG8_SNORM`

- Description: TODO

#### `public static final int GL_RG16 = com.jogamp.opengl.GL3.GL_RG16`

- Description: TODO

#### `public static final int GL_RG16_SNORM = com.jogamp.opengl.GL3.GL_RG16_SNORM`

- Description: TODO

#### `public static final int GL_RG8I = com.jogamp.opengl.GL3.GL_RG8I`

- Description: TODO

#### `public static final int GL_RG8UI = com.jogamp.opengl.GL3.GL_RG8UI`

- Description: TODO

#### `public static final int GL_RG16I = com.jogamp.opengl.GL3.GL_RG16I`

- Description: TODO

#### `public static final int GL_RG16UI = com.jogamp.opengl.GL3.GL_RG16UI`

- Description: TODO

#### `public static final int GL_RG16F = com.jogamp.opengl.GL3.GL_RG16F`

- Description: TODO

#### `public static final int GL_RG32F = com.jogamp.opengl.GL3.GL_RG32F`

- Description: TODO

#### `public static final int GL_RG32I = com.jogamp.opengl.GL3.GL_RG32I`

- Description: TODO

#### `public static final int GL_RG32UI = com.jogamp.opengl.GL3.GL_RG32UI`

- Description: TODO

#### `public static final int GL_RGB8 = com.jogamp.opengl.GL3.GL_RGB8`

- Description: TODO

#### `public static final int GL_RGB8_SNORM = com.jogamp.opengl.GL3.GL_RGB8_SNORM`

- Description: TODO

#### `public static final int GL_RGB16 = com.jogamp.opengl.GL3.GL_RGB16`

- Description: TODO

#### `public static final int GL_RGB16_SNORM = com.jogamp.opengl.GL3.GL_RGB16_SNORM`

- Description: TODO

#### `public static final int GL_RGB8I = com.jogamp.opengl.GL3.GL_RGB8I`

- Description: TODO

#### `public static final int GL_RGB8UI = com.jogamp.opengl.GL3.GL_RGB8UI`

- Description: TODO

#### `public static final int GL_RGB16I = com.jogamp.opengl.GL3.GL_RGB16I`

- Description: TODO

#### `public static final int GL_RGB16UI = com.jogamp.opengl.GL3.GL_RGB16UI`

- Description: TODO

#### `public static final int GL_RGB32I = com.jogamp.opengl.GL3.GL_RGB32I`

- Description: TODO

#### `public static final int GL_RGB32UI = com.jogamp.opengl.GL3.GL_RGB32UI`

- Description: TODO

#### `public static final int GL_RGB16F = com.jogamp.opengl.GL3.GL_RGB16F`

- Description: TODO

#### `public static final int GL_RGB32F = com.jogamp.opengl.GL3.GL_RGB32F`

- Description: TODO

#### `public static final int GL_RGBA8 = com.jogamp.opengl.GL3.GL_RGBA8`

- Description: TODO

#### `public static final int GL_RGBA8_SNORM = com.jogamp.opengl.GL3.GL_RGBA8_SNORM`

- Description: TODO

#### `public static final int GL_RGBA16 = com.jogamp.opengl.GL3.GL_RGBA16`

- Description: TODO

#### `public static final int GL_RGBA16_SNORM = com.jogamp.opengl.GL3.GL_RGBA16_SNORM`

- Description: TODO

#### `public static final int GL_RGBA8I = com.jogamp.opengl.GL3.GL_RGBA8I`

- Description: TODO

#### `public static final int GL_RGBA8UI = com.jogamp.opengl.GL3.GL_RGBA8UI`

- Description: TODO

#### `public static final int GL_RGBA16I = com.jogamp.opengl.GL3.GL_RGBA16I`

- Description: TODO

#### `public static final int GL_RGBA16UI = com.jogamp.opengl.GL3.GL_RGBA16UI`

- Description: TODO

#### `public static final int GL_RGBA32I = com.jogamp.opengl.GL3.GL_RGBA32I`

- Description: TODO

#### `public static final int GL_RGBA32UI = com.jogamp.opengl.GL3.GL_RGBA32UI`

- Description: TODO

#### `public static final int GL_RGBA16F = com.jogamp.opengl.GL3.GL_RGBA16F`

- Description: TODO

#### `public static final int GL_RGBA32F = com.jogamp.opengl.GL3.GL_RGBA32F`

- Description: TODO

#### `public static final int GL_SRGB8 = com.jogamp.opengl.GL3.GL_SRGB8`

- Description: TODO

#### `public static final int GL_SRGB8_ALPHA8 = com.jogamp.opengl.GL3.GL_SRGB8_ALPHA8`

- Description: TODO

#### `public static final int GL_RED = com.jogamp.opengl.GL3.GL_RED`

- Description: TODO

#### `public static final int GL_RG = com.jogamp.opengl.GL3.GL_RG`

- Description: TODO

#### `public static final int GL_RGB = com.jogamp.opengl.GL3.GL_RGB`

- Description: TODO

#### `public static final int GL_RGBA = com.jogamp.opengl.GL3.GL_RGBA`

- Description: TODO

#### `public static final int GL_RED_INTEGER = com.jogamp.opengl.GL3.GL_RED_INTEGER`

- Description: TODO

#### `public static final int GL_RG_INTEGER = com.jogamp.opengl.GL3.GL_RG_INTEGER`

- Description: TODO

#### `public static final int GL_RGB_INTEGER = com.jogamp.opengl.GL3.GL_RGB_INTEGER`

- Description: TODO

#### `public static final int GL_RGBA_INTEGER = com.jogamp.opengl.GL3.GL_RGBA_INTEGER`

- Description: TODO

#### `public static final int GL_BGR = com.jogamp.opengl.GL3.GL_BGR`

- Description: TODO

#### `public static final int GL_BGRA = com.jogamp.opengl.GL3.GL_BGRA`

- Description: TODO

#### `public static final int GL_BYTE = com.jogamp.opengl.GL3.GL_BYTE`

- Description: TODO

#### `public static final int GL_SHORT = com.jogamp.opengl.GL3.GL_SHORT`

- Description: TODO

#### `public static final int GL_INT = com.jogamp.opengl.GL3.GL_INT`

- Description: TODO

#### `public static final int GL_UNSIGNED_BYTE = com.jogamp.opengl.GL3.GL_UNSIGNED_BYTE`

- Description: TODO

#### `public static final int GL_UNSIGNED_SHORT = com.jogamp.opengl.GL3.GL_UNSIGNED_SHORT`

- Description: TODO

#### `public static final int GL_UNSIGNED_INT = com.jogamp.opengl.GL3.GL_UNSIGNED_INT`

- Description: TODO

#### `public static final int GL_FLOAT = com.jogamp.opengl.GL3.GL_FLOAT`

- Description: TODO

#### `public static final int GL_HALF_FLOAT = com.jogamp.opengl.GL3.GL_HALF_FLOAT`

- Description: TODO

#### `public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_X`

- Description: TODO

#### `public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_Y`

- Description: TODO

#### `public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_Z`

- Description: TODO

#### `public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_X`

- Description: TODO

#### `public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`

- Description: TODO

#### `public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`

- Description: TODO

#### `public static final int GL_SCISSOR_TEST = com.jogamp.opengl.GL3.GL_SCISSOR_TEST`

- Description: TODO

#### `public static final int GL_FRONT = com.jogamp.opengl.GL3.GL_FRONT`

- Description: TODO

#### `public static final int GL_FRONT_AND_BACK = com.jogamp.opengl.GL3.GL_FRONT_AND_BACK`

- Description: TODO

#### `public static final int GL_CULL_FACE = com.jogamp.opengl.GL3.GL_CULL_FACE`

- Description: TODO

#### `public static final int GL_NEVER = com.jogamp.opengl.GL3.GL_NEVER`

- Description: TODO

#### `public static final int GL_ALWAYS = com.jogamp.opengl.GL3.GL_ALWAYS`

- Description: TODO

#### `public static final int GL_EQUAL = com.jogamp.opengl.GL3.GL_EQUAL`

- Description: TODO

#### `public static final int GL_NOTEQUAL = com.jogamp.opengl.GL3.GL_NOTEQUAL`

- Description: TODO

#### `public static final int GL_LESS = com.jogamp.opengl.GL3.GL_LESS`

- Description: TODO

#### `public static final int GL_LEQUAL = com.jogamp.opengl.GL3.GL_LEQUAL`

- Description: TODO

#### `public static final int GL_GREATER = com.jogamp.opengl.GL3.GL_GREATER`

- Description: TODO

#### `public static final int GL_GEQUAL = com.jogamp.opengl.GL3.GL_GEQUAL`

- Description: TODO

#### `public static final int GL_DEPTH_TEST = com.jogamp.opengl.GL3.GL_DEPTH_TEST`

- Description: TODO

#### `public static final int GL_POLYGON_OFFSET_FILL = com.jogamp.opengl.GL3.GL_POLYGON_OFFSET_FILL`

- Description: TODO

#### `public static final int GL_POINTS = com.jogamp.opengl.GL3.GL_POINTS`

- Description: TODO

#### `public static final int GL_LINES = com.jogamp.opengl.GL3.GL_LINES`

- Description: TODO

#### `public static final int GL_LINE_STRIP = com.jogamp.opengl.GL3.GL_LINE_STRIP`

- Description: TODO

#### `public static final int GL_TRIANGLES = com.jogamp.opengl.GL3.GL_TRIANGLES`

- Description: TODO

#### `public static final int GL_TRIANGLE_STRIP = com.jogamp.opengl.GL3.GL_TRIANGLE_STRIP`

- Description: TODO

#### `public static final int GL_TRIANGLE_FAN = com.jogamp.opengl.GL3.GL_TRIANGLE_FAN`

- Description: TODO

### Fields

### Methods

#### `public void glActiveTexture(int texture)`

- Description: TODO

#### `public void glAttachShader(int program, int shader)`

- Description: TODO

#### `public void glBindAttribLocation(int program, int index, String name)`

- Description: TODO

#### `public void glBindBuffer(int target, int buffer)`

- Description: TODO

#### `public void glBindFragDataLocation(int program, int colornumber, String name)`

- Description: TODO

#### `public void glBindFramebuffer(int target, int buffer)`

- Description: TODO

#### `public void glBindRenderbuffer(int target, int buffer)`

- Description: TODO

#### `public void glBindTexture(int target, int texture)`

- Description: TODO

#### `public void glBindVertexArray(int array)`

- Description: TODO

#### `public void glBlendColor(float red, float green, float blue, float alpha)`

- Description: TODO

#### `public void glBlendEquation(int mode)`

- Description: TODO

#### `public void glBlendEquationSeparate(int cmode, int amode)`

- Description: TODO

#### `public void glBlendFunc(int sfac, int dfac)`

- Description: TODO

#### `public void glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)`

- Description: TODO

#### `public void glBufferData(int target, long size, ByteBuffer data, int usage)`

- Description: TODO

#### `public void glBufferSubData(int target, long offset, long size, ByteBuffer data)`

- Description: TODO

#### `public int glCheckFramebufferStatus(int target)`

- Description: TODO

#### `public void glClear(int mask)`

- Description: TODO

#### `public void glClearBufferfv(int buffer, int drawbuffer, float[] value)`

- Description: TODO

#### `public void glClearBufferiv(int buffer, int drawbuffer, int[] value)`

- Description: TODO

#### `public void glClearBufferuiv(int buffer, int drawbuffer, int[] value)`

- Description: TODO

#### `public void glClearColor(float r, float g, float b, float a)`

- Description: TODO

#### `public void glClearDepth(double d)`

- Description: TODO

#### `public void glColorMask(boolean r, boolean g, boolean b, boolean a)`

- Description: TODO

#### `public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)`

- Description: TODO

#### `public void glCompileShader(int shader)`

- Description: TODO

#### `public int glCreateProgram()`

- Description: TODO

#### `public int glCreateShader(int type)`

- Description: TODO

#### `public void glDeleteBuffers(int count, int[] buffers)`

- Description: TODO

#### `public void glDeleteFramebuffers(int count, int[] buffers)`

- Description: TODO

#### `public void glDeleteShader(int id)`

- Description: TODO

#### `public void glDeleteProgram(int id)`

- Description: TODO

#### `public void glDeleteQueries(int count, int[] buffer)`

- Description: TODO

#### `public void glDeleteRenderbuffers(int count, int[] buffers)`

- Description: TODO

#### `public void glDeleteSync(long id)`

- Description: TODO

#### `public void glDeleteTextures(int count, int[] buffers)`

- Description: TODO

#### `public void glDeleteVertexArrays(int count, int[] buffers)`

- Description: TODO

#### `public void glCullFace(int mode)`

- Description: TODO

#### `public void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)`

- Description: TODO

#### `public void glDepthFunc(int func)`

- Description: TODO

#### `public void glDepthMask(boolean mask)`

- Description: TODO

#### `public void glDisable(int cap)`

- Description: TODO

#### `public void glDisablei(int cap, int index)`

- Description: TODO

#### `public void glDisableVertexAttribArray(int location)`

- Description: TODO

#### `public void glDrawBuffer(int buf)`

- Description: TODO

#### `public void glDrawBuffers(int n, int[] bufs)`

- Description: TODO

#### `public void glDrawArraysInstanced(int mode, int first, int count, int primcount)`

- Description: TODO

#### `public void glDrawArrays(int mode, int first, int count)`

- Description: TODO

#### `public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)`

- Description: TODO

#### `public void glDrawElements(int mode, int count, int type, long indices)`

- Description: TODO

#### `public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)`

- Description: TODO

#### `public void glEnable(int cap)`

- Description: TODO

#### `public void glEnablei(int cap, int index)`

- Description: TODO

#### `public void glEnableVertexAttribArray(int location)`

- Description: TODO

#### `public long glFenceSync(int condition, int flags)`

- Description: TODO

#### `public void glFinish()`

- Description: TODO

#### `public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)`

- Description: TODO

#### `public void glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)`

- Description: TODO

#### `public void glGenBuffers(int n, int[] buffer)`

- Description: TODO

#### `public void glGenFramebuffers(int n, int[] buffer)`

- Description: TODO

#### `public void glGenQueries(int n, int[] buffer)`

- Description: TODO

#### `public void glGenTextures(int n, int[] buffer)`

- Description: TODO

#### `public void glGenVertexArrays(int n, int[] buffer)`

- Description: TODO

#### `public void glGetBufferSubData(int target, int offset, int size, ByteBuffer data)`

- Description: TODO

#### `public int glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)`

- Description: TODO

#### `public int glGetError()`

- Description: TODO

#### `public void glGetFloatv(int pname, float[] data)`

- Description: TODO

#### `public void glGetIntegerv(int pname, int[] data)`

- Description: TODO

#### `public String glGetString(int name)`

- Description: TODO

#### `public String glGetStringi(int name, int index)`

- Description: TODO

#### `public void glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`

- Description: TODO

#### `public void glGetProgramiv(int shader, int pname, int[] buf)`

- Description: TODO

#### `public void glGetQueryObjectiv(int id, int pname, int[] params)`

- Description: TODO

#### `public void glGetQueryObjecti64v(int id, int pname, long[] params)`

- Description: TODO

#### `public void glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`

- Description: TODO

#### `public void glGetShaderiv(int shader, int pname, int[] buf)`

- Description: TODO

#### `public void glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)`

- Description: TODO

#### `public void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)`

- Description: TODO

#### `public void glGetTexImage(int target, int level, int format, int type, long offset)`

- Description: TODO

#### `public int glGetUniformLocation(int program, String name)`

- Description: TODO

#### `public void glLineWidth(float w)`

- Description: TODO

#### `public void glLinkProgram(int program)`

- Description: TODO

#### `public void glObjectLabel(int identifier, int name, int length, byte[] label)`

- Description: TODO

#### `public void glPixelStorei(int pname, int param)`

- Description: TODO

#### `public void glPointSize(float size)`

- Description: TODO

#### `public void glPolygonMode(int face, int mode)`

- Description: TODO

#### `public void glPolygonOffset(float factor, float units)`

- Description: TODO

#### `public void glQueryCounter(int id, int target)`

- Description: TODO

#### `public void glReadBuffer(int buf)`

- Description: TODO

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset)`

- Description: TODO

#### `public void glRenderbufferStorage(int target, int format, int width, int height)`

- Description: TODO

#### `public void glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)`

- Description: TODO

#### `public void glSampleCoverage(float value, boolean invert)`

- Description: TODO

#### `public void glScissor(int x, int y, int w, int h)`

- Description: TODO

#### `public void glShaderSource(int shader, int count, String[] string, int[] lengths)`

- Description: TODO

#### `public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)`

- Description: TODO

#### `public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)`

- Description: TODO

#### `public void glTexParameterf(int target, int pname, float param)`

- Description: TODO

#### `public void glTexParameterfv(int target, int pname, float[] param)`

- Description: TODO

#### `public void glTexParameteri(int target, int pname, int param)`

- Description: TODO

#### `public void glUniform1f(int location, float v0)`

- Description: TODO

#### `public void glUniform2f(int location, float v0, float v1)`

- Description: TODO

#### `public void glUniform3f(int location, float v0, float v1, float v2)`

- Description: TODO

#### `public void glUniform3fv(int location, int count, float[] val)`

- Description: TODO

#### `public void glUniform4f(int location, float v0, float v1, float v2, float v3)`

- Description: TODO

#### `public void glUniform4fv(int location, int count, float[] val)`

- Description: TODO

#### `public void glUniform1i(int location, int v0)`

- Description: TODO

#### `public void glUniform2i(int location, int v0, int v1)`

- Description: TODO

#### `public void glUniform3i(int location, int v0, int v1, int v2)`

- Description: TODO

#### `public void glUniform4i(int location, int v0, int v1, int v2, int v3)`

- Description: TODO

#### `public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)`

- Description: TODO

#### `public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)`

- Description: TODO

#### `public void glUseProgram(int program)`

- Description: TODO

#### `public void glVertexAttribDivisor(int location, int divisor)`

- Description: TODO

#### `public void glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)`

- Description: TODO

#### `public void glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)`

- Description: TODO

#### `public void glViewport(int x, int y, int w, int h)`

- Description: TODO

#### `public default void xlateexc(RuntimeException exc)`

- Description: TODO
