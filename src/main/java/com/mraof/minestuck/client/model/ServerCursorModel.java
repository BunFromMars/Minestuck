// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package com.mraof.minestuck.client.model;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.entity.CursorEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class ServerCursorModel extends AnimatedEntityModel<CursorEntity> {

    private final AnimatedModelRenderer cursor;
	private final AnimatedModelRenderer roof1;
	private final AnimatedModelRenderer roof2;
	private final AnimatedModelRenderer topleft;
	private final AnimatedModelRenderer middle;
	private final AnimatedModelRenderer topright;
	private final AnimatedModelRenderer bottomright;
	private final AnimatedModelRenderer bottomleft;

    public ServerCursorModel()
    {
        textureWidth = 16;
    textureHeight = 16;
    cursor = new AnimatedModelRenderer(this);
		cursor.setRotationPoint(0.75F, 13.75F, 0.0F);
		setRotationAngle(cursor, 0.0F, 0.0F, -1.5708F);
		
		cursor.setModelRendererName("cursor");
		this.registerModelRenderer(cursor);

		roof1 = new AnimatedModelRenderer(this);
		roof1.setRotationPoint(0.5F, 1.75F, 0.0F);
		cursor.addChild(roof1);
		roof1.setTextureOffset(0, 11).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		roof1.setTextureOffset(0, 1).addBox(4.0F, -4.0F, 0.0F, 1.0F, 4.0F, 12.0F, 0.0F, false);
		roof1.setTextureOffset(0, 3).addBox(3.0F, -4.0F, 0.0F, 1.0F, 4.0F, 9.0F, 0.0F, false);
		roof1.setTextureOffset(0, 0).addBox(2.0F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		roof1.setTextureOffset(1, 7).addBox(1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);
		roof1.setTextureOffset(2, 7).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		roof1.setModelRendererName("roof1");
		this.registerModelRenderer(roof1);

		roof2 = new AnimatedModelRenderer(this);
		roof2.setRotationPoint(18.5F, 1.75F, -25.0F);
		cursor.addChild(roof2);
		roof2.setTextureOffset(0, 1).addBox(-13.0F, -4.0F, 13.0F, 1.0F, 4.0F, 12.0F, 0.0F, false);
		roof2.setTextureOffset(1, 10).addBox(-18.0F, -4.0F, 24.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		roof2.setTextureOffset(0, 3).addBox(-18.0F, -4.0F, 18.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
		roof2.setTextureOffset(1, 7).addBox(-15.0F, -4.0F, 17.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		roof2.setTextureOffset(1, 7).addBox(-16.0F, -4.0F, 22.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		roof2.setTextureOffset(0, 8).addBox(-17.0F, -4.0F, 22.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		roof2.setTextureOffset(1, 2).addBox(-14.0F, -4.0F, 15.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		roof2.setModelRendererName("roof2");
		this.registerModelRenderer(roof2);

		topleft = new AnimatedModelRenderer(this);
		topleft.setRotationPoint(24.5F, 1.75F, -14.0F);
		cursor.addChild(topleft);
		topleft.setTextureOffset(0, 0).addBox(-17.0F, -4.0F, 5.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		topleft.setModelRendererName("topleft");
		this.registerModelRenderer(topleft);

		middle = new AnimatedModelRenderer(this);
		middle.setRotationPoint(13.5F, 1.75F, 2.0F);
		cursor.addChild(middle);
		middle.setTextureOffset(6, 10).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		middle.setModelRendererName("middle");
		this.registerModelRenderer(middle);

		topright = new AnimatedModelRenderer(this);
		topright.setRotationPoint(10.75F, 1.75F, 5.0F);
		cursor.addChild(topright);
		topright.setTextureOffset(0, 9).addBox(-0.25F, -4.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		topright.setTextureOffset(0, 5).addBox(-4.25F, -4.0F, -4.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
		topright.setModelRendererName("topright");
		this.registerModelRenderer(topright);

		bottomright = new AnimatedModelRenderer(this);
		bottomright.setRotationPoint(24.5F, 1.75F, -14.0F);
		cursor.addChild(bottomright);
		bottomright.setTextureOffset(0, 5).addBox(-8.0F, -4.0F, 14.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		bottomright.setModelRendererName("bottomright");
		this.registerModelRenderer(bottomright);

		bottomleft = new AnimatedModelRenderer(this);
		bottomleft.setRotationPoint(24.5F, 1.75F, -14.0F);
		cursor.addChild(bottomleft);
		bottomleft.setTextureOffset(0, 8).addBox(-8.0F, -4.0F, 5.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		bottomleft.setModelRendererName("bottomleft");
		this.registerModelRenderer(bottomleft);

    this.rootBones.add(cursor);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation(Minestuck.MOD_ID,"animations/cursor_animations.json");
    }
}