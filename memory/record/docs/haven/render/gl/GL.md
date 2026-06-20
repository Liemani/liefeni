---
source: [GL.java](../../../../../src/haven/render/gl/GL.java)
created: 2026-06-13
updated: 2026-06-14
---

# GL

Provides GL backend support for gl.

## Members

### Constants

#### `public static final int GL_ALIASED_LINE_WIDTH_RANGE = com.jogamp.opengl.GL3.GL_ALIASED_LINE_WIDTH_RANGE`
- Role: Defines the shared gl aliased line width range constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ARRAY_BUFFER = com.jogamp.opengl.GL3.GL_ARRAY_BUFFER`
- Role: Defines the shared gl array buffer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_BACK = com.jogamp.opengl.GL.GL_BACK`
- Role: Defines the shared gl back constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_BLEND = com.jogamp.opengl.GL.GL_BLEND`
- Role: Defines the shared gl blend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_BUFFER = com.jogamp.opengl.GL3.GL_BUFFER`
- Role: Defines the shared gl buffer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_COLOR_ATTACHMENT0 = com.jogamp.opengl.GL.GL_COLOR_ATTACHMENT0`
- Role: Defines the shared gl color attachment0 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_COLOR_BUFFER_BIT = com.jogamp.opengl.GL3.GL_COLOR_BUFFER_BIT`
- Role: Defines the shared gl color buffer bit constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_COMPILE_STATUS = com.jogamp.opengl.GL3.GL_COMPILE_STATUS`
- Role: Defines the shared gl compile status constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CONSTANT_ALPHA = com.jogamp.opengl.GL3.GL_CONSTANT_ALPHA`
- Role: Defines the shared gl constant alpha constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CONSTANT_COLOR = com.jogamp.opengl.GL3.GL_CONSTANT_COLOR`
- Role: Defines the shared gl constant color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CONTEXT_FLAGS = com.jogamp.opengl.GL3.GL_CONTEXT_FLAGS`
- Role: Defines the shared gl context flags constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CONTEXT_PROFILE_MASK = com.jogamp.opengl.GL3.GL_CONTEXT_PROFILE_MASK`
- Role: Defines the shared gl context profile mask constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CONTEXT_CORE_PROFILE_BIT = com.jogamp.opengl.GL3.GL_CONTEXT_CORE_PROFILE_BIT`
- Role: Defines the shared gl context core profile bit constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = com.jogamp.opengl.GL3.GL_CONTEXT_COMPATIBILITY_PROFILE_BIT`
- Role: Defines the shared gl context compatibility profile bit constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = com.jogamp.opengl.GL3.GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH`
- Role: Defines the shared gl debug next logged message length constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DEBUG_OUTPUT = com.jogamp.opengl.GL3.GL_DEBUG_OUTPUT`
- Role: Defines the shared gl debug output constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DEPTH_ATTACHMENT = com.jogamp.opengl.GL.GL_DEPTH_ATTACHMENT`
- Role: Defines the shared gl depth attachment constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DEPTH_BUFFER_BIT = com.jogamp.opengl.GL3.GL_DEPTH_BUFFER_BIT`
- Role: Defines the shared gl depth buffer bit constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DONT_CARE = com.jogamp.opengl.GL3.GL_DONT_CARE`
- Role: Defines the shared gl dont care constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DST_ALPHA = com.jogamp.opengl.GL.GL_DST_ALPHA`
- Role: Defines the shared gl dst alpha constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DST_COLOR = com.jogamp.opengl.GL.GL_DST_COLOR`
- Role: Defines the shared gl dst color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DYNAMIC_DRAW = com.jogamp.opengl.GL3.GL_DYNAMIC_DRAW`
- Role: Defines the shared gl dynamic draw constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ELEMENT_ARRAY_BUFFER = com.jogamp.opengl.GL3.GL_ELEMENT_ARRAY_BUFFER`
- Role: Defines the shared gl element array buffer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_EXTENSIONS = com.jogamp.opengl.GL3.GL_EXTENSIONS`
- Role: Defines the shared gl extensions constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FRAGMENT_SHADER = com.jogamp.opengl.GL3.GL_FRAGMENT_SHADER`
- Role: Defines the shared gl fragment shader constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FRAMEBUFFER = com.jogamp.opengl.GL.GL_FRAMEBUFFER`
- Role: Defines the shared gl framebuffer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FRAMEBUFFER_COMPLETE = com.jogamp.opengl.GL.GL_FRAMEBUFFER_COMPLETE`
- Role: Defines the shared gl framebuffer complete constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FUNC_ADD = com.jogamp.opengl.GL.GL_FUNC_ADD`
- Role: Defines the shared gl func add constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FUNC_REVERSE_SUBTRACT = com.jogamp.opengl.GL.GL_FUNC_REVERSE_SUBTRACT`
- Role: Defines the shared gl func reverse subtract constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FUNC_SUBTRACT = com.jogamp.opengl.GL.GL_FUNC_SUBTRACT`
- Role: Defines the shared gl func subtract constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_INFO_LOG_LENGTH = com.jogamp.opengl.GL3.GL_INFO_LOG_LENGTH`
- Role: Defines the shared gl info log length constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_INVALID_ENUM = com.jogamp.opengl.GL.GL_INVALID_ENUM`
- Role: Defines the shared gl invalid enum constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_INVALID_VALUE = com.jogamp.opengl.GL.GL_INVALID_VALUE`
- Role: Defines the shared gl invalid value constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_INVALID_OPERATION = com.jogamp.opengl.GL.GL_INVALID_OPERATION`
- Role: Defines the shared gl invalid operation constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_LINK_STATUS = com.jogamp.opengl.GL3.GL_LINK_STATUS`
- Role: Defines the shared gl link status constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_MAJOR_VERSION = com.jogamp.opengl.GL3.GL_MAJOR_VERSION`
- Role: Defines the shared gl major version constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_MAX = com.jogamp.opengl.GL3.GL_MAX`
- Role: Defines the shared gl max constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_MAX_COLOR_ATTACHMENTS = com.jogamp.opengl.GL3.GL_MAX_COLOR_ATTACHMENTS`
- Role: Defines the shared gl max color attachments constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = com.jogamp.opengl.GL3.GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT`
- Role: Defines the shared gl max texture max anisotropy ext constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_MIN = com.jogamp.opengl.GL3.GL_MIN`
- Role: Defines the shared gl min constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_MINOR_VERSION = com.jogamp.opengl.GL3.GL_MINOR_VERSION`
- Role: Defines the shared gl minor version constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_NONE = com.jogamp.opengl.GL.GL_NONE`
- Role: Defines the shared gl none constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_NUM_EXTENSIONS = com.jogamp.opengl.GL3.GL_NUM_EXTENSIONS`
- Role: Defines the shared gl num extensions constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ONE = com.jogamp.opengl.GL.GL_ONE`
- Role: Defines the shared gl one constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ONE_MINUS_CONSTANT_ALPHA = com.jogamp.opengl.GL3.GL_ONE_MINUS_CONSTANT_ALPHA`
- Role: Defines the shared gl one minus constant alpha constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ONE_MINUS_CONSTANT_COLOR = com.jogamp.opengl.GL3.GL_ONE_MINUS_CONSTANT_COLOR`
- Role: Defines the shared gl one minus constant color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ONE_MINUS_DST_ALPHA = com.jogamp.opengl.GL.GL_ONE_MINUS_DST_ALPHA`
- Role: Defines the shared gl one minus dst alpha constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ONE_MINUS_DST_COLOR = com.jogamp.opengl.GL.GL_ONE_MINUS_DST_COLOR`
- Role: Defines the shared gl one minus dst color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ONE_MINUS_SRC_ALPHA = com.jogamp.opengl.GL.GL_ONE_MINUS_SRC_ALPHA`
- Role: Defines the shared gl one minus src alpha constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ONE_MINUS_SRC_COLOR = com.jogamp.opengl.GL.GL_ONE_MINUS_SRC_COLOR`
- Role: Defines the shared gl one minus src color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_OUT_OF_MEMORY = com.jogamp.opengl.GL.GL_OUT_OF_MEMORY`
- Role: Defines the shared gl out of memory constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_PACK_ALIGNMENT = com.jogamp.opengl.GL3.GL_PACK_ALIGNMENT`
- Role: Defines the shared gl pack alignment constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_PIXEL_PACK_BUFFER = com.jogamp.opengl.GL3.GL_PIXEL_PACK_BUFFER`
- Role: Defines the shared gl pixel pack buffer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_PROGRAM_POINT_SIZE = com.jogamp.opengl.GL3.GL_PROGRAM_POINT_SIZE`
- Role: Defines the shared gl program point size constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_QUERY_RESULT = com.jogamp.opengl.GL3.GL_QUERY_RESULT`
- Role: Defines the shared gl query result constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_QUERY_RESULT_AVAILABLE = com.jogamp.opengl.GL3.GL_QUERY_RESULT_AVAILABLE`
- Role: Defines the shared gl query result available constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RENDERER = com.jogamp.opengl.GL3.GL_RENDERER`
- Role: Defines the shared gl renderer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SHADING_LANGUAGE_VERSION = com.jogamp.opengl.GL3.GL_SHADING_LANGUAGE_VERSION`
- Role: Defines the shared gl shading language version constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SIGNALED = com.jogamp.opengl.GL3.GL_SIGNALED`
- Role: Defines the shared gl signaled constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SRC_ALPHA = com.jogamp.opengl.GL.GL_SRC_ALPHA`
- Role: Defines the shared gl src alpha constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SRC_COLOR = com.jogamp.opengl.GL.GL_SRC_COLOR`
- Role: Defines the shared gl src color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_STATIC_DRAW = com.jogamp.opengl.GL3.GL_STATIC_DRAW`
- Role: Defines the shared gl static draw constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_STREAM_DRAW = com.jogamp.opengl.GL3.GL_STREAM_DRAW`
- Role: Defines the shared gl stream draw constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_STREAM_READ = com.jogamp.opengl.GL3.GL_STREAM_READ`
- Role: Defines the shared gl stream read constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = com.jogamp.opengl.GL3.GL_SYNC_GPU_COMMANDS_COMPLETE`
- Role: Defines the shared gl sync gpu commands complete constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SYNC_STATUS = com.jogamp.opengl.GL3.GL_SYNC_STATUS`
- Role: Defines the shared gl sync status constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE = com.jogamp.opengl.GL3.GL_TEXTURE`
- Role: Defines the shared gl texture constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE0 = com.jogamp.opengl.GL.GL_TEXTURE0`
- Role: Defines the shared gl texture0 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_1D = com.jogamp.opengl.GL3.GL_TEXTURE_1D`
- Role: Defines the shared gl texture 1 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_1D_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_1D_ARRAY`
- Role: Defines the shared gl texture 1 d array constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_2D = com.jogamp.opengl.GL.GL_TEXTURE_2D`
- Role: Defines the shared gl texture 2 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_2D_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_2D_ARRAY`
- Role: Defines the shared gl texture 2 d array constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_2D_MULTISAMPLE = com.jogamp.opengl.GL3.GL_TEXTURE_2D_MULTISAMPLE`
- Role: Defines the shared gl texture 2 d multisample constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_2D_MULTISAMPLE_ARRAY`
- Role: Defines the shared gl texture 2 d multisample array constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_3D = com.jogamp.opengl.GL3.GL_TEXTURE_3D`
- Role: Defines the shared gl texture 3 d constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_BORDER_COLOR = com.jogamp.opengl.GL3.GL_TEXTURE_BORDER_COLOR`
- Role: Defines the shared gl texture border color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_CUBE_MAP = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP`
- Role: Defines the shared gl texture cube map constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_CUBE_MAP_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_ARRAY`
- Role: Defines the shared gl texture cube map array constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_MIN_FILTER = com.jogamp.opengl.GL3.GL_TEXTURE_MIN_FILTER`
- Role: Defines the shared gl texture min filter constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_MAG_FILTER = com.jogamp.opengl.GL3.GL_TEXTURE_MAG_FILTER`
- Role: Defines the shared gl texture mag filter constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = com.jogamp.opengl.GL3.GL_TEXTURE_MAX_ANISOTROPY_EXT`
- Role: Defines the shared gl texture max anisotropy ext constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_WRAP_S = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_S`
- Role: Defines the shared gl texture wrap s constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_WRAP_T = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_T`
- Role: Defines the shared gl texture wrap t constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_WRAP_R = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_R`
- Role: Defines the shared gl texture wrap r constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TIMESTAMP = com.jogamp.opengl.GL3.GL_TIMESTAMP`
- Role: Defines the shared gl timestamp constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_VENDOR = com.jogamp.opengl.GL3.GL_VENDOR`
- Role: Defines the shared gl vendor constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_VERSION = com.jogamp.opengl.GL3.GL_VERSION`
- Role: Defines the shared gl version constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_VERTEX_ARRAY = com.jogamp.opengl.GL2.GL_VERTEX_ARRAY`
- Role: Defines the shared gl vertex array constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_VERTEX_SHADER = com.jogamp.opengl.GL3.GL_VERTEX_SHADER`
- Role: Defines the shared gl vertex shader constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ZERO = com.jogamp.opengl.GL.GL_ZERO`
- Role: Defines the shared gl zero constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_NEAREST = com.jogamp.opengl.GL.GL_NEAREST`
- Role: Defines the shared gl nearest constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_LINEAR = com.jogamp.opengl.GL.GL_LINEAR`
- Role: Defines the shared gl linear constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_NEAREST_MIPMAP_NEAREST = com.jogamp.opengl.GL.GL_NEAREST_MIPMAP_NEAREST`
- Role: Defines the shared gl nearest mipmap nearest constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_NEAREST_MIPMAP_LINEAR = com.jogamp.opengl.GL.GL_NEAREST_MIPMAP_LINEAR`
- Role: Defines the shared gl nearest mipmap linear constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_LINEAR_MIPMAP_NEAREST = com.jogamp.opengl.GL.GL_LINEAR_MIPMAP_NEAREST`
- Role: Defines the shared gl linear mipmap nearest constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_LINEAR_MIPMAP_LINEAR = com.jogamp.opengl.GL.GL_LINEAR_MIPMAP_LINEAR`
- Role: Defines the shared gl linear mipmap linear constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_REPEAT = com.jogamp.opengl.GL.GL_REPEAT`
- Role: Defines the shared gl repeat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_MIRRORED_REPEAT = com.jogamp.opengl.GL.GL_MIRRORED_REPEAT`
- Role: Defines the shared gl mirrored repeat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CLAMP_TO_EDGE = com.jogamp.opengl.GL.GL_CLAMP_TO_EDGE`
- Role: Defines the shared gl clamp to edge constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CLAMP_TO_BORDER = com.jogamp.opengl.GL3.GL_CLAMP_TO_BORDER`
- Role: Defines the shared gl clamp to border constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R8 = com.jogamp.opengl.GL3.GL_R8`
- Role: Defines the shared gl r8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R8_SNORM = com.jogamp.opengl.GL3.GL_R8_SNORM`
- Role: Defines the shared gl r8 snorm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R16 = com.jogamp.opengl.GL3.GL_R16`
- Role: Defines the shared gl r16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R16_SNORM = com.jogamp.opengl.GL3.GL_R16_SNORM`
- Role: Defines the shared gl r16 snorm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R16F = com.jogamp.opengl.GL3.GL_R16F`
- Role: Defines the shared gl r16 f constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R32F = com.jogamp.opengl.GL3.GL_R32F`
- Role: Defines the shared gl r32 f constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R8I = com.jogamp.opengl.GL3.GL_R8I`
- Role: Defines the shared gl r8 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R8UI = com.jogamp.opengl.GL3.GL_R8UI`
- Role: Defines the shared gl r8 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R16I = com.jogamp.opengl.GL3.GL_R16I`
- Role: Defines the shared gl r16 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R16UI = com.jogamp.opengl.GL3.GL_R16UI`
- Role: Defines the shared gl r16 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R32I = com.jogamp.opengl.GL3.GL_R32I`
- Role: Defines the shared gl r32 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_R32UI = com.jogamp.opengl.GL3.GL_R32UI`
- Role: Defines the shared gl r32 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DEPTH_COMPONENT = com.jogamp.opengl.GL3.GL_DEPTH_COMPONENT`
- Role: Defines the shared gl depth component constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG8 = com.jogamp.opengl.GL3.GL_RG8`
- Role: Defines the shared gl rg8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG8_SNORM = com.jogamp.opengl.GL3.GL_RG8_SNORM`
- Role: Defines the shared gl rg8 snorm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG16 = com.jogamp.opengl.GL3.GL_RG16`
- Role: Defines the shared gl rg16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG16_SNORM = com.jogamp.opengl.GL3.GL_RG16_SNORM`
- Role: Defines the shared gl rg16 snorm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG8I = com.jogamp.opengl.GL3.GL_RG8I`
- Role: Defines the shared gl rg8 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG8UI = com.jogamp.opengl.GL3.GL_RG8UI`
- Role: Defines the shared gl rg8 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG16I = com.jogamp.opengl.GL3.GL_RG16I`
- Role: Defines the shared gl rg16 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG16UI = com.jogamp.opengl.GL3.GL_RG16UI`
- Role: Defines the shared gl rg16 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG16F = com.jogamp.opengl.GL3.GL_RG16F`
- Role: Defines the shared gl rg16 f constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG32F = com.jogamp.opengl.GL3.GL_RG32F`
- Role: Defines the shared gl rg32 f constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG32I = com.jogamp.opengl.GL3.GL_RG32I`
- Role: Defines the shared gl rg32 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG32UI = com.jogamp.opengl.GL3.GL_RG32UI`
- Role: Defines the shared gl rg32 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB8 = com.jogamp.opengl.GL3.GL_RGB8`
- Role: Defines the shared gl rgb8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB8_SNORM = com.jogamp.opengl.GL3.GL_RGB8_SNORM`
- Role: Defines the shared gl rgb8 snorm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB16 = com.jogamp.opengl.GL3.GL_RGB16`
- Role: Defines the shared gl rgb16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB16_SNORM = com.jogamp.opengl.GL3.GL_RGB16_SNORM`
- Role: Defines the shared gl rgb16 snorm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB8I = com.jogamp.opengl.GL3.GL_RGB8I`
- Role: Defines the shared gl rgb8 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB8UI = com.jogamp.opengl.GL3.GL_RGB8UI`
- Role: Defines the shared gl rgb8 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB16I = com.jogamp.opengl.GL3.GL_RGB16I`
- Role: Defines the shared gl rgb16 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB16UI = com.jogamp.opengl.GL3.GL_RGB16UI`
- Role: Defines the shared gl rgb16 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB32I = com.jogamp.opengl.GL3.GL_RGB32I`
- Role: Defines the shared gl rgb32 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB32UI = com.jogamp.opengl.GL3.GL_RGB32UI`
- Role: Defines the shared gl rgb32 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB16F = com.jogamp.opengl.GL3.GL_RGB16F`
- Role: Defines the shared gl rgb16 f constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB32F = com.jogamp.opengl.GL3.GL_RGB32F`
- Role: Defines the shared gl rgb32 f constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA8 = com.jogamp.opengl.GL3.GL_RGBA8`
- Role: Defines the shared gl rgba8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA8_SNORM = com.jogamp.opengl.GL3.GL_RGBA8_SNORM`
- Role: Defines the shared gl rgba8 snorm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA16 = com.jogamp.opengl.GL3.GL_RGBA16`
- Role: Defines the shared gl rgba16 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA16_SNORM = com.jogamp.opengl.GL3.GL_RGBA16_SNORM`
- Role: Defines the shared gl rgba16 snorm constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA8I = com.jogamp.opengl.GL3.GL_RGBA8I`
- Role: Defines the shared gl rgba8 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA8UI = com.jogamp.opengl.GL3.GL_RGBA8UI`
- Role: Defines the shared gl rgba8 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA16I = com.jogamp.opengl.GL3.GL_RGBA16I`
- Role: Defines the shared gl rgba16 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA16UI = com.jogamp.opengl.GL3.GL_RGBA16UI`
- Role: Defines the shared gl rgba16 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA32I = com.jogamp.opengl.GL3.GL_RGBA32I`
- Role: Defines the shared gl rgba32 i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA32UI = com.jogamp.opengl.GL3.GL_RGBA32UI`
- Role: Defines the shared gl rgba32 ui constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA16F = com.jogamp.opengl.GL3.GL_RGBA16F`
- Role: Defines the shared gl rgba16 f constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA32F = com.jogamp.opengl.GL3.GL_RGBA32F`
- Role: Defines the shared gl rgba32 f constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SRGB8 = com.jogamp.opengl.GL3.GL_SRGB8`
- Role: Defines the shared gl srgb8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SRGB8_ALPHA8 = com.jogamp.opengl.GL3.GL_SRGB8_ALPHA8`
- Role: Defines the shared gl srgb8 alpha8 constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RED = com.jogamp.opengl.GL3.GL_RED`
- Role: Defines the shared gl red constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG = com.jogamp.opengl.GL3.GL_RG`
- Role: Defines the shared gl rg constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB = com.jogamp.opengl.GL3.GL_RGB`
- Role: Defines the shared gl rgb constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA = com.jogamp.opengl.GL3.GL_RGBA`
- Role: Defines the shared gl rgba constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RED_INTEGER = com.jogamp.opengl.GL3.GL_RED_INTEGER`
- Role: Defines the shared gl red integer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RG_INTEGER = com.jogamp.opengl.GL3.GL_RG_INTEGER`
- Role: Defines the shared gl rg integer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGB_INTEGER = com.jogamp.opengl.GL3.GL_RGB_INTEGER`
- Role: Defines the shared gl rgb integer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_RGBA_INTEGER = com.jogamp.opengl.GL3.GL_RGBA_INTEGER`
- Role: Defines the shared gl rgba integer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_BGR = com.jogamp.opengl.GL3.GL_BGR`
- Role: Defines the shared gl bgr constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_BGRA = com.jogamp.opengl.GL3.GL_BGRA`
- Role: Defines the shared gl bgra constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_BYTE = com.jogamp.opengl.GL3.GL_BYTE`
- Role: Defines the shared gl byte constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SHORT = com.jogamp.opengl.GL3.GL_SHORT`
- Role: Defines the shared gl short constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_INT = com.jogamp.opengl.GL3.GL_INT`
- Role: Defines the shared gl int constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_UNSIGNED_BYTE = com.jogamp.opengl.GL3.GL_UNSIGNED_BYTE`
- Role: Defines the shared gl unsigned byte constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_UNSIGNED_SHORT = com.jogamp.opengl.GL3.GL_UNSIGNED_SHORT`
- Role: Defines the shared gl unsigned short constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_UNSIGNED_INT = com.jogamp.opengl.GL3.GL_UNSIGNED_INT`
- Role: Defines the shared gl unsigned int constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FLOAT = com.jogamp.opengl.GL3.GL_FLOAT`
- Role: Defines the shared gl float constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_HALF_FLOAT = com.jogamp.opengl.GL3.GL_HALF_FLOAT`
- Role: Defines the shared gl half float constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_X`
- Role: Defines the shared gl texture cube map positive x constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_Y`
- Role: Defines the shared gl texture cube map positive y constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_Z`
- Role: Defines the shared gl texture cube map positive z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_X`
- Role: Defines the shared gl texture cube map negative x constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`
- Role: Defines the shared gl texture cube map negative y constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`
- Role: Defines the shared gl texture cube map negative z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_SCISSOR_TEST = com.jogamp.opengl.GL3.GL_SCISSOR_TEST`
- Role: Defines the shared gl scissor test constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FRONT = com.jogamp.opengl.GL3.GL_FRONT`
- Role: Defines the shared gl front constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_FRONT_AND_BACK = com.jogamp.opengl.GL3.GL_FRONT_AND_BACK`
- Role: Defines the shared gl front and back constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_CULL_FACE = com.jogamp.opengl.GL3.GL_CULL_FACE`
- Role: Defines the shared gl cull face constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_NEVER = com.jogamp.opengl.GL3.GL_NEVER`
- Role: Defines the shared gl never constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_ALWAYS = com.jogamp.opengl.GL3.GL_ALWAYS`
- Role: Defines the shared gl always constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_EQUAL = com.jogamp.opengl.GL3.GL_EQUAL`
- Role: Defines the shared gl equal constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_NOTEQUAL = com.jogamp.opengl.GL3.GL_NOTEQUAL`
- Role: Defines the shared gl notequal constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_LESS = com.jogamp.opengl.GL3.GL_LESS`
- Role: Defines the shared gl less constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_LEQUAL = com.jogamp.opengl.GL3.GL_LEQUAL`
- Role: Defines the shared gl lequal constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_GREATER = com.jogamp.opengl.GL3.GL_GREATER`
- Role: Defines the shared gl greater constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_GEQUAL = com.jogamp.opengl.GL3.GL_GEQUAL`
- Role: Defines the shared gl gequal constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_DEPTH_TEST = com.jogamp.opengl.GL3.GL_DEPTH_TEST`
- Role: Defines the shared gl depth test constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_POLYGON_OFFSET_FILL = com.jogamp.opengl.GL3.GL_POLYGON_OFFSET_FILL`
- Role: Defines the shared gl polygon offset fill constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_POINTS = com.jogamp.opengl.GL3.GL_POINTS`
- Role: Defines the shared gl points constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_LINES = com.jogamp.opengl.GL3.GL_LINES`
- Role: Defines the shared gl lines constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_LINE_STRIP = com.jogamp.opengl.GL3.GL_LINE_STRIP`
- Role: Defines the shared gl line strip constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TRIANGLES = com.jogamp.opengl.GL3.GL_TRIANGLES`
- Role: Defines the shared gl triangles constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TRIANGLE_STRIP = com.jogamp.opengl.GL3.GL_TRIANGLE_STRIP`
- Role: Defines the shared gl triangle strip constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int GL_TRIANGLE_FAN = com.jogamp.opengl.GL3.GL_TRIANGLE_FAN`
- Role: Defines the shared gl triangle fan constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public void glActiveTexture(int texture)`
- Role: Performs gl active texture.
- Description: Supports the gl active texture operation used by the surrounding class.

#### `public void glAttachShader(int program, int shader)`
- Role: Performs gl attach shader.
- Description: Supports the gl attach shader operation used by the surrounding class.

#### `public void glBindAttribLocation(int program, int index, String name)`
- Role: Performs gl bind attrib location.
- Description: Supports the gl bind attrib location operation used by the surrounding class.

#### `public void glBindBuffer(int target, int buffer)`
- Role: Performs gl bind buffer.
- Description: Supports the gl bind buffer operation used by the surrounding class.

#### `public void glBindFragDataLocation(int program, int colornumber, String name)`
- Role: Performs gl bind frag data location.
- Description: Supports the gl bind frag data location operation used by the surrounding class.

#### `public void glBindFramebuffer(int target, int buffer)`
- Role: Performs gl bind framebuffer.
- Description: Supports the gl bind framebuffer operation used by the surrounding class.

#### `public void glBindRenderbuffer(int target, int buffer)`
- Role: Performs gl bind renderbuffer.
- Description: Supports the gl bind renderbuffer operation used by the surrounding class.

#### `public void glBindTexture(int target, int texture)`
- Role: Performs gl bind texture.
- Description: Supports the gl bind texture operation used by the surrounding class.

#### `public void glBindVertexArray(int array)`
- Role: Performs gl bind vertex array.
- Description: Supports the gl bind vertex array operation used by the surrounding class.

#### `public void glBlendColor(float red, float green, float blue, float alpha)`
- Role: Performs gl blend color.
- Description: Supports the gl blend color operation used by the surrounding class.

#### `public void glBlendEquation(int mode)`
- Role: Performs gl blend equation.
- Description: Supports the gl blend equation operation used by the surrounding class.

#### `public void glBlendEquationSeparate(int cmode, int amode)`
- Role: Performs gl blend equation separate.
- Description: Supports the gl blend equation separate operation used by the surrounding class.

#### `public void glBlendFunc(int sfac, int dfac)`
- Role: Performs gl blend func.
- Description: Supports the gl blend func operation used by the surrounding class.

#### `public void glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac)`
- Role: Performs gl blend func separate.
- Description: Supports the gl blend func separate operation used by the surrounding class.

#### `public void glBufferData(int target, long size, ByteBuffer data, int usage)`
- Role: Performs gl buffer data.
- Description: Supports the gl buffer data operation used by the surrounding class.

#### `public void glBufferSubData(int target, long offset, long size, ByteBuffer data)`
- Role: Performs gl buffer sub data.
- Description: Supports the gl buffer sub data operation used by the surrounding class.

#### `public int glCheckFramebufferStatus(int target)`
- Role: Performs gl check framebuffer status.
- Description: Supports the gl check framebuffer status operation used by the surrounding class.

#### `public void glClear(int mask)`
- Role: Performs gl clear.
- Description: Supports the gl clear operation used by the surrounding class.

#### `public void glClearBufferfv(int buffer, int drawbuffer, float[] value)`
- Role: Performs gl clear bufferfv.
- Description: Supports the gl clear bufferfv operation used by the surrounding class.

#### `public void glClearBufferiv(int buffer, int drawbuffer, int[] value)`
- Role: Performs gl clear bufferiv.
- Description: Supports the gl clear bufferiv operation used by the surrounding class.

#### `public void glClearBufferuiv(int buffer, int drawbuffer, int[] value)`
- Role: Performs gl clear bufferuiv.
- Description: Supports the gl clear bufferuiv operation used by the surrounding class.

#### `public void glClearColor(float r, float g, float b, float a)`
- Role: Performs gl clear color.
- Description: Supports the gl clear color operation used by the surrounding class.

#### `public void glClearDepth(double d)`
- Role: Performs gl clear depth.
- Description: Supports the gl clear depth operation used by the surrounding class.

#### `public void glColorMask(boolean r, boolean g, boolean b, boolean a)`
- Role: Performs gl color mask.
- Description: Supports the gl color mask operation used by the surrounding class.

#### `public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a)`
- Role: Performs gl color maski.
- Description: Supports the gl color maski operation used by the surrounding class.

#### `public void glCompileShader(int shader)`
- Role: Performs gl compile shader.
- Description: Supports the gl compile shader operation used by the surrounding class.

#### `public int glCreateProgram()`
- Role: Performs gl create program.
- Description: Supports the gl create program operation used by the surrounding class.

#### `public int glCreateShader(int type)`
- Role: Performs gl create shader.
- Description: Supports the gl create shader operation used by the surrounding class.

#### `public void glDeleteBuffers(int count, int[] buffers)`
- Role: Performs gl delete buffers.
- Description: Supports the gl delete buffers operation used by the surrounding class.

#### `public void glDeleteFramebuffers(int count, int[] buffers)`
- Role: Performs gl delete framebuffers.
- Description: Supports the gl delete framebuffers operation used by the surrounding class.

#### `public void glDeleteShader(int id)`
- Role: Performs gl delete shader.
- Description: Supports the gl delete shader operation used by the surrounding class.

#### `public void glDeleteProgram(int id)`
- Role: Performs gl delete program.
- Description: Supports the gl delete program operation used by the surrounding class.

#### `public void glDeleteQueries(int count, int[] buffer)`
- Role: Performs gl delete queries.
- Description: Supports the gl delete queries operation used by the surrounding class.

#### `public void glDeleteRenderbuffers(int count, int[] buffers)`
- Role: Performs gl delete renderbuffers.
- Description: Supports the gl delete renderbuffers operation used by the surrounding class.

#### `public void glDeleteSync(long id)`
- Role: Performs gl delete sync.
- Description: Supports the gl delete sync operation used by the surrounding class.

#### `public void glDeleteTextures(int count, int[] buffers)`
- Role: Performs gl delete textures.
- Description: Supports the gl delete textures operation used by the surrounding class.

#### `public void glDeleteVertexArrays(int count, int[] buffers)`
- Role: Performs gl delete vertex arrays.
- Description: Supports the gl delete vertex arrays operation used by the surrounding class.

#### `public void glCullFace(int mode)`
- Role: Performs gl cull face.
- Description: Supports the gl cull face operation used by the surrounding class.

#### `public void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled)`
- Role: Performs gl debug message control.
- Description: Supports the gl debug message control operation used by the surrounding class.

#### `public void glDepthFunc(int func)`
- Role: Performs gl depth func.
- Description: Supports the gl depth func operation used by the surrounding class.

#### `public void glDepthMask(boolean mask)`
- Role: Performs gl depth mask.
- Description: Supports the gl depth mask operation used by the surrounding class.

#### `public void glDisable(int cap)`
- Role: Performs gl disable.
- Description: Supports the gl disable operation used by the surrounding class.

#### `public void glDisablei(int cap, int index)`
- Role: Performs gl disablei.
- Description: Supports the gl disablei operation used by the surrounding class.

#### `public void glDisableVertexAttribArray(int location)`
- Role: Performs gl disable vertex attrib array.
- Description: Supports the gl disable vertex attrib array operation used by the surrounding class.

#### `public void glDrawBuffer(int buf)`
- Role: Performs gl draw buffer.
- Description: Supports the gl draw buffer operation used by the surrounding class.

#### `public void glDrawBuffers(int n, int[] bufs)`
- Role: Performs gl draw buffers.
- Description: Supports the gl draw buffers operation used by the surrounding class.

#### `public void glDrawArraysInstanced(int mode, int first, int count, int primcount)`
- Role: Performs gl draw arrays instanced.
- Description: Supports the gl draw arrays instanced operation used by the surrounding class.

#### `public void glDrawArrays(int mode, int first, int count)`
- Role: Performs gl draw arrays.
- Description: Supports the gl draw arrays operation used by the surrounding class.

#### `public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount)`
- Role: Performs gl draw elements instanced.
- Description: Supports the gl draw elements instanced operation used by the surrounding class.

#### `public void glDrawElements(int mode, int count, int type, long indices)`
- Role: Performs gl draw elements.
- Description: Supports the gl draw elements operation used by the surrounding class.

#### `public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices)`
- Role: Performs gl draw range elements.
- Description: Supports the gl draw range elements operation used by the surrounding class.

#### `public void glEnable(int cap)`
- Role: Performs gl enable.
- Description: Supports the gl enable operation used by the surrounding class.

#### `public void glEnablei(int cap, int index)`
- Role: Performs gl enablei.
- Description: Supports the gl enablei operation used by the surrounding class.

#### `public void glEnableVertexAttribArray(int location)`
- Role: Performs gl enable vertex attrib array.
- Description: Supports the gl enable vertex attrib array operation used by the surrounding class.

#### `public long glFenceSync(int condition, int flags)`
- Role: Performs gl fence sync.
- Description: Supports the gl fence sync operation used by the surrounding class.

#### `public void glFinish()`
- Role: Performs gl finish.
- Description: Supports the gl finish operation used by the surrounding class.

#### `public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level)`
- Role: Performs gl framebuffer texture2 d.
- Description: Supports the gl framebuffer texture2 d operation used by the surrounding class.

#### `public void glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer)`
- Role: Performs gl framebuffer renderbuffer.
- Description: Supports the gl framebuffer renderbuffer operation used by the surrounding class.

#### `public void glGenBuffers(int n, int[] buffer)`
- Role: Performs gl gen buffers.
- Description: Supports the gl gen buffers operation used by the surrounding class.

#### `public void glGenFramebuffers(int n, int[] buffer)`
- Role: Performs gl gen framebuffers.
- Description: Supports the gl gen framebuffers operation used by the surrounding class.

#### `public void glGenQueries(int n, int[] buffer)`
- Role: Performs gl gen queries.
- Description: Supports the gl gen queries operation used by the surrounding class.

#### `public void glGenTextures(int n, int[] buffer)`
- Role: Performs gl gen textures.
- Description: Supports the gl gen textures operation used by the surrounding class.

#### `public void glGenVertexArrays(int n, int[] buffer)`
- Role: Performs gl gen vertex arrays.
- Description: Supports the gl gen vertex arrays operation used by the surrounding class.

#### `public void glGetBufferSubData(int target, int offset, int size, ByteBuffer data)`
- Role: Performs gl get buffer sub data.
- Description: Supports the gl get buffer sub data operation used by the surrounding class.

#### `public int glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer)`
- Role: Performs gl get debug message log.
- Description: Supports the gl get debug message log operation used by the surrounding class.

#### `public int glGetError()`
- Role: Performs gl get error.
- Description: Supports the gl get error operation used by the surrounding class.

#### `public void glGetFloatv(int pname, float[] data)`
- Role: Performs gl get floatv.
- Description: Supports the gl get floatv operation used by the surrounding class.

#### `public void glGetIntegerv(int pname, int[] data)`
- Role: Performs gl get integerv.
- Description: Supports the gl get integerv operation used by the surrounding class.

#### `public String glGetString(int name)`
- Role: Performs gl get string.
- Description: Supports the gl get string operation used by the surrounding class.

#### `public String glGetStringi(int name, int index)`
- Role: Performs gl get stringi.
- Description: Supports the gl get stringi operation used by the surrounding class.

#### `public void glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`
- Role: Performs gl get program info log.
- Description: Supports the gl get program info log operation used by the surrounding class.

#### `public void glGetProgramiv(int shader, int pname, int[] buf)`
- Role: Performs gl get programiv.
- Description: Supports the gl get programiv operation used by the surrounding class.

#### `public void glGetQueryObjectiv(int id, int pname, int[] params)`
- Role: Performs gl get query objectiv.
- Description: Supports the gl get query objectiv operation used by the surrounding class.

#### `public void glGetQueryObjecti64v(int id, int pname, long[] params)`
- Role: Performs gl get query objecti64v.
- Description: Supports the gl get query objecti64v operation used by the surrounding class.

#### `public void glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog)`
- Role: Performs gl get shader info log.
- Description: Supports the gl get shader info log operation used by the surrounding class.

#### `public void glGetShaderiv(int shader, int pname, int[] buf)`
- Role: Performs gl get shaderiv.
- Description: Supports the gl get shaderiv operation used by the surrounding class.

#### `public void glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int[] values)`
- Role: Performs gl get synciv.
- Description: Supports the gl get synciv operation used by the surrounding class.

#### `public void glGetTexImage(int target, int level, int format, int type, ByteBuffer pixels)`
- Role: Performs gl get tex image.
- Description: Supports the gl get tex image operation used by the surrounding class.

#### `public void glGetTexImage(int target, int level, int format, int type, long offset)`
- Role: Performs gl get tex image.
- Description: Supports the gl get tex image operation used by the surrounding class.

#### `public int glGetUniformLocation(int program, String name)`
- Role: Performs gl get uniform location.
- Description: Supports the gl get uniform location operation used by the surrounding class.

#### `public void glLineWidth(float w)`
- Role: Performs gl line width.
- Description: Supports the gl line width operation used by the surrounding class.

#### `public void glLinkProgram(int program)`
- Role: Performs gl link program.
- Description: Supports the gl link program operation used by the surrounding class.

#### `public void glObjectLabel(int identifier, int name, int length, byte[] label)`
- Role: Performs gl object label.
- Description: Supports the gl object label operation used by the surrounding class.

#### `public void glPixelStorei(int pname, int param)`
- Role: Performs gl pixel storei.
- Description: Supports the gl pixel storei operation used by the surrounding class.

#### `public void glPointSize(float size)`
- Role: Performs gl point size.
- Description: Supports the gl point size operation used by the surrounding class.

#### `public void glPolygonMode(int face, int mode)`
- Role: Performs gl polygon mode.
- Description: Supports the gl polygon mode operation used by the surrounding class.

#### `public void glPolygonOffset(float factor, float units)`
- Role: Performs gl polygon offset.
- Description: Supports the gl polygon offset operation used by the surrounding class.

#### `public void glQueryCounter(int id, int target)`
- Role: Performs gl query counter.
- Description: Supports the gl query counter operation used by the surrounding class.

#### `public void glReadBuffer(int buf)`
- Role: Performs gl read buffer.
- Description: Supports the gl read buffer operation used by the surrounding class.

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, ByteBuffer data)`
- Role: Performs gl read pixels.
- Description: Supports the gl read pixels operation used by the surrounding class.

