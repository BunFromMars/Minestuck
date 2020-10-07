package com.mraof.minestuck.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.client.model.ServerCursorModel;
import com.mraof.minestuck.computer.editmode.ServerEditHandler;
import com.mraof.minestuck.entity.CursorEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CursorRenderer extends EntityRenderer<CursorEntity>
{
	
	private static final ResourceLocation CURSOR_TEXTURES = new ResourceLocation(Minestuck.MOD_ID, "textures/entity/cursor.png");
	protected final EntityModel<CursorEntity> cursorModel = new ServerCursorModel();
	
	public CursorRenderer(EntityRendererManager renderManager)
	{
		super(renderManager);
	}
	
	@Override
	public ResourceLocation getEntityTexture(CursorEntity entity)
	{
		return CURSOR_TEXTURES;
	}
	
	@Override
	public void render(CursorEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn)
	{
		matrixStackIn.push();
		matrixStackIn.translate(0, 1, 0);
		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(0F));
		matrixStackIn.rotate(Vector3f.YP.rotationDegrees(-120F - entityYaw));
		matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(-90F));
		matrixStackIn.scale(1.5F, 1.5F, 1.5F);
		IVertexBuilder ivertexbuilder = bufferIn.getBuffer(this.cursorModel.getRenderType(this.getEntityTexture(entityIn)));
		this.cursorModel.render(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStackIn.pop();
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	}
}
