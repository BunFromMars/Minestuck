package com.mraof.minestuck.client.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import com.mojang.blaze3d.matrix.*;
import net.minecraft.entity.*;

public class ServerCursorModel extends EntityModel<Entity> {
	private final ModelRenderer cursor;

	public ServerCursorModel() {
		textureWidth = 16;
		textureHeight = 16;

		cursor = new ModelRenderer(this);
		cursor.setRotationPoint(11.0F, 24.0F, -12.0F);
		cursor.setTextureOffset(0, 5).addBox(-8.0F, -4.0F, 14.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		cursor.setTextureOffset(0, 8).addBox(-8.0F, -4.0F, 5.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		cursor.setTextureOffset(0, 0).addBox(-17.0F, -4.0F, 5.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		cursor.setTextureOffset(6, 10).addBox(-13.0F, -4.0F, 14.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cursor.setTextureOffset(0, 9).addBox(-14.0F, -4.0F, 19.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cursor.setTextureOffset(0, 5).addBox(-18.0F, -4.0F, 15.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
		cursor.setTextureOffset(0, 1).addBox(-19.0F, -4.0F, 2.0F, 1.0F, 4.0F, 12.0F, 0.0F, false);
		cursor.setTextureOffset(0, 1).addBox(-20.0F, -4.0F, 14.0F, 1.0F, 4.0F, 12.0F, 0.0F, false);
		cursor.setTextureOffset(0, 3).addBox(-21.0F, -4.0F, 14.0F, 1.0F, 4.0F, 9.0F, 0.0F, false);
		cursor.setTextureOffset(0, 0).addBox(-22.0F, -4.0F, 14.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		cursor.setTextureOffset(1, 7).addBox(-23.0F, -4.0F, 14.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);
		cursor.setTextureOffset(2, 7).addBox(-24.0F, -4.0F, 14.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		cursor.setTextureOffset(0, 11).addBox(-25.0F, -4.0F, 14.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cursor.setTextureOffset(1, 2).addBox(-20.0F, -4.0F, 4.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		cursor.setTextureOffset(0, 8).addBox(-23.0F, -4.0F, 11.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		cursor.setTextureOffset(1, 7).addBox(-22.0F, -4.0F, 11.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		cursor.setTextureOffset(1, 7).addBox(-21.0F, -4.0F, 6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cursor.setTextureOffset(1, 10).addBox(-24.0F, -4.0F, 13.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cursor.setTextureOffset(0, 3).addBox(-24.0F, -4.0F, 7.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		cursor.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}