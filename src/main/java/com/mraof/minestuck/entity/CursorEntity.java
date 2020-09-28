package com.mraof.minestuck.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkHooks;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class CursorEntity extends Entity implements IAnimatedEntity
{
	public boolean markedForDespawn;
	private final ServerPlayerEntity playerEntity;
	
	public CursorEntity(World world)
	{
		super(MSEntityTypes.SERVER_CURSOR, world);
		playerEntity = null;
		if(!world.isRemote)	//If not spawned the way it should
			markedForDespawn = true;
	}
	
	public CursorEntity(ServerWorld world, ServerPlayerEntity player)
	{
		super(MSEntityTypes.SERVER_CURSOR, world);
		playerEntity = player;
	}
	
	@Override
	protected void registerData()
	{
	
	}
	
	@Override
	protected void readAdditional(CompoundNBT compound)
	{
	
	}
	
	@Override
	protected void writeAdditional(CompoundNBT compound)
	{
	
	}
	
	@Override
	public IPacket<?> createSpawnPacket()
	{
		return NetworkHooks.getEntitySpawningPacket(this);
	}
	
	@Override
	public void tick()
	{
		if(markedForDespawn)
		{
			this.remove();
			return;
		}
		super.tick();
		if(playerEntity != null)
		{
			this.setPositionAndRotation(playerEntity.getPosX(), playerEntity.getPosY(), playerEntity.getPosZ(), playerEntity.rotationYaw, playerEntity.rotationPitch);
		}
	}
	
	@Override
	public EntityAnimationManager getAnimationManager() //TODO setup animation manager for cursor
	{
		return null;
	}
}