#### `public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset)`
- Role: Performs gl read pixels.
- Description: Supports the gl read pixels operation used by the surrounding class.

#### `public void glRenderbufferStorage(int target, int format, int width, int height)`
- Role: Performs gl renderbuffer storage.
- Description: Supports the gl renderbuffer storage operation used by the surrounding class.

#### `public void glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height)`
- Role: Performs gl renderbuffer storage multisample.
- Description: Supports the gl renderbuffer storage multisample operation used by the surrounding class.

#### `public void glSampleCoverage(float value, boolean invert)`
- Role: Performs gl sample coverage.
- Description: Supports the gl sample coverage operation used by the surrounding class.

#### `public void glScissor(int x, int y, int w, int h)`
- Role: Performs gl scissor.
- Description: Supports the gl scissor operation used by the surrounding class.

#### `public void glShaderSource(int shader, int count, String[] string, int[] lengths)`
- Role: Performs gl shader source.
- Description: Supports the gl shader source operation used by the surrounding class.

#### `public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, ByteBuffer data)`
- Role: Performs gl tex image2 d.
- Description: Supports the gl tex image2 d operation used by the surrounding class.

#### `public void glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, ByteBuffer data)`
- Role: Performs gl tex sub image2 d.
- Description: Supports the gl tex sub image2 d operation used by the surrounding class.

