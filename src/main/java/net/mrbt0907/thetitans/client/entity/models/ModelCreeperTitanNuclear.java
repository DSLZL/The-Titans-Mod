package net.mrbt0907.thetitans.client.entity.models;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.mrbt0907.util.util.math.Maths;

/**
 * ModelCreeperTitanNuclear - AvimalaJade
 * Created using Tabula 8.0.0
 */
@SideOnly(Side.CLIENT)
public class ModelCreeperTitanNuclear extends ModelBase
{
    public float[] modelScale = new float[] { 0.4F, 0.4F, 0.4F };
    public ModelRenderer ThighL;
    public ModelRenderer ThighR;
    public ModelRenderer Body;
    public ModelRenderer upperHindLegL;
    public ModelRenderer FootL;
    public ModelRenderer Claw6;
    public ModelRenderer Claw7;
    public ModelRenderer Claw8;
    public ModelRenderer Claw9;
    public ModelRenderer upperHindLegR;
    public ModelRenderer FootR;
    public ModelRenderer Claw14;
    public ModelRenderer Claw15;
    public ModelRenderer Claw16;
    public ModelRenderer Claw17;
    public ModelRenderer Tail;
    public ModelRenderer Torso;
    public ModelRenderer neck1;
    public ModelRenderer ShoulderL;
    public ModelRenderer ShoulderR;
    public ModelRenderer neck2;
    public ModelRenderer neck3;
    public ModelRenderer collar;
    public ModelRenderer Head;
    public ModelRenderer HeadSpike1L;
    public ModelRenderer HeadSpike1R;
    public ModelRenderer HeadSpike2L;
    public ModelRenderer HeadSpike2R;
    public ModelRenderer HeadSpike3L;
    public ModelRenderer HeadSpike3R;
    public ModelRenderer HeadSpike4L;
    public ModelRenderer HeadSpike4R;
    public ModelRenderer HeadSpike5L;
    public ModelRenderer HeadSpike5R;
    public ModelRenderer Mouth;
    public ModelRenderer EyebrowL;
    public ModelRenderer EyebrowR;
    public ModelRenderer PupilL;
    public ModelRenderer PupilR;
    public ModelRenderer Hair1;
    public ModelRenderer part1;
    public ModelRenderer part2;
    public ModelRenderer part3;
    public ModelRenderer part4;
    public ModelRenderer part5;
    public ModelRenderer part6;
    public ModelRenderer part7;
    public ModelRenderer part8;
    public ModelRenderer part9;
    public ModelRenderer part10;
    public ModelRenderer part11;
    public ModelRenderer part12;
    public ModelRenderer part13;
    public ModelRenderer part14;
    public ModelRenderer part15;
    public ModelRenderer part16;
    public ModelRenderer part17;
    public ModelRenderer part18;
    public ModelRenderer part19;
    public ModelRenderer part20;
    public ModelRenderer Jaw;
    public ModelRenderer bridge;
    public ModelRenderer fang1;
    public ModelRenderer fang2;
    public ModelRenderer tusk;
    public ModelRenderer h1;
    public ModelRenderer Hair2;
    public ModelRenderer h2;
    public ModelRenderer h3;
    public ModelRenderer h4;
    public ModelRenderer h1_1;
    public ModelRenderer Hair3;
    public ModelRenderer h2_1;
    public ModelRenderer h3_1;
    public ModelRenderer h4_1;
    public ModelRenderer h5;
    public ModelRenderer h1_2;
    public ModelRenderer Hair4;
    public ModelRenderer h2_2;
    public ModelRenderer h3_2;
    public ModelRenderer h4_2;
    public ModelRenderer h5_1;
    public ModelRenderer h1_3;
    public ModelRenderer Hair5;
    public ModelRenderer h2_3;
    public ModelRenderer h3_3;
    public ModelRenderer h4_3;
    public ModelRenderer h5_2;
    public ModelRenderer h1_4;
    public ModelRenderer Hair6;
    public ModelRenderer h2_4;
    public ModelRenderer h3_4;
    public ModelRenderer h4_4;
    public ModelRenderer h5_3;
    public ModelRenderer h1_5;
    public ModelRenderer Hair7;
    public ModelRenderer h2_5;
    public ModelRenderer h3_5;
    public ModelRenderer h4_5;
    public ModelRenderer h5_4;
    public ModelRenderer h1_6;
    public ModelRenderer Hair8;
    public ModelRenderer h2_6;
    public ModelRenderer h3_6;
    public ModelRenderer h4_6;
    public ModelRenderer h5_5;
    public ModelRenderer h1_7;
    public ModelRenderer h2_7;
    public ModelRenderer h3_7;
    public ModelRenderer h4_7;
    public ModelRenderer UpperLegL;
    public ModelRenderer LowerForelegL;
    public ModelRenderer Claw1;
    public ModelRenderer Claw2;
    public ModelRenderer Claw4;
    public ModelRenderer Claw5;
    public ModelRenderer UpperLegR;
    public ModelRenderer LowerForelegR;
    public ModelRenderer Claw10;
    public ModelRenderer Claw11;
    public ModelRenderer Claw12;
    public ModelRenderer Claw13;

