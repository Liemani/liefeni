# haven/render/gl

이 문서는 `src/haven/render/gl/`의 책임과 하위 구조를 정리한다.

## Role

- Holds OpenGL backend support.

## Files

- [Applier.md](Applier.md)
- [BGL.md](BGL.md)
- [BufferBGL.md](BufferBGL.md)
- [FboState.md](FboState.md)
- [Fence.md](Fence.md)
- [FillBuffers.md](FillBuffers.md)
- [GL.md](GL.md)
- [GLBuffer.md](GLBuffer.md)
- [GLDoubleBuffer.md](GLDoubleBuffer.md)
- [GLDrawList.md](GLDrawList.md)
- [GLEnvironment.md](GLEnvironment.md)
- [GLException.md](GLException.md)
- [GLFence.md](GLFence.md)
- [GLFrameBuffer.md](GLFrameBuffer.md)
- [GLObject.md](GLObject.md)
- [GLPipeState.md](GLPipeState.md)
- [GLProgram.md](GLProgram.md)
- [GLQuery.md](GLQuery.md)
- [GLReference.md](GLReference.md)
- [GLRender.md](GLRender.md)
- [GLState.md](GLState.md)
- [GLTexture.md](GLTexture.md)
- [GLTimestamp.md](GLTimestamp.md)
- [GLVertexArray.md](GLVertexArray.md)
- [HeapBuffer.md](HeapBuffer.md)
- [NotImplemented.md](NotImplemented.md)
- [StreamBuffer.md](StreamBuffer.md)
- [SysBuffer.md](SysBuffer.md)
- [TexState.md](TexState.md)
- [UniformApplier.md](UniformApplier.md)
- [Vao0State.md](Vao0State.md)
- [VaoBindState.md](VaoBindState.md)
- [VaoState.md](VaoState.md)
- [VboState.md](VboState.md)

## Rules

- 설계 문서는 코드와 1:1로 대응되는 설명을 유지한다.
- 내용은 구현 코드가 아니라 책임, 경계, 흐름을 설명한다.