#### `public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations)`
- Role: Performs gl tex image2 dmultisample.
- Description: Supports the gl tex image2 dmultisample operation used by the surrounding class.

#### `public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, ByteBuffer data)`
- Role: Performs gl tex image3 d.
- Description: Supports the gl tex image3 d operation used by the surrounding class.

#### `public void glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, ByteBuffer data)`
- Role: Performs gl tex sub image3 d.
- Description: Supports the gl tex sub image3 d operation used by the surrounding class.

#### `public void glTexParameterf(int target, int pname, float param)`
- Role: Performs gl tex parameterf.
- Description: Supports the gl tex parameterf operation used by the surrounding class.

#### `public void glTexParameterfv(int target, int pname, float[] param)`
- Role: Performs gl tex parameterfv.
- Description: Supports the gl tex parameterfv operation used by the surrounding class.

#### `public void glTexParameteri(int target, int pname, int param)`
- Role: Performs gl tex parameteri.
- Description: Supports the gl tex parameteri operation used by the surrounding class.

#### `public void glUniform1f(int location, float v0)`
- Role: Performs gl uniform1f.
- Description: Supports the gl uniform1f operation used by the surrounding class.

#### `public void glUniform2f(int location, float v0, float v1)`
- Role: Performs gl uniform2f.
- Description: Supports the gl uniform2f operation used by the surrounding class.