    public ModelCreeperTitanNuclear() {
        this.textureWidth = 1024;
        this.textureHeight = 1024;
        this.tusk = new ModelRenderer(this, 0, 0);
        this.tusk.setRotationPoint(-12, 4, -7);
        this.tusk.addBox(0, -16, 0, 4, 16, 4, 1);
        this.setRotateAngle(tusk, 0, 0, -0.5082398928281348F);
        this.LowerForelegL = new ModelRenderer(this, 0, 595);
        this.LowerForelegL.setRotationPoint(0, 55, -4);
        this.LowerForelegL.addBox(-16, 0, -16, 32, 128, 32, 1);
        this.setRotateAngle(LowerForelegL, 0.6457718232379019F, 0, 0);
        this.h2_5 = new ModelRenderer(this, 192, 0);
        this.h2_5.setRotationPoint(0, -15, 0);
        this.h2_5.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h2_5, 0, 0, -0.5473352640780661F);
        this.upperHindLegR = new ModelRenderer(this, 112, 514);
        this.upperHindLegR.mirror = true;
        this.upperHindLegR.setRotationPoint(-12, 58.5F, -5);
        this.upperHindLegR.addBox(-11.5F, 0, -16, 23, 64, 32, 1);
        this.setRotateAngle(upperHindLegR, 0.7853981633974483F, 0, 0);
        this.h3_4 = new ModelRenderer(this, 192, 0);
        this.h3_4.setRotationPoint(1, -14, 0);
        this.h3_4.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h3_4, 0, 0, -0.7037167490777915F);
        this.neck2 = new ModelRenderer(this, 416, 0);
        this.neck2.setRotationPoint(0, -42.5F, -0.5F);
        this.neck2.addBox(-24, -48, -16, 48, 48, 32, 1);
        this.setRotateAngle(neck2, -0.3490658503988659F, 0, 0);
        this.part18 = new ModelRenderer(this, 554, 92);
        this.part18.setRotationPoint(39, 0, 0);
        this.part18.addBox(0, -2, -2, 40, 4, 4, 1);
        this.setRotateAngle(part18, 0, -0.11728612207217244F, 0);
        this.FootL = new ModelRenderer(this, 256, 607);
        this.FootL.setRotationPoint(0, 53, 11);
        this.FootL.addBox(-14, 0, -16, 28, 145, 32, 1);
        this.setRotateAngle(FootL, -1.1344640137963142F, 0, 0);
        this.Claw13 = new ModelRenderer(this, 259, 82);
        this.Claw13.setRotationPoint(14, 120, 6);
        this.Claw13.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw13, 0, -1.0471975511965976F, 0);
        this.h5_3 = new ModelRenderer(this, 192, 0);
        this.h5_3.setRotationPoint(0, -13, 0);
        this.h5_3.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h5_3, 0, 0, -0.23457224414434488F);
        this.part17 = new ModelRenderer(this, 552, 90);
        this.part17.setRotationPoint(39, 0, 0);
        this.part17.addBox(0, -3, -3, 40, 6, 6, 1);
        this.setRotateAngle(part17, 0, -0.11728612207217244F, 0);
        this.Hair6 = new ModelRenderer(this, 192, 0);
        this.Hair6.setRotationPoint(0, -1, -8);
        this.Hair6.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(Hair6, 0, 0, -0.46914448828868976F);
        this.part3 = new ModelRenderer(this, 323, 89);
        this.part3.setRotationPoint(46, 0, 0);
        this.part3.addBox(0, -3, -3, 48, 6, 6, 1);
        this.setRotateAngle(part3, 0, -0.03909537541112055F, 0.0781907508222411F);
        this.HeadSpike1L = new ModelRenderer(this, 317, 82);
        this.HeadSpike1L.setRotationPoint(28, -40, 15);
        this.HeadSpike1L.addBox(0, -6, -6, 48, 12, 12, 1);
        this.setRotateAngle(HeadSpike1L, 0.6981317007977318F, -0.15707963267948966F, -0.3141592653589793F);
        this.Claw10 = new ModelRenderer(this, 259, 82);
        this.Claw10.setRotationPoint(-8, 120, -8);
        this.Claw10.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw10, 0, 0.3490658503988659F, 0);
        this.h2 = new ModelRenderer(this, 192, 0);
        this.h2.setRotationPoint(0, -15, 0);
        this.h2.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h2, 0, 0, -0.7819074915776542F);
        this.h5_1 = new ModelRenderer(this, 192, 0);
        this.h5_1.setRotationPoint(0, -13, 0);
        this.h5_1.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h5_1, 0, 0, -0.11728612207217244F);
        this.Body = new ModelRenderer(this, 0, 273);
        this.Body.setRotationPoint(0, -190, 60);
        this.Body.addBox(-28, -24, -80, 56, 48, 80, 1);
        this.Claw11 = new ModelRenderer(this, 259, 82);
        this.Claw11.setRotationPoint(0, 120, -13);
        this.Claw11.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.HeadSpike1R = new ModelRenderer(this, 317, 82);
        this.HeadSpike1R.setRotationPoint(-28, -40, 15);
        this.HeadSpike1R.addBox(0, -6, -6, 48, 12, 12, 1);
        this.setRotateAngle(HeadSpike1R, -0.6981317007977318F, -2.9845130209103035F, 0.3141592653589793F);
        this.h4 = new ModelRenderer(this, 192, 0);
        this.h4.setRotationPoint(0, -13, 0);
        this.h4.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.h1_7 = new ModelRenderer(this, 192, 0);
        this.h1_7.setRotationPoint(0, -14, 0);
        this.h1_7.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h1_7, 0, 0, -0.7819074915776542F);
        this.HeadSpike4L = new ModelRenderer(this, 650, 92);
        this.HeadSpike4L.setRotationPoint(25, -5, -10);
        this.HeadSpike4L.addBox(0, -3, -3, 36, 6, 6, 1);
        this.setRotateAngle(HeadSpike4L, 0.6981317007977318F, 0.3141592653589793F, 0.3127630032889644F);
        this.h1_1 = new ModelRenderer(this, 192, 0);
        this.h1_1.setRotationPoint(0, -14, 0);
        this.h1_1.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h1_1, 0, 0, -0.7819074915776542F);
        this.EyebrowR = new ModelRenderer(this, 0, 22);
        this.EyebrowR.setRotationPoint(-19.5F, -36.5F, -32);
        this.EyebrowR.addBox(-13, -2, -1, 26, 4, 2, 1);
        this.h4_2 = new ModelRenderer(this, 192, 0);
        this.h4_2.setRotationPoint(0, -13, 0);
        this.h4_2.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h4_2, 0, 0, -0.23457224414434488F);
        this.LowerForelegR = new ModelRenderer(this, 128, 611);
        this.LowerForelegR.mirror = true;
        this.LowerForelegR.setRotationPoint(0, 55, -4);
        this.LowerForelegR.addBox(-16, 0, -16, 32, 128, 32, 1);
        this.setRotateAngle(LowerForelegR, 0.6457718232379019F, 0, 0);
        this.Hair3 = new ModelRenderer(this, 192, 0);
        this.Hair3.setRotationPoint(0, 0, -8);
        this.Hair3.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(Hair3, 0, 0, 0.35185837453889574F);
        this.h5_4 = new ModelRenderer(this, 192, 0);
        this.h5_4.setRotationPoint(0, -13, 0);
        this.h5_4.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h5_4, 0, 0, -0.23457224414434488F);
        this.collar = new ModelRenderer(this, 485, 109);
        this.collar.setRotationPoint(0, -30, 0);
        this.collar.addBox(-26, -6, -20, 52, 12, 40, 1);
        this.part1 = new ModelRenderer(this, 319, 84);
        this.part1.setRotationPoint(46, 0, 0);
        this.part1.addBox(0, -5, -5, 48, 10, 10, 1);
        this.setRotateAngle(part1, 0, -0.03909537541112055F, 0.0781907508222411F);
        this.h2_6 = new ModelRenderer(this, 192, 0);
        this.h2_6.setRotationPoint(0, -15, 0);
        this.h2_6.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h2_6, 0, 0, -0.5473352640780661F);
        this.fang2 = new ModelRenderer(this, 18, 0);
        this.fang2.mirror = true;
        this.fang2.setRotationPoint(-9.5F, 12, -19);
        this.fang2.addBox(-2, 0, 0, 2, 6, 4, 1);
        this.h3_2 = new ModelRenderer(this, 192, 0);
        this.h3_2.setRotationPoint(1, -14, 0);
        this.h3_2.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h3_2, 0, 0, -0.7819074915776542F);
        this.h3_3 = new ModelRenderer(this, 192, 0);
        this.h3_3.setRotationPoint(1, -14, 0);
        this.h3_3.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h3_3, 0, 0, -0.7819074915776542F);
        this.Mouth = new ModelRenderer(this, 736, 0);
        this.Mouth.setRotationPoint(0, -24, -32);
        this.Mouth.addBox(-12, 0, -24, 24, 12, 24, 1);
        this.part12 = new ModelRenderer(this, 438, 88);
        this.part12.setRotationPoint(40, 0, 0);
        this.part12.addBox(0, -4, -4, 44, 8, 8, 1);
        this.setRotateAngle(part12, 0, 0, 0.03909537541112055F);
        this.h4_4 = new ModelRenderer(this, 192, 0);
        this.h4_4.setRotationPoint(0, -13, 0);
        this.h4_4.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h4_4, 0, 0, -0.27366763203903305F);
        this.Hair8 = new ModelRenderer(this, 192, 0);
        this.Hair8.setRotationPoint(0, 0, -1.5F);
        this.Hair8.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(Hair8, 0.5473352640780661F, -0.35185837453889574F, -0.11728612207217244F);
        this.h3_5 = new ModelRenderer(this, 192, 0);
        this.h3_5.setRotationPoint(1, -14, 0);
        this.h3_5.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h3_5, 0, 0, -0.7037167490777915F);
        this.neck1 = new ModelRenderer(this, 256, 0);
        this.neck1.setRotationPoint(0, -20, -65);
        this.neck1.addBox(-24, -48, -16, 48, 48, 32, 1);
        this.setRotateAngle(neck1, 0.4886921905584123F, 0, 0);
        this.fang1 = new ModelRenderer(this, 18, 0);
        this.fang1.setRotationPoint(9.5F, 12, -19);
        this.fang1.addBox(0, 0, 0, 2, 6, 4, 1);
        this.Hair4 = new ModelRenderer(this, 192, 0);
        this.Hair4.setRotationPoint(0, 0, -8);
        this.Hair4.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(Hair4, 0, 0, 0.35185837453889574F);
        this.upperHindLegL = new ModelRenderer(this, 113, 514);
        this.upperHindLegL.setRotationPoint(12, 58.5F, -5);
        this.upperHindLegL.addBox(-11.5F, 0, -16, 23, 64, 32, 1);
        this.setRotateAngle(upperHindLegL, 0.7853981633974483F, 0, 0);
        this.part19 = new ModelRenderer(this, 652, 94);
        this.part19.setRotationPoint(35, 0, 0);
        this.part19.addBox(0, -2, -2, 36, 4, 4, 1);
        this.setRotateAngle(part19, 0, 0.3141592653589793F, 0);
        this.Hair2 = new ModelRenderer(this, 192, 0);
        this.Hair2.setRotationPoint(0, 0, -8);
        this.Hair2.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.Claw17 = new ModelRenderer(this, 273, 130);
        this.Claw17.setRotationPoint(6, 117, 0);
        this.Claw17.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw17, 0.7853981633974483F, -1.0471975511965976F, 0);
        this.h3_7 = new ModelRenderer(this, 192, 0);
        this.h3_7.setRotationPoint(1, -14, 0);
        this.h3_7.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h3_7, 0, 0, -0.7037167490777915F);
        this.h1 = new ModelRenderer(this, 192, 0);
        this.h1.setRotationPoint(0, -14, 0);
        this.h1.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h1, 0, 0, -0.7819074915776542F);
        this.Claw8 = new ModelRenderer(this, 401, 114);
        this.Claw8.setRotationPoint(5, 137, -6);
        this.Claw8.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw8, 0, -0.6108652381980153F, 0);
        this.PupilL = new ModelRenderer(this, 0, 32);
        this.PupilL.setRotationPoint(19.5F, -32.2F, -30.3F);
        this.PupilL.addBox(-4.5F, -2.5F, -2, 9, 5, 2, 1);
        this.h2_4 = new ModelRenderer(this, 192, 0);
        this.h2_4.setRotationPoint(0, -15, 0);
        this.h2_4.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h2_4, 0, 0, -0.7819074915776542F);
        this.h5 = new ModelRenderer(this, 192, 0);
        this.h5.setRotationPoint(0, -13, 0);
        this.h5.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.HeadSpike4R = new ModelRenderer(this, 650, 92);
        this.HeadSpike4R.setRotationPoint(-25, -5, -10);
        this.HeadSpike4R.addBox(0, -3, -3, 36, 6, 6, 1);
        this.setRotateAngle(HeadSpike4R, 0.6981317007977318F, 2.827433388230814F, -0.3127630032889644F);
        this.part7 = new ModelRenderer(this, 323, 88);
        this.part7.setRotationPoint(46, 0, 0);
        this.part7.addBox(0, -3, -3, 48, 6, 6, 1);
        this.setRotateAngle(part7, 0, 0.03909537541112055F, 0.0781907508222411F);
        this.HeadSpike5L = new ModelRenderer(this, 738, 95);
        this.HeadSpike5L.setRotationPoint(20, -5, -18);
        this.HeadSpike5L.addBox(0, -2, -2, 30, 4, 4, 1);
        this.setRotateAngle(HeadSpike5L, 0, 0.7037167490777915F, 0.7037167490777915F);
        this.Hair7 = new ModelRenderer(this, 192, 0);
        this.Hair7.setRotationPoint(0, 0, -7);
        this.Hair7.addBox(-10, -16, -4, 10, 16, 8, 1.0F);
        this.setRotateAngle(Hair7, 0.0781907508222411F, -0.0781907508222411F, -0.11728612207217244F);
        this.part16 = new ModelRenderer(this, 554, 92);
        this.part16.setRotationPoint(39, 0, 0);
        this.part16.addBox(0, -2, -2, 40, 4, 4, 1);
        this.setRotateAngle(part16, 0, 0.11728612207217244F, 0);
        this.h2_2 = new ModelRenderer(this, 192, 0);
        this.h2_2.setRotationPoint(0, -15, 0);
        this.h2_2.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h2_2, 0, 0, -0.7819074915776542F);
        this.part4 = new ModelRenderer(this, 325, 91);
        this.part4.setRotationPoint(46, 0, 0);
        this.part4.addBox(0, -2, -2, 48, 4, 4, 1);
        this.setRotateAngle(part4, 0, -0.03909537541112055F, 0.0781907508222411F);
        this.h5_2 = new ModelRenderer(this, 192, 0);
        this.h5_2.setRotationPoint(0, -13, 0);
        this.h5_2.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h5_2, 0, 0, -0.3127630032889644F);
        this.h4_5 = new ModelRenderer(this, 192, 0);
        this.h4_5.setRotationPoint(0, -13, 0);
        this.h4_5.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h4_5, 0, 0, -0.27366763203903305F);
        this.h1_4 = new ModelRenderer(this, 192, 0);
        this.h1_4.setRotationPoint(0, -14, 0);
        this.h1_4.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h1_4, 0, 0, -0.7819074915776542F);
        this.h2_1 = new ModelRenderer(this, 192, 0);
        this.h2_1.setRotationPoint(0, -15, 0);
        this.h2_1.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h2_1, 0, 0, -0.7819074915776542F);
        this.part11 = new ModelRenderer(this, 442, 91);
        this.part11.setRotationPoint(40, 0, 0);
        this.part11.addBox(0, -2, -2, 44, 4, 4, 1);
        this.setRotateAngle(part11, 0, 0, 0.03909537541112055F);
        this.h2_7 = new ModelRenderer(this, 192, 0);
        this.h2_7.setRotationPoint(0, -15, 0);
        this.h2_7.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h2_7, 0, 0, -0.5473352640780661F);
        this.Claw1 = new ModelRenderer(this, 401, 114);
        this.Claw1.setRotationPoint(-8, 120, -9);
        this.Claw1.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw1, 0, 0.3490658503988659F, 0);
        this.part14 = new ModelRenderer(this, 442, 91);
        this.part14.setRotationPoint(40, 0, 0);
        this.part14.addBox(0, -2, -2, 44, 4, 4, 1);
        this.setRotateAngle(part14, 0, 0, 0.03909537541112055F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0, -45, 0);
        this.Head.addBox(-32, -64, -32, 64, 64, 64, 1);
        this.setRotateAngle(Head, 0.06981317007977318F, 0, 0);
        this.part2 = new ModelRenderer(this, 323, 88);
        this.part2.setRotationPoint(46, 0, 0);
        this.part2.addBox(0, -4, -4, 48, 8, 8, 1);
        this.setRotateAngle(part2, 0, -0.03909537541112055F, 0.0781907508222411F);
        this.h4_1 = new ModelRenderer(this, 192, 0);
        this.h4_1.setRotationPoint(0, -13, 0);
        this.h4_1.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.UpperLegR = new ModelRenderer(this, 0, 499);
        this.UpperLegR.mirror = true;
        this.UpperLegR.setRotationPoint(-12, 42, 5);
        this.UpperLegR.addBox(-12, 0, -16, 24, 64, 32, 1);
        this.setRotateAngle(UpperLegR, -0.7853981633974483F, 0, 0);
        this.Claw12 = new ModelRenderer(this, 259, 82);
        this.Claw12.setRotationPoint(8, 120, -9);
        this.Claw12.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw12, 0, -0.3490658503988659F, 0);
        this.Claw9 = new ModelRenderer(this, 353, 130);
        this.Claw9.setRotationPoint(-6, 117, 0);
        this.Claw9.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw9, 0.7853981633974483F, 1.0471975511965976F, 0);
        this.ShoulderR = new ModelRenderer(this, 225, 402);
        this.ShoulderR.mirror = true;
        this.ShoulderR.setRotationPoint(-30, -4, -60);
        this.ShoulderR.addBox(-24, -10, -16, 24, 64, 32, 1);
        this.setRotateAngle(ShoulderR, 0, 0.2617993877991494F, 0);
        this.Tail = new ModelRenderer(this, 209, 160);
        this.Tail.setRotationPoint(0, -15, -8);
        this.Tail.addBox(-8, -8, 0, 16, 16, 32, 1);
        this.setRotateAngle(Tail, 0.6981317007977318F, 0, 0);
        this.h3_1 = new ModelRenderer(this, 192, 0);
        this.h3_1.setRotationPoint(1, -14, 0);
        this.h3_1.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h3_1, 0, 0, -0.7819074915776542F);
        this.FootR = new ModelRenderer(this, 376, 607);
        this.FootR.mirror = true;
        this.FootR.setRotationPoint(0, 53, 11);
        this.FootR.addBox(-14, 0, -16, 28, 145, 32, 1);
        this.setRotateAngle(FootR, -1.1344640137963142F, 0, 0);
        this.ThighR = new ModelRenderer(this, 112, 402);
        this.ThighR.mirror = true;
        this.ThighR.setRotationPoint(-16, -190, 40);
        this.ThighR.addBox(-24, -10, -16, 24, 80, 32, 1);
        this.setRotateAngle(ThighR, 0.3490658503988659F, 0, 0.03909537541112055F);
        this.Claw15 = new ModelRenderer(this, 259, 82);
        this.Claw15.setRotationPoint(-0.5F, 137, -7);
        this.Claw15.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw15, 0, 0.17453292519943295F, 0);
        this.h4_7 = new ModelRenderer(this, 192, 0);
        this.h4_7.setRotationPoint(0, -13, 0);
        this.h4_7.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h4_7, 0, 0, -0.27366763203903305F);
        this.part9 = new ModelRenderer(this, 438, 88);
        this.part9.setRotationPoint(40, 0, 0);
        this.part9.addBox(0, -4, -4, 44, 8, 8, 1);
        this.setRotateAngle(part9, 0, 0, 0.03909537541112055F);
        this.part20 = new ModelRenderer(this, 652, 94);
        this.part20.setRotationPoint(35, 0, 0);
        this.part20.addBox(0, -2, -2, 36, 4, 4, 1);
        this.setRotateAngle(part20, 0, 0.03839724437611309F, 0.19547687289441354F);
        this.HeadSpike3R = new ModelRenderer(this, 550, 88);
        this.HeadSpike3R.setRotationPoint(-26, -15, 0);
        this.HeadSpike3R.addBox(0, -4, -4, 40, 8, 8, 1);
        this.setRotateAngle(HeadSpike3R, -0.6981317007977318F, 2.9852110354320134F, -0.0781907508222411F);
        this.Claw7 = new ModelRenderer(this, 401, 114);
        this.Claw7.setRotationPoint(0.5F, 137, -7);
        this.Claw7.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw7, 0, -0.17453292519943295F, 0);
        this.HeadSpike5R = new ModelRenderer(this, 738, 95);
        this.HeadSpike5R.setRotationPoint(-20, -5, -18);
        this.HeadSpike5R.addBox(0, -2, -2, 30, 4, 4, 1);
        this.setRotateAngle(HeadSpike5R, 0, 2.4378757713539474F, -0.7037167490777915F);
        this.HeadSpike2L = new ModelRenderer(this, 437, 84);
        this.HeadSpike2L.setRotationPoint(28, -30, 5);
        this.HeadSpike2L.addBox(0, -5, -5, 44, 10, 10, 1);
        this.setRotateAngle(HeadSpike2L, 0.6981317007977318F, -0.1563815016444822F, 0);
        this.HeadSpike3L = new ModelRenderer(this, 550, 88);
        this.HeadSpike3L.setRotationPoint(26, -15, 0);
        this.HeadSpike3L.addBox(0, -4, -4, 40, 8, 8, 1);
        this.setRotateAngle(HeadSpike3L, 0.6981317007977318F, 0.1563815016444822F, 0.0781907508222411F);
        this.part5 = new ModelRenderer(this, 319, 84);
        this.part5.setRotationPoint(46, 0, 0);
        this.part5.addBox(0, -5, -5, 48, 10, 10, 1);
        this.setRotateAngle(part5, 0, 0.03909537541112055F, 0.0781907508222411F);
        this.h2_3 = new ModelRenderer(this, 192, 0);
        this.h2_3.setRotationPoint(0, -15, 0);
        this.h2_3.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h2_3, 0, 0, -0.7819074915776542F);
        this.h3_6 = new ModelRenderer(this, 192, 0);
        this.h3_6.setRotationPoint(1, -14, 0);
        this.h3_6.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h3_6, 0, 0, -0.7037167490777915F);
        this.h3 = new ModelRenderer(this, 192, 0);
        this.h3.setRotationPoint(1, -14, 0);
        this.h3.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h3, 0, 0, -0.7819074915776542F);
        this.EyebrowL = new ModelRenderer(this, 0, 22);
        this.EyebrowL.setRotationPoint(19.5F, -36.5F, -32);
        this.EyebrowL.addBox(-13, -2, -1, 26, 4, 2, 1);
        this.part8 = new ModelRenderer(this, 325, 90);
        this.part8.setRotationPoint(46, 0, 0);
        this.part8.addBox(0, -2, -2, 48, 4, 4, 1);
        this.setRotateAngle(part8, 0, 0.03909537541112055F, 0.0781907508222411F);
        this.part13 = new ModelRenderer(this, 440, 89);
        this.part13.setRotationPoint(40, 0, 0);
        this.part13.addBox(0, -3, -3, 44, 6, 6, 1);
        this.setRotateAngle(part13, 0, 0, 0.03909537541112055F);
        this.part6 = new ModelRenderer(this, 321, 86);
        this.part6.setRotationPoint(46, 0, 0);
        this.part6.addBox(0, -4, -4, 48, 8, 8, 1);
        this.setRotateAngle(part6, 0, 0.03909537541112055F, 0.0781907508222411F);
        this.Claw5 = new ModelRenderer(this, 401, 114);
        this.Claw5.setRotationPoint(-14, 120, 6);
        this.Claw5.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw5, 0, 1.0471975511965976F, 0);
        this.ThighL = new ModelRenderer(this, 113, 402);
        this.ThighL.setRotationPoint(16, -190, 40);
        this.ThighL.addBox(0, -10, -16, 24, 80, 32, 1);
        this.setRotateAngle(ThighL, 0.3490658503988659F, 0, -0.03909537541112055F);
        this.part10 = new ModelRenderer(this, 440, 89);
        this.part10.setRotationPoint(40, 0, 0);
        this.part10.addBox(0, -3, -3, 44, 6, 6, 1);
        this.setRotateAngle(part10, 0, 0, 0.03909537541112055F);
        this.Claw16 = new ModelRenderer(this, 259, 82);
        this.Claw16.setRotationPoint(8, 137, -8);
        this.Claw16.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw16, 0, -0.17453292519943295F, 0);
        this.h5_5 = new ModelRenderer(this, 192, 0);
        this.h5_5.setRotationPoint(0, -13, 0);
        this.h5_5.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h5_5, 0, 0, -0.23457224414434488F);
        this.neck3 = new ModelRenderer(this, 576, 0);
        this.neck3.setRotationPoint(0, -42.5F, -0.5F);
        this.neck3.addBox(-24, -48, -16, 48, 48, 32, 1);
        this.setRotateAngle(neck3, -0.3490658503988659F, 0, 0);
        this.Hair5 = new ModelRenderer(this, 192, 0);
        this.Hair5.setRotationPoint(0, 0, -8);
        this.Hair5.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(Hair5, 0, 0, -0.23457224414434488F);
        this.h1_6 = new ModelRenderer(this, 192, 0);
        this.h1_6.setRotationPoint(0, -14, 0);
        this.h1_6.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h1_6, 0, 0, -0.7819074915776542F);
        this.Torso = new ModelRenderer(this, 0, 129);
        this.Torso.setRotationPoint(0, 0, -70);
        this.Torso.addBox(-32, -32, -80, 64, 64, 80, 1);
        this.setRotateAngle(Torso, 0.13962634015954636F, 0, 0);
        this.Claw4 = new ModelRenderer(this, 401, 114);
        this.Claw4.setRotationPoint(8, 120, -8);
        this.Claw4.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw4, 0, -0.3490658503988659F, 0);
        this.bridge = new ModelRenderer(this, 832, 0);
        this.bridge.setRotationPoint(0, -8, 0);
        this.bridge.addBox(-6, 0, -24, 12, 12, 24, 1);
        this.setRotateAngle(bridge, 0.3490658503988659F, 0, 0);
        this.Hair1 = new ModelRenderer(this, 192, 0);
        this.Hair1.setRotationPoint(0, -63, 22.5F);
        this.Hair1.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(Hair1, 0, 0, -0.7819074915776542F);
        this.h1_2 = new ModelRenderer(this, 192, 0);
        this.h1_2.setRotationPoint(0, -14, 0);
        this.h1_2.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h1_2, 0, 0, -0.7819074915776542F);
        this.UpperLegL = new ModelRenderer(this, 0, 499);
        this.UpperLegL.setRotationPoint(12, 42, 5);
        this.UpperLegL.addBox(-12, 0, -16, 24, 64, 32, 1);
        this.setRotateAngle(UpperLegL, -0.7853981633974483F, 0, 0);
        this.part15 = new ModelRenderer(this, 552, 90);
        this.part15.setRotationPoint(39, 0, 0);
        this.part15.addBox(0, -3, -3, 40, 6, 6, 1);
        this.setRotateAngle(part15, 0, 0.11728612207217244F, 0);
        this.h4_6 = new ModelRenderer(this, 192, 0);
        this.h4_6.setRotationPoint(0, -13, 0);
        this.h4_6.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h4_6, 0, 0, -0.27366763203903305F);
        this.Claw2 = new ModelRenderer(this, 401, 114);
        this.Claw2.setRotationPoint(0, 120, -13);
        this.Claw2.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.HeadSpike2R = new ModelRenderer(this, 437, 84);
        this.HeadSpike2R.setRotationPoint(-28, -30, 5);
        this.HeadSpike2R.addBox(0, -5, -5, 44, 10, 10, 1);
        this.setRotateAngle(HeadSpike2R, -0.6981317007977318F, -2.9852110354320134F, 0);
        this.h4_3 = new ModelRenderer(this, 192, 0);
        this.h4_3.setRotationPoint(0, -13, 0);
        this.h4_3.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h4_3, 0, 0, -0.35185837453889574F);
        this.h1_5 = new ModelRenderer(this, 192, 0);
        this.h1_5.setRotationPoint(0, -14, 0);
        this.h1_5.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h1_5, 0, 0, -0.7819074915776542F);
        this.h1_3 = new ModelRenderer(this, 192, 0);
        this.h1_3.setRotationPoint(0, -14, 0);
        this.h1_3.addBox(-10, -16, -4, 10, 16, 8, 1);
        this.setRotateAngle(h1_3, 0, 0, -0.7819074915776542F);
        this.Claw14 = new ModelRenderer(this, 259, 82);
        this.Claw14.setRotationPoint(-5, 137, -6);
        this.Claw14.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw14, 0, 0.6108652381980153F, 0);
        this.PupilR = new ModelRenderer(this, 0, 39);
        this.PupilR.setRotationPoint(-19.5F, -32.2F, -30.5F);
        this.PupilR.addBox(-4.5F, -2.5F, -2, 9, 5, 2, 1);
        this.Jaw = new ModelRenderer(this, 736, 36);
        this.Jaw.setRotationPoint(0, 10, 0);
        this.Jaw.addBox(-12, 0, -24, 24, 14, 24, 1);
        this.setRotateAngle(Jaw, 0.19547687289441354F, 0, 0);
        this.ShoulderL = new ModelRenderer(this, 0, 402);
        this.ShoulderL.setRotationPoint(30, -4, -60);
        this.ShoulderL.addBox(0, -10, -16, 24, 64, 32, 1);
        this.setRotateAngle(ShoulderL, 0, -0.2617993877991494F, 0);
        this.Claw6 = new ModelRenderer(this, 401, 114);
        this.Claw6.setRotationPoint(-8, 137, -8);
        this.Claw6.addBox(-4, -8, -32, 8, 16, 32, 1);
        this.setRotateAngle(Claw6, 0, 0.17453292519943295F, 0);
        this.Jaw.addChild(this.tusk);
        this.UpperLegL.addChild(this.LowerForelegL);
        this.h1_5.addChild(this.h2_5);
        this.ThighR.addChild(this.upperHindLegR);
        this.h2_4.addChild(this.h3_4);
        this.neck1.addChild(this.neck2);
        this.part17.addChild(this.part18);
        this.upperHindLegL.addChild(this.FootL);
        this.LowerForelegR.addChild(this.Claw13);
        this.h4_4.addChild(this.h5_3);
        this.HeadSpike3R.addChild(this.part17);
        this.Hair5.addChild(this.Hair6);
        this.part2.addChild(this.part3);
        this.Head.addChild(this.HeadSpike1L);
        this.LowerForelegR.addChild(this.Claw10);
        this.h1.addChild(this.h2);
        this.h4_2.addChild(this.h5_1);
        this.LowerForelegR.addChild(this.Claw11);
        this.Head.addChild(this.HeadSpike1R);
        this.h3.addChild(this.h4);
        this.Hair8.addChild(this.h1_7);
        this.Head.addChild(this.HeadSpike4L);
        this.Hair2.addChild(this.h1_1);
        this.Head.addChild(this.EyebrowR);
        this.h3_2.addChild(this.h4_2);
        this.UpperLegR.addChild(this.LowerForelegR);
        this.Hair2.addChild(this.Hair3);
        this.h4_5.addChild(this.h5_4);
        this.neck2.addChild(this.collar);
        this.HeadSpike1L.addChild(this.part1);
        this.h1_6.addChild(this.h2_6);
        this.Mouth.addChild(this.fang2);
        this.h2_2.addChild(this.h3_2);
        this.h2_3.addChild(this.h3_3);
        this.Head.addChild(this.Mouth);
        this.HeadSpike2R.addChild(this.part12);
        this.h3_4.addChild(this.h4_4);
        this.Hair7.addChild(this.Hair8);
        this.h2_5.addChild(this.h3_5);
        this.Torso.addChild(this.neck1);
        this.Mouth.addChild(this.fang1);
        this.Hair3.addChild(this.Hair4);
        this.ThighL.addChild(this.upperHindLegL);
        this.HeadSpike4L.addChild(this.part19);
        this.Hair1.addChild(this.Hair2);
        this.FootR.addChild(this.Claw17);
        this.h2_7.addChild(this.h3_7);
        this.Hair1.addChild(this.h1);
        this.FootL.addChild(this.Claw8);
        this.Head.addChild(this.PupilL);
        this.h1_4.addChild(this.h2_4);
        this.h4_1.addChild(this.h5);
        this.Head.addChild(this.HeadSpike4R);
        this.part6.addChild(this.part7);
        this.Head.addChild(this.HeadSpike5L);
        this.Hair6.addChild(this.Hair7);
        this.part15.addChild(this.part16);
        this.h1_2.addChild(this.h2_2);
        this.part3.addChild(this.part4);
        this.h4_3.addChild(this.h5_2);
        this.h3_5.addChild(this.h4_5);
        this.Hair5.addChild(this.h1_4);
        this.h1_1.addChild(this.h2_1);
        this.part10.addChild(this.part11);
        this.h1_7.addChild(this.h2_7);
        this.LowerForelegL.addChild(this.Claw1);
        this.part13.addChild(this.part14);
        this.neck3.addChild(this.Head);
        this.part1.addChild(this.part2);
        this.h3_1.addChild(this.h4_1);
        this.ShoulderR.addChild(this.UpperLegR);
        this.LowerForelegR.addChild(this.Claw12);
        this.FootL.addChild(this.Claw9);
        this.Torso.addChild(this.ShoulderR);
        this.Body.addChild(this.Tail);
        this.h2_1.addChild(this.h3_1);
        this.upperHindLegR.addChild(this.FootR);
        this.FootR.addChild(this.Claw15);
        this.h3_7.addChild(this.h4_7);
        this.HeadSpike2L.addChild(this.part9);
        this.HeadSpike4R.addChild(this.part20);
        this.Head.addChild(this.HeadSpike3R);
        this.FootL.addChild(this.Claw7);
        this.Head.addChild(this.HeadSpike5R);
        this.Head.addChild(this.HeadSpike2L);
        this.Head.addChild(this.HeadSpike3L);
        this.HeadSpike1R.addChild(this.part5);
        this.h1_3.addChild(this.h2_3);
        this.h2_6.addChild(this.h3_6);
        this.h2.addChild(this.h3);
        this.Head.addChild(this.EyebrowL);
        this.part7.addChild(this.part8);
        this.part12.addChild(this.part13);
        this.part5.addChild(this.part6);
        this.LowerForelegL.addChild(this.Claw5);
        this.part9.addChild(this.part10);
        this.FootR.addChild(this.Claw16);
        this.h4_6.addChild(this.h5_5);
        this.neck2.addChild(this.neck3);
        this.Hair4.addChild(this.Hair5);
        this.Hair7.addChild(this.h1_6);
        this.Body.addChild(this.Torso);
        this.LowerForelegL.addChild(this.Claw4);
        this.Mouth.addChild(this.bridge);
        this.Head.addChild(this.Hair1);
        this.Hair3.addChild(this.h1_2);
        this.ShoulderL.addChild(this.UpperLegL);
        this.HeadSpike3L.addChild(this.part15);
        this.h3_6.addChild(this.h4_6);
        this.LowerForelegL.addChild(this.Claw2);
        this.Head.addChild(this.HeadSpike2R);
        this.h3_3.addChild(this.h4_3);
        this.Hair6.addChild(this.h1_5);
        this.Hair4.addChild(this.h1_3);
        this.FootR.addChild(this.Claw14);
        this.Head.addChild(this.PupilR);
        this.Mouth.addChild(this.Jaw);
        this.Torso.addChild(this.ShoulderL);
        this.FootL.addChild(this.Claw6);
    }

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
        
        ImmutableList.of(this.Body, this.ThighR, this.ThighL).forEach((modelRenderer) -> { 
            modelRenderer.render(scale);
        });
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        float mult = (float) Math.min(Maths.speedSq(entityIn.motionX, entityIn.motionY, entityIn.motionZ) * 0.4F, 1.0F);
        float head_pitch = (headPitch * 0.017453292F), head_yaw = (netHeadYaw * 0.017453292F), right_swing =  MathHelper.cos(limbSwing * 0.6662F) * 0.6F * limbSwingAmount * mult, left_swing = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.6F * limbSwingAmount * mult;
        
    	setRotateAngle(Head, head_pitch * 0.5F, head_yaw * 0.5F, 0.0F);
    	setRotateAngle(neck1, head_pitch * 0.5F, head_yaw * 0.33F, 0.0F);
    	setRotateAngle(neck2, head_pitch * 0.5F, head_yaw * 0.33F, 0.0F);
    	setRotateAngle(neck3, head_pitch * 0.5F, head_yaw * 0.33F, 0.0F);
    	setRotateAngle(ShoulderR, right_swing,0,0);
    	setRotateAngle(ShoulderL, left_swing,0,0);
    	setRotateAngle(ThighR, right_swing,0,0);
    	setRotateAngle(ThighL, left_swing,0,0);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
