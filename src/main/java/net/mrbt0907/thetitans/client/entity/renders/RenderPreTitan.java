package net.mrbt0907.thetitans.client.entity.renders;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.mrbt0907.thetitans.entity.boss.EntityPreTitan;

public abstract class RenderPreTitan<T extends EntityPreTitan> extends RenderLiving<T>
{
	public RenderPreTitan(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn)
	{
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}
	
	@Override
	public boolean shouldRender(T titan, ICamera camera, double camX, double camY, double camZ)
	{
		return true;
	}
	
	public abstract boolean shouldSpecialRender(T titan);
	
	@Override
	protected void preRenderCallback(T titan, float partialTickTime)
	{
		float f1 = titan.getRenderSizeMultiplier();
		GL11.glScalef(f1, f1, f1);
		shadowSize = titan.getBaseWidth() * f1 * 0.8F;
		if (this.getDeathMaxRotation(titan) == 180F)
		{
			GL11.glTranslatef(0, titan.deathTime * 0.015F, 0);
		}
	}
}