#### `public void glUniform3f(int location, float v0, float v1, float v2)`
- Role: Performs gl uniform3f.
- Description: Supports the gl uniform3f operation used by the surrounding class.

#### `public void glUniform3fv(int location, int count, float[] val)`
- Role: Performs gl uniform3fv.
- Description: Supports the gl uniform3fv operation used by the surrounding class.

#### `public void glUniform4f(int location, float v0, float v1, float v2, float v3)`
- Role: Performs gl uniform4f.
- Description: Supports the gl uniform4f operation used by the surrounding class.

#### `public void glUniform4fv(int location, int count, float[] val)`
- Role: Performs gl uniform4fv.
- Description: Supports the gl uniform4fv operation used by the surrounding class.

#### `public void glUniform1i(int location, int v0)`
- Role: Performs gl uniform1i.
- Description: Supports the gl uniform1i operation used by the surrounding class.

#### `public void glUniform2i(int location, int v0, int v1)`
- Role: Performs gl uniform2i.
- Description: Supports the gl uniform2i operation used by the surrounding class.

#### `public void glUniform3i(int location, int v0, int v1, int v2)`
- Role: Performs gl uniform3i.
- Description: Supports the gl uniform3i operation used by the surrounding class.

#### `public void glUniform4i(int location, int v0, int v1, int v2, int v3)`
- Role: Performs gl uniform4i.
- Description: Supports the gl uniform4i operation used by the surrounding class.

