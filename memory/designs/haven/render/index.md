# haven/render

이 문서는 `src/haven/render/`의 책임과 하위 구조를 정리한다.

## Role

- Holds rendering backend abstractions and shared render primitives.

## Files

- [Abortable.md](Abortable.md)
- [BaseColor.md](BaseColor.md)
- [BlendMode.md](BlendMode.md)
- [BufPipe.md](BufPipe.md)
- [Camera.md](Camera.md)
- [ColorTex.md](ColorTex.md)
- [ColorVary.md](ColorVary.md)
- [DataBuffer.md](DataBuffer.md)
- [DefPipe.md](DefPipe.md)
- [DepthBuffer.md](DepthBuffer.md)
- [DrawList.md](DrawList.md)
- [Environment.md](Environment.md)
- [FillBuffer.md](FillBuffer.md)
- [FragColor.md](FragColor.md)
- [FragID.md](FragID.md)
- [FragTarget.md](FragTarget.md)
- [FrameConfig.md](FrameConfig.md)
- [FrameInfo.md](FrameInfo.md)
- [GroupPipe.md](GroupPipe.md)
- [Homo3D.md](Homo3D.md)
- [InstanceBatch.md](InstanceBatch.md)
- [InstanceList.md](InstanceList.md)
- [Lighting.md](Lighting.md)
- [Location.md](Location.md)
- [MixColor.md](MixColor.md)
- [Model.md](Model.md)
- [NodeWrap.md](NodeWrap.md)
- [NumberFormat.md](NumberFormat.md)
- [Ortho2D.md](Ortho2D.md)
- [Phong.md](Phong.md)
- [Pipe.md](Pipe.md)
- [PointSize.md](PointSize.md)
- [Projection.md](Projection.md)
- [ProxyPipe.md](ProxyPipe.md)
- [Render.md](Render.md)
- [RenderList.md](RenderList.md)
- [RenderTree.md](RenderTree.md)
- [Rendered.md](Rendered.md)
- [SinglePipe.md](SinglePipe.md)
- [State.md](State.md)
- [States.md](States.md)
- [Swizzle.md](Swizzle.md)
- [Tex2D.md](Tex2D.md)
- [Texture.md](Texture.md)
- [Texture2D.md](Texture2D.md)
- [Texture2DArray.md](Texture2DArray.md)
- [Texture2DMS.md](Texture2DMS.md)
- [Texture3D.md](Texture3D.md)
- [TextureArray.md](TextureArray.md)
- [TextureCube.md](TextureCube.md)
- [TickList.md](TickList.md)
- [Transform.md](Transform.md)
- [VectorFormat.md](VectorFormat.md)
- [VertexArray.md](VertexArray.md)
- [VertexColor.md](VertexColor.md)

## Child Packages

- [gl/](gl/index.md)
- [jogl/](jogl/index.md)
- [lwjgl/](lwjgl/index.md)
- [sl/](sl/index.md)

## Rules

- 설계 문서는 코드와 1:1로 대응되는 설명을 유지한다.
- 내용은 구현 코드가 아니라 책임, 경계, 흐름을 설명한다.
