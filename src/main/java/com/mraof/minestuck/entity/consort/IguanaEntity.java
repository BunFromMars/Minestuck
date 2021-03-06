package com.mraof.minestuck.entity.consort;

import com.mraof.minestuck.util.MSSoundEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class IguanaEntity extends ConsortEntity
{
	
	public IguanaEntity(EntityType<? extends IguanaEntity> type, World world)
	{
		super(type, world);
	}
	
	protected SoundEvent getAmbientSound()
	{
		return MSSoundEvents.ENTITY_IGUANA_AMBIENT;
	}
	
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return MSSoundEvents.ENTITY_IGUANA_HURT;
	}
	
	protected SoundEvent getDeathSound()
	{
		return MSSoundEvents.ENTITY_IGUANA_DEATH;
	}
	
	@Override
	public EnumConsort getConsortType()
	{
		return EnumConsort.IGUANA;
	}
}