#### `public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value)`
- Role: Performs gl uniform matrix3fv.
- Description: Supports the gl uniform matrix3fv operation used by the surrounding class.

#### `public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value)`
- Role: Performs gl uniform matrix4fv.
- Description: Supports the gl uniform matrix4fv operation used by the surrounding class.

#### `public void glUseProgram(int program)`
- Role: Performs gl use program.
- Description: Supports the gl use program operation used by the surrounding class.

#### `public void glVertexAttribDivisor(int location, int divisor)`
- Role: Performs gl vertex attrib divisor.
- Description: Supports the gl vertex attrib divisor operation used by the surrounding class.

#### `public void glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer)`
- Role: Performs gl vertex attrib pointer.
- Description: Supports the gl vertex attrib pointer operation used by the surrounding class.

#### `public void glVertexAttribIPointer(int location, int size, int type, int stride, long pointer)`
- Role: Performs gl vertex attrib ipointer.
- Description: Supports the gl vertex attrib ipointer operation used by the surrounding class.

#### `public void glViewport(int x, int y, int w, int h)`
- Role: Performs gl viewport.
- Description: Supports the gl viewport operation used by the surrounding class.

#### `public default void xlateexc(RuntimeException exc)`
- Role: Performs xlateexc.
- Description: Supports the xlateexc operation used by the surrounding class.
